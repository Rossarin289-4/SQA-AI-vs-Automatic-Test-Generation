package org.apache.commons.jxpath.ri.model;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.TestNull;

public class JxPath21GeminiTest extends JXPathTestCase {

    public void testIndexedNestedNullPropertyIsRetained() {
        JXPathContext context =
            JXPathContext.newContext(null);

        context.getVariables().declareVariable(
            "testnull",
            new TestNull());

        assertXPathValueIterator(
            context,
            "$testnull/child/nothing[1]",
            list((Object) null));
    }
}
