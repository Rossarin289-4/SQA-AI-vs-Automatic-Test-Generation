package org.apache.commons.jxpath.ri.compiler;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.xml.DocumentContainer;

public class JxPath20GeminiTest extends JXPathTestCase {

    public void testScalarComparedToNodeSetPreservesOperandOrder() {
        DocumentContainer container =
            new DocumentContainer(
                JXPathTestCase.class.getResource("Vendor.xml"),
                DocumentContainer.MODEL_DOM);

        JXPathContext context = JXPathContext.newContext(container);

        assertXPathValue(
            context,
            "45 <= /vendor/product/price:amount",
            Boolean.TRUE,
            Boolean.class);
    }
}
