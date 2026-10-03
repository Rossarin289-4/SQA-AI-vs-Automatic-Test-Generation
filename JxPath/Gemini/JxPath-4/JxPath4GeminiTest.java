package org.apache.commons.jxpath.ri.model;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.xml.DocumentContainer;

public class JxPath4GeminiTest extends TestCase {

    public void testXmlSpacePreserveKeepsWhitespace() {
        DocumentContainer container = new DocumentContainer(
            JXPathTestCase.class.getResource("XmlSpace.xml"),
            DocumentContainer.MODEL_DOM
        );

        JXPathContext context = JXPathContext.newContext(container);

        Object value = context.getValue("test/text[@id='preserve']");

        assertEquals(" foo ", value);
    }
}
