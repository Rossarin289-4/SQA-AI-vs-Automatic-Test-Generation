package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnixStatAI42Test {

    @Test
    public void testConstantsValues() {
        assertEquals(07777, UnixStat.PERM_MASK);
        assertEquals(0170000, UnixStat.FILE_TYPE_FLAG);
        assertEquals(0120000, UnixStat.LINK_FLAG);
        assertEquals(0100000, UnixStat.FILE_FLAG);
        assertEquals(040000, UnixStat.DIR_FLAG);
    }

    @Test
    public void testDefaultPermissions() {
        assertEquals(0777, UnixStat.DEFAULT_LINK_PERM);
        assertEquals(0755, UnixStat.DEFAULT_DIR_PERM);
        assertEquals(0644, UnixStat.DEFAULT_FILE_PERM);
    }
}
