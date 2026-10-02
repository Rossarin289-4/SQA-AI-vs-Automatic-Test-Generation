package org.apache.commons.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI7Test {

    @Test
    public void testSetAndGetStringProperty() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.setProperty("name", "commons");

        Assert.assertEquals("commons", properties.getString("name"));
        Assert.assertEquals("commons", properties.getProperty("name"));
        Assert.assertEquals("fallback", properties.getString("missing", "fallback"));
    }

    @Test
    public void testRepeatedPropertiesProduceOrderedStringArray() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("server", "one");
        properties.addProperty("server", "two");
        properties.addProperty("server", "three");

        Assert.assertArrayEquals(
                new String[] { "one", "two", "three" },
                properties.getStringArray("server"));
        Assert.assertEquals("one", properties.getString("server"));
        Assert.assertTrue(properties.getProperty("server") instanceof Vector);
    }

    @Test
    public void testCommaSeparatedAndEscapedCommaValuesAreTokenized() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("values", "first,second\\,part,third");

        Assert.assertArrayEquals(
                new String[] { "first", "second,part", "third" },
                properties.getStringArray("values"));
    }

    @Test
    public void testSetPropertyReplacesPreviousMultipleValues() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("color", "red");
        properties.addProperty("color", "blue");
        properties.setProperty("color", "green");

        Assert.assertArrayEquals(new String[] { "green" }, properties.getStringArray("color"));
        Assert.assertEquals("green", properties.getString("color"));
    }

    @Test
    public void testInterpolationResolvesNestedProperties() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("host", "example.org");
        properties.setProperty("port", "8080");
        properties.setProperty("endpoint", "http://${host}:${port}/service");

        Assert.assertEquals("http://example.org:8080/service", properties.getString("endpoint"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationDetectsCircularReference() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("one", "${two}");
        properties.setProperty("two", "${one}");

        properties.getString("one");
    }

    @Test
    public void testNumericGettersConvertStringAndCacheTypedValue() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("count", "42");
        properties.setProperty("ratio", "3.5");
        properties.setProperty("size", "12345678901");

        Assert.assertEquals(42, properties.getInteger("count").intValue());
        Assert.assertTrue(properties.get("count") instanceof Integer);
        Assert.assertEquals(3.5d, properties.getDouble("ratio").doubleValue(), 0.0d);
        Assert.assertTrue(properties.get("ratio") instanceof Double);
        Assert.assertEquals(12345678901L, properties.getLong("size").longValue());
        Assert.assertTrue(properties.get("size") instanceof Long);
    }

    @Test
    public void testSubsetStripsPrefixAndPreservesMatchingValues() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("database.host", "localhost");
        properties.setProperty("database.port", "5432");
        properties.setProperty("other.value", "ignored");

        ExtendedProperties subset = properties.subset("database");

        Assert.assertNotNull(subset);
        Assert.assertEquals("localhost", subset.getString("host"));
        Assert.assertEquals("5432", subset.getString("port"));
        Assert.assertNull(subset.getString("other.value"));
    }

    @Test
    public void testKeysFollowPropertyInsertionOrder() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("first", "1");
        properties.setProperty("second", "2");
        properties.addProperty("first", "3");

        ArrayList keys = new ArrayList();
        for (Iterator iterator = properties.getKeys(); iterator.hasNext();) {
            keys.add(iterator.next());
        }

        Assert.assertEquals(2, keys.size());
        Assert.assertEquals("first", keys.get(0));
        Assert.assertEquals("second", keys.get(1));
    }

    @Test
    public void testConvertPropertiesCopiesValues() {
        Properties source = new Properties();
        source.setProperty("alpha", "A");
        source.setProperty("beta", "B");

        ExtendedProperties converted = ExtendedProperties.convertProperties(source);

        Assert.assertEquals("A", converted.getString("alpha"));
        Assert.assertEquals("B", converted.getString("beta"));
        Assert.assertEquals(2, converted.size());
    }

    @Test
    public void testPutAndRemoveReturnPreviousValueAndUpdateProperties() {
        ExtendedProperties properties = new ExtendedProperties();

        Assert.assertNull(properties.put("key", "first"));
        Assert.assertEquals("first", properties.put("key", "second"));
        Assert.assertArrayEquals(new String[] { "first", "second" }, properties.getStringArray("key"));

        Assert.assertTrue(properties.remove("key") instanceof Vector);
        Assert.assertNull(properties.getProperty("key"));
        Assert.assertFalse(properties.containsKey("key"));
    }
}
