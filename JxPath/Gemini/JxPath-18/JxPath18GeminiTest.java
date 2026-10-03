package org.apache.commons.jxpath.ri.model.dom;

public class JxPath18GeminiTest extends DOMModelTest {

    public JxPath18GeminiTest(String name) {
        super(name);
    }

    public void testAttributeNodeAxisFindsAllAttributes() {
        assertXPathValue(
            context,
            "count(vendor/product[1]/price:amount/attribute::node())",
            new Double(2));
    }
}
