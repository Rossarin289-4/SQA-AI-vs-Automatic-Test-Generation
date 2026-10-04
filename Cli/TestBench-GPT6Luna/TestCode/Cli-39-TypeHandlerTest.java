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
        assertEquals("value", TypeHandler.createValue("value", PatternOptionBuilder.STRING_VALUE));
    }

    public void testCreateValueUnknownClass() throws Exception {
        assertNull(TypeHandler.createValue("value", Void.class));
    }

    public void testCreateValueNumber() throws Exception {
        assertEquals(Long.valueOf(12L), TypeHandler.createValue("12", PatternOptionBuilder.NUMBER_VALUE));
    }

    public void testCreateValueAsObject() throws Exception {
        assertEquals("", TypeHandler.createValue("", (Object) PatternOptionBuilder.STRING_VALUE));
    }

    public void testCreateObjectWithPublicConstructor() throws Exception {
        assertEquals("", TypeHandler.createObject(String.class.getName()));
    }

    public void testCreateObjectMissingClass() throws Exception {
        try {
            TypeHandler.createObject("missing.Type");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to find the class: missing.Type", expected.getMessage());
        }
    }

    public void testCreateNumberInteger() throws Exception {
        assertEquals(Long.valueOf(0L), TypeHandler.createNumber("0"));
    }

    public void testCreateNumberDecimal() throws Exception {
        assertEquals(Double.valueOf(1.25), TypeHandler.createNumber("1.25"));
    }

    public void testCreateNumberLargestLong() throws Exception {
        assertEquals(Long.valueOf(Long.MAX_VALUE), TypeHandler.createNumber("9223372036854775807"));
    }

    public void testCreateNumberBeyondLong() throws Exception {
        try {
            TypeHandler.createNumber("9223372036854775808");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertNotNull(expected);
        }
    }

    public void testCreateNumberInvalid() throws Exception {
        try {
            TypeHandler.createNumber("not-number");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertNotNull(expected);
        }
    }

    public void testCreateClassExisting() throws Exception {
        assertEquals(String.class, TypeHandler.createClass("java.lang.String"));
    }

    public void testCreateClassMissing() throws Exception {
        try {
            TypeHandler.createClass("missing.Type");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to find the class: missing.Type", expected.getMessage());
        }
    }

    public void testCreateDateAlwaysUnsupported() throws Exception {
        try {
            TypeHandler.createDate("2020-01-01");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertNotNull(expected);
        }
    }

    public void testCreateURLValid() throws Exception {
        assertEquals(new URL("http://example.com"), TypeHandler.createURL("http://example.com"));
    }

    public void testCreateURLMalformed() throws Exception {
        try {
            TypeHandler.createURL("not a URL");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to parse the URL: not a URL", expected.getMessage());
        }
    }

    public void testCreateFile() throws Exception {
        assertEquals(new File("sample.txt"), TypeHandler.createFile("sample.txt"));
    }

    public void testOpenFileMissing() throws Exception {
        try {
            TypeHandler.openFile("missing-file");
            fail("expected ParseException");
        } catch (ParseException expected) {
            assertEquals("Unable to find file: missing-file", expected.getMessage());
        }
    }

    public void testCreateFilesAlwaysUnsupported() throws Exception {
        try {
            TypeHandler.createFiles("sample.txt");
            fail("expected UnsupportedOperationException");
        } catch (UnsupportedOperationException expected) {
            assertNotNull(expected);
        }
    }
}
