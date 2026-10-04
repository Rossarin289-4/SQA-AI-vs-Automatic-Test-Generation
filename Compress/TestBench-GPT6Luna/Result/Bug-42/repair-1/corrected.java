package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.compress.archivers.ArchiveEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipException;

public class UnixStatTest {
    @Test
    public void testPermissionMask() throws Exception {
        assertEquals(4095, UnixStat.PERM_MASK);
    }

    @Test
    public void testFileTypeFlag() throws Exception {
        assertEquals(61440, UnixStat.FILE_TYPE_FLAG);
    }

    @Test
    public void testLinkFlag() throws Exception {
        assertEquals(40960, UnixStat.LINK_FLAG);
    }

    @Test
    public void testFileFlag() throws Exception {
        assertEquals(32768, UnixStat.FILE_FLAG);
    }

    @Test
    public void testDirectoryFlag() throws Exception {
        assertEquals(16384, UnixStat.DIR_FLAG);
    }

    @Test
    public void testDefaultLinkPermissions() throws Exception {
        assertEquals(511, UnixStat.DEFAULT_LINK_PERM);
    }

    @Test
    public void testDefaultDirectoryPermissions() throws Exception {
        assertEquals(493, UnixStat.DEFAULT_DIR_PERM);
    }

    @Test
    public void testDefaultFilePermissions() throws Exception {
        assertEquals(420, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testPermissionMaskContainsAllDefaultPermissions() throws Exception {
        assertEquals(UnixStat.DEFAULT_LINK_PERM,
                     UnixStat.DEFAULT_LINK_PERM & UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_DIR_PERM,
                     UnixStat.DEFAULT_DIR_PERM & UnixStat.PERM_MASK);
        assertEquals(UnixStat.DEFAULT_FILE_PERM,
                     UnixStat.DEFAULT_FILE_PERM & UnixStat.PERM_MASK);
    }

    @Test
    public void testFileTypeFlagsAreDisjointFromPermissionBits() throws Exception {
        assertEquals(0, UnixStat.FILE_TYPE_FLAG & UnixStat.PERM_MASK);
        assertEquals(0, UnixStat.LINK_FLAG & UnixStat.PERM_MASK);
        assertEquals(0, UnixStat.FILE_FLAG & UnixStat.PERM_MASK);
        assertEquals(0, UnixStat.DIR_FLAG & UnixStat.PERM_MASK);
    }

    @Test
    public void testFileAndLinkFlagsBelongToFileTypeMask() throws Exception {
        assertEquals(UnixStat.FILE_FLAG, UnixStat.FILE_FLAG & UnixStat.FILE_TYPE_FLAG);
        assertEquals(UnixStat.LINK_FLAG, UnixStat.LINK_FLAG & UnixStat.FILE_TYPE_FLAG);
    }

    @Test
    public void testDirectoryFlagBelongsToFileTypeMask() throws Exception {
        assertEquals(UnixStat.DIR_FLAG, UnixStat.DIR_FLAG & UnixStat.FILE_TYPE_FLAG);
    }

    @Test
    public void testPermissionModeAndSymlink() throws Exception {
        AsiExtraField entry = new AsiExtraField();
        ZipArchiveEntry link = new ZipArchiveEntry("link");
        link.setUnixMode(UnixStat.LINK_FLAG | UnixStat.DEFAULT_LINK_PERM);
        assertEquals(3, link.getPlatform());
        assertEquals(UnixStat.LINK_FLAG | UnixStat.DEFAULT_LINK_PERM, link.getUnixMode());
        assertTrue(link.isUnixSymlink());
        assertEquals(UnixStat.FILE_FLAG, UnixStat.FILE_FLAG);
    }

    @Test
    public void testUnixModeDirectoryAttribute() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("folder/");
        entry.setUnixMode(UnixStat.DIR_FLAG | UnixStat.DEFAULT_DIR_PERM);
        assertEquals(UnixStat.DIR_FLAG | UnixStat.DEFAULT_DIR_PERM, entry.getUnixMode());
        assertEquals(3, entry.getPlatform());
        assertEquals(0x10L, entry.getExternalAttributes() & 0x10L);
    }

    @Test
    public void testMethodAndNegativeMethodBoundary() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setMethod(0);
        assertEquals(0, entry.getMethod());
        entry.setMethod(Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, entry.getMethod());
        try {
            entry.setMethod(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(Integer.MAX_VALUE, entry.getMethod());
        }
    }

    @Test
    public void testAttributesAndSizeEdges() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setInternalAttributes(Integer.MIN_VALUE);
        entry.setExternalAttributes(Long.MAX_VALUE);
        entry.setSize(Long.MAX_VALUE);
        assertEquals(Integer.MIN_VALUE, entry.getInternalAttributes());
        assertEquals(Long.MAX_VALUE, entry.getExternalAttributes());
        assertEquals(Long.MAX_VALUE, entry.getSize());
        try {
            entry.setSize(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(Long.MAX_VALUE, entry.getSize());
        }
    }

    @Test
    public void testNameAndDirectoryRules() throws Exception {
        ZipArchiveEntry file = new ZipArchiveEntry("a\\b");
        ZipArchiveEntry directory = new ZipArchiveEntry("folder/");
        assertEquals("a/b", file.getName());
        assertFalse(file.isDirectory());
        assertEquals("folder/", directory.getName());
        assertTrue(directory.isDirectory());
        assertEquals("a/b".hashCode(), file.hashCode());
    }

    @Test
    public void testEmptyRawNameAndGeneralPurposeBit() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertNull(entry.getRawName());
        GeneralPurposeBit bit = new GeneralPurposeBit();
        bit.useUTF8ForNames(true);
        entry.setGeneralPurposeBit(bit);
        assertTrue(entry.getGeneralPurposeBit().usesUTF8ForNames());
    }

    @Test
    public void testVersionAndRawFlagRoundTrip() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setVersionMadeBy(Integer.MAX_VALUE);
        entry.setVersionRequired(Integer.MIN_VALUE);
        entry.setRawFlag(0xFFFF);
        assertEquals(Integer.MAX_VALUE, entry.getVersionMadeBy());
        assertEquals(Integer.MIN_VALUE, entry.getVersionRequired());
        assertEquals(0xFFFF, entry.getRawFlag());
    }

    @Test
    public void testModifiedDateAndClone() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        entry.setTime(1234L);
        ZipArchiveEntry copy = (ZipArchiveEntry) entry.clone();
        assertEquals(new Date(1234L), entry.getLastModifiedDate());
        assertEquals(entry, copy);
        assertEquals(entry.hashCode(), copy.hashCode());
    }

    @Test
    public void testExtraFieldEmptyCollectionBehavior() throws Exception {
        ZipArchiveEntry entry = new ZipArchiveEntry("a");
        assertEquals(0, entry.getExtraFields().length);
        assertEquals(0, entry.getCentralDirectoryExtra().length);
        assertEquals(0, entry.getLocalFileDataExtra().length);
        assertNull(entry.getExtraField(new ZipShort(1)));
    }

    @Test
    public void testEqualEntriesDifferByName() throws Exception {
        ZipArchiveEntry first = new ZipArchiveEntry("a");
        ZipArchiveEntry second = new ZipArchiveEntry("b");
        assertFalse(first.equals(second));
        assertTrue(first.equals(first));
    }
}
