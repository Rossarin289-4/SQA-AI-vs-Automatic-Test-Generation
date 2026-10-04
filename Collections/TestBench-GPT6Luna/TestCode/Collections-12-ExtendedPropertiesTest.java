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
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;

public class ExtendedPropertiesTest {
    @Test
    public void testAddPropertyCommaSeparatedAndEscapedComma() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("items", "red,blue\\,green");
        assertArrayEquals(new String[] {"red", "blue,green"}, p.getStringArray("items"));
    }

    @Test
    public void testAddPropertyRepeatedAndKeys() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("first", "a");
        p.addProperty("first", "b");
        p.addProperty("second", "c");
        assertArrayEquals(new String[] {"a", "b"}, p.getStringArray("first"));
        Iterator keys = p.getKeys();
        assertEquals("first", keys.next());
        assertEquals("second", keys.next());
        assertFalse(keys.hasNext());
    }

    @Test
    public void testSetPropertyReplacesAllValues() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("k", "old");
        p.addProperty("k", "older");
        p.setProperty("k", "new");
        assertArrayEquals(new String[] {"new"}, p.getStringArray("k"));
    }

    @Test
    public void testLoadParsingContinuationAndEmptyValue() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        byte[] data = "a=one\\\n two\nempty=\n#comment\n".getBytes("8859_1");
        p.load(new java.io.ByteArrayInputStream(data));
        assertEquals("onetwo", p.getString("a"));
        assertEquals("", p.getString("empty"));
        assertTrue(p.isInitialized());
    }

    @Test
    public void testIncludeSetterNullAndEmpty() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertEquals("include", p.getInclude());
        p.setInclude("custom");
        assertEquals("custom", p.getInclude());
        p.setInclude(null);
        assertNull(p.getInclude());
        p.setInclude("");
        assertNull(p.getInclude());
    }

    @Test
    public void testBooleanForms() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertEquals("true", p.testBoolean("YeS"));
        assertEquals("false", p.testBoolean("OFF"));
        assertNull(p.testBoolean("maybe"));
    }

    @Test
    public void testBooleanParsingAndDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("yes", "YES");
        p.addProperty("no", "no");
        assertTrue(p.getBoolean("yes"));
        assertFalse(p.getBoolean("no"));
        assertFalse(p.getBoolean("missing", false));
    }

    @Test
    public void testGetStringArrayAndEmptyMissing() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("single", "value");
        assertArrayEquals(new String[] {"value"}, p.getStringArray("single"));
        assertArrayEquals(new String[0], p.getStringArray("missing"));
    }

    @Test
    public void testGetPropertiesSplitsAndTrims() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("pairs", " x = 1 , y=two");
        Properties result = p.getProperties("pairs");
        assertEquals("1", result.getProperty("x"));
        assertEquals("two", result.getProperty("y"));
    }

    @Test
    public void testGetPropertiesRejectsMalformedToken() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("pairs", "broken");
        try {
            p.getProperties("pairs");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testSubsetStripsPrefixAndPreservesValues() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("db.host", "localhost");
        p.addProperty("db.port", "8080");
        ExtendedProperties subset = p.subset("db");
        assertArrayEquals(new String[] {"localhost"}, subset.getStringArray("host"));
        assertArrayEquals(new String[] {"8080"}, subset.getStringArray("port"));
    }

    @Test
    public void testSubsetExactPrefixKey() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("db", "value");
        ExtendedProperties subset = p.subset("db");
        assertArrayEquals(new String[] {"value"}, subset.getStringArray("db"));
        assertNull(p.subset("absent"));
    }

    @Test
    public void testClearPropertyRemovesKeyAndValue() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("a", "one");
        p.addProperty("b", "two");
        p.clearProperty("a");
        assertNull(p.getProperty("a"));
        Iterator keys = p.getKeys();
        assertEquals("b", keys.next());
        assertFalse(keys.hasNext());
    }

    @Test
    public void testNumericConversionAtByteEdges() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "127");
        p.addProperty("min", "-128");
        assertEquals((byte) 127, p.getByte("max"));
        assertEquals((byte) -128, p.getByte("min"));
        p.addProperty("overflow", "128");
        try {
            p.getByte("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testNumericConversionAtShortEdges() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "32767");
        p.addProperty("min", "-32768");
        assertEquals((short) 32767, p.getShort("max"));
        assertEquals((short) -32768, p.getShort("min"));
        p.addProperty("overflow", "32768");
        try {
            p.getShort("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testIntegerConversionAtEdges() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "2147483647");
        p.addProperty("min", "-2147483648");
        assertEquals(2147483647, p.getInt("max"));
        assertEquals(-2147483648, p.getInteger("min"));
        p.addProperty("overflow", "2147483648");
        try {
            p.getInteger("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testLongConversionAtEdges() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "9223372036854775807");
        p.addProperty("min", "-9223372036854775808");
        assertEquals(9223372036854775807L, p.getLong("max"));
        assertEquals(-9223372036854775808L, p.getLong("min"));
        p.addProperty("overflow", "9223372036854775808");
        try {
            p.getLong("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testFloatingPointConversions() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("f", "1.25");
        p.addProperty("d", "2.5");
        assertEquals(1.25f, p.getFloat("f"), 1e-6);
        assertEquals(2.5, p.getDouble("d"), 1e-9);
    }

    @Test
    public void testDefaultsForAbsentNumericAndStringKeys() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertEquals("fallback", p.getString("missing", "fallback"));
        assertEquals(42, p.getInt("missing", 42));
        assertEquals(9L, p.getLong("missing", 9L));
    }

    @Test
    public void testVectorAndListCopies() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("items", "a");
        p.addProperty("items", "b");
        Vector vector = p.getVector("items");
        List list = p.getList("items");
        vector.add("c");
        list.add("d");
        assertArrayEquals(new String[] {"a", "b"}, p.getStringArray("items"));
        assertEquals(3, vector.size());
        assertEquals(3, list.size());
    }

    @Test
    public void testConvertPropertiesAndPutRemove() throws Exception {
        Properties input = new Properties();
        input.setProperty("key", "value");
        ExtendedProperties p = ExtendedProperties.convertProperties(input);
        assertEquals("value", p.getString("key"));
        assertEquals("value", p.put("key", "next"));
        assertArrayEquals(new String[] {"value", "next"}, p.getStringArray("key"));
        assertEquals(new Vector(java.util.Arrays.asList(new String[] {"value", "next"})),
                     p.remove("key"));
        assertNull(p.getProperty("key"));
    }

    @Test
    public void testCombineReplacesExistingValue() throws Exception {
        ExtendedProperties left = new ExtendedProperties();
        ExtendedProperties right = new ExtendedProperties();
        left.addProperty("k", "old");
        right.addProperty("k", "new");
        right.addProperty("other", "value");
        left.combine(right);
        assertArrayEquals(new String[] {"new"}, left.getStringArray("k"));
        assertEquals("value", left.getString("other"));
    }

    @Test
    public void testSaveEscapesCommasAndBackslashes() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("key", "a,b\\c");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        p.save(out, "header");
        String saved = new String(out.toByteArray(), "8859_1");
        assertTrue(saved.contains("header"));
        assertTrue(saved.contains("key=a\\,b\\\\c"));
    }

    @Test
    public void testReadPropertySkipsBlankAndCommentLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
            new ExtendedProperties.PropertiesReader(
                new java.io.StringReader("\n #comment\nkey=value\n"));
        assertEquals("key=value", reader.readProperty());
        assertNull(reader.readProperty());
    }

    @Test
    public void testReadPropertyJoinsContinuedLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
            new ExtendedProperties.PropertiesReader(
                new java.io.StringReader("ab\\\ncd\n"));
        assertEquals("abcd", reader.readProperty());
        assertNull(reader.readProperty());
    }

    @Test
    public void testReadPropertyRequiresOddTrailingSlashForContinuation() throws Exception {
        ExtendedProperties.PropertiesReader reader =
            new ExtendedProperties.PropertiesReader(
                new java.io.StringReader("ab\\\\\nnext\n"));
        assertEquals("ab\\\\", reader.readProperty());
        assertEquals("next", reader.readProperty());
    }

    @Test
    public void testTokenizerJoinsEscapedCommaAndTrims() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
            new ExtendedProperties.PropertiesTokenizer(" first\\,part , second ");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("first,part", tokenizer.nextToken());
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("second", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testTokenizerEmptyAndTrailingDelimiter() throws Exception {
        ExtendedProperties.PropertiesTokenizer empty =
            new ExtendedProperties.PropertiesTokenizer("");
        assertFalse(empty.hasMoreTokens());

        ExtendedProperties.PropertiesTokenizer trailing =
            new ExtendedProperties.PropertiesTokenizer("a,");
        assertTrue(trailing.hasMoreTokens());
        assertEquals("a", trailing.nextToken());
        assertFalse(trailing.hasMoreTokens());
    }

    @Test
    public void testDisplayAndPutAllFromMap() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        Map source = new Hashtable();
        source.put("a", "one");
        source.put("b", "two");
        p.putAll(source);
        assertArrayEquals(new String[] {"one"}, p.getStringArray("a"));
        assertArrayEquals(new String[] {"two"}, p.getStringArray("b"));

        java.io.PrintStream original = System.out;
        java.io.ByteArrayOutputStream captured = new java.io.ByteArrayOutputStream();
        try {
            System.setOut(new java.io.PrintStream(captured));
            p.display();
        } finally {
            System.setOut(original);
        }
        String output = new String(captured.toByteArray(), "8859_1");
        assertTrue(output.contains("a => one"));
        assertTrue(output.contains("b => two"));
    }

    @Test
    public void testPutAllFromExtendedPropertiesPreservesEntries() throws Exception {
        ExtendedProperties source = new ExtendedProperties();
        source.addProperty("first", "one");
        source.addProperty("second", "two");
        ExtendedProperties destination = new ExtendedProperties();
        destination.putAll(source);
        assertArrayEquals(new String[] {"one"}, destination.getStringArray("first"));
        assertArrayEquals(new String[] {"two"}, destination.getStringArray("second"));
        Iterator keys = destination.getKeys();
        assertEquals("first", keys.next());
        assertEquals("second", keys.next());
        assertFalse(keys.hasNext());
    }

    @Test
    public void testPutAllOverwritesByAddingAndRemoveReturnsValue() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("key", "old");
        Map source = new Hashtable();
        source.put("key", "new");
        p.putAll(source);
        assertArrayEquals(new String[] {"old", "new"}, p.getStringArray("key"));
        assertArrayEquals(new String[] {"old", "new"}, (String[]) p.getStringArray("key"));
        assertEquals(new Vector(java.util.Arrays.asList(new String[] {"old", "new"})), p.remove("key"));
        assertNull(p.getProperty("key"));
    }
}
