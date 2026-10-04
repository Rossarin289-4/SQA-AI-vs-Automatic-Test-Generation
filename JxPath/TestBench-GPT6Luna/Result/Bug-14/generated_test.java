package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.JXPathInvalidSyntaxException;
import org.apache.commons.jxpath.NodeSet;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.model.NodePointer;

public class CoreFunctionTest {
    @Test
    public void testFunctionCodeAndZeroArguments() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(Compiler.FUNCTION_TRUE, f.getFunctionCode());
        assertEquals(0, f.getArgumentCount());
    }

    @Test
    public void testArgumentCountForEmptyArray() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_FALSE, new Expression[0]);
        assertEquals(0, f.getArgumentCount());
    }

    @Test
    public void testArgumentCountAtOne() throws Exception {
        Expression[] args = new Expression[] { null };
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_BOOLEAN, args);
        assertEquals(1, f.getArgumentCount());
        assertSame(args[0], f.getArg1());
    }

    @Test
    public void testArgumentCountAtThreeAndArgumentAccessors() throws Exception {
        Expression[] args = new Expression[] { null, null, null };
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRANSLATE, args);
        assertEquals(3, f.getArgumentCount());
        assertSame(args[0], f.getArg1());
        assertSame(args[1], f.getArg2());
        assertSame(args[2], f.getArg3());
    }

    @Test
    public void testToStringKnownFunctionWithoutArguments() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals("true()", f.toString());
    }

    @Test
    public void testToStringUnknownFunction() throws Exception {
        CoreFunction f = new CoreFunction(999, null);
        assertEquals("unknownFunction999()()", f.toString());
    }

    @Test
    public void testComputeContextDependentLast() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_LAST, null);
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentPosition() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_POSITION, null);
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentBooleanWithNoArguments() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_BOOLEAN, null);
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextIndependentBooleanWithArgument() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_BOOLEAN, new Expression[] { null });
        assertFalse(f.computeContextDependent());
    }

    @Test
    public void testComputeContextIndependentCount() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_COUNT, new Expression[] { null });
        assertFalse(f.computeContextDependent());
    }

    @Test
    public void testComputeContextDependentFormatNumberWithTwoArguments() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] { null, null });
        assertTrue(f.computeContextDependent());
    }

    @Test
    public void testComputeContextIndependentFormatNumberWithThreeArguments() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_FORMAT_NUMBER, new Expression[] { null, null, null });
        assertFalse(f.computeContextDependent());
    }

    @Test
    public void testComputeTrue() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(Boolean.TRUE, f.compute(null));
    }

    @Test
    public void testComputeFalse() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_FALSE, null);
        assertEquals(Boolean.FALSE, f.compute(null));
    }

    @Test
    public void testComputeNull() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_NULL, null);
        assertNull(f.computeValue(null));
    }

    @Test
    public void testComputeValueUnknownFunction() throws Exception {
        CoreFunction f = new CoreFunction(999, null);
        assertNull(f.computeValue(null));
    }

    @Test
    public void testComputeTrueAndComputeValueAgree() throws Exception {
        CoreFunction f = new CoreFunction(Compiler.FUNCTION_TRUE, null);
        assertEquals(f.computeValue(null), f.compute(null));
    }
}
