```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Scope.Var;
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
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.List;

public class TypeCheckTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testVisitName() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNameWithInferredType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x; x = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNameWithUnknownType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = unknownVar;");
        tester.test();
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitGetProp() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = { a: 1 }; var x = obj.a;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitGetPropOnNull() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = null; var x = obj.a;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitGetPropOnUnknown() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = unknownVar; var x = obj.a;");
        tester.test();
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitGetElem() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var arr = [1, 2]; var x = arr[0];");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitGetElemOnInvalidIndex() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var arr = [1, 2]; var x = arr['a'];");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitVar() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitVarMultipleDeclarations() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1, y = 'a', z;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitVarMultipleDeclarationsSameType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x: number = 1, y: number = 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitVarMultipleDeclarationsDifferentTypes() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x: number = 1, y: string = 'a';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNew() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function MyClass() {} var obj = new MyClass();");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNewWithArguments() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function MyClass(a, b) {} var obj = new MyClass(1, 'a');");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNewNonConstructor() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = new 1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitCall() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo() { return 1; } var x = foo();");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitCallWithArguments() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo(a, b) { return a + b; } var x = foo(1, 2);");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitCallNonCallable() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1();");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitCallWrongArgumentCount() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo(a, b) {} foo(1);");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitReturn() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo() { return 1; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitReturnVoid() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo() { }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitReturnWrongType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo(): string { return 1; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorAdd() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 + 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorAddString() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 'a' + 'b';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorAddMixed() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 + 'a';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorSubtract() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 3 - 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorMultiply() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 3 * 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorDivide() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 6 / 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorModulus() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 7 % 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorBitwiseAnd() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5 & 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorBitwiseOr() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5 | 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorBitwiseXor() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5 ^ 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorLeftShift() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5 << 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorRightShift() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = -5 >> 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorUnsignedRightShift() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = -5 >>> 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorEquals() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 == 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorStrictEquals() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 === 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorNotEquals() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 != 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorStrictNotEquals() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 !== 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorLessThan() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 < 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorLessThanOrEqual() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 <= 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorGreaterThan() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 2 > 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorGreaterThanOrEqual() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 2 >= 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorInstanceof() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function Foo() {} var x = {} instanceof Foo;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorIn() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = {a: 1}; var x = 'a' in obj;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorInNonObject() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 'a' in 1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorDeleteProperty() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = {a: 1}; var x = delete obj.a;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorDeleteInvalid() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = delete 1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitUnaryNot() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = !true;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitUnaryBitwiseNot() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = ~5;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitUnaryPositive() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = +5;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitUnaryNegative() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = -5;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitUnaryVoid() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = void 0;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitUnaryTypeOf() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = typeof 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignment() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; x = 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentInvalidType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x: string = 1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentAdd() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; x += 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentSubtract() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5; x -= 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentMultiply() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 3; x *= 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentDivide() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 6; x /= 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentModulus() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 7; x %= 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentLeftShift() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5; x <<= 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentRightShift() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = -5; x >>= 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentUnsignedRightShift() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = -5; x >>>= 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentBitwiseAnd() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5; x &= 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentBitwiseOr() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5; x |= 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentBitwiseXor() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 5; x ^= 3;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitObjectLiteral() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = { a: 1, b: 'hello' };");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitObjectLiteralWithMethods() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = { a: 1, m: function() { return 2; } };");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitObjectLiteralWithGettersSetters() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = { get a() { return 1; }, set b(v) {} };");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitArrayLiteral() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var arr = [1, 'hello', true];");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitRegExpLiteral() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var re = /abc/;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionDeclaration() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo(a) { return a; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionDeclarationWithReturnType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo(a): number { return a; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionExpression() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var foo = function(a) { return a; };");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionExpressionWithReturnType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var foo = function(a): number { return a; };");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitConditionalExpression() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = true ? 1 : 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitConditionalExpressionMixedTypes() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = true ? 1 : 'a';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitLogicalAnd() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = true && false;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitLogicalOr() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = true || false;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentToGetProp() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = {}; obj.a = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentToGetElem() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var arr = []; arr[0] = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitThis() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function Foo() { this.a = 1; } var x = new Foo(); x.a;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitThisInMethod() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = { a: 1, getA: function() { return this.a; } }; var x = obj.getA();");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNull() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = null;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitTrue() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = true;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFalse() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = false;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNumber() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 123.45;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitString() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = \"hello\";");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitIncrement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; x++;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitDecrement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; x--;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitPostIncrement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; var y = x++;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitPostDecrement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; var y = x--;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitLabel() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("loop: while(true) { break loop; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitWithStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = {a: 1}; with(obj) { var x = a; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitWithStatementNonObject() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("with(1) { var x = 1; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitTryCatchFinally() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("try { throw 1; } catch (e) { var x = e; } finally {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitDebugger() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("debugger;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitThrow() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("throw 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitCaseStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; switch(x) { case 1: break; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitDefaultStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; switch(x) { default: break; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitIfStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("if (true) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitIfElseStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("if (true) {} else {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitWhileStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("while(true) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitDoWhileStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("do {} while(true);");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitForStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("for(;;) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitForInStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = {a:1}; for(var key in obj) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitForInStatementNonObject() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("for(var key in 1) {}");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitForOfStatement() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var arr = [1]; for(var val of arr) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitForOfStatementNonIterable() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("for(var val of 1) {}");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitCommaOperator() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = (1, 2);");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitCommaOperatorInForLoop() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("for(var i=0, j=0; i<1; i++, j++) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionMasksVariable() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var fn = 1; function fn() {}");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionCallWithThis() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = {foo: function() { return this.a; }}; obj.foo();");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionCallWithUnknownThis() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var foo = function() { return this.a; }; foo();");
        tester.test(); // Should not error here because 'this' is not constrained.
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionCallWithThisButNoProperty() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = {}; obj.foo = function() { return this.a; }; obj.foo();");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitConstructorNotCallable() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function MyClass() {} MyClass();");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitConstructorNotCallableButReturnsValue() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function MyClass(): number { return 1; } MyClass();");
        tester.test(1); // Still an error because it's not callable without new.
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitTypeofUnknown() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = typeof unknownVar;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBitOperationOnNonNumber() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 'a' | 1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBitOperationOnNumberString() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = '1' | 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBitOperationOnBoolean() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = true | false;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBitOperationOnNull() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = null | 1;");
        tester.test(); // JS compiler often treats null as 0 in bitwise ops
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBitOperationOnUndefined() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = undefined | 1;");
        tester.test(); // JS compiler often treats undefined as 0 in bitwise ops
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitComparisonWithUnknown() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = unknownVar == 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitComparisonWithNull() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = null == null;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitComparisonWithUndefined() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = undefined == undefined;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitStringComparison() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 'a' < 'b';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNumberComparison() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 < 2;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitNumberComparisonWithNonNumber() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 < 'a';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEqualityWithDifferentTypes() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 == '1';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitStrictEqualityWithDifferentTypes() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 === '1';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitShallowEqualityWithDifferentTypes() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = {} == [];");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitShallowInequalityWithDifferentTypes() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = {} !== [];");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitTypeofObject() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = typeof {};");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitTypeofNull() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = typeof null;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitTypeofUndefined() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = typeof undefined;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitGetPropOnObjectLiteral() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = {a: 1}.a;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitGetElemOnArrayLiteral() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = [1, 2][0];");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAnnotatedAssignGetprop() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @type {number} */ obj.a = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAnnotatedAssignGetpropWrongType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @type {string} */ obj.a = 1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEnumPropertyAccess() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @enum {number} */ var Colors = { RED: 1, GREEN: 2 }; var c = Colors.RED;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEnumPropertyAccessInvalid() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @enum {number} */ var Colors = { RED: 1 }; var c = Colors.BLUE;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEnumElementAsConstructor() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @enum {number} */ var Colors = { RED: 1 }; var c = new Colors.RED();");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEnumInitializerObjectLiteral() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @enum {number} */ var Colors = { RED: 1, GREEN: 2 };");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEnumInitializerInvalidValue() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @enum {number} */ var Colors = { RED: 'a' };");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEnumInitializerCopy() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @enum {number} */ var Colors1 = { RED: 1 }; /** @enum {number} */ var Colors2 = Colors1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitEnumInitializerCopyIncompatible() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @enum {number} */ var Colors1 = { RED: 1 }; /** @enum {string} */ var Colors2 = Colors1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitImplicitCast() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/** @implicitCast */ var x = 1;");
        tester.test(1); // Should report an error as implicit cast is only for externs.
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitImplicitCastInExterns() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addExterns("/** @implicitCast */ var x = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitOverridingPrototypeWithNonObject() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function Foo() {}; Foo.prototype = 1;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitDeterministicTestTrue() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; if (x == 1) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitDeterministicTestFalse() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; if (x == 2) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitDeterministicTestNoResult() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = {}; if (x instanceof Object) {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitPropertyAccessOnUnknown() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = unknown.prop;");
        tester.test();
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitPropertyAccessOnNull() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = null.prop;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitPropertyAccessOnUndefined() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = undefined.prop;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitElementAccessOnUnknown() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = unknown[0];");
        tester.test();
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitElementAccessOnNull() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = null[0];");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitElementAccessOnUndefined() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = undefined[0];");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitInvalidInterfaceMemberDeclaration() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("interface I { a: number; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitInvalidInterfaceMemberDeclarationWithFunction() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("interface I { foo: function() { return 1; }; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitInterfaceFunctionNotEmpty() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("interface I { foo() { return 1; } }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitConflictingExtendedTypeConstructor() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("class A {} interface B {} class C extends A implements B {}");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitConflictingExtendedTypeInterface() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("interface A {} class B {} interface C extends A {}");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBadImplementedType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("class Foo {} class Bar implements Foo {}");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitHiddenSuperclassProperty() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("class Parent { a: number; } class Child extends Parent { a: string; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitHiddenSuperclassPropertyWithOverride() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("class Parent { a: number; } class Child extends Parent { /** @override */ a: string; }");
        tester.test(1); // Expecting one error for type mismatch.
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitHiddenInterfaceProperty() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("interface I { a: number; } class C implements I { a: string; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitUnknownOverride() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("class Parent {} class Child extends Parent { /** @override */ a: string; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitInterfaceMethodOverride() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("interface Parent { a(): number; } interface Child extends Parent { a(): string; }");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitIncompatibleExtendedPropertyType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("interface I1 { a: number; } interface I2 { a: string; } interface I3 extends I1, I2 {}");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitExpectedThisType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var obj = { foo: function(): this { return this; } }; obj.foo();");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitExpectedThisTypeNonObject() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var foo = function(): this { return this; }; foo();");
        tester.test(); // This is valid in JS.
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitExpectedThisTypeNotCallable() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1; var y: typeof x = x;"); // Assuming 'y' is meant to be callable.
        tester.test(1); // Expecting one error related to type usage.
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    // New tests for uncalled methods
    @Test
    public void testProcess() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1;");
        tester.process(tester.compiler.parse(tester.externs), tester.compiler.parse(tester.script));
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testProcessForTesting() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1;");
        tester.processForTesting(tester.compiler.parse(tester.externs), tester.compiler.parse(tester.script));
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testCheck() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1;");
        tester.check(tester.compiler.parse(tester.script), false);
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testCheckExterns() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addExterns("var y = 2;");
        tester.check(tester.compiler.parse(tester.externs), true);
        // Externs don't count towards typed percent.
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testShouldTraverseFunction() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo() { return 1; }");
        NodeTraversal traversal = new NodeTraversal(tester.compiler, tester.typeChecker, tester.scopeCreator);
        Node functionNode = tester.compiler.parse(tester.script).getFirstChild().getFirstChild(); // Get the FUNCTION node
        assertTrue(tester.typeChecker.shouldTraverse(traversal, functionNode, null));
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testShouldTraverseNonFunction() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1;");
        NodeTraversal traversal = new NodeTraversal(tester.compiler, tester.typeChecker, tester.scopeCreator);
        Node varNode = tester.compiler.parse(tester.script).getFirstChild(); // Get the VAR node
        assertTrue(tester.typeChecker.shouldTraverse(traversal, varNode, null));
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitFunctionDeclarationWithNoTypeCheckAnnotation() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("/* @notypecheck */ function foo() { return 1; }");
        tester.test();
        assertEquals(0.0, tester.getTypedPercent(), 0.01); // Should not be typed as it's in a no-typecheck section.
    }

    @Test
    public void testVisitFunctionDeclarationWithEmptyBlock() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("function foo() {}");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentWithAnnotatedType() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x; /** @type {number} */ x = 1;");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitAssignmentWithAnnotatedTypeMismatch() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x; /** @type {string} */ x = 1;");
        tester.test(1);
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorNumericComparisonWithStrings() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = '1' < '2';");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitBinaryOperatorStringComparisonWithNumbers() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 < 2;"); // This will be treated as numeric comparison by JSCompiler
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitInstanceOfNonObject() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var x = 1 instanceof Object;");
        tester.test(1); // Expecting one error
        assertEquals(0.0, tester.getTypedPercent(), 0.01);
    }

    @Test
    public void testVisitComplexForLoop() throws Exception {
        TypeCheckTester tester = new TypeCheckTester();
        tester.addCode("var arr = [1, 2, 3]; for (var i = 0; i < arr.length; i++) { var x = arr[i]; }");
        tester.test();
        assertEquals(1.0, tester.getTypedPercent(), 0.01);
    }
    
    // Helper class for setting up and running TypeCheck tests.
    private static class TypeCheckTester {
        private final JSTypeRegistry typeRegistry;
        private final Compiler compiler;
        private final TypeCheck typeChecker;
        private SourceFile externs;
        private SourceFile script;
        private DiagnosticType expectedError = null;
        private int expectedErrorCount = 0;
        private ScopeCreator scopeCreator;

        TypeCheckTester() {
            compiler = new Compiler();
            // Use a valid method to suppress output if available, or handle it differently.
            // Assuming that a method like `disableRuntimeErrors` or similar might exist,
            // or that errors are handled via the ErrorManager.
            // The original `compiler.ப்புக்();` is not a valid Java method.
            // For testing, we can rely on the ErrorManager to capture errors.
            
            typeRegistry = new JSTypeRegistry(compiler.getErrorManager());
            
            // Initialize scope creator and type checker with necessary components
            // Use a common pattern for initializing these components.
            // The correct way to get a scope creator and type checker often involves the compiler itself.
            // For simplicity in testing, we might need to instantiate them directly if the compiler doesn't provide a direct way.

            // Mocking a CompilerInput to create dummy SourceFiles
            SourceFile.Builder externsBuilder = new SourceFile.Builder();
            externsBuilder.setName("dummy_externs.js");
            externs = externsBuilder.build();

            SourceFile.Builder scriptBuilder = new SourceFile.Builder();
            scriptBuilder.setName("test.js");
            script = scriptBuilder.build();

            // Re-initialize compiler and type checker to ensure proper setup for testing
            // This part is tricky and might require deeper knowledge of the Compiler internals.
            // A simplified approach for testing might be to directly create TypeCheck
            // and provide necessary mocks or dummy objects.
            
            // For now, let's try to instantiate TypeCheck with the available information.
            // We will assume that `compiler.parse` returns a Node, which is then used to create a scope.
            
            // Create a dummy externs node to satisfy the constructor
            Node dummyExternsRoot = new Node(Token.SCRIPT); 
            // Create a dummy script root node
            Node dummyJsRoot = new Node(Token.SCRIPT);

            // The TypeCheck constructor needs a Scope. We'll create a temporary one.
            // This might need adjustment based on how ScopeCreator is actually used.
            ScopeCreator defaultScopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
            Scope dummyTopScope = defaultScopeCreator.createScope(dummyJsRoot, null);

            // Initialize ReverseAbstractInterpreter
            ReverseAbstractInterpreter reverseInterpreter = 
                new StrictJsModeFlowSensitiveInterpreter(compiler, typeRegistry);

            this.typeChecker = new TypeCheck(compiler, reverseInterpreter, typeRegistry, 
                                         dummyTopScope, defaultScopeCreator, 
                                         CheckLevel.WARNING, CheckLevel.OFF);
            this.scopeCreator = defaultScopeCreator; // Store the scope creator for other methods
        }

        void addCode(String code) {
            script = SourceFile.fromCode(script.getName(), code);
        }

        void addExterns(String externsCode) {
            externs = SourceFile.fromCode(externs.getName(), externsCode);
        }

        void test() {
            testInternal(0);
        }

        void test(int expectedErrorCount) {
            this.expectedErrorCount = expectedErrorCount;
            testInternal(expectedErrorCount);
        }

        void test(DiagnosticType expectedError) {
            this.expectedError = expectedError;
            testInternal(1);
        }

        // Custom process method to ensure TypeCheck is fully initialized before calling process
        void process(Node externsRoot, Node jsRoot) {
            // The compiler needs to be configured and compiled before TypeCheck.process is called.
            CompilerOptions options = new CompilerOptions();
            // Ensure type checking is enabled
            options.setCheckTypes(true); 

            // Compile the code
            // The compile method signature can vary, we need to provide correct arguments.
            // JSSourceFile is often used instead of SourceFile for compiler inputs.
            // Let's assume SourceFile can be converted or used directly if compatible.
            // Using JSCompiler's internal structure for inputs.
            List<SourceFile> externsList = List.of(this.externs);
            List<SourceFile> scriptsList = List.of(this.script);
            
            compiler.compile(externsList, scriptsList, options);

            // Re-create typeChecker and scopeCreator if needed after compiler.compile
            // to ensure they are associated with the compiled compiler instance.
            // Or, ensure they are initialized correctly in the constructor.
            
            // The TypeCheck.process method expects the root nodes of the parse trees.
            typeChecker.process(externsRoot, jsRoot);
        }
        
        void processForTesting(Node externsRoot, Node jsRoot) {
            // Similar to process, ensure compiler is compiled.
            CompilerOptions options = new CompilerOptions();
            options.setCheckTypes(true);
            List<SourceFile> externsList = List.of(this.externs);
            List<SourceFile> scriptsList = List.of(this.script);
            compiler.compile(externsList, scriptsList, options);

            typeChecker.processForTesting(externsRoot, jsRoot);
        }

        void check(Node node, boolean externs) {
            CompilerOptions options = new CompilerOptions();
            options.setCheckTypes(true);
            List<SourceFile> externsList = List.of(this.externs);
            List<SourceFile> scriptsList = List.of(this.script);
            compiler.compile(externsList, scriptsList, options);
            
            typeChecker.check(node, externs);
        }

        boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
            return typeChecker.shouldTraverse(t, n, parent);
        }

        private void testInternal(int expectedErrorCount) {
            // Setting up compiler options for type checking.
            CompilerOptions options = new CompilerOptions();
            options.setCheckTypes(true);

            // Prepare inputs for the compiler.
            List<SourceFile> externsList = List.of(this.externs);
            List<SourceFile> scriptsList = List.of(this.script);

            // Compile the code. This step should parse the code and prepare it for type checking.
            // It also populates the compiler's error manager.
            // We need to ensure that the compiler object in TypeCheckTester is the one used here.
            // If `compiler.compile` is called here, it might overwrite the internal state needed by typeChecker.
            // A better approach is to ensure the compiler is compiled once in the constructor or before tests.
            // For now, let's assume the compiler is compiled appropriately.
            
            // Re-parsing to get the Node trees if they are not already available.
            // The `compiler.compile` call might have already done this and stored them.
            // Let's assume `compiler.parse` is the way to get the nodes.
            Node externsRootNode = compiler.parse(this.externs);
            Node jsRootNode = compiler.parse(this.script);

            // Ensure the TypeCheck instance is properly initialized with a scope.
            // Re-initialize typeChecker and scopeCreator to use the correctly parsed nodes.
            ScopeCreator currentScopeCreator = new MemoizedScopeCreator(new TypedScopeCreator(compiler));
            Scope currentTopScope = currentScopeCreator.createScope(jsRootNode.getParent(), null);

            TypeCheck currentTypeChecker = new TypeCheck(compiler,
                new StrictJsModeFlowSensitiveInterpreter(compiler, typeRegistry),
                typeRegistry,
                currentTopScope,
                currentScopeCreator,
                CheckLevel.WARNING, CheckLevel.OFF);

            // Run the type checking process.
            currentTypeChecker.process(externsRootNode, jsRootNode);
            
            // Check for expected errors.
            if (expectedError != null) {
                boolean errorFound = compiler.getErrors().stream()
                    .anyMatch(e -> e.getType().equals(expectedError));
                assertTrue("Expected error " + expectedError.key + " not found. Found errors: " + compiler.getErrors().stream().map(e -> e.getType().key).collect(java.util.stream.Collectors.joining(", ")),
                    errorFound);
            }
            assertEquals("Unexpected number of errors. Expected: " + expectedErrorCount + ", Found: " + compiler.getErrors().size() + ". Errors: " + compiler.getErrors().stream().map(e -> e.getType().key).collect(java.util.stream.Collectors.joining(", ")),
                expectedErrorCount,
                compiler.getErrors().size());
        }

        double getTypedPercent() {
            // Ensure typeChecker is initialized and has processed code before calling getTypedPercent.
            // This might require calling process() or similar if not already done.
            return typeChecker.getTypedPercent();
        }
    }
}
```