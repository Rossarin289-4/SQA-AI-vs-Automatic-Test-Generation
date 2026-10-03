package org.apache.commons.jxpath.ri.axes;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.xml.DocumentContainer;

public class JxPath15GeminiTest extends JXPathTestCase {

    public JxPath15GeminiTest(String name) {
        super(name);
    }

    public void testUnionReturnsNodesInDocumentOrder() {
        DocumentContainer container =
            new DocumentContainer(
                JXPathTestCase.class.getResource("Vendor.xml"),
                DocumentContainer.MODEL_DOM);

        JXPathContext context = JXPathContext.newContext(container);

        assertXPathValue(
            context,
            "string((/vendor/contact[3] | /vendor/contact[1])[1])",
            "John");
    }
}
