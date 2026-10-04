package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.ParserRunner;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompilerTest {
    @Test
    public void testGetSourceLineConfiguredAndLineBounds() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("src.js", "first\nsecond")},
                new CompilerOptions());
        assertEquals("first", c.getSourceLine("src.js", 1));
        assertNull(c.getSourceLine("src.js", 2));
        assertNull(c.getSourceLine("src.js", 0));
        assertNull(c.getSourceLine("src.js", 3));
    }

    @Test
    public void testGetSourceLineUnknownName() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0], new JSSourceFile[0], new CompilerOptions());
        assertNull(c.getSourceLine("missing.js", 1));
    }

    @Test
    public void testGetSourceRegionBounds() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("region.js", "alpha\nbeta")},
                new CompilerOptions());
        assertNull(c.getSourceRegion("region.js", 0));
        assertNull(c.getSourceRegion("region.js", 3));
        assertNotNull(c.getSourceRegion("region.js", 1));
        assertNull(c.getSourceRegion("region.js", 2));
    }

    @Test
    public void testInputLookupAfterInit() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("one.js", "var a;")},
                new CompilerOptions());
        assertNotNull(c.getInput("one.js"));
        assertNull(c.getInput("absent.js"));
    }

    @Test
    public void testNewExternInputAndLookup() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("base.js", "")},
                new CompilerOptions());
        c.parse();
        CompilerInput input = c.newExternInput("extern.js");
        assertSame(input, c.getInput("extern.js"));
        assertEquals("extern.js", input.getName());
        assertTrue(input.isExtern());
    }

    @Test
    public void testNewExternInputRejectsDuplicateName() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("same.js", "")},
                new CompilerOptions());
        try {
            c.newExternInput("same.js");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
        assertNotNull(c.getInput("same.js"));
    }

    @Test
    public void testGetTypeRegistryIsCached() throws Exception {
        Compiler c = new Compiler();
        assertSame(c.getTypeRegistry(), c.getTypeRegistry());
    }

    @Test
    public void testGetErrorManagerInitializesOptions() throws Exception {
        Compiler c = new Compiler();
        assertNotNull(c.getErrorManager());
        assertSame(c.getErrorManager(), c.getErrorManager());
    }

    @Test
    public void testErrorAndWarningCountsInitiallyZero() throws Exception {
        Compiler c = new Compiler();
        c.initOptions(new CompilerOptions());
        assertEquals(0, c.getErrorCount());
        assertEquals(0, c.getWarningCount());
        assertFalse(c.hasErrors());
    }

    @Test
    public void testGetMessagesMatchesErrors() throws Exception {
        Compiler c = new Compiler();
        c.initOptions(new CompilerOptions());
        assertArrayEquals(c.getErrors(), c.getMessages());
    }

    @Test
    public void testGetRootBeforeParsing() throws Exception {
        Compiler c = new Compiler();
        assertNull(c.getRoot());
    }

    @Test
    public void testGetSourceMapOnlyWhenConfigured() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0], new JSSourceFile[0], new CompilerOptions());
        assertNull(c.getSourceMap());
    }

    @Test
    public void testSetErrorManagerRejectsNull() throws Exception {
        Compiler c = new Compiler();
        try {
            c.setErrorManager(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testSetErrorManagerKeepsSuppliedManager() throws Exception {
        Compiler c = new Compiler();
        ErrorManager manager = new LoggerErrorManager(null, Logger.getLogger("test"));
        c.setErrorManager(manager);
        assertSame(manager, c.getErrorManager());
    }

    @Test
    public void testSetPassConfigRejectsNull() throws Exception {
        Compiler c = new Compiler();
        try {
            c.setPassConfig(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testDisableThreadsAndParseSimpleSource() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("parse.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        assertNotNull(c.getRoot());
        assertEquals(0, c.getErrorCount());
    }

    @Test
    public void testToSourceAfterParse() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("source.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        assertEquals("var x=1;", c.toSource());
    }

    @Test
    public void testToSourceArrayPreservesInputOrder() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        c.init(new JSSourceFile[0], new JSSourceFile[] {
                JSSourceFile.fromCode("first.js", "var a=1;"),
                JSSourceFile.fromCode("second.js", "var b=2;")
        }, new CompilerOptions());
        c.parse();
        assertArrayEquals(new String[] {"var a=1;", "var b=2;"},
                c.toSourceArray());
    }

    @Test
    public void testIdeAndTypeCheckingOptions() throws Exception {
        Compiler c = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.ideMode = true;
        options.checkTypes = true;
        c.initOptions(options);
        assertTrue(c.isIdeMode());
        assertTrue(c.isTypeCheckingEnabled());
    }

    @Test
    public void testDefaultCodingConventionAvailable() throws Exception {
        Compiler c = new Compiler();
        c.initOptions(new CompilerOptions());
        assertNotNull(c.getCodingConvention());
    }

    @Test
    public void testAstDotGraphWithoutParsedTreeIsEmpty() throws Exception {
        Compiler c = new Compiler();
        assertEquals("", c.getAstDotGraph());
    }

    @Test
    public void testGetResultAndStateAvailableAfterInit() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0], new JSSourceFile[0], new CompilerOptions());
        assertNotNull(c.getResult());
        assertNotNull(c.getState());
    }

    @Test
    public void testInitWithSourceAndNoErrors() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("ok.js", "var n=3;")},
                new CompilerOptions());
        assertFalse(c.hasErrors());
        assertEquals(0, c.getErrorCount());
        assertNotNull(c.getInput("ok.js"));
    }

    @Test
    public void testRebuildInputsFromModulesAfterAddingInput() throws Exception {
        Compiler c = new Compiler();
        JSModule module = new JSModule("root");
        JSSourceFile initial = JSSourceFile.fromCode("initial.js", "var a=1;");
        module.add(initial);
        c.init(new JSSourceFile[0], new JSModule[] {module}, new CompilerOptions());
        JSSourceFile added = JSSourceFile.fromCode("added.js", "var b=2;");
        module.add(added);
        c.rebuildInputsFromModules();
        assertNotNull(c.getInput("added.js"));
        assertEquals(2, c.toSourceArray().length);
    }

    @Test
    public void testCompileSingleExternAndInput() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        Result result = c.compile(
                JSSourceFile.fromCode("externs.js", ""),
                JSSourceFile.fromCode("input.js", "var x=1;"),
                new CompilerOptions());
        assertNotNull(result);
        assertEquals(0, c.getErrorCount());
        assertEquals("var x=1;", c.toSource());
    }

    @Test
    public void testCheckWithConfiguredEmptyRoots() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("check.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        c.check();
        assertEquals(0, c.getErrorCount());
    }

    @Test
    public void testWarningsInitiallyEmpty() throws Exception {
        Compiler c = new Compiler();
        c.initOptions(new CompilerOptions());
        assertEquals(0, c.getWarnings().length);
        assertEquals(0, c.getWarningCount());
    }

    @Test
    public void testGetTopScopeAfterInitialization() throws Exception {
        Compiler c = new Compiler();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("scope.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        assertNotNull(c.getTopScope());
    }

    @Test
    public void testReverseAbstractInterpreterIsCached() throws Exception {
        Compiler c = new Compiler();
        c.initOptions(new CompilerOptions());
        assertSame(c.getReverseAbstractInterpreter(),
                c.getReverseAbstractInterpreter());
    }

    @Test
    public void testOptimizeAfterParse() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("opt.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        c.optimize();
        assertEquals(0, c.getErrorCount());
    }

    @Test
    public void testNormalizeSetsNormalizedState() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("norm.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        c.normalize();
        assertTrue(c.isNormalized());
    }

    @Test
    public void testReportCodeChangeDoesNotAddErrors() throws Exception {
        Compiler c = new Compiler();
        c.initOptions(new CompilerOptions());
        c.reportCodeChange();
        assertEquals(0, c.getErrorCount());
    }

    @Test
    public void testLoggingLevelCanBeSet() throws Exception {
        Compiler.setLoggingLevel(Level.WARNING);
        Compiler.setLoggingLevel(Level.INFO);
        assertEquals(Level.INFO, Logger.getLogger("com.google.javascript.jscomp").getLevel());
    }

    @Test
    public void testGetAstDotGraphAfterParse() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("dot.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        assertTrue(c.getAstDotGraph().contains("digraph"));
    }

    @Test
    public void testSetStateRestoresCapturedCompilerState() throws Exception {
        Compiler c = new Compiler();
        c.disableThreads();
        c.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("state.js", "var x=1;")},
                new CompilerOptions());
        c.parse();
        Compiler.IntermediateState state = c.getState();
        c.setState(state);
        assertNotNull(c.getRoot());
        assertEquals("var x=1;", c.toSource());
    }
}
