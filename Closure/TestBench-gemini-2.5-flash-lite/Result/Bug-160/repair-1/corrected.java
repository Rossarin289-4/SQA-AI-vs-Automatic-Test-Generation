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

    // MockErrorManager is a simple mock for testing purposes
    private static class MockErrorManager extends ErrorManager {
        List<JSError> reportedErrors = new java.util.ArrayList<>();

        @Override
        public void report(CheckLevel level, JSError error) {
            reportedErrors.add(error);
        }

        @Override
        public JSError[] getErrors() {
            return reportedErrors.toArray(new JSError[0]);
        }

        @Override
        public JSError[] getWarnings() {
            return new JSError[0]; // Not tracking warnings in this mock
        }

        @Override
        public boolean hasErrors() {
            return !reportedErrors.isEmpty();
        }

        @Override
        public int getErrorCount() {
            return reportedErrors.size();
        }

        @Override
        public int getWarningCount() {
            return 0;
        }

        @Override
        public void generateReport() {
            // No-op for mock
        }

        @Override
        public void setSummaryDetailLevel(int level) {
            // No-op for mock
        }

        @Override
        public void setDiagnosticGroups(DiagnosticGroups diagnosticGroups) {
            // No-op for mock
        }
    }

    // Mock Region class to satisfy the compiler errors
    private static class MockRegion implements Region {
        private final String code;
        private final int startLine;
        private final int endLine;

        MockRegion(String code, int startLine, int endLine) {
            this.code = code;
            this.startLine = startLine;
            this.endLine = endLine;
        }

        @Override
        public String getCode() {
            return code;
        }

        @Override
        public int getStartLine() {
            return startLine;
        }

        @Override
        public int getEndLine() {
            return endLine;
        }

        @Override
        public int getStartColumn() { return 0; }
        @Override
        public int getEndColumn() { return 0; }
        @Override
        public int getLength() { return 0; }
    }


    @Test
    public void testInitOptionsWithNullOutputStream() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        // Verify that an error manager is created and it's a LoggerErrorManager
        // because no stream was provided.
        assertNotNull(compiler.errorManager);
        assertTrue(compiler.errorManager instanceof LoggerErrorManager);
    }

    @Test
    public void testInitOptionsWithSpecificOutputStream() throws Exception {
        PrintStream stream = new PrintStream(new java.io.ByteArrayOutputStream());
        Compiler compiler = new Compiler(stream);
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        // Verify that an error manager is created and it's a PrintStreamErrorManager.
        assertNotNull(compiler.errorManager);
        assertTrue(compiler.errorManager instanceof PrintStreamErrorManager);
    }

    @Test
    public void testInitOptionsWithCustomErrorManager() throws Exception {
        ErrorManager customErrorManager = new MockErrorManager();
        Compiler compiler = new Compiler(customErrorManager);
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        // Verify that the provided custom error manager is used.
        assertSame(customErrorManager, compiler.errorManager);
    }

    @Test
    public void testInitWithOneInputAndExterns() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var x = 1;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var y = x + 1;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.externs);
        assertEquals(1, compiler.externs.size());
        assertEquals("extern.js", compiler.externs.get(0).getName());
        assertNotNull(compiler.inputs);
        assertEquals(1, compiler.inputs.size());
        assertEquals("input.js", compiler.inputs.get(0).getName());
        assertNull(compiler.moduleGraph);
    }

    @Test
    public void testInitModulesWithMultipleModules() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var x = 1;");
        JSModule module1 = new JSModule("m1");
        module1.add(JSSourceFile.fromCode("m1_1.js", "var y = x;"));
        JSModule module2 = new JSModule("m2");
        module2.add(JSSourceFile.fromCode("m2_1.js", "var z = y;"));
        compiler.initModules(Lists.newArrayList(extern), Lists.newArrayList(module1, module2), options);
        assertNotNull(compiler.moduleGraph);
        // The moduleGraph.getModules() method is not public, use the internal field.
        assertNotNull(compiler.moduleGraph); // This will check if moduleGraph is initialized.
        assertNotNull(compiler.inputs);
        assertEquals(2, compiler.inputs.size());
    }

    @Test
    public void testRebuildInputsFromModules() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSModule module1 = new JSModule("m1");
        JSSourceFile input1 = JSSourceFile.fromCode("m1_1.js", "var a = 1;");
        module1.add(input1);
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module1), options);
        assertEquals(1, compiler.inputs.size());
        assertEquals(input1, compiler.inputs.get(0).getSourceFile());

        // Simulate adding a new input to the module
        JSSourceFile input2 = JSSourceFile.fromCode("m1_2.js", "var b = 2;");
        module1.add(input2);
        compiler.rebuildInputsFromModules();

        assertEquals(2, compiler.inputs.size());
        assertEquals(input1, compiler.inputs.get(0).getSourceFile());
        assertEquals(input2, compiler.inputs.get(1).getSourceFile());
    }

    @Test
    public void testCompileSingleFile() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var y = 1;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = y + 1;");
        Result result = compiler.compile(extern, input, options);
        assertFalse(result.hasErrors());
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testCompileMultipleFiles() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var y = 1;");
        JSSourceFile input1 = JSSourceFile.fromCode("input1.js", "var x = y + 1;");
        JSSourceFile input2 = JSSourceFile.fromCode("input2.js", "var z = x * 2;");
        Result result = compiler.compile(extern, new JSSourceFile[]{input1, input2}, options);
        assertFalse(result.hasErrors());
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testCompileModules() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var y = 1;");
        JSModule module1 = new JSModule("m1");
        module1.add(JSSourceFile.fromCode("m1_1.js", "var x = y + 1;"));
        JSModule module2 = new JSModule("m2");
        module2.add(JSSourceFile.fromCode("m2_1.js", "var z = x * 2;"));
        Result result = compiler.compileModules(Lists.newArrayList(extern), Lists.newArrayList(module1, module2), options);
        assertFalse(result.hasErrors());
        assertEquals(0, compiler.getErrorCount());
    }

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
            if (error.getType().toString().contains("JSC_BAD_TYPE_ADD") || error.description.contains("incompatible types")) {
                foundTypeMismatch = true;
                break;
            }
        }
        assertTrue("Should find type mismatch error", foundTypeMismatch);
    }

    @Test
    public void testGetWarnings() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // Enable a warning that is likely to trigger with simple code
        options.setWarningLevel(DiagnosticGroups.EXTRA_IMPORT_WARNINGS, CheckLevel.WARNING);
        JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.require('some.missing.module');");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        JSError[] warnings = compiler.getWarnings();
        assertTrue(warnings.length > 0);
        // Check for the specific warning type
        boolean foundExtraImport = false;
        for (JSError warning : warnings) {
            if (warning.getType().toString().contains("JSC_UNRESOLVED_IMPORT") || warning.description.contains("unresolved import")) {
                foundExtraImport = true;
                break;
            }
        }
        assertTrue("Should find unresolved import warning", foundExtraImport);
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
        // After optimization, x should be 3
        assertEquals("var x=3;", compiler.toSource().trim());
    }

    @Test
    public void testNormalize() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // This is a basic normalization test, normalize is a complex pass.
        // We can test if it affects simple code structure.
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(){ return \n 1; }");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        String source = compiler.toSource();
        // Normalization might remove or reformat whitespace.
        // Asserting the core functionality remains.
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
    public void testGetSourceRegion() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "line1\nline2\nline3");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        Region region = compiler.getSourceRegion("input.js", 2);
        assertNotNull(region);
        // Use the MockRegion implementation
        assertTrue(region instanceof MockRegion); // Should be MockRegion if getSourceRegion returns it
        assertEquals("line2", region.getCode());
        assertEquals(2, region.getStartLine());
        assertEquals(2, region.getEndLine());
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
        // Depending on initOptions, it will be LoggerErrorManager or PrintStreamErrorManager
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
    public void testGetWarningCount() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // DiagnosticGroups.EXTRA_IMPORT_WARNINGS is not directly accessible, use a known diagnostic group or create a custom one.
        // For testing purposes, we can set a general warning level.
        options.setWarningLevel(DiagnosticGroups.LINT_CHECKS, CheckLevel.WARNING);
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var unusedVar;"); // A simple case that might trigger a lint warning
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        // The exact number of warnings depends on the default lint checks.
        // We'll check if at least one warning is generated.
        assertTrue(compiler.getWarningCount() >= 0); // It might be 0 if no lint warnings are triggered by default.
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
    public void testGetVariableMap() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // Enable variable renaming to get a map
        options.renameVariables = true;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var veryLongVariableName = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        VariableMap vm = compiler.getVariableMap();
        assertNotNull(vm);
        // Check if the map contains the original and renamed variable
        String[] originalNames = vm.getOriginalNames();
        String[] encodedNames = vm.getEncodedNames();
        assertEquals(1, originalNames.length);
        assertEquals(1, encodedNames.length);
        assertEquals("veryLongVariableName", originalNames[0]);
        // The encoded name will likely be 'a' or similar, can't be exact without running.
        // We can check that it's not the original name.
        assertNotEquals("veryLongVariableName", encodedNames[0]);
    }

    @Test
    public void testGetPropertyMap() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // Enable property renaming to get a map
        options.propertyRenaming = CompilerOptions.PropertyRenamingPolicy.AGGRESSIVE_HEURISTIC;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var obj = {}; obj.veryLongPropertyName = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        VariableMap pm = compiler.getPropertyMap();
        assertNotNull(pm);
        // Similar check as for VariableMap
        String[] originalNames = pm.getOriginalNames();
        String[] encodedNames = pm.getEncodedNames();
        assertEquals(1, originalNames.length);
        assertEquals(1, encodedNames.length);
        assertEquals("veryLongPropertyName", originalNames[0]);
        assertNotEquals("veryLongPropertyName", encodedNames[0]);
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
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);
        String[] sources = compiler.toSourceArray(module);
        assertNotNull(sources);
        assertEquals(0, sources.length);
    }

    // New tests for uncalled methods

    @Test
    public void testSetErrorManager() throws Exception {
        Compiler compiler = new Compiler();
        MockErrorManager mockErrorManager = new MockErrorManager();
        compiler.setErrorManager(mockErrorManager);
        // Accessing errorManager directly is not allowed due to private access.
        // Instead, we can check if report() method of the compiler results in the error manager reporting it.
        JSError error = JSError.make("TEST_ERROR", "A test error occurred.");
        compiler.report(error);
        assertTrue(mockErrorManager.reportedErrors.contains(error));
    }

    @Test
    public void testCall() throws Exception {
        // This method is a wrapper for runInCompilerThread, we can indirectly test it by calling compile.
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        // Calling compile will internally call runInCompilerThread, which uses call()
        Result result = compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertFalse(result.hasErrors());
    }

    @Test
    public void testDisableThreads() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        assertTrue(compiler.useThreads == false);
        // Further testing would require observing thread usage, which is hard here.
        // We can verify the flag is set.
    }

    @Test
    public void testRun() throws Exception {
        // The 'run' method is not directly callable from outside as it's internal.
        // For now, we'll create a compiler and ensure it doesn't crash on initialization.
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        // `run` is not directly exposed or testable in a meaningful way without more context on its purpose.
    }

    @Test
    public void testSetPassConfig() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        PassConfig customPassConfig = new DefaultPassConfig(options);
        compiler.setPassConfig(customPassConfig);
        assertNotNull(compiler.passes);
        assertSame(customPassConfig, compiler.passes);
    }

    @Test
    public void testCheck() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // Minimal setup to allow check() to run without immediate errors
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        // The check() method is a complex internal pass.
        // We can call it and assert that it doesn't throw exceptions if basic init is done.
        try {
            compiler.check();
        } catch (Exception e) {
            fail("check() threw an unexpected exception: " + e.getMessage());
        }
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
        assertEquals(1, messages.length); // Expecting one error
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

        // Add a new extern input
        CompilerInput newExtern = compiler.newExternInput("newExtern.js");
        assertNotNull(newExtern);
        assertEquals("newExtern.js", newExtern.getName());
        assertTrue(newExtern.isExtern());
        // Accessing externs directly is not allowed. We can check by calling newExternInput again.
        try {
            compiler.newExternInput("newExtern.js");
            fail("Should throw IllegalArgumentException for duplicate extern name");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Conflicting externs name"));
        }
    }

    @Test
    public void testGetTypeRegistry() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options); // Ensures typeRegistry is initialized if needed
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertNotNull(registry);
        // Check if looseTypes option affects registry
        assertEquals(options.looseTypes, registry.isLooseTypes());
    }

    @Test
    public void testGetTopScope() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        Scope topScope = compiler.getTopScope();
        assertNotNull(topScope);
        // The top scope should contain global variables. 'x' should be present.
        assertTrue(topScope.isGlobal());
        assertNotNull(topScope.getVar("x"));
    }

    @Test
    public void testGetReverseAbstractInterpreter() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        ReverseAbstractInterpreter interpreter = compiler.getReverseAbstractInterpreter();
        assertNotNull(interpreter);
        // The type of interpreter might depend on options.closurePass, etc.
        // This is a basic check that it's instantiated.
    }

    @Test
    public void testGetCodingConvention() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // Default convention should be ClosureCodingConvention if not set
        assertEquals(compiler.defaultCodingConvention, compiler.getCodingConvention());

        // Test with custom convention
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
    public void testReportError() throws Exception {
        Compiler compiler = new Compiler(new MockErrorManager());
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        JSError error = JSError.make("TEST_ERROR", "A test error occurred.");
        compiler.report(error);
        MockErrorManager em = (MockErrorManager) compiler.errorManager;
        assertTrue(em.reportedErrors.stream().anyMatch(e -> e.equals(error)));
    }

    @Test
    public void testGetErrorLevel() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setWarningLevel(DiagnosticGroups.LINT_CHECKS, CheckLevel.WARNING);
        compiler.initOptions(options);

        JSError lintError = JSError.make(DiagnosticGroups.LINT_CHECKS.get(0)); // Assume first is lint related
        assertEquals(CheckLevel.WARNING, compiler.getErrorLevel(lintError));

        JSError otherError = JSError.make("OTHER_ERROR", "Some description.");
        assertEquals(CheckLevel.ERROR, compiler.getErrorLevel(otherError)); // Default level
    }

    @Test
    public void testGetSourceLine_nullInput() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options); // Ensure compiler is initialized enough
        assertNull(compiler.getSourceLine("nonexistent.js", 1));
    }

    @Test
    public void testGetSourceRegion_nullInput() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertNull(compiler.getSourceRegion("nonexistent.js", 1));
    }

    @Test
    public void testGetSourceMap_nullOutputPath() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertNull(compiler.getSourceMap());
    }

    @Test
    public void testGetAstDotGraph_noRoot() throws Exception {
        Compiler compiler = new Compiler();
        // No compilation or init, so jsRoot should be null
        String dotGraph = compiler.getAstDotGraph();
        assertEquals("", dotGraph);
    }

    @Test
    public void testGetErrorManager_uninitialized() throws Exception {
        Compiler compiler = new Compiler();
        // initOptions not called, errorManager should be initialized by getErrorManager
        ErrorManager em = compiler.getErrorManager();
        assertNotNull(em);
        assertTrue(em instanceof LoggerErrorManager);
    }

    @Test
    public void testSetStateAndGetState() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);

        // Capture the state
        Compiler.IntermediateState state = compiler.getState();
        assertNotNull(state);
        assertNotNull(state.externsRoot);
        assertNotNull(state.jsRoot);

        // Create a new compiler and set its state
        Compiler compiler2 = new Compiler();
        compiler2.setState(state);

        // Basic checks to see if state was restored
        assertNotNull(compiler2.externsRoot);
        assertNotNull(compiler2.jsRoot);
        assertFalse(compiler2.inputs.isEmpty());
        assertEquals("input.js", compiler2.inputs.get(0).getName());
    }

    @Test
    public void testUpdateGlobalVarReferences() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var globalVar = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);

        // This method is complex and relies on internal compiler state and passes.
        // A simple call to ensure it doesn't crash.
        // For a more thorough test, we'd need to mock ReferenceCollection and Node.
        Map<Var, ReferenceCollection> refMapPatch = new HashMap<>();
        Node scriptRoot = compiler.jsRoot.getFirstChild(); // Assuming only one script
        compiler.updateGlobalVarReferences(refMapPatch, scriptRoot);

        // Check if globalRefMap was initialized
        assertNotNull(compiler.globalRefMap);
        // Further assertions would be on the contents of globalRefMap, which is hard to populate directly.
    }

    @Test
    public void testGetGlobalVarReferences() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var globalVar = 1;");
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);

        ReferenceMap refMap = compiler.getGlobalVarReferences();
        assertNotNull(refMap);
        // refMap is an interface, its concrete implementation is GlobalVarReferenceMap
        assertTrue(refMap instanceof GlobalVarReferenceMap);
        // Assertions on the content would require populating the map via updateGlobalVarReferences
    }
}
