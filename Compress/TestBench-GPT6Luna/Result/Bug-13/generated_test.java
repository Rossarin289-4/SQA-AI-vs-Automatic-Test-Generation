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
    public void testDefaultEntryState() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        assertEquals("item", entry.getName());
        assertEquals(-1, entry.getMethod());
        assertEquals(ArchiveEntry.SIZE_UNKNOWN, entry.getSize());
        assertEquals(ZipArchiveEntry.PLATFORM_FAT, entry.getPlatform());
    }

    @Test
    public void testDirectoryNameAndWindowsSeparator() throws Exception {
        ZipArchiveEntry directory = new ZipArchiveEntry("dir/");
        ZipArchiveEntry windows = new ZipArchiveEntry("dir\\item");
        assertTrue(directory.isDirectory());
        assertEquals("dir/item", windows.getName());
        assertFalse(windows.isDirectory());
    }

    @Test
    public void testMethodAcceptsZeroAndLargestInt() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
        entry.setMethod(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, entry.getMethod());
    }

    @Test
    public void testMethodRejectsNegativeOne() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        try {
            entry.setMethod(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testAttributesRoundTrip() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setInternalAttributes(Integer.MIN_VALUE);
        entry.setExternalAttributes(Long.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, entry.getInternalAttributes());
        assertEquals(Long.MIN_VALUE, entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeAndDosReadOnlyFlag() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setUnixMode(0644);
        assertEquals(ZipArchiveEntry.PLATFORM_UNIX, entry.getPlatform());
        assertEquals(0644, entry.getUnixMode());
        assertEquals(((long) 0644) << 16, entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeDirectoryFlag() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("dir/");
        entry.setUnixMode(0777);
        assertEquals(0777, entry.getUnixMode());
        assertEquals((((long) 0777) << 16) | 0x10, entry.getExternalAttributes());
    }

    @Test
    public void testUnixModeMasksToSixteenBits() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setUnixMode(0x12345678);
        assertEquals(0x5678, entry.getUnixMode());
    }

    @Test
    public void testExtraFieldsPreserveOrderAndReplaceById() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
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
    public void testAddAsFirstExtraFieldMovesReplacementToFront() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        ZipExtraField first = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        ZipExtraField second = ExtraFieldUtils.createExtraField(new ZipShort(0x2345));
        ZipExtraField replacement = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        entry.addExtraField(first);
        entry.addExtraField(second);
        entry.addAsFirstExtraField(replacement);
        ZipExtraField[] fields = entry.getExtraFields();
        assertEquals(2, fields.length);
        assertSame(replacement, fields[0]);
        assertSame(second, fields[1]);
    }

    @Test
    public void testRemoveExtraField() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        ZipExtraField field = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        entry.addExtraField(field);
        entry.removeExtraField(new ZipShort(0x1234));
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testRemoveAbsentExtraFieldThrows() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        try {
            entry.removeExtraField(new ZipShort(0x1234));
            fail("expected NoSuchElementException");
        } catch (java.util.NoSuchElementException expected) { }
    }

    @Test
    public void testUnparseableExtraDataRoundTripAndRemoval() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setExtra(new byte[] { 1 });
        assertNull(entry.getUnparseableExtraFieldData());
        assertEquals(0, entry.getExtraFields().length);
        entry.removeUnparseableExtraFieldData();
    }

    @Test
    public void testRemoveMissingUnparseableDataThrows() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        try {
            entry.removeUnparseableExtraFieldData();
            fail("expected NoSuchElementException");
        } catch (java.util.NoSuchElementException expected) { }
    }

    @Test
    public void testExtraBytesAreReturnedAsIndependentArray() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setExtra(new byte[] { 1 });
        assertArrayEquals(new byte[0], entry.getLocalFileDataExtra());
    }

    @Test
    public void testSizeAcceptsZeroAndLongMaximum() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setSize(0);
        assertEquals(0L, entry.getSize());
        entry.setSize(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, entry.getSize());
    }

    @Test
    public void testSizeRejectsNegativeOne() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        try {
            entry.setSize(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testHashCodeUsesName() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        assertEquals("item".hashCode(), entry.hashCode());
    }

    @Test
    public void testGeneralPurposeBitCanBeReplaced() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        GeneralPurposeBit bit = new GeneralPurposeBit();
        bit.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(bit);
        assertSame(bit, entry.getGeneralPurposeBit());
        assertTrue(entry.getGeneralPurposeBit().usesUTF8ForNames());
    }

    @Test
    public void testLastModifiedDateReflectsEntryTime() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setTime(123456789L);
        assertEquals(new Date(123456789L), entry.getLastModifiedDate());
    }

    @Test
    public void testCloneRetainsConfiguredState() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setMethod(8);
        entry.setSize(12);
        entry.setInternalAttributes(3);
        entry.setExternalAttributes(4);
        ZipArchiveEntry copy = (ZipArchiveEntry) entry.clone();
        assertEquals("item", copy.getName());
        assertEquals(8, copy.getMethod());
        assertEquals(12L, copy.getSize());
        assertEquals(3, copy.getInternalAttributes());
        assertEquals(4L, copy.getExternalAttributes());
    }

    @Test
    public void testEqualsUsesConfiguredEntryState() throws Exception {
        ZipArchiveEntry left = new ZipArchiveEntry("item");
        ZipArchiveEntry right = new ZipArchiveEntry("item");
        left.setMethod(8);
        right.setMethod(8);
        left.setSize(12);
        right.setSize(12);
        assertTrue(left.equals(right));
        right.setInternalAttributes(1);
        assertFalse(left.equals(right));
    }

    @Test
    public void testSetExtraFieldsReplacesExistingAndKeepsArrayOrder() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        ZipExtraField old = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        ZipExtraField first = ExtraFieldUtils.createExtraField(new ZipShort(0x2345));
        ZipExtraField second = ExtraFieldUtils.createExtraField(new ZipShort(0x3456));
        entry.addExtraField(old);
        entry.setExtraFields(new ZipExtraField[] { first, second });
        ZipExtraField[] result = entry.getExtraFields();
        assertEquals(2, result.length);
        assertSame(first, result[0]);
        assertSame(second, result[1]);
        assertNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testSetExtraFieldsRetainsUnparseableFieldSeparately() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        UnparseableExtraFieldData invalid = new UnparseableExtraFieldData();
        invalid.parseFromLocalFileData(new byte[] { 7 }, 0, 1);
        ZipExtraField regular =
            ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        entry.setExtraFields(new ZipExtraField[] { regular, invalid });
        assertEquals(1, entry.getExtraFields().length);
        assertSame(regular, entry.getExtraFields()[0]);
        assertSame(invalid, entry.getUnparseableExtraFieldData());
        assertEquals(2, entry.getExtraFields(true).length);
    }

    @Test
    public void testSetExtraFieldsEmptyClearsRegularFields() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        ZipExtraField field = ExtraFieldUtils.createExtraField(new ZipShort(0x1234));
        entry.addExtraField(field);
        entry.setExtraFields(new ZipExtraField[0]);
        assertEquals(0, entry.getExtraFields().length);
        assertNull(entry.getExtraField(new ZipShort(0x1234)));
    }

    @Test
    public void testCentralDirectoryExtraForEmptyFieldsIsEmpty() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        assertArrayEquals(new byte[0], entry.getCentralDirectoryExtra());
    }

    @Test
    public void testCentralDirectoryExtraParsesField() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setCentralDirectoryExtra(new byte[] {
            0x34, 0x12, 1, 0, 9
        });
        assertEquals(1, entry.getExtraFields().length);
        assertArrayEquals(new byte[] {
            0x34, 0x12, 1, 0, 9
        }, entry.getCentralDirectoryExtra());
    }

    @Test
    public void testCentralDirectoryExtraWithMalformedTail() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        entry.setCentralDirectoryExtra(new byte[] { 1 });
        assertNull(entry.getUnparseableExtraFieldData());
        assertEquals(0, entry.getExtraFields(true).length);
    }

    @Test
    public void testRawNameIsNullWhenNotSet() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        assertNull(entry.getRawName());
    }

    @Test
    public void testRawNameReturnsCopy() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("item");
        ZipArchiveEntry copySource = new ZipArchiveEntry("unused");
        assertNull(copySource.getRawName());
        assertArrayEquals(new byte[0], entry.getLocalFileDataExtra());
    }
}
