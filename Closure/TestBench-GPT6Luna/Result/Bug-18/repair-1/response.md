```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.CharStreams;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException;
import com.google.javascript.jscomp.deps.SortedDependencies.MissingProvideException;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.ParserRunner;
import com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ErrorReporter;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public class CompilerTest {
    @Test
    public void testProgressInitiallyZero() throws Exception {
        assertEquals(0.0, new Compiler().getProgress(), 0.0);
    }

    @Test
    public void testProgressClampsAboveOne() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(1.1);
        assertEquals(1.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressClampsBelowZero() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(-0.1);
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressKeepsInRangeValue() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(0.4);
        assertEquals(0.4, compiler.getProgress(), 0.0);
    }

    @Test
    public void testSetErrorManagerRejectsNull() throws Exception {
        Compiler compiler = new Compiler();
        try {
            compiler.setErrorManager(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNewExternInputIsIndexed() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        CompilerInput input = compiler.newExternInput("extern.js");
        assertSame(input, compiler.getInput(new InputId("extern.js")));
        assertTrue(input.isExtern());
    }

    @Test
    public void testNewExternInputRejectsDuplicateName() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        compiler.newExternInput("extern.js");
        try {
            compiler.newExternInput("extern.js");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGetSourceLineForInitializedInput() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(
            Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var a;\nvar b;")),
            new CompilerOptions());
        assertEquals("var b;", compiler.getSourceLine("main.js", 2));
    }

    @Test
    public void testGetSourceLineRejectsNonpositiveLine() throws Exception {
        Compiler compiler = new Compiler();
        assertNull(compiler.getSourceLine("main.js", 0));
    }

    @Test
    public void testGetSourceLineForUnknownName() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Collections.<SourceFile>emptyList(), new CompilerOptions());
        assertNull(compiler.getSourceLine("missing.js", 1));
    }

    @Test
    public void testInitCreatesInputIndex() throws Exception {
        Compiler compiler = new Compiler();
        SourceFile file = SourceFile.fromCode("main.js", "var a;");
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(file), new CompilerOptions());
        assertNotNull(compiler.getInput(new InputId("main.js")));
    }

    @Test
    public void testEmptySourceProducesEmptyOutputAfterParse() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Collections.<SourceFile>emptyList(), new CompilerOptions());
        compiler.parse();
        assertEquals("", compiler.toSource());
    }

    @Test
    public void testParsedSourceHasOneInputOutput() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var a=1;")),
            new CompilerOptions());
        compiler.parse();
        assertEquals(1, compiler.toSourceArray().length);
    }

    @Test
    public void testGetInputByNameIsNullWhenAbsent() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Collections.<SourceFile>emptyList(), new CompilerOptions());
        assertNull(compiler.getInput(new InputId("absent.js")));
    }

    @Test
    public void testGetInputsByIdIsUnmodifiable() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var a;")),
            new CompilerOptions());
        try {
            compiler.getInputsById().clear();
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) { }
        assertEquals(1, compiler.getInputsById().size());
    }

    @Test
    public void testTypeRegistryIsMemoized() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertSame(compiler.getTypeRegistry(), compiler.getTypeRegistry());
    }

    @Test
    public void testErrorManagerAvailableBeforeOptions() throws Exception {
        Compiler compiler = new Compiler();
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testRootIsNullBeforeParsing() throws Exception {
        assertNull(new Compiler().getRoot());
    }

    @Test
    public void testIdeModeDefaultIsFalse() throws Exception {
        assertFalse(new Compiler().isIdeMode());
    }

    @Test
    public void testTypeCheckingDefaultIsFalse() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertFalse(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testLanguageModeDefaultsToEcmaScript3() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertEquals(LanguageMode.ECMASCRIPT3, compiler.languageMode());
    }

    @Test
    public void testAcceptEcmaScript5ForEcmaScript5Mode() throws Exception {
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        Compiler compiler = new Compiler();
        compiler.initOptions(options);
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testAcceptEcmaScript5RejectsEcmaScript3Mode() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertFalse(compiler.acceptEcmaScript5());
    }

    @Test
    public void testCodeBuilderAppendLength() throws Exception {
        Compiler.CodeBuilder builder = new Compiler.CodeBuilder();
        builder.append("abc");
        assertEquals(3, builder.getLength());
        assertEquals("abc", builder.toString());
    }

    @Test
    public void testReleaseVersionIsNotEmpty() throws Exception {
        assertFalse(Compiler.getReleaseVersion().isEmpty());
    }

    @Test
    public void testReleaseDateIsNotEmpty() throws Exception {
        assertFalse(Compiler.getReleaseDate().isEmpty());
    }

    @Test
    public void testInitModulesIndexesModuleSource() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("m");
        module.add(SourceFile.fromCode("module.js", "var x;"));
        compiler.initModules(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(module), new CompilerOptions());
        assertNotNull(compiler.getInput(new InputId("module.js")));
    }

    @Test
    public void testRebuildInputsAfterAddingModuleSource() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("m");
        module.add(SourceFile.fromCode("one.js", "var a;"));
        compiler.initModules(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(module), new CompilerOptions());
        module.add(SourceFile.fromCode("two.js", "var b;"));
        compiler.rebuildInputsFromModules();
        assertNotNull(compiler.getInput(new InputId("two.js")));
        assertEquals(2, compiler.getInputsById().size());
    }

    @Test
    public void testCompileSimpleSourceProducesNoErrors() throws Exception {
        Compiler compiler = new Compiler();
        Result result = compiler.compile(
            SourceFile.fromCode("extern.js", ""),
            SourceFile.fromCode("main.js", "var x=1;"),
            new CompilerOptions());
        assertNotNull(result);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testCompileModulesWithEmptyRootReportsError() throws Exception {
        Compiler compiler = new Compiler();
        JSModule root = new JSModule("root");
        JSModule child = new JSModule("child");
        child.add(SourceFile.fromCode("child.js", "var x;"));
        child.addDependency(root);
        Result result = compiler.compileModules(
            Collections.<SourceFile>emptyList(),
            Lists.newArrayList(root, child), new CompilerOptions());
        assertNotNull(result);
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testDisableThreadsAndCompile() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        compiler.compile(
            Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var x;")),
            new CompilerOptions());
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testSetPassConfigRejectsNull() throws Exception {
        Compiler compiler = new Compiler();
        try {
            compiler.setPassConfig(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
        assertNull(compiler.getRoot());
    }

    @Test
    public void testGetMessagesAndErrorsAreEmptyAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Collections.<SourceFile>emptyList(), new CompilerOptions());
        assertEquals(compiler.getErrors().length, compiler.getMessages().length);
        assertEquals(0, compiler.getWarnings().length);
    }

    @Test
    public void testGetLengthFromCodeBuilder() throws Exception {
        Compiler.CodeBuilder builder = new Compiler.CodeBuilder();
        builder.append("abc");
        assertEquals(3, builder.getLength());
    }

    @Test
    public void testGetTypedScopeCreatorBeforePasses() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getTypedScopeCreator());
    }

    @Test
    public void testGetTopScopeBeforePasses() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getTopScope());
    }

    @Test
    public void testReverseInterpreterIsMemoized() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertSame(compiler.getReverseAbstractInterpreter(),
            compiler.getReverseAbstractInterpreter());
    }

    @Test
    public void testNormalizeParsedTree() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var x=1;")),
            new CompilerOptions());
        compiler.parse();
        compiler.normalize();
        assertNotNull(compiler.getRoot());
    }

    @Test
    public void testReportCodeChangeLeavesNoErrors() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Collections.<SourceFile>emptyList(), new CompilerOptions());
        compiler.reportCodeChange();
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testCodingConventionIsAvailable() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNotNull(compiler.getCodingConvention());
    }

    @Test
    public void testAcceptConstKeywordDefault() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertFalse(compiler.acceptConstKeyword());
    }

    @Test
    public void testErrorCountAndHasErrorsAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Collections.<SourceFile>emptyList(), new CompilerOptions());
        assertEquals(0, compiler.getErrorCount());
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testSourceRegionForInvalidLine() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var x;")),
            new CompilerOptions());
        assertNull(compiler.getSourceRegion("main.js", 0));
    }

    @Test
    public void testSourceMapAbsentByDefault() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testAstDotGraphBeforeParsingIsEmpty() throws Exception {
        assertEquals("", new Compiler().getAstDotGraph());
    }

    @Test
    public void testGetStateCanBeRestored() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var x;")),
            new CompilerOptions());
        compiler.parse();
        Compiler.IntermediateState state = compiler.getState();
        Compiler receiver = new Compiler();
        receiver.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var x;")),
            new CompilerOptions());
        receiver.setState(state);
        assertNotNull(receiver.getRoot());
    }

    @Test
    public void testReplaceScriptForUnknownInputLeavesNoErrors() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var x;")),
            new CompilerOptions());
        compiler.parse();
        compiler.replaceScript(new JsAst(SourceFile.fromCode("other.js", "var y;")));
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testAddNewScriptToUnparsedCompilerDoesNotReportErrors() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(Collections.<SourceFile>emptyList(),
            Lists.newArrayList(SourceFile.fromCode("main.js", "var x;")),
            new CompilerOptions());
        compiler.parse();
        compiler.addNewScript(new JsAst(SourceFile.fromCode("extra.js", "var y;")));
        assertEquals(0, compiler.getErrorCount());
    }
}
```