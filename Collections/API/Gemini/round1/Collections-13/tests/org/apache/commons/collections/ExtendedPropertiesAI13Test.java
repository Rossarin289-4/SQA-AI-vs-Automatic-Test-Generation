package org.apache.commons.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

public class ExtendedPropertiesAI13Test {

    @Test
    public void testGetLongSuccessAndDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("validLong", "1234567890123");

        Assert.assertEquals(1234567890123L, ep.getLong("validLong"));
        Assert.assertEquals(1234567890123L, ep.getLong("validLong", 999L));
        Assert.assertEquals(Long.valueOf(1234567890123L), ep.getLong("validLong", Long.valueOf(999L)));

        Assert.assertEquals(555L, ep.getLong("missingLong", 555L));
        Assert.assertEquals(Long.valueOf(777L), ep.getLong("missingLong", Long.valueOf(777L)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongNotFoundThrowsException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getLong("nonExistentKey");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLongInvalidFormatThrowsException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("notANumber", "not_a_long");
        ep.getLong("notANumber");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongIncompatibleTypeThrowsException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("boolProperty", Boolean.TRUE);
        ep.getLong("boolProperty");
    }

    @Test
    public void testGetFloatSuccessAndDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("validFloat", "3.14");

        Assert.assertEquals(3.14f, ep.getFloat("validFloat"), 0.0001f);
        Assert.assertEquals(3.14f, ep.getFloat("validFloat", 1.0f), 0.0001f);
        Assert.assertEquals(Float.valueOf(3.14f), ep.getFloat("validFloat", Float.valueOf(1.0f)));

        Assert.assertEquals(2.71f, ep.getFloat("missingFloat", 2.71f), 0.0001f);
        Assert.assertEquals(Float.valueOf(2.71f), ep.getFloat("missingFloat", Float.valueOf(2.71f)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatNotFoundThrowsException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getFloat("missingFloat");
    }

    @Test
    public void testGetDoubleSuccessAndDefault() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("validDouble", "123.456789");

        Assert.assertEquals(123.456789d, ep.getDouble("validDouble"), 0.000001d);
        Assert.assertEquals(123.456789d, ep.getDouble("validDouble", 1.0d), 0.000001d);
        Assert.assertEquals(Double.valueOf(123.456789d), ep.getDouble("validDouble", Double.valueOf(1.0d)));

        Assert.assertEquals(9.81d, ep.getDouble("missingDouble", 9.81d), 0.000001d);
        Assert.assertEquals(Double.valueOf(9.81d), ep.getDouble("missingDouble", Double.valueOf(9.81d)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleNotFoundThrowsException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getDouble("missingDouble");
    }

    @Test
    public void testConvertPropertiesWithDefaults() {
        Properties parentProps = new Properties();
        parentProps.setProperty("parentKey", "parentVal");

        Properties childProps = new Properties(parentProps);
        childProps.setProperty("childKey", "childVal");

        ExtendedProperties ep = ExtendedProperties.convertProperties(childProps);
        Assert.assertEquals("parentVal", ep.get("parentKey"));
        Assert.assertEquals("childVal", ep.get("childKey"));
    }

    @Test
    public void testInterpolation() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("name", "World");
        ep.put("greeting", "Hello ${name}!");

        Assert.assertNull(ep.interpolate(null));
        Assert.assertEquals("Hello World!", ep.interpolate("Hello ${name}!"));
        Assert.assertEquals("Raw String", ep.interpolate("Raw String"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationInfiniteLoop() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("varA", "${varB}");
        ep.put("varB", "${varA}");

        ep.interpolate("${varA}");
    }

    @Test
    public void testPutRemoveAndPutAll() {
        ExtendedProperties ep1 = new ExtendedProperties();
        ep1.put("k1", "v1");

        Object oldVal = ep1.remove("k1");
        Assert.assertEquals("v1", oldVal);
        Assert.assertNull(ep1.get("k1"));

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("k2", "v2");
        map.put("k3", "v3");
        ep1.putAll(map);
        Assert.assertEquals("v2", ep1.get("k2"));
        Assert.assertEquals("v3", ep1.get("k3"));

        ExtendedProperties ep2 = new ExtendedProperties();
        ep2.putAll(ep1);
        Assert.assertEquals("v2", ep2.get("k2"));
        Assert.assertEquals("v3", ep2.get("k3"));
    }
}
