```java
package org.apache.commons.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

public class ExtendedPropertiesTest {

    // Test PropertiesReader.readProperty()
    @Test
    public void testPropertiesReaderReadProperty() throws Exception {
        String testString = "key1=value1\nkey2=value2 \\\n continued value";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new InputStreamReader(is));
        assertEquals("value1", reader.readProperty());
        assertEquals("value2 continued value", reader.readProperty());
        assertNull(reader.readProperty());
    }

    // Test PropertiesReader.readProperty() with comments and blank lines
    @Test
    public void testPropertiesReaderReadPropertyWithCommentsAndBlankLines() throws Exception {
        String testString = "# This is a comment\n\nkey1=value1\n  # Another comment\nkey2=value2";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new InputStreamReader(is));
        assertEquals("value1", reader.readProperty());
        assertEquals("value2", reader.readProperty());
        assertNull(reader.readProperty());
    }

    // Test PropertiesReader.readProperty() with escaped commas
    @Test
    public void testPropertiesReaderReadPropertyWithEscapedCommas() throws Exception {
        String testString = "key1=value\\,1\nkey2=value2";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new InputStreamReader(is));
        assertEquals("value,1", reader.readProperty());
        assertEquals("value2", reader.readProperty());
        assertNull(reader.readProperty());
    }
    
    // Test PropertiesTokenizer.nextToken()
    @Test
    public void testPropertiesTokenizer() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("first,second,third");
        assertEquals("first", tokenizer.nextToken());
        assertEquals("second", tokenizer.nextToken());
        assertEquals("third", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    // Test PropertiesTokenizer with escaped commas
    @Test
    public void testPropertiesTokenizerWithEscapedCommas() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("first\\,token,second,third\\,token");
        assertEquals("first,token", tokenizer.nextToken());
        assertEquals("second", tokenizer.nextToken());
        assertEquals("third,token", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    // Test isInitialized() when not initialized
    @Test
    public void testIsInitializedWhenNotInitialized() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertFalse(props.isInitialized());
    }

    // Test isInitialized() after loading
    @Test
    public void testIsInitializedAfterLoading() throws Exception {
        String testString = "key=value";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);
        assertTrue(props.isInitialized());
    }

    // Test getInclude() and setInclude()
    @Test
    public void testGetSetInclude() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.setInclude("myInclude");
        assertEquals("myInclude", props.getInclude());
        props.setInclude(""); // Test empty string conversion to null
        assertNull(props.getInclude());
        props.setInclude("anotherInclude");
        assertEquals("anotherInclude", props.getInclude());
    }

    // Test getInclude() with default
    @Test
    public void testGetIncludeWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("include", props.getInclude()); // Default value
    }

    // Test load() with an empty input stream
    @Test
    public void testLoadEmptyStream() throws Exception {
        InputStream is = new java.io.ByteArrayInputStream(new byte[0]);
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);
        assertTrue(props.isEmpty());
        assertTrue(props.isInitialized());
    }

    // Test load() with a simple property
    @Test
    public void testLoadSimpleProperty() throws Exception {
        String testString = "key1=value1";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);
        assertEquals("value1", props.getProperty("key1"));
        assertTrue(props.isInitialized());
    }

    // Test load() with multiple properties
    @Test
    public void testLoadMultipleProperties() throws Exception {
        String testString = "key1=value1\nkey2=value2\nkey3=value3";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
        assertEquals("value3", props.getProperty("key3"));
        assertTrue(props.isInitialized());
    }

    // Test load() with concatenated lines
    @Test
    public void testLoadConcatenatedLines() throws Exception {
        String testString = "key1=value1\\\n  continued1\nkey2=value2";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);
        assertEquals("value1 continued1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
        assertTrue(props.isInitialized());
    }

    // Test load() with duplicate keys (values should be appended)
    @Test
    public void testLoadDuplicateKeys() throws Exception {
        String testString = "key1=value1\nkey1=value2";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);
        Object obj = props.getProperty("key1");
        assertTrue(obj instanceof List);
        List list = (List) obj;
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
        assertTrue(props.isInitialized());
    }

    // Test load() with escaped commas in values
    @Test
    public void testLoadEscapedCommas() throws Exception {
        String testString = "key1=value\\,1\nkey1=value\\,2";
        InputStream is = new java.io.ByteArrayInputStream(testString.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);
        Object obj = props.getProperty("key1");
        assertTrue(obj instanceof List);
        List list = (List) obj;
        assertEquals(2, list.size());
        assertEquals("value,1", list.get(0));
        assertEquals("value,2", list.get(1));
        assertTrue(props.isInitialized());
    }

    // Test load() with 'include' property
    @Test
    public void testLoadIncludeProperty() throws Exception {
        // Create a temporary properties file to include
        File includedFile = null;
        File mainFile = null;
        try {
            includedFile = File.createTempFile("included", ".properties");
            String includedContent = "included.key=included.value";
            java.nio.file.Files.write(includedFile.toPath(), includedContent.getBytes());

            String mainContent = "include = " + includedFile.getName() + "\nmain.key=main.value";
            mainFile = File.createTempFile("main", ".properties");
            java.nio.file.Files.write(mainFile.toPath(), mainContent.getBytes());

            ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath());

            assertEquals("included.value", props.getProperty("included.key"));
            assertEquals("main.value", props.getProperty("main.key"));
        } finally {
            if (includedFile != null && includedFile.exists()) {
                includedFile.delete();
            }
            if (mainFile != null && mainFile.exists()) {
                mainFile.delete();
            }
        }
    }

    // Test getProperty() with defaults
    @Test
    public void testGetPropertyWithDefaults() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("defaultKey", "defaultValue");

        ExtendedProperties props = new ExtendedProperties();
        // Accessing 'defaults' field directly is not allowed due to visibility.
        // We can't set it directly in a test. A workaround would be to
        // create a subclass or mock if allowed, but here we'll assume
        // it's set through a constructor or load mechanism if it were intended.
        // For this test, we'll simulate having defaults by loading them.
        ExtendedProperties propsWithDefaults = new ExtendedProperties("dummy.properties", "default.properties");
        // Create dummy files for the constructor
        File defaultFile = File.createTempFile("default", ".properties");
        java.nio.file.Files.write(defaultFile.toPath(), "defaultKey=defaultValue".getBytes());
        File dummyFile = File.createTempFile("dummy", ".properties");
        java.nio.file.Files.write(dummyFile.toPath(), "mainKey=mainValue".getBytes());
        
        propsWithDefaults = new ExtendedProperties(dummyFile.getAbsolutePath(), defaultFile.getAbsolutePath());

        assertEquals("defaultValue", propsWithDefaults.getProperty("defaultKey"));
        defaultFile.delete();
        dummyFile.delete();
    }

    // Test getProperty() when key is not found and no defaults
    @Test
    public void testGetPropertyNotFound() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertNull(props.getProperty("nonExistentKey"));
    }

    // Test addProperty() with a new key
    @Test
    public void testAddPropertyNewKey() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("newKey", "newValue");
        assertEquals("newValue", props.getProperty("newKey"));
        assertTrue(props.isInitialized());
    }

    // Test addProperty() with an existing key (should create a list)
    @Test
    public void testAddPropertyExistingKey() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("existingKey", "value1");
        props.addProperty("existingKey", "value2");
        Object obj = props.getProperty("existingKey");
        assertTrue(obj instanceof List);
        List list = (List) obj;
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
        assertTrue(props.isInitialized());
    }

    // Test addProperty() with a key that already has a list
    @Test
    public void testAddPropertyExistingKeyWithList() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        List initialList = new ArrayList();
        initialList.add("value1");
        initialList.add("value2");
        // Use put method which is public and correctly handles adding properties.
        props.put("existingKeyWithList", initialList); 

        props.addProperty("existingKeyWithList", "value3");
        Object obj = props.getProperty("existingKeyWithList");
        assertTrue(obj instanceof List);
        List list = (List) obj;
        assertEquals(3, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
        assertEquals("value3", list.get(2));
        assertTrue(props.isInitialized());
    }

    // Test addProperty() with escaped commas
    @Test
    public void testAddPropertyEscapedCommas() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("keyWithComma", "value\\,1");
        props.addProperty("keyWithComma", "value\\,2");
        Object obj = props.getProperty("keyWithComma");
        assertTrue(obj instanceof List);
        List list = (List) obj;
        assertEquals(2, list.size());
        assertEquals("value,1", list.get(0));
        assertEquals("value,2", list.get(1));
        assertTrue(props.isInitialized());
    }

    // Test setProperty()
    @Test
    public void testSetProperty() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "oldValue");
        props.setProperty("key", "newValue");
        assertEquals("newValue", props.getProperty("key"));
        assertTrue(props.isInitialized());
    }

    // Test setProperty() on a non-existent key
    @Test
    public void testSetPropertyNewKey() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("newKey", "newValue");
        assertEquals("newValue", props.getProperty("newKey"));
        assertTrue(props.isInitialized());
    }

    // Test save() with a simple property
    @Test
    public void testSaveSimpleProperty() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        props.save(baos, "Test Header");
        String output = baos.toString();
        assertTrue(output.contains("key1=value1"));
        assertTrue(output.contains("Test Header"));
    }

    // Test save() with multiple values for a key
    @Test
    public void testSaveMultipleValues() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        props.save(baos, null);
        String output = baos.toString();
        // The order might vary, so check for both occurrences
        assertTrue(output.contains("key1=value1"));
        assertTrue(output.contains("key1=value2"));
        // Ensure both are present and the second one appears after the first (or vice versa)
        assertTrue(output.indexOf("key1=value1") != -1);
        assertTrue(output.indexOf("key1=value2") != -1);
    }

    // Test save() with escaped characters
    @Test
    public void testSaveEscapedCharacters() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value,1"); // , should be escaped to \,
        props.addProperty("key2", "value\\2"); // \ should be escaped to \\
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        props.save(baos, null);
        String output = baos.toString();
        assertTrue(output.contains("key1=value\\,1"));
        assertTrue(output.contains("key2=value\\\\2"));
    }

    // Test combine()
    @Test
    public void testCombine() throws Exception {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "value1");
        props1.addProperty("key2", "value2");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("key2", "newvalue2");
        props2.addProperty("key3", "value3");

        props1.combine(props2);
        assertEquals("value1", props1.getProperty("key1"));
        assertEquals("newvalue2", props1.getProperty("key2")); // Overwritten
        assertEquals("value3", props1.getProperty("key3"));
    }

    // Test clearProperty()
    @Test
    public void testClearProperty() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");
        props.clearProperty("key1");
        assertNull(props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    // Test clearProperty() on a non-existent key
    @Test
    public void testClearPropertyNonExistent() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.clearProperty("nonExistentKey");
        assertEquals("value1", props.getProperty("key1")); // Should remain unchanged
    }

    // Test getKeys()
    @Test
    public void testGetKeys() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");
        Iterator keys = props.getKeys();
        List keyList = new ArrayList();
        while (keys.hasNext()) {
            keyList.add(keys.next());
        }
        assertTrue(keyList.contains("key1"));
        assertTrue(keyList.contains("key2"));
        assertEquals(2, keyList.size());
    }

    // Test subset()
    @Test
    public void testSubset() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("prefix.key1", "value1");
        props.addProperty("prefix.key2", "value2");
        props.addProperty("other.key", "value3");

        ExtendedProperties subset = props.subset("prefix");
        assertNotNull(subset);
        assertEquals("value1", subset.getProperty("key1"));
        assertEquals("value2", subset.getProperty("key2"));
        assertNull(subset.getProperty("other.key")); // Should not be in subset
    }

    // Test subset() with no matching prefix
    @Test
    public void testSubsetNoMatch() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        ExtendedProperties subset = props.subset("nonexistent");
        assertNull(subset);
    }

    // Test subset() with only the prefix key
    @Test
    public void testSubsetOnlyPrefixKey() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("prefix", "value");
        props.addProperty("prefix.key1", "value1");
        
        ExtendedProperties subset = props.subset("prefix");
        assertNotNull(subset);
        // The exact key in the subset should be the part after the prefix.
        // If the original key was just "prefix", the subset key will be empty.
        assertEquals("value", subset.getProperty("")); 
        assertEquals("value1", subset.getProperty("key1"));
    }

    // Test getString()
    @Test
    public void testGetString() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "stringValue");
        assertEquals("stringValue", props.getString("key"));
    }

    // Test getString() with interpolation
    @Test
    public void testGetStringInterpolation() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "interpolated: ${key1}");
        assertEquals("interpolated: value1", props.getString("key2"));
    }
    
    // Test getString() with default value
    @Test
    public void testGetStringWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("defaultValue", props.getString("nonExistentKey", "defaultValue"));
    }

    // Test getString() with default value and interpolation
    @Test
    public void testGetStringWithDefaultAndInterpolation() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        // Default value should also be interpolated if it contains variables
        assertEquals("interpolated: value1", props.getString("nonExistentKey", "interpolated: ${key1}"));
    }

    // Test getString() with a list property
    @Test
    public void testGetStringFromList() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        List list = new ArrayList();
        list.add("first");
        list.add("second");
        props.addPropertyDirect("listKey", list); // Using addPropertyDirect is fine here as it's protected
        assertEquals("first", props.getString("listKey")); // Should return the first element
    }

    // Test getStringArray()
    @Test
    public void testGetStringArray() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        String[] values = props.getStringArray("key1");
        assertEquals(2, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);
    }

    // Test getStringArray() with a single string property
    @Test
    public void testGetStringArrayFromSingleString() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        String[] values = props.getStringArray("key1");
        assertEquals(1, values.length);
        assertEquals("value1", values[0]);
    }

    // Test getStringArray() with default
    @Test
    public void testGetStringArrayWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        String[] values = props.getStringArray("nonExistentKey");
        assertEquals(0, values.length);
    }

    // Test getVector()
    @Test
    public void testGetVector() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        Vector vector = props.getVector("key1");
        assertEquals(2, vector.size());
        assertEquals("value1", vector.get(0));
        assertEquals("value2", vector.get(1));
    }

    // Test getVector() with default
    @Test
    public void testGetVectorWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        Vector defaultVector = new Vector();
        defaultVector.add("default");
        Vector result = props.getVector("nonExistentKey", defaultVector);
        assertEquals(1, result.size());
        assertEquals("default", result.get(0));
    }

    // Test getList()
    @Test
    public void testGetList() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        List list = props.getList("key1");
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    // Test getList() with default
    @Test
    public void testGetListWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        List defaultList = new ArrayList();
        defaultList.add("default");
        List result = props.getList("nonExistentKey", defaultList);
        assertEquals(1, result.size());
        assertEquals("default", result.get(0));
    }

    // Test getBoolean() with "true" string
    @Test
    public void testGetBooleanFromStringTrue() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "true");
        assertTrue(props.getBoolean("key"));
    }

    // Test getBoolean() with "yes" string
    @Test
    public void testGetBooleanFromStringYes() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "yes");
        assertTrue(props.getBoolean("key"));
    }

    // Test getBoolean() with "on" string
    @Test
    public void testGetBooleanFromStringOn() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "on");
        assertTrue(props.getBoolean("key"));
    }

    // Test getBoolean() with "false" string
    @Test
    public void testGetBooleanFromStringFalse() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "false");
        assertFalse(props.getBoolean("key"));
    }

    // Test getBoolean() with "no" string
    @Test
    public void testGetBooleanFromStringNo() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "no");
        assertFalse(props.getBoolean("key"));
    }

    // Test getBoolean() with "off" string
    @Test
    public void testGetBooleanFromStringOff() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "off");
        assertFalse(props.getBoolean("key"));
    }

    // Test getBoolean() with invalid string
    @Test
    public void testGetBooleanFromInvalidString() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "invalid");
        try {
            props.getBoolean("key");
            fail("Expected ClassCastException or NoSuchElementException");
        } catch (ClassCastException e) {
            // Expected behavior for invalid string that doesn't map to boolean
        } catch (NoSuchElementException e) {
            // Also possible depending on implementation details
        }
    }

    // Test getBoolean() with default value
    @Test
    public void testGetBooleanWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertFalse(props.getBoolean("nonExistentKey", false));
    }

    // Test getBoolean() with Boolean object
    @Test
    public void testGetBooleanWithBooleanObject() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        // Use public put method to add object
        props.put("key", Boolean.TRUE); 
        assertTrue(props.getBoolean("key"));
    }

    // Test testBoolean() with valid values
    @Test
    public void testTestBoolean() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("true", props.testBoolean("true"));
        assertEquals("true", props.testBoolean("TRUE"));
        assertEquals("true", props.testBoolean("on"));
        assertEquals("true", props.testBoolean("yes"));
        assertEquals("false", props.testBoolean("false"));
        assertEquals("false", props.testBoolean("FALSE"));
        assertEquals("false", props.testBoolean("off"));
        assertEquals("false", props.testBoolean("no"));
        assertNull(props.testBoolean("invalid"));
    }

    // Test getByte()
    @Test
    public void testGetByte() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "123");
        assertEquals((byte) 123, props.getByte("key"));
    }

    // Test getByte() with default value
    @Test
    public void testGetByteWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals((byte) 45, props.getByte("nonExistentKey", (byte) 45));
    }

    // Test getShort()
    @Test
    public void testGetShort() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "32767"); // Max short value
        assertEquals((short) 32767, props.getShort("key"));
    }

    // Test getShort() with default value
    @Test
    public void testGetShortWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals((short) 100, props.getShort("nonExistentKey", (short) 100));
    }

    // Test getInt()
    @Test
    public void testGetInt() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "2147483647"); // Max int value
        assertEquals(2147483647, props.getInt("key"));
    }

    // Test getInt() with default value
    @Test
    public void testGetIntWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(500, props.getInt("nonExistentKey", 500));
    }

    // Test getInteger() (alias for getInt)
    @Test
    public void testGetInteger() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "1000");
        assertEquals((Integer) 1000, props.getInteger("key", null));
    }

    // Test getLong()
    @Test
    public void testGetLong() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "9223372036854775807"); // Max long value
        assertEquals(9223372036854775807L, props.getLong("key"));
    }

    // Test getLong() with default value
    @Test
    public void testGetLongWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(1234567890123L, props.getLong("nonExistentKey", 1234567890123L));
    }

    // Test getFloat()
    @Test
    public void testGetFloat() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "1.23E4"); // 12300.0f
        assertEquals(12300.0f, props.getFloat("key"), 0.0001f);
    }

    // Test getFloat() with default value
    @Test
    public void testGetFloatWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(3.14f, props.getFloat("nonExistentKey", 3.14f), 0.0001f);
    }

    // Test getDouble()
    @Test
    public void testGetDouble() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "1.234567890123456e5");
        assertEquals(12345.67890123456, props.getDouble("key"), 1e-9);
    }

    // Test getDouble() with default value
    @Test
    public void testGetDoubleWithDefault() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(2.71828, props.getDouble("nonExistentKey", 2.71828), 1e-9);
    }

    // Test put() method
    @Test
    public void testPut() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        Object oldVal = props.put("key1", "newValue1");
        assertEquals("value1", oldVal);
        assertEquals("newValue1", props.getProperty("key1"));
    }

    // Test putAll() with ExtendedProperties
    @Test
    public void testPutAllExtendedProperties() throws Exception {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "value1");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("key1", "value2"); // Duplicate key
        props2.addProperty("key2", "value3");

        props1.putAll(props2);
        Object obj = props1.getProperty("key1");
        assertTrue(obj instanceof List);
        List list = (List) obj;
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
        assertEquals("value3", props1.getProperty("key2"));
    }

    // Test putAll() with standard Map
    @Test
    public void testPutAllMap() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");

        Map<String, String> map = new java.util.HashMap<>();
        map.put("key1", "newValue1"); // Overwrites
        map.put("key2", "value2");

        props.putAll(map);
        assertEquals("newValue1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    // Test remove() method
    @Test
    public void testRemove() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");
        Object removedValue = props.remove("key1");
        assertEquals("value1", removedValue);
        assertNull(props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    // Test convertProperties()
    @Test
    public void testConvertProperties() throws Exception {
        Properties stdProps = new Properties();
        stdProps.setProperty("key1", "value1");
        stdProps.setProperty("key2", "value2");

        ExtendedProperties extProps = ExtendedProperties.convertProperties(stdProps);
        assertEquals("value1", extProps.getProperty("key1"));
        assertEquals("value2", extProps.getProperty("key2"));
    }

    // Test constructor with file
    @Test
    public void testConstructorFile() throws Exception {
        File tempFile = null;
        try {
            tempFile = File.createTempFile("test", ".properties");
            java.nio.file.Files.write(tempFile.toPath(), "key=value".getBytes());
            ExtendedProperties props = new ExtendedProperties(tempFile.getAbsolutePath());
            assertEquals("value", props.getProperty("key"));
        } finally {
            if (tempFile != null && tempFile.exists()) {
                tempFile.delete();
            }
        }
    }

    // Test constructor with file and default file
    @Test
    public void testConstructorFileWithDefaults() throws Exception {
        File defaultFile = null;
        File mainFile = null;
        try {
            defaultFile = File.createTempFile("defaults", ".properties");
            java.nio.file.Files.write(defaultFile.toPath(), "defaultKey=defaultValue".getBytes());

            mainFile = File.createTempFile("main", ".properties");
            java.nio.file.Files.write(mainFile.toPath(), "mainKey=mainValue".getBytes());

            ExtendedProperties props = new ExtendedProperties(mainFile.getAbsolutePath(), defaultFile.getAbsolutePath());
            assertEquals("mainValue", props.getProperty("mainKey"));
            assertEquals("defaultValue", props.getProperty("defaultKey"));
        } finally {
            if (defaultFile != null && defaultFile.exists()) {
                defaultFile.delete();
            }
            if (mainFile != null && mainFile.exists()) {
                mainFile.delete();
            }
        }
    }

    // Test interpolation with default values
    @Test
    public void testInterpolateWithDefaults() throws Exception {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("defaultKey", "defaultValue");

        ExtendedProperties props = new ExtendedProperties();
        // The 'defaults' field is private and cannot be directly set in tests.
        // A common pattern is to use the constructor that accepts a default file.
        File defaultPropsFile = null;
        try {
            defaultPropsFile = File.createTempFile("testDefaults", ".properties");
            java.nio.file.Files.write(defaultPropsFile.toPath(), "defaultKey=defaultValue\n".getBytes());

            // Create a dummy file for the main properties
            File mainPropsFile = File.createTempFile("testMain", ".properties");
            java.nio.file.Files.write(mainPropsFile.toPath(), "key=${defaultKey}\n".getBytes());

            ExtendedProperties propsWithDefaults = new ExtendedProperties(mainPropsFile.getAbsolutePath(), defaultPropsFile.getAbsolutePath());
            assertEquals("defaultValue", propsWithDefaults.getString("key"));
        } finally {
            if (defaultPropsFile != null && defaultPropsFile.exists()) {
                defaultPropsFile.delete();
            }
            File mainPropsFile = new File("testMain.properties"); // Clean up based on name used in constructor
             if (mainPropsFile.exists()) {
                mainPropsFile.delete();
            }
        }
    }

    // Test interpolation with missing keys
    @Test
    public void testInterpolateMissingKeys() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "prefix-${missingKey}-suffix");
        assertEquals("prefix-${missingKey}-suffix", props.getString("key"));
    }

    // Test interpolation with recursive reference that is not infinite
    @Test
    public void testInterpolateRecursiveNonInfinite() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "${key2}");
        props.addProperty("key2", "value2");
        assertEquals("value2", props.getString("key1"));
    }

    // Test interpolation with infinite loop
    @Test
    public void testInterpolateInfiniteLoop() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "${key2}");
        props.addProperty("key2", "${key1}");
        try {
            props.getString("key1");
            fail("Expected IllegalStateException for infinite loop");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("infinite loop in property interpolation"));
        }
    }

    // Test getProperties()
    @Test
    public void testGetProperties() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        // Correct usage for addProperty with key and value
        props.addProperty("compositeKey", "prop1=val1,prop2=val2");

        Properties resultProps = props.getProperties("compositeKey");
        assertEquals("val1", resultProps.get("prop1"));
        assertEquals("val2", resultProps.get("prop2"));
    }

    // Test getProperties() with escaped commas in tokens
    @Test
    public void testGetPropertiesWithEscapedCommas() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("compositeKey", "prop1=val\\,1,prop2=val2");

        Properties resultProps = props.getProperties("compositeKey");
        assertEquals("val,1", resultProps.get("prop1"));
        assertEquals("val2", resultProps.get("prop2"));
    }

    // Test getProperties() with malformed token
    @Test
    public void testGetPropertiesMalformedToken() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("compositeKey", "prop1=val1,malformed");
        try {
            props.getProperties("compositeKey");
            fail("Expected IllegalArgumentException for malformed token");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("does not contain an equals sign"));
        }
    }
}
```