package org.apache.commons.jxpath.ri.model.dom;

public class JxPath17GeminiTest extends DOMModelTest {

    public JxPath17GeminiTest(String name) {
        super(name);
    }

    public void testWildcardAttributeIncludesNamespacedAttribute() {
        assertXPathValueIterator(
            context,
            "vendor/product[1]/price:amount/@*",
            list("20%", "10%"));
    }
}
