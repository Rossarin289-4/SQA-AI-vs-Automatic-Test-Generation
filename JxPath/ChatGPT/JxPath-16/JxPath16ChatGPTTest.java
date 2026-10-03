package org.apache.commons.jxpath.ri.model.dom;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.xml.DocumentContainer;

public class JxPath16ChatGPTTest extends JXPathTestCase {

    public JxPath16ChatGPTTest(String name) {
        super(name);
    }

    public void testNodeAxisIncludesTextNodes() {
        DocumentContainer container =
            new DocumentContainer(
                JXPathTestCase.class.getResource("Vendor.xml"),
                DocumentContainer.MODEL_DOM);

        JXPathContext context = JXPathContext.newContext(container);

        assertXPathValue(
            context,
            "count(/vendor/contact[1]/node())",
            new Double(1));
    }
}
