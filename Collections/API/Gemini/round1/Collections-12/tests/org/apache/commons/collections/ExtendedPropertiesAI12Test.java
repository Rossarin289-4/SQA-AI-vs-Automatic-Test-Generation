package org.apache.commons.collections;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Vector;

public class ExtendedPropertiesAI12Test {

    @Test
    public void testPutAndGetTypedValues() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("longVal", "1234567890123");
        props.put("floatVal", "12.34");
        props.put("doubleVal", "56.78");

        Assert.assertEquals(1234567890123L, props.getLong("longVal"));
        Assert.assertEquals(12.34f, props.getFloat("floatVal"), 0.0001f);
        Assert.assertEquals(56.78d, props.getDouble("doubleVal"), 0.0001d);

        // Test with defaults when key does not exist
        Assert.assertEquals(999L, props.getLong("nonexistentLong", 999L));
        Assert.assertEquals(1.5f, props.getFloat("nonexistentFloat", 1.5f), 0.0001f);
        Assert.assertEquals(2.5d, props.getDouble("nonexistentDouble", 2.5d), 0.0001d);
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetLongThrowsExceptionOnMissingKey() {
        ExtendedProperties props = new ExtendedProperties();
        props.getLong("missingKey");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetFloatThrowsExceptionOnMissingKey() {
        ExtendedProperties props = new ExtendedProperties();
        props.getFloat("missingKey");
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetDoubleThrowsExceptionOnMissingKey() {
        ExtendedProperties props = new ExtendedProperties();
        props.getDouble("missingKey");
    }

    @Test(expected = NumberFormatException.class)
    public void testGetLongThrowsExceptionOnInvalidNumber() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("invalidNum", "not_a_number");
        props.getLong("invalidNum");
    }

    @Test
    public void testLoadAndSaveRoundTrip() throws IOException {
        String inputData = "# Comment line\n"
                + "app.name = TestApp\n"
                + "app.version = 1.0.0\n"
                + "app.items = item1, item2, item3\n";

        ExtendedProperties props = new ExtendedProperties();
        props.load(new ByteArrayInputStream(inputData.getBytes("ISO-8859-1")));

        Assert.assertEquals("TestApp", props.getString("app.name"));
        Assert.assertEquals("1.0.0", props.getString("app.version"));

        Vector items = props.getVector("app.items");
        Assert.assertEquals(3, items.size());
        Assert.assertEquals("item1", items.get(0));
        Assert.assertEquals("item2", items.get(1));
        Assert.assertEquals("item3", items.get(2));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        props.save(baos, "Header Comment");

        String savedContent = new String(baos.toByteArray(), "ISO-8859-1");
        Assert.assertTrue(savedContent.contains("app.name = TestApp"));
        Assert.assertTrue(savedContent.contains("app.version = 1.0.0"));
    }

    @Test
    public void testInterpolation() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("base.dir", "/home/app");
        props.addProperty("log.dir", "${base.dir}/logs");
        props.addProperty("app.log", "${log.dir}/app.log");

        Assert.assertEquals("/home/app/logs", props.getString("log.dir"));
        Assert.assertEquals("/home/app/logs/app.log", props.getString("app.log"));
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpolationLoopThrowsException() {
        ExtendedProperties props = new ExtendedProperties();
        props.addProperty("key1", "${key2}");
        props.addProperty("key2", "${key1}");
        props.getString("key1");
    }

    @Test
    public void testConvertPropertiesWithDefaults() {
        Properties parentProps = new Properties();
        parentProps.setProperty("parentKey", "parentValue");
        parentProps.setProperty("sharedKey", "parentShared");

        Properties childProps = new Properties(parentProps);
        childProps.setProperty("childKey", "childValue");
        childProps.setProperty("sharedKey", "childShared");

        ExtendedProperties extProps = ExtendedProperties.convertProperties(childProps);

        Assert.assertEquals("childValue", extProps.getString("childKey"));
        Assert.assertEquals("childShared", extProps.getString("sharedKey"));
        Assert.assertEquals("parentValue", extProps.getString("parentKey"));
    }

    @Test
    public void testPutAllMaintainsOrderAndHandlesMap() {
        Map map = new HashMap();
        map.put("k1", "v1");
        map.put("k2", "v2");

        ExtendedProperties props1 = new ExtendedProperties();
        props1.putAll(map);
        Assert.assertEquals("v1", props1.getString("k1"));
        Assert.assertEquals("v2", props1.getString("k2"));

        ExtendedProperties props2 = new ExtendedProperties();
        props2.addProperty("first", "1");
        props2.addProperty("second", "2");

        ExtendedProperties props3 = new ExtendedProperties();
        props3.putAll(props2);

        Iterator it = props3.getKeys();
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("first", it.next());
        Assert.assertTrue(it.hasNext());
        Assert.assertEquals("second", it.next());
    }

    @Test
    public void testRemoveClearsPropertyAndReturnsOldValue() {
        ExtendedProperties props = new ExtendedProperties();
        props.put("toRemove", "initialValue");

        Assert.assertEquals("initialValue", props.getString("toRemove"));
        Object removed = props.remove("toRemove");

        Assert.assertEquals("initialValue", removed);
        Assert.assertNull(props.getProperty("toRemove"));
        Assert.assertFalse(props.containsKey("toRemove"));
    }
}
