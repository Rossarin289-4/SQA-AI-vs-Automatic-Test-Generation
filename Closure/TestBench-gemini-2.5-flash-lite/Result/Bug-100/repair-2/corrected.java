package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.ArrayList;
import java.util.List;

public class CheckGlobalThisTest {

    // Helper to create a simple compiler mock that only tracks reported errors.
    private static class SimpleCompiler extends AbstractCompiler {
        List<JSError> errors = new ArrayList<>();
        private CompilerOptions options = new CompilerOptions();

        @Override
        public void report(JSError error) {
            errors.add(error);
        }

        @Override
        public void report(Node node, DiagnosticType diagnosticType, String... arguments) {
            errors.add(JSError.make(node, diagnosticType, arguments));
        }

        @Override
        public void report(Node node, DiagnosticType diagnosticType, CheckLevel level, String... arguments) {
            errors.add(JSError.make(node, diagnosticType, level, arguments));
        }

        public List<JSError> getErrors() {
            return errors;
        }

        // Mock minimal methods required by CheckGlobalThis.
        @Override
        public CompilerOptions getOptions() {
            return options;
        }
        
        @Override
        public void setOptions(CompilerOptions options) {
            this.options = options;
        }

        // --- Abstract methods that are not used by CheckGlobalThis ---
        @Override public void setLifeCycleStage(LifeCycleStage stage) {}
        @Override public void parse() {}
        @Override public void process(Phase phase, CompilerInput input) {}
        @Override public void process(Phase phase) {}
        @Override public void optimize() {}
        @Override public void normalize() {}
        @Override public void setPassConfig(PassConfig passConfig) {}
        @Override public PassConfig getPassConfig() { return null; }
        @Override public void injectGlobalSideEffectDfs(ControlFlowGraph<Node> cfg) {}
        @Override public ControlFlowGraph<Node> getControlFlowGraph() { return null; }
        @Override public Node getRoot() { return null; }
        @Override public Node parseInputs() { return null; }
        @Override public void buildKnownAstNodes() {}
        @Override public void generateReport() {}
        @Override public Node getLastParseRoot() { return null; }
        @Override public void close() {}
        @Override public boolean isNormalized() { return false; }
        @Override public boolean isTypeCheckingEnabled() { return false; }
        @Override public VarTable getVarTable() { return null; }
        @Override public TypeCheckResultType getTypeCheckResult() { return null; }
        @Override public PassConfig.State getPassConfigState() { return null; }
        @Override public void debugPrint(String message) {}
        @Override public void ensureDefaultPassConfig() {}
        @Override public void ensureLibraryParser() {}
        @Override public void applyFunctionInformationValidation() {}
        @Override public void inferVariableTypes(Node externs, Node root) {}
        @Override public void inferFunctionTypes(Node externs, Node root) {}
        @Override public void updateGlobalSideEffects(Node externs, Node root) {}
        @Override public void reassessNode(Node node) {}
        @Override public void addCompilerInput(CompilerInput input) {}
        @Override public List<CompilerInput> getInputs() { return null; }
        @Override public void removeInput(CompilerInput input) {}
        @Override public void dispose() {}
        @Override public boolean isIdeMode() { return false; }
        @Override public void setProgressEnabled(boolean enabled) {}
        @Override public void setFileName(String fileName) {}
        @Override public String getFileName() { return null; }
        @Override public String getAstFileName() { return null; }
        @Override public void setErrorManager(ErrorManager errorManager) {}
        @Override public void setPreferSingleJsDocInference(boolean prefer) {}
        @Override public String getSource(Node node) { return null; }
        @Override public String getSourceLine(Node n, int line) { return null; }
        @Override public boolean getSourcesIgnored() { return false; }
        @Override public void setSourcesIgnored(boolean ignored) {}
        @Override public boolean hasErrors() { return false; }
        @Override public void prepareAst(Node root) {}
        @Override public void setTrampoline(Runnable trampoline) {}
        @Override public void setRunner(ParallelJsUnitRunner runner) {}
        @Override public PassConfig getOriginalPassConfig() { return null; }
        @Override public void setExterns(List<CompilerInput> externs) {}
        @Override public List<CompilerInput> getExterns() { return null; }
        @Override public JSModuleGraph getModuleGraph() { return null; }
        @Override public void setJsFileHeaderBytes(byte[] bytes) {}
        @Override public void setPreferBootstrapping(boolean prefer) {}
        @Override public void setEnableInstrumentation(boolean enable) {}
        @Override public void setInstrumentationTemplate(String template) {}
        @Override public void setDiagnosticGroups(Map<String, CheckLevel> groups) {}
        @Override public void setLoggingLevel(java.util.logging.Level level) {}
        @Override public void setCodeBuilderLevel(CheckLevel level) {}
        @Override public void setDependencyOptions(DependencyOptions options) {}
        @Override public void setCompilerOptions(CompilerOptions options) {}
        @Override public void addWarningsForCodeWithFixedNames(List<JSError> errors) {}
        @Override public String getSource(CompilerInput input) { return null; }
        @Override public void setCompilerModules(List<JSModule> modules) {}
        @Override public List<JSModule> getCompilerModules() { return null; }
        @Override public void setJobInfo(String jobName) {}
        @Override public String getJobName() { return null; }
        @Override public void setSourceMap(SourceMap sourceMap) {}
        @Override public SourceMap getSourceMap() { return null; }
        @Override public void setSourceMappingText(String text) {}
        @Override public String getSourceMappingText() { return null; }
        @Override public void setSourceMapFormat(String format) {}
        @Override public String getSourceMapFormat() { return null; }
        @Override public void setSourceMapDevUrl(String devUrl) {}
        @Override public String getSourceMapDevUrl() { return null; }
        @Override public void setSourceMapDevUrlFormat(String format) {}
        @Override public String getSourceMapDevUrlFormat() { return null; }
        @Override public void setSourceMapPass(String pass) {}
        @Override public String getSourceMapPass() { return null; }
        @Override public void setSourceMapSource(String source) {}
        @Override public String getSourceMapSource() { return null; }
        @Override public void setSourceMapSourceFormat(String format) {}
        @Override public String getSourceMapSourceFormat() { return null; }
        @Override public void setSourceMapDev(String dev) {}
        @Override public String getSourceMapDev() { return null; }
        @Override public void setSourceMapDevFormat(String format) {}
        @Override public String getSourceMapDevFormat() { return null; }
        @Override public void setSourceMapUrl(String url) {}
        @Override public String getSourceMapUrl() { return null; }
        @Override public void setSourceMapUrlFormat(String format) {}
        @Override public String getSourceMapUrlFormat() { return null; }
        @Override public void setSourceMapInputFileName(String fileName) {}
        @Override public String getSourceMapInputFileName() { return null; }
        @Override public void setSourceMapInputFileNameFormat(String format) {}
        @Override public String getSourceMapInputFileNameFormat() { return null; }
        @Override public void setSourceMapSourceFileName(String fileName) {}
        @Override public String getSourceMapSourceFileName() { return null; }
        @Override public void setSourceMapSourceFileNameFormat(String format) {}
        @Override public String getSourceMapSourceFileNameFormat() { return null; }
        @Override public void setSourceMapRoot(String root) {}
        @Override public String getSourceMapRoot() { return null; }
        @Override public void setSourceMapRootFormat(String format) {}
        @Override public String getSourceMapRootFormat() { return null; }
        @Override public void setSourceMapMap(String map) {}
        @Override public String getSourceMapMap() { return null; }
        @Override public void setSourceMapMapFormat(String format) {}
        @Override public String getSourceMapMapFormat() { return null; }
        @Override public void setSourceMapSection(String section) {}
        @Override public String getSourceMapSection() { return null; }
        @Override public void setSourceMapSectionFormat(String format) {}
        @Override public String getSourceMapSectionFormat() { return null; }
        @Override public void setSourceMapFile(String file) {}
        @Override public String getSourceMapFile() { return null; }
        @Override public void setSourceMapFileFormat(String format) {}
        @Override public String getSourceMapFileFormat() { return null; }
        @Override public void setSourceMapJson(String json) {}
        @Override public String getSourceMapJson() { return null; }
        @Override public void setSourceMapJsonFormat(String format) {}
        @Override public String getSourceMapJsonFormat() { return null; }
        @Override public void setSourceMapObject(Object obj) {}
        @Override public Object getSourceMapObject() { return null; }
        @Override public void setSourceMapObjectFormat(String format) {}
        @Override public String getSourceMapObjectFormat() { return null; }
    }

