package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.utils.ArchiveUtils;

public class TarArchiveEntryTest {
    @Test
    public void testNormalNameAndDefaults() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        assertEquals("item", entry.getName());
        assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, entry.getMode());
        assertEquals(0L, entry.getSize());
        assertFalse(entry.isDirectory());
        assertTrue(entry.isFile());
        assertNull(entry.getFile());
    }

    @Test
    public void testDirectoryNameDefaults() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("folder/");
        assertEquals("folder/", entry.getName());
        assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, entry.getMode());
        assertTrue(entry.isDirectory());
        assertFalse(entry.isFile());
    }

    @Test
    public void testLeadingSlashesAreRemovedByDefault() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("///path");
        assertEquals("path", entry.getName());
        entry.setName("//next");
        assertEquals("next", entry.getName());
    }

    @Test
    public void testLeadingSlashesCanBePreserved() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("//path", true);
        assertEquals("//path", entry.getName());
        entry.setName("/next");
        assertEquals("/next", entry.getName());
    }

    @Test
    public void testNameEqualityAndHashCode() throws Exception {
        TarArchiveEntry first = new TarArchiveEntry("same");
        TarArchiveEntry second = new TarArchiveEntry("same");
        TarArchiveEntry other = new TarArchiveEntry("other");
        assertTrue(first.equals((Object) second));
        assertEquals(first.hashCode(), second.hashCode());
        assertFalse(first.equals((Object) other));
        assertFalse(first.equals((Object) null));
    }

    @Test
    public void testDescendantRequiresNamePrefix() throws Exception {
        TarArchiveEntry parent = new TarArchiveEntry("dir/");
        assertTrue(parent.isDescendent(new TarArchiveEntry("dir/child")));
        assertFalse(parent.isDescendent(new TarArchiveEntry("directory/child")));
    }

    @Test
    public void testUserAndGroupLongIds() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setUserId(2147483648L);
        entry.setGroupId(2147483647L);
        assertEquals(2147483648L, entry.getLongUserId());
        assertEquals(2147483647L, entry.getLongGroupId());
        assertEquals(Integer.MIN_VALUE, entry.getUserId());
        assertEquals(Integer.MAX_VALUE, entry.getGroupId());
    }

    @Test
    public void testDeprecatedIdsExposeUnsignedLowBits() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setUserId(-1);
        entry.setGroupId(Integer.MIN_VALUE);
        assertEquals(-1L, entry.getLongUserId());
        assertEquals(-2147483648L, entry.getLongGroupId());
        assertEquals(-1, entry.getUserId());
        assertEquals(Integer.MIN_VALUE, entry.getGroupId());
    }

    @Test
    public void testSetIdsAndNames() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setIds(7, 9);
        entry.setNames("alice", "team");
        assertEquals(7L, entry.getLongUserId());
        assertEquals(9L, entry.getLongGroupId());
        assertEquals("alice", entry.getUserName());
        assertEquals("team", entry.getGroupName());
    }

    @Test
    public void testLinkAndModeSetters() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setLinkName("target");
        entry.setMode(0755);
        assertEquals("target", entry.getLinkName());
        assertEquals(0755, entry.getMode());
    }

    @Test
    public void testModificationTimeRoundsDownToSeconds() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setModTime(1234567L);
        assertEquals(new Date(1234000L), entry.getModTime());
        assertEquals(entry.getModTime(), entry.getLastModifiedDate());
    }

    @Test
    public void testModificationTimeDateSetter() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setModTime(new Date(-1000L));
        assertEquals(new Date(-1000L), entry.getModTime());
    }

    @Test
    public void testSizeAllowsZeroAndMaximumLong() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setSize(0L);
        assertEquals(0L, entry.getSize());
        entry.setSize(Long.MAX_VALUE);
        assertEquals(Long.MAX_VALUE, entry.getSize());
    }

    @Test
    public void testNegativeSizeRejected() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        try {
            entry.setSize(-1L);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(0L, entry.getSize());
        }
    }

    @Test
    public void testDeviceNumbersAllowZeroAndIntegerMaximum() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setDevMajor(0);
        entry.setDevMinor(Integer.MAX_VALUE);
        assertEquals(0, entry.getDevMajor());
        assertEquals(Integer.MAX_VALUE, entry.getDevMinor());
    }

    @Test
    public void testNegativeDeviceNumberRejected() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        try {
            entry.setDevMajor(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(0, entry.getDevMajor());
        }
        try {
            entry.setDevMinor(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(0, entry.getDevMinor());
        }
    }

    @Test
    public void testLinkFlagClassifications() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item", TarConstants.LF_SYMLINK);
        assertTrue(entry.isSymbolicLink());
        assertFalse(entry.isLink());
        assertTrue(entry.isFile());

        TarArchiveEntry hardLink = new TarArchiveEntry("item", TarConstants.LF_LINK);
        assertTrue(hardLink.isLink());
        assertFalse(hardLink.isSymbolicLink());
        assertTrue(hardLink.isFile());
    }

    @Test
    public void testGnuLongNameFlagAndFormat() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item", TarConstants.LF_GNUTYPE_LONGNAME);
        assertTrue(entry.isGNULongNameEntry());
        assertFalse(entry.isGNULongLinkEntry());
        assertFalse(entry.isSparse());
    }

    @Test
    public void testSparseFlagAndPaxFlags() throws Exception {
        TarArchiveEntry sparse = new TarArchiveEntry("item", TarConstants.LF_GNUTYPE_SPARSE);
        assertTrue(sparse.isOldGNUSparse());
        assertTrue(sparse.isGNUSparse());
        assertTrue(sparse.isSparse());
        assertFalse(sparse.isPaxGNUSparse());

        TarArchiveEntry pax = new TarArchiveEntry("item", TarConstants.LF_PAX_EXTENDED_HEADER_LC);
        assertTrue(pax.isPaxHeader());
        assertFalse(pax.isGlobalPaxHeader());
        assertFalse(pax.isDirectory());
    }

    @Test
    public void testGlobalPaxFlag() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item", TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER);
        assertTrue(entry.isGlobalPaxHeader());
        assertFalse(entry.isPaxHeader());
    }

    @Test
    public void testCharacterBlockAndFifoFlags() throws Exception {
        TarArchiveEntry character = new TarArchiveEntry("item", TarConstants.LF_CHR);
        assertTrue(character.isCharacterDevice());
        assertFalse(character.isBlockDevice());

        TarArchiveEntry block = new TarArchiveEntry("item", TarConstants.LF_BLK);
        assertTrue(block.isBlockDevice());
        assertFalse(block.isCharacterDevice());

        TarArchiveEntry fifo = new TarArchiveEntry("item", TarConstants.LF_FIFO);
        assertTrue(fifo.isFIFO());
    }

    @Test
    public void testDirectoryEntriesForNameOnlyEntryAreEmpty() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("folder/");
        assertEquals(0, entry.getDirectoryEntries().length);
    }

    @Test
    public void testHeaderWriteAndParseRoundTrip() throws Exception {
        TarArchiveEntry original = new TarArchiveEntry("roundtrip");
        original.setSize(123L);
        original.setUserId(17L);
        original.setGroupId(19L);
        original.setModTime(1234000L);
        byte[] header = new byte[512];
        original.writeEntryHeader(header);

        TarArchiveEntry parsed = new TarArchiveEntry(header);
        assertEquals("roundtrip", parsed.getName());
        assertEquals(123L, parsed.getSize());
        assertEquals(17L, parsed.getLongUserId());
        assertEquals(19L, parsed.getLongGroupId());
        assertEquals(new Date(1234000L), parsed.getModTime());
        assertTrue(parsed.isCheckSumOK());
    }

    @Test
    public void testSetUserNameStoresNull() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setUserName(null);
        assertNull(entry.getUserName());
    }

    @Test
    public void testSetGroupNameStoresEmptyAndNull() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        entry.setGroupName("");
        assertEquals("", entry.getGroupName());
        entry.setGroupName(null);
        assertNull(entry.getGroupName());
    }

    @Test
    public void testIsExtendedDefaultsFalse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        assertFalse(entry.isExtended());
    }

    @Test
    public void testRealSizeDefaultsToZero() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        assertEquals(0L, entry.getRealSize());
    }

    @Test
    public void testStarSparseDefaultsFalseAndIsNotSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("item");
        assertFalse(entry.isStarSparse());
        assertFalse(entry.isSparse());
    }

    @Test
    public void testParseHeaderInitializesExtendedAndRealSizeForNonGnuHeader() throws Exception {
        TarArchiveEntry source = new TarArchiveEntry("parsed");
        source.setSize(5L);
        byte[] header = new byte[512];
        source.writeEntryHeader(header);

        TarArchiveEntry parsed = new TarArchiveEntry("before");
        parsed.parseTarHeader(header);
        assertEquals("parsed", parsed.getName());
        assertFalse(parsed.isExtended());
        assertEquals(0L, parsed.getRealSize());
    }

    @Test
    public void testParsedDirectoryNameIsNormalizedWithTrailingSlash() throws Exception {
        TarArchiveEntry source = new TarArchiveEntry("folder/");
        byte[] header = new byte[512];
        source.writeEntryHeader(header);

        TarArchiveEntry parsed = new TarArchiveEntry("before");
        parsed.parseTarHeader(header);
        assertEquals("folder/", parsed.getName());
        assertTrue(parsed.isDirectory());
        assertFalse(parsed.isExtended());
    }

    @Test
    public void testParsedRegularHeaderLeavesSparseSizeZero() throws Exception {
        TarArchiveEntry source = new TarArchiveEntry("data");
        source.setSize(17L);
        byte[] header = new byte[512];
        source.writeEntryHeader(header);

        TarArchiveEntry parsed = new TarArchiveEntry(header);
        assertEquals(17L, parsed.getSize());
        assertEquals(0L, parsed.getRealSize());
        assertFalse(parsed.isStarSparse());
    }
}
