package org.apache.commons.jxpath.ri.compiler;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;

public class JxPath8ChatGPTTest extends TestCase {

    public void testNaNGreaterThanOrEqualFiniteValue() {
        JXPathContext context = JXPathContext.newContext(null);
        Variables variables = context.getVariables();

        variables.declareVariable(
            "specialValue",
            new Double(Double.NaN));

        assertEquals(
            Boolean.FALSE,
            context.getValue("$specialValue >= -100"));
    }
}
