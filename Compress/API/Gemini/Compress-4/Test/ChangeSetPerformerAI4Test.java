package org.apache.commons.compress.changes;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.junit.Assert;
import org.junit.Test;

public class ChangeSetPerformerAI4Test {

    private static class DummyArchiveEntry implements ArchiveEntry {
        private final String name;
        private final long size;
        private final boolean directory;

        public DummyArchiveEntry(String name, long size, boolean directory) {
            this.name = name;
            this.size = size;
            this.directory = directory;
        }

        public String getName() {
            return name;
        }

        public long getSize() {
            return size;
        }

        public boolean isDirectory() {
            return directory;
        }

        public Date getLastModifiedDate() {
            return new Date();
        }
    }

    private static class DummyArchiveInputStream extends ArchiveInputStream {
        private final ArchiveEntry[] entries;
        private int currentIndex = -1;

        public DummyArchiveInputStream(ArchiveEntry[] entries) {
            this.entries = entries;
        }

        public ArchiveEntry getNextEntry() throws IOException {
            currentIndex++;
            if (currentIndex < entries.length) {
                return entries[currentIndex];
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
            // no-op
        }

        public int getPutCount() {
            return putCount;
        }

        public int getCloseCount() {
            return closeCount;
        }

        public boolean isFinished() {
            return finished;
        }
    }

    @Test
    public void testPerformEmptyChangeSetAndStream() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[0]);
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(0, out.getPutCount());
    }

    @Test
    public void testPerformAddReplaceMode() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        InputStream content = new ByteArrayInputStream("data".getBytes());
        DummyArchiveEntry entryToAdd = new DummyArchiveEntry("added.txt", 4, false);
        changeSet.add(entryToAdd, content, true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[0]);
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(1, out.getPutCount());
        Assert.assertEquals(1, out.getCloseCount());
    }

    @Test
    public void testPerformAddNonReplaceMode() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        InputStream content = new ByteArrayInputStream("data".getBytes());
        DummyArchiveEntry entryToAdd = new DummyArchiveEntry("added.txt", 4, false);
        changeSet.add(entryToAdd, content, false);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[0]);
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(1, out.getPutCount());
    }

    @Test
    public void testPerformDeleteFile() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("fileToDelete.txt");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveEntry existingEntry = new DummyArchiveEntry("fileToDelete.txt", 10, false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { existingEntry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(0, out.getPutCount());
    }

    @Test
    public void testPerformDeleteDirectory() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("mydir");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveEntry subEntry = new DummyArchiveEntry("mydir/file.txt", 5, false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { subEntry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(0, out.getPutCount());
    }

    @Test
    public void testPerformDeleteDirectoryNoMatch() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("mydir");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveEntry subEntry = new DummyArchiveEntry("mydirfile.txt", 5, false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { subEntry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(1, out.getPutCount());
    }

    @Test
    public void testPerformStreamCopyAndNoDeletion() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveEntry entry = new DummyArchiveEntry("keep.txt", 5, false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { entry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(1, out.getPutCount());
    }

    @Test
    public void testPerformEntryDeletedLater() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("target.txt");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveEntry entry = new DummyArchiveEntry("target.txt", 5, false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { entry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(0, out.getPutCount());
    }

    @Test
    public void testPerformDirectoryDeletedLater() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        changeSet.delete("folder");

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveEntry entry = new DummyArchiveEntry("folder/sub.txt", 5, false);
        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[] { entry });
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        ChangeSetResults results = performer.perform(in, out);

        Assert.assertNotNull(results);
        Assert.assertTrue(out.isFinished());
        Assert.assertEquals(0, out.getPutCount());
    }

    @Test(expected = IOException.class)
    public void testPerformIOExceptionOnCopy() throws IOException {
        ChangeSet changeSet = new ChangeSet();
        InputStream badContent = new InputStream() {
            public int read() throws IOException {
                throw new IOException("Simulated read error");
            }
        };
        DummyArchiveEntry entryToAdd = new DummyArchiveEntry("bad.txt", 4, false);
        changeSet.add(entryToAdd, badContent, true);

        ChangeSetPerformer performer = new ChangeSetPerformer(changeSet);

        DummyArchiveInputStream in = new DummyArchiveInputStream(new ArchiveEntry[0]);
        DummyArchiveOutputStream out = new DummyArchiveOutputStream();

        performer.perform(in, out);
    }
}
