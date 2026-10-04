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
        options.prettyPrint = false; // Disable pretty printing for exact string matching

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
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options);
        compiler.parse(); // Call parse() to populate externsRoot and jsRoot
        Node root = compiler.getRoot(); // getRoot() returns externAndJsRoot
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertEquals(2, root.getChildCount()); // Should contain externsRoot and jsRoot
        assertTrue(root.getFirstChild().isSyntheticBlock()); // externsRoot
        assertTrue(root.getLastChild().isSyntheticBlock()); // jsRoot
        assertFalse(root.getFirstChild().hasChildren()); // externsRoot is empty
        assertFalse(root.getLastChild().hasChildren()); // jsRoot is empty
    }

    @Test
    public void testParseInputs_singleExtern() {
        initCompiler();
        compiler.init(new JSSourceFile[]{JSSourceFile.fromCode("extern.js", "var x;")}, new JSSourceFile[]{}, options);
        compiler.parse();
        Node root = compiler.getRoot();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertEquals(2, root.getChildCount());
        Node externsRootNode = root.getFirstChild();
        Node jsRootNode = root.getLastChild();
        assertTrue(externsRootNode.isSyntheticBlock());
        assertTrue(externsRootNode.hasChildren());
        assertEquals(1, externsRootNode.getChildCount());
        Node externScript = externsRootNode.getFirstChild();
        assertTrue(externScript.isScript());
        assertFalse(jsRootNode.hasChildren());
    }

    @Test
    public void testParseInputs_singleInput() {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{JSSourceFile.fromCode("input.js", "var y = 2;")}, options);
        compiler.parse();
        Node root = compiler.getRoot();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertEquals(2, root.getChildCount());
        Node externsRootNode = root.getFirstChild();
        Node jsRootNode = root.getLastChild();
        assertFalse(externsRootNode.hasChildren());
        assertTrue(jsRootNode.isSyntheticBlock());
        assertTrue(jsRootNode.hasChildren());
        assertEquals(1, jsRootNode.getChildCount());
        Node inputScript = jsRootNode.getFirstChild();
        assertTrue(inputScript.isScript());
    }

    @Test
    public void testParseInputs_externAndInput() {
        initCompiler();
        compiler.init(new JSSourceFile[]{JSSourceFile.fromCode("extern.js", "var x;")}, new JSSourceFile[]{JSSourceFile.fromCode("input.js", "var y = 2;")}, options);
        compiler.parse();
        Node root = compiler.getRoot();
        assertNotNull(root);
        assertTrue(root.isSyntheticBlock());
        assertEquals(2, root.getChildCount());
        Node externsRootNode = root.getFirstChild();
        Node jsRootNode = root.getLastChild();
        assertTrue(externsRootNode.isSyntheticBlock());
        assertTrue(jsRootNode.isSyntheticBlock());
        assertEquals(1, externsRootNode.getChildCount());
        assertEquals(1, jsRootNode.getChildCount());
        assertTrue(externsRootNode.getFirstChild().isScript());
        assertTrue(jsRootNode.getFirstChild().isScript());
    }

    @Test
    public void testInitModules_empty() {
        initCompiler();
        JSSourceFile[] externs = {};
        JSModule[] modules = {};
        // Expecting EMPTY_MODULE_LIST_ERROR
        compiler.initModules(Lists.newArrayList(externs), Lists.newArrayList(modules), options);
        assertTrue(compiler.hasErrors());
        assertEquals(1, compiler.getErrorCount());
        assertEquals("JSC_EMPTY_MODULE_LIST_ERROR", compiler.getErrors()[0].getType().toString());
    }

    @Test
    public void testToSource_empty() {
        initCompiler();
        compiler.initModules(Lists.<SourceFile>newArrayList(), Lists.<JSModule>newArrayList(), options);
        compiler.parse(); // Parse to initialize roots
        assertEquals("", compiler.toSource());
    }

    @Test
    public void testToSource_simple() {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{JSSourceFile.fromCode("test.js", "var a = 1;")}, options);
        compiler.parse(); // Parse to initialize roots
        assertEquals("var a=1;", compiler.toSource().trim());
    }

    @Test
    public void testToSourceArray_singleInput() {
        initCompiler();
        JSSourceFile[] inputs = {JSSourceFile.fromCode("test1.js", "var a = 1;")};
        compiler.init(new JSSourceFile[]{}, inputs, options);
        compiler.parse(); // Parse to initialize roots
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
        compiler.parse(); // Parse to initialize roots
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
        compiler.parse(); // Parse to initialize roots
        assertEquals("var z=3;", compiler.toSource(module).trim());
    }

    @Test
    public void testToSourceArray_withModule() {
        initCompiler();
        JSModule module = new JSModule("main");
        module.add(JSSourceFile.fromCode("file1.js", "var a = 1;"));
        module.add(JSSourceFile.fromCode("file2.js", "var b = 2;"));
        compiler.initModules(Lists.newArrayList(), Lists.newArrayList(module), options);
        compiler.parse(); // Parse to initialize roots
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
        // The output for "add(1, 2);" after optimization should be "3;"
        assertEquals("3;", compiler.toSource().trim());
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
        compiler.parse(); // Parse to make source lines available
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
        compiler.parse(); // Parse to make source regions available
        assertNotNull(compiler.getSourceRegion("test.js", 1));
        assertNotNull(compiler.getSourceRegion("test.js", 2));
        assertNotNull(compiler.getSourceRegion("test.js", 3));
        assertNull(compiler.getSourceRegion("test.js", 4));
        assertNull(compiler.getSourceRegion("nonexistent.js", 1));
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
        compiler.parse(); // Parse to initialize externs root
        CompilerInput extern = compiler.newExternInput("myExtern");
        assertNotNull(extern);
        assertTrue(extern.isExtern());
        assertEquals("myExtern", extern.getName());
        assertEquals(1, compiler.getExternsInOrder().size());
        assertEquals(extern, compiler.getExternsInOrder().get(0));
        // Check that the new extern is added to the externsRoot
        assertNotNull(compiler.externsRoot.getLastChild());
        assertTrue(compiler.externsRoot.getLastChild().isScript());
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
        // Before parse, externsRoot and jsRoot are initialized as empty blocks
        assertEquals(2, root.getChildCount());
        assertTrue(root.getFirstChild().isSyntheticBlock());
        assertFalse(root.getFirstChild().hasChildren());
        assertTrue(root.getLastChild().isSyntheticBlock());
        assertFalse(root.getLastChild().hasChildren());
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
        // The compiler automatically adds synthetic code to the jsRoot.
        compiler.parse(); // Ensure jsRoot is initialized
        assertEquals("var x=1;", compiler.toSource().trim());
    }

    @Test
    public void testParseSyntheticCodeWithName() {
        initCompiler();
        Node node = compiler.parseSyntheticCode("myFile.js", "var y = 2;");
        assertNotNull(node);
        assertTrue(node.isScript());
        assertEquals("myFile.js", node.getInputId().getIdName());
        compiler.parse(); // Ensure jsRoot is initialized
        assertEquals("var y=2;", compiler.toSource().trim());
    }

    @Test
    public void testParseTestCode() {
        initCompiler();
        Node node = compiler.parseTestCode("var z = 3;");
        assertNotNull(node);
        assertTrue(node.isScript());
        assertEquals("[testcode]", node.getInputId().getIdName());
        compiler.parse(); // Ensure jsRoot is initialized
        assertEquals("var z=3;", compiler.toSource().trim());
    }

    @Test
    public void testGetAstDotGraph_empty() throws IOException {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options);
        compiler.parse(); // Parse to initialize AST
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
        // The exact output might vary slightly based on AST structure, but checking for key elements.
        assertTrue(dotGraph.contains("\"var a = 1\""));
    }

    @Test
    public void testDisableThreads() {
        initCompiler();
        compiler.disableThreads();
        assertTrue(true); // Method called without error
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
    public void testGetInput_notExists() throws Exception {
        initCompiler();
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options);
        compiler.parse(); // Parse to initialize inputsById
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
        // Must re-initialize options for the new compiler instance.
        CompilerOptions newOptions = new CompilerOptions();
        newOptions.setLanguageIn(options.getLanguageIn()); // Preserve language mode
        newCompiler.initOptions(newOptions);
        newCompiler.setState(state);

        // After setting state, the AST should be available.
        assertNotNull(newCompiler.getRoot());
        assertEquals("var a=1;", newCompiler.toSource().trim());
    }
}
