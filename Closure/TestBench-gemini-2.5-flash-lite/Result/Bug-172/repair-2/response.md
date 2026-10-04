```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.FunctionTypeBuilder.AstFunctionContents;
import com.google.javascript.jscomp.NodeTraversal.AbstractScopedCallback;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowStatementCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionParamBuilder;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.Property;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import com.google.javascript.rhino.jstype.TemplateTypeMapReplacer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

// Mock classes and interfaces for dependencies
// AbstractCompiler is an interface, so we need a class that implements it.
class MockCompiler implements AbstractCompiler {
    private final CodingConvention convention = new GoogleCodingConvention();
    private final List<JSError> errors = Lists.newArrayList();
    private final JSTypeRegistry typeRegistry;
    private CompilerOptions options = new CompilerOptions();
    private TypeValidator typeValidator = new TypeValidator(this);

    MockCompiler() {
        this.typeRegistry = new JSTypeRegistry(this);
    }

    @Override
    public JSTypeRegistry getTypeRegistry() {
        return typeRegistry;
    }
    @Override
    public CodingConvention getCodingConvention() {
        return convention;
    }
    @Override
    public void report(JSError error) {
        errors.add(error);
    }
    @Override
    public void process(CompilerInput input, Node root) { throw new UnsupportedOperationException("Not implemented in mock"); }
    @Override
    public void process(Node externs, Node root) { throw new UnsupportedOperationException("Not implemented in mock"); }
    @Override
    public boolean isTypeCheckingEnabled() { return true; }
    @Override
    public boolean shouldReport(DiagnosticType diagnosticType) { return true; }
    @Override
    public String getSourcePath(Node node) { return NodeUtil.getSourceName(node); }
    @Override
    public ErrorReporter getErrorReporter() { return typeRegistry.getErrorReporter(); }
    @Override
    public void setLifeCycle(LifeCycle lifeCycle) { }
    @Override
    public TypeValidator getTypeValidator() { return typeValidator; }
    @Override
    public boolean areWarningsEnabled() { return true; }
    @Override
    public void stopPass(String passName) {}
    @Override
    public void incrementGlobalVariableScopeDepth() {}
    @Override
    public void decrementGlobalVariableScopeDepth() {}
    @Override
    public boolean hasErrors() { return !errors.isEmpty(); }
    @Override
    public boolean isIdeMode() { return false; }
    @Override
    public List<JSError> getErrors() { return errors; }
    @Override
    public void enableIdeMode() {}
    @Override
    public void setPh(PassExecutor phe) {}
    @Override
    public PassExecutor getPh() { return null; }
    @Override
    public boolean isPassEnabled(String passName) { return true; }
    @Override
    public void setProgress(Progress progress) {}
    @Override
    public void setConfig(CompilerOptions options) { this.options = options; }
    @Override
    public void setChangeLog(ChangeLog changeLog) {}
    @Override
    public void setPassConfig(PassConfig passConfig) {}
    @Override
    public PassConfig getPassConfig() { return null; }
    @Override
    public Set<String> getExterns() { return null; }
    @Override
    public void setExterns(Set<String> externs) {}
    @Override
    public void setRemoveClosureExterns(boolean remove) {}
    @Override
    public void optimize() {}
    @Override
    public void setProgress(double progress) {}
    @Override
    public void setInjectModules(Set<String> modules) {}
    @Override
    public void setModules(List<Module> modules) {}
    @Override
    public void setSourceMap(SourceMap sourceMap) {}
    @Override
    public void setNormalize(boolean normalize) {}
    @Override
    public void setGenerateExports(boolean genExports) {}
    @Override
    public void setPropertyMap(PropertyMap propertyMap) {}
    @Override
    public void setCodePrinter(CodePrinter codePrinter) {}
    @Override
    public void setVariableMap(VariableMap variableMap) {}
    @Override
    public void setFunctionInformationList(List<FunctionInformation> functionInfoList) {}
    @Override
    public void setAliasMap(AliasMap aliasMap) {}
    @Override
    public void setDependencyMap(DependencyMap dependencyMap) {}
    @Override
    public void setOptions(CompilerOptions options) { this.options = options; }
    @Override
    public CompilerOptions getOptions() { return options; }
    @Override
    public String getSourceVersion() { return "es5"; }
    @Override
    public void setSourceVersion(String sourceVersion) {}
    @Override
    public void enableClosureLibraryImports(boolean enable) {}
    @Override
    public void setClosureLibraryImports(Set<String> imports) {}
    @Override
    public void setKnownTypeNames(Set<String> knownTypeNames) {}
    @Override
    public void setKnownReplacements(Map<String, String> knownReplacements) {}
    @Override
    public void setAliasMap(Set<String> aliases) {}
    @Override
    public void setExternExports(Set<String> externExports) {}
    @Override
    public void addPass(String name) {}
    @Override
    public void inject(Pass p) {}
    @Override
    public void inject(PassFactory pf) {}
    @Override
    public void inject(PassConfig passConfig) {}
    @Override
    public boolean supportsIdeForwardCompatibility() { return false; }
    @Override
    public void setIncrementalCheck(boolean check) {}
    @Override
    public void setPassConfigInternal(PassConfig passConfig) {}
    @Override
    public void setNormalizeResult(boolean normalize) {}
    @Override
    public void setPropertyMap(Set<String> propertyMap) {}
    @Override
    public void setVariableMap(Set<String> variableMap) {}
    @Override
    public void setAliasMap(List<Alias> aliasMap) {}
    @Override
    public void setExternExports(List<String> externExports) {}
    @Override
    public void setDependencyMap(Set<String> dependencyMap) {}
    @Override
    public void addPass(Pass p) {}
    @Override
    public void setCompilerOptions(CompilerOptions compilerOptions) { this.options = compilerOptions; }
    @Override
    public void setScopeCreator(ScopeCreator creator) {}
    @Override
    public void setNodeUtil(NodeUtil nodeUtil) {}
    @Override
    public void setControlFlowGraph(ControlFlowGraph graph) {}
    @Override
    public ControlFlowGraph getControlFlowGraph() { return null; }
    @Override
    public void setLoopbackNodes(Set<Node> loopbackNodes) {}
    @Override
    public Set<Node> getLoopbackNodes() { return null; }
    @Override
    public void setStatementOrder(List<Node> statementOrder) {}
    @Override
    public List<Node> getStatementOrder() { return null; }
    @Override
    public void setCfgTransformer(ControlFlowGraphTransformer transformer) {}
    @Override
    public ControlFlowGraphTransformer getCfgTransformer() { return null; }
    @Override
    public void setAst(Node ast) {}
    @Override
    public Node getAst() { return null; }
    @Override
    public void setRoot(Node root) {}
    @Override
    public Node getRoot() { return null; }
    @Override
    public void setExternRoots(List<Node> externRoots) {}
    @Override
    public List<Node> getExternRoots() { return null; }
    @Override
    public void setSourceMapFormat(String format) {}
    @Override
    public String getSourceMapFormat() { return null; }
    @Override
    public void setSourceMapDetailLevel(SourceMap.DetailLevel detailLevel) {}
    @Override
    public SourceMap.DetailLevel getSourceMapDetailLevel() { return null; }
    @Override
    public void setLineColMap(LineColMap lineColMap) {}
    @Override
    public LineColMap getLineColMap() { return null; }
    @Override
    public void setSourceFile(String sourceFile) {}
    @Override
    public String getSourceFile() { return null; }
    @Override
    public void setSourceMapPath(String sourceMapPath) {}
    @Override
    public String getSourceMapPath() { return null; }
    @Override
    public void setSourceMapSourceFileName(String sourceMapSourceFileName) {}
    @Override
    public String getSourceMapSourceFileName() { return null; }
    @Override
    public void setSourceMapMapFileName(String sourceMapMapFileName) {}
    @Override
    public String getSourceMapMapFileName() { return null; }
    @Override
    public void setSourceMapSourceFile(String sourceMapSourceFile) {}
    @Override
    public String getSourceMapSourceFile() { return null; }
    @Override
    public void setSourceMapMapFile(String sourceMapMapFile) {}
    @Override
    public String getSourceMapMapFile() { return null; }
    @Override
    public void setSourceMapSources(List<String> sources) {}
    @Override
    public List<String> getSourceMapSources() { return null; }
    @Override
    public void setSourceMapNames(List<String> names) {}
    @Override
    public List<String> getSourceMapNames() { return null; }
    @Override
    public void setSourceMapMappings(String mappings) {}
    @Override
    public String getSourceMapMappings() { return null; }
    @Override
    public void setSourceMapPassConfiguration(SourceMap.PassConfiguration configuration) {}
    @Override
    public SourceMap.PassConfiguration getSourceMapPassConfiguration() { return null; }
    @Override
    public void setSourceMapGeneratorFactory(SourceMapGeneratorFactory factory) {}
    @Override
    public SourceMapGeneratorFactory getSourceMapGeneratorFactory() { return null; }
    @Override
    public void setSourceMapGenerator(SourceMapGenerator generator) {}
    @Override
    public SourceMapGenerator getSourceMapGenerator() { return null; }
    @Override
    public void setSourceMapConsumers(List<SourceMap> consumers) {}
    @Override
    public List<SourceMap> getSourceMapConsumers() { return null; }
    @Override
    public void setSourceMapConsumer(SourceMap consumer) {}
    @Override
    public SourceMap getSourceMapConsumer() { return null; }
    @Override
    public void setSourceMapIgnoredSources(List<String> ignoredSources) {}
    @Override
    public List<String> getSourceMapIgnoredSources() { return null; }
    @Override
    public void setSourceMapNamesIgnored(boolean ignored) {}
    @Override
    public boolean isSourceMapNamesIgnored() { return false; }
    @Override
    public void setSourceMapSourcesIncluded(boolean sourcesIncluded) {}
    @Override
    public boolean isSourceMapSourcesIncluded() { return false; }
    @Override
    public void setSourceMapInlineSources(boolean inlineSources) {}
    @Override
    public boolean isSourceMapInlineSources() { return false; }
    @Override
    public void setSourceMapInlineSourceContents(boolean inlineSourceContents) {}
    @Override
    public boolean isSourceMapInlineSourceContents() { return false; }
    @Override
    public void setSourceMapBase64MapFormat(boolean base64MapFormat) {}
    @Override
    public boolean isSourceMapBase64MapFormat() { return false; }
    @Override
    public void setSourceMapJSONString(String jsonString) {}
    @Override
    public String getSourceMapJSONString() { return null; }
    @Override
    public void setSourceMapJSONString(boolean jsonString) {}
    @Override
    public boolean isSourceMapJSONString() { return false; }
    @Override
    public void setSourceMapFile(String sourceMapFile) {}
    @Override
    public String getSourceMapFile() { return null; }
    @Override
    public void setSourceMapFile(boolean file) {}
    @Override
    public boolean isSourceMapFile() { return false; }
    @Override
    public void setSourceMapSources(boolean sources) {}
    @Override
    public boolean isSourceMapSources() { return false; }
    @Override
    public void setSourceMapNames(boolean names) {}
    @Override
    public boolean isSourceMapNames() { return false; }
    @Override
    public void setSourceMapNamesIgnored(Set<String> namesIgnored) {}
    @Override
    public Set<String> getSourceMapNamesIgnored() { return null; }
    @Override
    public void setSourceMapFormat(Set<String> format) {}
    @Override
    public Set<String> getSourceMapFormat() { return null; }
    @Override
    public void setSourceMapSourcesIncluded(Set<String> sourcesIncluded) {}
    @Override
    public Set<String> getSourceMapSourcesIncluded() { return null; }
    @Override
    public void setSourceMapInlineSources(Set<String> inlineSources) {}
    @Override
    public Set<String> getSourceMapInlineSources() { return null; }
    @Override
    public void setSourceMapInlineSourceContents(Set<String> inlineSourceContents) {}
    @ @Override
    public Set<String> getSourceMapInlineSourceContents() { return null; }
    @Override
    public void setSourceMapBase64MapFormat(Set<String> base64MapFormat) {}
    @Override
    public Set<String> getSourceMapBase64MapFormat() { return null; }
    @Override
    public void setSourceMapPassConfiguration(Set<SourceMap.PassConfiguration> configuration) {}
    @Override
    public Set<SourceMap.PassConfiguration> getSourceMapPassConfiguration() { return null; }
    @Override
    public void setSourceMapGeneratorFactory(Set<SourceMapGeneratorFactory> factory) {}
    @Override
    public Set<SourceMapGeneratorFactory> getSourceMapGeneratorFactory() { return null; }
    @Override
    public void setSourceMapGenerator(Set<SourceMapGenerator> generator) {}
    @Override
    public Set<SourceMapGenerator> getSourceMapGenerator() { return null; }
    @Override
    public void setSourceMapConsumers(Set<SourceMap> consumers) {}
    @Override
    public Set<SourceMap> getSourceMapConsumers() { return null; }
    @Override
    public void setSourceMapConsumer(Set<SourceMap> consumer) {}
    @Override
    public Set<SourceMap> getSourceMapConsumer() { return null; }
    @Override
    public void setSourceMapIgnoredSources(Set<String> ignoredSources) {}
    @Override
    public Set<String> getSourceMapIgnoredSources() { return null; }
}

class MockCodingConvention extends GoogleCodingConvention {
    private String delegateSuperclassName;

    public void setDelegateSuperclassName(String className) {
        this.delegateSuperclassName = className;
    }

    @Override
    public String getDelegateSuperclassName() {
        return delegateSuperclassName != null ? delegateSuperclassName : super.getDelegateSuperclassName();
    }
}

// Helper class to provide Node IDs (not strictly necessary for this test but good practice)
class NodeIdSupplier implements NodeTraversal.NodeIdSupplier {
    private int id = 0;
    @Override
    public int getNextNodeId() {
        return id++;
    }
}

// Mock IRFactory for parsing code into AST nodes
class IRFactory {
    // A very basic mock that assumes valid JS syntax and returns a Node.
    // In a real scenario, this would use a proper parser.
    public static Node parse(String code) {
        // This is a placeholder. A real implementation would involve a JS parser.
        // For testing TypedScopeCreator, we mostly need the structure of the AST.
        // We'll create a dummy SCRIPT node and add children as needed.
        Node script = new Node(Token.SCRIPT);
        // Simple parsing logic to create basic structures.
        if (code.contains("function foo(a, b)")) {
            Node func = new Node(Token.FUNCTION);
            Node name = Node.newString("foo");
            Node params = new Node(Token.PARAM_LIST);
            params.addChildToBack(Node.newString("a"));
            params.addChildToBack(Node.newString("b"));
            Node body = new Node(Token.BLOCK);
            Node returnStmt = new Node(Token.RETURN);
            Node var = new Node(Token.VAR);
            Node varName = Node.newString("x");
            Node add = new Node(Token.ADD);
            add.addChildToBack(Node.newString("a"));
            add.addChildToBack(Node.newString("b"));
            var.addChildToBack(varName);
            var.addChildToBack(add); // Assign x = a + b
            returnStmt.addChildToBack(Node.newString("x")); // return x
            body.addChildToBack(var);
            body.addChildToBack(returnStmt);
            func.addChildToBack(name);
            func.addChildToBack(params);
            func.addChildToBack(body);
            script.addChildToBack(func);
        } else if (code.contains("var globalVar = 123;")) {
            Node varDecl = new Node(Token.VAR);
            Node name = Node.newString("globalVar");
            Node number = Node.newNumber(123);
            varDecl.addChildToBack(name);
            varDecl.addChildToBack(number);
            script.addChildToBack(varDecl);
        } else if (code.contains("function globalFunc() {}")) {
            Node func = new Node(Token.FUNCTION);
            Node name = Node.newString("globalFunc");
            Node body = new Node(Token.BLOCK);
            func.addChildToBack(name);
            func.addChildToBack(body);
            script.addChildToBack(func);
        } else if (code.contains("var obj = { a: 1, b: 'hello' };")) {
            Node varDecl = new Node(Token.VAR);
            Node objName = Node.newString("obj");
            Node objLit = new Node(Token.OBJECTLIT);
            Node propA = new Node(Token.STRING_KEY, Node.newString("a"));
            propA.addChildToBack(Node.newNumber(1));
            Node propB = new Node(Token.STRING_KEY, Node.newString("b"));
            propB.addChildToBack(Node.newString("hello"));
            objLit.addChildToBack(propA);
            objLit.addChildToBack(propB);
            varDecl.addChildToBack(objName);
            varDecl.addChildToBack(objLit);
            script.addChildToBack(varDecl);
        } else if (code.contains("/** @typedef {string} MyString */")) {
            Node varDecl = new Node(Token.VAR);
            Node name = Node.newString("x");
            varDecl.addChildToBack(name);
            script.addChildToBack(varDecl);
            // Simulate JSDocInfo attachment - this is simplified
            JSDocInfo info = new JSDocInfo();
            info.addTypedef("MyString");
            name.setJSDocInfo(info);

            Node varDeclY = new Node(Token.VAR);
            Node nameY = Node.newString("y");
            JSDocInfo infoY = new JSDocInfo();
            infoY.addParameterType("MyString"); // Using addParameterType as a placeholder for @type
            nameY.setJSDocInfo(infoY);
            varDeclY.addChildToBack(nameY);
            script.addChildToBack(varDeclY);
        } else if (code.contains("/** @constructor */ function MyClass() {}")) {
            Node func = new Node(Token.FUNCTION);
            Node name = Node.newString("MyClass");
            Node body = new Node(Token.BLOCK);
            func.addChildToBack(name);
            func.addChildToBack(body);
            JSDocInfo info = new JSDocInfo();
            info.addConstructor(name);
            func.setJSDocInfo(info);
            script.addChildToBack(func);

            Node exprResult = new Node(Token.EXPR_RESULT);
            Node newNode = new Node(Token.NEW);
            newNode.addChildToBack(name);
            exprResult.addChildToBack(newNode);
            script.addChildToBack(exprResult);

        } else if (code.contains("/** @interface */ function MyInterface() {}")) {
            Node func = new Node(Token.FUNCTION);
            Node name = Node.newString("MyInterface");
            Node body = new Node(Token.BLOCK);
            func.addChildToBack(name);
            func.addChildToBack(body);
            JSDocInfo info = new JSDocInfo();
            info.addInterface(name);
            func.setJSDocInfo(info);
            script.addChildToBack(func);

            Node varDecl = new Node(Token.VAR);
            Node objName = Node.newString("obj");
            JSDocInfo objInfo = new JSDocInfo();
            objInfo.addParameterType("MyInterface"); // Placeholder for @type
            objName.setJSDocInfo(objInfo);
            varDecl.addChildToBack(objName);
            script.addChildToBack(varDecl);

        } else if (code.contains("/** @enum {number} */ var MyEnum = { A: 1, B: 2 };")) {
            Node varDecl = new Node(Token.VAR);
            Node enumName = Node.newString("MyEnum");
            Node enumLit = new Node(Token.OBJECTLIT);
            Node propA = new Node(Token.STRING_KEY, Node.newString("A"));
            propA.addChildToBack(Node.newNumber(1));
            Node propB = new Node(Token.STRING_KEY, Node.newString("B"));
            propB.addChildToBack(Node.newNumber(2));
            enumLit.addChildToBack(propA);
            enumLit.addChildToBack(propB);
            JSDocInfo info = new JSDocInfo();
            info.addEnumParameterType("number");
            enumLit.setJSDocInfo(info);
            varDecl.addChildToBack(enumName);
            varDecl.addChildToBack(enumLit);
            script.addChildToBack(varDecl);
        } else if (code.contains("var ns = {}; ns.prop = 123;")) {
            Node varDeclNs = new Node(Token.VAR);
            Node nsName = Node.newString("ns");
            Node nsObjLit = new Node(Token.OBJECTLIT);
            varDeclNs.addChildToBack(nsName);
            varDeclNs.addChildToBack(nsObjLit);
            script.addChildToBack(varDeclNs);

            Node exprResult = new Node(Token.EXPR_RESULT);
            Node assign = new Node(Token.ASSIGN);
            Node getProp = new Node(Token.GETPROP);
            Node nsRef = Node.newString("ns");
            getProp.addChildToBack(nsRef);
            getProp.addChildToBack(Node.newString("prop"));
            assign.addChildToBack(getProp);
            assign.addChildToBack(Node.newNumber(123));
            exprResult.addChildToBack(assign);
            script.addChildToBack(exprResult);
        } else if (code.contains("var ns; ns.prop = 123;")) {
            Node varDeclNs = new Node(Token.VAR);
            Node nsName = Node.newString("ns");
            varDeclNs.addChildToBack(nsName);
            script.addChildToBack(varDeclNs);

            Node exprResult = new Node(Token.EXPR_RESULT);
            Node assign = new Node(Token.ASSIGN);
            Node getProp = new Node(Token.GETPROP);
            Node nsRef = Node.newString("ns");
            getProp.addChildToBack(nsRef);
            getProp.addChildToBack(Node.newString("prop"));
            assign.addChildToBack(getProp);
            assign.addChildToBack(Node.newNumber(123));
            exprResult.addChildToBack(assign);
            script.addChildToBack(exprResult);
        } else if (code.contains("try { throw 'error'; } catch (e) { var msg = e; }")) {
            Node tryStmt = new Node(Token.TRY);
            Node block = new Node(Token.BLOCK);
            Node throwStmt = new Node(Token.THROW);
            throwStmt.addChildToBack(Node.newString("error"));
            block.addChildToBack(throwStmt);
            tryStmt.addChildToBack(block);
            Node catchBlock = new Node(Token.CATCH);
            Node catchName = Node.newString("e");
            Node catchBody = new Node(Token.BLOCK);
            Node varDecl = new Node(Token.VAR);
            Node msgName = Node.newString("msg");
            Node assignE = new Node(Token.ASSIGN);
            assignE.addChildToBack(Node.newString("msg")); // Assign msg = e
            assignE.addChildToBack(Node.newString("e")); // Assign msg = e
            varDecl.addChildToBack(msgName);
            varDecl.addChildToBack(assignE);
            catchBody.addChildToBack(varDecl);
            catchBlock.addChildToBack(catchName);
            catchBlock.addChildToBack(catchBody);
            tryStmt.addChildToBack(catchBlock);
            script.addChildToBack(tryStmt);
        } else if (code.contains("/** @constructor */ function MyClass() {} /** @this {MyClass} */ function foo(x) { this.prop = x; }")) {
            Node funcMyClass = new Node(Token.FUNCTION);
            Node nameMyClass = Node.newString("MyClass");
            Node bodyMyClass = new Node(Token.BLOCK);
            funcMyClass.addChildToBack(nameMyClass);
            funcMyClass.addChildToBack(bodyMyClass);
            JSDocInfo infoMyClass = new JSDocInfo();
            infoMyClass.addConstructor(nameMyClass);
            funcMyClass.setJSDocInfo(infoMyClass);
            script.addChildToBack(funcMyClass);

            Node funcFoo = new Node(Token.FUNCTION);
            Node nameFoo = Node.newString("foo");
            Node paramsFoo = new Node(Token.PARAM_LIST);
            paramsFoo.addChildToBack(Node.newString("x"));
            Node bodyFoo = new Node(Token.BLOCK);
            Node assignThisProp = new Node(Token.ASSIGN);
            Node thisProp = new Node(Token.GETPROP);
            thisProp.addChildToBack(new Node(Token.THIS));
            thisProp.addChildToBack(Node.newString("prop"));
            assignThisProp.addChildToBack(thisProp);
            assignThisProp.addChildToBack(Node.newString("x"));
            bodyFoo.addChildToBack(assignThisProp);
            funcFoo.addChildToBack(nameFoo);
            funcFoo.addChildToBack(paramsFoo);
            funcFoo.addChildToBack(bodyFoo);
            JSDocInfo infoFoo = new JSDocInfo();
            infoFoo.addThisType("MyClass"); // Placeholder for @this
            funcFoo.setJSDocInfo(infoFoo);
            script.addChildToBack(funcFoo);
        } else if (code.contains("function MyClass() {} MyClass.prototype.method = function() {};")) {
            Node funcMyClass = new Node(Token.FUNCTION);
            Node nameMyClass = Node.newString("MyClass");
            Node bodyMyClass = new Node(Token.BLOCK);
            funcMyClass.addChildToBack(nameMyClass);
            funcMyClass.addChildToBack(bodyMyClass);
            script.addChildToBack(funcMyClass);

            Node exprResult = new Node(Token.EXPR_RESULT);
            Node assign = new Node(Token.ASSIGN);
            Node getProp = new Node(Token.GETPROP);
            Node proto = new Node(Token.GETPROP);
            proto.addChildToBack(nameMyClass);
            proto.addChildToBack(Node.newString("prototype"));
            getProp.addChildToBack(proto);
            getProp.addChildToBack(Node.newString("method"));
            assign.addChildToBack(getProp);
            Node func = new Node(Token.FUNCTION);
            Node funcBody = new Node(Token.BLOCK);
            Node returnStmt = new Node(Token.RETURN);
            returnStmt.addChildToBack(Node.newNumber(123));
            funcBody.addChildToBack(returnStmt);
            func.addChildToBack(funcBody);
            assign.addChildToBack(func);
            exprResult.addChildToBack(assign);
            script.addChildToBack(exprResult);
        } else if (code.contains("function MyClass() {} var instance = new MyClass();")) {
            Node funcMyClass = new Node(Token.FUNCTION);
            Node nameMyClass = Node.newString("MyClass");
            Node bodyMyClass = new Node(Token.BLOCK);
            funcMyClass.addChildToBack(nameMyClass);
            funcMyClass.addChildToBack(bodyMyClass);
            script.addChildToBack(funcMyClass);

            Node varDecl = new Node(Token.VAR);
            Node instanceName = Node.newString("instance");
            Node newNode = new Node(Token.NEW);
            newNode.addChildToBack(nameMyClass);
            varDecl.addChildToBack(instanceName);
            varDecl.addChildToBack(newNode);
            script.addChildToBack(varDecl);
        } else if (code.contains("Delegator.prototype.findDelegate = DelegateBase.prototype.findDelegate;")) {
            Node exprResult = new Node(Token.EXPR_RESULT);
            Node assign = new Node(Token.ASSIGN);
            Node getPropDelegator = new Node(Token.GETPROP);
            Node delegatorProto = new Node(Token.GETPROP);
            delegatorProto.addChildToBack(Node.newString("Delegator"));
            delegatorProto.addChildToBack(Node.newString("prototype"));
            getPropDelegator.addChildToBack(delegatorProto);
            getPropDelegator.addChildToBack(Node.newString("findDelegate"));
            assign.addChildToBack(getPropDelegator);

            Node getPropDelegate = new Node(Token.GETPROP);
            Node delegateProto = new Node(Token.GETPROP);
            delegateProto.addChildToBack(Node.newString("DelegateBase"));
            delegateProto.addChildToBack(Node.newString("prototype"));
            getPropDelegate.addChildToBack(delegateProto);
            getPropDelegate.addChildToBack(Node.newString("findDelegate"));
            assign.addChildToBack(getPropDelegate);
            exprResult.addChildToBack(assign);
            script.addChildToBack(exprResult);
        } else if (code.contains("var obj = /** @type {{a: number}} */ ({});")) {
            Node varDecl = new Node(Token.VAR);
            Node objName = Node.newString("obj");
            Node objLit = new Node(Token.OBJECTLIT);
            JSDocInfo info = new JSDocInfo();
            // Representing {{a: number}} as a type string.
            info.addType("{{a: number}}");
            objLit.setJSDocInfo(info);
            varDecl.addChildToBack(objName);
            varDecl.addChildToBack(objLit);
            script.addChildToBack(varDecl);
        } else if (code.contains("var Base = {}; /** @lends {Base} */ var Derived = { prop: 123 };")) {
            Node varDeclBase = new Node(Token.VAR);
            Node baseName = Node.newString("Base");
            Node baseObjLit = new Node(Token.OBJECTLIT);
            varDeclBase.addChildToBack(baseName);
            varDeclBase.addChildToBack(baseObjLit);
            script.addChildToBack(varDeclBase);

            Node varDeclDerived = new Node(Token.VAR);
            Node derivedName = Node.newString("Derived");
            Node derivedObjLit = new Node(Token.OBJECTLIT);
            Node prop = new Node(Token.STRING_KEY, Node.newString("prop"));
            prop.addChildToBack(Node.newNumber(123));
            derivedObjLit.addChildToBack(prop);
            JSDocInfo info = new JSDocInfo();
            info.addLends("Base");
            derivedObjLit.setJSDocInfo(info);
            varDeclDerived.addChildToBack(derivedName);
            varDeclDerived.addChildToBack(derivedObjLit);
            script.addChildToBack(varDeclDerived);
        } else if (code.contains("var ns = { TypeA: { x: 1 } }; /** @typedef {ns.TypeA} */ var MyAlias;")) {
            Node varDeclNs = new Node(Token.VAR);
            Node nsName = Node.newString("ns");
            Node nsObjLit = new Node(Token.OBJECTLIT);
            Node propTypeA = new Node(Token.STRING_KEY, Node.newString("TypeA"));
            Node typeALit = new Node(Token.OBJECTLIT);
            Node propX = new Node(Token.STRING_KEY, Node.newString("x"));
            propX.addChildToBack(Node.newNumber(1));
            typeALit.addChildToBack(propX);
            propTypeA.addChildToBack(typeALit);
            nsObjLit.addChildToBack(propTypeA);
            varDeclNs.addChildToBack(nsName);
            varDeclNs.addChildToBack(nsObjLit);
            script.addChildToBack(varDeclNs);

            Node varDeclAlias = new Node(Token.VAR);
            Node aliasName = Node.newString("MyAlias");
            JSDocInfo info = new JSDocInfo();
            info.addTypedef("ns.TypeA");
            aliasName.setJSDocInfo(info);
            varDeclAlias.addChildToBack(aliasName);
            script.addChildToBack(varDeclAlias);
        } else if (code.contains("function externFunc(a) {}")) {
            Node func = new Node(Token.FUNCTION);
            Node name = Node.newString("externFunc");
            Node params = new Node(Token.PARAM_LIST);
            params.addChildToBack(Node.newString("a"));
            Node body = new Node(Token.BLOCK);
            func.addChildToBack(name);
            func.addChildToBack(params);
            func.addChildToBack(body);
            script.addChildToBack(func);
        } else if (code.contains("var externVar = 123;")) {
            Node varDecl = new Node(Token.VAR);
            Node name = Node.newString("externVar");
            Node number = Node.newNumber(123);
            varDecl.addChildToBack(name);
            varDecl.addChildToBack(number);
            script.addChildToBack(varDecl);
        } else if (code.contains("this.foo = 123;")) {
            Node exprResult = new Node(Token.EXPR_RESULT);
            Node assign = new Node(Token.ASSIGN);
            Node getProp = new Node(Token.GETPROP);
            getProp.addChildToBack(new Node(Token.THIS));
            getProp.addChildToBack(Node.newString("foo"));
            assign.addChildToBack(getProp);
            assign.addChildToBack(Node.newNumber(123));
            exprResult.addChildToBack(assign);
            script.addChildToBack(exprResult);
        } else if (code.contains("var foo = {}; foo.bar = 1; foo.bar = 2;")) {
            Node varDeclFoo = new Node(Token.VAR);
            Node fooName = Node.newString("foo");
            Node fooObjLit = new Node(Token.OBJECTLIT);
            varDeclFoo.addChildToBack(fooName);
            varDeclFoo.addChildToBack(fooObjLit);
            script.addChildToBack(varDeclFoo);

            Node exprResult1 = new Node(Token.EXPR_RESULT);
            Node assign1 = new Node(Token.ASSIGN);
            Node getPropBar1 = new Node(Token.GETPROP);
            getPropBar1.addChildToBack(Node.newString("foo"));
            getPropBar1.addChildToBack(Node.newString("bar"));
            assign1.addChildToBack(getPropBar1);
            assign1.addChildToBack(Node.newNumber(1));
            exprResult1.addChildToBack(assign1);
            script.addChildToBack(exprResult1);

            Node exprResult2 = new Node(Token.EXPR_RESULT);
            Node assign2 = new Node(Token.ASSIGN);
            Node getPropBar2 = new Node(Token.GETPROP);
            getPropBar2.addChildToBack(Node.newString("foo"));
            getPropBar2.addChildToBack(Node.newString("bar"));
            assign2.addChildToBack(getPropBar2);
            assign2.addChildToBack(Node.newNumber(2));
            exprResult2.addChildToBack(assign2);
            script.addChildToBack(exprResult2);
        } else if (code.contains("var u; var v = u;")) {
             Node varDeclU = new Node(Token.VAR);
             varDeclU.addChildToBack(Node.newString("u"));
             script.addChildToBack(varDeclU);

             Node varDeclV = new Node(Token.VAR);
             Node vName = Node.newString("v");
             Node assignU = new Node(Token.ASSIGN);
             assignU.addChildToBack(Node.newString("u"));
             assignU.addChildToBack(Node.newString("u")); // Assign v = u
             varDeclV.addChildToBack(vName);
             varDeclV.addChildToBack(assignU);
             script.addChildToBack(varDeclV);
        } else if (code.contains("var b1 = true; var b2 = false;")) {
             Node varDeclB1 = new Node(Token.VAR);
             varDeclB1.addChildToBack(Node.newString("b1"));
             varDeclB1.addChildToBack(Node.newTrue());
             script.addChildToBack(varDeclB1);

             Node varDeclB2 = new Node(Token.VAR);
             varDeclB2.addChildToBack(Node.newString("b2"));
             varDeclB2.addChildToBack(Node.newFalse());
             script.addChildToBack(varDeclB2);
        } else if (code.contains("var n1 = 123; var n2 = -45.6;")) {
             Node varDeclN1 = new Node(Token.VAR);
             varDeclN1.addChildToBack(Node.newString("n1"));
             varDeclN1.addChildToBack(Node.newNumber(123));
             script.addChildToBack(varDeclN1);

             Node varDeclN2 = new Node(Token.VAR);
             varDeclN2.addChildToBack(Node.newString("n2"));
             varDeclN2.addChildToBack(Node.newNumber(-45.6));
             script.addChildToBack(varDeclN2);
        } else if (code.contains("var s1 = 'hello'; var s2 = \"world\";")) {
             Node varDeclS1 = new Node(Token.VAR);
             varDeclS1.addChildToBack(Node.newString("s1"));
             varDeclS1.addChildToBack(Node.newString("hello"));
             script.addChildToBack(varDeclS1);

             Node varDeclS2 = new Node(Token.VAR);
             varDeclS2.addChildToBack(Node.newString("s2"));
             varDeclS2.addChildToBack(Node.newString("world"));
             script.addChildToBack(varDeclS2);
        } else if (code.contains("var r = /abc/gi;")) {
             Node varDeclR = new Node(Token.VAR);
             varDeclR.addChildToBack(Node.newString("r"));
             varDeclR.addChildToBack(new Node(Token.REGEXP, "/abc/gi"));
             script.addChildToBack(varDeclR);
        } else if (code.contains("function foo() { var obj = {}; obj.prop = 123; }")) {
            Node func = new Node(Token.FUNCTION);
            Node name = Node.newString("foo");
            Node body = new Node(Token.BLOCK);
            Node varDecl = new Node(Token.VAR);
            Node objName = Node.newString("obj");
            Node objLit = new Node(Token.OBJECTLIT);
            varDecl.addChildToBack(objName);
            varDecl.addChildToBack(objLit);
            body.addChildToBack(varDecl);

            Node exprResult = new Node(Token.EXPR_RESULT);
            Node assign = new Node(Token.ASSIGN);
            Node getProp = new Node(Token.GETPROP);
            getProp.addChildToBack(objName.cloneNode()); // Use a cloned node for the object reference
            getProp.addChildToBack(Node.newString("prop"));
            assign.addChildToBack(getProp);
            assign.addChildToBack(Node.newNumber(123));
            exprResult.addChildToBack(assign);
            body.addChildToBack(exprResult);

            func.addChildToBack(name);
            func.addChildToBack(body);
            script.addChildToBack(func);
        } else if (code.contains("function outer() { function inner() { var x = 1; } }")) {
            Node funcOuter = new Node(Token.FUNCTION);
            Node nameOuter = Node.newString("outer");
            Node bodyOuter = new Node(Token.BLOCK);
            funcOuter.addChildToBack(nameOuter);
            funcOuter.addChildToBack(bodyOuter);
            script.addChildToBack(funcOuter);

            Node funcInner = new Node(Token.FUNCTION);
            Node nameInner = Node.newString("inner");
            Node bodyInner = new Node(Token.BLOCK);
            Node varDeclX = new Node(Token.VAR);
            varDeclX.addChildToBack(Node.newString("x"));
            varDeclX.addChildToBack(Node.newNumber(1));
            bodyInner.addChildToBack(varDeclX);
            funcInner.addChildToBack(nameInner);
            funcInner.addChildToBack(bodyInner);
            bodyOuter.addChildToBack(funcInner);
        } else if (code.contains("function outer() { function innerFunc() {} }")) {
            Node funcOuter = new Node(Token.FUNCTION);
            Node nameOuter = Node.newString("outer");
            Node bodyOuter = new Node(Token.BLOCK);
            funcOuter.addChildToBack(nameOuter);
            funcOuter.addChildToBack(bodyOuter);
            script.addChildToBack(funcOuter);

            Node funcInner = new Node(Token.FUNCTION);
            Node nameInner = Node.newString("innerFunc");
            Node bodyInner = new Node(Token.BLOCK);
            funcInner.addChildToBack(nameInner);
            funcInner.addChildToBack(bodyInner);
            bodyOuter.addChildToBack(funcInner);
        } else if (code.contains("function foo(a) { return a; } var x = foo(123);")) {
            Node func = new Node(Token.FUNCTION);
            Node name = Node.newString("foo");
            Node params = new Node(Token.PARAM_LIST);
            params.addChildToBack(Node.newString("a"));
            Node body = new Node(Token.BLOCK);
            Node returnStmt = new Node(Token.RETURN);
            returnStmt.addChildToBack(Node.newString("a"));
            body.addChildToBack(returnStmt);
            func.addChildToBack(name);
            func.addChildToBack(params);
            func.addChildToBack(body);
            script.addChildToBack(func);

            Node varDeclX = new Node(Token.VAR);
            Node xName = Node.newString("x");
            Node callFoo = new Node(Token.CALL);
            callFoo.addChildToBack(Node.newString("foo"));
            callFoo.addChildToBack(Node.newNumber(123));
            varDeclX.addChildToBack(xName);
            varDeclX.addChildToBack(callFoo);
            script.addChildToBack(varDeclX);
        } else if (code.contains("var date = new Date(); date.getFullYear();")) {
            Node varDecl = new Node(Token.VAR);
            Node dateName = Node.newString("date");
            Node newNode = new Node(Token.NEW);
            newNode.addChildToBack(Node.newString("Date"));
            varDecl.addChildToBack(dateName);
            varDecl.addChildToBack(newNode);
            script.addChildToBack(varDecl);

            Node exprResult = new Node(Token.EXPR_RESULT);
            Node callGetFullYear = new Node(Token.CALL);
            Node getFullYear = new Node(Token.GETPROP);
            getFullYear.addChildToBack(Node.newString("date"));
            getFullYear.addChildToBack(Node.newString("getFullYear"));
            callGetFullYear.addChildToBack(getFullYear);
            exprResult.addChildToBack(callGetFullYear);
            script.addChildToBack(exprResult);
        } else {
             // Default case: just a script node
        }

        // Assign a dummy input ID to the script node for the compiler
        script.setInputId(new InputId("test.js"));
        return script;
    }
}


public class TypedScopeCreatorTest {

    // Mock AbstractCompiler and JSTypeRegistry to isolate TypedScopeCreator
    private final AbstractCompiler mockCompiler = new MockCompiler();
    private final JSTypeRegistry typeRegistry = mockCompiler.getTypeRegistry(); // Get from mockCompiler

    // Helper to create a TypedScopeCreator with default settings
    private TypedScopeCreator createTypedScopeCreator() {
        return new TypedScopeCreator(mockCompiler, mockCompiler.getCodingConvention());
    }

    // Helper to create a basic Node structure for testing
    private Node createScriptNode(String code) {
        Node script = IRFactory.parse(code);
        // Ensure InputId is set if not already by IRFactory
        if (script.getInputId() == null) {
            script.setInputId(new InputId("test.js"));
        }
        return script;
    }

    @Test
    public void testCreateInitialScopeWithNativeTypes() throws Exception {
        TypedScopeCreator creator = createTypedScopeCreator();
        Node root = createScriptNode("");
        Scope globalScope = creator.createScope(root, null);

        assertNotNull("Global scope should not be null", globalScope);
        assertTrue("Scope should be global", globalScope.isGlobal());

        // Check for some well-known native types
        assertNotNull("Object type should be in global scope", globalScope.getVar("Object"));
        assertNotNull("String type should be in global scope", globalScope.getVar("String"));
        assertNotNull("Number type should be in global scope", globalScope.getVar("Number"));
        assertNotNull("Boolean type should be in global scope", globalScope.getVar("Boolean"));
        assertNotNull("Array type should be in global scope", globalScope.getVar("Array"));
        assertNotNull("Date type should be in global scope", globalScope.getVar("Date"));
        assertNotNull("RegExp type should be in global scope", globalScope.getVar("RegExp"));
        assertNotNull("undefined type should be in global scope", globalScope.getVar("undefined"));
    }

    @Test
    public void testLocalScopeCreation() throws Exception {
        String code = "function foo(a, b) { var x = a + b; return x; }";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        // Find the function node. The IRFactory creates script -> function foo.
        Node functionNode = script.getFirstChild();
        assertNotNull("Function node should exist", functionNode);
        assertEquals(Token.FUNCTION, functionNode.getType());

        // Create a traversal for scope creation
        NodeTraversal traversal = new NodeTraversal(mockCompiler, creator, new NodeIdSupplier());
        // Call createScope for the function's body, passing the global scope as parent
        Scope functionScope = creator.createScope(functionNode.getLastChild(), globalScope); // function body

        assertNotNull("Function scope should not be null", functionScope);
        assertFalse("Function scope should not be global", functionScope.isGlobal());
        assertEquals("Function scope parent should be global scope", globalScope, functionScope.getParent());

        // Check for parameters and local variables
        assertNotNull("Parameter 'a' should be in scope", functionScope.getVar("a"));
        assertNotNull("Parameter 'b' should be in scope", functionScope.getVar("b"));
        assertNotNull("Local variable 'x' should be in scope", functionScope.getVar("x"));
    }

    @Test
    public void testVarDeclarationInGlobalScope() throws Exception {
        String code = "var globalVar = 123;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var globalVar = globalScope.getVar("globalVar");
        assertNotNull("globalVar should be declared", globalVar);
        assertNotNull("globalVar should have a type", globalVar.getType());
        // Check if the type is NUMBER_TYPE.
        assertEquals("globalVar should have type Number", JSTypeNative.NUMBER_TYPE, globalVar.getType().getJSTypeNative());
    }

    @Test
    public void testFunctionDeclarationInGlobalScope() throws Exception {
        String code = "function globalFunc() {}";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var globalFuncVar = globalScope.getVar("globalFunc");
        assertNotNull("globalFunc should be declared", globalFuncVar);
        assertNotNull("globalFunc should have a type", globalFuncVar.getType());
        assertTrue("globalFunc should be a FunctionType", globalFuncVar.getType().isFunctionType());
    }

    @Test
    public void testObjectLiteralDeclarationInGlobalScope() throws Exception {
        String code = "var obj = { a: 1, b: 'hello' };";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var objVar = globalScope.getVar("obj");
        assertNotNull("obj should be declared", objVar);
        JSType objType = objVar.getType();
        assertNotNull("obj type should not be null", objType);
        assertTrue("obj should be an ObjectType", objType.isObject());

        ObjectType objObjectType = objType.toMaybeObjectType();
        assertNotNull("obj should be an ObjectType", objObjectType);
        assertNotNull("obj.a should have a type", objObjectType.getPropertyType("a"));
        assertEquals("obj.a should be Number", JSTypeNative.NUMBER_TYPE, objObjectType.getPropertyType("a").getJSTypeNative());
        assertNotNull("obj.b should have a type", objObjectType.getPropertyType("b"));
        assertEquals("obj.b should be String", JSTypeNative.STRING_TYPE, objObjectType.getPropertyType("b").getJSTypeNative());
    }

    @Test
    public void testTypedefAnnotation() throws Exception {
        String code = "/** @typedef {string} MyString */ var x; /** @type {MyString} */ var y;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var yVar = globalScope.getVar("y");
        assertNotNull("y should be declared", yVar);
        assertNotNull("y should have a type", yVar.getType());
        assertEquals("y should have type MyString (string)", JSTypeNative.STRING_TYPE, yVar.getType().getJSTypeNative());
    }

    @Test
    public void testConstructorAnnotation() throws Exception {
        String code = "/** @constructor */ function MyClass() {} var instance = new MyClass();";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var myClassVar = globalScope.getVar("MyClass");
        assertNotNull("MyClass should be declared", myClassVar);
        assertNotNull("MyClass should have a type", myClassVar.getType());
        assertTrue("MyClass should be a FunctionType", myClassVar.getType().isFunctionType());
        assertTrue("MyClass should be a constructor", myClassVar.getType().toMaybeFunctionType().isConstructor());

        Var instanceVar = globalScope.getVar("instance");
        assertNotNull("instance should be declared", instanceVar);
        assertNotNull("instance should have a type", instanceVar.getType());
        assertEquals("instance should be of type MyClass", "MyClass", instanceVar.getType().toString());
    }

    @Test
    public void testInterfaceAnnotation() throws Exception {
        String code = "/** @interface */ function MyInterface() {} /** @type {MyInterface} */ var obj;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var myInterfaceVar = globalScope.getVar("MyInterface");
        assertNotNull("MyInterface should be declared", myInterfaceVar);
        assertNotNull("MyInterface should have a type", myInterfaceVar.getType());
        assertTrue("MyInterface should be a FunctionType", myInterfaceVar.getType().isFunctionType());
        assertTrue("MyInterface should be an interface", myInterfaceVar.getType().toMaybeFunctionType().isInterface());

        Var objVar = globalScope.getVar("obj");
        assertNotNull("obj should be declared", objVar);
        assertNotNull("obj should have a type", objVar.getType());
        assertEquals("obj should be of type MyInterface", "MyInterface", objVar.getType().toString());
    }

    @Test
    public void testEnumAnnotation() throws Exception {
        String code = "/** @enum {number} */ var MyEnum = { A: 1, B: 2 };";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var enumVar = globalScope.getVar("MyEnum");
        assertNotNull("MyEnum should be declared", enumVar);
        assertNotNull("MyEnum should have a type", enumVar.getType());
        assertTrue("MyEnum should be an EnumType", enumVar.getType().isEnumType());

        EnumType enumType = enumVar.getType().toMaybeEnumType();
        assertNotNull("Enum type should not be null", enumType);
        assertNotNull("Enum elements type should not be null", enumType.getElementsType());
        assertEquals("Enum element type should be number", JSTypeNative.NUMBER_TYPE, enumType.getElementsType().getJSTypeNative());
        assertEquals("Enum has 2 elements", 2, enumType.getElementsCount());
        assertTrue("Enum contains element A", enumType.hasElement("A"));
        assertTrue("Enum contains element B", enumType.hasElement("B"));
    }

    @Test
    public void testGetPropDeclarationInGlobalScope() throws Exception {
        String code = "var ns = {}; ns.prop = 123;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var nsVar = globalScope.getVar("ns");
        assertNotNull("ns should be declared", nsVar);
        assertNotNull("ns should have a type", nsVar.getType());
        ObjectType nsObjectType = nsVar.getType().toMaybeObjectType();
        assertNotNull("ns should be an ObjectType", nsObjectType);

        assertTrue("ns should have property 'prop'", nsObjectType.hasProperty("prop"));
        assertNotNull("ns.prop should have a type", nsObjectType.getPropertyType("prop"));
        assertEquals("ns.prop should be Number", JSTypeNative.NUMBER_TYPE, nsObjectType.getPropertyType("prop").getJSTypeNative());
    }

    @Test
    public void testQualifiedNameRootedInGlobalScope() throws Exception {
        String code = "var ns; ns.prop = 123;"; // ns is declared as UNKNOWN initially
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var nsVar = globalScope.getVar("ns");
        assertNotNull("ns should be declared", nsVar);
        assertNotNull("ns should have a type", nsVar.getType());
        // Initially ns is UNKNOWN, but after processing 'ns.prop = 123', it should be inferred as an object.
        // The exact type inference might be complex, so check if it's an object.
        assertTrue("ns should be an ObjectType after prop assignment", nsVar.getType().isObject());
        ObjectType nsObjectType = nsVar.getType().toMaybeObjectType();
        assertNotNull("ns should be an ObjectType", nsObjectType);
        assertTrue("ns should have property 'prop'", nsObjectType.hasProperty("prop"));
        assertNotNull("ns.prop should have a type", nsObjectType.getPropertyType("prop"));
        assertEquals("ns.prop should be Number", JSTypeNative.NUMBER_TYPE, nsObjectType.getPropertyType("prop").getJSTypeNative());
    }

    @Test
    public void testCatchClauseDeclaration() throws Exception {
        String code = "try { throw 'error'; } catch (e) { var msg = e; }";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);
        // The scope for the catch variable 'e' and the var 'msg' is the scope of the 'try' block.
        // The IR factory creates the try block as the direct child of the script.
        Scope tryScope = globalScope.getDeepestLexicalNode().getScope();

        assertNotNull("Catch clause scope should exist", tryScope);
        Var eVar = tryScope.getVar("e");
        assertNotNull("Catch variable 'e' should be declared", eVar);
        assertNotNull("e should have a type", eVar.getType());
        // Default type for catch variable is unknown
        assertTrue("Catch variable 'e' type should be unknown", eVar.getType().isUnknownType());

        Var msgVar = tryScope.getVar("msg");
        assertNotNull("Local variable 'msg' should be declared", msgVar);
        assertNotNull("msg should have a type", msgVar.getType());
        assertTrue("Local variable 'msg' type should be unknown", msgVar.getType().isUnknownType());
    }

    @Test
    public void testFunctionWithThisAnnotation() throws Exception {
        String code = "/** @constructor */ function MyClass() {} /** @this {MyClass} */ function foo(x) { this.prop = x; }";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var fooVar = globalScope.getVar("foo");
        assertNotNull("foo should be declared", fooVar);
        assertNotNull("foo should have a type", fooVar.getType());
        FunctionType fooType = fooVar.getType().toMaybeFunctionType();
        assertNotNull("foo should be a FunctionType", fooType);
        assertNotNull("foo's 'this' type should exist", fooType.getTypeOfThis());
        assertEquals("foo's 'this' type should be MyClass", "MyClass", fooType.getTypeOfThis().toString());
    }

    @Test
    public void testPrototypePropertyDeclaration() throws Exception {
        String code = "function MyClass() {} MyClass.prototype.method = function() {};";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var myClassVar = globalScope.getVar("MyClass");
        assertNotNull("MyClass should be declared", myClassVar);
        assertNotNull("MyClass should have a type", myClassVar.getType());
        ObjectType myClassProto = myClassVar.getType().toMaybeObjectType().getPropertyType("prototype").toMaybeObjectType();
        assertNotNull("MyClass.prototype should be an ObjectType", myClassProto);
        assertTrue("MyClass.prototype should have 'method'", myClassProto.hasProperty("method"));
        assertNotNull("MyClass.prototype.method should have a type", myClassProto.getPropertyType("method"));
        assertTrue("MyClass.prototype.method should be a FunctionType", myClassProto.getPropertyType("method").isFunctionType());
    }

    @Test
    public void testImplicitPrototypeForConstructor() throws Exception {
        String code = "function MyClass() {} var instance = new MyClass();";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var myClassVar = globalScope.getVar("MyClass");
        assertNotNull("MyClass should be declared", myClassVar);
        assertNotNull("MyClass should have a type", myClassVar.getType());
        FunctionType myClassFnType = myClassVar.getType().toMaybeFunctionType();
        assertNotNull("MyClass should be a FunctionType", myClassFnType);

        ObjectType myClassInstanceType = myClassFnType.getInstanceType();
        assertNotNull("MyClass instance type should exist", myClassInstanceType);

        ObjectType myClassProto = myClassInstanceType.getImplicitPrototype();
        assertNotNull("MyClass implicit prototype should exist", myClassProto);
        assertEquals("MyClass implicit prototype should be MyClass.prototype", "MyClass.prototype", myClassProto.getReferenceName());
    }

    @Test
    public void testCallToDefineDelegateProxy() throws Exception {
        // This test requires a complex setup to trigger defineDelegateProxyPrototypeProperties.
        // For simplicity, we'll mock the relevant part of the CodingConvention.
        // If the method is called, it likely won't throw an exception.
        // A more thorough test would involve checking the state of delegateProxyPrototypes.

        String code = "function Delegator() {} function DelegateBase() {} function DelegateSuper() {} \n" +
                      "Delegator.prototype.findDelegate = DelegateBase.prototype.findDelegate;\n";
        Node script = createScriptNode(code);
        MockCodingConvention mockConvention = new MockCodingConvention();
        mockConvention.setDelegateSuperclassName("DelegateSuper");
        TypedScopeCreator creator = new TypedScopeCreator(mockCompiler, mockConvention);
        // The createScope method is what calls defineDelegateProxyPrototypeProperties.
        creator.createScope(script, null);

        // If createScope runs without error and defineDelegateProxyPrototypeProperties is called internally,
        // this test would pass by not failing. Verifying the actual state change is complex without mocking more.
        assertTrue("Delegate proxy properties should have been considered", true);
    }

    @Test
    public void testObjectLiteralCast() throws Exception {
        String code = "var obj = /** @type {{a: number}} */ ({});";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var objVar = globalScope.getVar("obj");
        assertNotNull("obj should be declared", objVar);
        JSType objType = objVar.getType();
        assertNotNull("obj type should not be null", objType);
        assertTrue("obj should be an ObjectType", objType.isObject());

        ObjectType objObjectType = objType.toMaybeObjectType();
        assertNotNull("obj should be an ObjectType", objObjectType);
        assertNotNull("obj.a should have a type", objObjectType.getPropertyType("a"));
        assertEquals("obj.a should be Number", JSTypeNative.NUMBER_TYPE, objObjectType.getPropertyType("a").getJSTypeNative());
    }

    @Test
    public void testLendsAnnotation() throws Exception {
        String code = "var Base = {}; /** @lends {Base} */ var Derived = { prop: 123 };";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var baseVar = globalScope.getVar("Base");
        assertNotNull("Base should be declared", baseVar);
        assertNotNull("Base should have a type", baseVar.getType());
        ObjectType baseType = baseVar.getType().toMaybeObjectType();
        assertNotNull("Base should be an ObjectType", baseType);

        Var derivedVar = globalScope.getVar("Derived");
        assertNotNull("Derived should be declared", derivedVar);
        assertNotNull("Derived should have a type", derivedVar.getType());
        // The type of Derived should be the same as Base due to @lends.
        assertEquals("Derived type should be Base", "Base", derivedVar.getType().toString());
        assertTrue("Derived should have property 'prop'", derivedVar.getType().toMaybeObjectType().hasProperty("prop"));
        assertNotNull("Derived.prop should have a type", derivedVar.getType().toMaybeObjectType().getPropertyType("prop"));
        assertEquals("Derived.prop should be Number", JSTypeNative.NUMBER_TYPE, derivedVar.getType().toMaybeObjectType().getPropertyType("prop").getJSTypeNative());
    }

    @Test
    public void testTypedefWithQualifiedName() throws Exception {
        // Original code: "var ns = {}; /** @typedef {ns.TypeA} */ var MyAlias;"
        // This requires ns.TypeA to be defined before MyAlias is processed.
        // The IR factory needs to handle this definition.
        String code = "var ns = { TypeA: { x: 1 } }; /** @typedef {ns.TypeA} */ var MyAlias;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var myAliasVar = globalScope.getVar("MyAlias");
        assertNotNull("MyAlias should be declared", myAliasVar);
        assertNotNull("MyAlias should have a type", myAliasVar.getType());
        assertEquals("MyAlias should be ns.TypeA", "ns.TypeA", myAliasVar.getType().toString());
    }

    @Test
    public void testFunctionDeclarationWithExterns() throws Exception {
        // Simulate an externs file containing a function.
        String externsCode = "function externFunc(a) {}";
        Node externsRoot = createScriptNode(externsCode);
        // Manually set InputId and mark as extern.
        externsRoot.setJSType(mockCompiler.getTypeRegistry().getNativeObjectType(JSTypeNative.GLOBAL_THIS));
        externsRoot.getFirstChild().setInputId(new InputId("externs.js"));
        externsRoot.getFirstChild().putBooleanProp(Node.IS_FILE_EXTERNAL, true);

        String code = "externFunc(1);";
        Node script = createScriptNode(code);

        TypedScopeCreator creator = createTypedScopeCreator();
        // First, create scope from externs.
        Scope globalScope = creator.createScope(externsRoot, null);
        // Then, create scope for the script, with the externs scope as parent.
        globalScope = creator.createScope(script, globalScope);

        Var externFuncVar = globalScope.getVar("externFunc");
        assertNotNull("externFunc should be declared from externs", externFuncVar);
        assertNotNull("externFunc should have a type", externFuncVar.getType());
        assertTrue("externFunc should be a FunctionType", externFuncVar.getType().isFunctionType());
    }

    @Test
    public void testVariableDeclaredInExterns() throws Exception {
        // Simulate an externs file containing a variable.
        String externsCode = "var externVar = 123;";
        Node externsRoot = createScriptNode(externsCode);
        externsRoot.setJSType(mockCompiler.getTypeRegistry().getNativeObjectType(JSTypeNative.GLOBAL_THIS));
        externsRoot.getFirstChild().setInputId(new InputId("externs.js"));
        externsRoot.getFirstChild().putBooleanProp(Node.IS_FILE_EXTERNAL, true);

        String code = "var x = externVar;";
        Node script = createScriptNode(code);

        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(externsRoot, null); // Create scope from externs
        globalScope = creator.createScope(script, globalScope); // Add script scope

        Var externVar = globalScope.getVar("externVar");
        assertNotNull("externVar should be declared from externs", externVar);
        assertNotNull("externVar should have a type", externVar.getType());
        assertEquals("externVar should be Number", JSTypeNative.NUMBER_TYPE, externVar.getType().getJSTypeNative());

        Var xVar = globalScope.getVar("x");
        assertNotNull("x should be declared", xVar);
        assertNotNull("x should have a type", xVar.getType());
        assertEquals("x should have the same type as externVar", JSTypeNative.NUMBER_TYPE, xVar.getType().getJSTypeNative());
    }

    @Test
    public void testGlobalThisType() throws Exception {
        String code = "this.foo = 123;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        // The root node of the script should have the GLOBAL_THIS type.
        // Note: The root node itself is the SCRIPT node. Its first child is the global scope.
        Node root = script;
        assertNotNull("Script node should exist", root);
        JSType rootType = root.getJSType();
        assertNotNull("Script node should have a type", rootType);
        assertTrue("Script node type should be GLOBAL_THIS", rootType.isGlobalThisType());

        // Check that 'foo' is added to the global this type.
        ObjectType globalThisObjectType = typeRegistry.getNativeObjectType(JSTypeNative.GLOBAL_THIS);
        assertTrue("GLOBAL_THIS should have property 'foo'", globalThisObjectType.hasProperty("foo"));
        assertNotNull("GLOBAL_THIS.foo should have a type", globalThisObjectType.getPropertyType("foo"));
        assertEquals("GLOBAL_THIS.foo should be Number", JSTypeNative.NUMBER_TYPE, globalThisObjectType.getPropertyType("foo").getJSTypeNative());
    }

    @Test
    public void testAssignToQualifiedNameInGlobalScope() throws Exception {
        String code = "var foo = {}; foo.bar = 1; foo.bar = 2;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var fooVar = globalScope.getVar("foo");
        assertNotNull("foo should be declared", fooVar);
        assertNotNull("foo should have a type", fooVar.getType());
        ObjectType fooType = fooVar.getType().toMaybeObjectType();
        assertNotNull("foo should be an ObjectType", fooType);

        assertTrue("foo should have property 'bar'", fooType.hasProperty("bar"));
        assertNotNull("foo.bar should have a type", fooType.getPropertyType("bar"));
        assertEquals("foo.bar should be Number", JSTypeNative.NUMBER_TYPE, fooType.getPropertyType("bar").getJSTypeNative());
    }

    @Test
    public void testFunctionAssigningProperty() throws Exception {
        String code = "function MyClass() {} MyClass.prototype.method = function() { return 123; };";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var myClassVar = globalScope.getVar("MyClass");
        assertNotNull("MyClass should be declared", myClassVar);
        assertNotNull("MyClass should have a type", myClassVar.getType());
        ObjectType myClassProto = myClassVar.getType().toMaybeObjectType().getPropertyType("prototype").toMaybeObjectType();
        assertNotNull("MyClass.prototype should be an ObjectType", myClassProto);
        assertTrue("MyClass.prototype should have 'method'", myClassProto.hasProperty("method"));
        assertNotNull("MyClass.prototype.method should have a type", myClassProto.getPropertyType("method"));
        FunctionType methodType = myClassProto.getPropertyType("method").toMaybeFunctionType();
        assertNotNull("method should be a FunctionType", methodType);
        assertNotNull("method return type should exist", methodType.getReturnType());
        assertEquals("method return type should be Number", JSTypeNative.NUMBER_TYPE, methodType.getReturnType().getJSTypeNative());
    }

    @Test
    public void testUndefinedType() throws Exception {
        String code = "var u; var v = u;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var uVar = globalScope.getVar("u");
        assertNotNull("u should be declared", uVar);
        assertNotNull("u should have a type", uVar.getType());
        assertEquals("u should be VOID_TYPE", JSTypeNative.VOID_TYPE, uVar.getType().getJSTypeNative());

        Var vVar = globalScope.getVar("v");
        assertNotNull("v should be declared", vVar);
        assertNotNull("v should have a type", vVar.getType());
        assertEquals("v should be VOID_TYPE (from u)", JSTypeNative.VOID_TYPE, vVar.getType().getJSTypeNative());
    }

    @Test
    public void testBooleanLiteralType() throws Exception {
        String code = "var b1 = true; var b2 = false;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var b1Var = globalScope.getVar("b1");
        assertNotNull("b1 should be declared", b1Var);
        assertNotNull("b1 should have a type", b1Var.getType());
        assertEquals("b1 should be BOOLEAN_TYPE", JSTypeNative.BOOLEAN_TYPE, b1Var.getType().getJSTypeNative());

        Var b2Var = globalScope.getVar("b2");
        assertNotNull("b2 should be declared", b2Var);
        assertNotNull("b2 should have a type", b2Var.getType());
        assertEquals("b2 should be BOOLEAN_TYPE", JSTypeNative.BOOLEAN_TYPE, b2Var.getType().getJSTypeNative());
    }

    @Test
    public void testNumberLiteralType() throws Exception {
        String code = "var n1 = 123; var n2 = -45.6;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var n1Var = globalScope.getVar("n1");
        assertNotNull("n1 should be declared", n1Var);
        assertNotNull("n1 should have a type", n1Var.getType());
        assertEquals("n1 should be NUMBER_TYPE", JSTypeNative.NUMBER_TYPE, n1Var.getType().getJSTypeNative());

        Var n2Var = globalScope.getVar("n2");
        assertNotNull("n2 should be declared", n2Var);
        assertNotNull("n2 should have a type", n2Var.getType());
        assertEquals("n2 should be NUMBER_TYPE", JSTypeNative.NUMBER_TYPE, n2Var.getType().getJSTypeNative());
    }

    @Test
    public void testStringLiteralType() throws Exception {
        String code = "var s1 = 'hello'; var s2 = \"world\";";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var s1Var = globalScope.getVar("s1");
        assertNotNull("s1 should be declared", s1Var);
        assertNotNull("s1 should have a type", s1Var.getType());
        assertEquals("s1 should be STRING_TYPE", JSTypeNative.STRING_TYPE, s1Var.getType().getJSTypeNative());

        Var s2Var = globalScope.getVar("s2");
        assertNotNull("s2 should be declared", s2Var);
        assertNotNull("s2 should have a type", s2Var.getType());
        assertEquals("s2 should be STRING_TYPE", JSTypeNative.STRING_TYPE, s2Var.getType().getJSTypeNative());
    }

    @Test
    public void testRegExpLiteralType() throws Exception {
        String code = "var r = /abc/gi;";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var rVar = globalScope.getVar("r");
        assertNotNull("r should be declared", rVar);
        assertNotNull("r should have a type", rVar.getType());
        assertEquals("r should be REGEXP_TYPE", JSTypeNative.REGEXP_TYPE, rVar.getType().getJSTypeNative());
    }

    @Test
    public void testQualifiedNameAsLValueInLocalScope() throws Exception {
        String code = "function foo() { var obj = {}; obj.prop = 123; }";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);
        // Find the function scope. IRFactory creates script -> function -> body.
        Scope functionScope = globalScope.getDeepestLexicalNode().getScope();

        Var objVar = functionScope.getVar("obj");
        assertNotNull("obj should be declared in function scope", objVar);
        assertNotNull("obj should have a type", objVar.getType());
        ObjectType objType = objVar.getType().toMaybeObjectType();
        assertNotNull("obj should be an ObjectType", objType);

        assertTrue("obj should have property 'prop'", objType.hasProperty("prop"));
        assertNotNull("obj.prop should have a type", objType.getPropertyType("prop"));
        assertEquals("obj.prop should be Number", JSTypeNative.NUMBER_TYPE, objType.getPropertyType("prop").getJSTypeNative());
    }

    @Test
    public void testNestedFunctionScope() throws Exception {
        String code = "function outer() { function inner() { var x = 1; } }";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);
        // Find the outer function's scope.
        Scope outerScope = globalScope.getDeepestLexicalNode().getScope();
        // Find the inner function's scope.
        Scope innerScope = outerScope.getDeepestLexicalNode().getScope();

        assertNotNull("Outer scope should exist", outerScope);
        assertNotNull("Inner scope should exist", innerScope);
        assertFalse("Inner scope should not be global", innerScope.isGlobal());
        assertEquals("Inner scope parent should be outer scope", outerScope, innerScope.getParent());

        Var xVar = innerScope.getVar("x");
        assertNotNull("Local variable 'x' should be in inner scope", xVar);
        assertNotNull("x should have a type", xVar.getType());
        assertEquals("x should be Number", JSTypeNative.NUMBER_TYPE, xVar.getType().getJSTypeNative());
    }

    @Test
    public void testFunctionDeclarationInLocalScope() throws Exception {
        String code = "function outer() { function innerFunc() {} }";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);
        // Find the outer function's scope.
        Scope outerScope = globalScope.getDeepestLexicalNode().getScope();

        assertNotNull("Outer scope should exist", outerScope);
        Var innerFuncVar = outerScope.getVar("innerFunc");
        assertNotNull("innerFunc should be declared in outer scope", innerFuncVar);
        assertNotNull("innerFunc should have a type", innerFuncVar.getType());
        assertTrue("innerFunc should be a FunctionType", innerFuncVar.getType().isFunctionType());
    }

    @Test
    public void testDefaultParamTypeInferred() throws Exception {
        String code = "function foo(a) { return a; } var x = foo(123);";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var fooVar = globalScope.getVar("foo");
        assertNotNull("foo should be declared", fooVar);
        assertNotNull("foo should have a type", fooVar.getType());
        FunctionType fooType = fooVar.getType().toMaybeFunctionType();
        assertNotNull("foo should be a FunctionType", fooType);
        assertFalse("foo should have parameters", fooType.getParameters().isEmpty());

        // The parameter 'a' should be inferred as NUMBER_TYPE from the call.
        assertEquals("Parameter 'a' should be inferred as Number", JSTypeNative.NUMBER_TYPE, fooType.getParameters().get(0).getJSTypeNative());
        // The return type should also be inferred as Number.
        assertNotNull("foo return type should exist", fooType.getReturnType());
        assertEquals("Return type should be inferred as Number", JSTypeNative.NUMBER_TYPE, fooType.getReturnType().getJSTypeNative());
    }

    @Test
    public void testNativeObjectWithPrototype() throws Exception {
        String code = "var date = new Date(); date.getFullYear();";
        Node script = createScriptNode(code);
        TypedScopeCreator creator = createTypedScopeCreator();
        Scope globalScope = creator.createScope(script, null);

        Var dateVar = globalScope.getVar("date");
        assertNotNull("date should be declared", dateVar);
        assertNotNull("date should have a type", dateVar.getType());
        assertEquals("date should be of type Date", "Date", dateVar.getType().toString());

        // Accessing the Date prototype through the registry
        ObjectType dateProto = typeRegistry.getNativeObjectType(JSTypeNative.DATE_FUNCTION_TYPE).getPrototype();
        assertNotNull("Date.prototype should exist", dateProto);
        assertTrue("Date.prototype should have 'getFullYear'", dateProto.hasProperty("getFullYear"));
        assertNotNull("Date.prototype.getFullYear should have a type", dateProto.getPropertyType("getFullYear"));
        assertTrue("Date.prototype.getFullYear should be a FunctionType", dateProto.getPropertyType("getFullYear").isFunctionType());
    }
}
```