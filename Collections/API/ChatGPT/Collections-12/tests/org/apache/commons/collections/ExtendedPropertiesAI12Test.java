package org.apache.commons.collections;

import java.io.StringReader;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI12Test {

    @Test
    public void testAddPropertyAccumulatesCommaSeparatedValues() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("colors", "red,green");
        properties.addProperty("colors", "blue");

        Assert.assertEquals("red", properties.getString("colors"));
        String[] values = properties.getStringArray("colors");
        Assert.assertEquals(3, values.length);
        Assert.assertEquals("red", values[0]);
        Assert.assertEquals("green", values[1]);
        Assert.assertEquals("blue", values[2]);
    }

    @Test
    public void testEscapedCommaRemainsWithinSingleValue() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("message", "hello\\, world");

        String[] values = properties.getStringArray("message");
        Assert.assertEquals(1, values.length);
        Assert.assertEquals("hello, world", values[0]);
    }

    @Test
    public void testSetPropertyReplacesExistingValuesAndClearRemovesIt() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.addProperty("letters", "a,b");

        properties.setProperty("letters", "x,y");

        Assert.assertEquals(2, properties.getStringArray("letters").length);
        Assert.assertEquals("x", properties.getStringArray("letters")[0]);
        Assert.assertEquals("y", properties.getStringArray("letters")[1]);

        properties.clearProperty("letters");

        Assert.assertFalse(properties.containsKey("letters"));
        Assert.assertNull(properties.getProperty("letters"));
    }

    @Test
    public void testPutAppendsAndReturnsPreviousPropertyValue() {
        ExtendedProperties properties = new ExtendedProperties();

        Assert.assertNull(properties.put("item", "first"));
        Assert.assertEquals("first", properties.put("item", "second"));

        String[] values = properties.getStringArray("item");
        Assert.assertEquals(2, values.length);
        Assert.assertEquals("first", values[0]);
        Assert.assertEquals("second", values[1]);

        Assert.assertEquals("first", properties.remove("item"));
        Assert.assertFalse(properties.containsKey("item"));
    }

    @Test
    public void testStringInterpolationResolvesNestedProperties() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("host", "example.org");
        properties.setProperty("path", "service");
        properties.setProperty("url", "http://${host}/${path}");

        Assert.assertEquals("http://example.org/service", properties.getString("url"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationCycleThrowsIllegalStateException() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("first", "${second}");
        properties.setProperty("second", "${first}");

        properties.getString("first");
    }

    @Test
    public void testNumericConversionCachesParsedInteger() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("count", "42");

        Assert.assertEquals(42, properties.getInteger("count"));
        Assert.assertTrue(properties.get("count") instanceof Integer);
        Assert.assertEquals(42, properties.getInteger("count", 7));
    }

    @Test(expected = NoSuchElementException.class)
    public void testMissingRequiredLongThrowsNoSuchElementException() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.getLong("missing");
    }

    @Test
    public void testLoadReaderParsesRepeatedAndEscapedValues() throws Exception {
        ExtendedProperties properties = new ExtendedProperties();
        String source =
                "# a comment\n" +
                "alpha = one\n" +
                "alpha = two\n" +
                "escaped = hello\\,world\n";

        properties.load(new StringReader(source));

        String[] alpha = properties.getStringArray("alpha");
        Assert.assertEquals(2, alpha.length);
        Assert.assertEquals("one", alpha[0]);
        Assert.assertEquals("two", alpha[1]);

        String[] escaped = properties.getStringArray("escaped");
        Assert.assertEquals(1, escaped.length);
        Assert.assertEquals("hello,world", escaped[0]);
    }

    @Test
    public void testConvertPropertiesIncludesDefaultParentProperties() {
        Properties parent = new Properties();
        parent.setProperty("parentKey", "parentValue");
        Properties child = new Properties(parent);
        child.setProperty("childKey", "childValue");

        ExtendedProperties properties = ExtendedProperties.convertProperties(child);

        Assert.assertEquals("parentValue", properties.getString("parentKey"));
        Assert.assertEquals("childValue", properties.getString("childKey"));
    }
}
