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
    @Test
    public void testInitializeAndIncludeSetting() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertFalse(p.isInitialized());
        assertEquals("include", p.getInclude());
        p.setInclude("");
        assertNull(p.getInclude());
        p.addProperty("a", "b");
        assertTrue(p.isInitialized());
    }

    @Test
    public void testAddPropertySplitsEscapedCommaAndDuplicates() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("items", "red,blue\\,green");
        p.addProperty("items", "gold");
        assertArrayEquals(new String[] {"red", "blue,green", "gold"}, p.getStringArray("items"));
    }

    @Test
    public void testSetPropertyReplacesAndClearRemovesKey() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("key", "old");
        p.addProperty("key", "extra");
        p.setProperty("key", "new");
        assertEquals("new", p.getString("key"));
        p.clearProperty("key");
        assertNull(p.getProperty("key"));
        assertFalse(p.getKeys().hasNext());
    }

    @Test
    public void testLoadParsesCommentsContinuationAndRepeatedKeys() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.load(new java.io.ByteArrayInputStream(
                "# ignored\nname = first\\\n second\nname=third\nempty=\n".getBytes("8859_1")));
        assertArrayEquals(new String[] {"firstsecond", "third"}, p.getStringArray("name"));
        assertTrue(p.isInitialized());
        assertNull(p.getProperty("empty"));
    }

    @Test
    public void testGetKeysPrefixAndSubset() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("db.host", "localhost");
        p.addProperty("db.port", "5432");
        p.addProperty("other", "x");
        Iterator keys = p.getKeys("db.");
        assertEquals("db.host", keys.next());
        assertEquals("db.port", keys.next());
        assertFalse(keys.hasNext());
        ExtendedProperties subset = p.subset("db");
        assertEquals("localhost", subset.getString("host"));
        assertEquals("5432", subset.getString("port"));
        assertNull(p.subset("missing"));
    }

    @Test
    public void testGetStringInterpolationAndUnresolvedVariable() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("who", "world");
        p.addProperty("greeting", "hello ${who} ${absent}");
        assertEquals("hello world ${absent}", p.getString("greeting"));
    }

    @Test
    public void testGetStringArrayAndVectorListCopies() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("values", "one,two");
        assertArrayEquals(new String[] {"one", "two"}, p.getStringArray("values"));
        Vector vector = p.getVector("values");
        vector.add("outside");
        assertEquals(2, p.getStringArray("values").length);
        List list = p.getList("values");
        list.clear();
        assertEquals(2, p.getStringArray("values").length);
    }

    @Test
    public void testGetPropertiesParsesKeyValueTokens() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("pairs", "a=1,b=2");
        Properties props = p.getProperties("pairs");
        assertEquals("1", props.getProperty("a"));
        assertEquals("2", props.getProperty("b"));
    }

    @Test
    public void testGetPropertiesRejectsTokenWithoutEquals() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("pairs", "malformed");
        try {
            p.getProperties("pairs");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testBooleanAliasesAndDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("yes", "YeS");
        p.addProperty("no", "off");
        assertTrue(p.getBoolean("yes"));
        assertFalse(p.getBoolean("no"));
        assertEquals("true", p.testBoolean("ON"));
        assertNull(p.testBoolean("maybe"));
        assertTrue(p.getBoolean("missing", true));
    }

    @Test
    public void testByteRangeEdgesAndOverflow() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "127");
        p.addProperty("min", "-128");
        p.addProperty("overflow", "128");
        assertEquals((byte) 127, p.getByte("max"));
        assertEquals((byte) -128, p.getByte("min"));
        try {
            p.getByte("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testIntegerRangeEdgesAndOverflow() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "2147483647");
        p.addProperty("min", "-2147483648");
        p.addProperty("overflow", "2147483648");
        assertEquals(Integer.MAX_VALUE, p.getInt("max"));
        assertEquals(Integer.MIN_VALUE, p.getInteger("min"));
        try {
            p.getInteger("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testLongAndFloatingConversions() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("long", "9223372036854775807");
        p.addProperty("float", "1.5");
        p.addProperty("double", "2.25");
        assertEquals(Long.MAX_VALUE, p.getLong("long"));
        assertEquals(1.5f, p.getFloat("float"), 1e-6f);
        assertEquals(2.25, p.getDouble("double"), 1e-12);
    }

    @Test
    public void testNumericDefaultsForMissingKeys() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertEquals((short) 7, p.getShort("missing", (short) 7));
        assertEquals(9, p.getInt("missing", 9));
        assertEquals(11L, p.getLong("missing", 11L));
        assertEquals(1.25f, p.getFloat("missing", 1.25f), 1e-6f);
        assertEquals(2.5, p.getDouble("missing", 2.5), 1e-12);
    }

    @Test
    public void testConvertPropertiesAndPutReturnPreviousValue() throws Exception {
        Properties source = new Properties();
        source.setProperty("x", "old");
        ExtendedProperties p = ExtendedProperties.convertProperties(source);
        assertEquals("old", p.getString("x"));
        assertEquals("old", p.put("x", "new"));
        assertEquals("old", p.getString("x"));
    }

    @Test
    public void testPutAllAndRemove() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        Map map = new Hashtable();
        map.put("a", "one");
        map.put("b", "two");
        p.putAll(map);
        assertEquals("two", p.getString("b"));
        assertEquals("one", p.remove("a"));
        assertNull(p.getProperty("a"));
    }

    @Test
    public void testCombineCopiesValues() throws Exception {
        ExtendedProperties source = new ExtendedProperties();
        source.addProperty("shared", "source");
        ExtendedProperties target = new ExtendedProperties();
        target.addProperty("shared", "target");
        target.combine(source);
        assertEquals("source", target.getString("shared"));
    }

    @Test
    public void testSaveWritesHeaderAndEscapedValue() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("key", "a,b");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        p.save(out, "header");
        String saved = new String(out.toByteArray(), "8859_1");
        assertTrue(saved.contains("header"));
        assertTrue(saved.contains("key=a\\,b"));
    }

    @Test
    public void testMissingRequiredPropertyThrows() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        try {
            p.getBoolean("missing");
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) {
        }
    }

    @Test
    public void testPropertiesReaderSkipsBlankAndCommentLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(
                        new java.io.StringReader("\n # comment\nkey=value\n"));
        assertEquals("key=value", reader.readProperty());
        assertNull(reader.readProperty());
    }

    @Test
    public void testPropertiesReaderJoinsContinuationAndTrimsLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(
                        new java.io.StringReader("  first\\\n second  \nlast\n"));
        assertEquals("firstsecond", reader.readProperty());
        assertEquals("last", reader.readProperty());
        assertNull(reader.readProperty());
    }

    @Test
    public void testPropertiesReaderEvenTrailingBackslashesDoNotContinue() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(
                        new java.io.StringReader("value\\\\\nnext\n"));
        assertEquals("value\\\\", reader.readProperty());
        assertEquals("next", reader.readProperty());
    }

    @Test
    public void testPropertiesReaderOddTrailingBackslashesContinue() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(
                        new java.io.StringReader("value\\\\\\\nnext\n"));
        assertEquals("value\\\\next", reader.readProperty());
    }

    @Test
    public void testPropertiesTokenizerJoinsEscapedCommaAndTrimsTokens() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer(" one\\,two , three ");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("one,two", tokenizer.nextToken());
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("three", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizerEscapedCommaAtEndConsumesNextToken() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer("left\\,right,tail");
        assertEquals("left,right", tokenizer.nextToken());
        assertEquals("tail", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizerEmptyInputHasNoTokens() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer("");
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testDisplayWritesConfiguredKeyAndValue() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("key", "value");
        java.io.PrintStream original = System.out;
        java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();
        try {
            System.setOut(new java.io.PrintStream(output));
            p.display();
        } finally {
            System.setOut(original);
        }
        assertEquals("key => value" + System.lineSeparator(),
                new String(output.toByteArray(), "8859_1"));
    }
}
