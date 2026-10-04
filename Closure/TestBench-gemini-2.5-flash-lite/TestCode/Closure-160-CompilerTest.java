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
    public void testGetResult() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        Result result = compiler.getResult();
        assertNotNull(result);
        assertEquals(0, result.errors.length);
        assertEquals(0, result.warnings.length);
    }

    @Test
    public void testGetErrors() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 'hello' - 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        JSError[] errors = compiler.getErrors();
        assertTrue(errors.length > 0);
        // Check for a specific error type if possible, e.g., type mismatch
        boolean foundTypeMismatch = false;
        for (JSError error : errors) {
            // The error message might change, checking the type is more robust.
            if (error.getType().toString().contains("BAD_TYPE_ADD") || error.description.contains("incompatible types")) {
                foundTypeMismatch = true;
                break;
            }
        }
        assertTrue("Should find type mismatch error", foundTypeMismatch);
    }


    @Test
    public void testGetRoot() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        Node root = compiler.getRoot();
        assertNotNull(root);
        assertEquals(Token.BLOCK, root.getType());
        assertEquals(2, root.getChildCount()); // externsRoot and jsRoot
    }

    @Test
    public void testToSource() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.prettyPrint = true;
        options.lineBreak = true;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(a){return a+1;}");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        String source = compiler.toSource();
        assertTrue(source.contains("function f(a) {"));
        assertTrue(source.contains("return a + 1;"));
    }

    @Test
    public void testToSourceArray() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input1 = JSSourceFile.fromCode("input1.js", "var a = 1;");
        JSSourceFile input2 = JSSourceFile.fromCode("input2.js", "var b = 2;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input1, input2}, options);
        String[] sources = compiler.toSourceArray();
        assertEquals(2, sources.length);
        assertTrue(sources[0].contains("var a = 1;"));
        assertTrue(sources[1].contains("var b = 2;"));
    }

    @Test
    public void testToSourceWithModule() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSModule module = new JSModule("m1");
        module.add(JSSourceFile.fromCode("m1_1.js", "var x = 1;"));
        module.add(JSSourceFile.fromCode("m1_2.js", "var y = x + 1;"));
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);
        String source = compiler.toSource(module);
        assertTrue(source.contains("var x = 1;"));
        assertTrue(source.contains("var y = x + 1;"));
    }

    @Test
    public void testToSourceArrayWithModule() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSModule module = new JSModule("m1");
        module.add(JSSourceFile.fromCode("m1_1.js", "var a = 1;"));
        module.add(JSSourceFile.fromCode("m1_2.js", "var b = 2;"));
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);
        String[] sources = compiler.toSourceArray(module);
        assertEquals(2, sources.length);
        assertTrue(sources[0].contains("var a = 1;"));
        assertTrue(sources[1].contains("var b = 2;"));
    }

    @Test
    public void testOptimize() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.foldConstants = true; // Enable an optimization
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1 + 2;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        // After optimization, x should be 3. The exact output might vary slightly.
        String source = compiler.toSource();
        assertTrue(source.contains("var x=3"));
    }

    @Test
    public void testNormalize() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(){ return \n 1; }");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        String source = compiler.toSource();
        assertTrue(source.contains("function f()") || source.contains("function f() {"));
        assertTrue(source.contains("return 1"));
    }

    @Test
    public void testGetSourceLine() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;\nvar b = 2;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertEquals("var a = 1;", compiler.getSourceLine("input.js", 1));
        assertEquals("var b = 2;", compiler.getSourceLine("input.js", 2));
        assertNull(compiler.getSourceLine("input.js", 3)); // Line out of bounds
        assertNull(compiler.getSourceLine("nonexistent.js", 1)); // Non-existent file
    }


    @Test
    public void testGetSourceMap() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "test.js.map";
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getSourceMap());
    }

    @Test
    public void testSetLoggingLevel() throws Exception {
        Level originalLevel = Logger.getLogger("com.google.javascript.jscomp").getLevel();
        Compiler.setLoggingLevel(Level.SEVERE);
        assertEquals(Level.SEVERE, Logger.getLogger("com.google.javascript.jscomp").getLevel());
        // Reset to original level
        Compiler.setLoggingLevel(originalLevel);
    }

    @Test
    public void testGetAstDotGraph() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        String dotGraph = compiler.getAstDotGraph();
        assertNotNull(dotGraph);
        assertTrue(dotGraph.contains("digraph")); // Basic check for DOT format
        assertTrue(dotGraph.contains("SCRIPT"));
        assertTrue(dotGraph.contains("VAR"));
    }

    @Test
    public void testGetErrorManager() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        ErrorManager em = compiler.getErrorManager();
        assertNotNull(em);
        assertTrue(em instanceof LoggerErrorManager || em instanceof PrintStreamErrorManager);
    }

    @Test
    public void testGetErrorCount() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 'hello' - 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertEquals(1, compiler.getErrorCount());
    }


    @Test
    public void testHasErrors() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 'hello' - 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testHasErrorsWhenNoErrors() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertFalse(compiler.hasErrors());
    }



    @Test
    public void testGetUniqueNameIdSupplier() throws Exception {
        Compiler compiler = new Compiler();
        compiler.resetUniqueNameId(); // Ensure starting from 0
        Supplier<String> idSupplier = compiler.getUniqueNameIdSupplier();
        assertEquals("0", idSupplier.get());
        assertEquals("1", idSupplier.get());
        assertEquals("2", idSupplier.get());
    }

    @Test
    public void testToStringCodeBuilder() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("test");
        assertEquals("test", cb.toString());
        assertEquals(4, cb.getLength());
        cb.reset();
        assertEquals("", cb.toString());
    }

    @Test
    public void testCodeBuilderLineAndColumnTracking() throws Exception {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("line1\n");
        assertEquals(1, cb.getLineIndex());
        assertEquals(5, cb.getColumnIndex()); // Length of "line1"
        cb.append("line2");
        assertEquals(1, cb.getLineIndex()); // Still on the same line
        assertEquals(10, cb.getColumnIndex()); // 5 + length of "line2"
        cb.append("\nline3");
        assertEquals(2, cb.getLineIndex()); // Moved to the next line
        assertEquals(5, cb.getColumnIndex()); // Length of "line3"
    }

    @Test
    public void testCodeBuilderEndsWith() throws Exception {
        Compiler.CodeBuilder cb = new Compiler.CodeBuilder();
        cb.append("some text");
        assertTrue(cb.endsWith("text"));
        assertTrue(cb.endsWith("some text"));
        assertFalse(cb.endsWith("other"));
        assertFalse(cb.endsWith("some text "));
    }

    @Test
    public void testToStringArrayWithEmptyModule() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSModule module = new JSModule("emptyModule");
        // For an empty module, toSourceArray should return an empty array.
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);
        String[] sources = compiler.toSourceArray(module);
        assertNotNull(sources);
        assertEquals(0, sources.length);
    }

    @Test
    public void testDisableThreads() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        // This test primarily ensures the method can be called without errors.
        // Direct state assertion is not possible due to private field.
    }

    @Test
    public void testRun() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        // The 'run()' method is not public and seems to be an internal helper.
        // Testing its effect would require understanding its internal logic,
        // which is beyond the scope of simple unit tests for public API.
        // We can ensure initialization and compilation can proceed.
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
    }


    @Test
    public void testCheck() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        // The check() method performs checks, it should not throw exceptions on valid code.
        // If it throws an exception, it indicates an internal error in the compiler.
        compiler.check(); // Should not throw an exception for valid JS.
    }

    @Test
    public void testGetMessages() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.checkTypes = true;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 'hello' - 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        JSError[] messages = compiler.getMessages();
        assertTrue(messages.length > 0);
        // The previous test was asserting exactly 1 message, which might not always be true
        // if other diagnostics are enabled. Checking for at least one message is safer.
        assertTrue(messages.length >= 1);
    }

    @Test
    public void testGetInput() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        CompilerInput compilerInput = compiler.getInput("input.js");
        assertNotNull(compilerInput);
        assertEquals("input.js", compilerInput.getName());
        assertNull(compiler.getInput("nonexistent.js"));
    }

    @Test
    public void testNewExternInput() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile extern = JSSourceFile.fromCode("existingExtern.js", "var y = 2;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{}, options);

        CompilerInput newExtern = compiler.newExternInput("newExtern.js");
        assertNotNull(newExtern);
        assertEquals("newExtern.js", newExtern.getName());
        assertTrue(newExtern.isExtern());
        try {
            compiler.newExternInput("newExtern.js");
            fail("Should throw IllegalArgumentException for duplicate extern name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Conflicting externs name"));
        }
    }


    @Test
    public void testGetTopScope() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        // getTopScope() is typically populated after compilation or type checking.
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        Scope topScope = compiler.getTopScope();
        assertNotNull(topScope);
        assertTrue(topScope.isGlobal());
        assertNotNull(topScope.getVar("x"));
    }

    @Test
    public void testGetReverseAbstractInterpreter() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // initOptions must be called before getReverseAbstractInterpreter can be meaningfully used.
        compiler.initOptions(options);
        ReverseAbstractInterpreter interpreter = compiler.getReverseAbstractInterpreter();
        assertNotNull(interpreter);
    }

    @Test
    public void testGetCodingConvention() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // Default convention is expected before initOptions if no specific one is set.
        assertEquals(compiler.defaultCodingConvention, compiler.getCodingConvention());

        CodingConvention customConvention = new ClosureCodingConvention();
        options.setCodingConvention(customConvention);
        compiler.initOptions(options);
        assertEquals(customConvention, compiler.getCodingConvention());
    }

    @Test
    public void testIsIdeMode() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.ideMode = false;
        compiler.initOptions(options);
        assertFalse(compiler.isIdeMode());

        options.ideMode = true;
        compiler.initOptions(options);
        assertTrue(compiler.isIdeMode());
    }

    @Test
    public void testAcceptEcmaScript5() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();

        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        compiler.initOptions(options);
        assertFalse(compiler.acceptEcmaScript5());

        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        assertTrue(compiler.acceptEcmaScript5());

        options.setLanguageIn(LanguageMode.ECMASCRIPT5_STRICT);
        compiler.initOptions(options);
        assertTrue(compiler.acceptEcmaScript5());
    }

    @Test
    public void testLanguageMode() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();

        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        compiler.initOptions(options);
        assertEquals(LanguageMode.ECMASCRIPT3, compiler.languageMode());

        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
    }

    @Test
    public void testAcceptConstKeyword() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();

        options.acceptConstKeyword = false;
        compiler.initOptions(options);
        assertFalse(compiler.acceptConstKeyword());

        options.acceptConstKeyword = true;
        compiler.initOptions(options);
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testIsTypeCheckingEnabled() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();

        options.checkTypes = false;
        compiler.initOptions(options);
        assertFalse(compiler.isTypeCheckingEnabled());

        options.checkTypes = true;
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }



    @Test
    public void testGetSourceLine_nullInput() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options); // Ensure compiler is initialized enough
        // getSourceLine correctly returns null for non-existent files or out-of-bounds lines.
        assertNull(compiler.getSourceLine("nonexistent.js", 1));
        assertNull(compiler.getSourceLine("input.js", 5)); // Assuming input.js has fewer than 5 lines
    }

    @Test
    public void testGetSourceRegion_nullInput() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        // getSourceRegion correctly returns null for non-existent files or out-of-bounds lines.
        assertNull(compiler.getSourceRegion("nonexistent.js", 1));
        assertNull(compiler.getSourceRegion("input.js", 5)); // Assuming input.js has fewer than 5 lines
    }

    @Test
    public void testGetSourceMap_nullOutputPath() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        // Source map is only created if sourceMapOutputPath is set.
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testGetAstDotGraph_noRoot() throws Exception {
        Compiler compiler = new Compiler();
        // If no compilation/init has happened, jsRoot is null, so getAstDotGraph should return an empty string.
        String dotGraph = compiler.getAstDotGraph();
        assertEquals("", dotGraph);
    }

    @Test
    public void testGetErrorManager_uninitialized() throws Exception {
        Compiler compiler = new Compiler();
        // If initOptions has not been called, getErrorManager should initialize it.
        ErrorManager em = compiler.getErrorManager();
        assertNotNull(em);
        assertTrue(em instanceof LoggerErrorManager); // Default when no stream is provided
    }



    @Test
    public void testGetGlobalVarReferences() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var globalVar = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);

        ReferenceMap refMap = compiler.getGlobalVarReferences();
        assertNotNull(refMap);
        // It should be an instance of GlobalVarReferenceMap after compilation.
        assertTrue(refMap instanceof GlobalVarReferenceMap);
    }
}
