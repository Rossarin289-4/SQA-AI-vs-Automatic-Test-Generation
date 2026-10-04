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
    public void testAcceptsEs5() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testRejectsEs3() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        compiler.initOptions(options);
        assertFalse(compiler.acceptEcmaScript5());
    }

    @Test
    public void testLanguageModeReflectsOptions() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
        compiler.initOptions(options);
        assertEquals(LanguageMode.ECMASCRIPT5_STRICT, compiler.languageMode());
    }

    @Test
    public void testTypeCheckingOption() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testIdeModeOption() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.ideMode = true;
        compiler.initOptions(options);
        assertTrue(compiler.isIdeMode());
    }

    @Test
    public void testConstKeywordOption() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.acceptConstKeyword = true;
        compiler.initOptions(options);
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testErrorManagerInitiallyAvailable() throws Exception {
        Compiler compiler = new Compiler();
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testEmptyCompileInputSource() throws Exception {
        Compiler compiler = new Compiler();
        Result result = compiler.compile(
            JSSourceFile.fromCode("extern.js", ""),
            JSSourceFile.fromCode("input.js", ""),
            new CompilerOptions());
        assertNotNull(result);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testParseSourceAndPrint() throws Exception {
        Compiler compiler = new Compiler();
        Node root = compiler.parse(JSSourceFile.fromCode("input.js", "var x=1;"));
        assertNotNull(root);
        assertEquals("var x=1", compiler.toSource(root));
    }

    @Test
    public void testToSourceArrayHasInputForInitializedCompiler() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
            new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x=1;") },
            new CompilerOptions());
        assertEquals(1, compiler.toSourceArray().length);
    }

    @Test
    public void testGetSourceLineValidAndBoundaryNumbers() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
            new JSSourceFile[] { JSSourceFile.fromCode("input.js", "one\ntwo") },
            new CompilerOptions());
        assertEquals("one", compiler.getSourceLine("input.js", 1));
        assertNull(compiler.getSourceLine("input.js", 2));
        assertNull(compiler.getSourceLine("input.js", 0));
        assertNull(compiler.getSourceLine("input.js", 3));
    }

    @Test
    public void testGetSourceLineUnknownName() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
            new JSSourceFile[] { JSSourceFile.fromCode("input.js", "one") },
            new CompilerOptions());
        assertNull(compiler.getSourceLine("missing.js", 1));
    }

    @Test
    public void testGetInputByInitializedName() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
            new JSSourceFile[] { JSSourceFile.fromCode("input.js", "") },
            new CompilerOptions());
        assertNotNull(compiler.getInput("input.js"));
        assertNull(compiler.getInput("missing.js"));
    }

    @Test
    public void testRebuildInputsFromModules() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("main");
        module.add(JSSourceFile.fromCode("input.js", ""));
        compiler.initModules(Collections.<JSSourceFile>emptyList(),
            Lists.newArrayList(module), new CompilerOptions());
        compiler.rebuildInputsFromModules();
        assertEquals("input.js", compiler.getInput("input.js").getName());
    }

    @Test
    public void testNewExternInputIsRegistered() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[0],
            new CompilerOptions());
        compiler.parse();
        CompilerInput input = compiler.newExternInput("extra.js");
        assertSame(input, compiler.getInput("extra.js"));
    }

    @Test
    public void testNewExternInputRejectsDuplicateName() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[0],
            new CompilerOptions());
        compiler.parse();
        compiler.newExternInput("extra.js");
        try {
            compiler.newExternInput("extra.js");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testDisableThreadsStillCompiles() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        Result result = compiler.compile(
            JSSourceFile.fromCode("extern.js", ""),
            JSSourceFile.fromCode("input.js", ""),
            new CompilerOptions());
        assertNotNull(result);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testNoErrorsForValidCompilation() throws Exception {
        Compiler compiler = new Compiler();
        compiler.compile(JSSourceFile.fromCode("extern.js", ""),
            JSSourceFile.fromCode("input.js", "var x=1;"),
            new CompilerOptions());
        assertFalse(compiler.hasErrors());
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testInvalidSourceHasErrors() throws Exception {
        Compiler compiler = new Compiler();
        compiler.compile(JSSourceFile.fromCode("extern.js", ""),
            JSSourceFile.fromCode("input.js", "var = ;"),
            new CompilerOptions());
        assertTrue(compiler.hasErrors());
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testGetAstDotGraphWithoutParsedTree() throws Exception {
        Compiler compiler = new Compiler();
        assertEquals("", compiler.getAstDotGraph());
    }

    @Test
    public void testRootAvailableAfterCompilation() throws Exception {
        Compiler compiler = new Compiler();
        compiler.compile(JSSourceFile.fromCode("extern.js", ""),
            JSSourceFile.fromCode("input.js", ""),
            new CompilerOptions());
        assertNotNull(compiler.getRoot());
    }

    @Test
    public void testErrorManagerCanBeReplaced() throws Exception {
        Compiler compiler = new Compiler();
        BasicErrorManager manager = new BasicErrorManager() {
            @Override
            public void println(CheckLevel level, JSError error) { }
            @Override
            protected void printSummary() { }
        };
        compiler.setErrorManager(manager);
        assertSame(manager, compiler.getErrorManager());
    }

    @Test
    public void testErrorManagerRejectsNull() throws Exception {
        Compiler compiler = new Compiler();
        try {
            compiler.setErrorManager(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
