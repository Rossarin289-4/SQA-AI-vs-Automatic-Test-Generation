package org.apache.commons.jxpath.ri.model.dom;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.xml.DOMParser;
import org.w3c.dom.Document;

public class JxPath1GeminiTest extends TestCase {

    public void testFindRootElementUsingDescendantAxis() {
        String xml = "<root id=\"1234\"/>";

        DOMParser parser = new DOMParser();
        Document document = (Document) parser.parseXML(
            new java.io.ByteArrayInputStream(xml.getBytes())
        );

        JXPathContext context = JXPathContext.newContext(document);

        Object result = context.selectSingleNode("//root");

        assertNotNull(result);
    }
}
