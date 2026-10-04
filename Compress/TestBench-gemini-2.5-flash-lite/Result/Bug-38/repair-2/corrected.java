package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.utils.ArchiveUtils;
import java.nio.ByteBuffer;

public class TarArchiveEntryTest {

    @Test
    public void testDefaultConstructor() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("");
        assertEquals("", entry.getName());
        assertFalse(entry.isDirectory());
        assertFalse(entry.isFile());
        assertFalse(entry.isSymbolicLink());
        assertFalse(entry.isLink());
        assertFalse(entry.isCharacterDevice());
        assertFalse(entry.isBlockDevice());
        assertFalse(entry.isFIFO());
        assertFalse(entry.isSparse());
        assertFalse(entry.isPaxHeader());
        assertFalse(entry.isGlobalPaxHeader());
        assertFalse(entry.isExtended());
        assertFalse(entry.isGNULongLinkEntry());
        assertFalse(entry.isGNULongNameEntry());
        assertFalse(entry.isOldGNUSparse());
        assertFalse(entry.isPaxGNUSparse());
        assertFalse(entry.isStarSparse());
        assertEquals(TarConstants.DEFAULT_FILE_MODE, entry.getMode());
        assertEquals(TarConstants.MAGIC_POSIX, entry.magic);
        assertEquals(TarConstants.VERSION_POSIX, entry.version);
        assertEquals(0, entry.getSize());
        assertEquals(0, entry.getLongUserId());
        assertEquals(0, entry.getLongGroupId());
        assertEquals("", entry.getUserName());
        assertEquals("", entry.getGroupName());
        assertEquals("", entry.getLinkName());
        assertEquals(0, entry.getDevMajor());
        assertEquals(0, entry.getDevMinor());
    }

    @Test
    public void testConstructorWithName() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("my/file.txt");
        assertEquals("my/file.txt", entry.getName());
        assertEquals(TarConstants.DEFAULT_FILE_MODE, entry.getMode());
        assertEquals(TarConstants.LF_NORMAL, entry.linkFlag);
    }

    @Test
    public void testConstructorWithNameAndBoolean() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("my/file.txt", true);
        assertEquals("my/file.txt", entry.getName());
        assertEquals(TarConstants.DEFAULT_FILE_MODE, entry.getMode());
        assertEquals(TarConstants.LF_NORMAL, entry.linkFlag);
    }

    @Test
    public void testConstructorWithNameAndLinkFlag() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("my/link", TarConstants.LF_LINK);
        assertEquals("my/link", entry.getName());
        assertEquals(TarConstants.LF_LINK, entry.linkFlag);
    }

    @Test
    public void testConstructorWithNameLinkFlagAndBoolean() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("my/link", TarConstants.LF_LINK, true);
        assertEquals("my/link", entry.getName());
        assertEquals(TarConstants.LF_LINK, entry.linkFlag);
        assertEquals(TarConstants.LF_LINK, entry.linkFlag);
    }

    @Test
    public void testConstructorWithFile() throws Exception {
        File file = new File("test.txt") {
            @Override
            public boolean isDirectory() {
                return false;
            }
            @Override
            public long length() {
                return 100L;
            }
            @Override
            public String getPath() {
                return "test.txt";
            }
            @Override
            public long lastModified() {
                return 1234567890000L;
            }
        };
        TarArchiveEntry entry = new TarArchiveEntry(file);
        assertEquals("test.txt", entry.getName());
        assertEquals(100L, entry.getSize());
        assertEquals(TarConstants.DEFAULT_FILE_MODE, entry.getMode());
        assertEquals(TarConstants.LF_NORMAL, entry.linkFlag);
        assertEquals(1234567890L, entry.modTime);
        assertEquals(file, entry.getFile());
    }
    
    @Test
    public void testConstructorWithFileAndFileName() throws Exception {
        File file = new File("test.txt") {
            @Override
            public boolean isDirectory() {
                return false;
            }
            @Override
            public long length() {
                return 100L;
            }
            @Override
            public String getPath() {
                return "test.txt";
            }
            @Override
            public long lastModified() {
                return 1234567890000L;
            }
        };
        TarArchiveEntry entry = new TarArchiveEntry(file, "custom_name.txt");
        assertEquals("custom_name.txt", entry.getName());
        assertEquals(100L, entry.getSize());
        assertEquals(TarConstants.DEFAULT_FILE_MODE, entry.getMode());
        assertEquals(TarConstants.LF_NORMAL, entry.linkFlag);
        assertEquals(1234567890L, entry.modTime);
        assertEquals(file, entry.getFile());
    }

    @Test
    public void testConstructorWithFileAsDirectory() throws Exception {
        File dir = new File("test_dir") {
            @Override
            public boolean isDirectory() {
                return true;
            }
            @Override
            public String getPath() {
                return "test_dir";
            }
            @Override
            public long lastModified() {
                return 1234567890000L;
            }
        };
        TarArchiveEntry entry = new TarArchiveEntry(dir);
        assertEquals("test_dir/", entry.getName());
        assertEquals(TarConstants.DEFAULT_DIR_MODE, entry.getMode());
        assertEquals(TarConstants.LF_DIR, entry.linkFlag);
        assertEquals(dir, entry.getFile());
    }
    
    @Test
    public void testConstructorWithFileAsDirectoryAndFileName() throws Exception {
        File dir = new File("test_dir") {
            @Override
            public boolean isDirectory() {
                return true;
            }
            @Override
            public String getPath() {
                return "test_dir";
            }
            @Override
            public long lastModified() {
                return 1234567890000L;
            }
        };
        TarArchiveEntry entry = new TarArchiveEntry(dir, "custom_dir_name");
        assertEquals("custom_dir_name/", entry.getName());
        assertEquals(TarConstants.DEFAULT_DIR_MODE, entry.getMode());
        assertEquals(TarConstants.LF_DIR, entry.linkFlag);
        assertEquals(dir, entry.getFile());
    }

    @Test
    public void testConstructorWithHeaderBytes() throws Exception {
        byte[] header = new byte[512]; // Standard tar header size
        TarUtils.formatNameBytes("test.txt", header, 0, TarConstants.NAMELEN);
        TarUtils.formatLongOctalBytes(0100644, header, TarConstants.MODELEN, TarConstants.MODELEN); // mode
        TarUtils.formatLongOctalBytes(0, header, TarConstants.UIDLEN, TarConstants.UIDLEN); // uid
        TarUtils.formatLongOctalBytes(0, header, TarConstants.GIDLEN, TarConstants.GIDLEN); // gid
        TarUtils.formatLongOctalBytes(100, header, TarConstants.SIZELEN, TarConstants.SIZELEN); // size
        TarUtils.formatLongOctalBytes(System.currentTimeMillis() / TarConstants.MILLIS_PER_SECOND, header, TarConstants.MODTIMELEN, TarConstants.MODTIMELEN); // mtime
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUMLEN + i] = (byte) ' ';
        }
        header[TarConstants.OFFSET + TarConstants.CHKSUMLEN] = TarConstants.LF_NORMAL; // linkflag

        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, TarConstants.CHKSUMLEN, TarConstants.CHKSUMLEN);

        TarArchiveEntry entry = new TarArchiveEntry(header);
        assertEquals("test.txt", entry.getName());
        assertEquals(100L, entry.getSize());
        assertTrue(entry.isCheckSumOK());
    }

    @Test
    public void testEqualsAndHashCode() throws Exception {
        TarArchiveEntry entry1 = new TarArchiveEntry("file1.txt");
        TarArchiveEntry entry2 = new TarArchiveEntry("file1.txt");
        TarArchiveEntry entry3 = new TarArchiveEntry("file2.txt");

        assertTrue(entry1.equals(entry2));
        assertFalse(entry1.equals(entry3));
        assertEquals(entry1.hashCode(), entry2.hashCode());
        assertNotEquals(entry1.hashCode(), entry3.hashCode());
    }

    @Test
    public void testIsDescendent() throws Exception {
        TarArchiveEntry parent = new TarArchiveEntry("parent/");
        TarArchiveEntry child = new TarArchiveEntry("parent/child");
        TarArchiveEntry sibling = new TarArchiveEntry("sibling");

        assertTrue(parent.isDescendent(child));
        assertFalse(parent.isDescendent(sibling));
        assertFalse(child.isDescendent(parent));
    }

    @Test
    public void testSetName() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("oldname");
        entry.setName("newname");
        assertEquals("newname", entry.getName());
    }

    @Test
    public void testSetMode() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setMode(0755);
        assertEquals(0755, entry.getMode());
    }

    @Test
    public void testSetLinkName() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("file");
        entry.setLinkName("linktarget");
        assertEquals("linktarget", entry.getLinkName());
    }

    @Test
    public void testSetUserIdAndGetUserId() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setUserId(1001);
        assertEquals(1001, entry.getLongUserId());
        assertEquals(1001, entry.getUserId());
    }
    
    @Test
    public void testSetUserIdInt() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setUserId(2000);
        assertEquals(2000, entry.getLongUserId());
    }

    @Test
    public void testSetGroupIdAndGetGroupId() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setGroupId(2001);
        assertEquals(2001, entry.getLongGroupId());
        assertEquals(2001, entry.getGroupId());
    }
    
    @Test
    public void testSetGroupIdInt() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setGroupId(3000);
        assertEquals(3000, entry.getLongGroupId());
    }

    @Test
    public void testSetUserName() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setUserName("testuser");
        assertEquals("testuser", entry.getUserName());
    }

    @Test
    public void testSetGroupName() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setGroupName("testgroup");
        assertEquals("testgroup", entry.getGroupName());
    }

    @Test
    public void testSetIds() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setIds(100, 200);
        assertEquals(100, entry.getLongUserId());
        assertEquals(200, entry.getLongGroupId());
    }

    @Test
    public void testSetNames() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setNames("user1", "group1");
        assertEquals("user1", entry.getUserName());
        assertEquals("group1", entry.getGroupName());
    }

    @Test
    public void testSetModTimeMillis() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        long timeMillis = System.currentTimeMillis();
        entry.setModTime(timeMillis);
        assertEquals(timeMillis / TarConstants.MILLIS_PER_SECOND, entry.modTime);
    }
    
    @Test
    public void testGetModTime() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        long timeMillis = System.currentTimeMillis();
        entry.setModTime(timeMillis);
        assertEquals(new Date(timeMillis), entry.getModTime());
    }

    @Test
    public void testGetLastModifiedDate() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        long timeMillis = System.currentTimeMillis();
        entry.setModTime(timeMillis);
        assertEquals(new Date(timeMillis), entry.getLastModifiedDate());
    }

    @Test
    public void testIsCheckSumOK() throws Exception {
        byte[] header = new byte[512];
        TarUtils.formatNameBytes("test.txt", header, 0, TarConstants.NAMELEN);
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUMLEN + i] = (byte) ' ';
        }
        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, TarConstants.CHKSUMLEN, TarConstants.CHKSUMLEN);

        TarArchiveEntry entry = new TarArchiveEntry(header);
        assertTrue(entry.isCheckSumOK());
    }

    @Test
    public void testGetFile() throws Exception {
        File file = new File("a_file.txt");
        TarArchiveEntry entry = new TarArchiveEntry(file);
        assertEquals(file, entry.getFile());
    }

    @Test
    public void testGetMode() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setMode(0777);
        assertEquals(0777, entry.getMode());
    }

    @Test
    public void testGetSize() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setSize(12345L);
        assertEquals(12345L, entry.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSizeNegative() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setSize(-100L);
    }

    @Test
    public void testGetDevMajorAndSetDevMajor() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setDevMajor(5);
        assertEquals(5, entry.getDevMajor());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMajorNegative() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setDevMajor(-1);
    }

    @Test
    public void testGetDevMinorAndSetDevMinor() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setDevMinor(10);
        assertEquals(10, entry.getDevMinor());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSetDevMinorNegative() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.setDevMinor(-1);
    }

    @Test
    public void testIsExtended() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        assertFalse(entry.isExtended());
    }

    @Test
    public void testGetRealSize() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.realSize = 5000L; // Accessing package-private field directly for test setup
        assertEquals(5000L, entry.getRealSize());
    }

    @Test
    public void testIsGNUSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.linkFlag = TarConstants.LF_GNUTYPE_SPARSE; // Accessing package-private field directly for test setup
        assertTrue(entry.isGNUSparse());

        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        entry.paxGNUSparse = true; // Accessing package-private field directly for test setup
        assertTrue(entry.isGNUSparse());
    }
    
    @Test
    public void testIsOldGNUSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.linkFlag = TarConstants.LF_GNUTYPE_SPARSE; // Accessing package-private field directly for test setup
        assertTrue(entry.isOldGNUSparse());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isOldGNUSparse());
    }
    
    @Test
    public void testIsPaxGNUSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.paxGNUSparse = true; // Accessing package-private field directly for test setup
        assertTrue(entry.isPaxGNUSparse());
        entry.paxGNUSparse = false; // Accessing package-private field directly for test setup
        assertFalse(entry.isPaxGNUSparse());
    }
    
    @Test
    public void testIsStarSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.starSparse = true; // Accessing package-private field directly for test setup
        assertTrue(entry.isStarSparse());
        entry.starSparse = false; // Accessing package-private field directly for test setup
        assertFalse(entry.isStarSparse());
    }

    @Test
    public void testIsGNULongLinkEntry() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.linkFlag = TarConstants.LF_GNUTYPE_LONGLINK; // Accessing package-private field directly for test setup
        assertTrue(entry.isGNULongLinkEntry());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isGNULongLinkEntry());
    }

    @Test
    public void testIsGNULongNameEntry() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.linkFlag = TarConstants.LF_GNUTYPE_LONGNAME; // Accessing package-private field directly for test setup
        assertTrue(entry.isGNULongNameEntry());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isGNULongNameEntry());
    }

    @Test
    public void testIsPaxHeader() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.linkFlag = TarConstants.LF_PAX_EXTENDED_HEADER_LC; // Accessing package-private field directly for test setup
        assertTrue(entry.isPaxHeader());
        entry.linkFlag = TarConstants.LF_PAX_EXTENDED_HEADER_UC; // Accessing package-private field directly for test setup
        assertTrue(entry.isPaxHeader());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isPaxHeader());
    }
    
    @Test
    public void testIsGlobalPaxHeader() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test");
        entry.linkFlag = TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER; // Accessing package-private field directly for test setup
        assertTrue(entry.isGlobalPaxHeader());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isGlobalPaxHeader());
    }

    @Test
    public void testIsDirectory() throws Exception {
        TarArchiveEntry dirEntry = new TarArchiveEntry("dir/");
        assertTrue(dirEntry.isDirectory());

        TarArchiveEntry fileEntry = new TarArchiveEntry("file");
        assertFalse(fileEntry.isDirectory());
    }
    
    @Test
    public void testIsDirectoryWithFile() throws Exception {
        File dirFile = new File("test_dir") {
            @Override
            public boolean isDirectory() { return true; }
            @Override
            public String getPath() { return "test_dir"; }
        };
        TarArchiveEntry entry = new TarArchiveEntry(dirFile);
        assertTrue(entry.isDirectory());
        
        File fileFile = new File("test_file") {
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public String getPath() { return "test_file"; }
        };
        TarArchiveEntry entry2 = new TarArchiveEntry(fileFile);
        assertFalse(entry2.isDirectory());
    }

    @Test
    public void testIsFile() throws Exception {
        TarArchiveEntry fileEntry = new TarArchiveEntry("file");
        assertTrue(fileEntry.isFile());

        TarArchiveEntry dirEntry = new TarArchiveEntry("dir/");
        assertFalse(dirEntry.isFile());
    }
    
    @Test
    public void testIsFileWithFile() throws Exception {
        File fileFile = new File("test_file") {
            @Override
            public boolean isFile() { return true; }
            @Override
            public boolean isDirectory() { return false; }
            @Override
            public String getPath() { return "test_file"; }
        };
        TarArchiveEntry entry = new TarArchiveEntry(fileFile);
        assertTrue(entry.isFile());
        
        File dirFile = new File("test_dir") {
            @Override
            public boolean isFile() { return false; }
            @Override
            public boolean isDirectory() { return true; }
            @Override
            public String getPath() { return "test_dir"; }
        };
        TarArchiveEntry entry2 = new TarArchiveEntry(dirFile);
        assertFalse(entry2.isFile());
    }

    @Test
    public void testIsSymbolicLink() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("symlink", TarConstants.LF_SYMLINK);
        assertTrue(entry.isSymbolicLink());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isSymbolicLink());
    }

    @Test
    public void testIsLink() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("link", TarConstants.LF_LINK);
        assertTrue(entry.isLink());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isLink());
    }

    @Test
    public void testIsCharacterDevice() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("chardev", TarConstants.LF_CHR);
        assertTrue(entry.isCharacterDevice());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isCharacterDevice());
    }

    @Test
    public void testIsBlockDevice() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("blockdev", TarConstants.LF_BLK);
        assertTrue(entry.isBlockDevice());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isBlockDevice());
    }

    @Test
    public void testIsFIFO() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("fifo", TarConstants.LF_FIFO);
        assertTrue(entry.isFIFO());
        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        assertFalse(entry.isFIFO());
    }

    @Test
    public void testIsSparse() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("sparse");
        entry.linkFlag = TarConstants.LF_GNUTYPE_SPARSE; // Accessing package-private field directly for test setup
        assertTrue(entry.isSparse());

        entry.linkFlag = TarConstants.LF_NORMAL; // Accessing package-private field directly for test setup
        entry.starSparse = true; // Accessing package-private field directly for test setup
        assertTrue(entry.isSparse());
    }

    @Test
    public void testGetDirectoryEntries() throws Exception {
        File mockDir = new File("mock_dir") {
            @Override
            public boolean isDirectory() { return true; }
            @Override
            public String[] list() {
                return new String[]{"file1.txt", "subdir", "file2.log"};
            }
            @Override
            public File getAbsoluteFile() { return this; }
            @Override
            public File getParentFile() { return null; }
        };

        TarArchiveEntry dirEntry = new TarArchiveEntry(mockDir);
        TarArchiveEntry[] entries = dirEntry.getDirectoryEntries();

        assertEquals(3, entries.length);
        assertEquals("mock_dir/file1.txt", entries[0].getName());
        assertEquals("mock_dir/subdir", entries[1].getName());
        assertEquals("mock_dir/file2.log", entries[2].getName());
    }
    
    @Test
    public void testGetDirectoryEntriesNonDirectory() throws Exception {
        File mockFile = new File("mock_file") {
            @Override
            public boolean isDirectory() { return false; }
        };
        TarArchiveEntry entry = new TarArchiveEntry(mockFile);
        TarArchiveEntry[] entries = entry.getDirectoryEntries();
        assertEquals(0, entries.length);
    }
    
    @Test
    public void testGetDirectoryEntriesNullList() throws Exception {
        File mockDir = new File("mock_dir") {
            @Override
            public boolean isDirectory() { return true; }
            @Override
            public String[] list() { return null; }
        };
        TarArchiveEntry dirEntry = new TarArchiveEntry(mockDir);
        TarArchiveEntry[] entries = dirEntry.getDirectoryEntries();
        assertEquals(0, entries.length);
    }

    @Test
    public void testWriteEntryHeader() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("test_file.txt");
        entry.setSize(1024);
        entry.setMode(0644);
        entry.setUserId(1000);
        entry.setGroupId(2000);
        entry.setModTime(new Date(1678886400000L));

        byte[] outbuf = new byte[512];
        entry.writeEntryHeader(outbuf);

        String name = TarUtils.parseName(outbuf, 0, TarConstants.NAMELEN);
        assertEquals("test_file.txt", name);

        long size = TarUtils.parseOctalOrBinary(outbuf, TarConstants.SIZELEN, TarConstants.SIZELEN);
        assertEquals(1024, size);

        int mode = (int) TarUtils.parseOctalOrBinary(outbuf, TarConstants.MODELEN, TarConstants.MODELEN);
        assertEquals(0644, mode);
        
        long mtime = TarUtils.parseOctalOrBinary(outbuf, TarConstants.MODTIMELEN, TarConstants.MODTIMELEN);
        assertEquals(1678886400L, mtime);
    }
    
    @Test
    public void testWriteEntryHeaderWithStarMode() throws Exception {
        TarArchiveEntry entry = new TarArchiveEntry("large_file.bin");
        entry.setSize(Long.MAX_VALUE);
        entry.setUserId(Integer.MAX_VALUE + 1L);
        entry.setGroupId(Integer.MAX_VALUE + 1L);

        byte[] outbuf = new byte[512];
        entry.writeEntryHeader(outbuf, TarUtils.DEFAULT_ENCODING, true);

        long sizeField = TarUtils.parseOctalOrBinary(outbuf, TarConstants.SIZELEN, TarConstants.SIZELEN);
        // With starMode, large values might be represented differently. We check that it's not zero, as a simple octal zero would be incorrect.
        // Exact value depends on TarUtils.formatLongOctalOrBinaryBytes implementation for binary representation.
        // A basic check is that it's not the default zero if the size is non-zero.
        assertNotEquals(0, sizeField); 
    }
    
    @Test
    public void testParseTarHeader() throws Exception {
        byte[] header = new byte[512];
        TarUtils.formatNameBytes("parsed_file.txt", header, 0, TarConstants.NAMELEN);
        TarUtils.formatLongOctalBytes(0100755, header, TarConstants.MODELEN, TarConstants.MODELEN);
        TarUtils.formatLongOctalBytes(100, header, TarConstants.UIDLEN, TarConstants.UIDLEN);
        TarUtils.formatLongOctalBytes(200, header, TarConstants.GIDLEN, TarConstants.GIDLEN);
        TarUtils.formatLongOctalBytes(2048, header, TarConstants.SIZELEN, TarConstants.SIZELEN);
        long modTimeVal = System.currentTimeMillis() / TarConstants.MILLIS_PER_SECOND;
        TarUtils.formatLongOctalBytes(modTimeVal, header, TarConstants.MODTIMELEN, TarConstants.MODTIMELEN);
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUMLEN + i] = (byte) ' ';
        }
        header[TarConstants.OFFSET + TarConstants.CHKSUMLEN] = TarConstants.LF_NORMAL;
        
        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, TarConstants.CHKSUMLEN, TarConstants.CHKSUMLEN);

        TarArchiveEntry entry = new TarArchiveEntry();
        entry.parseTarHeader(header);

        assertEquals("parsed_file.txt", entry.getName());
        assertEquals(0100755, entry.getMode());
        assertEquals(100L, entry.getLongUserId());
        assertEquals(200L, entry.getLongGroupId());
        assertEquals(2048L, entry.getSize());
        assertEquals(modTimeVal, entry.modTime);
        assertTrue(entry.isCheckSumOK());
    }
    
    @Test
    public void testParseTarHeaderWithLongName() throws Exception {
        byte[] header = new byte[512];
        String longName = "a_very_long_filename_that_should_exceed_the_standard_100_byte_limit_for_names";
        
        // Truncate name to NAMELEN to simulate how it would be stored in a standard tar header
        String truncatedName = longName.substring(0, TarConstants.NAMELEN);
        TarUtils.formatNameBytes(truncatedName, header, 0, TarConstants.NAMELEN);

        TarUtils.formatLongOctalBytes(0, header, TarConstants.MODELEN, TarConstants.MODELEN);
        TarUtils.formatLongOctalBytes(0, header, TarConstants.UIDLEN, TarConstants.UIDLEN);
        TarUtils.formatLongOctalBytes(0, header, TarConstants.GIDLEN, TarConstants.GIDLEN);
        TarUtils.formatLongOctalBytes(0, header, TarConstants.SIZELEN, TarConstants.SIZELEN);
        TarUtils.formatLongOctalBytes(0, header, TarConstants.MODTIMELEN, TarConstants.MODTIMELEN);
        for (int i = 0; i < TarConstants.CHKSUMLEN; i++) {
            header[TarConstants.CHKSUMLEN + i] = (byte) ' ';
        }
        header[TarConstants.OFFSET + TarConstants.CHKSUMLEN] = TarConstants.LF_NORMAL;
        long chk = TarUtils.computeCheckSum(header);
        TarUtils.formatCheckSumOctalBytes(chk, header, TarConstants.CHKSUMLEN, TarConstants.CHKSUMLEN);

        TarArchiveEntry entry = new TarArchiveEntry();
        entry.parseTarHeader(header);
        
        // The parser should return the name as it was written, even if it's long.
        // The actual handling of names longer than NAMELEN is typically done via extensions (like GNU longname).
        // For standard parsing, it just reads what's there.
        assertEquals(truncatedName, entry.getName()); 
    }
    
    @Test
    public void testNormalizeFileNameWindowsDriveLetter() throws Exception {
        String originalOsName = System.getProperty("os.name");
        System.setProperty("os.name", "Windows 10");
        
        assertEquals("my/path", TarArchiveEntry.normalizeFileName("C:/my/path", false));
        assertEquals("my/path", TarArchiveEntry.normalizeFileName("c:\\my\\path", false));
        assertEquals("/my/path", TarArchiveEntry.normalizeFileName("C:/my/path", true));
        
        System.setProperty("os.name", originalOsName);
    }
    
    @Test
    public void testNormalizeFileNameUnixPath() throws Exception {
        String originalOsName = System.getProperty("os.name");
        System.setProperty("os.name", "Linux");
        
        assertEquals("my/path", TarArchiveEntry.normalizeFileName("/my/path", false));
        assertEquals("/my/path", TarArchiveEntry.normalizeFileName("/my/path", true));
        assertEquals("my/path", TarArchiveEntry.normalizeFileName("my/path", false));
        
        System.setProperty("os.name", originalOsName);
    }

    @Test
    public void testNormalizeFileNameNetwareDriveLetter() throws Exception {
        String originalOsName = System.getProperty("os.name");
        System.setProperty("os.name", "Netware");
        
        assertEquals("my/path", TarArchiveEntry.normalizeFileName("vol1:my/path", false));
        assertEquals("my/path", TarArchiveEntry.normalizeFileName("VOL1:my\\path", false));
        
        System.setProperty("os.name", originalOsName);
    }
    
    @Test
    public void testNormalizeFileNameMultipleSlashes() throws Exception {
        assertEquals("my/path", TarArchiveEntry.normalizeFileName("//my//path", false));
        assertEquals("//my//path", TarArchiveEntry.normalizeFileName("//my//path", true));
    }
    
    @Test
    public void testNormalizeFileNameEmpty() throws Exception {
        assertEquals("", TarArchiveEntry.normalizeFileName("", false));
        assertEquals("", TarArchiveEntry.normalizeFileName("", true));
    }
    
    @Test
    public void testFillGNUSparse0xData() throws Exception {
        Map<String, String> headers = new HashMap<>();
        headers.put("GNU.sparse.size", "4096");
        headers.put("GNU.sparse.name", "sparse_file.data");

        TarArchiveEntry entry = new TarArchiveEntry("original_name");
        entry.fillGNUSparse0xData(headers);

        assertTrue(entry.isPaxGNUSparse());
        assertEquals(4096L, entry.getRealSize());
        assertEquals("sparse_file.data", entry.getName());
    }

    @Test
    public void testFillGNUSparse1xData() throws Exception {
        Map<String, String> headers = new HashMap<>();
        headers.put("GNU.sparse.realsize", "8192");
        headers.put("GNU.sparse.name", "sparse_file_v1.data");

        TarArchiveEntry entry = new TarArchiveEntry("original_name");
        entry.fillGNUSparse1xData(headers);

        assertTrue(entry.isPaxGNUSparse());
        assertEquals(8192L, entry.getRealSize());
        assertEquals("sparse_file_v1.data", entry.getName());
    }

    @Test
    public void testFillStarSparseData() throws Exception {
        Map<String, String> headers = new HashMap<>();
        headers.put("SCHILY.realsize", "16384");

        TarArchiveEntry entry = new TarArchiveEntry("original_name");
        entry.fillStarSparseData(headers);

        assertTrue(entry.isStarSparse());
        assertEquals(16384L, entry.getRealSize());
        assertEquals("original_name", entry.getName());
    }
}
