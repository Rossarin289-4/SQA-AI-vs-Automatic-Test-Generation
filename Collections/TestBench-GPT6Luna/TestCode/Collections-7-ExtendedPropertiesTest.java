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
    public void testInitializationAndIncludeSetting() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertFalse(p.isInitialized());
        assertEquals("include", p.getInclude());
        p.setInclude("");
        assertNull(p.getInclude());
        p.setInclude("load");
        assertEquals("load", p.getInclude());
    }

    @Test
    public void testLoadParsesRepeatedCommaValuesAndContinuation() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        String text = "# comment\nkey = first\nkey = second, third\\\n  fourth\n";
        p.load(new java.io.ByteArrayInputStream(text.getBytes("8859_1")));
        assertTrue(p.isInitialized());
        assertArrayEquals(new String[] {"first", "second", "thirdfourth"},
                p.getStringArray("key"));
    }

    @Test
    public void testLoadIgnoresEmptyValueAndInvalidKeyLine() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.load(new java.io.ByteArrayInputStream("=bad\nempty=\n".getBytes("8859_1")));
        assertNull(p.getProperty("empty"));
        assertEquals(0, p.getStringArray("empty").length);
    }

    @Test
    public void testAddPropertySplitsAndUnescapesComma() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("v", "a\\,b,c");
        assertArrayEquals(new String[] {"a,b", "c"}, p.getStringArray("v"));
    }

    @Test
    public void testSetPropertyReplacesValuesAndClearRemovesKey() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("v", "old");
        p.addProperty("v", "extra");
        p.setProperty("v", "new");
        assertArrayEquals(new String[] {"new"}, p.getStringArray("v"));
        p.clearProperty("v");
        assertNull(p.getProperty("v"));
        assertFalse(p.getKeys().hasNext());
    }

    @Test
    public void testGetKeysPrefixAndSubset() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("db.host", "h");
        p.addProperty("db.port", "9");
        p.addProperty("other", "x");
        Iterator keys = p.getKeys("db.");
        assertEquals("db.host", keys.next());
        assertEquals("db.port", keys.next());
        assertFalse(keys.hasNext());
        ExtendedProperties subset = p.subset("db");
        assertEquals("h", subset.getString("host"));
        assertEquals("9", subset.getString("port"));
        assertNull(p.subset("missing"));
    }

    @Test
    public void testGetStringInterpolationAndMissingPlaceholder() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("name", "Ada");
        p.addProperty("greeting", "Hi ${name} ${absent}");
        assertEquals("Hi Ada ${absent}", p.getString("greeting"));
    }

    @Test
    public void testGetPropertiesParsesTokens() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("opts", "a=1,b=two");
        Properties result = p.getProperties("opts");
        assertEquals("1", result.getProperty("a"));
        assertEquals("two", result.getProperty("b"));
    }

    @Test
    public void testGetPropertiesRejectsMalformedToken() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("opts", "malformed");
        try {
            p.getProperties("opts");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testGetVectorAndListReturnCopiesForStoredList() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("v", "one");
        p.addProperty("v", "two");
        Vector vector = p.getVector("v");
        List list = p.getList("v");
        vector.add("extra");
        list.clear();
        assertArrayEquals(new String[] {"one", "two"}, p.getStringArray("v"));
    }

    @Test
    public void testBooleanTextForms() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertEquals("true", p.testBoolean("YES"));
        assertEquals("false", p.testBoolean("Off"));
        assertNull(p.testBoolean("maybe"));
    }

    @Test
    public void testGetBooleanParsesAndUsesDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("flag", "On");
        assertTrue(p.getBoolean("flag"));
        assertFalse(p.getBoolean("missing", false));
        assertEquals(Boolean.TRUE, p.getProperty("flag"));
    }

    @Test
    public void testGetBooleanMissingWithoutDefaultThrows() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        try {
            p.getBoolean("missing");
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) { }
    }

    @Test
    public void testByteStringRangeEdges() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "127");
        p.addProperty("min", "-128");
        assertEquals((byte) 127, p.getByte("max"));
        assertEquals((byte) -128, p.getByte("min"));
        p.addProperty("tooHigh", "128");
        try {
            p.getByte("tooHigh");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testShortStringRangeEdges() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "32767");
        p.addProperty("min", "-32768");
        assertEquals((short) 32767, p.getShort("max"));
        assertEquals((short) -32768, p.getShort("min"));
        p.addProperty("tooLow", "-32769");
        try {
            p.getShort("tooLow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testIntegerRangeEdgesAndDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "2147483647");
        p.addProperty("min", "-2147483648");
        assertEquals(2147483647, p.getInt("max"));
        assertEquals(-2147483648, p.getInteger("min"));
        assertEquals(8, p.getInt("missing", 8));
        p.addProperty("tooHigh", "2147483648");
        try {
            p.getInt("tooHigh");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testLongStringRangeEdges() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "9223372036854775807");
        p.addProperty("min", "-9223372036854775808");
        assertEquals(Long.MAX_VALUE, p.getLong("max"));
        assertEquals(Long.MIN_VALUE, p.getLong("min"));
        p.addProperty("tooHigh", "9223372036854775808");
        try {
            p.getLong("tooHigh");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testFloatingPointConversionsAndDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("f", "1.5");
        p.addProperty("d", "2.25");
        assertEquals(1.5f, p.getFloat("f"), 1e-6);
        assertEquals(2.25, p.getDouble("d"), 1e-9);
        assertEquals(3.5, p.getDouble("missing", 3.5), 1e-9);
    }

    @Test
    public void testSaveWritesEscapedValueAndHeader() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("v", "a,b");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        p.save(out, "head");
        String saved = new String(out.toByteArray(), "8859_1");
        assertTrue(saved.contains("head"));
        assertTrue(saved.contains("v=a"));
        assertTrue(saved.contains("b"));
    }

    @Test
    public void testCombineOverwritesDestinationValue() throws Exception {
        ExtendedProperties destination = new ExtendedProperties();
        destination.addProperty("k", "old");
        ExtendedProperties source = new ExtendedProperties();
        source.addProperty("k", "new");
        destination.combine(source);
        assertArrayEquals(new String[] {"new"}, destination.getStringArray("k"));
    }

    @Test
    public void testConvertPropertiesAndPutRemove() throws Exception {
        Properties base = new Properties();
        base.setProperty("from", "source");
        ExtendedProperties p = ExtendedProperties.convertProperties(base);
        assertEquals("source", p.getString("from"));
        assertNull(p.put("to", "value"));
        assertEquals("value", p.getProperty("to"));
        assertEquals("value", p.remove("to"));
        assertNull(p.getProperty("to"));
    }

    @Test
    public void testPutAllFromMap() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        Map map = new Hashtable();
        map.put("a", "one");
        map.put("b", "two");
        p.putAll(map);
        assertEquals("one", p.getString("a"));
        assertEquals("two", p.getString("b"));
    }

    @Test
    public void testNullSaveIsNoOp() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("k", "v");
        p.save(null, "header");
        assertEquals("v", p.getString("k"));
    }

    @Test
    public void testReadPropertySkipsBlankAndCommentLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(
                        new java.io.StringReader("\n # comment\n key = value \n"));
        assertEquals("key = value", reader.readProperty());
    }

    @Test
    public void testReadPropertyJoinsContinuationLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(
                        new java.io.StringReader("left\\\n right\n"));
        assertEquals("leftright", reader.readProperty());
    }

    @Test
    public void testReadPropertyDoesNotContinueEvenBackslashes() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(
                        new java.io.StringReader("x\\\\\nnext\n"));
        assertEquals("x\\\\", reader.readProperty());
        assertEquals("next", reader.readProperty());
    }

    @Test
    public void testReadPropertyReturnsNullAtEndOfInput() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(new java.io.StringReader(""));
        assertNull(reader.readProperty());
    }

    @Test
    public void testTokenizerCombinesEscapedCommaAndReturnsNextToken() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer("a\\,b,c");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("a,b", tokenizer.nextToken());
        assertEquals("c", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testTokenizerPreservesEvenBackslashPairBeforeDelimiter() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer("x\\\\,y");
        assertEquals("x\\\\", tokenizer.nextToken());
        assertEquals("y", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testTokenizerSkipsEmptyTokensAtBoundaries() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer(",a,,");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("a", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testDisplayPrintsConfiguredKeyAndValue() throws Exception {
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
