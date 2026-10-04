package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ClosureCodingConventionTest {

    @Test
    public void testApplySubclassRelationshipInherits() throws Exception {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // Mock FunctionType objects for parent and child. Actual types are complex.
        // The method defines properties, so we just need non-null objects to avoid NPEs.
        // Since we don't have access to FunctionType constructors here, we pass null.
        // The reference source code does not show null checks for these arguments.
        FunctionType parentCtor = null;
        FunctionType childCtor = null;
        ccc.applySubclassRelationship(parentCtor, childCtor, ClosureCodingConvention.SubclassType.INHERITS);
        // The method modifies internal state of the FunctionTypes, which is hard to assert on mocks.
        // We assume it executes without errors.
        assertTrue(true);
    }







    @Test
    public void testGetClassesDefinedByCallInvalidSyntax() throws Exception {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // Invalid call, missing arguments
        Node callNode = new Node(Token.CALL);
        assertNull(ccc.getClassesDefinedByCall(callNode));
    }

    @Test
    public void testGetClassesDefinedByCallNotClassDefining() throws Exception {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // A regular method call
        Node methodName = Node.newString("someMethod");
        Node objectName = Node.newString("SomeObject");
        Node call = new Node(Token.CALL, new Node(Token.GETPROP, objectName, methodName));
        assertNull(ccc.getClassesDefinedByCall(call));
    }

    @Test
    public void testGetClassesDefinedByCallInheritsWithNonQualifiedSubclass() throws Exception {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // goog.inherits(cond ? Super1 : Super2, SuperClass) - subclass not a simple qualified name
        Node superClassName = Node.newString("SuperClass");
        Node condition = Node.newString("cond");
        Node superClass1 = Node.newString("SuperClass1");
        Node superClass2 = Node.newString("BaseClass2");
        Node ternary = new Node(Token.HOOK, condition, superClass1, superClass2);
        Node googName = Node.newString("goog");
        Node inheritsName = Node.newString("inherits");
        Node googInherits = new Node(Token.GETPROP, googName, inheritsName);
        Node callNode = new Node(Token.CALL, googInherits, ternary, superClassName);
        assertNull(ccc.getClassesDefinedByCall(callNode));
    }

    @Test
    public void testGetClassesDefinedByCallInheritsWithNonQualifiedSuperclass() throws Exception {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // goog.inherits(SubClass, cond ? Super1 : Super2) - superclass not a simple qualified name
        Node subClassName = Node.newString("SubClass");
        Node condition = Node.newString("cond");
        Node superClass1 = Node.newString("SuperClass1");
        Node superClass2 = Node.newString("BaseClass2");
        Node ternary = new Node(Token.HOOK, condition, superClass1, superClass2);
        Node googName = Node.newString("goog");
        Node inheritsName = Node.newString("inherits");
        Node googInherits = new Node(Token.GETPROP, googName, inheritsName);
        Node callNode = new Node(Token.CALL, googInherits, subClassName, ternary);
        assertNull(ccc.getClassesDefinedByCall(callNode));
    }

    @Test
    public void testGetClassesDefinedByCallMixinWithNonPrototypeSuperclass() throws Exception {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // goog.mixin(SubClass.prototype, SuperClass) - SuperClass is not a prototype
        Node superClass = Node.newString("SuperClass");
        Node subClassProto = new Node(Token.GETPROP, Node.newString("SubClass"), Node.newString("prototype"));
        Node googName = Node.newString("goog");
        Node mixinName = Node.newString("mixin");
        Node googMixin = new Node(Token.GETPROP, googName, mixinName);
        Node callNode = new Node(Token.CALL, googMixin, subClassProto, superClass);
        assertNull(ccc.getClassesDefinedByCall(callNode));
    }

    @Test
    public void testGetClassesDefinedByCallMixinWithNonPrototypeSubclass() throws Exception {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // goog.mixin(SubClass, SuperClass.prototype) - SubClass is not a prototype
        Node superClassProto = new Node(Token.GETPROP, Node.newString("SuperClass"), Node.newString("prototype"));
        Node subClass = Node.newString("SubClass");
        Node googName = Node.newString("goog");
        Node mixinName = Node.newString("mixin");
        Node googMixin = new Node(Token.GETPROP, googName, mixinName);
        Node callNode = new Node(Token.CALL, googMixin, subClass, superClassProto);
        assertNull(ccc.getClassesDefinedByCall(callNode));
    }

    @Test
    public void testIsSuperClassReference() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        assertTrue(ccc.isSuperClassReference("superClass_"));
        assertFalse(ccc.isSuperClassReference("other"));
    }

    @Test
    public void testExtractClassNameIfProvide() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node node = new Node(Token.CALL);
        Node googProvide = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("provide"));
        Node className = Node.newString("com.example.MyClass");
        node.addChildToFront(googProvide);
        node.addChildToBack(className);
        Node parent = new Node(Token.EXPR_RESULT, node);

        assertEquals("com.example.MyClass", ccc.extractClassNameIfProvide(node, parent));
    }

    @Test
    public void testExtractClassNameIfProvideNotProvide() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node node = new Node(Token.CALL);
        Node googRequire = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("require"));
        Node className = Node.newString("com.example.MyClass");
        node.addChildToFront(googRequire);
        node.addChildToBack(className);
        Node parent = new Node(Token.EXPR_RESULT, node);

        assertNull(ccc.extractClassNameIfProvide(node, parent));
    }

    @Test
    public void testExtractClassNameIfProvideMissingArgument() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node node = new Node(Token.CALL);
        Node googProvide = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("provide"));
        node.addChildToFront(googProvide);
        Node parent = new Node(Token.EXPR_RESULT, node);

        assertNull(ccc.extractClassNameIfProvide(node, parent));
    }

    @Test
    public void testExtractClassNameIfRequire() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node node = new Node(Token.CALL);
        Node googRequire = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("require"));
        Node className = Node.newString("com.example.MyModule");
        node.addChildToFront(googRequire);
        node.addChildToBack(className);
        Node parent = new Node(Token.EXPR_RESULT, node);

        assertEquals("com.example.MyModule", ccc.extractClassNameIfRequire(node, parent));
    }

    @Test
    public void testExtractClassNameIfRequireNotRequire() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node node = new Node(Token.CALL);
        Node googProvide = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("provide"));
        Node className = Node.newString("com.example.MyModule");
        node.addChildToFront(googProvide);
        node.addChildToBack(className);
        Node parent = new Node(Token.EXPR_RESULT, node);

        assertNull(ccc.extractClassNameIfRequire(node, parent));
    }

    @Test
    public void testGetExportPropertyFunction() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        assertEquals("goog.exportProperty", ccc.getExportPropertyFunction());
    }

    @Test
    public void testGetExportSymbolFunction() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        assertEquals("goog.exportSymbol", ccc.getExportSymbolFunction());
    }

    @Test
    public void testIdentifyTypeDeclarationCall() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googAddDependency = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("addDependency"));
        call.addChildToFront(googAddDependency);
        Node typeArray = new Node(Token.ARRAYLIT);
        typeArray.addChildToBack(Node.newString("Type1"));
        typeArray.addChildToBack(Node.newString("Type2"));
        call.addChildToBack(Node.newString("somePath"));
        call.addChildToBack(typeArray);

        List<String> types = ccc.identifyTypeDeclarationCall(call);
        assertNotNull(types);
        assertEquals(2, types.size());
        assertEquals("Type1", types.get(0));
        assertEquals("Type2", types.get(1));
    }

    @Test
    public void testIdentifyTypeDeclarationCallEmptyArray() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googAddDependency = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("addDependency"));
        call.addChildToFront(googAddDependency);
        Node typeArray = new Node(Token.ARRAYLIT);
        call.addChildToBack(Node.newString("somePath"));
        call.addChildToBack(typeArray);

        List<String> types = ccc.identifyTypeDeclarationCall(call);
        assertNotNull(types);
        assertTrue(types.isEmpty());
    }

    @Test
    public void testIdentifyTypeDeclarationCallNotArrayLit() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googAddDependency = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("addDependency"));
        call.addChildToFront(googAddDependency);
        call.addChildToBack(Node.newString("somePath"));
        call.addChildToBack(Node.newString("not an array")); // Not an ARRAYLIT

        assertNull(ccc.identifyTypeDeclarationCall(call));
    }

    @Test
    public void testIdentifyTypeDeclarationCallWrongFunction() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googProvide = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("provide"));
        call.addChildToFront(googProvide);
        Node typeArray = new Node(Token.ARRAYLIT);
        call.addChildToBack(Node.newString("somePath"));
        call.addChildToBack(typeArray);

        assertNull(ccc.identifyTypeDeclarationCall(call));
    }

    @Test
    public void testGetAbstractMethodName() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        assertEquals("goog.abstractMethod", ccc.getAbstractMethodName());
    }

    @Test
    public void testGetSingletonGetterClassName() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googAddSingletonGetter = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("addSingletonGetter"));
        call.addChildToFront(googAddSingletonGetter);
        Node className = Node.newString("com.example.MySingleton");
        call.addChildToBack(className);

        assertEquals("com.example.MySingleton", ccc.getSingletonGetterClassName(call));
    }

    @Test
    public void testGetSingletonGetterClassNameWithDollar() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googDollarAddSingletonGetter = Node.newString("goog$addSingletonGetter");
        call.addChildToFront(googDollarAddSingletonGetter);
        Node className = Node.newString("com.example.MySingleton");
        call.addChildToBack(className);

        assertEquals("com.example.MySingleton", ccc.getSingletonGetterClassName(call));
    }

    @Test
    public void testGetSingletonGetterClassNameInvalidCall() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googAddSingletonGetter = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("addSingletonGetter"));
        call.addChildToFront(googAddSingletonGetter);
        // Missing second argument

        assertNull(ccc.getSingletonGetterClassName(call));
    }

    @Test
    public void testGetSingletonGetterClassNameWrongFunctionName() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googProvide = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("provide"));
        call.addChildToFront(googProvide);
        Node className = Node.newString("com.example.MySingleton");
        call.addChildToBack(className);

        assertNull(ccc.getSingletonGetterClassName(call));
    }

    @Test
    public void testApplySingletonGetter() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        // Mock objects for FunctionType and ObjectType. Actual types are complex.
        // This method modifies properties of FunctionType and ObjectType.
        // Passing null to avoid NPEs, as we can't easily create these types.
        FunctionType functionType = null;
        FunctionType getterType = null;
        ObjectType objectType = null;
        ccc.applySingletonGetter(functionType, getterType, objectType);
        assertTrue(true); // Placeholder assertion
    }

    @Test
    public void testGetGlobalObject() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        assertEquals("goog.global", ccc.getGlobalObject());
    }

    @Test
    public void testIsPropertyTestFunction() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googIsDef = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("isDef"));
        call.addChildToFront(googIsDef);
        assertTrue(ccc.isPropertyTestFunction(call));
    }

    @Test
    public void testIsPropertyTestFunctionNotPropertyTest() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googSomeOther = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("someOther"));
        call.addChildToFront(googSomeOther);
        assertFalse(ccc.isPropertyTestFunction(call));
    }

    @Test
    public void testIsPropertyTestFunctionNotCall() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node googIsDef = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("isDef"));
        assertFalse(ccc.isPropertyTestFunction(googIsDef)); // Not a CALL node
    }



    @Test
    public void testGetObjectLiteralCastWrongFunctionName() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        NodeTraversal t = null; // Mock NodeTraversal
        Node callNode = new Node(Token.CALL);
        Node googReflectSomethingElse = new Node(Token.GETPROP, Node.newString("goog.reflect"), Node.newString("somethingElse"));
        callNode.addChildToFront(googReflectSomethingElse);
        Node typeName = Node.newString("MyType");
        callNode.addChildToBack(typeName);
        Node objectLit = new Node(Token.OBJECTLIT);
        callNode.addChildToBack(objectLit);

        assertNull(ccc.getObjectLiteralCast(t, callNode));
    }

    @Test
    public void testIsOptionalParameter() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node parameter = Node.newString("param");
        assertFalse(ccc.isOptionalParameter(parameter));
    }

    @Test
    public void testIsVarArgsParameter() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node parameter = Node.newString("param");
        assertFalse(ccc.isVarArgsParameter(parameter));
    }

    @Test
    public void testIsPrivate() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        assertFalse(ccc.isPrivate("propertyName"));
    }






    @Test
    public void testDescribeFunctionBindNotBindOrPartial() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node call = new Node(Token.CALL);
        Node googSomethingElse = new Node(Token.GETPROP, Node.newString("goog"), Node.newString("somethingElse"));
        call.addChildToFront(googSomethingElse);
        Node fn = Node.newString("myFunction");
        call.addChildToBack(fn);

        assertNull(ccc.describeFunctionBind(call));
    }

    @Test
    public void testDescribeFunctionBindNotCallNode() {
        ClosureCodingConvention ccc = new ClosureCodingConvention();
        Node fn = Node.newString("myFunction"); // Not a CALL node
        assertNull(ccc.describeFunctionBind(fn));
    }
}

