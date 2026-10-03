package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TarArchiveOutputStreamAI18Test {

    @Test
    public void testWritePaxHeadersBasic() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("path", "testfile.txt");
        tos.writePaxHeaders("testfile.txt", headers);
        tos.close();
    }

    @Test(expected = RuntimeException.class)
    public void testBigNumberErrorModeThrowsException() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_ERROR);
        
        TarArchiveEntry entry = new TarArchiveEntry("bigsize.txt");
        entry.setSize(TarConstants.MAXSIZE + 1L);
        tos.putArchiveEntry(entry);
    }

    @Test
    public void testLongFileModeTruncate() throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        TarArchiveOutputStream tos = new TarArchiveOutputStream(bos);
        tos.setLongFileMode(TarArchiveOutputStream.LONGFILE_TRUNCATE);
        
        String longName = "a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/" +
                          "a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z/" +
                          "a/b/c/d/e/f/g/h/i/j/k/l/m/n/o/p/q/r/s/t/u/v/w/x/y/z";
        TarArchiveEntry entry = new TarArchiveEntry(longName);
        tos.putArchiveEntry(entry);
        tos.closeArchiveEntry();
        tos.finish();
    }
}
