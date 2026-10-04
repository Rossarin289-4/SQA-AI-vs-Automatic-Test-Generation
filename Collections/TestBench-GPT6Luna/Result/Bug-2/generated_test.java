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
    public void testLoadAndReadProperty() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.load(new java.io.ByteArrayInputStream(
                "# comment\nfirst = one\\\n two\nsecond=three\n".getBytes("8859_1")));
        assertEquals("onetwo", p.getString("first"));
        assertEquals("three", p.getString("second"));
        assertTrue(p.isInitialized());
    }

    @Test
    public void testIncludeSettingAndDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertEquals("include", p.getInclude());
        p.setInclude("imports");
        assertEquals("imports", p.getInclude());
        p.setInclude("");
        assertNull(p.getInclude());
    }

    @Test
    public void testAddPropertySplitsAndPreservesEscapedComma() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("items", "red,blue\\,green");
        assertArrayEquals(new String[] {"red", "blue,green"}, p.getStringArray("items"));
    }

    @Test
    public void testAddPropertyRepeatedValuesAndSetReplacement() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("v", "first");
        p.addProperty("v", "second");
        assertArrayEquals(new String[] {"first", "second"}, p.getStringArray("v"));
        p.setProperty("v", "last");
        assertArrayEquals(new String[] {"last"}, p.getStringArray("v"));
    }

    @Test
    public void testClearPropertyRemovesKey() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("a", "1");
        p.clearProperty("a");
        assertNull(p.getProperty("a"));
        assertFalse(p.getKeys().hasNext());
    }

    @Test
    public void testKeyIterationAndPrefixSubset() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("db.host", "server");
        p.addProperty("db.port", "5432");
        p.addProperty("other", "x");
        Iterator keys = p.getKeys("db.");
        assertEquals("db.host", keys.next());
        assertEquals("db.port", keys.next());
        assertFalse(keys.hasNext());
        ExtendedProperties subset = p.subset("db");
        assertEquals("server", subset.getString("host"));
        assertEquals("5432", subset.getString("port"));
    }

    @Test
    public void testSubsetSingleExactPrefixKey() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("root", "value");
        assertEquals("value", p.subset("root").getString("root"));
        assertNull(p.subset("missing"));
    }

    @Test
    public void testStringArrayAndVectorCopies() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("items", "a,b");
        assertArrayEquals(new String[] {"a", "b"}, p.getStringArray("items"));
        Vector values = p.getVector("items");
        assertEquals(2, values.size());
        values.clear();
        assertEquals(2, p.getVector("items").size());
    }

    @Test
    public void testListCopyAndMissingDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("items", "a,b");
        List copy = p.getList("items");
        assertEquals(2, copy.size());
        copy.clear();
        assertEquals(2, p.getList("items").size());
        assertEquals(0, p.getList("absent").size());
    }

    @Test
    public void testBooleanSpellings() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertEquals("true", p.testBoolean("YES"));
        assertEquals("false", p.testBoolean("Off"));
        assertNull(p.testBoolean("maybe"));
        p.addProperty("flag", "on");
        assertTrue(p.getBoolean("flag"));
    }

    @Test
    public void testBooleanDefaultAndMissingException() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        assertFalse(p.getBoolean("absent", false));
        try {
            p.getBoolean("absent");
            fail("expected NoSuchElementException");
        } catch (NoSuchElementException expected) { }
    }

    @Test
    public void testByteLimits() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "127");
        p.addProperty("min", "-128");
        assertEquals((byte) 127, p.getByte("max"));
        assertEquals((byte) -128, p.getByte("min"));
        p.addProperty("overflow", "128");
        try {
            p.getByte("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testShortLimits() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "32767");
        p.addProperty("min", "-32768");
        assertEquals((short) 32767, p.getShort("max"));
        assertEquals((short) -32768, p.getShort("min"));
        p.addProperty("overflow", "32768");
        try {
            p.getShort("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testIntegerLimitsAndDefault() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "2147483647");
        p.addProperty("min", "-2147483648");
        assertEquals(Integer.MAX_VALUE, p.getInt("max"));
        assertEquals(Integer.MIN_VALUE, p.getInteger("min"));
        assertEquals(9, p.getInt("absent", 9));
        p.addProperty("overflow", "2147483648");
        try {
            p.getInteger("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testLongLimits() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("max", "9223372036854775807");
        p.addProperty("min", "-9223372036854775808");
        assertEquals(Long.MAX_VALUE, p.getLong("max"));
        assertEquals(Long.MIN_VALUE, p.getLong("min"));
        p.addProperty("overflow", "9223372036854775808");
        try {
            p.getLong("overflow");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) { }
    }

    @Test
    public void testFloatAndDoubleParsing() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("f", "1.25");
        p.addProperty("d", "2.5");
        assertEquals(1.25f, p.getFloat("f"), 1e-6f);
        assertEquals(2.5, p.getDouble("d"), 1e-12);
    }

    @Test
    public void testGetPropertiesParsesTokens() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("settings", "a=one,b=two");
        Properties props = p.getProperties("settings");
        assertEquals("one", props.getProperty("a"));
        assertEquals("two", props.getProperty("b"));
    }

    @Test
    public void testGetPropertiesRejectsMalformedToken() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("settings", "malformed");
        try {
            p.getProperties("settings");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testCombineOverwritesAndAddsEntries() throws Exception {
        ExtendedProperties target = new ExtendedProperties();
        target.addProperty("shared", "old");
        ExtendedProperties source = new ExtendedProperties();
        source.addProperty("shared", "new");
        source.addProperty("added", "value");
        target.combine(source);
        assertEquals("new", target.getString("shared"));
        assertEquals("value", target.getString("added"));
    }

    @Test
    public void testSaveEscapesCommasAndBackslashes() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("key", "a\\,b");
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        p.save(out, null);
        String saved = new String(out.toByteArray(), "8859_1");
        assertTrue(saved.contains("key=a\\\\,b"));
    }

    @Test
    public void testConvertProperties() throws Exception {
        Properties props = new Properties();
        props.setProperty("k", "v");
        ExtendedProperties converted = ExtendedProperties.convertProperties(props);
        assertEquals("v", converted.getString("k"));
        assertTrue(converted.isInitialized());
    }

    @Test
    public void testPropertiesReaderSkipsCommentsAndBlankLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(new java.io.StringReader(
                        "\n# note\n key=value \n"));
        assertEquals("key=value", reader.readProperty());
        assertNull(reader.readProperty());
    }

    @Test
    public void testPropertiesReaderJoinsContinuationLines() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(new java.io.StringReader(
                        "left\\\nright\n"));
        assertEquals("leftright", reader.readProperty());
        assertNull(reader.readProperty());
    }

    @Test
    public void testPropertiesReaderEvenBackslashesDoNotContinue() throws Exception {
        ExtendedProperties.PropertiesReader reader =
                new ExtendedProperties.PropertiesReader(new java.io.StringReader(
                        "end\\\\\nnext\n"));
        assertEquals("end\\\\", reader.readProperty());
        assertEquals("next", reader.readProperty());
    }

    @Test
    public void testPropertiesTokenizerJoinsEscapedComma() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer("a\\,b,c");
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("a,b", tokenizer.nextToken());
        assertTrue(tokenizer.hasMoreTokens());
        assertEquals("c", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizerTrimsTokens() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer(" x , y ");
        assertEquals("x", tokenizer.nextToken());
        assertEquals("y", tokenizer.nextToken());
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testPropertiesTokenizerEmptyInputHasNoTokens() throws Exception {
        ExtendedProperties.PropertiesTokenizer tokenizer =
                new ExtendedProperties.PropertiesTokenizer("");
        assertFalse(tokenizer.hasMoreTokens());
    }

    @Test
    public void testDisplayRunsWithConfiguredProperties() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.addProperty("shown", "value");
        p.display();
        assertEquals("value", p.getString("shown"));
    }

    @Test
    public void testDisplayRunsWithEmptyProperties() throws Exception {
        ExtendedProperties p = new ExtendedProperties();
        p.display();
        assertFalse(p.getKeys().hasNext());
    }
}
