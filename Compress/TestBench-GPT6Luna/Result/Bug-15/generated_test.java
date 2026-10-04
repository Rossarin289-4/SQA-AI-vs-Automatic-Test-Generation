package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class ZipArchiveEntryTest {
    @Test
    public void testDefaultMethodAndAttributes() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertEquals(-1, entry.getMethod());
        assertEquals(0, entry.getInternalAttributes());
        assertEquals(0L, entry.getExternalAttributes());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testSetMethodZero() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
    }

    @Test
    public void testSetMethodMaximumNonnegativeInt() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, entry.getMethod());
    }

    @Test
    public void testNegativeMethodRejected() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.setMethod(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testAttributesRoundTripAtIntEdges() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setInternalAttributes(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, entry.getInternalAttributes());
        entry.setInternalAttributes(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, entry.getInternalAttributes());
    }

    @Test
    public void testExternalAttributesRoundTripAtLongEdges() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setExternalAttributes(Long.MIN_VALUE);
        assertEquals(Long.MIN_VALUE, entry.getExternalAttributes());
        entry.setExternalAttributes(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeSetsPlatformModeAndDosFlags() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setUnixMode(0644);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0644, entry.getUnixMode());
        assertEquals(((long) 0644) << 16, entry.getExternalAttributes());
    }

    @Test
    public void testUnixDirectoryModeSetsDirectoryFlag() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        entry.setUnixMode(0755);
        assertEquals(0755, entry.getUnixMode());
        assertEquals((((long) 0755) << 16) | 0x10L, entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeMasksToSixteenBits() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setUnixMode(0x10001);
        assertEquals(1, entry.getUnixMode());
    }

    @Test
    public void testExtraFieldOrderingAndReplacement() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        ZipExtraField first = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        ZipExtraField second = ExtraFieldUtils.createExtraField(new ZipShort(0x2345));
        ZipExtraField replacement = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        entry.addExtraField(first);
        entry.addExtraField(second);
        entry.addExtraField(replacement);
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertSame(replacement, fields[0]);
        assertSame(second, fields[1]);
        assertSame(replacement, entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testAddAsFirstExtraField() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        ZipExtraField first = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        ZipExtraField second = ExtraFieldUtils.createExtraField(new ZipShort(0x2345));
        entry.addExtraField(first);
        entry.addExtraField(second);
        entry.addAsFirstExtraField(second);
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertSame(second, fields[0]);
        assertSame(first, fields[1]);
    }

    @Test
    public void testRemoveExtraFieldAndMissingFieldException() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        ZipShort id = new ZipShort(0x1234);
        entry.addExtraField(ExtraFieldUtils.createExtraField(id));
        entry.removeExtraField(id);
        assertEquals(0, entry.getExtraFields().length);
        try {
            entry.removeExtraField(id);
            fail("expected NoSuchElementException");
        } catch (java.util.NoSuchElementException expected) {
        }
    }

    @Test
    public void testSetExtraParsesField() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        byte[] extra = new byte[] {0x34, 0x12, 1, 0, 7};
        entry.setExtra(extra);
        assertEquals(1, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(new ZipShort(0x1234)));
        assertArrayEquals(extra, entry.getLocalFileDataExtra());
    }

    @Test
    public void testLocalAndCentralExtraInitiallyEmpty() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertArrayEquals(new byte[0], entry.getLocalFileDataExtra());
        assertArrayEquals(new byte[0], entry.getCentralDirectoryExtra());
    }

    @Test
    public void testNameNormalizationAndDirectoryRecognition() throws Exception {
        ZipArchiveEntry file = new ZipArchiveEntry("a\\b");
        assertEquals("a/b", file.getName());
        assertFalse(file.isDirectory());
        ZipArchiveEntry directory = new ZipArchiveEntry("dir/");
        assertTrue(directory.isDirectory());
    }

    @Test
    public void testSizeZeroAndMaximumLong() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setSize(0);
        assertEquals(0L, entry.getSize());
        entry.setSize(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, entry.getSize());
    }

    @Test
    public void testNegativeSizeRejected() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.setSize(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testRawNameAbsent() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertNull(entry.getRawName());
    }

    @Test
    public void testHashCodeUsesName() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("abc");
        assertEquals("abc".hashCode(), entry.hashCode());
    }

    @Test
    public void testGeneralPurposeBitRoundTrip() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        GeneralPurposeBit bit = new GeneralPurposeBit();
        bit.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(bit);
        assertSame(bit, entry.getGeneralPurposeBit());
        assertTrue(entry.getGeneralPurposeBit().usesUTF8ForNames());
    }

    @Test
    public void testLastModifiedDateMatchesEntryTime() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setTime(1000L);
        assertEquals(new Date(1000L), entry.getLastModifiedDate());
    }

    @Test
    public void testClonePreservesNameAndAttributes() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setInternalAttributes(7);
        entry.setExternalAttributes(9L);
        ZipArchiveEntry copy = (ZipArchiveEntry) entry.clone();
        assertEquals("a", copy.getName());
        assertEquals(7, copy.getInternalAttributes());
        assertEquals(9L, copy.getExternalAttributes());
    }

    @Test
    public void testEqualsForEquivalentEntries() throws Exception {
        ZipArchiveEntry first = new ZipArchiveEntry("a");
        ZipArchiveEntry second = new ZipArchiveEntry("a");
        assertTrue(first.equals(second));
        assertFalse(first.equals(new ZipArchiveEntry("b")));
    }

    @Test
    public void testSetExtraFieldsReplacesExistingFields() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        ZipShort id = new ZipShort(0x1234);
        ZipExtraField original = ExtraFieldUtils.createExtraField(id);
        ZipExtraField replacement = ExtraFieldUtils.createExtraField(id);
        entry.setExtraFields(new ZipExtraField[] {original});
        entry.setExtraFields(new ZipExtraField[] {replacement});
        assertEquals(1, entry.getExtraFields().length);
        assertSame(replacement, entry.getExtraField(new ZipShort(0x1234)));
        assertSame(replacement, entry.getExtraFields()[0]);
    }

    @Test
    public void testSetExtraFieldsEmptyClearsParsedFields() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setExtraFields(new ZipExtraField[] {
            ExtraFieldUtils.createExtraField(new ZipShort(0x1234))
        });
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields().length);
        assertArrayEquals(new byte[0], entry.getLocalFileDataExtra());
    }

    @Test
    public void testSetExtraFieldsKeepsUnparseableSeparately() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setExtra(new byte[] {1, 2, 3});
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getUnparseableExtraFieldData());
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testRemoveUnparseableExtraFieldData() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.removeUnparseableExtraFieldData();
            fail("expected NoSuchElementException");
        } catch (java.util.NoSuchElementException expected) {
        }
        assertNull(entry.getUnparseableExtraFieldData());
    }

    @Test
    public void testRemoveUnparseableExtraFieldDataWhenAbsentThrows() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        try {
            entry.removeUnparseableExtraFieldData();
            fail("expected NoSuchElementException");
        } catch (java.util.NoSuchElementException expected) {
        }
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testCentralDirectoryExtraAddsField() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        byte[] central = new byte[] {0x34, 0x12, 1, 0, 7};
        entry.setCentralDirectoryExtra(central);
        assertEquals(1, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(new ZipShort(0x1234)));
        assertArrayEquals(central, entry.getCentralDirectoryExtra());
    }

    @Test
    public void testCentralDirectoryExtraMergesIntoExistingField() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        byte[] local = new byte[] {0x34, 0x12, 1, 0, 7};
        entry.setExtra(local);
        byte[] central = new byte[] {0x34, 0x12, 1, 0, 9};
        entry.setCentralDirectoryExtra(central);
        assertEquals(1, entry.getExtraFields().length);
        assertNotNull(entry.getExtraField(new ZipShort(0x1234)));
        assertArrayEquals(local, entry.getLocalFileDataExtra());
        assertArrayEquals(central, entry.getCentralDirectoryExtra());
    }

    @Test
    public void testCentralDirectoryExtraEmptyLeavesExistingField() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        byte[] local = new byte[] {0x34, 0x12, 1, 0, 7};
        entry.setExtra(local);
        entry.setCentralDirectoryExtra(new byte[0]);
        assertEquals(1, entry.getExtraFields().length);
        assertArrayEquals(local, entry.getLocalFileDataExtra());
    }

    @Test
    public void testCentralDirectoryExtraMalformedInputIsConsumed() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setCentralDirectoryExtra(new byte[] {1, 2, 3});
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getUnparseableExtraFieldData());
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testCentralDirectoryExtraMalformedInputIsIncludedInCentralData() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        byte[] malformed = new byte[] {1, 2, 3};
        entry.setCentralDirectoryExtra(malformed);
        assertArrayEquals(new byte[0], entry.getCentralDirectoryExtra());
        assertArrayEquals(new byte[0], entry.getLocalFileDataExtra());
    }
}
