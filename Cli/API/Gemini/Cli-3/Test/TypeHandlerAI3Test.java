package org.apache.commons.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.net.URL;

import org.junit.Test;

public class TypeHandlerAI3Test {

    @Test
    public void testCreateNumber() {
        Number longNum = TypeHandler.createNumber("123");
        assertNotNull(longNum);
        assertEquals(Long.class, longNum.getClass());
        assertEquals(123L, longNum.longValue());

        Number doubleNum = TypeHandler.createNumber("123.45");
        assertNotNull(doubleNum);
        assertEquals(Double.class, doubleNum.getClass());
        assertEquals(123.45, doubleNum.doubleValue(), 0.001);

        assertNull(TypeHandler.createNumber("invalid"));
    }

    @Test
    public void testCreateURL() {
        URL url = TypeHandler.createURL("http://localhost/");
        assertNotNull(url);
        assertEquals("http", url.getProtocol());

        assertNull(TypeHandler.createURL("invalid-url"));
    }

    @Test
    public void testCreateValueAndFile() {
        Object strVal = TypeHandler.createValue("test", PatternOptionBuilder.STRING_VALUE);
        assertEquals("test", strVal);

        Object fileVal = TypeHandler.createValue("some/path", PatternOptionBuilder.FILE_VALUE);
        assertNotNull(fileVal);
        assertEquals(File.class, fileVal.getClass());
        assertEquals(new File("some/path"), fileVal);

        assertNull(TypeHandler.createValue("test", Object.class));
    }
}
