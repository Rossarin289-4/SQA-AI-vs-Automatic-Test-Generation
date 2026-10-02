package org.apache.commons.collections;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class ExtendedPropertiesAI9Test {

    @Test
    public void testConvertPropertiesWithDefaults() {
        Properties defaultProps = new Properties();
        defaultProps.setProperty("defaultKey", "defaultValue");
        defaultProps.setProperty("sharedKey", "defaultShared");

        Properties props = new Properties(defaultProps);
        props.setProperty("customKey", "customValue");
        props.setProperty("sharedKey", "overriddenShared");

        ExtendedProperties ep = ExtendedProperties.convertProperties(props);

        assertEquals("defaultValue", ep.getProperty("defaultKey"));
        assertEquals("customValue", ep.getProperty("customKey"));
        assertEquals("overriddenShared", ep.getProperty("sharedKey"));
    }

    @Test
    public void testGetLong() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("longVal", "1234567890123");

        assertEquals(1234567890123L, ep.getLong("longVal"));
        assertEquals(1234567890123L, ep.getLong("longVal", 999L));
        assertEquals(999L, ep.getLong("missingKey", 999L));
        assertEquals(Long.valueOf(999L), ep.getLong("missingKey", Long.valueOf(999L)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getLong("nonExistingLong");
    }

    @Test(expected = ClassCastException.class)
    public void testGetLongClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("dateKey", new java.util.Date());
        ep.getLong("dateKey");
    }

    @Test
    public void testGetFloat() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("floatVal", "3.14");

        assertEquals(3.14f, ep.getFloat("floatVal"), 0.0001f);
        assertEquals(3.14f, ep.getFloat("floatVal", 1.0f), 0.0001f);
        assertEquals(1.23f, ep.getFloat("missingKey", 1.23f), 0.0001f);
        assertEquals(Float.valueOf(1.23f), ep.getFloat("missingKey", Float.valueOf(1.23f)));
    }

    @Test(expected = ClassCastException.class)
    public void testGetFloatClassCastException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.put("boolKey", Boolean.TRUE);
        ep.getFloat("boolKey");
    }

    @Test
    public void testGetDouble() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("doubleVal", "2.718281828459");

        assertEquals(2.718281828459, ep.getDouble("doubleVal"), 0.000000001);
        assertEquals(2.718281828459, ep.getDouble("doubleVal", 1.0), 0.000000001);
        assertEquals(4.56, ep.getDouble("missingKey", 4.56), 0.00001);
        assertEquals(Double.valueOf(4.56), ep.getDouble("missingKey", Double.valueOf(4.56)));
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleNoSuchElementException() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.getDouble("nonExistingDouble");
    }

    @Test
    public void testInterpolate() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("host", "localhost");
        ep.setProperty("port", "8080");
        ep.setProperty("url", "http://${host}:${port}/api");

        assertNull(ep.interpolate(null));
        assertEquals("http://localhost:8080/api", ep.interpolate("${url}"));
        assertEquals("plainText", ep.interpolate("plainText"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolateLoop() {
        ExtendedProperties ep = new ExtendedProperties();
        ep.setProperty("keyA", "${keyB}");
        ep.setProperty("keyB", "${keyA}");
        ep.interpolate("${keyA}");
    }

    @Test
    public void testPutAndRemove() {
        ExtendedProperties ep = new ExtendedProperties();

        Object previous = ep.put("multi", "val1");
        assertNull(previous);
        assertEquals("val1", ep.getProperty("multi"));

        previous = ep.put("multi", "val2");
        assertEquals("val1", previous);

        Object propVal = ep.getProperty("multi");
        assertTrue(propVal instanceof Vector);
        Vector v = (Vector) propVal;
        assertEquals(2, v.size());
        assertEquals("val1", v.get(0));
        assertEquals("val2", v.get(1));

        Object removed = ep.remove("multi");
        assertNotNull(removed);
        assertNull(ep.getProperty("multi"));
    }

    @Test
    public void testPutAllFromMapAndExtendedProperties() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("k1", "v1");
        map.put("k2", "v2");

        ExtendedProperties ep = new ExtendedProperties();
        ep.putAll(map);
        assertEquals("v1", ep.getProperty("k1"));
        assertEquals("v2", ep.getProperty("k2"));

        ExtendedProperties ep2 = new ExtendedProperties();
        ep2.setProperty("k3", "v3");
        ep2.putAll(ep);
        assertEquals("v1", ep2.getProperty("k1"));
        assertEquals("v2", ep2.getProperty("k2"));
        assertEquals("v3", ep2.getProperty("k3"));
    }
}
