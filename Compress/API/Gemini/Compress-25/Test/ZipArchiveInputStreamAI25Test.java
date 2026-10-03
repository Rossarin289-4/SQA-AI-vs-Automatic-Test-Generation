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

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ZipArchiveInputStreamAI25Test {

    @Test
    public void testGetNextZipEntryNullOnEmptyStream() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        try {
            Assert.assertNull(zis.getNextZipEntry());
        } finally {
            zis.close();
        }
    }

    @Test
    public void testConstructorWithEncoding() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais, "UTF8");
        try {
            Assert.assertNotNull(zis);
            Assert.assertNull(zis.getNextZipEntry());
        } finally {
            zis.close();
        }
    }

    @Test
    public void testConstructorWithEncodingAndUnicodeFlag() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais, "UTF8", true);
        try {
            Assert.assertNotNull(zis);
            Assert.assertNull(zis.getNextZipEntry());
        } finally {
            zis.close();
        }
    }

    @Test
    public void testConstructorWithAllOptions() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais, "UTF8", true, true);
        try {
            Assert.assertNotNull(zis);
            Assert.assertNull(zis.getNextZipEntry());
        } finally {
            zis.close();
        }
    }

    @Test
    public void testCloseIdempotent() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        zis.close();
        zis.close(); // should not throw exception
        Assert.assertNull(zis.getNextZipEntry());
    }

    @Test
    public void testReadWithNoCurrentEntryReturnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        try {
            byte[] buf = new byte[10];
            int read = zis.read(buf, 0, 10);
            Assert.assertEquals(-1, read);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testReadSingleByteWithNoCurrentEntryReturnsMinusOne() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        try {
            int read = zis.read();
            Assert.assertEquals(-1, read);
        } finally {
            zis.close();
        }
    }

    @Test
    public void testCanReadBytesReadAndDefaults() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[0]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        try {
            Assert.assertEquals(0, zis.getBytesRead());
        } finally {
            zis.close();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSkipNegativeThrowsException() throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[10]);
        ZipArchiveInputStream zis = new ZipArchiveInputStream(bais);
        try {
            zis.skip(-5);
        } finally {
            zis.close();
        }
    }
}
