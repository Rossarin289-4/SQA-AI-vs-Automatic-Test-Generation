package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class TypeHandlerTest extends TestCase {
    public void testCreateValueString() throws Exception {
        assertEquals("text", TypeHandler.createValue("text", PatternOptionBuilder.STRING_VALUE));
    }

    public void testCreateValueNumber() throws Exception {
        assertEquals(Long.valueOf(12L), TypeHandler.createValue("12", PatternOptionBuilder.NUMBER_VALUE));
    }

    public void testCreateValueFile() throws Exception {
        assertEquals(new File("a"), TypeHandler.createValue("a", PatternOptionBuilder.FILE_VALUE));
    }

    public void testCreateValueUnknownClass() throws Exception {
        try {
            TypeHandler.createValue("x", Integer.class);
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to handle the class: class java.lang.Integer", expected.getMessage());
        }
    }

    public void testCreateObjectStringClass() throws Exception {
        assertEquals("", TypeHandler.createObject("java.lang.String"));
    }

    public void testCreateObjectMissingClass() throws Exception {
        try {
            TypeHandler.createObject("no.such.Type");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to find the class: no.such.Type", expected.getMessage());
        }
    }

    public void testCreateNumberIntegerSyntax() throws Exception {
        assertEquals(Long.valueOf(42L), TypeHandler.createNumber("42"));
    }

    public void testCreateNumberDecimalSyntax() throws Exception {
        assertEquals(Double.valueOf(1.5), TypeHandler.createNumber("1.5"));
    }

    public void testCreateNumberLongMaximum() throws Exception {
        assertEquals(Long.valueOf(Long.MAX_VALUE), TypeHandler.createNumber("9223372036854775807"));
    }

    public void testCreateNumberBeyondLongMaximum() throws Exception {
        try {
            TypeHandler.createNumber("9223372036854775808");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertNotNull(expected);
        }
    }

    public void testCreateNumberInvalidText() throws Exception {
        try {
            TypeHandler.createNumber("x");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertNotNull(expected);
        }
    }

    public void testCreateClassString() throws Exception {
        assertEquals(String.class, TypeHandler.createClass("java.lang.String"));
    }

    public void testCreateClassMissing() throws Exception {
        try {
            TypeHandler.createClass("no.such.Type");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to find the class: no.such.Type", expected.getMessage());
        }
    }

    public void testCreateDateThrows() throws Exception {
        try {
            TypeHandler.createDate("2020");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertNotNull(expected);
        }
    }

    public void testCreateURLValid() throws Exception {
        assertEquals(new URL("http://example.com"), TypeHandler.createURL("http://example.com"));
    }

    public void testCreateURLInvalid() throws Exception {
        try {
            TypeHandler.createURL("not-a-url");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to parse the URL: not-a-url", expected.getMessage());
        }
    }

    public void testCreateFile() throws Exception {
        assertEquals(new File("a/b"), TypeHandler.createFile("a/b"));
    }

    public void testCreateFileEmptyPath() throws Exception {
        assertEquals(new File(""), TypeHandler.createFile(""));
    }

    public void testOpenFileMissing() throws Exception {
        try {
            TypeHandler.openFile("missing-typehandler-test-file");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to find file: missing-typehandler-test-file", expected.getMessage());
        }
    }

    public void testCreateFilesThrows() throws Exception {
        try {
            TypeHandler.createFiles("a");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertNotNull(expected);
        }
    }
}
