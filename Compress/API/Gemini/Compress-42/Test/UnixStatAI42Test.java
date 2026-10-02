package org.apache.commons.compress.archivers.zip;

import org.junit.Assert;
import org.junit.Test;

public class UnixStatAI42Test {

    @Test
    public void testPermMaskConstant() {
        Assert.assertEquals(07777, UnixStat.PERM_MASK);
    }

    @Test
    public void testFileTypeFlagConstant() {
        Assert.assertEquals(0170000, UnixStat.FILE_TYPE_FLAG);
    }

    @Test
    public void testLinkFlagConstant() {
        Assert.assertEquals(0120000, UnixStat.LINK_FLAG);
    }

    @Test
    public void testFileFlagConstant() {
        Assert.assertEquals(0100000, UnixStat.FILE_FLAG);
    }

    @Test
    public void testDirFlagConstant() {
        Assert.assertEquals(040000, UnixStat.DIR_FLAG);
    }

    @Test
    public void testDefaultLinkPermConstant() {
        Assert.assertEquals(0777, UnixStat.DEFAULT_LINK_PERM);
    }

    @Test
    public void testDefaultDirPermConstant() {
        Assert.assertEquals(0755, UnixStat.DEFAULT_DIR_PERM);
    }

    @Test
    public void testDefaultFilePermConstant() {
        Assert.assertEquals(0644, UnixStat.DEFAULT_FILE_PERM);
    }

    @Test
    public void testConstantsBitwiseInteractions() {
        int fileMode = UnixStat.FILE_FLAG | UnixStat.DEFAULT_FILE_PERM;
        Assert.assertEquals(UnixStat.FILE_FLAG, fileMode & UnixStat.FILE_TYPE_FLAG);
        Assert.assertEquals(UnixStat.DEFAULT_FILE_PERM, fileMode & UnixStat.PERM_MASK);

        int dirMode = UnixStat.DIR_FLAG | UnixStat.DEFAULT_DIR_PERM;
        Assert.assertEquals(UnixStat.DIR_FLAG, dirMode & UnixStat.FILE_TYPE_FLAG);
        Assert.assertEquals(UnixStat.DEFAULT_DIR_PERM, dirMode & UnixStat.PERM_MASK);

        int linkMode = UnixStat.LINK_FLAG | UnixStat.DEFAULT_LINK_PERM;
        Assert.assertEquals(UnixStat.LINK_FLAG, linkMode & UnixStat.FILE_TYPE_FLAG);
        Assert.assertEquals(UnixStat.DEFAULT_LINK_PERM, linkMode & UnixStat.PERM_MASK);
    }
}
