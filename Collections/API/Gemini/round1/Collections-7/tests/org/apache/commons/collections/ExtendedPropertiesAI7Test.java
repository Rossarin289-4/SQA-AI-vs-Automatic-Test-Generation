package org.apache.commons.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;
import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI7Test {

    @Test
    public void testConvertPropertiesWithDefaults() {
        Properties parentProps = new Properties();
        parentProps.setProperty("parentKey", "parentValue");
        parentProps.setProperty("overrideKey", "originalValue");

        Properties childProps = new Properties(parentProps);
        childProps.setProperty("childKey", "childValue");
        childProps.setProperty("overrideKey", "newValue");

        ExtendedProperties ep = ExtendedProperties.convertProperties(childProps);

        Assert.assertEquals("childValue", ep.getProperty("childKey"));
        Assert.assertEquals("parentValue", ep.getProperty("parentKey"));
        Assert.assertEquals("newValue", ep.getProperty("overrideKey"));
    }

    @Test
    public void testGetLong() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("validLong", "1234567890123");

        Assert.assertEquals(1234567890123L, ep.getLong("validLong"));
        Assert.assertEquals(1234567890123L, ep.getLong("validLong", 99L));
        Assert.assertEquals(new Long(1234567890123L), ep.getLong("validLong", new Long(99L)));

        Assert.assertEquals(555L, ep.getLong("missingKey", 555L));
        Assert.assertEquals(new Long(555L), ep.getLong("missingKey", new Long(555L)));
        Assert.assertNull(ep.getLong("missingKey", (Long) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongMissingKeyThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getLong("nonexistent");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("list", "val1");
        ep.put("list", "val2"); // Multiple values create a Vector
        ep.getLong("list");
    }

    @Test
    public void testGetDouble() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("validDouble", "123.456");

        Assert.assertEquals(123.456, ep.getDouble("validDouble"), 0.0001);
        Assert.assertEquals(123.456, ep.getDouble("validDouble", 1.0), 0.0001);
        Assert.assertEquals(new Double(123.456), ep.getDouble("validDouble", new Double(1.0)));

        Assert.assertEquals(9.87, ep.getDouble("missingKey", 9.87), 0.0001);
        Assert.assertEquals(new Double(9.87), ep.getDouble("missingKey", new Double(9.87)));
        Assert.assertNull(ep.getDouble("missingKey", (Double) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleMissingKeyThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getDouble("nonexistent");
    }

    @Test
    public void testGetFloat() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("validFloat", "12.34");

        Assert.assertEquals(12.34f, ep.getFloat("validFloat"), 0.001f);
        Assert.assertEquals(12.34f, ep.getFloat("validFloat", 1.0f), 0.001f);
        Assert.assertEquals(new Float(12.34f), ep.getFloat("validFloat", new Float(1.0f)));

        Assert.assertEquals(5.67f, ep.getFloat("missingKey", 5.67f), 0.001f);
        Assert.assertEquals(new Float(5.67f), ep.getFloat("missingKey", new Float(5.67f)));
        Assert.assertNull(ep.getFloat("missingKey", (Float) null));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatMissingKeyThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getFloat("nonexistent");
    }

    @Test
    public void testInterpolate() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("baseDir", "/var/app");
        ep.put("logDir", "${baseDir}/logs");

        String interpolated = ep.interpolate("${logDir}/app.log");
        Assert.assertEquals("/var/app/logs/app.log", interpolated);
        Assert.assertNull(ep.interpolate(null));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateCircularLoopThrows() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("varA", "${varB}");
        ep.put("varB", "${varA}");

        ep.interpolate("${varA}");
    }

    @Test
    public void testPutAndRemove() {
        ExtendedProperties ep = new ExtendedProperties();

        Object previous = ep.put("key", "first");
        Assert.assertNull(previous);
        Assert.assertEquals("first", ep.getProperty("key"));

        previous = ep.put("key", "second");
        Assert.assertEquals("first", previous);
        Object current = ep.getProperty("key");
        Assert.assertTrue(current instanceof Vector);

        Object removed = ep.remove("key");
        Assert.assertEquals(current, removed);
        Assert.assertNull(ep.getProperty("key"));
    }

    @Test
    public void testPutAll() {
        ExtendedProperties sourceEP = new ExtendedProperties();
        sourceEP.put("epKey1", "epVal1");
        sourceEP.put("epKey2", "epVal2");

        ExtendedProperties targetEP = new ExtendedProperties();
        targetEP.putAll(sourceEP);
        Assert.assertEquals("epVal1", targetEP.getProperty("epKey1"));
        Assert.assertEquals("epVal2", targetEP.getProperty("epKey2"));

        Map map = new HashMap();
        map.put("mapKey", "mapVal");
        targetEP.putAll(map);
        Assert.assertEquals("mapVal", targetEP.getProperty("mapKey"));
    }
}
