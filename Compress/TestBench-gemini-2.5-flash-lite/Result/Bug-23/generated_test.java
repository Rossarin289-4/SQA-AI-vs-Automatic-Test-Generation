package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;
import org.tukaani.xz.LZMAInputStream;

public class CodersTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testAddDecoder_Copy() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[]{1, 2, 3});
        Coder coder = new Coder(); // Dummy coder, properties not used by CopyDecoder
        byte[] password = null;
        InputStream decodedStream = Coders.addDecoder(in, coder, password);
        // CopyDecoder should return the original stream
        assertSame(in, decodedStream);
    }

    @Test
    public void testAddEncoder_Copy() throws Exception {
        OutputStream out = new java.io.ByteArrayOutputStream();
        SevenZMethod method = SevenZMethod.COPY;
        byte[] password = null;
        OutputStream encodedStream = Coders.addEncoder(out, method, password);
        // CopyEncoder should return the original stream
        assertSame(out, encodedStream);
    }

    @Test
    public void testAddDecoder_LZMA() throws Exception {
        byte[] props = new byte[5];
        props[0] = 1; // lc = 1
        long dictSize = 1024; // 1KiB
        props[1] = (byte) (dictSize & 0xff);
        props[2] = (byte) ((dictSize >> 8) & 0xff);
        props[3] = (byte) ((dictSize >> 16) & 0xff);
        props[4] = (byte) ((dictSize >> 24) & 0xff);

        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.properties = props;
        byte[] password = null;
        InputStream decodedStream = Coders.addDecoder(in, coder, password);
        assertTrue(decodedStream instanceof LZMAInputStream);
    }

    @Test
    public void testAddDecoder_LZMA_LargeDictSize() throws Exception {
        byte[] props = new byte[5];
        props[0] = 1;
        long dictSize = LZMAInputStream.DICT_SIZE_MAX + 1; // Larger than maximum
        props[1] = (byte) (dictSize & 0xff);
        props[2] = (byte) ((dictSize >> 8) & 0xff);
        props[3] = (byte) ((dictSize >> 16) & 0xff);
        props[4] = (byte) ((dictSize >> 24) & 0xff);

        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.properties = props;
        byte[] password = null;

        try {
            Coders.addDecoder(in, coder, password);
            fail("Expected IOException for dictionary larger than maximum size");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Dictionary larger than 4GiB maximum size"));
        }
    }

    @Test
    public void testAddDecoder_Deflate() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.DEFLATE.getId();
        byte[] password = null;
        InputStream decodedStream = Coders.addDecoder(in, coder, password);
        assertTrue(decodedStream instanceof InflaterInputStream);
    }

    @Test
    public void testAddEncoder_Deflate() throws Exception {
        OutputStream out = new java.io.ByteArrayOutputStream();
        SevenZMethod method = SevenZMethod.DEFLATE;
        byte[] password = null;
        OutputStream encodedStream = Coders.addEncoder(out, method, password);
        assertTrue(encodedStream instanceof DeflaterOutputStream);
    }

    @Test
    public void testAddDecoder_BZIP2() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.BZIP2.getId();
        byte[] password = null;
        InputStream decodedStream = Coders.addDecoder(in, coder, password);
        assertTrue(decodedStream instanceof BZip2CompressorInputStream);
    }

    @Test
    public void testAddEncoder_BZIP2() throws Exception {
        OutputStream out = new java.io.ByteArrayOutputStream();
        SevenZMethod method = SevenZMethod.BZIP2;
        byte[] password = null;
        OutputStream encodedStream = Coders.addEncoder(out, method, password);
        assertTrue(encodedStream instanceof BZip2CompressorOutputStream);
    }

    @Test
    public void testAddDecoder_AES256SHA256_NoPassword() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[16]; // Minimal properties for AES
        byte[] password = null;
        try {
            Coders.addDecoder(in, coder, password);
            fail("Expected IOException when password is null for AES decryption");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Cannot read encrypted files without a password"));
        }
    }

    @Test
    public void testAddDecoder_AES256SHA256_InvalidProperties() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = new byte[1]; // Too short for salt and IV
        byte[] password = new byte[]{1};
        try {
            Coders.addDecoder(in, coder, password);
            fail("Expected IOException for invalid properties length");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Salt size + IV size too long"));
        }
    }

    @Test
    public void testAddDecoder_UnsupportedMethod() throws Exception {
        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.decompressionMethodId = new byte[]{1, 2, 3}; // Unsupported method
        byte[] password = null;
        try {
            Coders.addDecoder(in, coder, password);
            fail("Expected IOException for unsupported compression method");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unsupported compression method"));
        }
    }

    @Test
    public void testAddEncoder_UnsupportedMethod() throws Exception {
        OutputStream out = new java.io.ByteArrayOutputStream();
        SevenZMethod method = SevenZMethod.LZMA; // Not supported by encode
        byte[] password = null;
        try {
            Coders.addEncoder(out, method, password);
            fail("Expected IOException for unsupported compression method");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Unsupported compression method"));
        }
    }

    @Test
    public void testAddDecoder_AES256SHA256_PropertiesEdgeCases() throws Exception {
        // Test with minimal salt and IV sizes
        byte[] props = new byte[2 + 0 + 0]; // 2 bytes for header, 0 salt, 0 IV
        props[0] = (byte) (0 | (0 << 6) | (0 << 7)); // ivSize = 0, saltSize = 0
        props[1] = (byte) (0 | (0 << 4));
        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = props;
        byte[] password = new byte[]{1};
        
        try {
            Coders.addDecoder(in, coder, password);
            fail("Expected IOException for empty AES properties");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Salt size + IV size too long"));
        }
    }

    

    @Test
    public void testAddDecoder_AES256SHA256_DefaultPasswordBytesWhenMaxCycles() throws Exception {
        // Test with passwordBytes being null when numCyclesPower is max, which should still
        // try to use the salt and passwordBytes provided.
        byte[] props = new byte[2 + 1 + 16]; // saltSize = 1, ivSize = 16
        props[0] = (byte) (1 | (1 << 6) | (1 << 7)); // ivSize = 1, saltSize = 1
        props[1] = (byte) (1 | (1 << 4)); // example values
        props[0] |= (0x3f << 2); // Set numCyclesPower to max

        InputStream in = new java.io.ByteArrayInputStream(new byte[]{});
        Coder coder = new Coder();
        coder.decompressionMethodId = SevenZMethod.AES256SHA256.getId();
        coder.properties = props;
        byte[] password = null; // Password is null
        
        try {
            Coders.addDecoder(in, coder, password);
            fail("Expected IOException when password is null and numCyclesPower is max");
        } catch (IOException e) {
            assertTrue(e.getMessage().contains("Cannot read encrypted files without a password"));
        }
    }
}

