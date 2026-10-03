package org.apache.commons.compress.changes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ChangeSetPerformerAI4Test {

    private static class DummyArchiveEntry implements ArchiveEntry {
        private final String name;
        private final boolean isDir;

        public DummyArchiveEntry(String name, boolean isDir) {
            this.name = name;
            this.isDir = isDir;
        }

        public String getName() {
            return name;
        }

        public long getSize() {
            return 0;
        }

        public booleanisDirectory() {
            return isDir;
        }

        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    private static class DummyArchiveInputStream extends ArchiveInputStream {
        private final ArchiveEntry[] entries;
        private int index = 0;

        public DummyArchiveInputStream(ArchiveEntry[] entries) {
            this.entries = entries;
        }

        public ArchiveEntry getNextEntry() throws IOException {
            if (index < entries.length) {
                return entries[index++];
            }
            return null;
        }

        public int read() throws IOException {
            return -1;
        }
    }

    private static class DummyArchiveOutputStream extends ArchiveOutputStream {
        private int putCount = 0;
        private int closeCount = 0;
        private boolean finished = false;

        public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
            putCount++;
        }

        public void closeArchiveEntry() throws IOException {
            closeCount++;
        }

        public void finish() throws IOException {
            finished = true;
        }

        public void write(int b) throws IOException {
        }
    }

    @Test
    public void testPerformAddWithReplaceMode() throws IOException {
        ChangeSet set = new ChangeSet();
        InputStream is = new ByteArrayInputStream(new byte[0]);
        ArchiveEntry entry = new DummyArchiveEntry("file1.txt", false);
        set.add(entry, is, true);

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[0]);
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertNotNull(results);
        assertTrue(results.hasBeenAdded("file1.txt"));
        assertTrue(out.finished);
    }

    @Test
    public void testPerformDeleteFile() throws IOException {
        ChangeSet set = new ChangeSet();
        set.delete("file1.txt");

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        ArchiveEntry entry = new DummyArchiveEntry("file1.txt", false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { entry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertNotNull(results);
        assertEquals(0, out.putCount);
        assertTrue(out.finished);
    }

    @Test
    public void testPerformDeleteDirectory() throws IOException {
        ChangeSet set = new ChangeSet();
        set.deleteDir("mydir");

        ChangeSetPerformer performer = new ChangeSetPerformer(set);
        ArchiveEntry entry = new DummyArchiveEntry("mydir/file1.txt", false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { entry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        assertNotNull(results);
        assertEquals(0, out.putCount);
        assertTrue(out.finished);
    }
}
