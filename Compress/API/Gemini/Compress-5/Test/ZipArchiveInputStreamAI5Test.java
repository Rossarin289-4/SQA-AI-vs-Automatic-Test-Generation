/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.compress.archivers.zip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

public class ZipArchiveInputStreamAI5Test {

    @Test
    public void testMatchesEmptyAndNull() {
        byte[] shortSig = new byte[] { 0x50, 0x4b };
        assertFalse(ZipArchiveInputStream.matches(shortSig, 1));
        assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.LFH_SIG, ZipArchiveOutputStream.LFH_SIG.length));
        assertTrue(ZipArchiveInputStream.matches(ZipArchiveOutputStream.EOCD_SIG, ZipArchiveOutputStream.EOCD_SIG.length));
    }

    @Test
    public void testGetNextZipEntryNullOnEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        assertNull(zais.getNextZipEntry());
        zais.close();
    }

    @Test(expected = IOException.class)
    public void testReadOnClosedStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        zais.close();
        byte[] buf = new byte[10];
        zais.read(buf, 0, 10);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testReadInvalidBufferLength() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        byte[] buf = new byte[5];
        try {
            zais.read(buf, 0, 10);
        } finally {
            zais.close();
        }
    }

    @Test
    public void testReadWithoutCurrentEntryReturnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        byte[] buf = new byte[5];
        assertEquals(-1, zais.read(buf, 0, 5));
        zais.close();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegative() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        try {
            zais.skip(-1);
        } finally {
            zais.close();
        }
    }

    @Test
    public void testSkipZero() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        assertEquals(0, zais.skip(0));
        zais.close();
    }

    @Test
    public void testGetNextZipEntryCentralDirectorySignature() throws IOException {
        byte[] cfhSig = new byte[] { 0x50, 0x4b, 0x01, 0x02, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        ByteArrayInputStream bais = new ByteArrayInputStream(cfhSig);
        ZipArchiveInputStream zais = new ZipArchiveInputStream(bais);
        assertNull(zais.getNextZipEntry());
        assertNull(zais.getNextZipEntry());
        zais.close();
    }
}
