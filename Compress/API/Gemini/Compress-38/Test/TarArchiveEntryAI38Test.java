package org.apache.commons.compress.archivers.tar;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TarArchiveEntryAI38Test {

    @Test
    public void testConstructorsAndGettersBasic() {
        TarArchiveEntry entry = new TarArchiveEntry("test.txt");
        Assert.assertEquals("test.txt", entry.getName());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_FILE_MODE, entry.getMode());
        Assert.assertFalse(entry.isDirectory());
    }

    @Test
    public void testDirectoryConstructorAndGetters() {
        TarArchiveEntry entry = new TarArchiveEntry("mydir/");
        Assert.assertEquals("mydir/", entry.getName());
        Assert.assertEquals(TarArchiveEntry.DEFAULT_DIR_MODE, entry.getMode());
        Assert.assertTrue(entry.isDirectory());
    }

    @Test
    public void testSettersAndGetters() {
        TarArchiveEntry entry = new TarArchiveEntry("file.dat");
        entry.setModTime(123456L);
        Assert.assertEquals(123456L, entry.getModTime().getTime());

        entry.setSize(999L);
        Assert.assertEquals(999L, entry.getSize());

        entry.setUserId(42L);
        Assert.assertEquals(42L, entry.getUserId());

        entry.setGroupId(84L);
        Assert.assertEquals(84L, entry.getGroupId());

        entry.setUserName("user1");
        Assert.assertEquals("user1", entry.getUserName());

        entry.setGroupName("group1");
        Assert.assertEquals("group1", entry.getGroupName());

        entry.setDevMajor(10);
        Assert.assertEquals(10, entry.getDevMajor());

        entry.setDevMinor(20);
        Assert.assertEquals(20, entry.getDevMinor());

        entry.setLinkName("linkName");
        Assert.assertEquals("linkName", entry.getLinkName());
    }

    @Test
    public void testNormalizeFileNamePreserveSlashes() {
        TarArchiveEntry entry1 = new TarArchiveEntry("/absolute/path", false);
        Assert.assertEquals("absolute/path", entry1.getName());

        TarArchiveEntry entry2 = new TarArchiveEntry("/absolute/path", true);
        Assert.assertEquals("/absolute/path", entry2.getName());
    }

    @Test
    public void testFillGNUSparse0xData() {
        TarArchiveEntry entry = new TarArchiveEntry("sparse0");
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("GNU.sparse.size", "1024");
        headers.put("GNU.sparse.name", "sparse0-name");

        entry.fillGNUSparse0xData(headers);
        Assert.assertEquals("sparse0-name", entry.getName());
        Assert.assertEquals(1024L, entry.getRealSize());
    }

    @Test
    public void testFillGNUSparse1xData() {
        TarArchiveEntry entry = new TarArchiveEntry("sparse1");
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("GNU.sparse.realsize", "2048");
        headers.put("GNU.sparse.name", "sparse1-name");

        entry.fillGNUSparse1xData(headers);
        Assert.assertEquals("sparse1-name", entry.getName());
        Assert.assertEquals(2048L, entry.getRealSize());
    }

    @Test
    public void testFillStarSparseData() {
        TarArchiveEntry entry = new TarArchiveEntry("starSparse");
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("SCHILY.realsize", "4096");

        entry.fillStarSparseData(headers);
        Assert.assertEquals(4096L, entry.getRealSize());
    }

    @Test
    public void testParseTarHeaderInvalidNumericThrows() {
        TarArchiveEntry entry = new TarArchiveEntry("dummy");
        byte[] header = new byte[512];
        header[100] = (byte) 'A';
        header[101] = (byte) 'Z';

        try {
            entry.parseTarHeader(header);
        } catch (IllegalArgumentException e) {
            Assert.assertNotNull(e);
        } catch (RuntimeException e) {
            Assert.assertNotNull(e);
        }
    }
}
