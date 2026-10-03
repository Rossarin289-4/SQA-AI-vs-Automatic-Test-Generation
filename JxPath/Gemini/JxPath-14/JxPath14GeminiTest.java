package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;

public class JxPath14GeminiTest extends JXPathTestCase {

    public JxPath14GeminiTest(String name) {
        super(name);
    }

    public void testRoundGeneratedNaN() {
        JXPathContext context = JXPathContext.newContext(null);

        assertXPathValue(
            context,
            "round(0 div 0)",
            new Double(Double.NaN));
    }
}
