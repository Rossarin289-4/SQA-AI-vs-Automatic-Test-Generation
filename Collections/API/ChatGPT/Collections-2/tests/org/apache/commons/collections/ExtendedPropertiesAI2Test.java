package org.apache.commons.collections;

import java.io.ByteArrayInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI2Test {

    @Test
    public void setAndGetStringInterpolatesNestedProperties() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("name", "Ada");
        properties.setProperty("greeting", "Hello ${name}");
        properties.setProperty("message", "${greeting}!");

        Assert.assertEquals("Hello Ada!", properties.getString("message"));
    }

    @Test(expected = IllegalStateException.class)
    public void interpolationDetectsCircularReferences() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("first", "${second}");
        properties.setProperty("second", "${first}");

        properties.getString("first");
    }

    @Test
    public void repeatedPropertiesAreAvailableAsOrderedStringArray() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.addProperty("color", "red");
        properties.addProperty("color", "green");
        properties.addProperty("color", "blue");

        String[] colors = properties.getStringArray("color");

        Assert.assertEquals(3, colors.length);
        Assert.assertEquals("red", colors[0]);
        Assert.assertEquals("green", colors[1]);
        Assert.assertEquals("blue", colors[2]);
        Assert.assertEquals("red", properties.getString("color"));
    }

    @Test
    public void commaSeparatedValueIsSplitIntoIndividualValues() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("servers", "one,two,three");

        String[] servers = properties.getStringArray("servers");

        Assert.assertEquals(3, servers.length);
        Assert.assertEquals("one", servers[0]);
        Assert.assertEquals("two", servers[1]);
        Assert.assertEquals("three", servers[2]);
    }

    @Test
    public void loadReadsCommentsAndRepeatedKeys() throws Exception {
        String text =
                "# ignored comment\n" +
                "\n" +
                "host = localhost\n" +
                "port = 8080\n" +
                "port = 9090\n";
        ExtendedProperties properties = new ExtendedProperties();

        properties.load(new ByteArrayInputStream(text.getBytes("ISO-8859-1")));

        Assert.assertEquals("localhost", properties.getString("host"));
        String[] ports = properties.getStringArray("port");
        Assert.assertEquals(2, ports.length);
        Assert.assertEquals("8080", ports[0]);
        Assert.assertEquals("9090", ports[1]);
    }

    @Test
    public void integerConversionCachesConvertedValueAndUsesDefault() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("count", "17");

        Assert.assertEquals(17, properties.getInteger("count"));
        Assert.assertTrue(properties.get("count") instanceof Integer);
        Assert.assertEquals(9, properties.getInteger("missing", 9));
    }

    @Test
    public void numericAndBooleanAccessorsReadStringValues() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.setProperty("enabled", "true");
        properties.setProperty("ratio", "2.5");
        properties.setProperty("limit", "123456789");

        Assert.assertTrue(properties.getBoolean("enabled"));
        Assert.assertEquals(2.5d, properties.getDouble("ratio"), 0.0d);
        Assert.assertEquals(123456789L, properties.getLong("limit"));
        Assert.assertTrue(properties.get("enabled") instanceof Boolean);
        Assert.assertTrue(properties.get("ratio") instanceof Double);
        Assert.assertTrue(properties.get("limit") instanceof Long);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void requiredIntegerForMissingKeyThrowsException() {
        ExtendedProperties properties = new ExtendedProperties();

        properties.getInteger("absent");
    }

    @Test
    public void clearPropertyRemovesAllValuesForAKey() {
        ExtendedProperties properties = new ExtendedProperties();
        properties.addProperty("feature", "one");
        properties.addProperty("feature", "two");

        properties.clearProperty("feature");

        Assert.assertNull(properties.getString("feature"));
        Assert.assertEquals(0, properties.getStringArray("feature").length);
        Assert.assertFalse(properties.containsKey("feature"));
    }

    @Test
    public void convertPropertiesIncludesParentDefaultsAndLocalProperties() {
        Properties parent = new Properties();
        parent.setProperty("inherited", "parentValue");
        Properties source = new Properties(parent);
        source.setProperty("local", "localValue");

        ExtendedProperties converted = ExtendedProperties.convertProperties(source);

        Assert.assertEquals("parentValue", converted.getString("inherited"));
        Assert.assertEquals("localValue", converted.getString("local"));
    }
}
