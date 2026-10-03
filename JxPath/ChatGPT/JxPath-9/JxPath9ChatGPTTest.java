package org.apache.commons.jxpath.ri.compiler;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;

public class JxPath9ChatGPTTest extends TestCase {

    public void testNaNEqualityAndInequalityWithFiniteValue() {
        JXPathContext context = JXPathContext.newContext(null);
        Variables variables = context.getVariables();

        variables.declareVariable(
            "undefinedNumber",
            new Double(Double.NaN));

        variables.declareVariable(
            "ordinaryNumber",
            new Double(42.0));

        assertEquals(
            Boolean.FALSE,
            context.getValue("$undefinedNumber = $ordinaryNumber"));

        assertEquals(
            Boolean.FALSE,
            context.getValue("$undefinedNumber != $ordinaryNumber"));
    }
}
