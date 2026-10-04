package org.apache.commons.compress.archivers.ar;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;

public class ArArchiveInputStreamTest {
    @Test
    public void testMatchesRejectsLengthsBelowEight() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[8], 7));
    }

    @Test
    public void testMatchesAcceptsExactSignatureLength() throws Exception {
        assertTrue(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesAcceptsLongerReportedLength() throws Exception {
        assertTrue(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a
        }, 9));
    }

    @Test
    public void testMatchesRejectsWrongFirstByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesRejectsWrongSecondByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0x21, 0, 0x61, 0x72, 0x63, 0x68, 0x3e, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesRejectsWrongThirdByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0, 0x72, 0x63, 0x68, 0x3e, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesRejectsWrongFourthByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0x61, 0, 0x63, 0x68, 0x3e, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesRejectsWrongFifthByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0x61, 0x72, 0, 0x68, 0x3e, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesRejectsWrongSixthByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0x61, 0x72, 0x63, 0, 0x3e, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesRejectsWrongSeventhByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0, 0x0a
        }, 8));
    }

    @Test
    public void testMatchesRejectsWrongEighthByte() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[] {
            0x21, 0x3c, 0x61, 0x72, 0x63, 0x68, 0x3e, 0
        }, 8));
    }

    @Test
    public void testMatchesRejectsZeroLength() throws Exception {
        assertFalse(ArArchiveInputStream.matches(new byte[8], 0));
    }

    @Test
    public void testReadReturnsUnsignedByte() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[] {(byte) 0xff}));
        assertEquals(255, stream.read());
    }

    @Test
    public void testReadReturnsEndOfStream() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(-1, stream.read());
    }

    @Test
    public void testReadArrayReturnsBytes() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[] {1, 2, 3}));
        byte[] result = new byte[3];
        assertEquals(3, stream.read(result));
        assertArrayEquals(new byte[] {1, 2, 3}, result);
    }

    @Test
    public void testReadArrayWithOffsetAndLength() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[] {4, 5, 6}));
        byte[] result = new byte[5];
        assertEquals(2, stream.read(result, 1, 2));
        assertArrayEquals(new byte[] {0, 4, 5, 0, 0}, result);
    }

    @Test
    public void testReadZeroLengthReturnsZero() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[] {1}));
        assertEquals(0, stream.read(new byte[1], 0, 0));
    }

    @Test
    public void testCloseCanBeCalledRepeatedly() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[0]));
        stream.close();
        stream.close();
        assertEquals(-1, stream.read());
    }

    @Test
    public void testGetNextArEntryRejectsMissingHeader() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[0]));
        try {
            stream.getNextArEntry();
            fail("expected IOException");
        } catch (IOException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testGetNextEntryRejectsMissingHeader() throws Exception {
        ArArchiveInputStream stream = new ArArchiveInputStream(
            new java.io.ByteArrayInputStream(new byte[0]));
        try {
            stream.getNextEntry();
            fail("expected IOException");
        } catch (IOException expected) {
            assertNotNull(expected);
        }
    }
}
