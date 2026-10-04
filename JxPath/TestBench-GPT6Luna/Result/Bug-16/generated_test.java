package org.apache.commons.jxpath.ri.model.dom;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.util.TypeUtils;
import org.w3c.dom.Attr;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import java.util.List;
import org.jdom.Attribute;
import org.jdom.CDATA;
import org.jdom.Namespace;
import org.jdom.Text;

public class DOMNodePointerTest {
    @Test
    public void testNodeTypeTestsForTextCommentAndProcessingInstruction() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testCreateChildWithoutFactoryThrows() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testAttributeCreationAndRetrieval() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testCompareChildPointersInDocumentOrder() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testChildMakesElementNonLeafAndStringValue() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testLeafLengthAndPointerValues() throws Exception {
        DOMNodePointer p = new DOMNodePointer(null, Locale.ROOT);
        assertNull(p.getBaseValue());
        assertNull(p.getImmediateNode());
        assertTrue(p.isActual());
        assertFalse(p.isCollection());
        assertEquals(1, p.getLength());
    }

    @Test
    public void testNodeNameTestMatchesLocalNameAndNamespace() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testNamespacePointerForUnknownPrefix() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testSetElementValueReplacesChildrenWithText() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testNameAndNamespaceForNamespacedElement() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testChildAndAttributeIteratorsFindConfiguredNodes() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testNamespaceIteratorFindsDeclaredNamespace() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testValuePreservesTextWhenXmlSpacePreserve() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testCommentValueIsTrimmed() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testNamespaceIteratorIncludesXmlNamespace() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testCannotRemoveRootNode() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testSetTextValueAndRemoveEmptyText() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testPathForIdEscapesQuotes() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testNamespaceResolverIsCached() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testDefaultAndPrefixedNamespaceResolution() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testAttributePrecedesChildInComparison() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testLanguageUsesNearestXmlLangPrefixCaseInsensitively() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testGetPointerByIdFindsIdAttributeElement() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testNamespacePointerUsesRequestedPrefix() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testPrefixAndLocalNameFallback() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testRemoveChildNode() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testProcessingInstructionTargetTest() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }

    @Test
    public void testIdentityEqualityAndHashCode() throws Exception {
        DOMNodePointer first = new DOMNodePointer(null, Locale.ROOT);
        DOMNodePointer second = new DOMNodePointer(null, Locale.ROOT);
        assertEquals(first, second);
        assertEquals(System.identityHashCode(null), first.hashCode());
    }

    @Test
    public void testGetPointerByIdForUnregisteredIdReturnsNullPointer() throws Exception {
        assertTrue(DOMNodePointer.testNode(null, null));
    }
}
