package org.apache.commons.jxpath.ri.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathTestCase;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.xml.DocumentContainer;

public class JxPath19GeminiTest extends JXPathTestCase {

    public void testAliasedNamespaceIterationKeepsDistinctSiblingPositions() {
        DocumentContainer container =
            new DocumentContainer(
                JXPathTestCase.class.getResource("IterateAliasedNS.xml"),
                DocumentContainer.MODEL_DOM);

        JXPathContext context = JXPathContext.newContext(container);
        context.registerNamespace("alias", "ns");

        Iterator iterator =
            context.iteratePointers("/alias:doc/alias:elem");

        List paths = new ArrayList();
        while (iterator.hasNext()) {
            paths.add(((Pointer) iterator.next()).asPath());
        }

        assertEquals(
            list(
                "/alias:doc[1]/alias:elem[1]",
                "/alias:doc[1]/alias:elem[2]"),
            paths);
    }
}
