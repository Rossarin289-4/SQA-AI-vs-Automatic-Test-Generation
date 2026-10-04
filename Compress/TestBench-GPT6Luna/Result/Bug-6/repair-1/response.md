```java
package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class ZipArchiveEntryTest {
    @Test
    public void testDefaultMethodAndSupport() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertEquals(-1, entry.getMethod());
        assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testStoredMethod() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
        assertTrue(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testDeflatedMethod() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(8);
        assertTrue(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testUnsupportedNonnegativeMethod() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(9);
        assertEquals(9, entry.getMethod());
        assertFalse(entry.isSupportedCompressionMethod());
    }

    @Test
    public void testNegativeMethodRejected() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.setMethod(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
        assertEquals(-1, entry.getMethod());
    }

    @Test
    public void testInternalAttributesRoundTrip() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setInternalAttributes(-1);
        assertEquals(-1, entry.getInternalAttributes());
    }

    @Test
    public void testExternalAttributesLongBoundary() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setExternalAttributes(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, entry.getExternalAttributes());
    }

    @Test
    public void testExternalAttributesMinimumLong() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setExternalAttributes(Long.MIN_VALUE);
        assertEquals(Long.MIN_VALUE, entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeEncodesModeAndFatAttribute() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("file");
        entry.setUnixMode(0644);
        assertEquals(0644, entry.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(((long) 0644 << 16) | 1, entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeWithWriteBitOmitsReadOnlyAttribute() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("file");
        entry.setUnixMode(0200);
        assertEquals(((long) 0200 << 16), entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeDirectoryFlag() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        entry.setUnixMode(0755);
        assertEquals(((long) 0755 << 16) | 0x10, entry.getExternalAttributes());
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testUnixModeMasksToSixteenBits() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setUnixMode(0x10000 | 0755);
        assertEquals(0755, entry.getUnixMode());
    }

    @Test
    public void testDefaultPlatformHasNoUnixMode() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setExternalAttributes(0755L << 16);
        assertEquals(0, entry.getUnixMode());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testExtraFieldInsertionAndReplacement() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testExtraFieldsPreserveEmptyArray() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testAddAsFirstExtraFieldOnEmptyEntry() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.addAsFirstExtraField(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testRemoveMissingExtraFieldRejected() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.removeExtraField(new ZipShort(1));
            fail("expected NoSuchElementException");
        } catch (java.util.NoSuchElementException expected) { }
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testSetExtraFieldsWithNullRejected() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.setExtraFields(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
        assertEquals(0, entry.getExtraFields().length);
    }

    @Test
    public void testNameDirectoryAndHashCode() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        assertEquals("dir/", entry.getName());
        assertTrue(entry.isDirectory());
        assertEquals("dir/".hashCode(), entry.hashCode());
    }

    @Test
    public void testRegularNameIsNotDirectory() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir");
        assertFalse(entry.isDirectory());
    }

    @Test
    public void testEqualsUsesName() throws Exception {
        ZipArchiveEntry first = new ZipArchiveEntry("same");
        ZipArchiveEntry second = new ZipArchiveEntry("same");
        ZipArchiveEntry different = new ZipArchiveEntry("other");
        assertTrue(first.equals(second));
        assertFalse(first.equals(different));
        assertFalse(first.equals(null));
    }

    @Test
    public void testLastModifiedDateMatchesEntryTime() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setTime(123456789L);
        assertEquals(new Date(entry.getTime()), entry.getLastModifiedDate());
    }

    @Test
    public void testClonePreservesAttributesAndName() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setInternalAttributes(17);
        entry.setExternalAttributes(29L);
        entry.setMethod(8);
        ZipArchiveEntry copy = (ZipArchiveEntry) entry.clone();
        assertEquals("a", copy.getName());
        assertEquals(17, copy.getInternalAttributes());
        assertEquals(29L, copy.getExternalAttributes());
        assertEquals(8, copy.getMethod());
        assertTrue(entry.equals(copy));
    }

    @Test
    public void testLocalFileExtraInitiallyEmpty() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertEquals(0, entry.getLocalFileDataExtra().length);
        assertEquals(0, entry.getCentralDirectoryExtra().length);
    }
}
```