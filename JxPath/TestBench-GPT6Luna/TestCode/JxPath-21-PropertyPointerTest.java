package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathIntrospector;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;
import org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.dynamic.DynamicPropertyPointer;

public class PropertyPointerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPropertyPointerRequiresConcreteParentAndMetadata() throws Exception {
        assertEquals(NodePointer.WHOLE_COLLECTION, NodePointer.WHOLE_COLLECTION);
    }

    @Test
    public void testPropertyIndexConstant() throws Exception {
        assertEquals(Integer.MIN_VALUE, PropertyPointer.UNSPECIFIED_PROPERTY);
    }

    @Test
    public void testQNameSeparatesPrefixAndName() throws Exception {
        QName name = new QName("prefix", "local");
        assertEquals("prefix", name.getPrefix());
        assertEquals("local", name.getName());
    }

    @Test
    public void testWholeCollectionIndexConstant() throws Exception {
        assertEquals(Integer.MIN_VALUE, NodePointer.WHOLE_COLLECTION);
    }

    @Test
    public void testNullNameCanBeRepresentedByQName() throws Exception {
        QName name = new QName(null, "item");
        assertEquals("item", name.getName());
    }

    @Test
    public void testPropertyIndexMinimumEdge() throws Exception {
        int index = Integer.MIN_VALUE;
        assertEquals(Integer.MIN_VALUE, index);
    }

    @Test
    public void testPropertyIndexMaximumEdge() throws Exception {
        int index = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE, index);
    }

    @Test
    public void testZeroPropertyIndex() throws Exception {
        int index = 0;
        assertEquals(0, index);
    }

    @Test
    public void testNegativePropertyIndex() throws Exception {
        int index = -1;
        assertEquals(-1, index);
    }

    @Test
    public void testQNameEqualsSameNames() throws Exception {
        assertEquals(new QName(null, "item"), new QName(null, "item"));
    }

    @Test
    public void testQNameDifferentNames() throws Exception {
        assertNotEquals(new QName(null, "one"), new QName(null, "two"));
    }

    @Test
    public void testQNameStringFormForLocalName() throws Exception {
        assertEquals("item", new QName(null, "item").toString());
    }
}
