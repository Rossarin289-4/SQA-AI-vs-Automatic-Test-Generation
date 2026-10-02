package org.apache.commons.collections;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI13Test {

    @Test
    public void repeatedPropertiesProduceOrderedStringArray() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("color", "red");
        properties.addProperty("color", "green");
        properties.addProperty("color", "blue");

        Assert.assertArrayEquals(new String[] { "red", "green", "blue" },
                properties.getStringArray("color"));
        Assert.assertEquals("red", properties.getString("color"));
    }

    @Test
    public void commaSeparatedAndEscapedValuesAreParsedCorrectly() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("places", "north\\,east,west,south\\,west");

        Assert.assertArrayEquals(
                new String[] { "north,east", "west", "south,west" },
                properties.getStringArray("places"));
    }

    @Test
    public void setPropertyReplacesPreviouslyAddedValues() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("mode", "first");
        properties.addProperty("mode", "second");
        properties.setProperty("mode", "replacement");

        Assert.assertArrayEquals(new String[] { "replacement" },
                properties.getStringArray("mode"));
        Assert.assertEquals("replacement", properties.getString("mode"));
    }

    @Test
    public void getStringInterpolatesNestedProperties() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("host", "example.org");
        properties.setProperty("endpoint", "https://${host}/api");
        properties.setProperty("message", "Connecting to ${endpoint}");

        Assert.assertEquals("Connecting to https://example.org/api",
                properties.getString("message"));
    }

    @Test(expected = IllegalStateException.class)
    public void interpolationCycleThrowsIllegalStateException() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("first", "${second}");
        properties.setProperty("second", "${first}");

        properties.getString("first");
    }

    @Test
    public void numericGettersConvertStringValuesAndCacheTypedObjects() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("integer", "42");
        properties.setProperty("long", "12345678901");
        properties.setProperty("float", "1.25");
        properties.setProperty("double", "3.5");

        Assert.assertEquals(42, properties.getInt("integer"));
        Assert.assertEquals(12345678901L, properties.getLong("long"));
        Assert.assertEquals(1.25f, properties.getFloat("float"), 0.0f);
        Assert.assertEquals(3.5d, properties.getDouble("double"), 0.0d);
        Assert.assertTrue(properties.get("integer") instanceof Integer);
        Assert.assertTrue(properties.get("long") instanceof Long);
        Assert.assertTrue(properties.get("float") instanceof Float);
        Assert.assertTrue(properties.get("double") instanceof Double);
    }

    @Test(expected = NumberFormatException.class)
    public void invalidNumericValueThrowsNumberFormatException() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("count", "not-a-number");

        properties.getInt("count");
    }

    @Test(expected = NoSuchElementException.class)
    public void requiredNumericValueThrowsWhenMissing() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.getLong("missing");
    }

    @Test
    public void defaultsAreUsedWhenPropertyIsNotDefinedLocally() {
        ExtendedProperties defaults = new ExtendedProperties();
        defaults.setProperty("host", "default-host");
        defaults.setProperty("port", "8080");

        ExtendedProperties properties = new ExtendedProperties(defaults);
        properties.setProperty("host", "local-host");

        Assert.assertEquals("local-host", properties.getString("host"));
        Assert.assertEquals(8080, properties.getInt("port"));
        Assert.assertEquals("fallback", properties.getString("unknown", "fallback"));
    }

    @Test
    public void loadReadsCommentsDuplicateKeysAndCommaSeparatedValues() throws IOException {
        String content =
                "# a comment\n" +
                "\n" +
                "fruit = apple, banana\n" +
                "fruit = cherry\n" +
                "single=value\n";
        ExtendedProperties properties = new ExtendedProperties();

        properties.load(new ByteArrayInputStream(content.getBytes("ISO-8859-1")));

        Assert.assertArrayEquals(new String[] { "apple", "banana", "cherry" },
                properties.getStringArray("fruit"));
        Assert.assertEquals("value", properties.getString("single"));
    }

    @Test
    public void convertPropertiesIncludesStringDefaultsAndIgnoresNonStrings() {
        Properties defaults = new Properties();
        defaults.setProperty("inherited", "parent-value");
        Properties source = new Properties(defaults);
        source.setProperty("local", "child-value");
        source.put("nonString", new Integer(7));

        ExtendedProperties converted = ExtendedProperties.convertProperties(source);

        Assert.assertEquals("parent-value", converted.getString("inherited"));
        Assert.assertEquals("child-value", converted.getString("local"));
        Assert.assertNull(converted.getString("nonString"));
    }

    @Test
    public void putAppendsValuesAndRemoveClearsProperty() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("item", "one");

        Object old = properties.put("item", "two");

        Assert.assertEquals("one", old);
        Assert.assertArrayEquals(new String[] { "one", "two" },
                properties.getStringArray("item"));

        properties.setProperty("temporary", "present");
        Assert.assertEquals("present", properties.remove("temporary"));
        Assert.assertNull(properties.getString("temporary"));
    }
}
