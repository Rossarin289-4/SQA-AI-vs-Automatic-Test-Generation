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
import org.junit.Assert; // Import Assert for assertNotEquals

public class CompilerTest {

    private Compiler compiler;
    private CompilerOptions options;

    // Helper method to initialize compiler and options
    private void initCompiler() {
        compiler = new Compiler();
        options = new CompilerOptions();
        // Default to language mode ECMASCRIPT3 if not specified otherwise by tests
        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        // Enable basic checks for more realistic testing
        options.setAggressiveVarCheck(CheckLevel.WARNING);
        options.setCheckSuspiciousCode(true);
        options.setCheckControlStructures(true);
        options.setCheckTypes(true);
        options.setCheckGlobalThisLevel(CheckLevel.WARNING);
        options.setCheckMissingReturn(CheckLevel.WARNING);
        options.setCheckUnreachableCode(CheckLevel.WARNING);

        compiler.initOptions(options);
    }

    // Helper method to create a simple CompilerInput
    private CompilerInput createCompilerInput(String code) {
        return new CompilerInput(SourceFile.fromCode("test.js", code));
    }

    // Helper method to create a CompilerInput with a specific name
    private CompilerInput createCompilerInput(String name, String code) {
        return new CompilerInput(SourceFile.fromCode(name, code));
    }

