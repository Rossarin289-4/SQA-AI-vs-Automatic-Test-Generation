package org.apache.commons.compress.utils;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.junit.Assert;
import org.junit.Test;

public class ArchiveUtilsAI39Test {

    private static class DummyArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;
        private final boolean isDirectory;

        public DummyArchiveEntry(String name, long size, boolean isDirectory) {
            this.name = name;
            this.size = size;
            this.isDirectory = isDirectory;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public long getSize() {
            return size;
        }

        @Override
        public boolean isDirectory() {
            return isDirectory;
        }

        @Override
        public java.util.Date getLastModifiedDate() {
            return null;
        }
    }

    @Test
    public void testToStringEntry() {
        ArchiveEntry entry = new DummyArchiveEntry("main.c", 2000, false);
        String result = ArchiveUtils.toString(entry);
        Assert.assertEquals("-    2000 main.c", result);

        ArchiveEntry dirEntry = new DummyArchiveEntry("testfiles", 100, true);
        String dirResult = ArchiveUtils.toString(dirEntry);
        Assert.assertEquals("d     100 testfiles", dirResult);
    }

    @Test
    public void testMatchAsciiBuffer() {
        byte[] buffer = "hello".getBytes();
        Assert.assertTrue(ArchiveUtils.matchAsciiBuffer("hello", buffer));
        Assert.assertFalse(ArchiveUtils.matchAsciiBuffer("world", buffer));

        byte[] offsetBuffer = "xxhelloyy".getBytes();
        Assert.assertTrue(ArchiveUtils.matchAsciiBuffer("hello", offsetBuffer, 2, 5));
        Assert.assertFalse(ArchiveUtils.matchAsciiBuffer("hello", offsetBuffer, 0, 5));
    }

    @Test
    public void testToAsciiBytesAndString() {
        String testStr = "Apache Commons Compress";
        byte[] bytes = ArchiveUtils.toAsciiBytes(testStr);
        Assert.assertNotNull(bytes);
        
        String converted = ArchiveUtils.toAsciiString(bytes);
        Assert.assertEquals(testStr, converted);

        String partialConverted = ArchiveUtils.toAsciiString(bytes, 0, 6);
        Assert.assertEquals("Apache", partialConverted);
    }

    @Test
    public void testIsEqualBuffers() {
        byte[] b1 = {1, 2, 3, 4};
        byte[] b2 = {1, 2, 3, 4};
        byte[] b3 = {1, 2, 3, 5};
        byte[] b4 = {1, 2, 3};

        Assert.assertTrue(ArchiveUtils.isEqual(b1, b2));
        Assert.assertFalse(ArchiveUtils.isEqual(b1, b3));
        Assert.assertFalse(ArchiveUtils.isEqual(b1, b4));

        Assert.assertTrue(ArchiveUtils.isEqual(b1, 0, 4, b2, 0, 4));
        Assert.assertFalse(ArchiveUtils.isEqual(b1, 0, 4, b3, 0, 4));
    }

    @Test
    public void testIsEqualWithTrailingNulls() {
        byte[] b1 = {1, 2, 3, 0, 0};
        byte[] b2 = {1, 2, 3};

        Assert.assertTrue(ArchiveUtils.isEqual(b1, 0, 5, b2, 0, 3, true));
        Assert.assertTrue(ArchiveUtils.isEqual(b2, 0, 3, b1, 0, 5, true));
        Assert.assertFalse(ArchiveUtils.isEqual(b1, 0, 5, b2, 0, 3, false));

        byte[] b3 = {1, 2, 3, 1};
        Assert.assertFalse(ArchiveUtils.isEqual(b1, 0, 5, b3, 0, 4, true));
        
        byte[] b4 = {1, 2, 3, 0};
        Assert.assertTrue(ArchiveUtils.isEqualWithNull(b1, 0, 5, b4, 0, 4));
    }

    @Test
    public void testIsArrayZero() {
        byte[] zeros = {0, 0, 0, 0, 0};
        byte[] mixed = {0, 0, 1, 0, 0};

        Assert.assertTrue(ArchiveUtils.isArrayZero(zeros, 5));
        Assert.assertFalse(ArchiveUtils.isArrayZero(mixed, 5));
        Assert.assertTrue(ArchiveUtils.isArrayZero(mixed, 2));
    }

    @Test
    public void testSanitizeNormalAndControlChars() {
        String input = "file\nname\r\t.txt";
        String sanitized = ArchiveUtils.sanitize(input);
        Assert.assertEquals("file?name??.txt", sanitized);
    }

    @Test
    public void testSanitizeLongString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 300; i++) {
            sb.append('a');
        }
        String longStr = sb.toString();
        String sanitized = ArchiveUtils.sanitize(longStr);
        Assert.assertEquals(255, sanitized.length());
        Assert.assertTrue(sanitized.endsWith("..."));
    }
}
