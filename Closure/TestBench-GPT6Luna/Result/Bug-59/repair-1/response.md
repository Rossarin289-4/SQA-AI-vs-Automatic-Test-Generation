```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException;
import com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.ParserRunner;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompilerTest {
    @Test
    public void testSetAndGetErrorManager() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        ErrorManager manager = compiler.getErrorManager();
        compiler.setErrorManager(manager);
        assertSame(manager, compiler.getErrorManager());
    }

    @Test
    public void testNullErrorManagerRejected() throws Exception {
        Compiler compiler = new Compiler();
        try {
            compiler.setErrorManager(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testInitializeAndLookupInput() throws Exception {
        Compiler compiler = new Compiler();
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
        JSSourceFile source = JSSourceFile.fromCode("input.js", "var x=1;");
        compiler.init(new JSSourceFile[] {extern}, new JSSourceFile[] {source},
                new CompilerOptions());
        assertEquals("input.js", compiler.getInput("input.js").getName());
        assertTrue(compiler.getInput("extern.js").isExtern());
        assertNull(compiler.getInput("missing.js"));
    }

    @Test
    public void testRebuildInputsAfterAddingModuleInput() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("m");
        module.add(JSSourceFile.fromCode("first.js", ""));
        compiler.initModules(Collections.<JSSourceFile>emptyList(),
                Lists.newArrayList(module), new CompilerOptions());
        module.add(JSSourceFile.fromCode("later.js", ""));
        compiler.rebuildInputsFromModules();
        assertEquals("later.js", compiler.getInput("later.js").getName());
        assertEquals(2, compiler.getInputsForTesting().size());
    }

    @Test
    public void testParseAndPrintSimpleSource() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "var x=1;")},
                new CompilerOptions());
        compiler.parse();
        assertEquals("var x=1", compiler.toSource());
    }

    @Test
    public void testParseSourceArrayHasOneElement() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "var x=1;")},
                new CompilerOptions());
        compiler.parse();
        assertEquals(1, compiler.toSourceArray().length);
        assertEquals("var x=1", compiler.toSourceArray()[0]);
    }

    @Test
    public void testGetRootHasExternAndSourceRoots() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "var x=1;")},
                new CompilerOptions());
        compiler.parse();
        assertEquals(Token.BLOCK, compiler.getRoot().getType());
        assertEquals(2, compiler.getRoot().getChildCount());
    }

    @Test
    public void testSourceLineValidAndOutOfRange() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {
                JSSourceFile.fromCode("lines.js", "alpha\nbeta")
        }, new CompilerOptions());
        assertEquals("alpha", compiler.getSourceLine("lines.js", 1));
        assertEquals("beta", compiler.getSourceLine("lines.js", 2));
        assertNull(compiler.getSourceLine("lines.js", 0));
        assertNull(compiler.getSourceLine("lines.js", 3));
    }

    @Test
    public void testSourceRegionForValidLine() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {
                JSSourceFile.fromCode("lines.js", "alpha\nbeta")
        }, new CompilerOptions());
        assertNotNull(compiler.getSourceRegion("lines.js", 1));
        assertNull(compiler.getSourceRegion("lines.js", -1));
    }

    @Test
    public void testAddExternInputAndLookup() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "")},
                new CompilerOptions());
        CompilerInput added = compiler.newExternInput("extra.js");
        assertSame(added, compiler.getInput("extra.js"));
        assertTrue(added.isExtern());
    }

    @Test
    public void testDuplicateExternNameRejected() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "")},
                new CompilerOptions());
        compiler.newExternInput("extra.js");
        try {
            compiler.newExternInput("extra.js");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testLanguageModeAcceptanceBoundaries() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        compiler.initOptions(options);
        assertFalse(compiler.acceptEcmaScript5());
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        assertTrue(compiler.acceptEcmaScript5());
        options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testLanguageModeAndConstOption() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        options.acceptConstKeyword = true;
        compiler.initOptions(options);
        assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testIdeModeAndTypeCheckingOptions() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.ideMode = true;
        options.checkTypes = true;
        compiler.initOptions(options);
        assertTrue(compiler.isIdeMode());
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testErrorCountsOnFreshCompiler() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertEquals(0, compiler.getErrorCount());
        assertEquals(0, compiler.getWarningCount());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testGetMessagesMatchesErrorsInitially() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertEquals(compiler.getErrors().length, compiler.getMessages().length);
        assertEquals(0, compiler.getMessages().length);
    }

    @Test
    public void testSourceMapAbsentWithoutConfiguration() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testAstDotGraphBeforeParsingIsEmpty() throws Exception {
        Compiler compiler = new Compiler();
        assertEquals("", compiler.getAstDotGraph());
    }

    @Test
    public void testGetTypeRegistryReturnsSameRegistry() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertSame(compiler.getTypeRegistry(), compiler.getTypeRegistry());
    }

    @Test
    public void testGetCodingConventionIsStable() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertSame(compiler.getCodingConvention(), compiler.getCodingConvention());
    }

    @Test
    public void testNewCompilerHasNoErrorsAfterInit() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "")},
                new CompilerOptions());
        assertEquals(0, compiler.getErrorCount());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testDisableThreadsAllowsCompilation() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        Result result = compiler.compile(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "var x=1;")},
                new CompilerOptions());
        assertNotNull(result);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testCompileModuleInputs() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("m");
        module.add(JSSourceFile.fromCode("a.js", "var x=1;"));
        Result result = compiler.compileModules(
                Collections.<JSSourceFile>emptyList(),
                Lists.newArrayList(module), new CompilerOptions());
        assertNotNull(result);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testGetStateReturnsStateObject() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNotNull(compiler.getState());
    }

    @Test
    public void testSetPassConfigRejectsNull() throws Exception {
        Compiler compiler = new Compiler();
        try {
            compiler.setPassConfig(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testGetResultAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("result.js", "var x=1;")},
                new CompilerOptions());
        Result result = compiler.getResult();
        assertEquals(0, result.errors.length);
        assertEquals(0, result.warnings.length);
    }

    @Test
    public void testGetWarningsAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("warn.js", "")},
                new CompilerOptions());
        assertEquals(0, compiler.getWarnings().length);
        assertEquals(0, compiler.getWarningCount());
    }

    @Test
    public void testCheckAfterParsingSimpleSource() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("check.js", "var x=1;")},
                new CompilerOptions());
        compiler.parse();
        compiler.check();
        assertEquals(0, compiler.getErrorCount());
        assertEquals(0, compiler.getWarningCount());
    }

    @Test
    public void testNormalizeAfterParsing() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("norm.js", "var x=1;")},
                new CompilerOptions());
        compiler.parse();
        compiler.normalize();
        assertEquals("var x=1", compiler.toSource());
    }

    @Test
    public void testOptimizeAfterParsingAndChecking() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("opt.js", "var x=1;")},
                new CompilerOptions());
        compiler.parse();
        compiler.check();
        compiler.optimize();
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testProcessDefinesOnParsedSource() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("define.js", "var x=1;")},
                new CompilerOptions());
        compiler.parse();
        compiler.processDefines();
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testReportCodeChangeDoesNotAddErrors() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        compiler.reportCodeChange();
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testReportNullErrorIsIgnoredByDefault() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        compiler.report(null);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testGetErrorLevelForKnownReportedError() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        DiagnosticType type = DiagnosticType.error("TEST_ERROR", "test {0}");
        JSError error = JSError.make("src.js", 1, 0, type, "x");
        assertEquals(CheckLevel.ERROR, compiler.getErrorLevel(error));
    }

    @Test
    public void testSetLoggingLevel() throws Exception {
        Compiler.setLoggingLevel(Level.OFF);
        assertEquals(Level.OFF, Logger.getLogger("com.google.javascript.jscomp").getLevel());
        Compiler.setLoggingLevel(null);
        assertNull(Logger.getLogger("com.google.javascript.jscomp").getLevel());
    }

    @Test
    public void testSetStateFromCapturedState() throws Exception {
        Compiler first = new Compiler();
        first.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("state.js", "var x=1;")},
                new CompilerOptions());
        first.parse();
        Compiler.IntermediateState state = first.getState();

        Compiler second = new Compiler();
        second.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("state.js", "var x=1;")},
                new CompilerOptions());
        second.setState(state);
        assertEquals(0, second.getErrorCount());
    }
}
```