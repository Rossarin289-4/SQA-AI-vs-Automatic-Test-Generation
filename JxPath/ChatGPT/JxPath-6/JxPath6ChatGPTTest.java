package org.apache.commons.jxpath.ri.compiler;

import java.util.HashMap;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;

public class JxPath6ChatGPTTest extends TestCase {

    public void testVariableCollectionComparisonAfterAccess() {
        HashMap bean = new HashMap();
        JXPathContext context = JXPathContext.newContext(bean);

        Variables variables = context.getVariables();
        variables.declareVariable(
            "items",
            new String[] {"alpha", "beta"});

        assertEquals(
            Boolean.TRUE,
            context.getValue("$items = 'alpha'"));

        assertEquals(
            Boolean.TRUE,
            context.getValue("$items = 'beta'"));
    }
}
