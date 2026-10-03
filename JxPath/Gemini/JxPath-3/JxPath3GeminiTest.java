package org.apache.commons.jxpath.ri.model.beans;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;

public class JxPath3GeminiTest extends TestCase {

    public void testCreatePathStopsWhenFactoryReturnsSuccessForNullObject() {
        JXPathContext context = JXPathContext.newContext(new HashMap());

        context.setFactory(new AbstractFactory() {
            public boolean createObject(
                    JXPathContext context,
                    Pointer pointer,
                    Object parent,
                    String name,
                    int index) {

                ((Map) parent).put(name, null);
                return true;
            }
        });

        try {
            context.createPath("alpha/beta");
            fail("Expected JXPathException");
        } catch (JXPathException e) {
            Throwable cause = e;
            boolean found = false;

            while (cause != null) {
                if (cause instanceof JXPathAbstractFactoryException) {
                    found = true;
                    break;
                }
                cause = cause.getCause();
            }

            assertTrue(
                "Expected JXPathAbstractFactoryException in exception chain",
                found
            );
        }
    }
}
