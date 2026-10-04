package org.apache.commons.cli;

import junit.framework.TestCase;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class TypeHandlerTest extends TestCase {

    // Test createValue for String
    public void testCreateValueForString() throws Exception {
        assertEquals("testString", TypeHandler.createValue("testString", String.class));
    }

    // Test createValue for Object with a valid class name
    public void testCreateValueForObjectValid() throws Exception {
        Object obj = TypeHandler.createValue("java.lang.Object", Object.class);
        assertNotNull(obj);
        assertTrue(obj instanceof Object);
    }

    // Test createValue for Object with an invalid class name
    public void testCreateValueForObjectInvalid() throws Exception {
        try {
            TypeHandler.createValue("invalid.ClassName", Object.class);
            fail("Expected ParseException for invalid class name");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createValue for Number (integer)
    public void testCreateValueForNumberInteger() throws Exception {
        Number num = (Number) TypeHandler.createValue("123", Number.class);
        assertEquals(Long.valueOf(123), num);
    }

    // Test createValue for Number (double)
    public void testCreateValueForNumberDouble() throws Exception {
        Number num = (Number) TypeHandler.createValue("123.45", Number.class);
        assertEquals(Double.valueOf(123.45), num);
    }

    // Test createValue for Number with invalid format
    public void testCreateValueForNumberInvalid() throws Exception {
        try {
            TypeHandler.createValue("abc", Number.class);
            fail("Expected ParseException for invalid number format");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createValue for Class with a valid class name
    public void testCreateValueForClassValid() throws Exception {
        Class<?> clazz = (Class<?>) TypeHandler.createValue("java.lang.String", Class.class);
        assertEquals(String.class, clazz);
    }

    // Test createValue for Class with an invalid class name
    public void testCreateValueForClassInvalid() throws Exception {
        try {
            TypeHandler.createValue("invalid.ClassName", Class.class);
            fail("Expected ParseException for invalid class name");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createValue for File
    public void testCreateValueForFile() throws Exception {
        File file = (File) TypeHandler.createValue("/path/to/file", File.class);
        assertEquals("/path/to/file", file.getPath());
    }

    // Test createValue for Existing File (when file exists)
    public void testCreateValueForExistingFileExists() throws Exception {
        // Create a dummy file to test this
        File dummyFile = new File("dummyTestFile.txt");
        dummyFile.createNewFile();
        try {
            Object result = TypeHandler.createValue(dummyFile.getName(), PatternOptionBuilder.EXISTING_FILE_VALUE);
            assertTrue(result instanceof FileInputStream);
            // Clean up the dummy file
            ((FileInputStream) result).close();
        } finally {
            dummyFile.delete();
        }
    }

    // Test createValue for Existing File (when file does not exist)
    public void testCreateValueForExistingFileNotExists() throws Exception {
        try {
            TypeHandler.createValue("nonExistentFile.txt", PatternOptionBuilder.EXISTING_FILE_VALUE);
            fail("Expected ParseException for non-existent file");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createValue for URL with valid URL
    public void testCreateValueForURLValid() throws Exception {
        // URL constructor adds a trailing slash if not present
        URL url = (URL) TypeHandler.createValue("http://example.com", URL.class);
        assertEquals("http://example.com/", url.toString());
    }

    // Test createValue for URL with invalid URL
    public void testCreateValueForURLInvalid() throws Exception {
        try {
            TypeHandler.createValue("invalid-url", URL.class);
            fail("Expected ParseException for invalid URL");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createObject with a valid class name
    public void testCreateObjectValid() throws Exception {
        Object obj = TypeHandler.createObject("java.lang.Object");
        assertNotNull(obj);
        assertTrue(obj instanceof Object);
    }

    // Test createObject with an invalid class name
    public void testCreateObjectInvalid() throws Exception {
        try {
            TypeHandler.createObject("invalid.ClassName");
            fail("Expected ParseException for invalid class name");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createNumber with integer
    public void testCreateNumberInteger() throws Exception {
        Number num = TypeHandler.createNumber("456");
        assertEquals(Long.valueOf(456), num);
    }

    // Test createNumber with double
    public void testCreateNumberDouble() throws Exception {
        Number num = TypeHandler.createNumber("456.78");
        assertEquals(Double.valueOf(456.78), num);
    }

    // Test createNumber with invalid format
    public void testCreateNumberInvalid() throws Exception {
        try {
            TypeHandler.createNumber("xyz");
            fail("Expected ParseException for invalid number format");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createClass with a valid class name
    public void testCreateClassValid() throws Exception {
        Class<?> clazz = TypeHandler.createClass("java.lang.Integer");
        assertEquals(Integer.class, clazz);
    }

    // Test createClass with an invalid class name
    public void testCreateClassInvalid() throws Exception {
        try {
            TypeHandler.createClass("invalid.ClassName");
            fail("Expected ParseException for invalid class name");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createFile
    public void testCreateFile() throws Exception {
        File file = TypeHandler.createFile("/another/path");
        assertEquals("/another/path", file.getPath());
    }

    // Test openFile when file exists
    public void testOpenFileExists() throws Exception {
        File dummyFile = new File("tempOpenFile.txt");
        dummyFile.createNewFile();
        try {
            FileInputStream fis = TypeHandler.openFile(dummyFile.getName());
            assertNotNull(fis);
            fis.close();
        } finally {
            dummyFile.delete();
        }
    }

    // Test openFile when file does not exist
    public void testOpenFileNotExists() throws Exception {
        try {
            TypeHandler.openFile("nonExistentFileForOpen.txt");
            fail("Expected ParseException for non-existent file");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test createURL with valid URL
    public void testCreateURLValid() throws Exception {
        URL url = TypeHandler.createURL("https://www.google.com");
        assertEquals("https://www.google.com/", url.toString()); // URL adds trailing slash
    }

    // Test createURL with invalid URL
    public void testCreateURLInvalid() throws Exception {
        try {
            TypeHandler.createURL("ht:tp://invalid");
            fail("Expected ParseException for invalid URL");
        } catch (ParseException e) {
            // Expected
        }
    }

    // Test for unsupported operation for createDate
    public void testCreateDateUnsupported() throws Exception {
        try {
            TypeHandler.createDate("2023-10-27");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    // Test for unsupported operation for createFiles
    public void testCreateFilesUnsupported() throws Exception {
        try {
            TypeHandler.createFiles("some/path/*.txt");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // Expected
        }
    }

    // Test createValue with null class
    public void testCreateValueWithNullClass() throws Exception {
        assertNull(TypeHandler.createValue("someValue", (Class<?>) null));
    }

    // Test createValue with null string and Class type
    public void testCreateValueNullStringAndClass() throws Exception {
        Object result = TypeHandler.createValue(null, String.class);
        assertNull(result);
    }

    // Test createObject with null classname
    public void testCreateObjectNullClassName() throws Exception {
        // createObject internally calls Class.forName(null) which throws NullPointerException.
        // The ParseException is thrown around it.
        try {
            TypeHandler.createObject(null);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getCause() instanceof NullPointerException);
        }
    }

    // Test createNumber with null string
    public void testCreateNumberNullString() throws Exception {
        // createNumber internally calls Long.valueOf(null) or Double.valueOf(null) which throws NumberFormatException.
        // The ParseException is thrown around it.
        try {
            TypeHandler.createNumber(null);
            fail("Expected ParseException");
        } catch (ParseException e) {
            assertTrue(e.getCause() instanceof NumberFormatException);
        }
    }
}
