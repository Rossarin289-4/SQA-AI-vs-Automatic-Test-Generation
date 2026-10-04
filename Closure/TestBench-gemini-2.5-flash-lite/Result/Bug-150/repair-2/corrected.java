package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CodingConvention.DelegateRelationship;
import com.google.javascript.jscomp.CodingConvention.ObjectLiteralCast;
import com.google.javascript.jscomp.CodingConvention.SubclassRelationship;
import com.google.javascript.jscomp.CodingConvention.SubclassType;
import com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.ErrorReporter;
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
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class TypedScopeCreatorTest {

    private static final String SOURCE_FILE = "test.js";

    // Mock AbstractCompiler to satisfy TypedScopeCreator constructor
    // Removed abstract method overrides that were causing issues.
    // Replaced with minimal implementations to allow compilation.
    private static class MockAbstractCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry;
        private final CodingConvention codingConvention;
        private final TypeValidator typeValidator;
        private final MockErrorReporter errorReporter;

        MockAbstractCompiler() {
            errorReporter = new MockErrorReporter();
            typeRegistry = new JSTypeRegistry(errorReporter);
            codingConvention = new ClosureCodingConvention();
            typeValidator = new TypeValidator(this);
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return typeRegistry;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return codingConvention;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return typeValidator;
        }

        @Override
        public String getSourcePath() { return SOURCE_FILE; }

        @Override
        public void report(Diagnostic d) {
            if (d.getSeverity() == DiagnosticType.Error) {
                errorReporter.error(d.format(this), d.getNode().getSourceFileName(), d.getNode().getLineno(), d.getNode().getCharno());
            }
        }

        // Minimal implementation for Node construction and parsing.
        // Assumes Node.newString, Node.newNumber, and IRFactory.parse are available.
        @Override
        public Node parse(String filename, String code, boolean skipExternalParsing) {
             return IRFactory.parse(filename, code, this);
        }

        @Override
        public String getAstFileName(String filename) { return filename; }

        @Override
        public CompilerInput getCode(String filename) {
            return new CompilerInput(filename, "", false);
        }
    }

    // Mock ErrorReporter to avoid compilation errors
    private static class MockErrorReporter implements ErrorReporter {
        @Override public void warning(String message, String sourceName, int line, int charNumber) {}
        @Override public void error(String message, String sourceName, int line, int charNumber) {
            throw new RuntimeException(message);
        }
        @Override public void info(String message, String sourceName, int line, int charNumber) { }
    }


    private JSTypeRegistry createRegistry() {
        return new JSTypeRegistry(new MockErrorReporter());
    }

    private TypedScopeCreator createTypedScopeCreator(String code) {
        MockAbstractCompiler compiler = new MockAbstractCompiler();
        Node root = compiler.parse(SOURCE_FILE, code, false);
        return new TypedScopeCreator(compiler, compiler.getCodingConvention());
    }

    @Test
    public void testCreateScope_empty() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("");
        Scope scope = tsc.createScope(new Node(Token.SCRIPT), null);
        assertNotNull(scope);
        assertTrue(scope.isGlobal());
        // getDepth() is not a public method of Scope. Checking isGlobal and parent is sufficient.
        assertNull(scope.getParent());
    }

    @Test
    public void testCreateScope_globalVar() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("var a;");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(new Node(Token.NAME, "a")); // Node(int type, String value) constructor
        root.addChildToBack(varNode);
        Scope scope = tsc.createScope(root, null);
        Var varA = scope.getVar("a");
        assertNotNull(varA);
        assertNull(varA.getType());
    }

    @Test
    public void testCreateScope_globalFunction() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function foo() {}");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "foo"));
        fnNode.addChildToBack(new Node(Token.LP));
        fnNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        Var varFoo = scope.getVar("foo");
        assertNotNull(varFoo);
        assertNotNull(varFoo.getType());
        assertTrue(varFoo.getType().isFunctionType());
    }

    @Test
    public void testCreateScope_localVariable() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function bar() { var x; }");
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "bar"));
        functionNode.addChildToBack(new Node(Token.LP));
        Node functionBody = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(new Node(Token.NAME, "x"));
        functionBody.addChildToBack(varNode);
        functionNode.addChildToBack(functionBody);
        root.addChildToBack(functionNode);

        Scope globalScope = tsc.createScope(root, null);
        Scope localScope = null;
        // Finding the local scope by iterating through children
        for (Node child : globalScope.getRootNode().children()) {
            if (child.getType() == Token.FUNCTION) {
                // Need to manually create the scope for the function to inspect it.
                // The createScope method is for the top-level traversal.
                // However, the structure of Scope.getVars() and parent implies how it's structured.
                // We can infer the scope structure from the traversal.
                // For this test, we can assume the first function's scope is accessible via traversal.
                // A more robust way would involve modifying MockAbstractCompiler to expose ScopeCreator.
                // Let's try to find the scope linked to the function node.
                localScope = globalScope.getScopeForNode(child);
                break;
            }
        }
        assertNotNull(localScope);
        Var varX = localScope.getVar("x");
        assertNotNull(varX);
        assertNull(varX.getType());
    }

    @Test
    public void testCreateScope_functionParam() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function baz(y) {}");
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "baz"));
        Node parameters = new Node(Token.LP);
        parameters.addChildToBack(new Node(Token.NAME, "y"));
        functionNode.addChildToBack(parameters);
        functionNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(functionNode);

        Scope globalScope = tsc.createScope(root, null);
         Scope localScope = null;
         // Similar to testCreateScope_localVariable, we need to access the scope of the function.
         localScope = globalScope.getScopeForNode(functionNode);
        assertNotNull(localScope);
        Var varY = localScope.getVar("y");
        assertNotNull(varY);
        assertNull(varY.getType());
    }

    @Test
    public void testCreateScope_catchParameter() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("try {} catch (e) {}");
        Node root = new Node(Token.SCRIPT);
        Node tryNode = new Node(Token.TRY);
        Node catchNode = new Node(Token.CATCH);
        catchNode.addChildToBack(new Node(Token.NAME, "e"));
        tryNode.addChildToBack(new Node(Token.BLOCK));
        tryNode.addChildToBack(catchNode);
        tryNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(tryNode);

        Scope scope = tsc.createScope(root, null);
        Scope catchScope = null;
        // Traverse to find the catch block and its associated scope
        NodeTraversal.traverse(tsc.compiler, root, new NodeTraversal.AbstractShallowCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {
                if (n.getType() == Token.CATCH) {
                    // The scope for a catch parameter is local to the catch block.
                    // We can get it using the scope creator on the parent (try node).
                    // This assumes the compiler's scope creator is accessible and functional.
                    // For this test, we rely on the createScope method of TypedScopeCreator itself.
                    // A direct way to get the catch scope is usually via getScopeForNode on the catch node.
                    catchScope = t.getScope(); // Get the current scope during traversal
                }
            }
        });
        assertNotNull(catchScope);
        Var varE = catchScope.getVar("e");
        assertNotNull(varE);
        assertNull(varE.getType());
    }

    @Test
    public void testCreateScope_nativeTypes() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("");
        Scope scope = tsc.createScope(new Node(Token.SCRIPT), null);

        assertTrue(scope.isDeclared("Object", false));
        assertTrue(scope.isDeclared("Array", false));
        assertTrue(scope.isDeclared("String", false));
        assertTrue(scope.isDeclared("Number", false));
        assertTrue(scope.isDeclared("Boolean", false));
        assertTrue(scope.isDeclared("Date", false));
        assertTrue(scope.isDeclared("RegExp", false));
        assertTrue(scope.isDeclared("Error", false));
        assertTrue(scope.isDeclared("undefined", false));
    }

    @Test
    public void testCreateScope_typedef() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @typedef {string} MyString */");
        Node root = new Node(Token.SCRIPT);
        Node nameNode = new Node(Token.NAME, "MyString"); // Node(int type, String value)
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        info.addTypedefType(registry.createNamedType("string"));
        nameNode.setJSDocInfo(info);
        root.addChildToBack(nameNode); // Add the typedef node directly to the script

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("MyString", false));
        JSType myStringType = scope.getVar("MyString").getType();
        assertNotNull(myStringType);
        assertEquals("string", myStringType.toString());
    }

    @Test
    public void testCreateScope_globalObjectProperty() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("Object.foo = 1;");
        Node root = new Node(Token.SCRIPT);
        Node assignNode = new Node(Token.ASSIGN);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToBack(new Node(Token.NAME, "Object"));
        getPropNode.addChildToBack(new Node(Token.STRING, "foo"));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(Node.newNumber(1.0)); // Use Node.newNumber
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        // Qualified names are declared by the scope itself during traversal.
        assertTrue(scope.isDeclared("Object.foo", false));
        assertEquals("number", scope.getVar("Object.foo").getType().toString());
    }

    @Test
    public void testCreateScope_functionPrototype() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function MyClass() {}");
        Node root = new Node(Token.SCRIPT);
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "MyClass"));
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(functionNode);

        Scope scope = tsc.createScope(root, null);
        // The declaration of "MyClass.prototype" should happen automatically.
        assertTrue(scope.isDeclared("MyClass.prototype", false));
        assertNotNull(scope.getVar("MyClass.prototype").getType());
    }

    @Test
    public void testCreateScope_methodDeclaration() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function MyClass() {}; MyClass.prototype.myMethod = function() {};");
        Node root = new Node(Token.SCRIPT);
        
        // Function declaration
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "MyClass"));
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(functionNode);

        // Prototype assignment
        Node assignNode = new Node(Token.ASSIGN);
        Node getPropProto = new Node(Token.GETPROP);
        getPropProto.addChildToBack(new Node(Token.NAME, "MyClass"));
        getPropProto.addChildToBack(new Node(Token.STRING, "prototype"));
        Node getPropMethod = new Node(Token.GETPROP);
        getPropMethod.addChildToBack(getPropProto);
        getPropMethod.addChildToBack(new Node(Token.STRING, "myMethod"));
        assignNode.addChildToBack(getPropMethod);
        
        Node methodFnNode = new Node(Token.FUNCTION);
        methodFnNode.addChildToBack(new Node(Token.NAME, "myMethod")); // Function name not strictly needed for anonymous
        methodFnNode.addChildToBack(new Node(Token.LP));
        methodFnNode.addChildToBack(new Node(Token.BLOCK));
        assignNode.addChildToBack(methodFnNode);
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        // Qualified names like "MyClass.prototype.myMethod" should be declared.
        assertTrue(scope.isDeclared("MyClass.prototype.myMethod", false));
        JSType methodType = scope.getVar("MyClass.prototype.myMethod").getType();
        assertNotNull(methodType);
        assertTrue(methodType.isFunctionType());
    }

    @Test
    public void testCreateScope_enum() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @enum {number} */ var Color = { RED: 1, GREEN: 2 };");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "Color");
        
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        info.setEnumParameterType(registry.createNamedType("number"));
        nameNode.setJSDocInfo(info);

        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node redKey = new Node(Token.STRING, "RED");
        redKey.addChildToBack(Node.newNumber(1.0));
        Node greenKey = new Node(Token.STRING, "GREEN");
        greenKey.addChildToBack(Node.newNumber(2.0));
        objectLitNode.addChildToBack(redKey);
        objectLitNode.addChildToBack(greenKey);
        
        varNode.addChildToBack(nameNode);
        nameNode.addChildToBack(objectLitNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("Color", false));
        JSType colorType = scope.getVar("Color").getType();
        assertNotNull(colorType);
        assertTrue(colorType.isEnumType());
        assertEquals("number", colorType.toString());
    }

    @Test
    public void testCreateScope_enumElement() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @enum {number} */ var Color = { RED: 1, GREEN: 2 };");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "Color");
        
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        info.setEnumParameterType(registry.createNamedType("number"));
        nameNode.setJSDocInfo(info);

        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node redKey = new Node(Token.STRING, "RED");
        redKey.addChildToBack(Node.newNumber(1.0));
        Node greenKey = new Node(Token.STRING, "GREEN");
        greenKey.addChildToBack(Node.newNumber(2.0));
        objectLitNode.addChildToBack(redKey);
        objectLitNode.addChildToBack(greenKey);
        
        varNode.addChildToBack(nameNode);
        nameNode.addChildToBack(objectLitNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        // Enum elements are also declared as qualified names.
        assertTrue(scope.isDeclared("Color.RED", false));
        assertEquals("number", scope.getVar("Color.RED").getType().toString());
    }

    @Test
    public void testCreateScope_annotatedVar() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @type {string} */ var name = 'test';");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "name");
        JSDocInfo info = new JSDocInfo();
        info.addType(tsc.typeRegistry.createNamedType("string"));
        nameNode.setJSDocInfo(info);
        nameNode.addChildToBack(Node.newString("test"));
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("name", false));
        assertEquals("string", scope.getVar("name").getType().toString());
    }

    @Test
    public void testCreateScope_annotatedFunction() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @param {number} a @return {number} */ function add(a) { return a + 1; }");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "add"));
        Node params = new Node(Token.LP);
        Node paramA = new Node(Token.NAME, "a");
        JSDocInfo paramInfo = new JSDocInfo();
        paramInfo.addParameter(new FunctionParamBuilder("a", tsc.typeRegistry.createNamedType("number"), false).build());
        paramA.setJSDocInfo(paramInfo);
        params.addChildToBack(paramA);
        fnNode.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN);
        Node addOp = new Node(Token.ADD);
        addOp.addChildToBack(new Node(Token.NAME, "a"));
        addOp.addChildToBack(Node.newNumber(1.0));
        returnNode.addChildToBack(addOp);
        body.addChildToBack(returnNode);
        fnNode.addChildToBack(body);
        
        JSDocInfo fnInfo = new JSDocInfo();
        // JSDocInfo for function parameters needs to be associated with the function node, not the parameter node directly for declaration.
        // However, the FunctionTypeBuilder uses the parameter's JSDocInfo.
        // Let's try setting it on the function node itself for return type and parameter types.
        fnInfo.addReturnType(tsc.typeRegistry.createNamedType("number"));
        fnNode.setJSDocInfo(fnInfo);

        // For parameter types, we need to associate with the parameter node itself
        // or ensure FunctionTypeBuilder correctly interprets JSDoc on the function.
        // The reference source code seems to use FunctionTypeBuilder which can infer from function node's JSDoc.
        // Let's re-verify how parameters are handled.
        // The code `inferParameterTypes(parametersNode, info)` in FunctionTypeBuilder uses `info` which is from the function node.
        // So, putting param info in function's JSDoc is correct.
        // Correcting param info on function JSDoc
        JSDocInfo functionJSDoc = new JSDocInfo();
        functionJSDoc.addParameter(new FunctionParamBuilder("a", tsc.typeRegistry.createNamedType("number"), false).build());
        functionJSDoc.addReturnType(tsc.typeRegistry.createNamedType("number"));
        fnNode.setJSDocInfo(functionJSDoc);

        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("add", false));
        FunctionType addType = (FunctionType) scope.getVar("add").getType();
        assertNotNull(addType);
        assertEquals("function(number): number", addType.toString());
    }

    @Test
    public void testCreateScope_annotatedMethod() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function MyClass() {}; /** @param {string} s */ MyClass.prototype.myMethod = function(s) {};");
        Node root = new Node(Token.SCRIPT);

        // Function declaration
        Node functionNode = new Node(Token.FUNCTION);
        functionNode.addChildToBack(new Node(Token.NAME, "MyClass"));
        functionNode.addChildToBack(new Node(Token.LP));
        functionNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(functionNode);

        // Prototype assignment
        Node assignNode = new Node(Token.ASSIGN);
        Node getPropProto = new Node(Token.GETPROP);
        getPropProto.addChildToBack(new Node(Token.NAME, "MyClass"));
        getPropProto.addChildToBack(new Node(Token.STRING, "prototype"));
        Node getPropMethod = new Node(Token.GETPROP);
        getPropMethod.addChildToBack(getPropProto);
        getPropMethod.addChildToBack(new Node(Token.STRING, "myMethod"));
        assignNode.addChildToBack(getPropMethod);
        
        Node methodFnNode = new Node(Token.FUNCTION);
        methodFnNode.addChildToBack(new Node(Token.NAME, "myMethod"));
        Node params = new Node(Token.LP);
        Node paramS = new Node(Token.NAME, "s");
        params.addChildToBack(paramS);
        methodFnNode.addChildToBack(params);
        methodFnNode.addChildToBack(new Node(Token.BLOCK));

        JSDocInfo methodInfo = new JSDocInfo();
        methodInfo.addParameter(new FunctionParamBuilder("s", tsc.typeRegistry.createNamedType("string"), false).build());
        methodFnNode.setJSDocInfo(methodInfo);

        assignNode.addChildToBack(methodFnNode);
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("MyClass.prototype.myMethod", false));
        FunctionType printType = (FunctionType) scope.getVar("MyClass.prototype.myMethod").getType();
        assertNotNull(printType);
        // The 'this' type is inferred from the context of the prototype property.
        // The return type defaults to undefined if not specified.
        // The original test had `function(this:MyClass, string): undefined`
        // Let's verify this type inference. The `getPrototypePropertyOwner` should help infer 'this'.
        assertEquals("function(this:MyClass, string): undefined", printType.toString());
    }

    @Test
    public void testCreateScope_constructor() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @constructor */ function Person(name) {}");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "Person"));
        Node params = new Node(Token.LP);
        params.addChildToBack(new Node(Token.NAME, "name"));
        fnNode.addChildToBack(params);
        fnNode.addChildToBack(new Node(Token.BLOCK));

        JSDocInfo info = new JSDocInfo();
        info.addConstructor(true);
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("Person", false));
        FunctionType personType = (FunctionType) scope.getVar("Person").getType();
        assertNotNull(personType);
        assertTrue(personType.isConstructor());
    }

    @Test
    public void testCreateScope_constructorWithInstanceType() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @constructor @struct */ function Point(x, y) { this.x = x; this.y = y; }");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "Point"));
        Node params = new Node(Token.LP);
        params.addChildToBack(new Node(Token.NAME, "x"));
        params.addChildToBack(new Node(Token.NAME, "y"));
        fnNode.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        Node assignX = new Node(Token.ASSIGN);
        assignX.addChildToBack(new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "x")));
        assignX.addChildToBack(new Node(Token.NAME, "x"));
        body.addChildToBack(assignX);
        Node assignY = new Node(Token.ASSIGN);
        assignY.addChildToBack(new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "y")));
        assignY.addChildToBack(new Node(Token.NAME, "y"));
        body.addChildToBack(assignY);
        fnNode.addChildToBack(body);

        JSDocInfo info = new JSDocInfo();
        info.addConstructor(true);
        // Using annotation("struct", null) for @struct
        info.addAnnotation("struct", null); 
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("Point", false));
        FunctionType personType = (FunctionType) scope.getVar("Point").getType();
        assertNotNull(personType.getInstanceType());
        assertEquals("Point", personType.getInstanceType().getReferenceName());
        assertTrue(personType.getInstanceType().isStruct());
    }

    @Test
    public void testCreateScope_interface() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @interface */ function IFace() {}");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "IFace"));
        fnNode.addChildToBack(new Node(Token.LP));
        fnNode.addChildToBack(new Node(Token.BLOCK));

        JSDocInfo info = new JSDocInfo();
        info.addInterface(true);
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("IFace", false));
        FunctionType ifaceType = (FunctionType) scope.getVar("IFace").getType();
        assertNotNull(ifaceType);
        assertTrue(ifaceType.isInterface());
    }

    @Test
    public void testCreateScope_subclass() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function Animal() {} function Dog() {} Animal.call(this); Dog.prototype = Object.create(Animal.prototype); Dog.prototype.constructor = Dog;");
        Node root = new Node(Token.SCRIPT);

        // Animal declaration
        Node animalFn = new Node(Token.FUNCTION);
        animalFn.addChildToBack(new Node(Token.NAME, "Animal"));
        animalFn.addChildToBack(new Node(Token.LP));
        animalFn.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(animalFn);

        // Dog declaration
        Node dogFn = new Node(Token.FUNCTION);
        dogFn.addChildToBack(new Node(Token.NAME, "Dog"));
        dogFn.addChildToBack(new Node(Token.LP));
        Node dogBody = new Node(Token.BLOCK);
        // Animal.call(this)
        Node animalCall = new Node(Token.CALL);
        animalCall.addChildToBack(new Node(Token.NAME, "Animal"));
        animalCall.addChildToBack(new Node(Token.THIS));
        dogBody.addChildToBack(animalCall);
        dogFn.addChildToBack(dogBody);
        root.addChildToBack(dogFn);

        // Dog.prototype = Object.create(Animal.prototype);
        Node assignProto = new Node(Token.ASSIGN);
        Node dogProtoGetProp = new Node(Token.GETPROP);
        dogProtoGetProp.addChildToBack(new Node(Token.NAME, "Dog"));
        dogProtoGetProp.addChildToBack(new Node(Token.STRING, "prototype"));
        assignProto.addChildToBack(dogProtoGetProp);
        Node objectCreateCall = new Node(Token.CALL);
        objectCreateCall.addChildToBack(new Node(Token.NAME, "Object"));
        objectCreateCall.addChildToBack(new Node(Token.STRING, "create"));
        Node animalProtoGetProp = new Node(Token.GETPROP);
        animalProtoGetProp.addChildToBack(new Node(Token.NAME, "Animal"));
        animalProtoGetProp.addChildToBack(new Node(Token.STRING, "prototype"));
        objectCreateCall.addChildToBack(animalProtoGetProp);
        assignProto.addChildToBack(objectCreateCall);
        root.addChildToBack(assignProto);

        // Dog.prototype.constructor = Dog;
        Node assignConstructor = new Node(Token.ASSIGN);
        Node dogProtoConstructorGetProp = new Node(Token.GETPROP);
        dogProtoConstructorGetProp.addChildToBack(dogProtoGetProp); // Dog.prototype
        dogProtoConstructorGetProp.addChildToBack(new Node(Token.STRING, "constructor"));
        assignConstructor.addChildToBack(dogProtoConstructorGetProp);
        assignConstructor.addChildToBack(new Node(Token.NAME, "Dog"));
        root.addChildToBack(assignConstructor);

        Scope scope = tsc.createScope(root, null);
        FunctionType animalType = (FunctionType) scope.getVar("Animal").getType();
        FunctionType dogType = (FunctionType) scope.getVar("Dog").getType();
        assertNotNull(animalType);
        assertNotNull(dogType);
        assertNotNull(dogType.getSuperClassConstructor());
        assertEquals("Animal", dogType.getSuperClassConstructor().getName());
    }

    @Test
    public void testCreateScope_implements() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @interface */ function I() {} /** @implements {I} */ function MyClass() {}");
        Node root = new Node(Token.SCRIPT);

        // Interface declaration
        Node ifaceNode = new Node(Token.FUNCTION);
        ifaceNode.addChildToBack(new Node(Token.NAME, "I"));
        ifaceNode.addChildToBack(new Node(Token.LP));
        ifaceNode.addChildToBack(new Node(Token.BLOCK));
        JSDocInfo ifaceInfo = new JSDocInfo();
        ifaceInfo.addInterface(true);
        ifaceNode.setJSDocInfo(ifaceInfo);
        root.addChildToBack(ifaceNode);

        // Class declaration
        Node classNode = new Node(Token.FUNCTION);
        classNode.addChildToBack(new Node(Token.NAME, "MyClass"));
        classNode.addChildToBack(new Node(Token.LP));
        classNode.addChildToBack(new Node(Token.BLOCK));
        JSDocInfo classInfo = new JSDocInfo();
        classInfo.addImplements(tsc.typeRegistry.createNamedType("I"));
        classNode.setJSDocInfo(classInfo);
        root.addChildToBack(classNode);

        Scope scope = tsc.createScope(root, null);
        FunctionType myClassType = (FunctionType) scope.getVar("MyClass").getType();
        assertNotNull(myClassType);
        // Checking for implemented interfaces. The exact method might be `getImplementedInterfaces` or similar.
        // The test code uses stream().anyMatch which is fine if the method returns an Iterable.
        assertTrue(myClassType.getImplementedInterfaces().stream().anyMatch(iface -> iface.isInterface() && "I".equals(iface.getReferenceName())));
    }

    @Test
    public void testCreateScope_delegate() throws Exception {
        // The actual delegate mechanism is complex and involves CodingConvention.
        // This test will focus on a simple case that might trigger delegate logic.
        // For a true delegate test, we'd need to mock CodingConvention more deeply.
        // Here, we test a simple object with a method that might be interpreted as a delegate.
        TypedScopeCreator tsc = createTypedScopeCreator("var obj = { getFoo: function() { return this.foo; } };");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "obj");
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node getFooMethod = new Node(Token.FUNCTION);
        getFooMethod.addChildToBack(new Node(Token.NAME, "getFoo"));
        getFooMethod.addChildToBack(new Node(Token.LP));
        Node methodBody = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN);
        Node getFooProp = new Node(Token.GETPROP);
        getFooProp.addChildToBack(new Node(Token.THIS));
        getFooProp.addChildToBack(new Node(Token.STRING, "foo"));
        returnNode.addChildToBack(getFooProp);
        methodBody.addChildToBack(returnNode);
        getFooMethod.addChildToBack(methodBody);
        objectLitNode.addChildToBack(getFooMethod);
        nameNode.addChildToBack(objectLitNode);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("obj", false));
        JSType objType = scope.getVar("obj").getType();
        assertNotNull(objType.getPropertyType("getFoo"));
        FunctionType getFooType = (FunctionType) objType.getPropertyType("getFoo");
        assertNotNull(getFooType);
        // Closure infers 'this' to be Object for methods without explicit @this annotation.
        assertEquals("function(this:Object): undefined", getFooType.toString());
    }

    @Test
    public void testCreateScope_delegateProxy() throws Exception {
        // The "goog.abstractMethod" is often a marker for delegation.
        // The actual delegate proxy creation is tied to CodingConvention.
        // We will simulate a declaration that might be interpreted as such.
        TypedScopeCreator tsc = createTypedScopeCreator("var delegate = goog.abstractMethod;");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "delegate");
        Node googAbstractMethodCall = new Node(Token.CALL);
        Node googName = new Node(Token.NAME, "goog");
        Node abstractMethodProp = new Node(Token.GETPROP);
        abstractMethodProp.addChildToBack(googName);
        abstractMethodProp.addChildToBack(new Node(Token.STRING, "abstractMethod"));
        googAbstractMethodCall.addChildToBack(abstractMethodProp);
        nameNode.addChildToBack(googAbstractMethodCall);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("delegate", false));
        // A delegate proxy is created by the coding convention. The exact type can be complex.
        // We'll just check if it's a function.
        JSType delegateType = scope.getVar("delegate").getType();
        assertNotNull(delegateType);
        assertTrue(delegateType.isFunctionType());
    }

    @Test
    public void testCreateScope_annotatedObjectLiteral() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @type {{a: number}} */ var obj = {a: 1};");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "obj");
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        ObjectType objLiteralType = registry.createAnonymousObjectType();
        objLiteralType.defineDeclaredProperty("a", registry.createNamedType("number"), false);
        info.addType(objLiteralType);
        nameNode.setJSDocInfo(info);
        
        Node objectLitNode = new Node(Token.OBJECTLIT);
        Node keyA = new Node(Token.STRING, "a");
        keyA.addChildToBack(Node.newNumber(1.0));
        objectLitNode.addChildToBack(keyA);
        nameNode.addChildToBack(objectLitNode);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("obj", false));
        JSType objType = scope.getVar("obj").getType();
        assertNotNull(objType);
        assertEquals("{a: number}", objType.toString());
    }

    @Test
    public void testCreateScope_annotatedObjectLiteralProperty() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @type {{a: number}} */ var obj = {}; obj.a = 1;");
        Node root = new Node(Token.SCRIPT);
        
        // var obj = {};
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "obj");
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        ObjectType objLiteralType = registry.createAnonymousObjectType();
        objLiteralType.defineDeclaredProperty("a", registry.createNamedType("number"), false);
        info.addType(objLiteralType);
        nameNode.setJSDocInfo(info);
        nameNode.addChildToBack(new Node(Token.OBJECTLIT));
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        // obj.a = 1;
        Node assignNode = new Node(Token.ASSIGN);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToBack(new Node(Token.NAME, "obj"));
        getPropNode.addChildToBack(new Node(Token.STRING, "a"));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(Node.newNumber(1.0));
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("obj", false));
        JSType objType = scope.getVar("obj").getType();
        assertNotNull(objType.getPropertyType("a"));
        assertEquals("number", objType.getPropertyType("a").toString());
    }

    @Test
    public void testCreateScope_annotatedArrayLiteral() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @type {Array<string>} */ var arr = ['a', 'b'];");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "arr");
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        // Manually construct Array<string> type.
        // Get the Array constructor type, then its prototype, then set its index type.
        ObjectType arrayFnType = registry.getNativeObjectType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        FunctionType arrayCtorType = arrayFnType.toMaybeFunctionType();
        ObjectType arrayProtoType = arrayCtorType.getPrototype();
        JSType stringType = registry.createNamedType("string");
        arrayProtoType.setIndexType(stringType); // Set index type on the prototype
        info.addType(arrayProtoType.getJSType()); // Add the prototype's type to JSDoc
        nameNode.setJSDocInfo(info);
        
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        arrayLitNode.addChildToBack(Node.newString("a"));
        arrayLitNode.addChildToBack(Node.newString("b"));
        nameNode.addChildToBack(arrayLitNode);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("arr", false));
        JSType arrType = scope.getVar("arr").getType();
        assertNotNull(arrType);
        // The type should be Array<string> after resolution.
        assertEquals("Array<string>", arrType.toString());
    }

    @Test
    public void testCreateScope_annotatedArrayElement() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @type {Array<string>} */ var arr = []; arr[0] = 'a';");
        Node root = new Node(Token.SCRIPT);

        // var arr = [];
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "arr");
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        ObjectType arrayFnType = registry.getNativeObjectType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        FunctionType arrayCtorType = arrayFnType.toMaybeFunctionType();
        ObjectType arrayProtoType = arrayCtorType.getPrototype();
        JSType stringType = registry.createNamedType("string");
        arrayProtoType.setIndexType(stringType);
        info.addType(arrayProtoType.getJSType());
        nameNode.setJSDocInfo(info);
        nameNode.addChildToBack(new Node(Token.ARRAYLIT));
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        // arr[0] = 'a';
        Node assignNode = new Node(Token.ASSIGN);
        Node getElemNode = new Node(Token.GETELEM);
        getElemNode.addChildToBack(new Node(Token.NAME, "arr"));
        getElemNode.addChildToBack(Node.newNumber(0.0));
        assignNode.addChildToBack(getElemNode);
        assignNode.addChildToBack(Node.newString("a"));
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("arr", false));
        JSType arrType = scope.getVar("arr").getType();
        assertNotNull(arrType.getIndexType());
        assertEquals("string", arrType.getIndexType().toString());
    }

    @Test
    public void testCreateScope_functionTypeAsAnnotation() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @type {function(number): boolean} */ var fn;");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "fn");
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        FunctionType fnSig = registry.createFunctionType(registry.createNamedType("boolean"), registry.createNamedType("number"));
        info.addType(fnSig);
        nameNode.setJSDocInfo(info);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("fn", false));
        JSType fnType = scope.getVar("fn").getType();
        assertNotNull(fnType);
        assertEquals("function(number): boolean", fnType.toString());
    }

    @Test
    public void testCreateScope_unknownTypeInExterns() throws Exception {
        // Mocking compiler to simulate externs
        MockAbstractCompiler compiler = new MockAbstractCompiler() {
            @Override
            public CompilerInput getCode(String filename) {
                return new CompilerInput(filename, "var x;", true); // Mark as extern
            }
        };
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        varNode.addChildToBack(new Node(Token.NAME, "x"));
        root.addChildToBack(varNode);

        TypedScopeCreator creator = new TypedScopeCreator(compiler, compiler.getCodingConvention());
        Scope scope = creator.createScope(root, null);
        Var varX = scope.getVar("x");
        assertNotNull(varX);
        // In externs, variables without type annotations are UNKNOWN.
        assertEquals("unknown", varX.getType().toString());
    }

    @Test
    public void testCreateScope_qualifiedName() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("var a = {}; a.b = 1;");
        Node root = new Node(Token.SCRIPT);
        
        // var a = {};
        Node varANode = new Node(Token.VAR);
        Node nameANode = new Node(Token.NAME, "a");
        nameANode.addChildToBack(new Node(Token.OBJECTLIT));
        varANode.addChildToBack(nameANode);
        root.addChildToBack(varANode);

        // a.b = 1;
        Node assignNode = new Node(Token.ASSIGN);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToBack(new Node(Token.NAME, "a"));
        getPropNode.addChildToBack(new Node(Token.STRING, "b"));
        assignNode.addChildToBack(getPropNode);
        assignNode.addChildToBack(Node.newNumber(1.0));
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("a.b", false));
        assertEquals("number", scope.getVar("a.b").getType().toString());
    }

    @Test
    public void testCreateScope_qualifiedNameWithAnnotation() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("var a = {}; /** @type {string} */ a.b = 'hello';");
        Node root = new Node(Token.SCRIPT);
        
        // var a = {};
        Node varANode = new Node(Token.VAR);
        Node nameANode = new Node(Token.NAME, "a");
        nameANode.addChildToBack(new Node(Token.OBJECTLIT));
        varANode.addChildToBack(nameANode);
        root.addChildToBack(varANode);

        // /** @type {string} */ a.b = 'hello';
        Node assignNode = new Node(Token.ASSIGN);
        Node getPropNode = new Node(Token.GETPROP);
        getPropNode.addChildToBack(new Node(Token.NAME, "a"));
        getPropNode.addChildToBack(new Node(Token.STRING, "b"));
        assignNode.addChildToBack(getPropNode);
        
        JSDocInfo info = new JSDocInfo();
        info.addType(tsc.typeRegistry.createNamedType("string"));
        assignNode.setJSDocInfo(info); // JSDocInfo is on the assignment for properties
        
        assignNode.addChildToBack(Node.newString("hello"));
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("a.b", false));
        assertEquals("string", scope.getVar("a.b").getType().toString());
    }

    @Test
    public void testCreateScope_prototypeProperty() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("function Foo() {}\n Foo.prototype.bar = 1;");
        Node root = new Node(Token.SCRIPT);

        // function Foo() {}
        Node fooFn = new Node(Token.FUNCTION);
        fooFn.addChildToBack(new Node(Token.NAME, "Foo"));
        fooFn.addChildToBack(new Node(Token.LP));
        fooFn.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(fooFn);

        // Foo.prototype.bar = 1;
        Node assignNode = new Node(Token.ASSIGN);
        Node protoBarGetProp = new Node(Token.GETPROP);
        Node fooProtoGetProp = new Node(Token.GETPROP);
        fooProtoGetProp.addChildToBack(new Node(Token.NAME, "Foo"));
        fooProtoGetProp.addChildToBack(new Node(Token.STRING, "prototype"));
        protoBarGetProp.addChildToBack(fooProtoGetProp);
        protoBarGetProp.addChildToBack(new Node(Token.STRING, "bar"));
        assignNode.addChildToBack(protoBarGetProp);
        assignNode.addChildToBack(Node.newNumber(1.0));
        root.addChildToBack(assignNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("Foo.prototype.bar", false));
        assertEquals("number", scope.getVar("Foo.prototype.bar").getType().toString());
    }

    @Test
    public void testCreateScope_annotatedThis() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @this {MyObject} */ function foo() { this.prop = 1; }");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "foo"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        Node assignProp = new Node(Token.ASSIGN);
        Node thisPropGetProp = new Node(Token.GETPROP);
        thisPropGetProp.addChildToBack(new Node(Token.THIS));
        thisPropGetProp.addChildToBack(new Node(Token.STRING, "prop"));
        assignProp.addChildToBack(thisPropGetProp);
        assignProp.addChildToBack(Node.newNumber(1.0));
        body.addChildToBack(assignProp);
        fnNode.addChildToBack(body);
        
        JSDocInfo info = new JSDocInfo();
        // Creating a named type for MyObject. It doesn't need to exist.
        info.addThisType(tsc.typeRegistry.createNamedType("MyObject")); 
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("foo", false));
        FunctionType fooType = (FunctionType) scope.getVar("foo").getType();
        assertNotNull(fooType);
        assertEquals("MyObject", fooType.getTypeOfThis().toString());
        assertTrue(fooType.isReturnTypeInferred()); // Since no explicit return type
    }

    @Test
    public void testCreateScope_annotatedThisAndReturnType() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @this {MyObject} @return {string} */ function foo() { return this.prop; }");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "foo"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN);
        Node thisPropGetProp = new Node(Token.GETPROP);
        thisPropGetProp.addChildToBack(new Node(Token.THIS));
        thisPropGetProp.addChildToBack(new Node(Token.STRING, "prop"));
        returnNode.addChildToBack(thisPropGetProp);
        body.addChildToBack(returnNode);
        fnNode.addChildToBack(body);
        
        JSDocInfo info = new JSDocInfo();
        info.addThisType(tsc.typeRegistry.createNamedType("MyObject"));
        info.addReturnType(tsc.typeRegistry.createNamedType("string"));
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("foo", false));
        FunctionType fooType = (FunctionType) scope.getVar("foo").getType();
        assertNotNull(fooType);
        assertEquals("MyObject", fooType.getTypeOfThis().toString());
        assertEquals("string", fooType.getReturnType().toString());
    }

    @Test
    public void testCreateScope_annotatedThisAndPropertyOnThis() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @this {MyObject} */ function foo() { this.prop = 1; }");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "foo"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        Node assignProp = new Node(Token.ASSIGN);
        Node thisPropGetProp = new Node(Token.GETPROP);
        thisPropGetProp.addChildToBack(new Node(Token.THIS));
        thisPropGetProp.addChildToBack(new Node(Token.STRING, "prop"));
        assignProp.addChildToBack(thisPropGetProp);
        assignProp.addChildToBack(Node.newNumber(1.0));
        body.addChildToBack(assignProp);
        fnNode.addChildToBack(body);
        
        JSDocInfo info = new JSDocInfo();
        info.addThisType(tsc.typeRegistry.createNamedType("MyObject"));
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("foo", false));
        FunctionType fooType = (FunctionType) scope.getVar("foo").getType();
        assertNotNull(fooType);
        ObjectType thisType = fooType.getTypeOfThis();
        assertNotNull(thisType);
        // The property 'prop' should be inferred on thisType.
        assertTrue(thisType.hasProperty("prop"));
        assertEquals("number", thisType.getPropertyType("prop").toString());
    }
    
    @Test
    public void testCreateScope_functionWithTemplate() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @template T @param {T} x @return {T} */ function identity(x) { return x; }");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "identity"));
        Node params = new Node(Token.LP);
        params.addChildToBack(new Node(Token.NAME, "x"));
        fnNode.addChildToBack(params);
        Node body = new Node(Token.BLOCK);
        body.addChildToBack(new Node(Token.RETURN, new Node(Token.NAME, "x")));
        fnNode.addChildToBack(body);
        
        JSDocInfo info = new JSDocInfo();
        info.addTemplateTypeName("T");
        // Parameter type and return type should be set on the function's JSDocInfo
        // for FunctionTypeBuilder to pick up.
        JSTypeRegistry registry = tsc.typeRegistry;
        JSType templateT = registry.createTernaryType("T"); // Represents type variable T
        info.addParameter(new FunctionParamBuilder("x", templateT, false).build());
        info.addReturnType(templateT);
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("identity", false));
        FunctionType identityType = (FunctionType) scope.getVar("identity").getType();
        assertNotNull(identityType);
        // The template type T should be inferred and used in parameter and return type.
        assertEquals("function<T>(T): T", identityType.toString());
    }

    @Test
    public void testCreateScope_functionWithGenericArrayParam() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @param {Array<string>} arr */ function processArray(arr) {}");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "processArray"));
        Node params = new Node(Token.LP);
        Node paramArr = new Node(Token.NAME, "arr");
        JSDocInfo paramInfo = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        // Creating Array<string> type properly
        ObjectType arrayFnType = registry.getNativeObjectType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        FunctionType arrayCtorType = arrayFnType.toMaybeFunctionType();
        ObjectType arrayProtoType = arrayCtorType.getPrototype();
        JSType stringType = registry.createNamedType("string");
        arrayProtoType.setIndexType(stringType);
        
        paramInfo.addParameter(new FunctionParamBuilder("arr", arrayProtoType.getJSType(), false).build());
        paramArr.setJSDocInfo(paramInfo);
        params.addChildToBack(paramArr);
        fnNode.addChildToBack(params);
        fnNode.addChildToBack(new Node(Token.BLOCK));
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("processArray", false));
        FunctionType processArrayType = (FunctionType) scope.getVar("processArray").getType();
        assertNotNull(processArrayType);
        assertEquals("function(Array<string>): undefined", processArrayType.toString());
    }
    
    @Test
    public void testCreateScope_functionWithGenericArrayReturn() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @return {Array<number>} */ function getNumbers() { return [1, 2]; }");
        Node root = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION);
        fnNode.addChildToBack(new Node(Token.NAME, "getNumbers"));
        fnNode.addChildToBack(new Node(Token.LP));
        Node body = new Node(Token.BLOCK);
        Node returnNode = new Node(Token.RETURN);
        Node arrayLitNode = new Node(Token.ARRAYLIT);
        arrayLitNode.addChildToBack(Node.newNumber(1.0));
        arrayLitNode.addChildToBack(Node.newNumber(2.0));
        returnNode.addChildToBack(arrayLitNode);
        body.addChildToBack(returnNode);
        fnNode.addChildToBack(body);
        
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        ObjectType arrayFnType = registry.getNativeObjectType(JSTypeNative.ARRAY_FUNCTION_TYPE);
        FunctionType arrayCtorType = arrayFnType.toMaybeFunctionType();
        ObjectType arrayProtoType = arrayCtorType.getPrototype();
        JSType numberType = registry.createNamedType("number");
        arrayProtoType.setIndexType(numberType);
        info.addReturnType(arrayProtoType.getJSType());
        fnNode.setJSDocInfo(info);
        root.addChildToBack(fnNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("getNumbers", false));
        FunctionType getNumbersType = (FunctionType) scope.getVar("getNumbers").getType();
        assertNotNull(getNumbersType);
        assertEquals("function(): Array<number>", getNumbersType.toString());
    }

    @Test
    public void testCreateScope_objectWithGenericProperties() throws Exception {
        TypedScopeCreator tsc = createTypedScopeCreator("/** @type {{value: T}} */ var obj;");
        Node root = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR);
        Node nameNode = new Node(Token.NAME, "obj");
        JSDocInfo info = new JSDocInfo();
        JSTypeRegistry registry = tsc.typeRegistry;
        // Creating a type with a template parameter T. This requires a bit more care.
        // For simplicity in this test, we represent it as a named type "T".
        // A more robust test would involve defining T explicitly.
        ObjectType objLiteralType = registry.createAnonymousObjectType();
        objLiteralType.defineDeclaredProperty("value", registry.createTernaryType("T"), false);
        info.addType(objLiteralType);
        nameNode.setJSDocInfo(info);
        varNode.addChildToBack(nameNode);
        root.addChildToBack(varNode);

        Scope scope = tsc.createScope(root, null);
        assertTrue(scope.isDeclared("obj", false));
        JSType objType = scope.getVar("obj").getType();
        assertNotNull(objType);
        assertEquals("{value: T}", objType.toString());
    }
}
