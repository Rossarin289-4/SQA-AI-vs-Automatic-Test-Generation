package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;

public class LeafNodeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCoreValue() throws Exception {
        // TextNode inherits from LeafNode. LeafNode's value can be a String.
        // If value is String, coreValue() returns it.
        TextNode textNode = new TextNode("initial value");
        assertEquals("initial value", textNode.coreValue());
    }

    @Test
    public void testCoreValueNull() throws Exception {
        // LeafNode's `value` can be null initially. coreValue() would return null if value is null.
        TextNode textNode = new TextNode(null); // TextNode(String) constructor
        assertEquals(null, textNode.coreValue());
    }

    @Test
    public void testSetCoreValue() throws Exception {
        // coreValue(String) calls attr(nodeName(), value).
        // This should set the `value` field to the new string if no attributes exist yet,
        // or add it as an attribute if attributes already exist.
        TextNode textNode = new TextNode("initial");
        textNode.coreValue("new value");
        assertEquals("new value", textNode.coreValue());
    }

    @Test
    public void testAttrNodeName() throws Exception {
        // If `value` is a String and key matches nodeName, attr() returns `value`.
        TextNode textNode = new TextNode("some text");
        assertEquals("some text", textNode.attr(textNode.nodeName()));
    }

    @Test
    public void testAttrOtherKeyWhenNoAttributes() throws Exception {
        // If `value` is a String and key does not match nodeName, and no attributes, returns EmptyString.
        TextNode textNode = new TextNode("some text");
        assertEquals("", textNode.attr("otherKey"));
    }

    @Test
    public void testAttrWhenAttributesExist() throws Exception {
        // If `value` is an Attributes object, calls super.attr(key), which queries the Attributes object.
        TextNode textNode = new TextNode("initial");
        textNode.attr("existingAttr", "existingValue"); // This call ensures attributes object exists
        assertEquals("existingValue", textNode.attr("existingAttr"));
    }

    @Test
    public void testAttrNodeNameWhenAttributesExist() throws Exception {
        // Even if attributes exist, if key matches nodeName, it should return the core value, not from attributes.
        // Looking at the attr(String key) method: if (!hasAttributes()) return key.equals(nodeName()) ? (String) value : EmptyString;
        // This means if hasAttributes() is true, it falls through to super.attr(key).
        // The ensureAttributes() method in attr(String key, String value) puts the coreValue into attributes if value matches nodeName.
        // Let's re-trace `attr(String key)`:
        // If `value` is Attributes: it calls `super.attr(key)`.
        // If `value` is String: it checks `key.equals(nodeName())`.
        // The `coreValue()` and `coreValue(String)` methods handle the direct string value.
        // The `attr(String key, String value)` method is what makes the `value` become an `Attributes` object and stores the `coreValue` in it if `key` is `nodeName()`.
        // So, when attributes are ensured, `attr(nodeName())` will query the `Attributes` object.
        TextNode textNode = new TextNode("initial");
        textNode.attr("existingAttr", "existingValue"); // This ensures attributes object is created and "initial" becomes an attribute with nodeName() as key.
        assertEquals("initial", textNode.attr(textNode.nodeName())); // This should now retrieve from Attributes.
    }

    @Test
    public void testHasAttrWhenAttributesExist() throws Exception {
        // ensureAttributes() is called, then super.hasAttr(key) is called on the Attributes object.
        TextNode textNode = new TextNode("initial");
        textNode.attr("existingAttr", "existingValue");
        assertTrue(textNode.hasAttr("existingAttr"));
    }

    @Test
    public void testHasAttrWhenNoAttributes() throws Exception {
        // If `value` is String, and key is not nodeName, returns false.
        TextNode textNode = new TextNode("initial");
        assertFalse(textNode.hasAttr("nonExistentAttr"));
    }

    @Test
    public void testHasAttrNodeNameWhenNoAttributes() throws Exception {
        // If `value` is String, and key matches nodeName, returns true.
        TextNode textNode = new TextNode("initial");
        assertTrue(textNode.hasAttr(textNode.nodeName())); // Core value is considered an attribute of nodeName
    }

    @Test
    public void testRemoveAttr() throws Exception {
        // ensureAttributes() is called, then super.removeAttr(key) on the Attributes object.
        TextNode textNode = new TextNode("initial");
        textNode.attr("attrToRemove", "value");
        textNode.removeAttr("attrToRemove");
        assertFalse(textNode.hasAttr("attrToRemove"));
    }

    @Test
    public void testRemoveAttrWhenNoAttributes() throws Exception {
        // If `value` is String, ensureAttributes() is called. If key matches nodeName, `value` is set to null.
        TextNode textNode = new TextNode("initial");
        textNode.removeAttr("nonExistentAttr"); // Should be a no-op if key doesn't exist
        assertFalse(textNode.hasAttr("nonExistentAttr")); // Still false
    }

    @Test
    public void testRemoveAttrNodeName() throws Exception {
        // If `value` is String, ensureAttributes() is called. `value` becomes Attributes, and `nodeName()` is put into it.
        // Then super.removeAttr(key) is called. This should remove the attribute.
        // However, the coreValue() method would still return the original `value` if it was a String.
        // When you call `attr(nodeName(), "newValue")`, if no attributes, `this.value` becomes "newValue".
        // If you then `removeAttr(nodeName())`, and `value` is a String, `ensureAttributes()` is called.
        // `coreValue` is set to `value`. Then `attributes.put(nodeName(), coreValue)` happens.
        // Then `super.removeAttr(key)` is called.
        // If the original value was "initial", and we call `attr(nodeName(), "newValue")`, then `value` becomes "newValue".
        // Then `removeAttr(nodeName())` called.
        // If `value` is String "newValue", `ensureAttributes()` is called. `coreValue` is "newValue". `attributes.put(nodeName(), "newValue")`. `super.removeAttr(nodeName())` is called.
        // This should remove it from the attributes.
        TextNode textNode = new TextNode("initial");
        textNode.attr(textNode.nodeName(), "newValue"); // This sets `value` to "newValue"
        textNode.removeAttr(textNode.nodeName()); // This ensures attributes, puts "newValue" in it, then removes it.
        assertEquals("", textNode.attr(textNode.nodeName())); // The `attr(String key)` method will now look in attributes, which is empty for nodeName.
    }

    @Test
    public void testAbsUrlWhenNoAttributes() throws Exception {
        // If no attributes, absUrl calls super.absUrl(key), which will return EmptyString.
        TextNode textNode = new TextNode("initial");
        assertEquals("", textNode.absUrl("href"));
    }

    @Test
    public void testAbsUrlWhenAttributeExistsButNotUrl() throws Exception {
        // If attributes exist, it calls super.absUrl(key), which resolves against baseUri.
        // If the attribute is not a URL-like string, it will return "".
        TextNode textNode = new TextNode("initial");
        textNode.setBaseUri("http://example.com"); // Need to set baseUri for resolution
        textNode.attr("href", "some/path");
        assertEquals("http://example.com/some/path", textNode.absUrl("href"));
    }
    
    @Test
    public void testAbsUrlWithBaseUri() throws Exception {
        // The `setBaseUri` method directly sets the `baseUri` field in the Node.
        // `absUrl` uses this `baseUri` to resolve relative URLs.
        TextNode textNode = new TextNode("initial");
        textNode.setBaseUri("http://example.com"); // Set base URI directly for leaf node
        textNode.attr("href", "some/path");
        assertEquals("http://example.com/some/path", textNode.absUrl("href"));
    }

    @Test
    public void testBaseUriWhenNoParent() throws Exception {
        // `baseUri()` returns "" if `hasParent()` is false.
        TextNode textNode = new TextNode("text");
        assertEquals("", textNode.baseUri());
    }

    @Test
    public void testBaseUriWhenParentExists() throws Exception {
        // `baseUri()` returns `parent().baseUri()` if `hasParent()` is true.
        Document doc = new Document("http://example.com");
        TextNode textNode = new TextNode("text");
        doc.appendChild(textNode); // Appending sets the parent and propagates baseUri.
        assertEquals("http://example.com", textNode.baseUri());
    }

    @Test
    public void testChildNodeSize() throws Exception {
        // LeafNode is designed to have no children. childNodeSize() returns 0.
        TextNode textNode = new TextNode("text");
        assertEquals(0, textNode.childNodeSize());
    }

    @Test
    public void testAttributesEmpty() throws Exception {
        // When a TextNode is created, `value` is a String. `hasAttributes()` is false.
        // `attributes()` calls `ensureAttributes()`. If `value` is not null, it becomes an attribute.
        // So, `attributes().size()` will be 1 if the initial string value was not null.
        TextNode textNode = new TextNode("text"); // initial value is "text"
        // The `attributes()` method ensures attributes are created if they don't exist.
        // If `value` is a String, `ensureAttributes` converts it to an attribute.
        assertEquals(1, textNode.attributes().size()); // "text" will be stored as an attribute with nodeName() as key.
    }

    @Test
    public void testAttributesWithAttr() throws Exception {
        // Calling `attr(key, value)` ensures attributes if they don't exist and adds/updates the attribute.
        TextNode textNode = new TextNode("text");
        textNode.attr("id", "testId"); // This ensures attributes, and adds "id". The original "text" is also an attribute.
        Attributes attrs = textNode.attributes();
        assertNotEquals(0, attrs.size()); // Should be at least 2 attributes (nodeName and id)
        assertEquals("testId", attrs.get("id"));
    }

    @Test
    public void testAttributesWithCoreValue() throws Exception {
        // When attributes are ensured, the original string `value` is put into the `Attributes` object with `nodeName()` as the key.
        TextNode textNode = new TextNode("coretext");
        Attributes attrs = textNode.attributes();
        // The nodeName for TextNode is "#text".
        assertEquals("coretext", attrs.get(textNode.nodeName()));
    }

    @Test
    public void testSetBaseUri() throws Exception {
        // `setBaseUri` calls `doSetBaseUri`. For LeafNode, `doSetBaseUri` is a no-op.
        // However, the baseUri field is managed by `Node`.
        // The `baseUri()` method checks for parent first, then uses the stored `baseUri`.
        // `setBaseUri` on `Node` itself sets the `baseUri` field.
        TextNode textNode = new TextNode("text");
        textNode.setBaseUri("http://new.uri.com");
        assertEquals("http://new.uri.com", textNode.baseUri()); // This now correctly reflects the set base URI.
    }

    @Test
    public void testEnsureAttributesCreatesAttributesObject() throws Exception {
        TextNode textNode = new TextNode("initial");
        // Directly call ensureAttributes through attr, which should trigger it
        textNode.attr("key", "value");
        assertTrue(textNode.hasAttributes());
    }

    @Test
    public void testEnsureAttributesPreservesCoreValue() throws Exception {
        TextNode textNode = new TextNode("core");
        // `attr("key", "value")` calls `ensureAttributes()`.
        // Inside `ensureAttributes()`, `coreValue` gets the current `value` ("core").
        // Then `Attributes attributes = new Attributes()`.
        // Then `value = attributes`.
        // Then `attributes.put(nodeName(), (String) coreValue)`.
        // So the original core value should be preserved as an attribute.
        textNode.attr("key", "value");
        assertEquals("core", textNode.coreValue()); // `coreValue()` returns `attr(nodeName())`. Since nodeName() is now an attribute, it fetches from there.
    }

    @Test
    public void testEnsureAttributesAddsCoreValueAsAttribute() throws Exception {
        TextNode textNode = new TextNode("core");
        textNode.attr("key", "value");
        assertTrue(textNode.attributes().hasKey(textNode.nodeName()));
        assertEquals("core", textNode.attributes().get(textNode.nodeName()));
    }

    @Test
    public void testAttrNullKey() throws Exception {
        TextNode textNode = new TextNode("text");
        // The `attr(String key)` and `attr(String key, String value)` methods both call `Validate.notNull(key)`.
        try {
            textNode.attr(null, "value");
            fail("Expected NullPointerException due to Validate.notNull");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAttrEmptyKey() throws Exception {
        TextNode textNode = new TextNode("text");
        textNode.attr("", "value"); // This is allowed by Validate.notNull.
        assertEquals("value", textNode.attr("")); // Should store and retrieve correctly.
    }

    @Test
    public void testRemoveAttrNonExistent() throws Exception {
        TextNode textNode = new TextNode("text");
        textNode.attr("id", "someId"); // Ensure attributes exist
        textNode.removeAttr("nonExistent"); // Should be a no-op
        assertTrue(textNode.hasAttr("id"));
        assertFalse(textNode.hasAttr("nonExistent"));
    }

    @Test
    public void testAttrWithNodeNameAsKeyWhenNoAttributes() throws Exception {
        // If `value` is a String, `attr(key)` returns `value` if `key.equals(nodeName())`.
        TextNode textNode = new TextNode("core");
        assertEquals("core", textNode.attr(textNode.nodeName()));
    }

    @Test
    public void testAttrWithNodeNameAsKeyWhenAttributesExist() throws Exception {
        // If attributes exist, `attr(key)` calls `super.attr(key)`.
        // `super.attr(key)` queries the `Attributes` object.
        // `ensureAttributes` method puts the original `value` into the `Attributes` object with `nodeName()` as key.
        TextNode textNode = new TextNode("core");
        textNode.attr("someAttr", "someValue"); // This ensures attributes and adds "someAttr". The core value "core" is also added as an attribute.
        assertEquals("core", textNode.attr(textNode.nodeName())); // Should fetch from attributes.
    }

    @Test
    public void testHasAttrNodeNameWhenAttributesExist() throws Exception {
        TextNode textNode = new TextNode("core");
        textNode.attr("someAttr", "someValue"); // This ensures attributes and adds "someAttr". The core value "core" is also added as an attribute.
        assertTrue(textNode.hasAttr(textNode.nodeName())); // Should check attributes.
    }

    @Test
    public void testAttributesSizeWhenCoreValueIsPresent() throws Exception {
        // TextNode("core") creates a node where value is "core".
        // `attributes()` is called. `ensureAttributes()` is called.
        // `coreValue` becomes "core". `attributes` object is created. `value` becomes `attributes`.
        // `attributes.put(nodeName(), "core")`.
        // So `attributes().size()` should be 1 initially if nodeName is not itself an attribute key.
        // However, `TextNode` uses "#text" as its nodeName, and it's common for elements to have a text attribute.
        // Let's consider `DataNode`. Its nodeName is "#data".
        Comment comment = new Comment("initial comment"); // Comment nodeName is "#comment"
        assertEquals(1, comment.attributes().size()); // "initial comment" becomes an attribute of nodeName "#comment".

        DataNode dataNode = new DataNode("initial data"); // DataNode nodeName is "#data"
        assertEquals(1, dataNode.attributes().size()); // "initial data" becomes an attribute of nodeName "#data".
    }

    @Test
    public void testAttrWithEmptyValue() throws Exception {
        TextNode textNode = new TextNode("text");
        textNode.attr("key", "");
        assertEquals("", textNode.attr("key"));
    }

    @Test
    public void testAttrWithNullValue() throws Exception {
        TextNode textNode = new TextNode("text");
        // Calling attr(key, null) should be handled by Attributes.put, which might throw NPE or behave differently.
        // The LeafNode.attr(key, value) method passes value directly to super.attr.
        // Node.attr(key, value) calls attributes().put(key, value).
        // Attributes.put(String key, String value) calls checkNotNull(value).
        try {
            textNode.attr("key", null);
            fail("Expected NullPointerException due to Attributes.checkNotNull");
        } catch (NullPointerException e) {
            // Expected
        }
    }

    @Test
    public void testAbsUrlWithEmptyAttribute() throws Exception {
        TextNode textNode = new TextNode("text");
        textNode.setBaseUri("http://example.com");
        textNode.attr("href", ""); // Empty attribute value
        assertEquals("", textNode.absUrl("href")); // Should not resolve to base URI
    }
}
