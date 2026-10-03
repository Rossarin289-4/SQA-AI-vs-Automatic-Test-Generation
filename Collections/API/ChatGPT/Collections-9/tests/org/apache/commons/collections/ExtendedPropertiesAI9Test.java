package org.apache.commons.collections;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI9Test {

    @Test
    public void setPropertyAndGetStringReturnsStoredValue() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.setProperty("name", "commons");

        Assert.assertEquals("commons", properties.getString("name"));
        Assert.assertEquals("commons", properties.getProperty("name"));
    }

    @Test
    public void repeatedAndCommaSeparatedPropertiesProduceOrderedArray() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("colors", "red,green");
        properties.addProperty("colors", "blue");

        Assert.assertArrayEquals(
                new String[] { "red", "green", "blue" },
                properties.getStringArray("colors"));
        Assert.assertEquals("red", properties.getString("colors"));
    }

    @Test
    public void setPropertyReplacesExistingMultipleValues() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.addProperty("item", "first");
        properties.addProperty("item", "second");
        properties.setProperty("item", "replacement");

        Assert.assertArrayEquals(
                new String[] { "replacement" },
                properties.getStringArray("item"));
    }

    @Test
    public void putAppendsValuesAndReturnsPreviousProperty() {
        ExtendedProperties properties = new ExtendedProperties();

        Assert.assertNull(properties.put("key", "first"));
        Object previous = properties.put("key", "second");

        Assert.assertEquals("first", previous);
        Assert.assertArrayEquals(
                new String[] { "first", "second" },
                properties.getStringArray("key"));
    }

    @Test
    public void removeReturnsValueAndClearsProperty() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("temporary", "value");

        Object removed = properties.remove("temporary");

        Assert.assertEquals("value", removed);
        Assert.assertFalse(properties.containsKey("temporary"));
        Assert.assertEquals("fallback", properties.getString("temporary", "fallback"));
    }

    @Test
    public void nestedInterpolationResolvesReferencedProperties() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("host", "example.org");
        properties.setProperty("port", "8080");
        properties.setProperty("url", "http://${host}:${port}/service");

        Assert.assertEquals("http://example.org:8080/service", properties.getString("url"));
    }

    @Test(expected = IllegalStateException.class)
    public void circularInterpolationThrowsIllegalStateException() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("first", "${second}");
        properties.setProperty("second", "${first}");

        properties.getString("first");
    }

    @Test
    public void numericGettersConvertStringsAndUseProvidedDefaults() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("count", "42");
        properties.setProperty("ratio", "2.5");

        Assert.assertEquals(42, properties.getInteger("count").intValue());
        Assert.assertTrue(properties.get("count") instanceof Integer);
        Assert.assertEquals(2.5d, properties.getDouble("ratio").doubleValue(), 0.0d);
        Assert.assertEquals(17L, properties.getLong("missing", 17L));
        Assert.assertEquals(1.25f, properties.getFloat("missingFloat", 1.25f), 0.0f);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void requiredLongForMissingPropertyThrowsNoSuchElementException() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.getLong("missing");
    }

    @Test
    public void convertPropertiesCopiesOwnAndDefaultProperties() {
        Properties defaults = new Properties();
        defaults.setProperty("fromDefault", "defaultValue");
        Properties source = new Properties(defaults);
        source.setProperty("direct", "directValue");

        ExtendedProperties converted = ExtendedProperties.convertProperties(source);

        Assert.assertEquals("directValue", converted.getString("direct"));
        Assert.assertEquals("defaultValue", converted.getString("fromDefault"));
    }
}
