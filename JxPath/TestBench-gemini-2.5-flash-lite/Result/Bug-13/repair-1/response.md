```java
package org.apache.commons.jxpath.ri;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.model.dom.DOMNodePointer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;
import java.util.Locale;
import org.apache.commons.jxpath.AbstractFactory;
import org.apache.commons.jxpath.JXPathAbstractFactoryException;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathException;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.NamespaceResolver;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
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

public class NamespaceResolverTest {
    @Test
    public void testRegisterNamespaceAndGetNamespaceURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref", "uri");
        assertEquals("uri", resolver.getNamespaceURI("pref"));
    }

    @Test
    public void testRegisterNamespaceWithExistingPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref", "uri1");
        resolver.registerNamespace("pref", "uri2");
        assertEquals("uri2", resolver.getNamespaceURI("pref"));
    }

    @Test
    public void testGetNamespaceURINonexistentPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getNamespaceURI("nonexistent"));
    }

    @Test
    public void testRegisterNamespaceWithEmptyPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("", "uri");
        assertEquals("uri", resolver.getNamespaceURI(""));
    }

    @Test
    public void testGetNamespaceURINullPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getNamespaceURI(null));
    }

    @Test
    public void testRegisterNamespaceAndGetPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref", "uri");
        assertEquals("pref", resolver.getPrefix("uri"));
    }

    @Test
    public void testGetPrefixNonexistentURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getPrefix("nonexistent_uri"));
    }

    @Test
    public void testRegisterNamespaceWithEmptyURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref", "");
        assertEquals("pref", resolver.getPrefix(""));
    }

    @Test
    public void testRegisterNamespaceAndGetPrefixMultiple() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref1", "uri1");
        resolver.registerNamespace("pref2", "uri2");
        assertEquals("pref1", resolver.getPrefix("uri1"));
        assertEquals("pref2", resolver.getPrefix("uri2"));
    }

    @Test
    public void testRegisterNamespaceAndGetPrefixDuplicateURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref1", "uri");
        resolver.registerNamespace("pref2", "uri");
        // The last one registered should be returned by reverseMap
        assertEquals("pref2", resolver.getPrefix("uri"));
    }

    @Test
    public void testParentNamespaceResolver() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("parentPref", "parentUri");
        NamespaceResolver child = new NamespaceResolver(parent);
        child.registerNamespace("childPref", "childUri");

        assertEquals("childUri", child.getNamespaceURI("childPref"));
        assertEquals("parentUri", child.getNamespaceURI("parentPref"));
        assertNull(child.getNamespaceURI("otherPref"));

        assertEquals("childPref", child.getPrefix("childUri"));
        assertEquals("parentPref", child.getPrefix("parentUri"));
        assertNull(child.getPrefix("otherUri"));
    }

    @Test
    public void testParentNamespaceResolverOverride() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("pref", "parentUri");
        NamespaceResolver child = new NamespaceResolver(parent);
        child.registerNamespace("pref", "childUri");

        assertEquals("childUri", child.getNamespaceURI("pref"));
        // The following test is problematic because getPrefix checks the reverseMap first.
        // If "childUri" is already registered with a different prefix in the child, getPrefix will return that.
        // Here, we are testing if the child's registration for "pref" overrides the parent's URI.
        // For getPrefix, it's about finding a prefix for a URI.
        assertEquals("childUri", child.getNamespaceURI("pref")); // This part is correct.
        assertEquals("childPref", child.getPrefix("childUri")); // This is directly from child's registration.
        // The parent's prefix for "parentUri" is not directly accessible if child registers the same URI.
        // The following assertion would depend on implementation details of reverseMap management.
        // If the reverseMap is built from namespaceMap, and child overwrites its own map, then parent's entry might be lost.
        // Based on the code, getExternallyRegisteredPrefix checks parent's map if not found in current.
        // This means if child registers "pref" with "childUri", and parent registers "pref" with "parentUri",
        // child.getNamespaceURI("pref") returns "childUri".
        // child.getPrefix("parentUri") should return "pref" from the parent.
        assertEquals("pref", child.getPrefix("parentUri"));
    }
    
    @Test
    public void testGetNamespaceContextPointer() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getNamespaceContextPointer());

        // Use a concrete NodePointer implementation. DOMNodePointer is available.
        NodePointer mockPointer = new DOMNodePointer(null, Locale.getDefault()); 
        resolver.setNamespaceContextPointer(mockPointer);
        assertEquals(mockPointer, resolver.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceContextPointerWithParent() {
        NamespaceResolver parentResolver = new NamespaceResolver();
        NodePointer mockParentPointer = new DOMNodePointer(null, Locale.getDefault());
        parentResolver.setNamespaceContextPointer(mockParentPointer);

        NamespaceResolver childResolver = new NamespaceResolver(parentResolver);
        assertNull(childResolver.getNamespaceContextPointer());

        NodePointer mockChildPointer = new DOMNodePointer(null, Locale.getDefault());
        childResolver.setNamespaceContextPointer(mockChildPointer);
        assertEquals(mockChildPointer, childResolver.getNamespaceContextPointer());

        // Test child using parent's pointer when child's is null
        childResolver.pointer = null; // Reset child's pointer
        assertEquals(mockParentPointer, childResolver.getNamespaceContextPointer());
    }

    @Test
    public void testIsSealed() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertFalse(resolver.isSealed());
        resolver.seal();
        assertTrue(resolver.isSealed());
    }

    @Test
    public void testSealWithParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.seal();
        NamespaceResolver child = new NamespaceResolver(parent);
        child.seal();
        assertTrue(child.isSealed());
        assertTrue(parent.isSealed());
    }

    @Test
    public void testRegisterNamespaceOnSealedResolver() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();
        try {
            resolver.registerNamespace("pref", "uri");
            fail("Should have thrown IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }
    
    @Test
    public void testClone() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref", "uri");
        resolver.seal();

        NamespaceResolver clonedResolver = (NamespaceResolver) resolver.clone();

        assertNotSame(resolver, clonedResolver);
        assertFalse(clonedResolver.isSealed()); // Cloned resolver should not be sealed
        assertEquals("uri", clonedResolver.getNamespaceURI("pref")); // Still has the registered namespace
    }
    
    @Test
    public void testCloneWithParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("parentPref", "parentUri");
        
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.registerNamespace("childPref", "childUri");
        resolver.seal();

        NamespaceResolver clonedResolver = (NamespaceResolver) resolver.clone();
        
        assertNotSame(resolver, clonedResolver);
        assertNotSame(parent, clonedResolver.parent); // Parent is not cloned, it's a reference
        assertFalse(clonedResolver.isSealed());
        assertEquals("childUri", clonedResolver.getNamespaceURI("childPref"));
        assertEquals("parentUri", clonedResolver.getNamespaceURI("parentPref")); // Inherited from parent
    }

    // The static getPrefix(NodePointer pointer, String namespaceURI) is protected, so it cannot be called directly.
    // The tests below focus on the public methods of NamespaceResolver.

    // Test for getExternallyRegisteredNamespaceURI which is called by getNamespaceURI
    @Test
    public void testGetExternallyRegisteredNamespaceURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref1", "uri1");
        assertEquals("uri1", resolver.getExternallyRegisteredNamespaceURI("pref1"));
        assertNull(resolver.getExternallyRegisteredNamespaceURI("pref2"));
    }

    // Test for getExternallyRegisteredPrefix which is called by getPrefix
    @Test
    public void testGetExternallyRegisteredPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref1", "uri1");
        assertEquals("pref1", resolver.getExternallyRegisteredPrefix("uri1"));
        assertNull(resolver.getExternallyRegisteredPrefix("uri2"));
    }

    @Test
    public void testConstructorWithNullParent() {
        NamespaceResolver resolver = new NamespaceResolver(null);
        assertNull(resolver.parent);
        assertTrue(resolver.namespaceMap.isEmpty());
        assertNull(resolver.reverseMap);
    }

    @Test
    public void testSetNamespaceContextPointerAndGetNamespaceContextPointer() {
        NamespaceResolver resolver = new NamespaceResolver();
        NodePointer mockPointer = new DOMNodePointer(null, Locale.getDefault());
        resolver.setNamespaceContextPointer(mockPointer);
        assertEquals(mockPointer, resolver.getNamespaceContextPointer());
    }
    
    @Test
    public void testGetNamespaceURIWithPointerLookup() {
        NamespaceResolver resolver = new NamespaceResolver();
        NodePointer mockPointer = new DOMNodePointer(null, Locale.getDefault()) {
            @Override
            public String getNamespaceURI(String prefix) {
                if ("testPrefix".equals(prefix)) {
                    return "testUriFromPointer";
                }
                return null;
            }
        };
        resolver.setNamespaceContextPointer(mockPointer);

        // Test case where namespace is not registered directly
        assertNull(resolver.getNamespaceURI("unknownPrefix")); // Not registered externally
        assertEquals("testUriFromPointer", resolver.getNamespaceURI("testPrefix")); // Found via pointer
    }
    
    @Test
    public void testGetPrefixWithPointerLookup() {
        NamespaceResolver resolver = new NamespaceResolver();
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("parentPref", "parentUri");
        NamespaceResolver child = new NamespaceResolver(parent);
        
        // Mock a NodePointer that implements getNamespaceURI and getPrefix for testing
        NodePointer mockPointer = new DOMNodePointer(null, Locale.getDefault()) {
            @Override
            public String getNamespaceURI(String prefix) {
                if ("testPrefixFromPointer".equals(prefix)) return "testUriFromPointer";
                return null;
            }
            
            @Override
            public String getPrefix(String namespaceURI) {
                if ("testUriFromPointer".equals(namespaceURI)) return "testPrefixFromPointer";
                return null;
            }
        };
        
        child.setNamespaceContextPointer(mockPointer);
        
        // Test getNamespaceURI to see if it correctly calls parent and pointer
        assertEquals("parentUri", child.getNamespaceURI("parentPref")); // From parent
        assertEquals("testUriFromPointer", child.getNamespaceURI("testPrefixFromPointer")); // From pointer

        // Test getPrefix. It calls getExternallyRegisteredPrefix, then if null, calls pointer.getNamespaceURI(prefix) indirectly via DOMNodePointer's static getPrefix.
        // The direct call to getPrefix is on NamespaceResolver.
        // getPrefix(String namespaceURI) calls getExternallyRegisteredPrefix, then if null, checks pointer.getNamespaceURI(prefix).
        // The existing getPrefix(NodePointer pointer, String namespaceURI) is static and protected.
        // The method being tested is the public getPrefix(String namespaceURI).
        assertEquals("parentPref", child.getPrefix("parentUri")); // From parent's external registration
        assertNull(child.getPrefix("nonExistentUri")); // Should be null
    }

    @Test
    public void testNamespaceResolverCloneIsIndependent() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref1", "uri1");
        NamespaceResolver clonedResolver = (NamespaceResolver) resolver.clone();
        clonedResolver.registerNamespace("pref2", "uri2");

        assertEquals("uri1", resolver.getNamespaceURI("pref1"));
        assertNull(resolver.getNamespaceURI("pref2"));

        assertEquals("uri1", clonedResolver.getNamespaceURI("pref1"));
        assertEquals("uri2", clonedResolver.getNamespaceURI("pref2"));
    }

    @Test
    public void testNamespaceResolverCloneSealedState() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();
        NamespaceResolver clonedResolver = (NamespaceResolver) resolver.clone();
        assertFalse(clonedResolver.isSealed());
    }

    @Test
    public void testNamespaceResolverGetPrefixReturnsNullForEmptyURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.registerNamespace("pref", "");
        // The reverseMap will contain {"", "pref"} if an empty string URI is registered.
        assertEquals("pref", resolver.getPrefix("")); 
    }
    
    @Test
    public void testNamespaceResolverGetNamespaceURIReturnsNullForNullPrefix() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getNamespaceURI(null));
    }
    
    @Test
    public void testNamespaceResolverGetPrefixReturnsNullForNullURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.getPrefix(null));
    }

    // Tests for methods that are part of NodePointer but are called by NamespaceResolver indirectly or are static.
    
    // Test for NamespaceResolver.getNamespaceResolver() which returns a NamespaceResolver instance.
    @Test
    public void testGetNamespaceResolver() {
        NamespaceResolver resolver = new NamespaceResolver();
        // The method getNamespaceResolver() is defined in NamespaceResolver itself, not NodePointer.
        NamespaceResolver nsResolver = resolver.getNamespaceResolver();
        assertNotNull(nsResolver);
        assertTrue(nsResolver instanceof NamespaceResolver);
        // The returned resolver should have itself as the context pointer.
        assertEquals(resolver, nsResolver.getNamespaceContextPointer());
    }
    
    // Test for NamespaceResolver.getDefaultNamespaceURI()
    // This method is part of DOMNodePointer, not NamespaceResolver.
    // It is called by NamespaceResolver when pointer is not null.
    @Test
    public void testGetDefaultNamespaceURI() {
        NamespaceResolver resolver = new NamespaceResolver();
        // When pointer is null, it returns null.
        assertNull(resolver.getDefaultNamespaceURI());

        // Mock a NodePointer that overrides getDefaultNamespaceURI
        NodePointer mockPointer = new DOMNodePointer(null, Locale.getDefault()) {
            @Override
            public String getDefaultNamespaceURI() {
                return "defaultNsUriFromPointer";
            }
        };
        resolver.setNamespaceContextPointer(mockPointer);
        // Now it should delegate to the pointer's method.
        assertEquals("defaultNsUriFromPointer", resolver.getDefaultNamespaceURI());
    }
    
    // As per the original error message, the following methods are not part of NamespaceResolver.
    // They belong to NodePointer or DOMNodePointer and are not directly available on NamespaceResolver.
    // Therefore, tests attempting to call them directly on a NamespaceResolver instance are incorrect.
    // I am removing the tests that erroneously call methods like getBaseValue, getImmediateNode, etc. on NamespaceResolver.
    // The remaining tests focus on the public API of NamespaceResolver.

    @Test
    public void testGetNamespaceURI_NullPointerExceptionProtection() {
        NamespaceResolver resolver = new NamespaceResolver();
        // Ensure getNamespaceURI doesn't throw NPE with null prefix
        assertNull(resolver.getNamespaceURI(null));
    }

    @Test
    public void testGetPrefix_NullPointerExceptionProtection() {
        NamespaceResolver resolver = new NamespaceResolver();
        // Ensure getPrefix doesn't throw NPE with null namespaceURI
        assertNull(resolver.getPrefix(null));
    }

    @Test
    public void testRegisterNamespace_SealedCheck() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.seal();
        try {
            resolver.registerNamespace("newPrefix", "newUri");
            fail("Should throw IllegalStateException when sealed.");
        } catch (IllegalStateException expected) {
            // Expected exception
        }
    }

    @Test
    public void testClone_NewInstanceProperties() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("pPrefix", "pUri");
        
        NamespaceResolver resolver = new NamespaceResolver(parent);
        resolver.registerNamespace("cPrefix", "cUri");
        resolver.seal();

        NamespaceResolver cloned = (NamespaceResolver) resolver.clone();

        assertFalse(cloned.isSealed());
        assertNotNull(cloned.namespaceMap);
        assertNotSame(resolver.namespaceMap, cloned.namespaceMap); // Should be a new map instance
        assertEquals(1, cloned.namespaceMap.size()); // Should contain only child namespaces
        assertEquals("cUri", cloned.getNamespaceURI("cPrefix"));
        
        // Parent's namespaces should still be accessible
        assertEquals("pUri", cloned.getNamespaceURI("pPrefix"));
    }

    @Test
    public void testNamespaceResolver_EmptyConstructor() {
        NamespaceResolver resolver = new NamespaceResolver();
        assertNull(resolver.parent);
        assertNotNull(resolver.namespaceMap);
        assertTrue(resolver.namespaceMap.isEmpty());
        assertNull(resolver.reverseMap);
        assertFalse(resolver.isSealed());
        assertNull(resolver.getNamespaceContextPointer());
    }

    @Test
    public void testNamespaceResolver_ParentConstructor() {
        NamespaceResolver parent = new NamespaceResolver();
        NamespaceResolver child = new NamespaceResolver(parent);
        assertSame(parent, child.parent);
        assertNotNull(child.namespaceMap);
        assertTrue(child.namespaceMap.isEmpty());
        assertNull(child.reverseMap);
        assertFalse(child.isSealed());
        assertNull(child.getNamespaceContextPointer());
    }

    @Test
    public void testGetNamespaceURI_LookupInParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("pfx", "uri");
        NamespaceResolver child = new NamespaceResolver(parent);
        
        // Namespace not registered in child, should be found in parent
        assertEquals("uri", child.getNamespaceURI("pfx"));
    }

    @Test
    public void testGetPrefix_LookupInParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("pfx", "uri");
        NamespaceResolver child = new NamespaceResolver(parent);
        
        // Prefix not registered in child, should be found in parent
        assertEquals("pfx", child.getPrefix("uri"));
    }
    
    @Test
    public void testGetNamespaceURI_OverrideParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("pfx", "parentUri");
        NamespaceResolver child = new NamespaceResolver(parent);
        child.registerNamespace("pfx", "childUri");
        
        // Child's registration should override parent's
        assertEquals("childUri", child.getNamespaceURI("pfx"));
    }

    @Test
    public void testGetPrefix_OverrideParent() {
        NamespaceResolver parent = new NamespaceResolver();
        parent.registerNamespace("pfx", "parentUri");
        NamespaceResolver child = new NamespaceResolver(parent);
        child.registerNamespace("childPfx", "parentUri"); // Different prefix, same URI
        
        // The reverseMap for child will have {"parentUri": "childPfx"}
        // getPrefix will first check child's reverseMap, so it should return "childPfx".
        assertEquals("childPfx", child.getPrefix("parentUri"));
    }

    @Test
    public void testGetNamespaceURI_NullCheckForPointer() {
        NamespaceResolver resolver = new NamespaceResolver();
        resolver.setNamespaceContextPointer(null); // Ensure pointer is null
        assertNull(resolver.getNamespaceURI("somePrefix")); // Should not throw NPE
    }
}
```