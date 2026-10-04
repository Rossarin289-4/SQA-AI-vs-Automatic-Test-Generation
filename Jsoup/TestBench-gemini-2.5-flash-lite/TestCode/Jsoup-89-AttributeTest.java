package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.SerializationException;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.Validate;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class AttributeTest {

    @Test
    public void testGetKey_whenKeyIsSet() throws Exception {
        Attribute attr = new Attribute("id", "main");
        assertEquals("id", attr.getKey());
    }

    @Test
    public void testGetKey_whenKeyIsEmptyAfterTrim() throws Exception {
        // Validation should prevent this, but testing defensive coding
        try {
            new Attribute("  ", "value");
            fail("Expected Validate.notEmpty to throw exception for trimmed empty key.");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testSetKey_whenKeyIsSet() throws Exception {
        Attribute attr = new Attribute("oldKey", "value");
        attr.setKey("newKey");
        assertEquals("newKey", attr.getKey());
    }

    @Test
    public void testSetKey_preservesCase() throws Exception {
        Attribute attr = new Attribute("oldKey", "value");
        attr.setKey("NewKey");
        assertEquals("NewKey", attr.getKey());
    }

    @Test
    public void testSetKey_trimsInput() throws Exception {
        Attribute attr = new Attribute("oldKey", "value");
        attr.setKey("  newKey  ");
        assertEquals("newKey", attr.getKey());
    }
    
    @Test
    public void testSetKey_throwsOnNull() throws Exception {
        Attribute attr = new Attribute("key", "value");
        try {
            attr.setKey(null);
            fail("Expected Validate.notNull to throw exception for null key.");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testSetKey_throwsOnEmptyAfterTrim() throws Exception {
        Attribute attr = new Attribute("key", "value");
        try {
            attr.setKey("   ");
            fail("Expected Validate.notEmpty to throw exception for trimmed empty key.");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testGetValue_whenValueSet() throws Exception {
        Attribute attr = new Attribute("key", "value");
        assertEquals("value", attr.getValue());
    }

    @Test
    public void testGetValue_whenValueIsNull() throws Exception {
        Attribute attr = new Attribute("key", null);
        // getValue() calls Attributes.checkNotNull(val) which returns "" for null.
        assertEquals("", attr.getValue());
    }

    @Test
    public void testSetValue_whenValueSet() throws Exception {
        Attribute attr = new Attribute("key", "oldValue");
        String oldVal = attr.setValue("newValue");
        assertEquals("newValue", attr.getValue());
        assertEquals("oldValue", oldVal);
    }

    @Test
    public void testSetValue_handlesNullValue() throws Exception {
        Attribute attr = new Attribute("key", "value");
        String oldVal = attr.setValue(null);
        // getValue() calls Attributes.checkNotNull(val) which returns "" for null.
        assertEquals("", attr.getValue());
        assertEquals("value", oldVal);
    }

    @Test
    public void testHtml_simpleAttribute() throws Exception {
        Attribute attr = new Attribute("href", "index.html");
        assertEquals("href=\"index.html\"", attr.html());
    }

    @Test
    public void testHtml_booleanAttributeWithoutValue() throws Exception {
        Attribute attr = new Attribute("disabled", "");
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(Attribute.isBooleanAttribute("disabled"));
        assertEquals("disabled", attr.html());
    }

    @Test
    public void testHtml_booleanAttributeWithValueEqualToKey() throws Exception {
        Attribute attr = new Attribute("readonly", "readonly");
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(Attribute.isBooleanAttribute("readonly"));
        assertEquals("readonly", attr.html());
    }

    @Test
    public void testHtml_booleanAttributeWithDifferentValue() throws Exception {
        Attribute attr = new Attribute("checked", "true");
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(Attribute.isBooleanAttribute("checked"));
        assertEquals("checked=\"true\"", attr.html());
    }

    @Test
    public void testHtml_attributeWithSpecialCharsInValue() throws Exception {
        Attribute attr = new Attribute("data-value", "<script>alert('xss')</script>");
        // Entities.escape should handle this
        assertEquals("data-value=\"&lt;script&gt;alert(&apos;xss&apos;)&lt;/script&gt;\"", attr.html());
    }
    
    @Test
    public void testHtml_attributeWithNullValue() throws Exception {
        Attribute attr = new Attribute("attr-with-null", null);
        // getValue() will return "" for null due to Attributes.checkNotNull.
        assertEquals("attr-with-null=\"\"", attr.html());
    }

    @Test
    public void testToString_isSameAsHtml() throws Exception {
        Attribute attr = new Attribute("id", "main");
        assertEquals(attr.html(), attr.toString());
    }

    @Test
    public void testCreateFromEncoded_simple() throws Exception {
        Attribute attr = Attribute.createFromEncoded("key", "value");
        assertEquals("key", attr.getKey());
        assertEquals("value", attr.getValue());
    }

    @Test
    public void testCreateFromEncoded_withEncodedChars() throws Exception {
        Attribute attr = Attribute.createFromEncoded("desc", "greater than &gt;");
        assertEquals("desc", attr.getKey());
        assertEquals("greater than >", attr.getValue());
    }
    
    @Test
    public void testCreateFromEncoded_withNumericEntity() throws Exception {
        Attribute attr = Attribute.createFromEncoded("numeric", "&#169;");
        assertEquals("numeric", attr.getKey());
        assertEquals("©", attr.getValue());
    }

    @Test
    public void testIsDataAttribute_true() throws Exception {
        Attribute attr = new Attribute("data-id", "123");
        assertTrue(attr.isDataAttribute());
    }

    @Test
    public void testIsDataAttribute_false() throws Exception {
        Attribute attr = new Attribute("id", "main");
        assertFalse(attr.isDataAttribute());
    }
    
    @Test
    public void testIsDataAttribute_false_justPrefix() throws Exception {
        Attribute attr = new Attribute("data-", "value"); // Key must be longer than prefix
        assertFalse(attr.isDataAttribute());
    }
    
    // Removed testIsDataAttribute_false_emptyKey as it fails constructor validation.

    @Test
    public void testShouldCollapseAttribute_booleanTrueEmptyValue() {
        Attribute attr = new Attribute("disabled", "");
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(attr.shouldCollapseAttribute(out));
    }

    @Test
    public void testShouldCollapseAttribute_booleanTrueSameValue() {
        Attribute attr = new Attribute("checked", "checked");
        Document.OutputSettings out = new Document("").outputSettings();
        assertTrue(attr.shouldCollapseAttribute(out));
    }

    @Test
    public void testShouldCollapseAttribute_booleanFalseDifferentValue() {
        Attribute attr = new Attribute("disabled", "false");
        Document.OutputSettings out = new Document("").outputSettings();
        assertFalse(attr.shouldCollapseAttribute(out));
    }
    
    @Test
    public void testShouldCollapseAttribute_notBooleanAttribute() {
        Attribute attr = new Attribute("href", "index.html");
        Document.OutputSettings out = new Document("").outputSettings();
        assertFalse(attr.shouldCollapseAttribute(out));
    }

    @Test
    public void testShouldCollapseAttribute_notBooleanAttributeEmptyValue() {
        Attribute attr = new Attribute("href", "");
        Document.OutputSettings out = new Document("").outputSettings();
        assertFalse(attr.shouldCollapseAttribute(out));
    }
    
    @Test
    public void testShouldCollapseAttribute_booleanAttributeNullValue() {
        Attribute attr = new Attribute("hidden", null);
        Document.OutputSettings out = new Document("").outputSettings();
        // If val is null, it should collapse for boolean attributes.
        assertTrue(attr.shouldCollapseAttribute(out));
    }

    @Test
    public void testIsBooleanAttribute_true() {
        assertTrue(Attribute.isBooleanAttribute("checked"));
    }

    @Test
    public void testIsBooleanAttribute_false() {
        assertFalse(Attribute.isBooleanAttribute("href"));
    }

    @Test
    public void testIsBooleanAttribute_caseInsensitive() {
        // The booleanAttributes array is all lowercase, but Arrays.binarySearch
        // on strings performs case-sensitive comparison. Thus, "DISABLED" will not be found.
        // The original test incorrectly asserted true. The correct behavior is false.
        assertFalse(Attribute.isBooleanAttribute("DISABLED"));
    }
    
    @Test
    public void testIsBooleanAttribute_edgeCaseNotListed() {
        assertFalse(Attribute.isBooleanAttribute("nonexistentboolean"));
    }

    @Test
    public void testEquals_sameObject() {
        Attribute attr = new Attribute("key", "value");
        assertTrue(attr.equals(attr));
    }

    @Test
    public void testEquals_equalAttributes() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertTrue(attr1.equals(attr2));
    }

    @Test
    public void testEquals_differentKeys() {
        Attribute attr1 = new Attribute("key1", "value");
        Attribute attr2 = new Attribute("key2", "value");
        assertFalse(attr1.equals(attr2));
    }

    @Test
    public void testEquals_differentValues() {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", "value2");
        assertFalse(attr1.equals(attr2));
    }
    
    @Test
    public void testEquals_differentValuesNull() {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", null);
        assertFalse(attr1.equals(attr2));
    }
    
    @Test
    public void testEquals_nullValueVsEmpty() {
        Attribute attr1 = new Attribute("key", null);
        Attribute attr2 = new Attribute("key", "");
        // attr1.getValue() will be "", attr2.getValue() will be "". They should be equal.
        assertTrue(attr1.equals(attr2));
    }
    
    @Test
    public void testEquals_nullChecks() {
        Attribute attr1 = new Attribute("key", "value");
        assertFalse(attr1.equals(null));
        assertFalse(attr1.equals(new Object()));
    }

    @Test
    public void testHashCode_sameAttributes() {
        Attribute attr1 = new Attribute("key", "value");
        Attribute attr2 = new Attribute("key", "value");
        assertEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCode_differentKey() {
        Attribute attr1 = new Attribute("key1", "value");
        Attribute attr2 = new Attribute("key2", "value");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testHashCode_differentValue() {
        Attribute attr1 = new Attribute("key", "value1");
        Attribute attr2 = new Attribute("key", "value2");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }
    
    @Test
    public void testHashCode_nullValue() {
        Attribute attr1 = new Attribute("key", null); // getValue() returns ""
        Attribute attr2 = new Attribute("key", "value");
        assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }
    
    @Test
    public void testHashCode_nullKey() {
        // Constructor prevents null key, but if it were possible:
        // Attribute attr1 = new Attribute(null, "value");
        // Attribute attr2 = new Attribute("key", "value");
        // assertNotEquals(attr1.hashCode(), attr2.hashCode());
    }

    @Test
    public void testClone_createsNewInstance() {
        Attribute original = new Attribute("key", "value");
        Attribute cloned = original.clone();
        assertNotSame(original, cloned);
        assertEquals(original.getKey(), cloned.getKey());
        assertEquals(original.getValue(), cloned.getValue());
    }

    @Test
    public void testClone_independent() {
        Attribute original = new Attribute("key", "value");
        Attribute cloned = original.clone();
        cloned.setValue("newValue");
        assertEquals("value", original.getValue());
        assertEquals("newValue", cloned.getValue());
    }
    
    // Test for Attribute with parent, though not directly testable without Attributes class
    // This test focuses on how setKey/setValue might interact with a parent if it existed.
    @Test
    public void testSetKey_withParent_updatesParentKeysArray() {
        Attributes parentAttributes = new Attributes();
        Attribute attr = new Attribute("oldKey", "value", parentAttributes);
        parentAttributes.put(attr); // Manually add to simulate parent linkage

        int oldIndex = parentAttributes.indexOfKey("oldKey");
        assertTrue(oldIndex != Attributes.NotFound);

        attr.setKey("newKey");
        
        assertEquals("newKey", attr.getKey());
        // The parent.keys[i] is updated directly in setKey, and parent.get() uses this.
        assertEquals("newKey", parentAttributes.get("newKey"));
        assertFalse(parentAttributes.hasKey("oldKey"));
    }

    @Test
    public void testSetValue_withParent_updatesParentValsArray() {
        Attributes parentAttributes = new Attributes();
        Attribute attr = new Attribute("key", "oldValue", parentAttributes);
        parentAttributes.put(attr); // Manually add to simulate parent linkage

        attr.setValue("newValue");

        assertEquals("newValue", attr.getValue());
        assertEquals("newValue", parentAttributes.get("key")); // Check if parent updated
    }
}
