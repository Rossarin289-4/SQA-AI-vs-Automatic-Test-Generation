package org.apache.commons.jxpath.ri.model.dom;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.xml.DocumentContainer;

public class JxPath12GeminiTest extends JXPathTestCase {

    public JxPath12GeminiTest(String name) {
        super(name);
    }

    public void testPrefixedElementWithoutNamespaceUri() {
        DocumentContainer container =
            new DocumentContainer(
                JXPathTestCase.class.getResource("ExternalNS.xml"),
                DocumentContainer.MODEL_DOM);

        container.setNamespaceAware(false);

        JXPathContext context = JXPathContext.newContext(container);
        context.registerNamespace("B", "bar");

        assertXPathValue(
            context,
            "count(/ElementA/B:*)",
            new Double(1));
    }
}
