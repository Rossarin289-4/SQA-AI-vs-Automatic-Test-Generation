package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.Variables;

public class JxPath10ChatGPTTest extends JXPathTestCase {

    public JxPath10ChatGPTTest(String name) {
        super(name);
    }

    private JXPathContext context;

    public void setUp() {
        context = JXPathContext.newContext(null);

        Variables vars = context.getVariables();
        vars.declareVariable(
            "values",
            new double[] { 0.25, 0.5, 0.75 });
    }

    public void testEmptyFilteredNodeSetLessThanValue() {
        assertXPathValue(
            context,
            "$values[position() < 1] < 10",
            Boolean.FALSE,
            Boolean.class);
    }
}