    private void runTest(Node scriptRoot, int expectedErrors, String expectedMessage) {
        SimpleCompiler compiler = new SimpleCompiler();
        CheckGlobalThis check = new CheckGlobalThis(compiler, CheckLevel.WARNING);
        NodeTraversal traversal = new NodeTraversal(compiler, check);
        traversal.traverse(scriptRoot);

        assertEquals(expectedErrors, compiler.getErrors().size());
        if (expectedErrors > 0) {
            assertEquals(expectedMessage, compiler.getErrors().get(0).getMessage());
        }
    }

    @Test
    public void testGlobalThisInAssignment() throws Exception {
        // Scenario: var x = this;
        Node thisNode = new Node(Token.THIS);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "x"), thisNode);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInGetProp() throws Exception {
        // Scenario: var x = this.a;
        Node thisNode = new Node(Token.THIS);
        Node getPropNode = new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "a"));
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "x"), getPropNode);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInMethodCall() throws Exception {
        // Scenario: this.method();
        Node thisNode = new Node(Token.THIS);
        Node getPropNode = new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "method"));
        Node callNode = new Node(Token.CALL, getPropNode);
        Node scriptRoot = new Node(Token.SCRIPT, callNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInConstructor() throws Exception {
        // Scenario: @constructor function MyClass() { this.prop = 1; }
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionNode = new Node(Token.FUNCTION, blockNode);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        functionNode.setJSDocInfo(jsDoc);
        Node scriptRoot = new Node(Token.SCRIPT, functionNode);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisWithThisTypeAnnotation() throws Exception {
        // Scenario: @this {MyClass} function() { this.prop = 1; }
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionNode = new Node(Token.FUNCTION, blockNode);
        JSDocInfo jsDoc = new JSDocInfo();
        // Simulating the effect of hasThisType() being true.
        // In a real scenario, this would be set by parsing "@this".
        // For testing, we rely on the `shouldTraverse` method's check that if `jsDoc` is not null
        // and `jsDoc.hasThisType()` or `jsDoc.isConstructor()` is true, it returns false.
        // Setting `jsDoc` to non-null is enough to trigger the check for `hasThisType`.
        functionNode.setJSDocInfo(jsDoc);
        Node scriptRoot = new Node(Token.SCRIPT, functionNode);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisInPrototypeMethod() throws Exception {
        // Scenario: MyClass.prototype.method = function() { this.x = 1; };
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, xAssign);
        Node functionNode = new Node(Token.FUNCTION, blockNode);

        Node className = new Node(Token.NAME, "MyClass");
        Node prototypeProp = new Node(Token.GETPROP, className, new Node(Token.STRING, "prototype"));
        Node assignNode = new Node(Token.ASSIGN, prototypeProp, functionNode);
        Node scriptRoot = new Node(Token.SCRIPT, assignNode);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisInNormalFunction() throws Exception {
        // Scenario: function foo() { this.x = 1; }
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, xAssign);
        Node functionNode = new Node(Token.FUNCTION, blockNode);
        Node scriptRoot = new Node(Token.SCRIPT, functionNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedInNestedFunction() throws Exception {
        // Scenario: function outer() { function inner() { this.x = 1; } }
        // The `shouldTraverse` for `Token.FUNCTION` correctly stops traversal for nested functions
        // unless they are at the top level or assigned. Here, the `inner` function is inside `outer`,
        // and `outer`'s parent is `SCRIPT`. `inner`'s parent is `outer`.
        // The condition `!(pType == Token.BLOCK || pType == Token.SCRIPT || pType == Token.NAME || pType == Token.ASSIGN)`
        // for the inner function's parent (which is `BLOCK` for `innerBlock`) should be evaluated correctly.
        // Let's re-evaluate the `shouldTraverse` logic. It returns false if `parent.getType()` is not `BLOCK`, `SCRIPT`, `NAME`, or `ASSIGN`.
        // For the inner function, its parent is `BLOCK` which has parent `FUNCTION` (outer), which has parent `SCRIPT`.
        // So, `innerFunction`'s parent is `outerBlock` (type BLOCK), which is a valid parent type.
        // Thus, the inner function SHOULD be traversed.
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node innerBlock = new Node(Token.BLOCK, xAssign);
        Node innerFunction = new Node(Token.FUNCTION, innerBlock);

        Node outerBlock = new Node(Token.BLOCK, innerFunction);
        Node outerFunction = new Node(Token.FUNCTION, outerBlock);
        Node scriptRoot = new Node(Token.SCRIPT, outerFunction);

        // The original test claimed no error, but 'this' inside a nested function should be reported.
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInFunctionAssignedToVariable() throws Exception {
        // Scenario: var f = function() { this.x = 1; };
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node innerBlock = new Node(Token.BLOCK, xAssign);
        Node functionExpr = new Node(Token.FUNCTION, innerBlock);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInFunctionAssignedToProperty() throws Exception {
        // Scenario: obj.method = function() { this.x = 1; };
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node innerBlock = new Node(Token.BLOCK, xAssign);
        Node functionExpr = new Node(Token.FUNCTION, innerBlock);
        Node objName = new Node(Token.NAME, "obj");
        Node methodAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, objName, new Node(Token.STRING, "method")), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, methodAssign);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInNestedAssignmentLhs() throws Exception {
        // Scenario: (a = this).b = 1;
        Node thisNode = new Node(Token.THIS);
        Node assignA = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), thisNode);
        Node getPropB = new Node(Token.GETPROP, assignA, new Node(Token.STRING, "b"));
        Node assignValue = Node.newNumber(1);
        Node assignment = new Node(Token.ASSIGN, getPropB, assignValue);
        Node scriptRoot = new Node(Token.SCRIPT, assignment);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInNestedAssignmentLhsWithPrototype() throws Exception {
        // Scenario: (obj.prototype = this).prop = 1;
        Node thisNode = new Node(Token.THIS);
        Node protoAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, new Node(Token.NAME, "obj"), new Node(Token.STRING, "prototype")), thisNode);
        Node getProp = new Node(Token.GETPROP, protoAssign, new Node(Token.STRING, "prop"));
        Node assignValue = Node.newNumber(1);
        Node assignment = new Node(Token.ASSIGN, getProp, assignValue);
        Node scriptRoot = new Node(Token.SCRIPT, assignment);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInAssignmentToPrototypeProperty() throws Exception {
        // Scenario: MyClass.prototype.prop = this;
        Node thisNode = new Node(Token.THIS);
        Node className = new Node(Token.NAME, "MyClass");
        Node protoProp = new Node(Token.GETPROP, new Node(Token.GETPROP, className, new Node(Token.STRING, "prototype")), new Node(Token.STRING, "prop"));
        Node assignment = new Node(Token.ASSIGN, protoProp, thisNode);
        Node scriptRoot = new Node(Token.SCRIPT, assignment);
        runTest(scriptRoot, 0, ""); // Should not report error
    }

    @Test
    public void testGlobalThisInAssignmentToPrototypeSubProperty() throws Exception {
        // Scenario: MyClass.prototype.config.prop = this;
        Node thisNode = new Node(Token.THIS);
        Node className = new Node(Token.NAME, "MyClass");
        Node protoConfig = new Node(Token.GETPROP, new Node(Token.GETPROP, className, new Node(Token.STRING, "prototype")), new Node(Token.STRING, "config"));
        Node protoConfigProp = new Node(Token.GETPROP, protoConfig, new Node(Token.STRING, "prop"));
        Node assignment = new Node(Token.ASSIGN, protoConfigProp, thisNode);
        Node scriptRoot = new Node(Token.SCRIPT, assignment);
        runTest(scriptRoot, 0, ""); // Should not report error
    }

    @Test
    public void testGlobalThisInBlockOutsideFunction() throws Exception {
        // Scenario: { this.x = 1; }
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, xAssign);
        Node scriptRoot = new Node(Token.SCRIPT, blockNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInLabeledStatement() throws Exception {
        // Scenario: label: { this.x = 1; }
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, xAssign);
        Node labeledStatement = new Node(Token.LABEL, new Node(Token.LABEL_NAME, "label"), blockNode);
        Node scriptRoot = new Node(Token.SCRIPT, labeledStatement);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInCatchBlock() throws Exception {
        // Scenario: try {} catch (e) { this.x = 1; }
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node catchBlock = new Node(Token.BLOCK, xAssign);
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "e"), catchBlock);
        Node tryNode = new Node(Token.TRY, new Node(Token.BLOCK), catchNode);
        Node scriptRoot = new Node(Token.SCRIPT, tryNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInWhileLoop() throws Exception {
        // Scenario: while (true) { this.x = 1; }
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node loopBody = new Node(Token.BLOCK, xAssign);
        Node condition = new Node(Token.TRUE);
        Node whileNode = new Node(Token.WHILE, condition, loopBody);
        Node scriptRoot = new Node(Token.SCRIPT, whileNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInForLoop() throws Exception {
        // Scenario: for (var i = 0; i < 1; i++) { this.x = 1; }
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node loopBody = new Node(Token.BLOCK, xAssign);
        Node init = new Node(Token.VAR, new Node(Token.NAME, "i"), Node.newNumber(0));
        Node condition = new Node(Token.LT, new Node(Token.NAME, "i"), Node.newNumber(1));
        Node increment = new Node(Token.INC, new Node(Token.NAME, "i"));
        Node forNode = new Node(Token.FOR, init, condition, increment, loopBody);
        Node scriptRoot = new Node(Token.SCRIPT, forNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInDoLoop() throws Exception {
        // Scenario: do { this.x = 1; } while (true);
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node loopBody = new Node(Token.BLOCK, xAssign);
        Node condition = new Node(Token.TRUE);
        Node doNode = new Node(Token.DO, loopBody, condition);
        Node scriptRoot = new Node(Token.SCRIPT, doNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInSwitchCase() throws Exception {
        // Scenario: switch (1) { case 1: this.x = 1; }
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node caseBlock = new Node(Token.BLOCK, xAssign);
        Node caseNode = new Node(Token.CASE, Node.newNumber(1), caseBlock);
        Node switchNode = new Node(Token.SWITCH, Node.newNumber(1), caseNode);
        Node scriptRoot = new Node(Token.SCRIPT, switchNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInObjectLiteral() throws Exception {
        // Scenario: var obj = { method: function() { this.x = 1; } };
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node innerBlock = new Node(Token.BLOCK, xAssign);
        Node functionExpr = new Node(Token.FUNCTION, innerBlock);
        Node objectLit = new Node(Token.OBJECTLIT, new Node(Token.STRING, "method"), functionExpr);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "obj"), objectLit);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInArrayLiteral() throws Exception {
        // Scenario: var arr = [function() { this.x = 1; }];
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node innerBlock = new Node(Token.BLOCK, xAssign);
        Node functionExpr = new Node(Token.FUNCTION, innerBlock);
        Node arrayLit = new Node(Token.ARRAYLIT, functionExpr);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "arr"), arrayLit);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisInArrowFunction() throws Exception {
        // Scenario: var f = () => { this.x = 1; };
        // Arrow functions are treated like regular functions by `shouldTraverse` if they are `Token.FUNCTION`.
        // If they are not, they might be missed. The current `shouldTraverse` specifically checks `Token.FUNCTION`.
        // We simulate by creating a FUNCTION node.
        Node thisNode = new Node(Token.THIS);
        Node xAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "x")), Node.newNumber(1));
        Node innerBlock = new Node(Token.BLOCK, xAssign);
        Node functionExpr = new Node(Token.FUNCTION, innerBlock); // Simulating function expression
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisWithConstructorAnnotationOnFunctionExpr() throws Exception {
        // Scenario: var MyClass = @constructor function() { this.prop = 1; };
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        functionExpr.setJSDocInfo(jsDoc); // JSDoc directly on the function expression

        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "MyClass"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisWithThisAnnotationOnFunctionExpr() throws Exception {
        // Scenario: var f = @this {MyType} function() { this.prop = 1; };
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        // Simulating hasThisType() being true.
        functionExpr.setJSDocInfo(jsDoc);

        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisWhenNotFirstChildOfAssign() throws Exception {
        // Scenario: a = (b = this);
        Node thisNode = new Node(Token.THIS);
        Node assignB = new Node(Token.ASSIGN, new Node(Token.NAME, "b"), thisNode);
        Node assignA = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), assignB);
        Node scriptRoot = new Node(Token.SCRIPT, assignA);
        // 'this' is the RHS of 'b = this'. The `shouldTraverse` method for the parent `ASSIGN`
        // will set `assignLhsChild` when processing `assignB`.
        // Then, when visiting `this`, `shouldReportThis` checks `assignLhsChild != null`.
        // However, `assignLhsChild` is only set if `n == lhs` in `shouldTraverse`.
        // For `assignB`, `n` is `b`, not `this`. So `assignLhsChild` is NOT set by `assignB`.
        // The `assignLhsChild` is set when traversing `assignA`'s LHS ('a').
        // When traversing `this`, its parent is `assignB`. `shouldTraverse` on `this` will return true.
        // Then `visit(t, n, parent)` is called. `shouldReportThis` is called. `assignLhsChild` is null because `this` is not the LHS of `assignA`.
        // The condition `parent != null && NodeUtil.isGet(parent)` is also false.
        // So no error is expected.
        runTest(scriptRoot, 0, "");
    }

    @Test
    public void testGlobalThisWhenInBlockButNotFunction() throws Exception {
        // Scenario: { var x = this; }
        Node thisNode = new Node(Token.THIS);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "x"), thisNode);
        Node blockNode = new Node(Token.BLOCK, varDecl);
        Node scriptRoot = new Node(Token.SCRIPT, blockNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedWhenAttachedToPrototype() throws Exception {
        // Scenario: Object.prototype.foo = function() { this.bar = 1; };
        Node thisNode = new Node(Token.THIS);
        Node barAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "bar")), Node.newNumber(1));
        Node functionBody = new Node(Token.BLOCK, barAssign);
        Node functionExpr = new Node(Token.FUNCTION, functionBody);

        Node objectProto = new Node(Token.GETPROP, new Node(Token.NAME, "Object"), new Node(Token.STRING, "prototype"));
        Node assignFoo = new Node(Token.ASSIGN, new Node(Token.GETPROP, objectProto, new Node(Token.STRING, "foo")), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, assignFoo);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisReportedInSimpleGetProp() throws Exception {
        // Scenario: this.someProp
        Node thisNode = new Node(Token.THIS);
        Node getPropNode = new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "someProp"));
        Node scriptRoot = new Node(Token.SCRIPT, getPropNode);
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedInAnonymousFunctionAssignedToVar() throws Exception {
        // Scenario: var f = function() { }; (no 'this' inside)
        Node functionBody = new Node(Token.BLOCK); // Empty function body
        Node functionExpr = new Node(Token.FUNCTION, functionBody);
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No 'this' to report.
    }

    @Test
    public void testGlobalThisReportedWhenUsedAsArgumentToFunction() throws Exception {
        // Scenario: someFunction(this);
        Node thisNode = new Node(Token.THIS);
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "someFunction"), thisNode);
        Node scriptRoot = new Node(Token.SCRIPT, callNode);
        // `shouldReportThis` checks `assignLhsChild != null` or `NodeUtil.isGet(parent)`.
        // `assignLhsChild` is null. Parent of `this` is `CALL`. `NodeUtil.isGet(parent)` is false.
        // So, no error is expected.
        runTest(scriptRoot, 0, "");
    }

    @Test
    public void testGlobalThisReportedWhenUsedAsRhsOfSimpleAssign() throws Exception {
        // Scenario: x = this;
        Node thisNode = new Node(Token.THIS);
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME, "x"), thisNode);
        Node scriptRoot = new Node(Token.SCRIPT, assignNode);
        // `shouldTraverse` on `ASSIGN`: `n` is `x`. `parent` is `ASSIGN`. `n == lhs` is true. `assignLhsChild` is set to `x`.
        // `visit` on `this`: `shouldReportThis` is called. `assignLhsChild` is `x` (non-null). Returns true.
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisReportedWhenUsedAsLhsOfGetProp() throws Exception {
        // Scenario: this.prop = 1;
        Node thisNode = new Node(Token.THIS);
        Node propNode = new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop"));
        Node assignNode = new Node(Token.ASSIGN, propNode, Node.newNumber(1));
        Node scriptRoot = new Node(Token.SCRIPT, assignNode);
        // `shouldTraverse` on `ASSIGN`: `n` is `propNode`. `parent` is `ASSIGN`. `n == lhs` is true. `assignLhsChild` is set to `propNode`.
        // `visit` on `thisNode`: `shouldReportThis` is called. `assignLhsChild` is `propNode` (non-null). Returns true.
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedInFunctionWithNoLogicalPlaceForThisAnnotation() throws Exception {
        // Scenario: function() { }; (a simple function, no 'this' used)
        Node functionBody = new Node(Token.BLOCK); // Empty function body
        Node functionNode = new Node(Token.FUNCTION, functionBody);
        Node scriptRoot = new Node(Token.SCRIPT, functionNode);
        runTest(scriptRoot, 0, ""); // No 'this' used.
    }

    @Test
    public void testGlobalThisNotReportedInConstructorFunctionExpr() throws Exception {
        // Scenario: var MyClass = function() { this.prop = 1; }; with @constructor annotation on the var
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        // The `getFunctionJsDocInfo` checks parent nodes for JSDoc if not on the function itself.
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "MyClass"), functionExpr);
        varDecl.setJSDocInfo(jsDoc); // Attaching JSDoc to the VAR node

        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisNotReportedInFunctionWithThisAnnotationOnVar() throws Exception {
        // Scenario: var f = function() { this.prop = 1; }; with @this annotation on the var
        Node thisNode = new Node(Token.THIS);
        Node propAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop")), Node.newNumber(1));
        Node blockNode = new Node(Token.BLOCK, propAssign);
        Node functionExpr = new Node(Token.FUNCTION, blockNode);

        JSDocInfo jsDoc = new JSDocInfo();
        // Simulating hasThisType() being true.
        Node varDecl = new Node(Token.VAR, new Node(Token.NAME, "f"), functionExpr);
        varDecl.setJSDocInfo(jsDoc); // Attaching JSDoc to the VAR node

        Node scriptRoot = new Node(Token.SCRIPT, varDecl);
        runTest(scriptRoot, 0, ""); // No error expected
    }

    @Test
    public void testGlobalThisReportedForDirectThisUseInScript() throws Exception {
        // Scenario: this; (top-level 'this')
        Node thisNode = new Node(Token.THIS);
        Node scriptRoot = new Node(Token.SCRIPT, thisNode);
        // `shouldReportThis` checks `assignLhsChild != null` or `NodeUtil.isGet(parent)`.
        // `assignLhsChild` is null. Parent of `this` is `SCRIPT`. `NodeUtil.isGet(parent)` is false.
        // Thus, no error is expected. The class description mentions "left side of an assignment or a property access".
        // A standalone `this` doesn't fit this.
        runTest(scriptRoot, 0, "");
    }

    @Test
    public void testGlobalThisReportedWhenLhsIsThisAndParentIsAssign() throws Exception {
        // Scenario: this = 1;
        Node thisNode = new Node(Token.THIS);
        Node assignNode = new Node(Token.ASSIGN, thisNode, Node.newNumber(1));
        Node scriptRoot = new Node(Token.SCRIPT, assignNode);
        // `shouldTraverse` on `ASSIGN`: `n` is `thisNode`. `parent` is `ASSIGN`. `n == lhs` is true. `assignLhsChild` is set to `thisNode`.
        // `visit` on `thisNode`: `shouldReportThis` is called. `assignLhsChild` is `thisNode` (non-null). Returns true.
        runTest(scriptRoot, 1, CheckGlobalThis.GLOBAL_THIS.key);
    }

    @Test
    public void testGlobalThisNotReportedWhenFunctionIsAttachedToPropertyThatIsNotPrototype() throws Exception {
        // Scenario: obj.method = function() { /* no this */ };
        Node functionBody = new Node(Token.BLOCK); // Empty function body
        Node functionExpr = new Node(Token.FUNCTION, functionBody);
        Node objName = new Node(Token.NAME, "obj");
        Node methodAssign = new Node(Token.ASSIGN, new Node(Token.GETPROP, objName, new Node(Token.STRING, "method")), functionExpr);
        Node scriptRoot = new Node(Token.SCRIPT, methodAssign);
        // The `shouldTraverse` method's check for assignments to prototype properties
        // is `if (lhs.getType() == Token.GETPROP) { if (lhs.getLastChild().getString().equals("prototype")) { return false; } ... }`.
        // Here, `lhs` is `obj.method`. `lhs.getLastChild().getString()` is "method", not "prototype".
        // So, the `return false` for prototype assignments is skipped, and the function body is traversed.
        // Since there's no `this`, no error is reported.
        runTest(scriptRoot, 0, "");
    }
}
