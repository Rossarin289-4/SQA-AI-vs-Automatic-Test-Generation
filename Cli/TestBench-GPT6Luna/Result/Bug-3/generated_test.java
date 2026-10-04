package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class TypeHandlerTest extends TestCase {
    public void testCreateValueString() throws Exception {
        assertEquals("hello", TypeHandler.createValue("hello", PatternOptionBuilder.STRING_VALUE));
    }

    public void testCreateValueFile() throws Exception {
        assertEquals(new File("sample"), TypeHandler.createValue("sample", PatternOptionBuilder.FILE_VALUE));
    }

    public void testCreateValueUnknownClass() throws Exception {
        assertEquals("sample", TypeHandler.createValue("sample", String.class));
    }

    public void testCreateValueObjectClass() throws Exception {
        assertEquals(String.class, TypeHandler.createValue("java.lang.String", PatternOptionBuilder.CLASS_VALUE));
    }

    public void testCreateObjectUnconstructableClass() throws Exception {
        assertNull(TypeHandler.createObject("no.such.Type"));
    }

    public void testCreateNumberInteger() throws Exception {
        assertEquals(Long.valueOf(42L), TypeHandler.createNumber("42"));
    }

    public void testCreateNumberDecimal() throws Exception {
        assertEquals(Double.valueOf(1.5), TypeHandler.createNumber("1.5"));
    }

    public void testCreateNumberLongMaximum() throws Exception {
        assertEquals(Long.valueOf("9223372036854775807"), TypeHandler.createNumber("9223372036854775807"));
    }

    public void testCreateNumberBeyondLongMaximum() throws Exception {
        assertNull(TypeHandler.createNumber("9223372036854775808"));
    }

    public void testCreateNumberLongMinimum() throws Exception {
        assertEquals(Long.valueOf("-9223372036854775808"), TypeHandler.createNumber("-9223372036854775808"));
    }

    public void testCreateNumberBeyondLongMinimum() throws Exception {
        assertNull(TypeHandler.createNumber("-9223372036854775809"));
    }

    public void testCreateNumberNull() throws Exception {
        assertNull(TypeHandler.createNumber(null));
    }

    public void testCreateNumberInvalid() throws Exception {
        assertNull(TypeHandler.createNumber("abc"));
    }

    public void testCreateClassFound() throws Exception {
        assertEquals(String.class, TypeHandler.createClass("java.lang.String"));
    }

    public void testCreateClassMissing() throws Exception {
        assertNull(TypeHandler.createClass("no.such.Type"));
    }

    public void testCreateDateReturnsNull() throws Exception {
        assertNull(TypeHandler.createDate("2020-01-01"));
    }

    public void testCreateURLValid() throws Exception {
        assertEquals(new URL("http://example.com"), TypeHandler.createURL("http://example.com"));
    }

    public void testCreateURLInvalid() throws Exception {
        assertNull(TypeHandler.createURL("not a url"));
    }

    public void testCreateFilePath() throws Exception {
        assertEquals(new File("folder/file"), TypeHandler.createFile("folder/file"));
    }

    public void testCreateFileEmptyPath() throws Exception {
        assertEquals(new File(""), TypeHandler.createFile(""));
    }

    public void testCreateFilesReturnsNull() throws Exception {
        assertNull(TypeHandler.createFiles("one,two"));
    }
}
