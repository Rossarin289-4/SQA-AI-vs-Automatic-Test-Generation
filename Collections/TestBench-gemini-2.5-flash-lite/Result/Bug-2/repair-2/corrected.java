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
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

public class ExtendedPropertiesTest {
    @Test
    public void testEmptyConstructor() {
        ExtendedProperties props = new ExtendedProperties();
        assertNotNull("ExtendedProperties should not be null", props);
        assertTrue("ExtendedProperties should be empty", props.isEmpty());
        assertFalse("ExtendedProperties should not be initialized", props.isInitialized());
    }

    @Test
    public void testFileConstructor() throws IOException {
        // Create a dummy properties file
        File tempFile = File.createTempFile("test", ".properties");
        PrintWriter writer = new PrintWriter(tempFile);
        writer.println("key1 = value1");
        writer.println("key2 = value2");
        writer.close();

        ExtendedProperties props = new ExtendedProperties(tempFile.getAbsolutePath());
        assertNotNull("ExtendedProperties should not be null", props);
        assertFalse("ExtendedProperties should not be empty", props.isEmpty());
        assertEquals("key1", "value1", props.getString("key1"));
        assertEquals("key2", "value2", props.getString("key2"));
        assertTrue("ExtendedProperties should be initialized", props.isInitialized());

        tempFile.delete();
    }

    @Test
    public void testFileConstructorWithDefaults() throws IOException {
        // Create a dummy properties file
        File tempFile = File.createTempFile("test", ".properties");
        PrintWriter writer = new PrintWriter(tempFile);
        writer.println("key1 = value1");
        writer.close();

        // Create a dummy defaults file
        File defaultsFile = File.createTempFile("defaults", ".properties");
        PrintWriter writerDefaults = new PrintWriter(defaultsFile);
        writerDefaults.println("key2 = defaultValue2");
        writerDefaults.close();

        ExtendedProperties props = new ExtendedProperties(tempFile.getAbsolutePath(), defaultsFile.getAbsolutePath());
        assertNotNull("ExtendedProperties should not be null", props);
        assertEquals("key1", "value1", props.getString("key1"));
        assertEquals("key2", "defaultValue2", props.getString("key2")); // From defaults
        assertTrue("ExtendedProperties should be initialized", props.isInitialized());

        tempFile.delete();
        defaultsFile.delete();
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        String propertiesContent = "key1 = value1\nkey2 = value2";
        InputStream inputStream = new java.io.ByteArrayInputStream(propertiesContent.getBytes());

        ExtendedProperties props = new ExtendedProperties();
        props.load(inputStream);

        assertNotNull("ExtendedProperties should not be null", props);
        assertFalse("ExtendedProperties should not be empty", props.isEmpty());
        assertEquals("key1", "value1", props.getString("key1"));
        assertEquals("key2", "value2", props.getString("key2"));
        assertTrue("ExtendedProperties should be initialized", props.isInitialized());
    }

    @Test
    public void testLoadFromInputStreamWithEncoding() throws IOException {
        String propertiesContent = "key1 = value1";
        InputStream inputStream = new java.io.ByteArrayInputStream(propertiesContent.getBytes("UTF-8"));

        ExtendedProperties props = new ExtendedProperties();
        props.load(inputStream, "UTF-8");

        assertNotNull("ExtendedProperties should not be null", props);
        assertEquals("key1", "value1", props.getString("key1"));
        assertTrue("ExtendedProperties should be initialized", props.isInitialized());
    }

