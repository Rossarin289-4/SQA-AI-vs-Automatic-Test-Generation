package org.apache.commons.jxpath.ri.model.dom;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.jxpath.JXPathTestCase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class JxPath22ChatGPTTest extends JXPathTestCase {

    public void testInnerEmptyNamespaceIsReportedAsNull() throws Exception {
        InputStream input =
            JXPathTestCase.class.getResourceAsStream("InnerEmptyNamespace.xml");

        DocumentBuilderFactory factory =
            DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);

        Document document = factory.newDocumentBuilder().parse(input);
        Element testElement =
            (Element) document.getDocumentElement().getElementsByTagName("test").item(0);

        assertNull(DOMNodePointer.getNamespaceURI(testElement));
    }
}
