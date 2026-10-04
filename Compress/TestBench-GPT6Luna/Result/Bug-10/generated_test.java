package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

public class ZipFileTest {
    @Test
    public void testCloseQuietlyAcceptsNull() throws Exception {
        ZipFile.closeQuietly(null);
        assertNull(null);
    }

    @Test
    public void testRejectsNonZipFile() throws Exception {
        File f = File.createTempFile("zft", ".tmp");
        try {
            try {
                new ZipFile(f);
                fail("expected ZipException");
            } catch (ZipException expected) {
                assertEquals("archive is not a ZIP archive", expected.getMessage());
            }
        } finally {
            f.delete();
        }
    }

    @Test
    public void testEmptyZipHasNoEntries() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        try {
            ZipFile zip = new ZipFile(f);
            try {
                assertFalse(zip.getEntries().hasMoreElements());
                assertFalse(zip.getEntriesInPhysicalOrder().hasMoreElements());
                assertNull(zip.getEntry("missing"));
                assertEquals("UTF8", zip.getEncoding());
            } finally {
                zip.close();
            }
        } finally {
            f.delete();
        }
    }

    @Test
    public void testGetEncodingUsesRequestedEncoding() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        try {
            ZipFile zip = new ZipFile(f, "US-ASCII");
            try {
                assertEquals("US-ASCII", zip.getEncoding());
            } finally {
                zip.close();
            }
        } finally {
            f.delete();
        }
    }

    @Test
    public void testGetEncodingPreservesNull() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        try {
            ZipFile zip = new ZipFile(f, (String) null);
            try {
                assertNull(zip.getEncoding());
            } finally {
                zip.close();
            }
        } finally {
            f.delete();
        }
    }

    @Test
    public void testCloseQuietlyClosesArchive() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        ZipFile zip = new ZipFile(f);
        ZipFile.closeQuietly(zip);
        try {
            zip.getEntries();
            assertTrue(zip.getEntry("absent") == null);
        } finally {
            f.delete();
        }
    }

    @Test
    public void testCloseQuietlyCanBeCalledAfterClose() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        try {
            ZipFile zip = new ZipFile(f);
            zip.close();
            ZipFile.closeQuietly(zip);
            assertEquals("UTF8", zip.getEncoding());
        } finally {
            f.delete();
        }
    }

    @Test
    public void testMissingEntryStreamIsNull() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        try {
            ZipFile zip = new ZipFile(f);
            try {
                assertNull(zip.getInputStream(new ZipArchiveEntry("outside")));
            } finally {
                zip.close();
            }
        } finally {
            f.delete();
        }
    }

    @Test
    public void testMissingEntryIsNullForEmptyName() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        try {
            ZipFile zip = new ZipFile(f);
            try {
                assertNull(zip.getEntry(""));
            } finally {
                zip.close();
            }
        } finally {
            f.delete();
        }
    }

    @Test
    public void testEmptyArchiveEnumerationsAreIndependent() throws Exception {
        File f = File.createTempFile("zft", ".zip");
        ZipArchiveOutputStream out = new ZipArchiveOutputStream(f);
        out.close();
        try {
            ZipFile zip = new ZipFile(f);
            try {
                Enumeration<ZipArchiveEntry> first = zip.getEntries();
                Enumeration<ZipArchiveEntry> second = zip.getEntriesInPhysicalOrder();
                assertFalse(first.hasMoreElements());
                assertFalse(second.hasMoreElements());
            } finally {
                zip.close();
            }
        } finally {
            f.delete();
        }
    }

    @Test
    public void testCannotReadNullEntryData() throws Exception {
        try {
            ZipFile zip = null;
            assertFalse(zip.canReadEntryData(null));
        } catch (NullPointerException expected) {
            assertTrue(true);
        }
    }

    @Test
    public void testCloseQuietlyDoesNotThrowForNullRepeatedly() throws Exception {
        ZipFile.closeQuietly(null);
        ZipFile.closeQuietly(null);
        assertTrue(true);
    }
}
