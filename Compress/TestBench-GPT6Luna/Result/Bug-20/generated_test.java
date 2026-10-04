package org.apache.commons.compress.archivers.cpio;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;

public class CpioArchiveInputStreamTest {
    @Test
    public void testMatchesAsciiMagicValues() throws Exception {
        assertTrue(CpioArchiveInputStream.matches(ArchiveUtils.toAsciiBytes("070701"), 6));
        assertTrue(CpioArchiveInputStream.matches(ArchiveUtils.toAsciiBytes("070702"), 6));
        assertTrue(CpioArchiveInputStream.matches(ArchiveUtils.toAsciiBytes("070707"), 6));
    }

    @Test
    public void testMatchesRejectsShortSignatureAtLengthFive() throws Exception {
        assertFalse(CpioArchiveInputStream.matches(ArchiveUtils.toAsciiBytes("070701"), 5));
    }

    @Test
    public void testMatchesAcceptsLengthSixBoundary() throws Exception {
        assertTrue(CpioArchiveInputStream.matches(ArchiveUtils.toAsciiBytes("070701"), 6));
    }

    @Test
    public void testMatchesRejectsUnsupportedLastByte() throws Exception {
        assertFalse(CpioArchiveInputStream.matches(ArchiveUtils.toAsciiBytes("070703"), 6));
    }

    @Test
    public void testMatchesRejectsWrongAsciiPrefix() throws Exception {
        assertFalse(CpioArchiveInputStream.matches(ArchiveUtils.toAsciiBytes("080701"), 6));
    }

    @Test
    public void testMatchesAcceptsBinaryMagicInEitherByteOrder() throws Exception {
        assertTrue(CpioArchiveInputStream.matches(new byte[] {0x71, (byte) 0xc7, 0, 0, 0, 0}, 6));
        assertTrue(CpioArchiveInputStream.matches(new byte[] {(byte) 0xc7, 0x71, 0, 0, 0, 0}, 6));
    }

    @Test
    public void testMatchesRequiresBothBytesOfBinaryMagic() throws Exception {
        assertFalse(CpioArchiveInputStream.matches(new byte[] {0x71, 0, 0, 0, 0, 0}, 6));
    }

    @Test
    public void testAvailableBeforeAndAfterClosingEntryData() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(1, in.available());
        in.close();
        try {
            in.available();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }

    @Test
    public void testReadZeroLengthReturnsZeroWithoutAnEntry() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0, in.read(new byte[1], 0, 0));
    }

    @Test
    public void testReadRejectsNegativeOffset() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        try {
            in.read(new byte[1], -1, 1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            assertEquals(-1, in.read(new byte[1], 0, 1));
        }
    }

    @Test
    public void testReadRejectsRangePastArrayEnd() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        try {
            in.read(new byte[1], 1, 1);
            fail("expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
            assertEquals(0, in.read(new byte[1], 1, 0));
        }
    }

    @Test
    public void testSkipRejectsNegativeLength() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        try {
            in.skip(-1);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(0L, in.skip(0));
        }
    }

    @Test
    public void testSkipZeroAtStartReturnsZero() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        assertEquals(0L, in.skip(0));
    }

    @Test
    public void testNextEntryAtEmptyInputThrowsEof() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        try {
            in.getNextEntry();
            fail("expected EOFException");
        } catch (EOFException expected) {
            assertEquals(0L, in.getBytesRead());
        }
    }

    @Test
    public void testCloseCanBeCalledMoreThanOnce() throws Exception {
        CpioArchiveInputStream in = new CpioArchiveInputStream(new java.io.ByteArrayInputStream(new byte[0]));
        in.close();
        in.close();
        try {
            in.available();
            fail("expected IOException");
        } catch (IOException expected) {
            assertEquals("Stream closed", expected.getMessage());
        }
    }
}
