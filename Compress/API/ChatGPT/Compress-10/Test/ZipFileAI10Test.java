package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import java.io.File;
import java.io.IOException;

public class ZipFileAI10Test {

    @Test(expected = IOException.class)
    public void testOpenNonExistentFile() throws IOException {
        new ZipFile(new File("non_existent_zip_file_12345.zip"));
    }
}
