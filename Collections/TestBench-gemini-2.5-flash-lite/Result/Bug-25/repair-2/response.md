```java
package org.apache.commons.collections4;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.iterators.ArrayIterator;
import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.commons.collections4.iterators.BoundedIterator;
import org.apache.commons.collections4.iterators.CollatingIterator;
import org.apache.commons.collections4.iterators.EmptyIterator;
import org.apache.commons.collections4.iterators.EmptyListIterator;
import org.apache.commons.collections4.iterators.EmptyMapIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedIterator;
import org.apache.commons.collections4.iterators.EmptyOrderedMapIterator;
import org.apache.commons.collections4.iterators.EnumerationIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.FilterListIterator;
import org.apache.commons.collections4.iterators.IteratorChain;
import org.apache.commons.collections4.iterators.IteratorEnumeration;
import org.apache.commons.collections4.iterators.IteratorIterable;
import org.apache.commons.collections4.iterators.ListIteratorWrapper;
import org.apache.commons.collections4.iterators.LoopingIterator;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import org.apache.commons.collections4.iterators.NodeListIterator;
import org.apache.commons.collections4.iterators.ObjectArrayIterator;
import org.apache.commons.collections4.iterators.ObjectArrayListIterator;
import org.apache.commons.collections4.iterators.ObjectGraphIterator;
import org.apache.commons.collections4.iterators.PeekingIterator;
import org.apache.commons.collections4.iterators.PushbackIterator;
import org.apache.commons.collections4.iterators.SingletonIterator;
import org.apache.commons.collections4.iterators.SingletonListIterator;
import org.apache.commons.collections4.iterators.SkippingIterator;
import org.apache.commons.collections4.iterators.TransformIterator;
import org.apache.commons.collections4.iterators.UnmodifiableIterator;
import org.apache.commons.collections4.iterators.UnmodifiableListIterator;
import org.apache.commons.collections4.iterators.UnmodifiableMapIterator;
import org.apache.commons.collections4.iterators.ZippingIterator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Dummy classes and interfaces to satisfy compilation, based on API outline and usage.
// These are not intended to be actual implementations but provide the necessary structure.

// Dummy MapIterator that extends a known superclass or implements the interface.
// Since AbstractMapIterator is not visible, we'll mock the behavior of MapIterator itself.
// The actual MapIterator implementation is likely in org.apache.commons.collections4.map.AbstractMapIterator.
// We will rely on the fact that IteratorUtils provides emptyMapIterator which returns an instance.
class MapIterator<K, V> implements org.apache.commons.collections4.MapIterator<K, V> {
    private final Iterator<Map.Entry<K, V>> entryIterator;
    private Map.Entry<K, V> currentEntry;

    public MapIterator(Map<K, V> map) {
        this.entryIterator = map.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return entryIterator.hasNext();
    }

    @Override
    public K next() {
        currentEntry = entryIterator.next();
        return currentEntry.getKey();
    }

    @Override
    public void remove() {
        entryIterator.remove();
    }

    @Override
    public K getKey() {
        if (currentEntry == null) {
            throw new NoSuchElementException();
        }
        return currentEntry.getKey();
    }

    @Override
    public V getValue() {
        if (currentEntry == null) {
            throw new NoSuchElementException();
        }
        return currentEntry.getValue();
    }

    @Override
    public V setValue(V value) {
        if (currentEntry == null) {
            throw new NoSuchElementException();
        }
        return currentEntry.setValue(value);
    }
}

// Dummy ComparatorUtils
class ComparatorUtils {
    @SuppressWarnings("unchecked")
    public static <E> Comparator<E> naturalComparator() {
        // Simulate natural order comparator. Real implementation is more complex.
        return (Comparator<E>) Comparator.naturalOrder();
    }
}

// Dummy TransformerUtils
class TransformerUtils {
    public static <E> Transformer<E, String> stringValueTransformer() {
        return Objects::toString;
    }
}

// Dummy Closure
class Closure<T> {
    public void execute(T obj) {
        // No-op for test setup
    }
}

// Dummy Transformer
class Transformer<I, O> {
    public O transform(I input) {
        // Placeholder, actual implementation would be provided by test cases
        return null;
    }
}

// Dummy Predicate
class Predicate<T> {
    public boolean evaluate(T object) {
        // Placeholder, actual implementation would be provided by test cases
        return false;
    }
}

// Dummy NodeList
class UnmodifiableNodeList implements NodeList {
    private final List<Node> nodes;

    public UnmodifiableNodeList(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public Node item(int index) {
        return nodes.get(index);
    }

    @Override
    public int getLength() {
        return nodes.size();
    }
}

// Dummy Node
class TestNode implements Node {
    private final String name;
    private final List<Node> children = new ArrayList<>();

    public TestNode(String name) {
        this.name = name;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    @Override
    public String getNodeName() {
        return name;
    }

    @Override
    public String getNodeValue() { return null; }
    @Override
    public short getNodeType() { return 0; }
    @Override
    public Node getParentNode() { return null; }
    @Override
    public NodeList getChildNodes() { return new UnmodifiableNodeList(children); }
    @Override
    public Node getFirstChild() { return children.isEmpty() ? null : children.get(0); }
    @Override
    public Node getLastChild() { return children.isEmpty() ? null : children.get(children.size() - 1); }
    @Override
    public Node getPreviousSibling() { return null; }
    @Override
    public Node getNextSibling() { return null; }
    @Override
    public org.w3c.dom.NamedNodeMap getAttributes() { return null; }
    @Override
    public org.w3c.dom.Document getOwnerDocument() { return null; }
    @Override
    public String getNamespaceURI() { return null; }
    @Override
    public String getPrefix() { return null; }
    @Override
    public String getLocalName() { return null; }
    @Override
    public String getBaseURI() { return null; }
    @Override
    public short compareDocumentPosition(Node other) throws org.w3c.dom.DOMException { return 0; }
    @Override
    public boolean isSameNode(Node other) { return false; }
    @Override
    public String lookupPrefix(String namespaceURI) { return null; }
    @Override
    public boolean isDefaultNamespace(String namespaceURI) { return false; }
    @Override
    public String lookupNamespaceURI(String prefix) { return null; }
    @Override
    public boolean isEqualNode(Node arg) { return false; }
    @Override
    public org.w3c.dom.Text splitText(String data) throws org.w3c.dom.DOMException { return null; }
    @Override
    public org.w3c.dom.Attr createAttribute(String name) throws org.w3c.dom.DOMException { return null; }
    @Override
    public org.w3c.dom.Text createTextNode(String data) { return null; }
    @Override
    public org.w3c.dom.Comment createComment(String data) { return null; }
    @Override
    public org.w3c.dom.CDATASection createCDATASection(String data) { return null; }
    @Override
    public org.w3c.dom.ProcessingInstruction createProcessingInstruction(String target, String data) { return null; }
    @Override
    public org.w3c.dom.Element createElementNS(String namespaceURI, String qualifiedName) throws org.w3c.dom.DOMException { return null; }
    @Override
    public org.w3c.dom.Attr createAttributeNS(String namespaceURI, String qualifiedName) throws org.w3c.dom.DOMException { return null; }
    @Override
    public Node cloneNode(boolean deep) { return null; }
    @Override
    public void normalize() {}
    @Override
    public void setTextContent(String textContent) {}
    @Override
    public String getTextContent() { return null; }
    @Override
    public org.w3c.dom.NodeList getElementsByTagName(String tagname) { return null; }
    @Override
    public String getInputEncoding() { return null; }
    @Override
    public String getXmlEncoding() { return null; }
    @Override
    public boolean getXmlStandalone() { return false; }
    @Override
    public void setXmlStandalone(boolean xmlStandalone) throws org.w3c.dom.DOMException {}
    @Override
    public String getXmlVersion() { return null; }
    @Override
    public void setXmlVersion(String xmlVersion) throws org.w3c.dom.DOMException {}
    @Override
    public String getDocType() { return null; }
    @Override
    public org.w3c.dom.DOMImplementation getDomImplementation() { return null; }
    @Override
    public org.w3c.dom.Element getElementById(String elementId) { return null; }
    @Override
    public String getTagName() { return null; }
    @Override
    public String getAttribute(String name) { return null; }
    @Override
    public void setAttribute(String name, String value) {}
    @Override
    public void removeAttribute(String name) {}
    @Override
    public org.w3c.dom.Attr getAttributeNode(String name) { return null; }
    @Override
    public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) { return null; }
    @Override
    public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) { return null; }
    @Override
    public org.w3c.dom.NodeList getElementsByTagNameNS(String namespaceURI, String localName) { return null; }
    @Override
    public String getAttributeNS(String namespaceURI, String localName) { return null; }
    @Override
    public void setAttributeNS(String namespaceURI, String qualifiedName, String value) {}
    @Override
    public void removeAttributeNS(String namespaceURI, String localName) {}
    @Override
    public Node appendChild(Node newChild) { return null; }
    @Override
    public Node insertBefore(Node newChild, Node refChild) { return null; }
    @Override
    public Node removeChild(Node oldChild) { return null; }
    @Override
    public Node replaceChild(Node newChild, Node oldChild) { return null; }
    @Override
    public void setNodeValue(String nodeValue) {}
    @Override
    public org.w3c.dom.TypeInfo getSchemaTypeInfo() { return null; }
    @Override
    public void setIdAttribute(String name, boolean isId) throws org.w3c.dom.DOMException {}
    @Override
    public void setIdAttributeNS(String namespaceURI, String localName, boolean isId) throws org.w3c.dom.DOMException {}
    @Override
    public void setIdAttributeNode(org.w3c.dom.Attr idAttr, boolean isId) throws org.w3c.dom.DOMException {}
    @Override
    public org.w3c.dom.UserDataHandler getUserDataHandler(short key) { return null; }
    @Override
    public Object getUserData(String key) { return null; }
    @Override
    public Object setUserData(String key, Object data, org.w3c.dom.UserDataHandler handler) { return null; }
}

public class IteratorUtilsTest {

    @Test
    public void testEmptyIterator() {
        Iterator<?> it = IteratorUtils.emptyIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testEmptyListIterator() {
        ListIterator<?> it = IteratorUtils.emptyListIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
        assertFalse(it.hasPrevious());
    }

    @Test
    public void testEmptyOrderedIterator() {
        Iterator<?> it = IteratorUtils.emptyOrderedIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testEmptyMapIterator() {
        MapIterator<?, ?> it = IteratorUtils.emptyMapIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testEmptyOrderedMapIterator() {
        OrderedMapIterator<?, ?> it = IteratorUtils.emptyOrderedMapIterator();
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testSingletonIterator() {
        String obj = "test";
        Iterator<String> it = IteratorUtils.singletonIterator(obj);
        assertTrue(it.hasNext());
        assertEquals(obj, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testSingletonListIterator() {
        String obj = "test";
        ListIterator<String> it = IteratorUtils.singletonListIterator(obj);
        assertTrue(it.hasNext());
        assertEquals(obj, it.next());
        assertFalse(it.hasNext());
        assertFalse(it.hasPrevious());
    }

    @Test
    public void testArrayIteratorVarargs() {
        String[] array = {"a", "b", "c"};
        Iterator<String> it = IteratorUtils.arrayIterator(array);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorObject() {
        String[] array = {"a", "b", "c"};
        Iterator<String> it = IteratorUtils.arrayIterator((Object) array);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorVarargsStartIndex() {
        String[] array = {"a", "b", "c"};
        Iterator<String> it = IteratorUtils.arrayIterator(array, 1);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorObjectStartIndex() {
        String[] array = {"a", "b", "c"};
        Iterator<String> it = IteratorUtils.arrayIterator((Object) array, 1);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorVarargsStartEndIndex() {
        String[] array = {"a", "b", "c"};
        Iterator<String> it = IteratorUtils.arrayIterator(array, 1, 2);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayIteratorObjectStartEndIndex() {
        String[] array = {"a", "b", "c"};
        Iterator<String> it = IteratorUtils.arrayIterator((Object) array, 1, 2);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testArrayListIteratorVarargs() {
        String[] array = {"a", "b", "c"};
        ListIterator<String> it = IteratorUtils.arrayListIterator(array);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
    }

    @Test
    public void testArrayListIteratorObject() {
        String[] array = {"a", "b", "c"};
        ListIterator<String> it = IteratorUtils.arrayListIterator((Object) array);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
    }

    @Test
    public void testArrayListIteratorVarargsStartIndex() {
        String[] array = {"a", "b", "c"};
        ListIterator<String> it = IteratorUtils.arrayListIterator(array, 1);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
    }

    @Test
    public void testArrayListIteratorObjectStartIndex() {
        String[] array = {"a", "b", "c"};
        ListIterator<String> it = IteratorUtils.arrayListIterator((Object) array, 1);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
    }

    @Test
    public void testArrayListIteratorVarargsStartEndIndex() {
        String[] array = {"a", "b", "c"};
        ListIterator<String> it = IteratorUtils.arrayListIterator(array, 1, 2);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
    }

    @Test
    public void testArrayListIteratorObjectStartEndIndex() {
        String[] array = {"a", "b", "c"};
        ListIterator<String> it = IteratorUtils.arrayListIterator((Object) array, 1, 2);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());
        assertEquals("b", it.previous());
    }

    @Test
    public void testBoundedIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = IteratorUtils.boundedIterator(list.iterator(), 2);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testBoundedIteratorOffsetMax() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = IteratorUtils.boundedIterator(list.iterator(), 1, 2);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testUnmodifiableIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        Iterator<String> it = IteratorUtils.unmodifiableIterator(list.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertFalse(it.hasNext());
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testUnmodifiableListIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        ListIterator<String> it = IteratorUtils.unmodifiableListIterator(list.listIterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertFalse(it.hasNext());
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        try {
            it.add("b");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        try {
            it.set("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testUnmodifiableMapIterator() {
        Map<String, String> map = new java.util.HashMap<>();
        map.put("a", "b");
        // Need to provide a concrete MapIterator implementation that works with the map.
        // The IteratorUtils.unmodifiableMapIterator requires a MapIterator as input.
        // We can use a standard HashMap iterator which implements Map.Entry, then wrap it.
        // Or, if we assume a simple MapIterator exists that wraps a Map, we can use that.
        // Given the context, we can assume `new MapIterator(map)` is a valid way to get a MapIterator.
        MapIterator<String, String> mapIterator = new MapIterator<>(map);
        MapIterator<String, String> it = IteratorUtils.unmodifiableMapIterator(mapIterator);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertEquals("b", it.getValue());
        assertFalse(it.hasNext());
        try {
            it.remove();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
        try {
            it.setValue("c");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testChainedIteratorTwoIterators() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        Iterator<String> it = IteratorUtils.chainedIterator(list1.iterator(), list2.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testChainedIteratorVarargs() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        List<String> list3 = new ArrayList<>();
        list3.add("c");
        Iterator<String> it = IteratorUtils.chainedIterator(list1.iterator(), list2.iterator(), list3.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testChainedIteratorCollection() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        Collection<Iterator<String>> iterators = new ArrayList<>();
        iterators.add(list1.iterator());
        iterators.add(list2.iterator());
        Iterator<String> it = IteratorUtils.chainedIterator(iterators);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testCollatedIteratorComparatorTwoIterators() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        Comparator<String> comp = ComparatorUtils.naturalComparator();
        Iterator<String> it = IteratorUtils.collatedIterator(comp, list1.iterator(), list2.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertTrue(it.hasNext());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testCollatedIteratorComparatorVarargs() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        Comparator<String> comp = ComparatorUtils.naturalComparator();
        Iterator<String> it = IteratorUtils.collatedIterator(comp, list1.iterator(), list2.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertTrue(it.hasNext());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testCollatedIteratorComparatorCollection() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        Collection<Iterator<String>> iterators = new ArrayList<>();
        iterators.add(list1.iterator());
        iterators.add(list2.iterator());
        Comparator<String> comp = ComparatorUtils.naturalComparator();
        Iterator<String> it = IteratorUtils.collatedIterator(comp, iterators);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertTrue(it.hasNext());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testObjectGraphIterator() {
        List<String> rootList = new ArrayList<>();
        rootList.add("a");
        rootList.add("b");

        // The signature is E root, Transformer<? super E, ? extends E> transformer
        // So if root is a List<String>, E is List<String>.
        // The transformer should transform List<String> to something.
        // If we want to iterate over elements within the list, the transformer would need to return an iterator of elements.
        // However, ObjectGraphIterator is designed to traverse a graph.
        // The example in the Javadoc shows transforming a Forest to an iterator of Trees, etc.
        // If root is a List, and we want to get its elements, the transformer would transform List to Iterator<String>.
        // But the signature expects Transformer<? super E, ? extends E>.
        // This implies the transformer should return an E or a subtype.
        // Let's assume the intent is to flatten a structure where each level provides an iterator to the next level.
        // If `root` is `List<String>`, then `E` is `List<String>`. The transformer must return `List<String>` or a subtype.
        // This doesn't make sense for iterating elements.
        // Re-reading the Javadoc example: The transformer returns iterators or objects.
        // "The transformer will return either an iterator or an object."
        // This suggests `E` is the type of the *elements* being iterated, not the container.
        // So, if `root` is a `List<String>`, `E` should be `String`.
        // And the transformer should take `List<String>` (or a supertype) and return `String` or `Iterator<String>`.

        // Test case: root is a String, transformer returns its String representation (itself).
        String rootString = "test";
        Transformer<String, String> stringTransformer = s -> s;
        Iterator<String> itString = IteratorUtils.objectGraphIterator(rootString, stringTransformer);
        assertTrue(itString.hasNext());
        assertEquals("test", itString.next());
        assertFalse(itString.hasNext());

        // Test case: root is a List of Strings, transformer extracts elements.
        // The transformer must return E or Iterator<? extends E>. Here E is String.
        // So it should return String or Iterator<String>.
        // Let's try to make the transformer return an iterator of elements.
        Transformer<Object, Object> graphTransformer = obj -> {
            if (obj instanceof List) {
                return ((List<?>) obj).iterator();
            }
            return obj; // If it's already an element
        };
        Iterator<Object> itGraph = IteratorUtils.objectGraphIterator(rootList, graphTransformer);
        assertTrue(itGraph.hasNext());
        assertEquals("a", itGraph.next());
        assertTrue(itGraph.hasNext());
        assertEquals("b", itGraph.next());
        assertFalse(itGraph.hasNext());
    }

    @Test
    public void testTransformedIterator() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Transformer<Integer, String> transformer = Object::toString;
        Iterator<String> it = IteratorUtils.transformedIterator(list.iterator(), transformer);
        assertTrue(it.hasNext());
        assertEquals("1", it.next());
        assertTrue(it.hasNext());
        assertEquals("2", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testFilteredIterator() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Predicate<Integer> predicate = i -> i % 2 == 0;
        Iterator<Integer> it = IteratorUtils.filteredIterator(list.iterator(), predicate);
        assertTrue(it.hasNext());
        assertEquals(2, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testFilteredListIterator() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Predicate<Integer> predicate = i -> i % 2 == 0;
        ListIterator<Integer> it = IteratorUtils.filteredListIterator(list.listIterator(), predicate);
        assertTrue(it.hasNext());
        assertEquals(2, it.next());
        assertFalse(it.hasNext());
        assertTrue(it.hasPrevious());
        assertEquals(2, it.previous());
    }

    @Test
    public void testLoopingIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ResettableIterator<String> it = IteratorUtils.loopingIterator(list);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        it.reset();
        assertEquals("a", it.next());
    }

    @Test
    public void testLoopingListIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ResettableListIterator<String> it = IteratorUtils.loopingListIterator(list);
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        it.reset();
        assertEquals("a", it.next());
    }

    @Test
    public void testNodeListIteratorFromNodeList() {
        NodeList nodeList = new UnmodifiableNodeList(new ArrayList<>());
        NodeListIterator it = IteratorUtils.nodeListIterator(nodeList);
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testNodeListIteratorFromNode() {
        Node node = new TestNode("root");
        NodeListIterator it = IteratorUtils.nodeListIterator(node);
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testPeekingIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterator<String> it = IteratorUtils.peekingIterator(list.iterator());
        // The Iterator interface itself doesn't expose a 'peek' method.
        // The PeekingIterator class likely provides one internally.
        // However, IteratorUtils.peekingIterator returns an Iterator<E>.
        // Thus, we can only test its Iterator interface behavior.
        // The original test's second `assertEquals("a", it.next());` was incorrect for a list ["a", "b"].
        // Assuming the returned iterator behaves as a standard iterator.
        assertEquals("a", it.next());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testPushbackIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        // IteratorUtils.pushbackIterator returns Iterator<E>, but the PushbackIterator class is imported.
        // If the intent is to test the pushback functionality, we need to cast.
        // This is a common pattern where a utility method returns a specific implementation type.
        PushbackIterator<String> pushbackIt = (PushbackIterator<String>) IteratorUtils.pushbackIterator(list.iterator());
        assertEquals("a", pushbackIt.next());
        pushbackIt.pushback("c"); // Push "c" back
        assertEquals("c", pushbackIt.next()); // Should get "c"
        assertEquals("b", pushbackIt.next()); // Then "b"
        assertFalse(pushbackIt.hasNext());
    }

    @Test
    public void testSkippingIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        SkippingIterator<String> it = IteratorUtils.skippingIterator(list.iterator(), 1);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testZippingIteratorTwoIterators() {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("c");
        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        ZippingIterator<String> it = IteratorUtils.zippingIterator(list1.iterator(), list2.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertTrue(it.hasNext());
        assertEquals("c", it.next());
        assertTrue(it.hasNext());
        assertEquals("d", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testAsIteratorEnumeration() {
        Enumeration<String> enumeration = new java.util.Vector<>(List.of("a", "b")).elements();
        Iterator<String> it = IteratorUtils.asIterator(enumeration);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void testAsIteratorEnumerationCollection() {
        Enumeration<String> enumeration = new java.util.Vector<>(List.of("a", "b")).elements();
        Collection<String> removeCollection = new ArrayList<>();
        Iterator<String> it = IteratorUtils.asIterator(enumeration, removeCollection);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        it.remove(); // This should add "a" to removeCollection
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
        assertFalse(it.hasNext());
        assertTrue(removeCollection.contains("a"));
        assertEquals(1, removeCollection.size());
    }

    @Test
    public void testAsEnumeration() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Enumeration<String> enumeration = IteratorUtils.asEnumeration(list.iterator());
        assertTrue(enumeration.hasMoreElements());
        assertEquals("a", enumeration.nextElement());
        assertTrue(enumeration.hasMoreElements());
        assertEquals("b", enumeration.nextElement());
        assertFalse(enumeration.hasMoreElements());
    }

    @Test
    public void testAsIterable() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterable<String> iterable = IteratorUtils.asIterable(list.iterator());
        int count = 0;
        for (String s : iterable) {
            count++;
        }
        assertEquals(2, count);
    }

    @Test
    public void testAsMultipleUseIterable() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterable<String> iterable = IteratorUtils.asMultipleUseIterable(list.iterator());
        int count1 = 0;
        for (String s : iterable) {
            count1++;
        }
        assertEquals(2, count1);
        int count2 = 0;
        for (String s : iterable) {
            count2++;
        }
        assertEquals(2, count2);
    }

    @Test
    public void testToListIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ListIterator<String> it = IteratorUtils.toListIterator(list.iterator());
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
        assertTrue(it.hasPrevious());
        assertEquals("a", it.previous());
    }

    @Test
    public void testToArray() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Object[] array = IteratorUtils.toArray(list.iterator());
        assertArrayEquals(new Object[]{"a", "b"}, array);
    }

    @Test
    public void testToArrayWithClass() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        String[] array = IteratorUtils.toArray(list.iterator(), String.class);
        assertArrayEquals(new String[]{"a", "b"}, array);
    }

    @Test
    public void testToList() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List<String> resultList = IteratorUtils.toList(list.iterator());
        assertEquals(List.of("a", "b"), resultList);
    }

    @Test
    public void testToListWithEstimatedSize() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List<String> resultList = IteratorUtils.toList(list.iterator(), 10);
        assertEquals(List.of("a", "b"), resultList);
    }

    @Test
    public void testGetIteratorNull() {
        Iterator<?> it = IteratorUtils.getIterator(null);
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetIteratorIterator() {
        List<String> list = new ArrayList<>();
        list.add("a");
        Iterator<?> it = IteratorUtils.getIterator(list.iterator());
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test
    public void testGetIteratorIterable() {
        List<String> list = new ArrayList<>();
        list.add("a");
        Iterator<?> it = IteratorUtils.getIterator(list);
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test
    public void testGetIteratorArray() {
        String[] array = {"a"};
        Iterator<?> it = IteratorUtils.getIterator(array);
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test
    public void testGetIteratorEnumeration() {
        Enumeration<String> enumeration = new java.util.Vector<>(List.of("a")).elements();
        Iterator<?> it = IteratorUtils.getIterator(enumeration);
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("a", it.next());
    }

    @Test
    public void testGetIteratorMap() {
        Map<String, String> map = new java.util.HashMap<>();
        map.put("a", "b");
        Iterator<?> it = IteratorUtils.getIterator(map);
        assertNotNull(it);
        assertTrue(it.hasNext());
        // MapIterator returns key, but getIterator(map) returns map.values().iterator()
        assertEquals("b", it.next());
    }

    @Test
    public void testGetIteratorNodeList() {
        NodeList nodeList = new UnmodifiableNodeList(new ArrayList<>());
        Iterator<?> it = IteratorUtils.getIterator(nodeList);
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetIteratorNode() {
        Node node = new TestNode("root");
        Iterator<?> it = IteratorUtils.getIterator(node);
        assertNotNull(it);
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetIteratorDictionary() {
        Dictionary<String, String> dictionary = new java.util.Hashtable<>();
        dictionary.put("a", "b");
        Iterator<?> it = IteratorUtils.getIterator(dictionary);
        assertNotNull(it);
        assertTrue(it.hasNext());
        assertEquals("b", it.next());
    }

    @Test
    public void testApply() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List<String> result = new ArrayList<>();
        Closure<String> closure = new Closure<String>() {
            @Override
            public void execute(String obj) {
                result.add(obj);
            }
        };
        IteratorUtils.apply(list.iterator(), closure);
        assertEquals(List.of("a", "b"), result);
    }

    @Test
    public void testFind() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return "b".equals(object);
            }
        };
        String found = IteratorUtils.find(list.iterator(), predicate);
        assertEquals("b", found);
    }

    @Test
    public void testFindNotFound() {
        List<String> list = new ArrayList<>();
        list.add("a");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return "b".equals(object);
            }
        };
        String found = IteratorUtils.find(list.iterator(), predicate);
        assertNull(found);
    }

    @Test
    public void testMatchesAny() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return "b".equals(object);
            }
        };
        assertTrue(IteratorUtils.matchesAny(list.iterator(), predicate));
    }

    @Test
    public void testMatchesAnyFalse() {
        List<String> list = new ArrayList<>();
        list.add("a");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return "b".equals(object);
            }
        };
        assertFalse(IteratorUtils.matchesAny(list.iterator(), predicate));
    }

    @Test
    public void testMatchesAll() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return object.length() == 1;
            }
        };
        assertTrue(IteratorUtils.matchesAll(list.iterator(), predicate));
    }

    @Test
    public void testMatchesAllFalse() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("bb");
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean evaluate(String object) {
                return object.length() == 1;
            }
        };
        assertFalse(IteratorUtils.matchesAll(list.iterator(), predicate));
    }

    @Test
    public void testIsEmptyTrue() {
        assertTrue(IteratorUtils.isEmpty(IteratorUtils.emptyIterator()));
    }

    @Test
    public void testIsEmptyFalse() {
        List<String> list = new ArrayList<>();
        list.add("a");
        assertFalse(IteratorUtils.isEmpty(list.iterator()));
    }

    @Test
    public void testContainsTrue() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        assertTrue(IteratorUtils.contains(list.iterator(), "b"));
    }

    @Test
    public void testContainsFalse() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        assertFalse(IteratorUtils.contains(list.iterator(), "c"));
    }

    @Test
    public void testGet() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals("b", IteratorUtils.get(list.iterator(), 1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        List<String> list = new ArrayList<>();
        list.add("a");
        IteratorUtils.get(list.iterator(), 1);
    }

    @Test
    public void testSize() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        assertEquals(3, IteratorUtils.size(list.iterator()));
    }

    @Test
    public void testSizeEmpty() {
        assertEquals(0, IteratorUtils.size(IteratorUtils.emptyIterator()));
    }

    @Test
    public void testToStringDefault() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        assertEquals("[a, b]", IteratorUtils.toString(list.iterator()));
    }

    @Test
    public void testToStringWithTransformer() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Transformer<Integer, String> transformer = Object::toString;
        assertEquals("[1, 2]", IteratorUtils.toString(list.iterator(), transformer));
    }

    @Test
    public void testToStringWithAllParams() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        assertEquals(">>>a---b<<<", IteratorUtils.toString(list.iterator(),
                                                             TransformerUtils.stringValueTransformer(),
                                                             "---", ">>>", "<<<"));
    }
}
```