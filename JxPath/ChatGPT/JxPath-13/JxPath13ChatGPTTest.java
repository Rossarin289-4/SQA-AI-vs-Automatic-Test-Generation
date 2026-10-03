package org.apache.commons.jxpath.ri.model;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.xml.DocumentContainer;

public class JxPath13ChatGPTTest extends ExternalXMLNamespaceTest {

    public JxPath13ChatGPTTest(String name) {
        super(name);
    }

    public void testExternallyRegisteredAliasCreatesNamespacedAttribute() {
        JXPathContext context = createContext(DocumentContainer.MODEL_DOM);

        context.registerNamespace("Alias", "foo");

        assertXPathCreatePathAndSetValue(
            context,
            "/ElementA/@Alias:generated",
            "generatedValue",
            "/ElementA[1]/@Alias:generated");
    }
}
