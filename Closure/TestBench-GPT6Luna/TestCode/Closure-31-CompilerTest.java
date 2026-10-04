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
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;

public class CompilerTest {
    @Test
    public void testProgressStartsAtZero() throws Exception {
        Compiler compiler = new Compiler();
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressStoresInteriorValue() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(0.5);
        assertEquals(0.5, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressClampsAboveOne() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(2.0);
        assertEquals(1.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressOneRemainsOne() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(1.0);
        assertEquals(1.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressClampsBelowZero() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(-1.0);
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressZeroRemainsZero() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(0.0);
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testProgressAcceptsNegativeZero() throws Exception {
        Compiler compiler = new Compiler();
        compiler.setProgress(-0.0);
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testInitialRootIsNull() throws Exception {
        Compiler compiler = new Compiler();
        assertNull(compiler.getRoot());
    }

    @Test
    public void testInitialProgressIsExactlyZero() throws Exception {
        Compiler compiler = new Compiler();
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testDisableThreadsDoesNotChangeProgress() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        assertEquals(0.0, compiler.getProgress(), 0.0);
    }

    @Test
    public void testUninitializedCompilerHasNoErrors() throws Exception {
        Compiler compiler = new Compiler();
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testUninitializedCompilerHasZeroErrorCount() throws Exception {
        Compiler compiler = new Compiler();
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testInitializeEmptyInputListCreatesRoot() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[0],
                new CompilerOptions());
        assertNotNull(compiler.getRoot());
    }

    @Test
    public void testInitializeSourcesAndRetrieveInput() throws Exception {
        Compiler compiler = new Compiler();
        JSSourceFile source = JSSourceFile.fromCode("input.js", "var x=1;");
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {source},
                new CompilerOptions());
        assertNotNull(compiler.getInput(new InputId("input.js")));
    }

    @Test
    public void testGetInputMissingIdReturnsNullAfterInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[0],
                new CompilerOptions());
        assertNull(compiler.getInput(new InputId("missing.js")));
    }

    @Test
    public void testRebuildInputsPreservesRegisteredInput() throws Exception {
        Compiler compiler = new Compiler();
        JSSourceFile source = JSSourceFile.fromCode("input.js", "var x=1;");
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {source},
                new CompilerOptions());
        compiler.rebuildInputsFromModules();
        assertNotNull(compiler.getInput(new InputId("input.js")));
    }

    @Test
    public void testSourceLineFromInitializedInput() throws Exception {
        Compiler compiler = new Compiler();
        JSSourceFile source = JSSourceFile.fromCode("input.js", "var x=1;");
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {source},
                new CompilerOptions());
        assertEquals("var x=1;", compiler.getSourceLine("input.js", 1));
    }

    @Test
    public void testSourceLineRejectsLineZero() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[0],
                new CompilerOptions());
        assertNull(compiler.getSourceLine("input.js", 0));
    }

    @Test
    public void testNewExternInputIsRetrievableById() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0], new JSSourceFile[0],
                new CompilerOptions());
        CompilerInput input = compiler.newExternInput("extern.js");
        assertSame(input, compiler.getInput(new InputId("extern.js")));
    }

    @Test
    public void testTypeRegistryIsMemoized() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertSame(compiler.getTypeRegistry(), compiler.getTypeRegistry());
    }

    @Test
    public void testSourceOutputAfterParse() throws Exception {
        Compiler compiler = new Compiler();
        JSSourceFile source = JSSourceFile.fromCode("input.js", "var x=1;");
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {source},
                new CompilerOptions());
        compiler.parse();
        assertEquals("var x=1;", compiler.toSource());
    }

    @Test
    public void testSourceArrayHasOneEntryPerInput() throws Exception {
        Compiler compiler = new Compiler();
        JSSourceFile source = JSSourceFile.fromCode("input.js", "var x=1;");
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {source},
                new CompilerOptions());
        compiler.parse();
        assertEquals(1, compiler.toSourceArray().length);
    }

    @Test
    public void testAcceptEcmaScript5ByDefault() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testGetErrorManagerIsAvailableAfterOptionsInitialization() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNotNull(compiler.getErrorManager());
    }
}
