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

    // Mock Compiler and related components for testing

    private JSTypeRegistry typeRegistry;
    private ReverseAbstractInterpreter reverseInterpreter;

    private static final String TEST_FILE = "test.js";

    // Helper to create a minimal compiler and run TypeCheck

    private static Node makeNode(int type) {
        return new Node(type);
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













































    @Test
    public void testVisitUnaryNegation() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("-1;");
        Node root = compiler.parse(TEST_FILE, "-1;");
        Node negNode = root.getFirstChild();
        assertNotNull(negNode.getJSType());
        assertTrue(negNode.getJSType().isNumber());
    }

    @Test
    public void testVisitTypeOf() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("typeof 1;");
        Node root = compiler.parse(TEST_FILE, "typeof 1;");
        Node typeofNode = root.getFirstChild();
        assertNotNull(typeofNode.getJSType());
        assertTrue(typeofNode.getJSType().isString());
    }

    @Test
    public void testVisitVoid() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("void 1;");
        Node root = compiler.parse(TEST_FILE, "void 1;");
        Node voidNode = root.getFirstChild();
        assertNotNull(voidNode.getJSType());
        assertTrue(voidNode.getJSType().isVoidType());
    }

    @Test
    public void testVisitDeleteProperty() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = {}; delete x.a;");
        Node root = compiler.parse(TEST_FILE, "var x = {}; delete x.a;");
        Node deleteNode = root.getFirstChild().getNext(); // delete x.a
        assertNotNull(deleteNode.getJSType());
        assertTrue(deleteNode.getJSType().isBoolean()); // delete returns a boolean
    }

    @Test
    public void testVisitCommaOperator() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("1, 2;");
        Node root = compiler.parse(TEST_FILE, "1, 2;");
        Node commaNode = root.getFirstChild();
        assertNotNull(commaNode.getJSType());
        assertTrue(commaNode.getJSType().isNumber()); // Type of the last expression
    }

    @Test
    public void testVisitAssignmentAdd() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 1; a = a + 1;");
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a + 1;");
        Node assignNode = root.getFirstChild().getNext(); // a = a + 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentSub() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 2; a = a - 1;");
        Node root = compiler.parse(TEST_FILE, "var a = 2; a = a - 1;");
        Node assignNode = root.getFirstChild().getNext(); // a = a - 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentMul() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 2; a = a * 3;");
        Node root = compiler.parse(TEST_FILE, "var a = 2; a = a * 3;");
        Node assignNode = root.getFirstChild().getNext(); // a = a * 3
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentDiv() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 4; a = a / 2;");
        Node root = compiler.parse(TEST_FILE, "var a = 4; a = a / 2;");
        Node assignNode = root.getFirstChild().getNext(); // a = a / 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentMod() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 5; a = a % 2;");
        Node root = compiler.parse(TEST_FILE, "var a = 5; a = a % 2;");
        Node assignNode = root.getFirstChild().getNext(); // a = a % 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentBitOr() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 1; a = a | 2;");
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a | 2;");
        Node assignNode = root.getFirstChild().getNext(); // a = a | 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentBitXor() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 1; a = a ^ 2;");
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a ^ 2;");
        Node assignNode = root.getFirstChild().getNext(); // a = a ^ 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentBitAnd() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 1; a = a & 2;");
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a & 2;");
        Node assignNode = root.getFirstChild().getNext(); // a = a & 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentLeftShift() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 1; a = a << 2;");
        Node root = compiler.parse(TEST_FILE, "var a = 1; a = a << 2;");
        Node assignNode = root.getFirstChild().getNext(); // a = a << 2
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentRightShift() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 4; a = a >> 1;");
        Node root = compiler.parse(TEST_FILE, "var a = 4; a = a >> 1;");
        Node assignNode = root.getFirstChild().getNext(); // a = a >> 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignmentUnsignedRightShift() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 4; a = a >>> 1;");
        Node root = compiler.parse(TEST_FILE, "var a = 4; a = a >>> 1;");
        Node assignNode = root.getFirstChild().getNext(); // a = a >>> 1
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitIncrement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 1; a++;");
        Node root = compiler.parse(TEST_FILE, "var a = 1; a++;");
        Node incNode = root.getFirstChild().getNext(); // a++
        assertNotNull(incNode.getJSType());
        assertTrue(incNode.getJSType().isNumber());
    }

    @Test
    public void testVisitDecrement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var a = 1; a--;");
        Node root = compiler.parse(TEST_FILE, "var a = 1; a--;");
        Node decNode = root.getFirstChild().getNext(); // a--
        assertNotNull(decNode.getJSType());
        assertTrue(decNode.getJSType().isNumber());
    }

    @Test
    public void testVisitFunctionDeclaration() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("function f() {}");
        Node root = compiler.parse(TEST_FILE, "function f() {}");
        Node functionNode = root.getFirstChild();
        assertNotNull(functionNode.getJSType());
        assertTrue(functionNode.getJSType().isFunctionType());
    }

    @Test
    public void testVisitFunctionExpression() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var f = function() {};");
        Node root = compiler.parse(TEST_FILE, "var f = function() {};");
        Node functionExpr = root.getFirstChild().getFirstChild().getNext(); // function() {}
        assertNotNull(functionExpr.getJSType());
        assertTrue(functionExpr.getJSType().isFunctionType());
    }

    @Test
    public void testVisitObjectLitBasic() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("{}");
        Node root = compiler.parse(TEST_FILE, "{}");
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
    }

    @Test
    public void testVisitObjectLitWithProperty() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("{a: 1}");
        Node root = compiler.parse(TEST_FILE, "{a: 1}");
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
        assertEquals(objectLitNode.getJSType().toMaybeObjectType().getPropertyType("a").getDisplayName(), "number");
    }

    @Test
    public void testVisitCaseStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("switch(1) { case 1: ; }");
        Node root = compiler.parse(TEST_FILE, "switch(1) { case 1: ; }");
        Node caseNode = root.getFirstChild().getLastChild().getFirstChild(); // case 1:
        assertNotNull(caseNode.getJSType());
        assertTrue(caseNode.getJSType().isNumber()); // The type of the case expression
    }

    @Test
    public void testVisitSwitchStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("switch(1) { case 1: ; }");
        Node root = compiler.parse(TEST_FILE, "switch(1) { case 1: ; }");
        Node switchNode = root.getFirstChild(); // switch(1) { ... }
        assertNotNull(switchNode.getJSType());
        assertTrue(switchNode.getJSType().isVoidType()); // Switch statement does not produce a value
    }

    @Test
    public void testVisitIfStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("if (true) {}");
        Node root = compiler.parse(TEST_FILE, "if (true) {}");
        Node ifNode = root.getFirstChild(); // if (true) {}
        assertNotNull(ifNode.getJSType());
        assertTrue(ifNode.getJSType().isVoidType()); // If statement does not produce a value
    }

    @Test
    public void testVisitWhileStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("while (false) {}");
        Node root = compiler.parse(TEST_FILE, "while (false) {}");
        Node whileNode = root.getFirstChild(); // while (false) {}
        assertNotNull(whileNode.getJSType());
        assertTrue(whileNode.getJSType().isVoidType()); // While statement does not produce a value
    }

    @Test
    public void testVisitDoStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("do {} while(false);");
        Node root = compiler.parse(TEST_FILE, "do {} while(false);");
        Node doNode = root.getFirstChild(); // do {} while(false);
        assertNotNull(doNode.getJSType());
        assertTrue(doNode.getJSType().isVoidType()); // Do statement does not produce a value
    }

    @Test
    public void testVisitForStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("for(;;) {}");
        Node root = compiler.parse(TEST_FILE, "for(;;) {}");
        Node forNode = root.getFirstChild(); // for(;;) {}
        assertNotNull(forNode.getJSType());
        assertTrue(forNode.getJSType().isVoidType()); // For statement does not produce a value
    }

    @Test
    public void testVisitBlockStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("{};");
        Node root = compiler.parse(TEST_FILE, "{};");
        Node blockNode = root.getFirstChild(); // {};
        assertNotNull(blockNode.getJSType());
        assertTrue(blockNode.getJSType().isVoidType()); // Block statement does not produce a value
    }

    @Test
    public void testVisitTryStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("try {} catch(e) {}");
        Node root = compiler.parse(TEST_FILE, "try {} catch(e) {}");
        Node tryNode = root.getFirstChild(); // try {} catch(e) {}
        assertNotNull(tryNode.getJSType());
        assertTrue(tryNode.getJSType().isVoidType()); // Try statement does not produce a value
    }

    @Test
    public void testVisitWithStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var obj = {}; with(obj) { a = 1; }");
        Node root = compiler.parse(TEST_FILE, "var obj = {}; with(obj) { a = 1; }");
        Node withNode = root.getFirstChild().getNext(); // with(obj) { ... }
        assertNotNull(withNode.getJSType());
        assertTrue(withNode.getJSType().isVoidType()); // With statement does not produce a value
    }

    @Test
    public void testVisitThrowStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("throw new Error();");
        Node root = compiler.parse(TEST_FILE, "throw new Error();");
        Node throwNode = root.getFirstChild(); // throw new Error();
        assertNotNull(throwNode.getJSType());
        assertTrue(throwNode.getJSType().isVoidType()); // Throw statement does not produce a value
    }

    @Test
    public void testVisitDebuggerStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("debugger;");
        Node root = compiler.parse(TEST_FILE, "debugger;");
        Node debuggerNode = root.getFirstChild(); // debugger;
        assertNotNull(debuggerNode.getJSType());
        assertTrue(debuggerNode.getJSType().isVoidType()); // Debugger statement does not produce a value
    }

    @Test
    public void testVisitEmptyStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode(";");
        Node root = compiler.parse(TEST_FILE, ";");
        Node emptyNode = root.getFirstChild(); // ;
        assertNotNull(emptyNode.getJSType());
        assertTrue(emptyNode.getJSType().isVoidType()); // Empty statement does not produce a value
    }

    @Test
    public void testVisitContinueStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("loop: while(true) { continue loop; }");
        Node root = compiler.parse(TEST_FILE, "loop: while(true) { continue loop; }");
        Node continueNode = root.getFirstChild().getFirstChild().getLastChild().getFirstChild(); // continue loop;
        assertNotNull(continueNode.getJSType());
        assertTrue(continueNode.getJSType().isVoidType()); // Continue statement does not produce a value
    }

    @Test
    public void testVisitBreakStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("loop: while(true) { break loop; }");
        Node root = compiler.parse(TEST_FILE, "loop: while(true) { break loop; }");
        Node breakNode = root.getFirstChild().getFirstChild().getLastChild().getFirstChild(); // break loop;
        assertNotNull(breakNode.getJSType());
        assertTrue(breakNode.getJSType().isVoidType()); // Break statement does not produce a value
    }

    @Test
    public void testVisitLabelStatement() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("loop: ;");
        Node root = compiler.parse(TEST_FILE, "loop: ;");
        Node labelNode = root.getFirstChild(); // loop: ;
        assertNotNull(labelNode.getJSType());
        assertTrue(labelNode.getJSType().isVoidType()); // Label statement does not produce a value
    }

    @Test
    public void testVisitDefaultCase() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("switch(1) { default: ; }");
        Node root = compiler.parse(TEST_FILE, "switch(1) { default: ; }");
        Node defaultCaseNode = root.getFirstChild().getLastChild(); // default:
        assertNotNull(defaultCaseNode.getJSType());
        assertTrue(defaultCaseNode.getJSType().isVoidType()); // Default case does not produce a value
    }

    @Test
    public void testVisitAssignAddAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 1; x += 1;");
        Node root = compiler.parse(TEST_FILE, "var x = 1; x += 1;");
        Node assignAddNode = root.getFirstChild().getNext(); // x += 1
        assertNotNull(assignAddNode.getJSType());
        assertTrue(assignAddNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignSubAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 2; x -= 1;");
        Node root = compiler.parse(TEST_FILE, "var x = 2; x -= 1;");
        Node assignSubNode = root.getFirstChild().getNext(); // x -= 1
        assertNotNull(assignSubNode.getJSType());
        assertTrue(assignSubNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignMulAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 2; x *= 3;");
        Node root = compiler.parse(TEST_FILE, "var x = 2; x *= 3;");
        Node assignMulNode = root.getFirstChild().getNext(); // x *= 3
        assertNotNull(assignMulNode.getJSType());
        assertTrue(assignMulNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignDivAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 4; x /= 2;");
        Node root = compiler.parse(TEST_FILE, "var x = 4; x /= 2;");
        Node assignDivNode = root.getFirstChild().getNext(); // x /= 2
        assertNotNull(assignDivNode.getJSType());
        assertTrue(assignDivNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignModAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 5; x %= 2;");
        Node root = compiler.parse(TEST_FILE, "var x = 5; x %= 2;");
        Node assignModNode = root.getFirstChild().getNext(); // x %= 2
        assertNotNull(assignModNode.getJSType());
        assertTrue(assignModNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignBitOrAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 1; x |= 2;");
        Node root = compiler.parse(TEST_FILE, "var x = 1; x |= 2;");
        Node assignBitOrNode = root.getFirstChild().getNext(); // x |= 2
        assertNotNull(assignBitOrNode.getJSType());
        assertTrue(assignBitOrNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignBitXorAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 1; x ^= 2;");
        Node root = compiler.parse(TEST_FILE, "var x = 1; x ^= 2;");
        Node assignBitXorNode = root.getFirstChild().getNext(); // x ^= 2
        assertNotNull(assignBitXorNode.getJSType());
        assertTrue(assignBitXorNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignBitAndAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 1; x &= 2;");
        Node root = compiler.parse(TEST_FILE, "var x = 1; x &= 2;");
        Node assignBitAndNode = root.getFirstChild().getNext(); // x &= 2
        assertNotNull(assignBitAndNode.getJSType());
        assertTrue(assignBitAndNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignLeftShiftAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 1; x <<= 2;");
        Node root = compiler.parse(TEST_FILE, "var x = 1; x <<= 2;");
        Node assignLshNode = root.getFirstChild().getNext(); // x <<= 2
        assertNotNull(assignLshNode.getJSType());
        assertTrue(assignLshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignRightShiftAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 4; x >>= 1;");
        Node root = compiler.parse(TEST_FILE, "var x = 4; x >>= 1;");
        Node assignRshNode = root.getFirstChild().getNext(); // x >>= 1
        assertNotNull(assignRshNode.getJSType());
        assertTrue(assignRshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitAssignUnsignedRightShiftAssign() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = 4; x >>>= 1;");
        Node root = compiler.parse(TEST_FILE, "var x = 4; x >>>= 1;");
        Node assignUrshNode = root.getFirstChild().getNext(); // x >>>= 1
        assertNotNull(assignUrshNode.getJSType());
        assertTrue(assignUrshNode.getJSType().isNumber());
    }

    @Test
    public void testVisitObjectLitGetter() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var o = { get a() { return 1; } };");
        Node root = compiler.parse(TEST_FILE, "var o = { get a() { return 1; } };");
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
        // Type of the getter's return value
        assertEquals(objectLitNode.getJSType().toMaybeObjectType().getPropertyType("a").getDisplayName(), "number");
    }

    @Test
    public void testVisitObjectLitSetter() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var o = { set a(v) {} };");
        Node root = compiler.parse(TEST_FILE, "var o = { set a(v) {} };");
        Node objectLitNode = root.getFirstChild();
        assertNotNull(objectLitNode.getJSType());
        assertTrue(objectLitNode.getJSType().isObjectType());
        // Setters typically have void return type
        assertEquals(objectLitNode.getJSType().toMaybeObjectType().getPropertyType("a").getDisplayName(), "function (string=): void");
    }

    @Test
    public void testVisitConditional() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("true ? 1 : 2;");
        Node root = compiler.parse(TEST_FILE, "true ? 1 : 2;");
        Node hookNode = root.getFirstChild();
        assertNotNull(hookNode.getJSType());
        assertTrue(hookNode.getJSType().isNumber());
    }

    @Test
    public void testVisitLogicalOr() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("1 || 2;");
        Node root = compiler.parse(TEST_FILE, "1 || 2;");
        Node orNode = root.getFirstChild();
        assertNotNull(orNode.getJSType());
        assertTrue(orNode.getJSType().isNumber());
    }

    @Test
    public void testVisitLogicalAnd() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("1 && 2;");
        Node root = compiler.parse(TEST_FILE, "1 && 2;");
        Node andNode = root.getFirstChild();
        assertNotNull(andNode.getJSType());
        assertTrue(andNode.getJSType().isNumber());
    }

    @Test
    public void testVisitQualifiedNameAssignment() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = {}; x.y = 5;");
        Node root = compiler.parse(TEST_FILE, "var x = {}; x.y = 5;");
        Node assignNode = root.getFirstChild().getNext(); // x.y = 5
        assertNotNull(assignNode.getJSType());
        assertTrue(assignNode.getJSType().isNumber());
    }

    @Test
    public void testVisitQualifiedNameGetProp() throws Exception {
        prepareTypeRegistry();
        runTypeCheckOnCode("var x = {}; var y = x.z;");
        Node root = compiler.parse(TEST_FILE, "var x = {}; var y = x.z;");
        Node getPropNode = root.getFirstChild().getNext().getFirstChild().getNext(); // x.z
        assertNotNull(getPropNode.getJSType());
        assertTrue(getPropNode.getJSType().isUnknownType());
    }
}