    @Test
    public void testAddPropertyString() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getString("key1"));
        assertTrue("ExtendedProperties should be initialized after addProperty", props.isInitialized());
    }

    @Test
    public void testAddPropertyObject() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", Integer.valueOf(123));
        assertEquals(Integer.valueOf(123), props.get("key1"));
    }

    @Test
    public void testAddPropertyWithComma() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1,value2");
        Object obj = props.get("key1");
        assertTrue("Value for key1 should be a List", obj instanceof List);
        List<?> list = (List<?>) obj;
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    @Test
    public void testAddPropertyWithEscapedComma() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1\\,value2");
        assertEquals("value1,value2", props.getString("key1"));
    }

    @Test
    public void testAddPropertyWithMultipleValues() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        Object obj = props.get("key1");
        assertTrue("Value for key1 should be a List", obj instanceof List);
        List<?> list = (List<?>) obj;
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    @Test
    public void testSetProperty() {
        ExtendedProperties props = new ExtendedProperties();
        props.setProperty("key1", "value1");
        assertEquals("value1", props.getString("key1"));
        props.setProperty("key1", "newValue1");
        assertEquals("newValue1", props.getString("key1"));
    }

    @Test
    public void testSetPropertyWithMultipleValues() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        props.setProperty("key1", "singleValue");
        assertEquals("singleValue", props.getString("key1"));
    }

    @Test
    public void testSave() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2,value3");

        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        props.save(outputStream, "# My Header");

        String output = outputStream.toString();
        assertTrue(output.contains("# My Header"));
        assertTrue(output.contains("key1=value1"));
        assertTrue(output.contains("key2=value2"));
        assertTrue(output.contains("key2=value3"));
    }

    @Test
    public void testCombine() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "value1");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("key1", "value2");
        props2.addProperty("key2", "value3");

        props1.combine(props2);

        Object obj = props1.get("key1");
        assertTrue("Value for key1 should be a List after combine", obj instanceof List);
        List<?> list = (List<?>) obj;
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
        assertEquals("value3", props1.getString("key2"));
    }

    @Test
    public void testClearProperty() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");
        assertEquals("value1", props.getString("key1"));
        assertEquals("value2", props.getString("key2"));

        props.clearProperty("key1");
        assertNull(props.get("key1"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testGetKeys() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");
        props.addProperty("key1", "value3"); // Duplicate key

        Iterator<?> keys = props.getKeys();
        List<String> keyList = new ArrayList<>();
        while (keys.hasNext()) {
            keyList.add((String) keys.next());
        }

        assertTrue(keyList.contains("key1"));
        assertTrue(keyList.contains("key2"));
        assertEquals(2, keyList.size()); // Only unique keys are listed
    }

    @Test
    public void testGetKeysWithPrefix() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("prefix.key1", "value1");
        props.addProperty("prefix.key2", "value2");
        props.addProperty("other.key", "value3");

        Iterator<?> keys = props.getKeys("prefix");
        List<String> keyList = new ArrayList<>();
        while (keys.hasNext()) {
            keyList.add((String) keys.next());
        }

        assertTrue(keyList.contains("prefix.key1"));
        assertTrue(keyList.contains("prefix.key2"));
        assertEquals(2, keyList.size());
    }

    @Test
    public void testSubset() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("parent.child1", "value1");
        props.addProperty("parent.child2", "value2");
        props.addProperty("other", "value3");

        ExtendedProperties subset = props.subset("parent");
        assertNotNull("Subset should not be null", subset);
        assertEquals("value1", subset.getString("child1"));
        assertEquals("value2", subset.getString("child2"));
        assertNull(subset.getString("other"));
    }

    @Test
    public void testSubsetEmpty() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("parent.child1", "value1");

        ExtendedProperties subset = props.subset("nonexistent");
        assertNull("Subset for nonexistent prefix should be null", subset);
    }

    @Test
    public void testGetString() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testGetStringWithDefault() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getString("key1", "default"));
        assertEquals("default", props.getString("nonexistentKey", "default"));
    }

    @Test
    public void testGetStringWithList() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1,value2");
        assertEquals("value1", props.getString("key1")); // Should return the first element
    }

    @Test
    public void testGetStringInterpolation() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("var1", "hello");
        props.addProperty("var2", "${var1} world");
        assertEquals("hello world", props.getString("var2"));
    }

    @Test
    public void testGetStringInterpolationLoop() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("var1", "${var2}");
        props.addProperty("var2", "${var1}");
        try {
            props.getString("var1");
            fail("Should throw IllegalStateException for interpolation loop");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testGetProperties() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        // Corrected calls to addProperty
        props.addProperty("props.key1", "value1");
        props.addProperty("props.key2", "value2");

        Properties resultProps = props.getProperties("props");
        assertNotNull(resultProps);
        assertEquals("value1", resultProps.get("key1"));
        assertEquals("value2", resultProps.get("key2"));
    }

    @Test
    public void testGetPropertiesWithDefaults() throws IOException {
        Properties defaultProps = new Properties();
        defaultProps.setProperty("key3", "default3");

        ExtendedProperties props = new ExtendedProperties();
        // Corrected call to addProperty
        props.addProperty("props.key1", "value1");

        Properties resultProps = props.getProperties("props", defaultProps);
        assertNotNull(resultProps);
        assertEquals("value1", resultProps.get("key1"));
        assertEquals("default3", resultProps.get("key3")); // From defaults
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesInvalidFormat() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        // Corrected call to addProperty
        props.addProperty("props.key1", "value1");
        props.addProperty("props.invalid", null); // Missing equals sign, value can be null for this purpose
        props.getProperties("props");
    }

    @Test
    public void testGetStringArray() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1,value2,value3");
        String[] arr = props.getStringArray("key1");
        assertNotNull(arr);
        assertEquals(3, arr.length);
        assertEquals("value1", arr[0]);
        assertEquals("value2", arr[1]);
        assertEquals("value3", arr[2]);
    }

    @Test
    public void testGetStringArraySingleValue() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        String[] arr = props.getStringArray("key1");
        assertNotNull(arr);
        assertEquals(1, arr.length);
        assertEquals("value1", arr[0]);
    }

    @Test
    public void testGetStringArrayEmpty() {
        ExtendedProperties props = new ExtendedProperties();
        String[] arr = props.getStringArray("nonexistent");
        assertNotNull(arr);
        assertEquals(0, arr.length);
    }

    @Test
    public void testGetVector() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1,value2");
        Vector<?> vec = props.getVector("key1");
        assertNotNull(vec);
        assertEquals(2, vec.size());
        assertEquals("value1", vec.get(0));
        assertEquals("value2", vec.get(1));
    }

    @Test
    public void testGetVectorSingleValue() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        Vector<?> vec = props.getVector("key1");
        assertNotNull(vec);
        assertEquals(1, vec.size());
        assertEquals("value1", vec.get(0));
    }

    @Test
    public void testGetVectorWithDefault() {
        ExtendedProperties props = new ExtendedProperties();
        Vector<String> defaultVector = new Vector<>();
        defaultVector.add("default");
        Vector<?> vec = props.getVector("nonexistent", defaultVector);
        assertNotNull(vec);
        assertEquals(1, vec.size());
        assertEquals("default", vec.get(0));
    }

    @Test
    public void testGetList() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1,value2");
        List<?> list = props.getList("key1");
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    @Test
    public void testGetListSingleValue() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        List<?> list = props.getList("key1");
        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals("value1", list.get(0));
    }

    @Test
    public void testGetListWithDefault() {
        ExtendedProperties props = new ExtendedProperties();
        List<String> defaultList = new ArrayList<>();
        defaultList.add("default");
        List<?> list = props.getList("nonexistent", defaultList);
        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals("default", list.get(0));
    }

    @Test
    public void testGetBoolean() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("boolTrue", "true");
        props.addProperty("boolOn", "on");
        props.addProperty("boolYes", "yes");
        props.addProperty("boolFalse", "false");
        props.addProperty("boolOff", "off");
        props.addProperty("boolNo", "no");
        props.addProperty("bool1", Boolean.TRUE);

        assertTrue(props.getBoolean("boolTrue"));
        assertTrue(props.getBoolean("boolOn"));
        assertTrue(props.getBoolean("boolYes"));
        assertFalse(props.getBoolean("boolFalse"));
        assertFalse(props.getBoolean("boolOff"));
        assertFalse(props.getBoolean("boolNo"));
        assertTrue(props.getBoolean("bool1"));
    }

    @Test
    public void testGetBooleanDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertTrue(props.getBoolean("nonexistent", true));
        assertFalse(props.getBoolean("nonexistent", false));
    }

    @Test
    public void testGetBooleanInvalidString() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("invalidBool", "maybe");
        assertNull(props.getBoolean("invalidBool", null));
    }

    @Test
    public void testGetByte() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("byteVal", "123");
        assertEquals((byte) 123, props.getByte("byteVal"));
    }

    @Test
    public void testGetByteDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals((byte) 10, props.getByte("nonexistent", (byte) 10));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetByteInvalidFormat() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("byteVal", "abc");
        props.getByte("byteVal");
    }

    @Test
    public void testGetShort() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("shortVal", "1234");
        assertEquals((short) 1234, props.getShort("shortVal"));
    }

    @Test
    public void testGetShortDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals((short) 500, props.getShort("nonexistent", (short) 500));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetShortInvalidFormat() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("shortVal", "abc");
        props.getShort("shortVal");
    }

    @Test
    public void testGetInt() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("intVal", "12345");
        assertEquals(12345, props.getInt("intVal"));
    }

    @Test
    public void testGetIntDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(1000, props.getInt("nonexistent", 1000));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetIntInvalidFormat() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("intVal", "abc");
        props.getInt("intVal");
    }

    @Test
    public void testGetInteger() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("integerVal", "67890");
        // Ambiguity resolved by specifying expected type for assertEquals
        assertEquals(Integer.valueOf(67890), props.getInteger("integerVal"));
    }

    @Test
    public void testGetIntegerDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(Integer.valueOf(2000), props.getInteger("nonexistent", Integer.valueOf(2000)));
    }

    @Test
    public void testGetLong() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("longVal", "1234567890123");
        assertEquals(1234567890123L, props.getLong("longVal"));
    }

    @Test
    public void testGetLongDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(9876543210L, props.getLong("nonexistent", 9876543210L));
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLongInvalidFormat() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("longVal", "abc");
        props.getLong("longVal");
    }

    @Test
    public void testGetFloat() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("floatVal", "123.45");
        assertEquals(123.45f, props.getFloat("floatVal"), 1e-9);
    }

    @Test
    public void testGetFloatDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(99.9f, props.getFloat("nonexistent", 99.9f), 1e-9);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetFloatInvalidFormat() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("floatVal", "abc");
        props.getFloat("floatVal");
    }

    @Test
    public void testGetDouble() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("doubleVal", "123.456789");
        assertEquals(123.456789d, props.getDouble("doubleVal"), 1e-9);
    }

    @Test
    public void testGetDoubleDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals(1.23456789d, props.getDouble("nonexistent", 1.23456789d), 1e-9);
    }

    @Test(expected = NumberFormatException.class)
    public void testGetDoubleInvalidFormat() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("doubleVal", "abc");
        props.getDouble("doubleVal");
    }

    @Test
    public void testConvertProperties() {
        Properties javaProps = new Properties();
        javaProps.setProperty("key1", "value1");
        javaProps.setProperty("key2", "value2");

        ExtendedProperties extProps = ExtendedProperties.convertProperties(javaProps);
        assertNotNull(extProps);
        assertEquals("value1", extProps.getString("key1"));
        assertEquals("value2", extProps.getString("key2"));
    }

    @Test
    public void testInterpolateHelper() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("var1", "hello");
        props.addProperty("var2", "${var1} world");
        props.addProperty("var3", "${var2} from interpolation");
        props.addProperty("nested.var", "${var3}");

        // Direct interpolation call for testing
        String interpolated = props.interpolateHelper("hello ${var1} ${var2} ${nested.var}", null);
        assertEquals("hello hello hello world hello world from interpolation", interpolated);
    }

    @Test
    public void testInterpolateWithDefaults() throws IOException {
        // Create dummy properties and defaults files
        File tempFile = File.createTempFile("test", ".properties");
        PrintWriter writer = new PrintWriter(tempFile);
        writer.println("userVar = UserValue");
        writer.close();

        File defaultsFile = File.createTempFile("defaults", ".properties");
        PrintWriter writerDefaults = new PrintWriter(defaultsFile);
        writerDefaults.println("defaultVar = DefaultValue");
        writerDefaults.println("combinedVar = ${defaultVar}");
        writerDefaults.close();

        ExtendedProperties props = new ExtendedProperties(tempFile.getAbsolutePath(), defaultsFile.getAbsolutePath());
        props.addProperty("userVar", "${defaultVar}"); // Override user var with default

        assertEquals("DefaultValue", props.interpolate("${defaultVar}")); // Test interpolation of default var
        assertEquals("DefaultValue", props.interpolate("${userVar}")); // Test interpolation of overridden user var

        tempFile.delete();
        defaultsFile.delete();
    }

    // Removed tests for addPropertyInternal and addPropertyDirect as they are private methods.
    // Removed test for accessing private field 'defaults'.

    @Test
    public void testClearPropertyRemovesFromKeysAsListed() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");

        Iterator<?> keysBefore = props.getKeys();
        List<String> keysListBefore = new ArrayList<>();
        while(keysBefore.hasNext()) {
            keysListBefore.add((String) keysBefore.next());
        }
        assertTrue(keysListBefore.contains("key1"));
        assertTrue(keysListBefore.contains("key2"));

        props.clearProperty("key1");

        Iterator<?> keysAfter = props.getKeys();
        List<String> keysListAfter = new ArrayList<>();
        while(keysAfter.hasNext()) {
            keysListAfter.add((String) keysAfter.next());
        }
        assertFalse(keysListAfter.contains("key1"));
        assertTrue(keysListAfter.contains("key2"));
        assertEquals(1, keysListAfter.size());
    }

    @Test
    public void testGetIncludeReturnsDefault() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("include", props.getInclude());
    }

    @Test
    public void testGetIncludeReturnsSet() {
        ExtendedProperties props = new ExtendedProperties();
        props.setInclude("myInclude");
        assertEquals("myInclude", props.getInclude());
    }

    @Test
    public void testGetIncludeReturnsNullWhenSetToEmpty() {
        ExtendedProperties props = new ExtendedProperties();
        props.setInclude(""); // Empty string is converted to null internally
        assertNull(props.getInclude());
    }

    @Test
    public void testReadPropertyBasic() throws IOException {
        String propertiesContent = "key1 = value1\nkey2 = value2";
        InputStream inputStream = new java.io.ByteArrayInputStream(propertiesContent.getBytes());
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new InputStreamReader(inputStream));
        assertEquals("value1", reader.readProperty());
        assertEquals("value2", reader.readProperty());
        assertNull(reader.readProperty()); // EOF
    }

    @Test
    public void testReadPropertyWithLineContinuation() throws IOException {
        String propertiesContent = "key1 = value1 \\\n      continued value";
        InputStream inputStream = new java.io.ByteArrayInputStream(propertiesContent.getBytes());
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new InputStreamReader(inputStream));
        assertEquals("value1continued value", reader.readProperty());
    }

    @Test
    public void testReadPropertyWithEscapedBackslash() throws IOException {
        String propertiesContent = "key1 = value1\\\\"; // Two backslashes
        InputStream inputStream = new java.io.ByteArrayInputStream(propertiesContent.getBytes());
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new InputStreamReader(inputStream));
        assertEquals("value1\\", reader.readProperty()); // Should be one backslash
    }

    @Test
    public void testReadPropertySkipsCommentsAndBlankLines() throws IOException {
        String propertiesContent = "# comment\n\nkey1 = value1\n# another comment\n  key2 = value2";
        InputStream inputStream = new java.io.ByteArrayInputStream(propertiesContent.getBytes());
        ExtendedProperties.PropertiesReader reader = new ExtendedProperties.PropertiesReader(new InputStreamReader(inputStream));
        assertEquals("value1", reader.readProperty());
        assertEquals("value2", reader.readProperty());
        assertNull(reader.readProperty()); // EOF
    }

    @Test
    public void testPropertiesTokenizerBasic() {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("token1,token2,token3");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("token1", tokenizer.nextToken());
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("token2", tokenizer.nextToken());
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("token3", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizerWithEscapedComma() {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("token1\\,token2,token3");
        assertEquals("token1,token2", tokenizer.nextToken());
        assertEquals("token3", tokenizer.nextToken());
    }

    @Test
    public void testPropertiesTokenizerWithLineContinuation() {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("token1\\\n,token2");
        assertEquals("token1,", tokenizer.nextToken());
        assertEquals("token2", tokenizer.nextToken());
    }

    @Test
    public void testGetPropertyReturnsValue() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getProperty("key1"));
    }

    @Test
    public void testGetPropertyReturnsDefaultValue() {
        ExtendedProperties props = new ExtendedProperties();
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.addProperty("defaultKey", "defaultValue");
        // Accessing defaults field is no longer allowed directly
        // Instead, we will use a constructor that takes defaults
        ExtendedProperties propsWithDefaults = null;
        try {
            // Recreate props with the default file to simulate defaults
            File tempDefaultsFile = File.createTempFile("defaultsTest", ".properties");
            PrintWriter writerDefaults = new PrintWriter(tempDefaultsFile);
            writerDefaults.println("defaultKey = defaultValue");
            writerDefaults.close();
            propsWithDefaults = new ExtendedProperties("dummy.properties", tempDefaultsFile.getAbsolutePath());
            tempDefaultsFile.delete();
        } catch (IOException e) {
            fail("Failed to set up defaults for test: " + e.getMessage());
        }

        assertNotNull("propsWithDefaults should not be null", propsWithDefaults);
        assertEquals("defaultValue", propsWithDefaults.getProperty("defaultKey"));
    }

    @Test
    public void testGetPropertyReturnsNullWhenNotFound() {
        ExtendedProperties props = new ExtendedProperties();
        assertNull(props.getProperty("nonexistentKey"));
    }

    @Test
    public void testDisplay() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2,value3");

        // Redirect System.out to capture output
        java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(baos));

        props.display();

        String output = baos.toString();
        // The representation of List in display() might not include brackets
        assertTrue(output.contains("key1 => value1"));
        // The display() method on ExtendedProperties iterates over its internal map (Hashtable)
        // and prints values. For Lists, it typically prints the default toString() of Vector or ArrayList,
        // which includes square brackets.
        assertTrue(output.contains("key2 => [value2, value3]")); 

        // Restore System.out
        System.setOut(System.out);
    }

    @Test
    public void testTestBooleanValid() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("true", props.testBoolean("true"));
        assertEquals("true", props.testBoolean("on"));
        assertEquals("true", props.testBoolean("yes"));
        assertEquals("false", props.testBoolean("false"));
        assertEquals("false", props.testBoolean("off"));
        assertEquals("false", props.testBoolean("no"));
        assertEquals("true", props.testBoolean("TRUE")); // Case insensitive
    }

    @Test
    public void testTestBooleanInvalid() {
        ExtendedProperties props = new ExtendedProperties();
        assertNull(props.testBoolean("maybe"));
        assertNull(props.testBoolean(""));
        assertNull(props.testBoolean("1"));
    }
}
