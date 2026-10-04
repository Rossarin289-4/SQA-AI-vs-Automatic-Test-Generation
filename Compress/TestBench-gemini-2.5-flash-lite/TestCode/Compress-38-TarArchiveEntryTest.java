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



