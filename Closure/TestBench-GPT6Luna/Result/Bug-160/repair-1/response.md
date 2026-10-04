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
    public void testGetSourceLineBoundaries() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "alpha\nbeta")},
                new CompilerOptions());
        assertNull(compiler.getSourceLine("src.js", 0));
        assertEquals("alpha", compiler.getSourceLine("src.js", 1));
        assertEquals("beta", compiler.getSourceLine("src.js", 2));
        assertNull(compiler.getSourceLine("missing.js", 1));
    }

    @Test
    public void testGetSourceRegionValidLine() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "alpha\nbeta")},
                new CompilerOptions());
        assertNotNull(compiler.getSourceRegion("src.js", 1));
        assertNull(compiler.getSourceRegion("src.js", 0));
    }

    @Test
    public void testGetInputByInitializedName() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        assertEquals("src.js", compiler.getInput("src.js").getName());
        assertNull(compiler.getInput("absent.js"));
    }

    @Test
    public void testNewExternInputRegistersInput() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        CompilerInput input = compiler.newExternInput("ext.js");
        assertSame(input, compiler.getInput("ext.js"));
        assertTrue(input.isExtern());
    }

    @Test
    public void testNewExternInputRejectsDuplicateName() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        try {
            compiler.newExternInput("src.js");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testGetInputAfterRebuildingModules() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("m");
        module.add(JSSourceFile.fromCode("part.js", "var p;"));
        compiler.initModules(Collections.<JSSourceFile>emptyList(),
                Lists.newArrayList(module), new CompilerOptions());
        module.add(JSSourceFile.fromCode("later.js", "var q;"));
        compiler.rebuildInputsFromModules();
        assertEquals("later.js", compiler.getInput("later.js").getName());
        assertEquals(2, compiler.getInputsForTesting().size());
    }

    @Test
    public void testGetSourceLineLastLine() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("lines.js", "x\ny")},
                new CompilerOptions());
        assertEquals("y", compiler.getSourceLine("lines.js", 2));
        assertNull(compiler.getSourceLine("lines.js", 3));
    }

    @Test
    public void testGetSourceLineRejectsNegativeLine() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("lines.js", "x")},
                new CompilerOptions());
        assertNull(compiler.getSourceLine("lines.js", -1));
    }

    @Test
    public void testErrorManagerLazyInitialization() throws Exception {
        Compiler compiler = new Compiler();
        assertNotNull(compiler.getErrorManager());
        assertSame(compiler.getErrorManager(), compiler.getErrorManager());
    }

    @Test
    public void testGetErrorsNeverNullAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        assertNotNull(compiler.getErrors());
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testGetWarningsNeverNullAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        assertNotNull(compiler.getWarnings());
        assertEquals(0, compiler.getWarningCount());
    }

    @Test
    public void testLanguageModeAndEcmaScriptAcceptance() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        Compiler compiler = new Compiler();
        compiler.initOptions(options);
        assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testEcmaScript3NotAcceptedAsEs5() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        Compiler compiler = new Compiler();
        compiler.initOptions(options);
        assertFalse(compiler.acceptEcmaScript5());
        assertEquals(LanguageMode.ECMASCRIPT3, compiler.languageMode());
    }

    @Test
    public void testIdeModeReflectsOption() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.ideMode = true;
        Compiler compiler = new Compiler();
        compiler.initOptions(options);
        assertTrue(compiler.isIdeMode());
    }

    @Test
    public void testTypeCheckingEnabledFlag() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        Compiler compiler = new Compiler();
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testAcceptConstKeywordFlag() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.acceptConstKeyword = true;
        Compiler compiler = new Compiler();
        compiler.initOptions(options);
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testEmptyModuleReceivesPlaceholderInput() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("empty");
        compiler.initModules(Collections.<JSSourceFile>emptyList(),
                Lists.newArrayList(module), new CompilerOptions());
        assertEquals(1, module.getInputs().size());
        assertEquals("[]", compiler.getInputsForTesting().get(0).getName());
    }

    @Test
    public void testInitializedRootInitiallyAbsent() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        assertNull(compiler.getRoot());
    }

    @Test
    public void testToSourceForInitializedEmptyAst() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        compiler.parse();
        assertEquals("var a;", compiler.toSource());
    }

    @Test
    public void testToSourceArrayPreservesSeparateInputs() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {
                JSSourceFile.fromCode("a.js", "var a;"),
                JSSourceFile.fromCode("b.js", "var b;")
        }, new CompilerOptions());
        compiler.parse();
        String[] result = compiler.toSourceArray();
        assertEquals(2, result.length);
        assertEquals("var a;", result[0]);
        assertEquals("var b;", result[1]);
    }

    @Test
    public void testGetSourceMapAbsentByDefault() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "var a;")},
                new CompilerOptions());
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testSetErrorManagerRejectsNull() throws Exception {
        Compiler compiler = new Compiler();
        try {
            compiler.setErrorManager(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testCompileSimpleInput() throws Exception {
        Compiler compiler = new Compiler();
        Result result = compiler.compile(
                JSSourceFile.fromCode("externs.js", ""),
                JSSourceFile.fromCode("main.js", "var answer=42;"),
                new CompilerOptions());
        assertNotNull(result);
        assertEquals("var answer=42;", compiler.toSource());
    }

    @Test
    public void testCompileModulesSimpleInput() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("main");
        module.add(JSSourceFile.fromCode("main.js", "var answer=42;"));
        Result result = compiler.compileModules(
                Collections.<JSSourceFile>emptyList(),
                Lists.newArrayList(module), new CompilerOptions());
        assertNotNull(result);
        assertEquals("var answer=42;", compiler.toSource(module));
    }

    @Test
    public void testDisableThreadsAndParseSources() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("main.js", "var a;")},
                new CompilerOptions());
        compiler.parse();
        assertEquals("var a;", compiler.toSource());
    }

    @Test
    public void testGetResultAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("main.js", "var a;")},
                new CompilerOptions());
        assertNotNull(compiler.getResult());
        assertEquals(0, compiler.getResult().errors.length);
    }

    @Test
    public void testMessagesMatchErrors() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("main.js", "var a;")},
                new CompilerOptions());
        assertArrayEquals(compiler.getErrors(), compiler.getMessages());
    }

    @Test
    public void testTypeRegistryCreated() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertSame(compiler.getTypeRegistry(), compiler.getTypeRegistry());
    }

    @Test
    public void testTopScopeInitiallyNull() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getTopScope());
    }

    @Test
    public void testReverseInterpreterMemoized() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertSame(compiler.getReverseAbstractInterpreter(),
                compiler.getReverseAbstractInterpreter());
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
    public void testErrorCountsAndHasErrorsInitiallyFalse() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertEquals(0, compiler.getErrorCount());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testToStringAndLengthOnEmptyCompiler() throws Exception {
        Compiler compiler = new Compiler();
        assertEquals("", compiler.toString());
    }

    @Test
    public void testNormalizeWithParsedInput() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("main.js", "var a;")},
                new CompilerOptions());
        compiler.parse();
        compiler.normalize();
        assertEquals("var a;", compiler.toSource());
    }

    @Test
    public void testReportCodeChangeAndLoggingLevel() throws Exception {
        Compiler compiler = new Compiler();
        compiler.reportCodeChange();
        Compiler.setLoggingLevel(Level.OFF);
        assertEquals("", compiler.toString());
    }

    @Test
    public void testCodingConventionAvailable() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNotNull(compiler.getCodingConvention());
        assertSame(compiler.getCodingConvention(), compiler.getCodingConvention());
    }

    @Test
    public void testReportWithDefaultDiagnostic() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        DiagnosticType diagnostic = DiagnosticType.error("TEST_ERROR", "error");
        compiler.report(JSError.make(diagnostic));
        assertEquals(1, compiler.getErrorCount());
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testGetErrorLevelForReportedError() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        DiagnosticType diagnostic = DiagnosticType.error("TEST_ERROR", "error");
        JSError error = JSError.make(diagnostic);
        assertEquals(CheckLevel.ERROR, compiler.getErrorLevel(error));
    }

    @Test
    public void testAstDotGraphBeforeParsingIsEmpty() throws Exception {
        Compiler compiler = new Compiler();
        assertEquals("", compiler.getAstDotGraph());
    }

    @Test
    public void testGetStateAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("main.js", "var a;")},
                new CompilerOptions());
        assertNotNull(compiler.getState());
    }

    @Test
    public void testSetStateFromCapturedState() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("main.js", "var a;")},
                new CompilerOptions());
        Compiler.IntermediateState state = compiler.getState();
        compiler.setState(state);
        assertEquals("main.js", compiler.getInput("main.js").getName());
    }
}
```