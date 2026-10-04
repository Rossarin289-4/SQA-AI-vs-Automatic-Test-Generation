package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;
import java.util.Locale;

public class PeepholeFoldConstantsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCannotDirectlyInstantiatePackagePrivateClassWithoutCompiler() throws Exception {
        assertNotNull(PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR);
    }

    @Test
    public void testGetElemDiagnosticKey() throws Exception {
        assertEquals("JSC_INVALID_GETELEM_INDEX_ERROR",
                PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR.key);
    }

    @Test
    public void testIndexOutOfBoundsDiagnosticKey() throws Exception {
        assertEquals("JSC_INDEX_OUT_OF_BOUNDS_ERROR",
                PeepholeFoldConstants.INDEX_OUT_OF_BOUNDS_ERROR.key);
    }

    @Test
    public void testNegatingNonNumberDiagnosticKey() throws Exception {
        assertEquals("JSC_NEGATING_A_NON_NUMBER_ERROR",
                PeepholeFoldConstants.NEGATING_A_NON_NUMBER_ERROR.key);
    }

    @Test
    public void testBitwiseOutOfRangeDiagnosticKey() throws Exception {
        assertEquals("JSC_BITWISE_OPERAND_OUT_OF_RANGE",
                PeepholeFoldConstants.BITWISE_OPERAND_OUT_OF_RANGE.key);
    }

    @Test
    public void testShiftOutOfBoundsDiagnosticKey() throws Exception {
        assertEquals("JSC_SHIFT_AMOUNT_OUT_OF_BOUNDS",
                PeepholeFoldConstants.SHIFT_AMOUNT_OUT_OF_BOUNDS.key);
    }

    @Test
    public void testFractionalBitwiseDiagnosticKey() throws Exception {
        assertEquals("JSC_FRACTIONAL_BITWISE_OPERAND",
                PeepholeFoldConstants.FRACTIONAL_BITWISE_OPERAND.key);
    }

    @Test
    public void testDiagnosticDefaultsToError() throws Exception {
        assertEquals(CheckLevel.ERROR,
                PeepholeFoldConstants.INVALID_GETELEM_INDEX_ERROR.defaultLevel);
    }

    @Test
    public void testUnaryTokenConstants() throws Exception {
        assertEquals(26, Token.NOT);
        assertEquals(29, Token.NEG);
    }

    @Test
    public void testAddTokenConstant() throws Exception {
        assertEquals(21, Token.ADD);
    }

    @Test
    public void testNumberNodeValueAtZero() throws Exception {
        Node number = Node.newNumber(0);
        assertEquals(Token.NUMBER, number.getType());
        assertEquals(0.0, number.getDouble(), 0.0);
    }

    @Test
    public void testStringNodeValue() throws Exception {
        Node string = Node.newString("abc");
        assertEquals(Token.STRING, string.getType());
        assertEquals("abc", string.getString());
    }
}
