package org.apache.commons.jxpath.ri.compiler;

import java.util.Arrays;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;

public class JxPath7ChatGPTTest extends TestCase {

    public void testVariableCollectionRelationalComparison() {
        JXPathContext context = JXPathContext.newContext(null);
        Variables variables = context.getVariables();

        variables.declareVariable(
            "values",
            Arrays.asList(
                new Double(2.0),
                new Double(5.0),
                new Double(8.0)));

        assertEquals(
            Boolean.TRUE,
            context.getValue("$values > 4"));

        assertEquals(
            Boolean.TRUE,
            context.getValue("$values < 3"));

        assertEquals(
            Boolean.FALSE,
            context.getValue("$values > 9"));
    }
}
