package org.apache.commons.jxpath.ri.model.dom;

public class JxPath11GeminiTest extends DOMModelTest {

    public JxPath11GeminiTest(String name) {
        super(name);
    }

    public void testRegisteredAliasResolvesNamespacedAttribute() {
        context.registerNamespace("price", "priceNS");
        context.registerNamespace("alias", "priceNS");

        assertXPathValue(
            context,
            "vendor/product/price:amount/@alias:discount",
            "10%");
    }
}
