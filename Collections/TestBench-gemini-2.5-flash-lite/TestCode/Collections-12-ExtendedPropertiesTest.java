package org.apache.commons.collections;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
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

    // Helper method to create a sample ExtendedProperties object
    private ExtendedProperties createTestProperties() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "value2a,value2b");
        props.addProperty("key3", "value3\\,escaped");
        props.addProperty("key4", "value4");
        props.addProperty("key4", "anotherValue4"); // This will create a list for key4
        props.addProperty("key5", "123");
        props.addProperty("key6", "true");
        props.addProperty("key7", "false");
        props.addProperty("key8", "on");
        props.addProperty("key9", "off");
        props.addProperty("key10", "yes");
        props.addProperty("key11", "no");
        props.addProperty("key12", "3.14");
        props.addProperty("key13", "1.618");
        props.addProperty("key14", "10");
        props.addProperty("key15", "20");
        props.addProperty("key16", "99");
        props.addProperty("key17", "-1");
        props.addProperty("key18", "1000000");
        props.addProperty("key19", "2000000");
        props.addProperty("key20", "10000000000");
        props.addProperty("key21", "20000000000");
        props.addProperty("key22", "\\\\escaped\\\\backslashes");
        // To test multi-line properly with addProperty, it would need to be
        // handled by load or similar. For direct addProperty, it behaves differently.
        // The test for load will cover multi-line.
        props.addProperty("key24", "token1,token2");
        props.addProperty("key25", "token3\\,token4");

        return props;
    }

    @Test
    public void testAddPropertySimple() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testAddPropertyMultipleValues() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key1", "value2");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        assertEquals(expected, props.getList("key1"));
    }

    @Test
    public void testAddPropertyWithCommaInValue() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1,value2");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        assertEquals(expected, props.getList("key1"));
    }

    @Test
    public void testAddPropertyWithEscapedCommaInValue() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1\\,value2");
        assertEquals("value1,value2", props.getString("key1"));
    }

    @Test
    public void testAddPropertyWithEscapedBackslash() throws Exception {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "\\\\value\\\\");
        assertEquals("\\value\\", props.getString("key1"));
    }

    @Test
    public void testGetStringSimple() {
        ExtendedProperties props = createTestProperties();
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testGetStringDefault() {
        ExtendedProperties props = createTestProperties();
        assertEquals("defaultValue", props.getString("nonExistentKey", "defaultValue"));
    }

    @Test
    public void testGetStringArraySimple() {
        ExtendedProperties props = createTestProperties();
        String[] expected = {"value2a", "value2b"};
        assertArrayEquals(expected, props.getStringArray("key2"));
    }

    @Test
    public void testGetStringArraySingleValue() {
        ExtendedProperties props = createTestProperties();
        String[] expected = {"value1"};
        assertArrayEquals(expected, props.getStringArray("key1"));
    }

    @Test
    public void testGetVectorSimple() {
        ExtendedProperties props = createTestProperties();
        Vector<String> expected = new Vector<>();
        expected.add("value2a");
        expected.add("value2b");
        assertEquals(expected, props.getVector("key2"));
    }

    @Test
    public void testGetListSimple() {
        ExtendedProperties props = createTestProperties();
        List<String> expected = new ArrayList<>();
        expected.add("value2a");
        expected.add("value2b");
        assertEquals(expected, props.getList("key2"));
    }

    @Test
    public void testGetBooleanTrueString() {
        ExtendedProperties props = createTestProperties();
        assertTrue(props.getBoolean("key6"));
        assertTrue(props.getBoolean("key8"));
        assertTrue(props.getBoolean("key10"));
    }

    @Test
    public void testGetBooleanFalseString() {
        ExtendedProperties props = createTestProperties();
        assertFalse(props.getBoolean("key7"));
        assertFalse(props.getBoolean("key9"));
        assertFalse(props.getBoolean("key11"));
    }

    @Test
    public void testGetBooleanDefault() {
        ExtendedProperties props = createTestProperties();
        assertTrue(props.getBoolean("nonExistentKey", true));
        assertFalse(props.getBoolean("nonExistentKey", false));
    }

    @Test
    public void testGetByte() {
        ExtendedProperties props = createTestProperties();
        assertEquals((byte) 123, props.getByte("key5"));
    }

    @Test
    public void testGetShort() {
        ExtendedProperties props = createTestProperties();
        assertEquals((short) 123, props.getShort("key5"));
    }

    @Test
    public void testGetInt() {
        ExtendedProperties props = createTestProperties();
        assertEquals(123, props.getInt("key5"));
    }

    @Test
    public void testGetInteger() {
        ExtendedProperties props = createTestProperties();
        assertEquals(Integer.valueOf(123), (Integer) props.getInteger("key5"));
    }

    @Test
    public void testGetLong() {
        ExtendedProperties props = createTestProperties();
        assertEquals(1000000L, props.getLong("key18"));
        assertEquals(20000000000L, props.getLong("key20")); // Larger long
    }

    @Test
    public void testGetFloat() {
        ExtendedProperties props = createTestProperties();
        assertEquals(3.14f, props.getFloat("key12"), 1e-9f);
    }

    @Test
    public void testGetDouble() {
        ExtendedProperties props = createTestProperties();
        assertEquals(1.618d, props.getDouble("key13"), 1e-9d);
    }

    @Test
    public void testGetProperty() {
        ExtendedProperties props = createTestProperties();
        assertEquals("value1", props.getProperty("key1"));
        List<String> expected = new ArrayList<>();
        expected.add("value2a");
        expected.add("value2b");
        assertEquals(expected, props.getProperty("key2"));
    }

    @Test
    public void testSetProperty() {
        ExtendedProperties props = createTestProperties();
        props.setProperty("key1", "newValue1");
        assertEquals("newValue1", props.getString("key1"));
        String[] arrayAfterSet = props.getStringArray("key1");
        assertEquals(1, arrayAfterSet.length);
        assertEquals("newValue1", arrayAfterSet[0]);
    }

    @Test
    public void testSetPropertyMultiple() {
        ExtendedProperties props = createTestProperties();
        // This will replace the list for key4 with a single value
        props.setProperty("key4", "newKey4Value");
        assertEquals("newKey4Value", props.getString("key4"));
        String[] arrayAfterSet = props.getStringArray("key4");
        assertEquals(1, arrayAfterSet.length);
        assertEquals("newKey4Value", arrayAfterSet[0]);
    }

    @Test
    public void testClearProperty() {
        ExtendedProperties props = createTestProperties();
        assertTrue(props.containsKey("key1"));
        props.clearProperty("key1");
        assertNull(props.getProperty("key1"));
        assertFalse(props.containsKey("key1"));
    }

    @Test
    public void testClearPropertyMultipleValues() {
        ExtendedProperties props = createTestProperties();
        assertTrue(props.containsKey("key4")); // key4 has multiple values initially
        props.clearProperty("key4");
        assertNull(props.getProperty("key4"));
        assertFalse(props.containsKey("key4"));
    }

    @Test
    public void testGetKeys() {
        ExtendedProperties props = createTestProperties();
        Iterator<String> keys = props.getKeys();
        assertTrue(keys.hasNext());
        List<String> keyList = new ArrayList<>();
        while (keys.hasNext()) {
            keyList.add(keys.next());
        }
        assertTrue(keyList.contains("key1"));
        assertTrue(keyList.contains("key2"));
        assertTrue(keyList.contains("key5"));
        assertTrue(keyList.contains("key25"));
    }

    @Test
    public void testGetKeysWithPrefix() {
        ExtendedProperties props = createTestProperties();
        props.addProperty("prefix.keyA", "valueA");
        props.addProperty("prefix.keyB", "valueB");
        props.addProperty("other.keyC", "valueC");

        Iterator<String> keys = props.getKeys("prefix");
        List<String> prefixKeys = new ArrayList<>();
        while (keys.hasNext()) {
            prefixKeys.add(keys.next());
        }
        assertEquals(2, prefixKeys.size());
        assertTrue(prefixKeys.contains("prefix.keyA"));
        assertTrue(prefixKeys.contains("prefix.keyB"));
    }

    @Test
    public void testSubset() {
        ExtendedProperties props = createTestProperties();
        props.addProperty("subset.key1", "s_val1");
        props.addProperty("subset.key2", "s_val2");
        props.addProperty("other.key3", "o_val3");

        ExtendedProperties subset = props.subset("subset");
        assertNotNull(subset);
        assertEquals("s_val1", subset.getString("key1"));
        assertEquals("s_val2", subset.getString("key2"));
        assertNull(subset.getString("other.key3"));
    }

    @Test
    public void testSubsetNotFound() {
        ExtendedProperties props = createTestProperties();
        ExtendedProperties subset = props.subset("nonexistent");
        assertNull(subset);
    }

    @Test
    public void testCombine() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("keyA", "valueA");
        props1.addProperty("keyB", "valueB");

        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("keyB", "new_valueB"); // Should overwrite
        props2.addProperty("keyC", "valueC");

        props1.combine(props2);

        assertEquals("valueA", props1.getString("keyA"));
        assertEquals("new_valueB", props1.getString("keyB")); // Overwritten
        assertEquals("valueC", props1.getString("keyC"));
    }

    @Test
    public void testPut() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key1", "value1");
        assertEquals("value1", props.getString("key1"));
    }

    @Test
    public void testPutOverwrite() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("key1", "value1");
        props.put("key1", "newValue1");
        assertEquals("newValue1", props.getString("key1"));
    }

    @Test
    public void testPutAll() {
        ExtendedProperties props1 = new ExtendedProperties();
        props1.addProperty("keyA", "valueA");

        Map<String, String> map = new Hashtable<>();
        map.put("keyB", "valueB");
        map.put("keyC", "valueC");

        props1.putAll(map);
        assertEquals("valueA", props1.getString("keyA"));
        assertEquals("valueB", props1.getString("keyB"));
        assertEquals("valueC", props1.getString("keyC"));
    }

    @Test
    public void testRemove() {
        ExtendedProperties props = createTestProperties();
        assertTrue(props.containsKey("key1"));
        Object removedValue = props.remove("key1");
        assertEquals("value1", removedValue);
        assertNull(props.getProperty("key1"));
        assertFalse(props.containsKey("key1"));
    }

    @Test
    public void testInterpolateMissingKey() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        // If a key is missing and not in defaults, it remains as ${key}
        assertEquals("prefix_${missingKey}_suffix", props.getString("key2", "prefix_${missingKey}_suffix"));
    }

    @Test
    public void testInterpolateWithEscapedDollarSign() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "value1");
        props.addProperty("key2", "prefix_$$key1_suffix"); // $$ should be interpreted as $
        assertEquals("prefix_$key1_suffix", props.getString("key2"));
    }

    @Test
    public void testInterpolateLoop() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "${key2}");
        props.addProperty("key2", "${key1}");
        try {
            props.getString("key1");
            fail("Should have thrown IllegalStateException for infinite loop");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("infinite loop"));
        }
    }

    @Test
    public void testGetProperties() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        // To test getProperties, the property value must contain key=value tokens.
        // We simulate this by adding a property with such a value.
        props.setProperty("props", "key1=val1,key2=val2");

        Properties resultProps = props.getProperties("props");
        assertEquals("val1", resultProps.get("key1"));
        assertEquals("val2", resultProps.get("key2"));
        assertNull(resultProps.get("other.key")); // Should not be included
    }


    @Test
    public void testGetPropertiesMalformedToken() throws IOException {
        ExtendedProperties props = new ExtendedProperties();
        // Simulate a property where the value is a comma-separated list of malformed tokens.
        props.setProperty("tokens", "key1=val1,malformedToken,key2=val2");
        try {
            props.getProperties("tokens");
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("does not contain an equals sign"));
        }
    }

    @Test
    public void testSaveAndLoad() throws IOException {
        ExtendedProperties originalProps = createTestProperties();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        originalProps.save(baos, "# My Header");
        baos.flush();

        ExtendedProperties loadedProps = new ExtendedProperties();
        loadedProps.load(new ByteArrayInputStream(baos.toByteArray()), "8859_1");

        assertEquals(originalProps.getString("key1"), loadedProps.getString("key1"));
        assertEquals(originalProps.getList("key2"), loadedProps.getList("key2"));
        assertEquals(originalProps.getString("key3"), loadedProps.getString("key3"));
        // key4 was added twice, so it becomes a list.
        List<String> key4List = new ArrayList<>();
        key4List.add("value4");
        key4List.add("anotherValue4");
        assertEquals(key4List, loadedProps.getList("key4"));
        assertEquals(originalProps.getString("key22"), loadedProps.getString("key22"));

        assertEquals(originalProps.getBoolean("key6"), loadedProps.getBoolean("key6"));
        assertEquals(originalProps.getInt("key5"), loadedProps.getInt("key5"));
        assertEquals(originalProps.getLong("key20"), loadedProps.getLong("key20"));
        assertEquals(originalProps.getFloat("key12"), loadedProps.getFloat("key12"), 1e-9f);
        assertEquals(originalProps.getDouble("key13"), loadedProps.getDouble("key13"), 1e-9d);
    }

    @Test
    public void testLoadMultilineProperty() throws IOException {
        String multiLineContent = "key1=value1\n" +
                                  "longvalue = aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa \\\n" +
                                  "            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\n" +
                                  "key2=value2";
        InputStream is = new ByteArrayInputStream(multiLineContent.getBytes());
        ExtendedProperties props = new ExtendedProperties();
        props.load(is);

        assertEquals("value1", props.getString("key1"));
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", props.getString("longvalue"));
        assertEquals("value2", props.getString("key2"));
    }

    @Test
    public void testSaveAndLoadWithInclude() throws IOException {
        // Create dummy files in the current directory for testing include functionality
        String includedFileName = "included_props_test.properties";
        String mainFileName = "main_props_test.properties";

        try {
            // Write content to the included file
            try (PrintWriter writer = new PrintWriter(includedFileName)) {
                writer.println("included.key=includedValue");
            }
            // Write content to the main file which includes the other file
            try (PrintWriter writer = new PrintWriter(mainFileName)) {
                writer.println("main.key=mainValue");
                // Use file separator for robustness
                writer.println("include=" + includedFileName);
            }

            // Load the main properties file
            ExtendedProperties props = new ExtendedProperties(mainFileName);

            // Assert properties from both files are loaded
            assertEquals("mainValue", props.getString("main.key"));
            assertEquals("includedValue", props.getString("included.key"));

        } finally {
            // Clean up dummy files
            new File(includedFileName).delete();
            new File(mainFileName).delete();
        }
    }

    @Test
    public void testIsInitialized() {
        ExtendedProperties props = new ExtendedProperties();
        assertFalse(props.isInitialized());
        props.addProperty("key", "value"); // addProperty should initialize
        assertTrue(props.isInitialized());
    }

    @Test
    public void testGetIncludeAndSetInclude() {
        ExtendedProperties props = new ExtendedProperties();
        // Default value should be "include"
        assertEquals("include", props.getInclude());

        props.setInclude("myInclude");
        assertEquals("myInclude", props.getInclude());

        // Setting to empty string should result in null for getInclude()
        props.setInclude("");
        assertNull(props.getInclude());

        props.setInclude(null);
        assertNull(props.getInclude());
    }

    @Test
    public void testConvertProperties() {
        Properties javaProps = new Properties();
        javaProps.setProperty("key1", "value1");
        javaProps.setProperty("key2", "value2a,value2b");

        ExtendedProperties extendedProps = ExtendedProperties.convertProperties(javaProps);

        assertEquals("value1", extendedProps.getString("key1"));
        List<String> expected = new ArrayList<>();
        expected.add("value2a");
        expected.add("value2b");
        assertEquals(expected, extendedProps.getList("key2"));
    }


    @Test
    public void testGetStringWithList() {
        ExtendedProperties props = new ExtendedProperties();
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        // Use addProperty which internally handles lists and strings
        props.addProperty("myListKey", list);

        // getString on a key mapped to a List returns the first element
        assertEquals("first", props.getString("myListKey"));
    }

    @Test
    public void testGetBooleanWithNonBooleanString() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "some random string");
        try {
            props.getBoolean("key"); // This should throw ClassCastException
            fail("Should throw ClassCastException for non-boolean string");
        } catch (ClassCastException e) {
            // Expected
        }
    }

    @Test
    public void testGetIntegerMaxAndMin() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("maxInt", Integer.toString(Integer.MAX_VALUE));
        props.addProperty("minInt", Integer.toString(Integer.MIN_VALUE));

        assertEquals(Integer.MAX_VALUE, props.getInt("maxInt"));
        assertEquals(Integer.MIN_VALUE, props.getInt("minInt"));
    }

    @Test
    public void testGetLongMaxAndMin() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("maxLong", Long.toString(Long.MAX_VALUE));
        props.addProperty("minLong", Long.toString(Long.MIN_VALUE));

        assertEquals(Long.MAX_VALUE, props.getLong("maxLong"));
        assertEquals(Long.MIN_VALUE, props.getLong("minLong"));
    }

    @Test
    public void testGetFloatEdgeCases() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("floatMax", Float.toString(Float.MAX_VALUE));
        props.addProperty("floatMin", Float.toString(Float.MIN_VALUE));
        props.addProperty("floatZero", "0.0f"); // String "0.0f"
        props.addProperty("floatNegativeZero", "-0.0f"); // String "-0.0f"

        assertEquals(Float.MAX_VALUE, props.getFloat("floatMax"), 0);
        assertEquals(Float.MIN_VALUE, props.getFloat("floatMin"), 0);
        assertEquals(0.0f, props.getFloat("floatZero"), 0);
        assertEquals(-0.0f, props.getFloat("floatNegativeZero"), 0);
    }

    @Test
    public void testGetDoubleEdgeCases() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("doubleMax", Double.toString(Double.MAX_VALUE));
        props.addProperty("doubleMin", Double.toString(Double.MIN_VALUE));
        props.addProperty("doubleZero", "0.0d"); // String "0.0d"
        props.addProperty("doubleNegativeZero", "-0.0d"); // String "-0.0d"

        assertEquals(Double.MAX_VALUE, props.getDouble("doubleMax"), 0);
        assertEquals(Double.MIN_VALUE, props.getDouble("doubleMin"), 0);
        assertEquals(0.0d, props.getDouble("doubleZero"), 0);
        assertEquals(-0.0d, props.getDouble("doubleNegativeZero"), 0);
    }

    @Test
    public void testReadProperty() throws Exception {
        String input = "key1=value1\nlongvalue = aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa \\\n            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\nkey2=value2\n#comment\n";
        Reader reader = new StringReader(input);
        ExtendedProperties.PropertiesReader propsReader = new ExtendedProperties.PropertiesReader(reader);

        assertEquals("value1", propsReader.readProperty());
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", propsReader.readProperty());
        assertEquals("value2", propsReader.readProperty());
        assertNull(propsReader.readProperty()); // EOF
    }

    @Test
    public void testReadPropertyWithEscapedBackslash() throws Exception {
        String input = "key1=value1\\\\\ncontinuation"; // \\\\ should resolve to \\
        Reader reader = new StringReader(input);
        ExtendedProperties.PropertiesReader propsReader = new ExtendedProperties.PropertiesReader(reader);
        assertEquals("value1\\\\continuation", propsReader.readProperty());
    }

    @Test
    public void testReadPropertyEmptyLinesAndComments() throws Exception {
        String input = "\n\n#comment\nkey1=value1\n\n";
        Reader reader = new StringReader(input);
        ExtendedProperties.PropertiesReader propsReader = new ExtendedProperties.PropertiesReader(reader);
        assertEquals("value1", propsReader.readProperty());
        assertNull(propsReader.readProperty()); // EOF
    }

    @Test
    public void testHasMoreTokensAndNextToken() throws Exception {
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
    public void testHasMoreTokensAndNextTokenWithEscapedComma() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer = new ExtendedProperties.PropertiesTokenizer("token1\\,token2,token3");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("token1,token2", tokenizer.nextToken());
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("token3", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testDisplay() throws Exception {
        ExtendedProperties props = createTestProperties();
        // The display method prints to System.out. We can't easily assert its output
        // without redirecting System.out, which is usually avoided in unit tests.
        // Simply calling it to ensure it runs without error.
        props.display();

        ExtendedProperties emptyProps = new ExtendedProperties();
        emptyProps.display();
    }

    @Test
    public void testTestBoolean() {
        ExtendedProperties props = new ExtendedProperties();
        assertEquals("true", props.testBoolean("true"));
        assertEquals("true", props.testBoolean("TRUE"));
        assertEquals("true", props.testBoolean("on"));
        assertEquals("true", props.testBoolean("yes"));
        assertEquals("false", props.testBoolean("false"));
        assertEquals("false", props.testBoolean("FALSE"));
        assertEquals("false", props.testBoolean("off"));
        assertEquals("false", props.testBoolean("no"));
        assertNull(props.testBoolean("other"));
        assertNull(props.testBoolean(""));
    }

    @Test
    public void testGetBooleanFromStringWithDefault() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key", "true");
        assertTrue(props.getBoolean("key", false));
        assertTrue(props.getBoolean("nonexistent", true));
        assertFalse(props.getBoolean("nonexistent", false));
    }

    @Test
    public void testGetByteEdgeCases() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("byteMax", Byte.toString(Byte.MAX_VALUE));
        props.addProperty("byteMin", Byte.toString(Byte.MIN_VALUE));
        assertEquals(Byte.MAX_VALUE, props.getByte("byteMax"));
        assertEquals(Byte.MIN_VALUE, props.getByte("byteMin"));
    }

    @Test
    public void testGetShortEdgeCases() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("shortMax", Short.toString(Short.MAX_VALUE));
        props.addProperty("shortMin", Short.toString(Short.MIN_VALUE));
        assertEquals(Short.MAX_VALUE, props.getShort("shortMax"));
        assertEquals(Short.MIN_VALUE, props.getShort("shortMin"));
    }

    @Test
    public void testGetIntEdgeCases() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("intMax", Integer.toString(Integer.MAX_VALUE));
        props.addProperty("intMin", Integer.toString(Integer.MIN_VALUE));
        assertEquals(Integer.MAX_VALUE, props.getInt("intMax"));
        assertEquals(Integer.MIN_VALUE, props.getInt("intMin"));
    }

    @Test
    public void testGetLongEdgeCases() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("longMax", Long.toString(Long.MAX_VALUE));
        props.addProperty("longMin", Long.toString(Long.MIN_VALUE));
        assertEquals(Long.MAX_VALUE, props.getLong("longMax"));
        assertEquals(Long.MIN_VALUE, props.getLong("longMin"));
    }


    @Test
    public void testSaveWithEmptyHeader() throws IOException {
        ExtendedProperties props = createTestProperties();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, ""); // Empty header
        baos.flush();
        String output = baos.toString();
        // Ensure no header line is printed, but content is present.
        assertFalse(output.startsWith("#")); // Should not start with a comment if header is empty
        assertTrue(output.contains("key1=value1"));
    }

    @Test
    public void testLoadWithEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ExtendedProperties props = new ExtendedProperties();
        props.load(bais);
        assertTrue(props.isEmpty());
        // Loading an empty stream should not initialize according to the `isInitialized` check in `load`.
        // If the stream is empty, the while loop is never entered, and `isInitialized` remains false.
        assertFalse(props.isInitialized());
    }

    @Test
    public void testAddPropertyHandlesExistingList() {
        ExtendedProperties props = new ExtendedProperties();
        List<String> initialList = new Vector<>();
        initialList.add("first");
        // Use put to add an initial list. addProperty would create a list if key exists.
        props.put("key", initialList);

        // addProperty should convert the existing list to a new list with the new value appended
        props.addProperty("key", "second");

        Object value = props.get("key");
        assertTrue(value instanceof List);
        List<?> list = (List<?>) value;
        assertEquals(2, list.size());
        assertEquals("first", list.get(0));
        assertEquals("second", list.get(1));
    }

    @Test
    public void testGetVectorWithDefault() {
        ExtendedProperties props = new ExtendedProperties();
        Vector<String> defaultVector = new Vector<>();
        defaultVector.add("default1");

        // Test when key does not exist, should return defaultVector (a copy)
        Vector<String> result1 = props.getVector("nonexistentKey", defaultVector);
        assertEquals(defaultVector, result1);
        assertNotSame(defaultVector, result1); // Should be a different instance

        // Test when key exists, should return its value
        props.addProperty("existingKey", "existingValue");
        Vector<String> result2 = props.getVector("existingKey", defaultVector);
        Vector<String> expected = new Vector<>();
        expected.add("existingValue");
        assertEquals(expected, result2);
        assertNotSame(defaultVector, result2); // Should not be the default vector
    }

    @Test
    public void testGetListWithDefault() {
        ExtendedProperties props = new ExtendedProperties();
        List<String> defaultList = new ArrayList<>();
        defaultList.add("default1");

        // Test when key does not exist, should return defaultList (a copy)
        List<String> result1 = props.getList("nonexistentKey", defaultList);
        assertEquals(defaultList, result1);
        assertNotSame(defaultList, result1); // Should be a different instance

        // Test when key exists, should return its value
        props.addProperty("existingKey", "existingValue");
        List<String> result2 = props.getList("existingKey", defaultList);
        List<String> expected = new ArrayList<>();
        expected.add("existingValue");
        assertEquals(expected, result2);
        assertNotSame(defaultList, result2); // Should not be the default list
    }
}
