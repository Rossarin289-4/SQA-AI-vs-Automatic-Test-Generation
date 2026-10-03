package org.apache.commons.jxpath.ri.model;

import java.util.HashMap;

import junit.framework.TestCase;

import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Pointer;

public class JxPath5ChatGPTTest extends TestCase {

    public void testComparePointersFromDifferentTrees() {
        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();

        map1.put("value", "one");
        map2.put("value", "two");

        JXPathContext context1 = JXPathContext.newContext(map1);
        JXPathContext context2 = JXPathContext.newContext(map2);

        Pointer pointer1 = context1.getPointer("/value");
        Pointer pointer2 = context2.getPointer("/value");

        int result = pointer1.compareTo(pointer2);

        assertEquals(0, result);
    }
}
