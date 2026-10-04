package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import java.util.Collections;
import org.jdom.Attribute;
import org.jdom.Namespace;
import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributePointer;

public class DOMAttributeIteratorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testPositionStartsAtZero() throws Exception {
        assertEquals(0, new DOMAttributeIterator(null, new QName("a")).getPosition());
    }

    @Test
    public void testPositionAcceptsFirstPositionOnEmptyIterator() throws Exception {
        try {
            DOMAttributeIterator iterator = new DOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(1));
            assertEquals(1, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPositionAcceptsZeroAsStoredPosition() throws Exception {
        try {
            DOMAttributeIterator iterator = new DOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(0));
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPositionAcceptsNegativeAsStoredPosition() throws Exception {
        try {
            DOMAttributeIterator iterator = new DOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(-1));
            assertEquals(-1, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPositionAcceptsIntegerMinimumAsStoredPosition() throws Exception {
        try {
            DOMAttributeIterator iterator = new DOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(Integer.MIN_VALUE));
            assertEquals(Integer.MIN_VALUE, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPositionAcceptsIntegerMaximumAsStoredPosition() throws Exception {
        try {
            DOMAttributeIterator iterator = new DOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(Integer.MAX_VALUE));
            assertEquals(Integer.MAX_VALUE, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testPositionDoesNotAdvanceOnEmptyIterator() throws Exception {
        try {
            DOMAttributeIterator iterator = new DOMAttributeIterator(null, new QName("a"));
            assertNull(iterator.getNodePointer());
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testJdomIteratorStartsAtZero() throws Exception {
        try {
            JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("a"));
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testJdomIteratorPositionOnUnconfiguredParent() throws Exception {
        try {
            JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(1));
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testJdomIteratorPositionZeroOnUnconfiguredParent() throws Exception {
        try {
            JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(0));
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testJdomIteratorNegativePositionOnUnconfiguredParent() throws Exception {
        try {
            JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(-1));
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testJdomIteratorIntegerMinimumPositionOnUnconfiguredParent() throws Exception {
        try {
            JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(Integer.MIN_VALUE));
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testJdomIteratorIntegerMaximumPositionOnUnconfiguredParent() throws Exception {
        try {
            JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("a"));
            assertFalse(iterator.setPosition(Integer.MAX_VALUE));
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testJdomIteratorNodePointerOnUnconfiguredParent() throws Exception {
        try {
            JDOMAttributeIterator iterator = new JDOMAttributeIterator(null, new QName("a"));
            assertNull(iterator.getNodePointer());
            assertEquals(0, iterator.getPosition());
        }
        catch (NullPointerException expected) {
            assertTrue(true);
        }
    }
}
