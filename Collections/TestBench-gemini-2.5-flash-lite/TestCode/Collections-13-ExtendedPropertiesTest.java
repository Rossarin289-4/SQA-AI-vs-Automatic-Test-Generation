package org.apache.commons.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

public class ExtendedPropertiesTest {

    private static final String CRLF = "\r\n";
    private static final String TEST_FILE_NAME = "test.properties";

    // Helper class to access protected 'defaults' field

    @Test
    public void testConstructorWithStringFile() throws IOException {
        // Create a dummy file for testing
        createTestFile("key1=value1" + CRLF + "key2=value2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertNotNull(props);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
        assertTrue(props.isInitialized());
        deleteTestFile();
    }

    @Test
    public void testConstructorWithStringFileAndDefaultFile() throws IOException {
        createTestFile("key1=value1");
        createTestFile("default.properties", "defaultKey=defaultValue");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME, "default.properties");
        assertNotNull(props);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("defaultValue", props.getProperty("defaultKey"));
        assertTrue(props.isInitialized());
        deleteTestFile();
        deleteTestFile("default.properties");
    }

    @Test
    public void testIsInitialized() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        assertFalse(props.isInitialized());
        createTestFile("key=value");
        props.load(new FileInputStream(TEST_FILE_NAME));
        assertTrue(props.isInitialized());
        deleteTestFile();
    }

    @Test
    public void testGetIncludeAndSetInclude() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("include", props.getInclude());
        props.setInclude("myInclude");
        assertEquals("myInclude", props.getInclude());
        props.setInclude(""); // Should be handled as null internally for compatibility
        assertNull(props.getInclude());
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        String content = "key1=value1" + CRLF + "key2=value2";
        InputStream input = new ByteArrayInputStream(content.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(input);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testLoadFromInputStreamWithEncoding() throws IOException {
        String content = "key1=value1" + CRLF + "key2=value2";
        // Assuming UTF-8 is supported. If not, this test might fail if the system doesn't have it.
        // The fallback to "8859_1" or system default will be tested implicitly by other load methods.
        InputStream input = new ByteArrayInputStream(content.getBytes("UTF-8"));
        ExtendedProperties props = new ExtendedProperties();
        props.load(input, "UTF-8");
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testGetProperty() throws IOException {
        createTestFile("key1=value1" + CRLF + "key2=value2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals("value1", props.getProperty("key1"));
        assertNull(props.getProperty("nonexistent"));
        deleteTestFile();
    }

    @Test
    public void testAddPropertySimple() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getProperty("key1"));
        assertTrue(props.isInitialized());
    }

    @Test
    public void testAddPropertyMultipleValues() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        Object value = props.getProperty("key1");
        assertTrue(value instanceof List);
        List list = (List) value;
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
    }

    @Test
    public void testAddPropertyWithEscapedComma() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value\\,1");
        assertEquals("value,1", props.getProperty("key1"));
    }

    @Test
    public void testAddPropertyWithEscapedBackslash() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value\\\\1");
        assertEquals("value\\1", props.getProperty("key1"));
    }

    @Test
    public void testAddPropertyWithTokenizer() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "token1,token2,token3");
        Object value = props.getProperty("key1");
        assertTrue(value instanceof List);
        List list = (List) value;
        assertEquals(3, list.size());
        assertEquals("token1", list.get(0));
        assertEquals("token2", list.get(1));
        assertEquals("token3", list.get(2));
    }

    @Test
    public void testAddPropertyWithTokenizerAndEscapedComma() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "token1\\,with\\,comma,token2");
        Object value = props.getProperty("key1");
        assertTrue(value instanceof List);
        List list = (List) value;
        assertEquals(2, list.size());
        assertEquals("token1,with,comma", list.get(0));
        assertEquals("token2", list.get(1));
    }

    @Test
    public void testSetPropertySimple() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.setProperty("key1", "newValue1");
        assertEquals("newValue1", props.getProperty("key1"));
    }

    @Test
    public void testSetPropertyToMultiple() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.setProperty("key1", "newValue1,newValue2");
        Object value = props.getProperty("key1");
        assertTrue(value instanceof List);
        List list = (List) value;
        assertEquals(2, list.size());
        assertEquals("newValue1", list.get(0));
        assertEquals("newValue2", list.get(1));
    }

    @Test
    public void testSave() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2a");
        props.addProperty("key2", "value2b");
        props.addProperty("key3", "value\\,3"); // Test escaping

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        props.save(output, "# My Header");

        String content = output.toString();
        // Order of keys might not be guaranteed by Hashtable, but keysAsListed should preserve it.
        // We will check for presence of lines rather than exact string match for robustness.
        assertTrue(content.contains("# My Header"));
        assertTrue(content.contains("key1=value1"));
        assertTrue(content.contains("key2=value2a"));
        assertTrue(content.contains("key2=value2b"));
        assertTrue(content.contains("key3=value\\,3")); // Ensure escaping is preserved
        assertTrue(content.contains(CRLF + CRLF)); // Empty line between properties
    }

    @Test
    public void testCombine() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "value1");
        props1.addProperty("key2", "value2");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("key2", "overrideValue2");
        props2.addProperty("key3", "value3");

        props1.combine(props2);

        assertEquals("value1", props1.getProperty("key1"));
        assertEquals("overrideValue2", props1.getProperty("key2")); // Overwritten
        assertEquals("value3", props1.getProperty("key3"));
    }

    @Test
    public void testClearProperty() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2");
        assertTrue(props.containsKey("key1"));
        props.clearProperty("key1");
        assertFalse(props.containsKey("key1"));
        assertEquals("value2", props.getProperty("key2"));
        assertNull(props.getProperty("key1"));
    }

    @Test
    public void testGetKeys() throws IOException {
        createTestFile("key1=value1" + CRLF + "key2=value2" + CRLF + "key1=value1again");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Iterator keys = props.getKeys();
        List keyList = new ArrayList();
        while (keys.hasNext()) {
            keyList.add(keys.next());
        }
        // keysAsListed should maintain insertion order and uniqueness
        assertEquals(2, keyList.size());
        assertTrue(keyList.contains("key1"));
        assertTrue(keyList.contains("key2"));
        assertEquals("key1", keyList.get(0)); // Assuming key1 was added first
        assertEquals("key2", keyList.get(1)); // Assuming key2 was added second
        deleteTestFile();
    }

    @Test
    public void testGetKeysWithPrefix() throws IOException {
        createTestFile("prefix.key1=value1" + CRLF + "prefix.key2=value2" + CRLF + "other.key=value");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Iterator keys = props.getKeys("prefix.");
        List keyList = new ArrayList();
        while (keys.hasNext()) {
            keyList.add(keys.next());
        }
        assertEquals(2, keyList.size());
        assertTrue(keyList.contains("prefix.key1"));
        assertTrue(keyList.contains("prefix.key2"));
    }

    @Test
    public void testSubset() throws IOException {
        createTestFile("parent.child1=value1" + CRLF + "parent.child2=value2" + CRLF + "other.key=value");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        ExtendedProperties subsetProps = props.subset("parent");
        assertNotNull(subsetProps);
        assertEquals("value1", subsetProps.getProperty("child1"));
        assertEquals("value2", subsetProps.getProperty("child2"));
        assertNull(subsetProps.getProperty("other.key"));
        deleteTestFile();
    }

    @Test
    public void testSubsetWithNoMatch() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        ExtendedProperties subsetProps = props.subset("nonexistent");
        assertNull(subsetProps);
        deleteTestFile();
    }

    @Test
    public void testGetStringSimple() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals("value1", props.getString("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetStringWithDefault() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals("value1", props.getString("key1", "default"));
        assertEquals("default", props.getString("nonexistent", "default"));
        deleteTestFile();
    }

    @Test
    public void testGetStringInterpolation() throws IOException {
        createTestFile("key1=Hello" + CRLF + "key2=${key1} World!");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals("Hello World!", props.getString("key2"));
        deleteTestFile();
    }


    @Test
    public void testGetStringListFirstElement() throws IOException {
        createTestFile("key1=token1,token2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals("token1", props.getString("key1")); // Should return the first token
        deleteTestFile();
    }

    @Test
    public void testGetProperties() throws IOException {
        createTestFile("props.key1=value1" + CRLF + "props.key2=value2" + CRLF + "other.key=value");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Properties subsetProps = props.getProperties("props");
        assertNotNull(subsetProps);
        assertEquals("value1", subsetProps.get("key1"));
        assertEquals("value2", subsetProps.get("key2"));
        assertEquals(2, subsetProps.size());
        deleteTestFile();
    }

    @Test
    public void testGetPropertiesWithDefaults() throws IOException {
        createTestFile("props.key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Properties defaultProps = new Properties();
        defaultProps.setProperty("key2", "defaultValue2");
        Properties subsetProps = props.getProperties("props", defaultProps);
        assertNotNull(subsetProps);
        assertEquals("value1", subsetProps.get("key1"));
        assertEquals("defaultValue2", subsetProps.get("key2"));
        assertEquals(2, subsetProps.size());
        deleteTestFile();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertiesMalformedToken() throws IOException {
        createTestFile("props.malformed"); // Missing equals sign
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        props.getProperties("props");
        deleteTestFile();
    }

    @Test
    public void testGetStringArraySimple() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        String[] values = props.getStringArray("key1");
        assertNotNull(values);
        assertEquals(1, values.length);
        assertEquals("value1", values[0]);
        deleteTestFile();
    }

    @Test
    public void testGetStringArrayMultiple() throws IOException {
        createTestFile("key1=value1,value2,value3");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        String[] values = props.getStringArray("key1");
        assertNotNull(values);
        assertEquals(3, values.length);
        assertEquals("value1", values[0]);
        assertEquals("value2", values[1]);
        assertEquals("value3", values[2]);
        deleteTestFile();
    }


    @Test
    public void testGetVectorSimple() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Vector vector = props.getVector("key1");
        assertNotNull(vector);
        assertEquals(1, vector.size());
        assertEquals("value1", vector.get(0));
        deleteTestFile();
    }

    @Test
    public void testGetVectorMultiple() throws IOException {
        createTestFile("key1=value1,value2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Vector vector = props.getVector("key1");
        assertNotNull(vector);
        assertEquals(2, vector.size());
        assertEquals("value1", vector.get(0));
        assertEquals("value2", vector.get(1));
        deleteTestFile();
    }


    @Test
    public void testGetListSimple() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        List list = props.getList("key1");
        assertNotNull(list);
        assertEquals(1, list.size());
        assertEquals("value1", list.get(0));
        deleteTestFile();
    }

    @Test
    public void testGetListMultiple() throws IOException {
        createTestFile("key1=value1,value2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        List list = props.getList("key1");
        assertNotNull(list);
        assertEquals(2, list.size());
        assertEquals("value1", list.get(0));
        assertEquals("value2", list.get(1));
        deleteTestFile();
    }


    @Test
    public void testGetBooleanTrue() throws IOException {
        createTestFile("key1=true");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertTrue(props.getBoolean("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetBooleanFalse() throws IOException {
        createTestFile("key1=false");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertFalse(props.getBoolean("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetBooleanOn() throws IOException {
        createTestFile("key1=on");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertTrue(props.getBoolean("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetBooleanOff() throws IOException {
        createTestFile("key1=off");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertFalse(props.getBoolean("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetBooleanYes() throws IOException {
        createTestFile("key1=yes");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertTrue(props.getBoolean("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetBooleanNo() throws IOException {
        createTestFile("key1=no");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertFalse(props.getBoolean("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetBooleanWithDefault() throws IOException {
        createTestFile("key1=true");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertTrue(props.getBoolean("key1", false));
        assertFalse(props.getBoolean("nonexistent", false));
        deleteTestFile();
    }

    @Test
    public void testGetBooleanWithDefaultBooleanObject() throws IOException {
        createTestFile("key1=true");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertTrue(props.getBoolean("key1", Boolean.FALSE).booleanValue());
        assertFalse(props.getBoolean("nonexistent", Boolean.FALSE).booleanValue());
        deleteTestFile();
    }

    @Test
    public void testTestBooleanValidTrue() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("true", props.testBoolean("true"));
        assertEquals("true", props.testBoolean("TRUE"));
        assertEquals("true", props.testBoolean("on"));
        assertEquals("true", props.testBoolean("yes"));
    }

    @Test
    public void testTestBooleanValidFalse() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("false", props.testBoolean("false"));
        assertEquals("false", props.testBoolean("FALSE"));
        assertEquals("false", props.testBoolean("off"));
        assertEquals("false", props.testBoolean("no"));
    }

    @Test
    public void testTestBooleanInvalid() {
        ExtendedProperties props = new ExtendedProperties();
        assertNull(props.testBoolean("invalid"));
        assertNull(props.testBoolean(""));
    }

    @Test
    public void testGetByteSimple() throws IOException {
        createTestFile("key1=123");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals((byte) 123, props.getByte("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetByteWithDefault() throws IOException {
        createTestFile("key1=123");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals((byte) 123, props.getByte("key1", (byte) 0));
        assertEquals((byte) 0, props.getByte("nonexistent", (byte) 0));
        deleteTestFile();
    }

    @Test
    public void testGetByteWithDefaultByteObject() throws IOException {
        createTestFile("key1=123");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals((byte) 123, props.getByte("key1", Byte.valueOf((byte) 0)).byteValue());
        assertEquals((byte) 0, props.getByte("nonexistent", Byte.valueOf((byte) 0)).byteValue());
        deleteTestFile();
    }

    @Test
    public void testGetShortSimple() throws IOException {
        createTestFile("key1=1234");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals((short) 1234, props.getShort("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetShortWithDefault() throws IOException {
        createTestFile("key1=1234");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals((short) 1234, props.getShort("key1", (short) 0));
        assertEquals((short) 0, props.getShort("nonexistent", (short) 0));
        deleteTestFile();
    }

    @Test
    public void testGetShortWithDefaultShortObject() throws IOException {
        createTestFile("key1=1234");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals((short) 1234, props.getShort("key1", Short.valueOf((short) 0)).shortValue());
        assertEquals((short) 0, props.getShort("nonexistent", Short.valueOf((short) 0)).shortValue());
        deleteTestFile();
    }

    @Test
    public void testGetIntSimple() throws IOException {
        createTestFile("key1=12345");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(12345, props.getInt("key1"));
        assertEquals(12345, props.getInteger("key1")); // Alias
        deleteTestFile();
    }

    @Test
    public void testGetIntWithDefault() throws IOException {
        createTestFile("key1=12345");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(12345, props.getInt("key1", 0));
        assertEquals(0, props.getInt("nonexistent", 0));
        deleteTestFile();
    }

    @Test
    public void testGetIntWithDefaultIntObject() throws IOException {
        createTestFile("key1=12345");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(12345, props.getInteger("key1", Integer.valueOf(0)).intValue());
        assertEquals(0, props.getInteger("nonexistent", Integer.valueOf(0)).intValue());
        deleteTestFile();
    }

    @Test
    public void testGetLongSimple() throws IOException {
        createTestFile("key1=1234567890123");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(1234567890123L, props.getLong("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetLongWithDefault() throws IOException {
        createTestFile("key1=1234567890123");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(1234567890123L, props.getLong("key1", 0L));
        assertEquals(0L, props.getLong("nonexistent", 0L));
        deleteTestFile();
    }

    @Test
    public void testGetLongWithDefaultLongObject() throws IOException {
        createTestFile("key1=1234567890123");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(1234567890123L, props.getLong("key1", Long.valueOf(0L)).longValue());
        assertEquals(0L, props.getLong("nonexistent", Long.valueOf(0L)).longValue());
        deleteTestFile();
    }

    @Test
    public void testGetFloatSimple() throws IOException {
        createTestFile("key1=123.45");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(123.45f, props.getFloat("key1"), 1e-6);
        deleteTestFile();
    }

    @Test
    public void testGetFloatWithDefault() throws IOException {
        createTestFile("key1=123.45");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(123.45f, props.getFloat("key1", 0.0f), 1e-6);
        assertEquals(0.0f, props.getFloat("nonexistent", 0.0f), 1e-6f);
        deleteTestFile();
    }

    @Test
    public void testGetFloatWithDefaultFloatObject() throws IOException {
        createTestFile("key1=123.45");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(123.45f, props.getFloat("key1", Float.valueOf(0.0f)).floatValue(), 1e-6f);
        assertEquals(0.0f, props.getFloat("nonexistent", Float.valueOf(0.0f)).floatValue(), 1e-6f);
        deleteTestFile();
    }

    @Test
    public void testGetDoubleSimple() throws IOException {
        createTestFile("key1=123.456789");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(123.456789, props.getDouble("key1"), 1e-9);
        deleteTestFile();
    }

    @Test
    public void testGetDoubleWithDefault() throws IOException {
        createTestFile("key1=123.456789");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(123.456789, props.getDouble("key1", 0.0), 1e-9);
        assertEquals(0.0, props.getDouble("nonexistent", 0.0), 1e-9);
        deleteTestFile();
    }

    @Test
    public void testGetDoubleWithDefaultDoubleObject() throws IOException {
        createTestFile("key1=123.456789");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals(123.456789, props.getDouble("key1", Double.valueOf(0.0)).doubleValue(), 1e-9);
        assertEquals(0.0, props.getDouble("nonexistent", Double.valueOf(0.0)).doubleValue(), 1e-9);
        deleteTestFile();
    }

    @Test
    public void testConvertProperties() {
        Properties props = new Properties();
        props.setProperty("key1", "value1");
        props.setProperty("key2", "value2");
        ExtendedProperties extendedProps = ExtendedProperties.convertProperties(props);
        assertNotNull(extendedProps);
        assertEquals("value1", extendedProps.getProperty("key1"));
        assertEquals("value2", extendedProps.getProperty("key2"));
    }

    @Test
    public void testPutSimple() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key1", "value1");
        assertEquals("value1", props.getProperty("key1"));
    }

    @Test
    public void testPutWithExistingKey() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "oldValue");
        Object oldValue = props.put("key1", "newValue");
        assertEquals("newValue", props.getProperty("key1"));
        assertEquals("oldValue", oldValue); // Corrected: old value should be a string, not a list
    }

    @Test
    public void testPutAllMap() {
        ExtendedProperties props = new ExtendedProperties();
        Map<String, String> map = new Hashtable<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        props.putAll(map);
        assertEquals("value1", props.getProperty("key1"));
        assertEquals("value2", props.getProperty("key2"));
    }

    @Test
    public void testPutAllExtendedProperties() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "value1");
        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("key2", "value2");
        props1.putAll(props2);
        assertEquals("value1", props1.getProperty("key1"));
        assertEquals("value2", props1.getProperty("key2"));
    }

    @Test
    public void testRemove() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        Object removedValue = props.remove("key1");
        assertNull(props.getProperty("key1"));
        assertEquals("value1", removedValue);
    }

    @Test
    public void testInterpolateHelperLoop() throws IOException {
        // Create a properties file with a circular dependency
        createTestFile("key1=${key2}" + CRLF + "key2=${key1}");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        try {
            props.getString("key1");
            fail("Should have thrown IllegalStateException for infinite loop");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("infinite loop in property interpolation"));
        }
        deleteTestFile();
    }

    @Test
    public void testLoadWithInclude() throws IOException {
        String mainContent = "key1=mainValue" + CRLF + "include=included.properties" + CRLF + "key2=mainValue2";
        String includedContent = "key3=includedValue";
        createTestFile(mainContent);
        createTestFile("included.properties", includedContent);

        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);

        assertEquals("mainValue", props.getProperty("key1"));
        assertEquals("mainValue2", props.getProperty("key2"));
        assertEquals("includedValue", props.getProperty("key3")); // From included file

        deleteTestFile();
        deleteTestFile("included.properties");
    }
    
    @Test
    public void testLoadWithIncludeRelativePath() throws IOException {
        String mainContent = "key1=mainValue" + CRLF + "include=./included.properties" + CRLF + "key2=mainValue2";
        String includedContent = "key3=includedValue";
        createTestFile(mainContent);
        createTestFile("included.properties", includedContent);

        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);

        assertEquals("mainValue", props.getProperty("key1"));
        assertEquals("mainValue2", props.getProperty("key2"));
        assertEquals("includedValue", props.getProperty("key3")); // From included file

        deleteTestFile();
        deleteTestFile("included.properties");
    }

    @Test
    public void testLoadWithIncludeAbsolutePath() throws IOException {
        // Create a temporary directory and file for simulation
        File tempDir = File.createTempFile("extprops", "");
        tempDir.delete();
        tempDir.mkdir();
        File includedFile = new File(tempDir, "included.properties");
        
        try (PrintWriter writer = new PrintWriter(includedFile)) {
            writer.println("key3=includedValue");
        }
        
        String absoluteIncludePath = includedFile.getAbsolutePath();
        
        // Re-simulating the scenario: create a main file that includes another.
        String mainContent = "key1=mainValue" + CRLF + "include=" + absoluteIncludePath + CRLF + "key2=mainValue2";
        createTestFile(mainContent);
        
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME); // Reload with the include file defined in the main file

        assertEquals("mainValue", props.getProperty("key1"));
        assertEquals("mainValue2", props.getProperty("key2"));
        assertEquals("includedValue", props.getProperty("key3")); // From included file

        // Clean up temporary files
        deleteTestFile();
        includedFile.delete();
        tempDir.delete();
    }

    // --- New tests for uncalled methods ---

    @Test
    public void testPropertiesReaderReadProperty() throws IOException {
        String content = "line1" + CRLF + "line2 \\" + CRLF + "line3" + CRLF + "# comment" + CRLF + "line4";
        Reader reader = new StringReader(content);
        ExtendedProperties.PropertiesReader propReader = new ExtendedProperties.PropertiesReader(reader);
        
        assertEquals("line1", propReader.readProperty());
        assertEquals("line2line3", propReader.readProperty()); // Concatenated lines
        assertEquals("line4", propReader.readProperty());
        assertNull(propReader.readProperty()); // EOF
    }

    @Test
    public void testPropertiesReaderReadPropertyEmptyLinesAndComments() throws IOException {
        String content = CRLF + "  # comment" + CRLF + " key = value" + CRLF;
        Reader reader = new StringReader(content);
        ExtendedProperties.PropertiesReader propReader = new ExtendedProperties.PropertiesReader(reader);
        assertEquals("key=value", propReader.readProperty());
        assertNull(propReader.readProperty());
    }

    @Test
    public void testPropertiesTokenizerNextToken() {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("token1,token2\\,escaped,token3");
        assertEquals("token1", tokenizer.nextToken());
        assertEquals("token2,escaped", tokenizer.nextToken());
        assertEquals("token3", tokenizer.nextToken());
    }

    @Test
    public void testPropertiesTokenizerHasMoreTokens() {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("token1,token2");
        assertTrue(tokenizer.hasMoreTokens());
        tokenizer.nextToken();
        assertTrue(tokenizer.hasMoreTokens());
        tokenizer.nextToken();
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testDisplay() throws IOException {
        // The display method prints to System.out. We can't easily assert its output without more complex setup.
        // We will ensure it doesn't throw an exception for basic cases.
        createTestFile("key1=value1" + CRLF + "key2=value2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        props.display(); // Should not throw an exception
        deleteTestFile();
    }


    @Test
    public void testAddPropertyWithNullValue() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("keyWithNull", null);
        assertNull(props.getProperty("keyWithNull"));
    }

    @Test
    public void testSetPropertyWithNullValue() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("keyWithNull", "someValue");
        props.setProperty("keyWithNull", null);
        assertNull(props.getProperty("keyWithNull"));
    }

    @Test
    public void testGetPropertyOnEmptyProperties() {
        ExtendedProperties props = new ExtendedProperties();
        assertNull(props.getProperty("anyKey"));
    }

    @Test
    public void testInterpolateHelperWithMissingVariable() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        String result = props.interpolateHelper("This is ${unknown} and ${key1}", null);
        assertEquals("This is ${unknown} and value1", result);
    }

    @Test
    public void testInterpolateWithNullBase() {
        ExtendedProperties props = new ExtendedProperties();
        assertNull(props.interpolate(null));
    }

    @Test
    public void testSaveWithNullHeaderAndOutputStream() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        props.save(output, null);
        String content = output.toString();
        assertTrue(content.contains("key1=value1"));
    }

    @Test
    public void testSaveWithNullOutputStream() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.save(null, "#Header"); // Should not throw exception
    }

    @Test
    public void testCombineWithEmptyProperties() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "value1");
        ExtendedProperties props2 = new ExtendedProperties();
        props1.combine(props2);
        assertEquals("value1", props1.getProperty("key1")); // props2 should not change props1
    }

    @Test
    public void testCombineWithNull() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("key1", "value1");
        // The method signature is combine(ExtendedProperties props), so passing null would cause NPE.
        // This test checks if a NullPointerException is thrown as expected.
        try {
            props1.combine(null);
            fail("Should have thrown NullPointerException");
        } catch (NullPointerException e) {
            // Expected exception
        }
    }

    @Test
    public void testClearPropertyNonExistent() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.clearProperty("nonexistent"); // Should not throw an exception
        assertEquals("value1", props.getProperty("key1"));
    }
    
    @Test
    public void testGetKeysWithEmptyProperties() {
        ExtendedProperties props = new ExtendedProperties();
        Iterator keys = props.getKeys();
        assertFalse(keys.hasNext());
    }
    
    @Test
    public void testGetKeysWithPrefixNonExistent() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Iterator keys = props.getKeys("nonexistent.prefix.");
        assertFalse(keys.hasNext());
        deleteTestFile();
    }

    @Test
    public void testSubsetWithEmptyProperties() {
        ExtendedProperties props = new ExtendedProperties();
        ExtendedProperties subsetProps = props.subset("anyPrefix");
        assertNull(subsetProps); // No keys to match, so null is returned
    }

    @Test
    public void testGetStringWithEmptyValue() throws IOException {
        createTestFile("key1=");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals("", props.getString("key1"));
        deleteTestFile();
    }

    @Test
    public void testGetStringWithListValue() throws IOException {
        createTestFile("key1=token1,token2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        assertEquals("token1", props.getString("key1")); // Should return the first token
        deleteTestFile();
    }
    
    @Test
    public void testGetPropertiesNonExistentKey() throws IOException {
        createTestFile("key1=value1");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Properties subsetProps = props.getProperties("nonexistent");
        assertNotNull(subsetProps);
        assertTrue(subsetProps.isEmpty()); // Should return an empty Properties object
        deleteTestFile();
    }

    @Test
    public void testGetStringArrayEmpty() throws IOException {
        createTestFile("key1=");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        String[] values = props.getStringArray("key1");
        assertNotNull(values);
        assertEquals(1, values.length);
        assertEquals("", values[0]);
        deleteTestFile();
    }
    
    @Test
    public void testGetStringArrayWithEscapedComma() throws IOException {
        createTestFile("key1=token1\\,with,token2");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        String[] values = props.getStringArray("key1");
        assertNotNull(values);
        assertEquals(2, values.length);
        assertEquals("token1,with", values[0]);
        assertEquals("token2", values[1]);
        deleteTestFile();
    }

    @Test
    public void testGetVectorEmpty() throws IOException {
        createTestFile("key1=");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        Vector vector = props.getVector("key1");
        assertNotNull(vector);
        assertTrue(vector.isEmpty());
        deleteTestFile();
    }

    @Test
    public void testGetListEmpty() throws IOException {
        createTestFile("key1=");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        List list = props.getList("key1");
        assertNotNull(list);
        assertTrue(list.isEmpty());
        deleteTestFile();
    }

    @Test
    public void testGetBooleanWithInvalidString() throws IOException {
        createTestFile("key1=invalid");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        
        // Test with default value: if value is not boolean, it should return default
        assertFalse(props.getBoolean("key1", false));

        // Test without default, expecting NoSuchElementException when value is not found and no default is provided
        try {
            props.getBoolean("nonexistent_key");
            fail("Should have thrown NoSuchElementException for nonexistent key without default");
        } catch (NoSuchElementException e) {
            // Expected
        }

        // When the value is present but invalid, getBoolean(key) should throw ClassCastException
        try {
            props.getBoolean("key1");
            fail("Should have thrown ClassCastException for invalid boolean string");
        } catch (ClassCastException e) {
            // Expected: testBoolean returns null, which is then handled by getBoolean(key, Boolean defaultValue)
            // if the Object is not Boolean or String, it throws ClassCastException.
            // If it's a String and testBoolean returns null, then the value is not a boolean.
            // The getBoolean(key, Boolean defaultValue) method catches this by checking for String.
            // If the string is invalid, testBoolean returns null.
            // The code then checks for defaults. If defaults are null, it throws ClassCastException.
        }
        deleteTestFile();
    }

    @Test
    public void testGetByteInvalidFormat() throws IOException {
        createTestFile("key1=abc");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        try {
            props.getByte("key1");
            fail("Should have thrown NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        deleteTestFile();
    }
    
    @Test
    public void testGetShortInvalidFormat() throws IOException {
        createTestFile("key1=abc");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        try {
            props.getShort("key1");
            fail("Should have thrown NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        deleteTestFile();
    }

    @Test
    public void testGetIntInvalidFormat() throws IOException {
        createTestFile("key1=abc");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        try {
            props.getInt("key1");
            fail("Should have thrown NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        deleteTestFile();
    }

    @Test
    public void testGetLongInvalidFormat() throws IOException {
        createTestFile("key1=abc");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        try {
            props.getLong("key1");
            fail("Should have thrown NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        deleteTestFile();
    }

    @Test
    public void testGetFloatInvalidFormat() throws IOException {
        createTestFile("key1=abc");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        try {
            props.getFloat("key1");
            fail("Should have thrown NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        deleteTestFile();
    }

    @Test
    public void testGetDoubleInvalidFormat() throws IOException {
        createTestFile("key1=abc");
        ExtendedProperties props = new ExtendedProperties(TEST_FILE_NAME);
        try {
            props.getDouble("key1");
            fail("Should have thrown NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        deleteTestFile();
    }
    
    @Test
    public void testPutWithNonStringKey() {
        ExtendedProperties props = new ExtendedProperties();
        props.put(Integer.valueOf(1), "value1"); // Integer key
        assertEquals("value1", props.getProperty("1")); // Should be converted to string "1"
    }

    @Test
    public void testPutAllWithMixedTypes() {
        ExtendedProperties props = new ExtendedProperties();
        Map<Object, Object> map = new Hashtable<>();
        map.put("stringKey", "stringValue");
        map.put(Integer.valueOf(123), "integerValueAsString"); // Integer key
        props.putAll(map);
        assertEquals("stringValue", props.getProperty("stringKey"));
        assertEquals("integerValueAsString", props.getProperty("123")); // Key should be converted to string
    }

    // Helper methods for file operations
    private void createTestFile(String content) throws IOException {
        createTestFile(TEST_FILE_NAME, content);
    }

    private void createTestFile(String filename, String content) throws IOException {
        File file = new File(filename);
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(content);
        }
    }

    private void deleteTestFile() {
        deleteTestFile(TEST_FILE_NAME);
    }

    private void deleteTestFile(String filename) {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }
    
    // Inner class for StringReader to avoid additional imports in the main test class
    private static class StringReader extends Reader {
        private String data;
        private int pos = 0;

        public StringReader(String data) {
            this.data = data;
        }

        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            if (pos >= data.length()) {
                return -1; // EOF
            }
            int charsToRead = Math.min(len, data.length() - pos);
            for (int i = 0; i < charsToRead; i++) {
                cbuf[off + i] = data.charAt(pos + i);
            }
            pos += charsToRead;
            return charsToRead;
        }

        @Override
        public void close() throws IOException {
            // No-op for StringReader
        }
    }
}
