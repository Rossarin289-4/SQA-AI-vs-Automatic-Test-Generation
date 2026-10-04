package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.zip.CRC32;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.apache.commons.compress.utils.CharsetNames;
import org.apache.commons.compress.utils.IOUtils;

public class SevenZFileTest {
    @Test
    public void testMatchesFullSignature() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        assertTrue(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesSignatureWithLongerLength() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C, 0 };
        assertTrue(SevenZFile.matches(signature, 7));
    }

    @Test
    public void testMatchesRejectsShortLength() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        assertFalse(SevenZFile.matches(signature, 5));
    }

    @Test
    public void testMatchesRejectsLengthZero() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        assertFalse(SevenZFile.matches(signature, 0));
    }

    @Test
    public void testMatchesRejectsDifferentFirstByte() throws Exception {
        byte[] signature = { 'x', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        assertFalse(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesRejectsDifferentLastByte() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1D };
        assertFalse(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesLengthSixRequiresSixArrayBytes() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27 };
        try {
            SevenZFile.matches(signature, 6);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testMatchesNullWithShortLength() throws Exception {
        assertFalse(SevenZFile.matches(null, 5));
    }

    @Test
    public void testMatchesNullWithFullLength() throws Exception {
        try {
            SevenZFile.matches(null, 6);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testMatchesNegativeLength() throws Exception {
        assertFalse(SevenZFile.matches(new byte[0], -1));
    }

    @Test
    public void testMatchesDoesNotReadPastSignature() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        assertTrue(SevenZFile.matches(signature, Integer.MAX_VALUE));
    }

    @Test
    public void testMatchesIgnoresBytesBeyondSignature() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C, 1 };
        assertTrue(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesLengthExactlyFiveWithNull() throws Exception {
        assertFalse(SevenZFile.matches(null, 5));
    }

    @Test
    public void testMatchesLengthExactlySixWithValidSignature() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        assertTrue(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesLengthExactlySixWithMismatchInSecondByte() throws Exception {
        byte[] signature = { '7', 'x', (byte) 0xBC, (byte) 0xAF, 0x27, 0x1C };
        assertFalse(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesLengthExactlySixWithMismatchInThirdByte() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBD, (byte) 0xAF, 0x27, 0x1C };
        assertFalse(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesLengthExactlySixWithMismatchInFourthByte() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAE, 0x27, 0x1C };
        assertFalse(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesLengthExactlySixWithMismatchInFifthByte() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x26, 0x1C };
        assertFalse(SevenZFile.matches(signature, 6));
    }

    @Test
    public void testMatchesLengthGreaterThanSignatureWithShortArray() throws Exception {
        byte[] signature = { '7', 'z', (byte) 0xBC, (byte) 0xAF, 0x27 };
        try {
            SevenZFile.matches(signature, 7);
            fail("expected ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testMatchesLengthGreaterThanSignatureWithNull() throws Exception {
        try {
            SevenZFile.matches(null, 7);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }

    @Test
    public void testMatchesZeroLengthWithEmptyArray() throws Exception {
        assertFalse(SevenZFile.matches(new byte[0], 0));
    }
}
