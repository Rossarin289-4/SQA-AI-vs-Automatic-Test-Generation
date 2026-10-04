package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TypeCheckTest {

    private final AbstractCompiler compiler = new Compiler();
    private final JSTypeRegistry typeRegistry = new JSTypeRegistry(null);
    private final ReverseAbstractInterpreter reverseInterpreter =
        compiler.getReverseAbstractInterpreter();

    private static final String TEST_FILE = "test.js";

    // Helper to create a minimal compiler and run TypeCheck
    private Scope runTypeCheck(String code) {
        compiler.init(null); // Use init() instead of initForTesting()
        Node root = compiler.parse(TEST_FILE, code);
        compiler.process(null, root); // Process without externs
        Scope topScope = compiler.getTopScope();
        TypeCheck typeCheck = new TypeCheck(compiler, reverseInterpreter, typeRegistry);
        typeCheck.process(null, root); // Process without externs
        return topScope;
    }

    private static Node makeNode(int type) {
        return new Node(type);
    }

    private static Node makeNumberNode(double value) {
        return Node.newNumber(value);
    }

    private static Node makeStringNode(String value) {
        return Node.newString(value);
    }

    private static Node makeBooleanNode(boolean value) {
        return new Node(value ? Token.TRUE : Token.FALSE);
    }

    private static Node makeNullNode() {
        return new Node(Token.NULL);
    }

    private static Node makeVarNode(Node nameNode) {
        Node varNode = makeNode(Token.VAR);
        varNode.addChildToBack(nameNode);
        return varNode;
    }

    private static Node makeVarNode(Node nameNode, Node valueNode) {
        Node varNode = makeVarNode(nameNode);
        nameNode.addChildToBack(valueNode);
        return varNode;
    }

    private static Node makeAssignNode(Node target, Node value) {
        Node assignNode = makeNode(Token.ASSIGN);
        assignNode.addChildToBack(target);
        assignNode.addChildToBack(value);
        return assignNode;
    }

    private static Node makeGetPropNode(Node obj, String prop) {
        Node propNode = makeStringNode(prop);
        Node getPropNode = makeNode(Token.GETPROP);
        getPropNode.addChildToBack(obj);
        getPropNode.addChildToBack(propNode);
        return getPropNode;
    }

    private static Node makeCallNode(Node fn, Node... args) {
        Node callNode = makeNode(Token.CALL);
        callNode.addChildToBack(fn);
        for (Node arg : args) {
            callNode.addChildToBack(arg);
        }
        return callNode;
    }

    private static Node makeNewNode(Node constructor, Node... args) {
        Node newNode = makeNode(Token.NEW);
        newNode.addChildToBack(constructor);
        for (Node arg : args) {
            newNode.addChildToBack(arg);
        }
        return newNode;
    }

    // Inject necessary types for testing
    private void prepareTypeRegistry() {
        typeRegistry.registerStandardTypes(); // This method exists in JSTypeRegistry
        compiler.setTypeRegistry(typeRegistry);
        // The following method does not exist on AbstractCompiler or Compiler
        // compiler.setReverseAbstractInterpreter(reverseInterpreter);
    }

    @Test
    public void testVisitNameBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null); // Use init() instead of initForTesting()
        Node root = compiler.parse(TEST_FILE, "var a = 1; a;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root); // This method should be called after compiler.process
        Node nameNode = root.getFirstChild().getFirstChild().getNext(); // 'a' after 'var a = 1;'
        assertNotNull(nameNode.getJSType());
        assertTrue(nameNode.getJSType().isNumber());
    }

    @Test
    public void testVisitNameUnknown() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a; a;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node nameNode = root.getFirstChild().getFirstChild().getNext(); // 'a' after 'var a;'
        assertNotNull(nameNode.getJSType());
        assertTrue(nameNode.getJSType().isUnknownType());
    }

    @Test
    public void testVisitNameGlobal() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "a;"); // 'a' is global
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node nameNode = root.getFirstChild();
        assertNotNull(nameNode.getJSType());
        assertTrue(nameNode.getJSType().isUnknownType()); // Global unknown
    }

    @Test
    public void testVisitNumber() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "123;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node numberNode = root.getFirstChild();
        assertNotNull(numberNode.getJSType());
        assertTrue(numberNode.getJSType().isNumber());
    }

    @Test
    public void testVisitString() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "'hello';");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node stringNode = root.getFirstChild();
        assertNotNull(stringNode.getJSType());
        assertTrue(stringNode.getJSType().isString());
    }

    @Test
    public void testVisitBooleanTrue() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "true;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node booleanNode = root.getFirstChild();
        assertNotNull(booleanNode.getJSType());
        assertTrue(booleanNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBooleanFalse() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "false;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node booleanNode = root.getFirstChild();
        assertNotNull(booleanNode.getJSType());
        assertTrue(booleanNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitNull() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "null;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node nullNode = root.getFirstChild();
        assertNotNull(nullNode.getJSType());
        assertTrue(nullNode.getJSType().isNullType());
    }

    @Test
    public void testVisitThis() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "function f() { this; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node functionNode = root.getFirstChild();
        Node thisNode = functionNode.getFirstChild().getLastChild().getFirstChild(); // this inside function f
        assertNotNull(thisNode.getJSType());
        assertTrue(thisNode.getJSType().isUnknownType()); // Default 'this' type
    }

    @Test
    public void testVisitArrayLit() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "[]");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node arrayLitNode = root.getFirstChild();
        assertNotNull(arrayLitNode.getJSType());
        assertTrue(arrayLitNode.getJSType().isArrayType());
    }

    @Test
    public void testVisitRegExp() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "/abc/");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node regExpNode = root.getFirstChild();
        assertNotNull(regExpNode.getJSType());
        assertTrue(regExpNode.getJSType().isRegexpType());
    }

    @Test
    public void testVisitGetPropBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = {}; x.a;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node getPropNode = root.getFirstChild().getFirstChild().getNext(); // x.a
        assertNotNull(getPropNode.getJSType());
        assertTrue(getPropNode.getJSType().isUnknownType()); // Property 'a' is not defined
    }

    @Test
    public void testVisitGetPropDefined() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "/** @type {number} */ var x = {}; x.a;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node getPropNode = root.getFirstChild().getFirstChild().getNext(); // x.a
        assertNotNull(getPropNode.getJSType());
        assertTrue(getPropNode.getJSType().isNumber());
    }

    @Test
    public void testVisitGetElemBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var arr = []; arr[0];");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node getElemNode = root.getFirstChild().getFirstChild().getNext(); // arr[0]
        assertNotNull(getElemNode.getJSType());
        assertTrue(getElemNode.getJSType().isUnknownType()); // Element type is unknown
    }

    @Test
    public void testVisitNewBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "new Object();");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node newNode = root.getFirstChild();
        assertNotNull(newNode.getJSType());
        assertTrue(newNode.getJSType().isObjectType()); // Instance of Object
    }

    @Test
    public void testVisitCallBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "function f() {}; f();");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node callNode = root.getFirstChild().getNext(); // f();
        assertNotNull(callNode.getJSType());
        assertTrue(callNode.getJSType().isVoidType()); // Default return type is void
    }

    @Test
    public void testVisitReturnBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "function f() { return 1; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node returnNode = root.getFirstChild().getFirstChild().getLastChild().getFirstChild(); // return 1
        assertNotNull(returnNode.getJSType());
        assertTrue(returnNode.getJSType().isNumber());
    }

    @Test
    public void testVisitReturnVoid() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "function f() { return; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node returnNode = root.getFirstChild().getFirstChild().getLastChild().getFirstChild(); // return
        assertNotNull(returnNode.getJSType());
        assertTrue(returnNode.getJSType().isVoidType());
    }

    @Test
    public void testVisitBinaryOperatorAdd() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 + 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node addNode = root.getFirstChild();
        assertNotNull(addNode.getJSType());
        assertTrue(addNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorSub() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "3 - 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node subNode = root.getFirstChild();
        assertNotNull(subNode.getJSType());
        assertTrue(subNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorMul() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "2 * 3;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node mulNode = root.getFirstChild();
        assertNotNull(mulNode.getJSType());
        assertTrue(mulNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorDiv() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "4 / 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node divNode = root.getFirstChild();
        assertNotNull(divNode.getJSType());
        assertTrue(divNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorMod() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "5 % 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node modNode = root.getFirstChild();
        assertNotNull(modNode.getJSType());
        assertTrue(modNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorBitAnd() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 & 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node bitAndNode = root.getFirstChild();
        assertNotNull(bitAndNode.getJSType());
        assertTrue(bitAndNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorBitOr() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 | 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node bitOrNode = root.getFirstChild();
        assertNotNull(bitOrNode.getJSType());
        assertTrue(bitOrNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorBitXor() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 ^ 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node bitXorNode = root.getFirstChild();
        assertNotNull(bitXorNode.getJSType());
        assertTrue(bitXorNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorLeftShift() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 << 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node lshNode = root.getFirstChild();
        assertNotNull(lshNode.getJSType());
        assertTrue(lshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorRightShift() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "4 >> 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node rshNode = root.getFirstChild();
        assertNotNull(rshNode.getJSType());
        assertTrue(rshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorUnsignedRightShift() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "4 >>> 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node urshNode = root.getFirstChild();
        assertNotNull(urshNode.getJSType());
        assertTrue(urshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBinaryOperatorEqual() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 == 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node eqNode = root.getFirstChild();
        assertNotNull(eqNode.getJSType());
        assertTrue(eqNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBinaryOperatorNotEqual() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 != 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node neNode = root.getFirstChild();
        assertNotNull(neNode.getJSType());
        assertTrue(neNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBinaryOperatorStrictEqual() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 === 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node sheqNode = root.getFirstChild();
        assertNotNull(sheqNode.getJSType());
        assertTrue(sheqNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBinaryOperatorStrictNotEqual() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 !== 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node shneNode = root.getFirstChild();
        assertNotNull(shneNode.getJSType());
        assertTrue(shneNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBinaryOperatorLessThan() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 < 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node ltNode = root.getFirstChild();
        assertNotNull(ltNode.getJSType());
        assertTrue(ltNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBinaryOperatorLessThanOrEqual() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 <= 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node leNode = root.getFirstChild();
        assertNotNull(leNode.getJSType());
        assertTrue(leNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBinaryOperatorGreaterThan() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "2 > 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node gtNode = root.getFirstChild();
        assertNotNull(gtNode.getJSType());
        assertTrue(gtNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitBinaryOperatorGreaterThanOrEqual() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "2 >= 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node geNode = root.getFirstChild();
        assertNotNull(geNode.getJSType());
        assertTrue(geNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitInOperator() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var obj = {}; 'a' in obj;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node inNode = root.getFirstChild().getFirstChild().getNext(); // 'a' in obj
        assertNotNull(inNode.getJSType());
        assertTrue(inNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitInstanceOfOperator() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var obj = {}; obj instanceof Object;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node instanceOfNode = root.getFirstChild().getFirstChild().getNext(); // obj instanceof Object
        assertNotNull(instanceOfNode.getJSType());
        assertTrue(instanceOfNode.getJSType().isBoolean());
    }

    @Test
    public void testVisitAssignBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a; a = 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber()); // Type of the assigned value
    }

    @Test
    public void testVisitAssignPrototype() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "function F() {}; F.prototype = {};");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // F.prototype = {}
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isObjectType()); // Type of the assigned value
    }

    @Test
    public void testVisitAddAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a += 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node addAssignNode = root.getFirstChild().getNext(); // a += 1
        assertNotNull(addAssignNode.getJSType());
        assertTrue(addAssignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitBitwiseOperatorNot() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "~1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node bitNotNode = root.getFirstChild();
        assertNotNull(bitNotNode.getJSType());
        assertTrue(bitNotNode.getJSType().isNumber());
    }

    @Test
    public void testVisitUnaryPlus() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "+1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node posNode = root.getFirstChild();
        assertNotNull(posNode.getJSType());
        assertTrue(posNode.getJSType().isNumber());
    }

    @Test
    public void testVisitUnaryNegation() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "-1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node negNode = root.getFirstChild();
        assertNotNull(negNode.getJSType());
        assertTrue(negNode.getJSType().isNumber());
    }

    @Test
    public void testVisitTypeOf() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "typeof 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node typeofNode = root.getFirstChild();
        assertNotNull(typeofNode.getJSType());
        assertTrue(typeofNode.getJSType().isString());
    }

    @Test
    public void testVisitVoid() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "void 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node voidNode = root.getFirstChild();
        assertNotNull(voidNode.getJSType());
        assertTrue(voidNode.getJSType().isVoidType());
    }

    @Test
    public void testVisitDeleteProperty() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = {}; delete x.a;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node deleteNode = root.getFirstChild().getNext(); // delete x.a
        assertNotNull(deleteNode.getJSType());
        assertTrue(deleteNode.getJSType().isBoolean()); // delete returns a boolean
    }

    @Test
    public void testVisitCommaOperator() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1, 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node commaNode = root.getFirstChild();
        assertNotNull(commaNode.getJSType());
        assertTrue(commaNode.getJSType().isNumber()); // Type of the last expression
    }

    @Test
    public void testVisitAssignmentAdd() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a + 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a + 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentSub() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 2; a = a - 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a - 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentMul() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 2; a = a * 3;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a * 3
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentDiv() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 4; a = a / 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a / 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentMod() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 5; a = a % 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a % 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentBitOr() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a | 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a | 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentBitXor() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a ^ 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a ^ 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentBitAnd() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a & 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a & 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentLeftShift() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a << 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a << 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentRightShift() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 4; a = a >> 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a >> 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentUnsignedRightShift() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 4; a = a >>> 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // a = a >>> 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitIncrement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a++;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node incNode = root.getFirstChild().getNext(); // a++
        assertNotNull(incNode.getJSType());
        assertTrue(incNode.getJSType().isNumber());
    }

    @Test
    public void testVisitDecrement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var a = 1; a--;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node decNode = root.getFirstChild().getNext(); // a--
        assertNotNull(decNode.getJSType());
        assertTrue(decNode.getJSType().isNumber());
    }

    @Test
    public void testVisitFunctionDeclaration() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "function f() {}");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node functionNode = root.getFirstChild();
        assertNotNull(functionNode.getJSType());
        assertTrue(functionNode.getJSType().isFunctionType());
    }

    @Test
    public void testVisitFunctionExpression() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var f = function() {};");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node functionExpr = root.getFirstChild().getFirstChild().getNext(); // function() {}
        assertNotNull(functionExpr.getJSType());
        assertTrue(functionExpr.getJSType().isFunctionType());
    }

    @Test
    public void testVisitObjectLitBasic() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "{}");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
    }

    @Test
    public void testVisitObjectLitWithProperty() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "{a: 1}");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
        assertEquals(objectLitNode.getJSType().toMaybeObjectType().getPropertyType("a").getDisplayName(), "number");
    }

    @Test
    public void testVisitCaseStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "switch(1) { case 1: ; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node caseNode = root.getFirstChild().getLastChild().getFirstChild(); // case 1:
        assertNotNull(caseNode.getJSType());
        assertTrue(caseNode.getJSType().isNumber()); // The type of the case expression
    }

    @Test
    public void testVisitSwitchStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "switch(1) { case 1: ; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node switchNode = root.getFirstChild(); // switch(1) { ... }
        assertNotNull(switchNode.getJSType());
        assertTrue(switchNode.getJSType().isVoidType()); // Switch statement does not produce a value
    }

    @Test
    public void testVisitIfStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "if (true) {}");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node ifNode = root.getFirstChild(); // if (true) {}
        assertNotNull(ifNode.getJSType());
        assertTrue(ifNode.getJSType().isVoidType()); // If statement does not produce a value
    }

    @Test
    public void testVisitWhileStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "while (false) {}");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node whileNode = root.getFirstChild(); // while (false) {}
        assertNotNull(whileNode.getJSType());
        assertTrue(whileNode.getJSType().isVoidType()); // While statement does not produce a value
    }

    @Test
    public void testVisitDoStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "do {} while(false);");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node doNode = root.getFirstChild(); // do {} while(false);
        assertNotNull(doNode.getJSType());
        assertTrue(doNode.getJSType().isVoidType()); // Do statement does not produce a value
    }

    @Test
    public void testVisitForStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "for(;;) {}");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node forNode = root.getFirstChild(); // for(;;) {}
        assertNotNull(forNode.getJSType());
        assertTrue(forNode.getJSType().isVoidType()); // For statement does not produce a value
    }

    @Test
    public void testVisitBlockStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "{};");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node blockNode = root.getFirstChild(); // {};
        assertNotNull(blockNode.getJSType());
        assertTrue(blockNode.getJSType().isVoidType()); // Block statement does not produce a value
    }

    @Test
    public void testVisitTryStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "try {} catch(e) {}");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node tryNode = root.getFirstChild(); // try {} catch(e) {}
        assertNotNull(tryNode.getJSType());
        assertTrue(tryNode.getJSType().isVoidType()); // Try statement does not produce a value
    }

    @Test
    public void testVisitWithStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var obj = {}; with(obj) { a = 1; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node withNode = root.getFirstChild().getNext(); // with(obj) { ... }
        assertNotNull(withNode.getJSType());
        assertTrue(withNode.getJSType().isVoidType()); // With statement does not produce a value
    }

    @Test
    public void testVisitThrowStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "throw new Error();");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node throwNode = root.getFirstChild(); // throw new Error();
        assertNotNull(throwNode.getJSType());
        assertTrue(throwNode.getJSType().isVoidType()); // Throw statement does not produce a value
    }

    @Test
    public void testVisitDebuggerStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "debugger;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node debuggerNode = root.getFirstChild(); // debugger;
        assertNotNull(debuggerNode.getJSType());
        assertTrue(debuggerNode.getJSType().isVoidType()); // Debugger statement does not produce a value
    }

    @Test
    public void testVisitEmptyStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, ";");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node emptyNode = root.getFirstChild(); // ;
        assertNotNull(emptyNode.getJSType());
        assertTrue(emptyNode.getJSType().isVoidType()); // Empty statement does not produce a value
    }

    @Test
    public void testVisitContinueStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "loop: while(true) { continue loop; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node continueNode = root.getFirstChild().getFirstChild().getLastChild().getFirstChild(); // continue loop;
        assertNotNull(continueNode.getJSType());
        assertTrue(continueNode.getJSType().isVoidType()); // Continue statement does not produce a value
    }

    @Test
    public void testVisitBreakStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "loop: while(true) { break loop; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node breakNode = root.getFirstChild().getFirstChild().getLastChild().getFirstChild(); // break loop;
        assertNotNull(breakNode.getJSType());
        assertTrue(breakNode.getJSType().isVoidType()); // Break statement does not produce a value
    }

    @Test
    public void testVisitLabelStatement() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "loop: ;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node labelNode = root.getFirstChild(); // loop: ;
        assertNotNull(labelNode.getJSType());
        assertTrue(labelNode.getJSType().isVoidType()); // Label statement does not produce a value
    }

    @Test
    public void testVisitDefaultCase() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "switch(1) { default: ; }");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node defaultCaseNode = root.getFirstChild().getLastChild(); // default:
        assertNotNull(defaultCaseNode.getJSType());
        assertTrue(defaultCaseNode.getJSType().isVoidType()); // Default case does not produce a value
    }

    @Test
    public void testVisitAssignAddAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 1; x += 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignAddNode = root.getFirstChild().getNext(); // x += 1
        assertNotNull(assignAddNode.getJSType());
        assertTrue(assignAddNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignSubAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 2; x -= 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignSubNode = root.getFirstChild().getNext(); // x -= 1
        assertNotNull(assignSubNode.getJSType());
        assertTrue(assignSubNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignMulAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 2; x *= 3;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignMulNode = root.getFirstChild().getNext(); // x *= 3
        assertNotNull(assignMulNode.getJSType());
        assertTrue(assignMulNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignDivAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 4; x /= 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignDivNode = root.getFirstChild().getNext(); // x /= 2
        assertNotNull(assignDivNode.getJSType());
        assertTrue(assignDivNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignModAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 5; x %= 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignModNode = root.getFirstChild().getNext(); // x %= 2
        assertNotNull(assignModNode.getJSType());
        assertTrue(assignModNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignBitOrAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 1; x |= 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignBitOrNode = root.getFirstChild().getNext(); // x |= 2
        assertNotNull(assignBitOrNode.getJSType());
        assertTrue(assignBitOrNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignBitXorAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 1; x ^= 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignBitXorNode = root.getFirstChild().getNext(); // x ^= 2
        assertNotNull(assignBitXorNode.getJSType());
        assertTrue(assignBitXorNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignBitAndAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 1; x &= 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignBitAndNode = root.getFirstChild().getNext(); // x &= 2
        assertNotNull(assignBitAndNode.getJSType());
        assertTrue(assignBitAndNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignLeftShiftAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 1; x <<= 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignLshNode = root.getFirstChild().getNext(); // x <<= 2
        assertNotNull(assignLshNode.getJSType());
        assertTrue(assignLshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignRightShiftAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 4; x >>= 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignRshNode = root.getFirstChild().getNext(); // x >>= 1
        assertNotNull(assignRshNode.getJSType());
        assertTrue(assignRshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignUnsignedRightShiftAssign() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = 4; x >>>= 1;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignUrshNode = root.getFirstChild().getNext(); // x >>>= 1
        assertNotNull(assignUrshNode.getJSType());
        assertTrue(assignUrshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitObjectLitGetter() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var o = { get a() { return 1; } };");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
        // Type of the getter's return value
        assertEquals(objectLitNode.getJSType().toMaybeObjectType().getPropertyType("a").getDisplayName(), "number");
    }

    @Test
    public void testVisitObjectLitSetter() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var o = { set a(v) {} };");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
        // Setters typically have void return type
        assertEquals(objectLitNode.getJSType().toMaybeObjectType().getPropertyType("a").getDisplayName(), "function (string=): void");
    }

    @Test
    public void testVisitConditional() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "true ? 1 : 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node hookNode = root.getFirstChild();
        assertNotNull(hookNode.getJSType());
        assertTrue(hookNode.getJSType().isNumber());
    }

    @Test
    public void testVisitLogicalOr() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 || 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node orNode = root.getFirstChild();
        assertNotNull(orNode.getJSType());
        assertTrue(orNode.getJSType().isNumber());
    }

    @Test
    public void testVisitLogicalAnd() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "1 && 2;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node andNode = root.getFirstChild();
        assertNotNull(andNode.getJSType());
        assertTrue(andNode.getJSType().isNumber());
    }

    @Test
    public void testVisitQualifiedNameAssignment() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = {}; x.y = 5;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node assignNode = root.getFirstChild().getNext(); // x.y = 5
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitQualifiedNameGetProp() throws Exception {
        prepareTypeRegistry();
        compiler.init(null);
        Node root = compiler.parse(TEST_FILE, "var x = {}; var y = x.z;");
        compiler.process(null, root);
        compiler.getTypeCheck().process(null, root);
        Node getPropNode = root.getFirstChild().getNext().getFirstChild().getNext(); // x.z
        assertNotNull(getPropNode.getJSType());
        assertTrue(getPropNode.getJSType().isUnknownType());
    }
}
