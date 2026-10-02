package org.apache.commons.collections;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI2Test {

    @Test
    public void testBasicStringProperties() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("app.title", "Test Application");

        Assert.assertEquals("Test Application", ep.getString("app.title"));
        Assert.assertEquals("defaultValue", ep.getString("missing.key", "defaultValue"));
        Assert.assertNull(ep.getString("missing.key"));
    }

    @Test
    public void testNumericProperties() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("int.val", "42");
        ep.setProperty("long.val", "10000000000");
        ep.setProperty("float.val", "3.14");
        ep.setProperty("double.val", "2.71828");

        Assert.assertEquals(42, ep.getInteger("int.val", 0));
        Assert.assertEquals(10000000000L, ep.getLong("long.val"));
        Assert.assertEquals(10000000000L, ep.getLong("long.val", 0L));
        Assert.assertEquals(3.14f, ep.getFloat("float.val"), 0.001f);
        Assert.assertEquals(3.14f, ep.getFloat("float.val", 1.0f), 0.001f);
        Assert.assertEquals(2.71828, ep.getDouble("double.val"), 0.00001);
        Assert.assertEquals(2.71828, ep.getDouble("double.val", 1.0), 0.00001);

        Assert.assertEquals(99, ep.getInteger("missing.int", 99));
        Assert.assertEquals(999L, ep.getLong("missing.long", 999L));
        Assert.assertEquals(0.5f, ep.getFloat("missing.float", 0.5f), 0.001f);
        Assert.assertEquals(0.25, ep.getDouble("missing.double", 0.25), 0.001);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingThrowsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getLong("nonexistent.key");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingThrowsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getDouble("nonexistent.key");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingThrowsNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getFloat("nonexistent.key");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetIntegerWithInvalidFormatThrowsNumberFormatException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("invalid.int", "notANumber");
        ep.getInteger("invalid.int", 0);
    }

    @Test(expected = ClassCastException.class)
    public void testGetIntegerWithIncompatibleObjectThrowsClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("list.object", new ArrayList());
        ep.getInteger("list.object", null);
    }

    @Test
    public void testConvertPropertiesInheritsDefaults() {
        Properties defaults = new Properties();
        defaults.setProperty("default.key", "defaultValue");

        Properties props = new Properties(defaults);
        props.setProperty("child.key", "childValue");

        ExtendedProperties ep = ExtendedProperties.convertProperties(props);
        Assert.assertEquals("childValue", ep.getString("child.key"));
        Assert.assertEquals("defaultValue", ep.getString("default.key"));
    }

    @Test
    public void testAddPropertyCreatesList() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.addProperty("colors", "red");
        ep.addProperty("colors", "green");
        ep.addProperty("colors", "blue");

        Vector values = ep.getVector("colors");
        Assert.assertNotNull(values);
        Assert.assertEquals(3, values.size());
        Assert.assertEquals("red", values.get(0));
        Assert.assertEquals("green", values.get(1));
        Assert.assertEquals("blue", values.get(2));
    }

    @Test
    public void testInterpolation() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("protocol", "http");
        ep.setProperty("domain", "example.com");
        ep.setProperty("port", "80");

        String interpolated = ep.interpolate("${protocol}://${domain}:${port}/index.html");
        Assert.assertEquals("http://example.com:80/index.html", interpolated);
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationInfiniteLoopThrowsException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("varA", "${varB}");
        ep.setProperty("varB", "${varA}");
        ep.interpolate("${varA}");
    }

    @Test
    public void testLoadFromInputStream() throws IOException {
        String content = "# Configuration file\n"
                + "host = localhost\n"
                + "port = 8080\n"
                + "services = auth, api, billing\n";
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes("ISO-8859-1"));

        ExtendedProperties ep = new ExtendedProperties();
        ep.load(in);

        Assert.assertEquals("localhost", ep.getString("host"));
        Assert.assertEquals(8080, ep.getInteger("port", 0));

        Vector services = ep.getVector("services");
        Assert.assertNotNull(services);
        Assert.assertEquals(3, services.size());
        Assert.assertEquals("auth", services.get(0));
        Assert.assertEquals("api", services.get(1));
        Assert.assertEquals("billing", services.get(2));
    }

    @Test
    public void testSubset() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("db.host", "localhost");
        ep.setProperty("db.port", "5432");
        ep.setProperty("app.name", "myApp");

        ExtendedProperties subset = ep.subset("db");
        Assert.assertNotNull(subset);
        Assert.assertEquals("localhost", subset.getString("host"));
        Assert.assertEquals("5432", subset.getString("port"));
        Assert.assertNull(subset.getString("name"));

        ExtendedProperties emptySubset = ep.subset("nonexistent");
        Assert.assertNull(emptySubset);
    }

    @Test
    public void testCombine() {
        ExtendedProperties ep1 = new ExtendedProperties();
        ep1.setProperty("shared.key", "originalValue");
        ep1.setProperty("unique.first", "firstVal");

        ExtendedProperties ep2 = new ExtendedProperties();
        ep2.setProperty("shared.key", "newValue");
        ep2.setProperty("unique.second", "secondVal");

        ep1.combine(ep2);

        Assert.assertEquals("newValue", ep1.getString("shared.key"));
        Assert.assertEquals("firstVal", ep1.getString("unique.first"));
        Assert.assertEquals("secondVal", ep1.getString("unique.second"));
    }
}