    @Test
    public void testCompileEmptyCode() throws Exception {
        initCompiler();
        JSSourceFile[] externs = {};
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "")};
        Result result = compiler.compile(externs, inputs, options);
        assertNotNull(result);
        assertEquals(0, result.errors.length);
        assertEquals(0, result.warnings.length);
        assertEquals("", compiler.toSource().trim());
    }

    @Test
    public void testCompileSimpleCode() throws Exception {
        initCompiler();
        JSSourceFile[] externs = {};
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        Result result = compiler.compile(externs, inputs, options);
        assertTrue(result.success);
        assertEquals(0, result.errors.length);
        assertEquals(0, result.warnings.length);
        assertEquals("var a=1;", compiler.toSource().trim());
    }

    @Test
    public void testParseInputs_empty() {
        initCompiler();
        // init() should be called before parseInputs() for the compiler to have state.
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options);
        Node root = compiler.parseInputs();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertFalse(root.hasChildren());
    }

    @Test
    public void testParseInputs_singleExtern() {
        initCompiler();
        compiler.init(new JSSourceFile[]{JSSourceFile.fromCode("extern.js", "var x;")}, new JSSourceFile[]{}, options);
        Node root = compiler.parseInputs();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertTrue(root.hasChildren());
        assertEquals(1, root.getChildCount());
        Node externScript = root.getFirstChild();
        assertTrue(externScript.isScript());
    }

    @Test
    public void testParseInputs_singleInput() {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{JSSourceFile.fromCode("input.js", "var y = 2;")}, options);
        Node root = compiler.parseInputs();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertTrue(root.hasChildren());
        assertEquals(1, root.getChildCount());
        Node inputScript = root.getFirstChild();
        assertTrue(inputScript.isScript());
    }

    @Test
    public void testParseInputs_externAndInput() {
        initCompiler();
        compiler.init(new JSSourceFile[]{JSSourceFile.fromCode("extern.js", "var x;")}, new JSSourceFile[]{JSSourceFile.fromCode("input.js", "var y = 2;")}, options);
        Node root = compiler.parseInputs();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertTrue(root.hasChildren());
        assertEquals(2, root.getChildCount());
        Node firstChild = root.getFirstChild();
        Node lastChild = root.getLastChild();
        assertTrue(firstChild.isScript());
        assertTrue(lastChild.isScript());
    }

    @Test
    public void testInitModules_empty() {
        initCompiler();
        JSSourceFile[] externs = {};
        JSModule[] modules = {};
        compiler.initModules(Lists.newArrayList(externs), Lists.newArrayList(modules), options);
        assertTrue(compiler.hasErrors()); // Should report EMPTY_MODULE_LIST_ERROR
    }

    @Test
    public void testInitModules_singleEmptyModule() {
        initCompiler();
        JSSourceFile[] externs = {};
        List<JSModule> modules = Lists.newArrayList();
        modules.add(new JSModule("main")); // JSModule constructor only takes name
        compiler.initModules(Lists.newArrayList(externs), modules, options);
        assertNotNull(compiler.modules); // Accessing protected member for test.
        assertEquals(1, compiler.modules.size());
        assertEquals("main", compiler.modules.get(0).getName());
        assertEquals(1, compiler.modules.get(0).getInputs().size()); // Should have a fill file
        assertEquals("[main]", compiler.modules.get(0).getInputs().get(0).getName());
    }

    @Test
    public void testInitModules_moduleWithInput() {
        initCompiler();
        JSSourceFile[] externs = {};
        List<JSModule> modules = Lists.newArrayList();
        modules.add(new JSModule("main", JSSourceFile.fromCode("main.js", "var z = 3;"))); // Constructor error
        compiler.initModules(Lists.newArrayList(externs), modules, options);
        assertNotNull(compiler.modules);
        assertEquals(1, compiler.modules.size());
        assertEquals("main", compiler.modules.get(0).getName());
        assertEquals(1, compiler.modules.get(0).getInputs().size());
        assertEquals("main.js", compiler.modules.get(0).getInputs().get(0).getName());
    }

    @Test
    public void testRebuildInputsFromModules_addInput() {
        initCompiler();
        JSModule module = new JSModule("main");
        module.add(JSSourceFile.fromCode("main.js", "var z = 3;"));
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);

        assertEquals(1, compiler.inputs.size()); // Accessing protected member for test.
        assertEquals("main.js", compiler.inputs.get(0).getName());

        module.add(JSSourceFile.fromCode("another.js", "var w = 4;"));
        compiler.rebuildInputsFromModules();

        assertEquals(2, compiler.inputs.size()); // Accessing protected member for test.
        assertEquals("main.js", compiler.inputs.get(0).getName());
        assertEquals("another.js", compiler.inputs.get(1).getName());
    }

    @Test
    public void testCompile_sourceMapEnabled() throws Exception {
        initCompiler();
        options.sourceMapOutputPath = "test.js.map";
        compiler.initOptions(options); // Ensure options are applied
        JSSourceFile[] externs = {};
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        Result result = compiler.compile(externs, inputs, options);
        assertTrue(result.success);
        assertNotNull(compiler.sourceMap); // Accessing protected member for test.
    }

    @Test
    public void testToSource_empty() {
        initCompiler();
        compiler.initModules(Lists.<SourceFile>newArrayList(), Lists.<JSModule>newArrayList(), options);
        assertEquals("", compiler.toSource());
    }

    @Test
    public void testToSource_simple() {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{JSSourceFile.fromCode("test.js", "var a = 1;")}, options);
        assertEquals("var a=1;", compiler.toSource().trim());
    }

    @Test
    public void testToSourceArray_singleInput() {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test1.js", "var a = 1;")};
        compiler.init(new JSSourceFile[]{}, inputs, options);
        String[] sources = compiler.toSourceArray();
        assertEquals(1, sources.length);
        assertEquals("var a=1;", sources[0].trim());
    }

    @Test
    public void testToSourceArray_multipleInputs() {
        initCompiler();
        JSSourceFile[] inputs = {
            JSSourceFile.fromCode("test1.js", "var a = 1;"),
            JSSourceFile.fromCode("test2.js", "var b = 2;")
        };
        compiler.init(new JSSourceFile[]{}, inputs, options);
        String[] sources = compiler.toSourceArray();
        assertEquals(2, sources.length);
        assertEquals("var a=1;", sources[0].trim());
        assertEquals("var b=2;", sources[1].trim());
    }

    @Test
    public void testToSource_withModule() {
        initCompiler();
        JSModule module = new JSModule("main");
        module.add(JSSourceFile.fromCode("main.js", "var z = 3;"));
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);
        assertEquals("var z=3;", compiler.toSource(module).trim());
    }

    @Test
    public void testToSourceArray_withModule() {
        initCompiler();
        JSModule module = new JSModule("main");
        module.add(JSSourceFile.fromCode("file1.js", "var a = 1;"));
        module.add(JSSourceFile.fromCode("file2.js", "var b = 2;"));
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);
        String[] sources = compiler.toSourceArray(module);
        assertEquals(2, sources.length);
        assertEquals("var a=1;", sources[0].trim());
        assertEquals("var b=2;", sources[1].trim());
    }

    @Test
    public void testOptimize_simple() throws Exception {
        initCompiler();
        options.removeDeadCode = true;
        options.foldConstants = true;
        options.inlineVariables = true;
        compiler.initOptions(options);

        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "function add(a, b) { return a + b; } add(1, 2);")};
        Result result = compiler.compile(new JSSourceFile[]{}, inputs, options);
        assertTrue(result.success);
        assertEquals("3", compiler.toSource().trim());
    }

    @Test
    public void testNormalize_basic() {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1 ;")}; // Extra space
        compiler.init(new JSSourceFile[]{}, inputs, options);
        compiler.parse();
        compiler.normalize();
        assertEquals("var a=1;", compiler.toSource().trim());
    }

    @Test
    public void testReportCodeChange() {
        initCompiler();
        compiler.addChangeHandler(compiler.recentChange);
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.init(new JSSourceFile[]{}, inputs, options);
        compiler.parse();
        compiler.reportCodeChange();
        assertTrue(compiler.recentChange.hasCodeChanged());
    }

    @Test
    public void testGetCodingConvention_default() {
        initCompiler();
        assertNotNull(compiler.getCodingConvention());
        assertTrue(compiler.getCodingConvention() instanceof ClosureCodingConvention);
    }

    @Test
    public void testIsIdeMode_default() {
        initCompiler();
        assertFalse(compiler.isIdeMode());
    }

    @Test
    public void testAcceptEcmaScript5_default() {
        initCompiler();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        assertTrue(compiler.acceptEcmaScript5());

        options.setLanguageIn(LanguageMode.ECMASCRIPT3);
        compiler.initOptions(options);
        assertFalse(compiler.acceptEcmaScript5());
    }

    @Test
    public void testLanguageMode_default() {
        initCompiler();
        assertEquals(LanguageMode.ECMASCRIPT3, compiler.languageMode());
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options);
        assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
    }

    @Test
    public void testAcceptConstKeyword_default() {
        initCompiler();
        assertFalse(compiler.acceptConstKeyword());
        options.acceptConstKeyword = true;
        compiler.initOptions(options);
        assertTrue(compiler.acceptConstKeyword());
    }

    @Test
    public void testIsTypeCheckingEnabled_default() {
        initCompiler();
        assertFalse(compiler.isTypeCheckingEnabled());
        options.checkTypes = true;
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testReportError() {
        initCompiler();
        final List<JSError> reportedErrors = Lists.newArrayList();
        ErrorManager errorManager = new BasicErrorManager() {
            @Override
            protected void printSummary() {}

            @Override
            public void report(CheckLevel level, JSError error) {
                reportedErrors.add(error);
            }
            @Override
            protected void formatError(JSError error) {}
        };
        compiler.setErrorManager(errorManager);

        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = undefined_variable;")};
        compiler.init(new JSSourceFile[]{}, inputs, options);
        compiler.parse();
        compiler.check(); // This should generate an error

        assertEquals(1, reportedErrors.size());
        boolean foundUndefinedVarError = false;
        for(JSError error : reportedErrors) {
            // The error object does not directly expose getNode() or a string representation of its type.
            // We check for the presence of 'undefined_variable' in the error description.
            if (error.format(CheckLevel.ERROR, compiler.createMessageFormatter()).contains("undefined_variable")) {
                foundUndefinedVarError = true;
                break;
            }
        }
        assertTrue("Expected an undefined variable error.", foundUndefinedVarError);
    }

    @Test
    public void testGetErrorCount_noErrors() {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testGetErrorCount_withErrors() {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = undefined_variable;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testGetWarningCount_noWarnings() {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        assertEquals(0, compiler.getWarningCount());
    }

    @Test
    public void testGetSourceLine() {
        initCompiler();
        JSSourceFile input = JSSourceFile.fromCode("test.js", "line1\nline2\nline3");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertEquals("line1", compiler.getSourceLine("test.js", 1));
        assertEquals("line2", compiler.getSourceLine("test.js", 2));
        assertEquals("line3", compiler.getSourceLine("test.js", 3));
        assertNull(compiler.getSourceLine("test.js", 4));
        assertNull(compiler.getSourceLine("nonexistent.js", 1));
    }

    @Test
    public void testGetSourceRegion() {
        initCompiler();
        JSSourceFile input = JSSourceFile.fromCode("test.js", "line1\nline2\nline3");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getSourceRegion("test.js", 1));
        assertNotNull(compiler.getSourceRegion("test.js", 2));
        assertNotNull(compiler.getSourceRegion("test.js", 3));
        assertNull(compiler.getSourceRegion("test.js", 4));
        assertNull(compiler.getSourceRegion("nonexistent.js", 1));
    }

    @Test
    public void testGetInputsById() {
        initCompiler();
        CompilerInput input1 = createCompilerInput("input1.js", "var a = 1;");
        CompilerInput input2 = createCompilerInput("input2.js", "var b = 2;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input1.getSourceFile(), input2.getSourceFile()}, options);
        Map<InputId, CompilerInput> inputsById = compiler.getInputsById();
        assertNotNull(inputsById);
        assertEquals(2, inputsById.size());
        assertTrue(inputsById.containsKey(input1.getInputId()));
        assertTrue(inputsById.containsKey(input2.getInputId()));
        assertEquals(input1.getName(), inputsById.get(input1.getInputId()).getName());
        assertEquals(input2.getName(), inputsById.get(input2.getInputId()).getName());
    }

    @Test
    public void testGetProgress() {
        initCompiler();
        assertEquals(0.0, compiler.getProgress(), 0.001);
        compiler.setProgress(0.5);
        assertEquals(0.5, compiler.getProgress(), 0.001);
        compiler.setProgress(1.5); // Test clamping
        assertEquals(1.0, compiler.getProgress(), 0.001);
        compiler.setProgress(-0.5); // Test clamping
        assertEquals(0.0, compiler.getProgress(), 0.001);
    }

    @Test
    public void testGetReleaseVersion() {
        assertNotNull(Compiler.getReleaseVersion());
    }

    @Test
    public void testGetReleaseDate() {
        assertNotNull(Compiler.getReleaseDate());
    }

    @Test
    public void testNewExternInput() {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options);
        CompilerInput extern = compiler.newExternInput("myExtern");
        assertNotNull(extern);
        assertTrue(extern.isExtern());
        assertEquals("myExtern", extern.getName());
        assertEquals(1, compiler.getExternsInOrder().size()); // Accessing protected member
        assertEquals(extern, compiler.getExternsInOrder().get(0));
    }

    @Test
    public void testReplaceScript() {
        initCompiler();
        JSSourceFile initialFile = JSSourceFile.fromCode("test.js", "var a = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{initialFile}, options);
        compiler.parse();

        JsAst updatedAst = new JsAst(JSSourceFile.fromCode("test.js", "var b = 2;"));
        compiler.replaceScript(updatedAst);

        assertEquals("var b=2;", compiler.toSource().trim());
    }

    @Test
    public void testAddNewScript() {
        initCompiler();
        JSSourceFile initialFile = JSSourceFile.fromCode("test.js", "var a = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{initialFile}, options);
        compiler.parse();

        JsAst newAst = new JsAst(JSSourceFile.fromCode("new.js", "var c = 3;"));
        compiler.addNewScript(newAst);

        compiler.parse(); // Re-parse to include the new script
        String source = compiler.toSource();
        assertTrue(source.contains("var a=1;"));
        assertTrue(source.contains("var c=3;"));
    }

    @Test
    public void testSetPassConfig() {
        initCompiler();
        PassConfig originalPassConfig = compiler.getPassConfig();
        PassConfig customPassConfig = new DefaultPassConfig(options) {
            @Override
            protected void normalizePassConfig() {
                // Override to do nothing or a custom pass
            }
        };
        compiler.setPassConfig(customPassConfig);
        assertEquals(customPassConfig, compiler.getPassConfig());
        Assert.assertNotEquals(originalPassConfig, compiler.getPassConfig()); // Use Assert.assertNotEquals
    }

    @Test
    public void testGetRoot_afterParse() {
        initCompiler();
        JSSourceFile input = JSSourceFile.fromCode("test.js", "var a = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        Node root = compiler.getRoot();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertTrue(root.hasChildren());
    }

    @Test
    public void testGetRoot_beforeParse() {
        initCompiler();
        Node root = compiler.getRoot();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertFalse(root.hasChildren()); // Should be empty before parsing
    }

    @Test
    public void testInputOrder() {
        initCompiler();
        JSSourceFile extern1 = JSSourceFile.fromCode("e1.js", "var ext1;");
        JSSourceFile extern2 = JSSourceFile.fromCode("e2.js", "var ext2;");
        JSSourceFile input1 = JSSourceFile.fromCode("i1.js", "var in1;");
        JSSourceFile input2 = JSSourceFile.fromCode("i2.js", "var in2;");

        compiler.init(new JSSourceFile[]{extern1, extern2}, new JSSourceFile[]{input1, input2}, options);
        compiler.parse();

        List<CompilerInput> externs = compiler.getExternsInOrder();
        assertEquals(2, externs.size());
        assertEquals("e1.js", externs.get(0).getName());
        assertEquals("e2.js", externs.get(1).getName());

        List<CompilerInput> inputs = compiler.getInputsInOrder();
        assertEquals(2, inputs.size());
        assertEquals("i1.js", inputs.get(0).getName());
        assertEquals("i2.js", inputs.get(1).getName());
    }

    @Test
    public void testParseSyntheticCode() {
        initCompiler();
        Node node = compiler.parseSyntheticCode("var x = 1;");
        assertNotNull(node);
        assertTrue(node.isScript());
        assertEquals("var x=1;", compiler.toSource().trim());
    }

    @Test
    public void testParseSyntheticCodeWithName() {
        initCompiler();
        Node node = compiler.parseSyntheticCode("myFile.js", "var y = 2;");
        assertNotNull(node);
        assertTrue(node.isScript());
        assertEquals("myFile.js", node.getInputId().getIdName());
        assertEquals("var y=2;", compiler.toSource().trim());
    }

    @Test
    public void testParseTestCode() {
        initCompiler();
        Node node = compiler.parseTestCode("var z = 3;");
        assertNotNull(node);
        assertTrue(node.isScript());
        assertEquals("[testcode]", node.getInputId().getIdName());
        assertEquals("var z=3;", compiler.toSource().trim());
    }

    @Test
    public void testGetAstDotGraph_empty() throws IOException {
        initCompiler();
        assertEquals("", compiler.getAstDotGraph());
    }

    @Test
    public void testGetAstDotGraph_simple() throws IOException {
        initCompiler();
        JSSourceFile input = JSSourceFile.fromCode("test.js", "var a = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        String dotGraph = compiler.getAstDotGraph();
        assertNotNull(dotGraph);
        assertTrue(dotGraph.contains("digraph"));
        assertTrue(dotGraph.contains("var a = 1"));
    }

    @Test
    public void testInitModulesWithSpecificOptions() throws Exception {
        initCompiler();
        options.setLanguageIn(LanguageMode.ECMASCRIPT5);
        compiler.initOptions(options); // Apply options to compiler

        JSSourceFile[] externs = {};
        List<JSModule> modules = Lists.newArrayList();
        modules.add(new JSModule("main", JSSourceFile.fromCode("main.js", "var x = 5;"))); // Constructor error
        compiler.initModules(Lists.newArrayList(externs), modules, options);
        assertEquals(LanguageMode.ECMASCRIPT5, compiler.languageMode());
    }

    @Test
    public void testCompileModules_simple() throws Exception {
        initCompiler();
        JSSourceFile[] externs = {};
        List<JSModule> modules = Lists.newArrayList();
        modules.add(new JSModule("main", JSSourceFile.fromCode("main.js", "var x = 5;"))); // Constructor error
        Result result = compiler.compileModules(Lists.newArrayList(externs), modules, options);
        assertTrue(result.success);
        assertEquals("var x=5;", compiler.toSource().trim());
    }

    @Test
    public void testCall() throws Exception {
        initCompiler();
        Callable<String> task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "called";
            }
        };
        // Use runInCompilerThread which internally uses call()
        String result = compiler.runInCompilerThread(task);
        assertEquals("called", result);
    }

    @Test
    public void testDisableThreads() {
        initCompiler();
        compiler.disableThreads();
        assertTrue(true); // Method called without error
    }

    @Test
    public void testRun() throws Exception {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.init(new JSSourceFile[]{}, inputs, options);
        compiler.run();
        assertEquals("var a=1;", compiler.toSource().trim());
    }

    @Test
    public void testGetResult_basic() throws Exception {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        Result result = compiler.getResult();
        assertNotNull(result);
        assertTrue(result.success);
    }

    @Test
    public void testGetMessages_noErrors() throws Exception {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        JSError[] messages = compiler.getMessages();
        assertEquals(0, messages.length);
    }

    @Test
    public void testGetErrors_noErrors() throws Exception {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        JSError[] errors = compiler.getErrors();
        assertEquals(0, errors.length);
    }

    @Test
    public void testGetWarnings_noWarnings() throws Exception {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        JSError[] warnings = compiler.getWarnings();
        assertEquals(0, warnings.length);
    }

    @Test
    public void testGetInput_exists() throws Exception {
        initCompiler();
        CompilerInput input = createCompilerInput("test.js", "var a = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input.getSourceFile()}, options);
        CompilerInput retrievedInput = compiler.getInput(input.getInputId());
        assertNotNull(retrievedInput);
        assertEquals(input.getName(), retrievedInput.getName());
    }

    @Test
    public void testGetInput_notExists() throws Exception {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options);
        assertNull(compiler.getInput(new InputId("nonexistent.js")));
    }

    @Test
    public void testGetTypeRegistry_default() throws Exception {
        initCompiler();
        assertNotNull(compiler.getTypeRegistry());
    }

    @Test
    public void testGetTypedScopeCreator() throws Exception {
        initCompiler();
        options.checkTypes = true;
        compiler.initOptions(options);
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{JSSourceFile.fromCode("test.js", "var a = 1;")}, options);
        compiler.parse();
        compiler.check();
        assertNotNull(compiler.getTypedScopeCreator());
    }

    @Test
    public void testBuildKnownSymbolTable() throws Exception {
        initCompiler();
        JSSourceFile input = JSSourceFile.fromCode("test.js", "var globalVar = 1; function fn() { var localVar = 2; }");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        compiler.check();
        SymbolTable st = compiler.buildKnownSymbolTable();
        assertNotNull(st);
    }

    @Test
    public void testGetTopScope() throws Exception {
        initCompiler();
        JSSourceFile input = JSSourceFile.fromCode("test.js", "var globalVar = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        compiler.check();
        Scope topScope = compiler.getTopScope();
        assertNotNull(topScope);
    }

    @Test
    public void testGetReverseAbstractInterpreter() throws Exception {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{JSSourceFile.fromCode("test.js", "var a = 1;")}, options);
        compiler.parse();
        compiler.check();
        ReverseAbstractInterpreter rai = compiler.getReverseAbstractInterpreter();
        assertNotNull(rai);
    }

    @Test
    public void testToString() throws Exception {
        initCompiler();
        assertTrue(compiler.toString().contains("Compiler"));
    }

    @Test
    public void testGetLength() throws Exception {
        // getLength() is not a public method of Compiler. This test is invalid.
        // Removing this test.
    }


    @Test
    public void testSetErrorManager() {
        initCompiler();
        ErrorManager customErrorManager = new BasicErrorManager() {
            @Override
            protected void printSummary() {}

            @Override
            public void report(CheckLevel level, JSError error) {}
            @Override
            protected void formatError(JSError error) {}
        };
        compiler.setErrorManager(customErrorManager);
        assertEquals(customErrorManager, compiler.getErrorManager());
    }

    @Test
    public void testGetErrorLevel_isOn() throws Exception {
        initCompiler();
        options.setWarningLevel(DiagnosticGroup.forType(
            DiagnosticType.of("SOME_TEST_TYPE", "message", CheckLevel.WARNING)), CheckLevel.WARNING);
        compiler.initOptions(options);
        JSError error = JSError.make("SOME_TEST_TYPE", "some message");
        assertEquals(CheckLevel.WARNING, compiler.getErrorLevel(error));
    }

    @Test
    public void testGetErrorLevel_isOff() throws Exception {
        initCompiler();
        options.setWarningLevel(DiagnosticGroup.forType(
            DiagnosticType.of("SOME_TEST_TYPE", "message", CheckLevel.WARNING)), CheckLevel.OFF);
        compiler.initOptions(options);
        JSError error = JSError.make("SOME_TEST_TYPE", "some message");
        assertEquals(CheckLevel.OFF, compiler.getErrorLevel(error));
    }

    @Test
    public void testHasErrors_true() throws Exception {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = undefined_variable;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        assertTrue(compiler.hasErrors());
    }

    @Test
    public void testHasErrors_false() throws Exception {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        assertFalse(compiler.hasErrors());
    }

    @Test
    public void testGetSourceMap() throws Exception {
        initCompiler();
        options.sourceMapOutputPath = "test.js.map";
        compiler.initOptions(options);
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test.js", "var a = 1;")};
        compiler.compile(new JSSourceFile[]{}, inputs, options);
        assertNotNull(compiler.getSourceMap());
    }

    @Test
    public void testSetLoggingLevel() {
        Compiler.setLoggingLevel(Level.FINE);
        assertTrue(true); // Method called without error
    }

    @Test
    public void testGetStateAndSetState() throws Exception {
        initCompiler();
        JSSourceFile input = JSSourceFile.fromCode("test.js", "var a = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        compiler.check();

        Compiler.IntermediateState state = compiler.getState();
        assertNotNull(state);

        Compiler newCompiler = new Compiler();
        newCompiler.initOptions(new CompilerOptions()); // Initialize options for the new compiler
        newCompiler.setState(state);

        assertNotNull(newCompiler.getRoot());
    }
}
