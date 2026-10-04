package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Date;
import java.util.zip.ZipException;

public class X5455_ExtendedTimestampTest {
    @Test
    public void testInitialLengthsAndHeader() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        assertEquals(0x5455, value.getHeaderId().getValue());
        assertEquals(1, value.getLocalFileDataLength().getValue());
        assertEquals(1, value.getCentralDirectoryLength().getValue());
        assertArrayEquals(new byte[] { 0 }, value.getLocalFileDataData());
    }

    @Test
    public void testAllFlagBitsAndIgnoredHighBits() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setFlags((byte) 7);
        assertEquals((byte) 7, value.getFlags());
        assertTrue(value.isBit0_modifyTimePresent());
        assertTrue(value.isBit1_accessTimePresent());
        assertTrue(value.isBit2_createTimePresent());

        value.setFlags((byte) 0xF8);
        assertEquals((byte) 0xF8, value.getFlags());
        assertFalse(value.isBit0_modifyTimePresent());
        assertFalse(value.isBit1_accessTimePresent());
        assertFalse(value.isBit2_createTimePresent());
    }

    @Test
    public void testSetAndClearTimesUpdatesFlagsAndLengths() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setModifyTime(new ZipLong(10));
        value.setAccessTime(new ZipLong(20));
        value.setCreateTime(new ZipLong(30));
        assertEquals((byte) 7, value.getFlags());
        assertEquals(13, value.getLocalFileDataLength().getValue());
        assertEquals(5, value.getCentralDirectoryLength().getValue());

        value.setAccessTime(null);
        assertEquals((byte) 5, value.getFlags());
        assertEquals(9, value.getLocalFileDataLength().getValue());
        assertNull(value.getAccessTime());
    }

    @Test
    public void testLocalDataSerializesAllTimestamps() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setModifyTime(new ZipLong(1));
        value.setAccessTime(new ZipLong(2));
        value.setCreateTime(new ZipLong(3));
        assertArrayEquals(new byte[] {
            7, 1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0
        }, value.getLocalFileDataData());
    }

    @Test
    public void testCentralDataContainsOnlyModifyTime() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setModifyTime(new ZipLong(1));
        value.setAccessTime(new ZipLong(2));
        value.setCreateTime(new ZipLong(3));
        assertArrayEquals(new byte[] { 7, 1, 0, 0, 0 },
                value.getCentralDirectoryData());
    }

    @Test
    public void testLocalParsingAtNonzeroOffset() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        byte[] input = new byte[] { 99, 1, 1, 0, 0, 0, 99 };
        value.parseFromLocalFileData(input, 1, 5);
        assertEquals(1, value.getFlags());
        assertEquals(1L, value.getModifyTime().getValue());
        assertNull(value.getAccessTime());
        assertEquals(5, value.getLocalFileDataLength().getValue());
    }

    @Test
    public void testLocalParsingAllFields() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.parseFromLocalFileData(new byte[] {
            7, 1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0
        }, 0, 13);
        assertEquals(1L, value.getModifyTime().getValue());
        assertEquals(2L, value.getAccessTime().getValue());
        assertEquals(3L, value.getCreateTime().getValue());
    }

    @Test
    public void testParsingShortCentralDataOmitsOptionalTimes() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.parseFromCentralDirectoryData(new byte[] { 7, 1, 0, 0, 0 }, 0, 5);
        assertEquals(1L, value.getModifyTime().getValue());
        assertNull(value.getAccessTime());
        assertNull(value.getCreateTime());
        assertEquals(5, value.getCentralDirectoryLength().getValue());
    }

    @Test
    public void testParsingResetsPreviouslyPresentTimes() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.parseFromLocalFileData(new byte[] {
            7, 1, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0
        }, 0, 13);
        value.parseFromLocalFileData(new byte[] { 0 }, 0, 1);
        assertEquals((byte) 0, value.getFlags());
        assertNull(value.getModifyTime());
        assertNull(value.getAccessTime());
        assertNull(value.getCreateTime());
        assertEquals(1, value.getLocalFileDataLength().getValue());
    }

    @Test
    public void testDatesRoundDownToWholeSeconds() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setModifyJavaTime(new Date(1234));
        assertEquals(new Date(1000), value.getModifyJavaTime());
        assertEquals(1L, value.getModifyTime().getValue());
        value.setAccessJavaTime(new Date(-1));
        assertEquals(new Date(0), value.getAccessJavaTime());
    }

    @Test
    public void testDateSetterAcceptsSignedIntegerMaximum() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setModifyJavaTime(new Date((long) Integer.MAX_VALUE * 1000L));
        assertEquals((long) Integer.MAX_VALUE, value.getModifyTime().getValue());
    }

    @Test
    public void testDateSetterAcceptsSignedIntegerMinimum() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setCreateJavaTime(new Date((long) Integer.MIN_VALUE * 1000L));
        assertEquals((long) Integer.MIN_VALUE, value.getCreateTime().getValue());
    }

    @Test
    public void testDateSetterRejectsFirstSecondAboveMaximum() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        try {
            value.setModifyJavaTime(new Date(((long) Integer.MAX_VALUE + 1L) * 1000L));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testDateSetterRejectsFirstSecondBelowMinimum() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        try {
            value.setAccessJavaTime(new Date(((long) Integer.MIN_VALUE - 1L) * 1000L));
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testNullDatesClearTimes() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setModifyJavaTime(new Date(1000));
        value.setModifyJavaTime(null);
        assertNull(value.getModifyTime());
        assertNull(value.getModifyJavaTime());
        assertEquals((byte) 0, value.getFlags());
    }

    @Test
    public void testEqualityIgnoresUnusedFlagBits() throws Exception {
        X5455_ExtendedTimestamp first = new X5455_ExtendedTimestamp();
        X5455_ExtendedTimestamp second = new X5455_ExtendedTimestamp();
        first.setFlags((byte) 1);
        second.setFlags((byte) 9);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testEqualityIncludesTimestampValues() throws Exception {
        X5455_ExtendedTimestamp first = new X5455_ExtendedTimestamp();
        X5455_ExtendedTimestamp second = new X5455_ExtendedTimestamp();
        first.setModifyTime(new ZipLong(1));
        second.setModifyTime(new ZipLong(2));
        assertNotEquals(first, second);
    }

    @Test
    public void testClonePreservesTimestampState() throws Exception {
        X5455_ExtendedTimestamp original = new X5455_ExtendedTimestamp();
        original.setModifyTime(new ZipLong(42));
        original.setAccessTime(new ZipLong(5));
        X5455_ExtendedTimestamp copy = (X5455_ExtendedTimestamp) original.clone();
        assertEquals(original, copy);
        assertEquals(original.hashCode(), copy.hashCode());
        assertEquals(42L, copy.getModifyTime().getValue());
    }

    @Test
    public void testDifferentTypeIsNotEqual() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        assertFalse(value.equals("other"));
    }

    @Test
    public void testToStringIncludesFlagsAndTimestampLabels() throws Exception {
        X5455_ExtendedTimestamp value = new X5455_ExtendedTimestamp();
        value.setModifyTime(new ZipLong(0));
        value.setAccessTime(new ZipLong(1));
        String text = value.toString();
        assertTrue(text.startsWith("0x5455 Zip Extra Field: Flags=11"));
        assertTrue(text.contains("Modify:["));
        assertTrue(text.contains("Access:["));
        assertFalse(text.contains("Create:["));
    }
}
