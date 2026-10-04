package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.util.regex.Pattern;

public class SystemUtilsTest {
    @Test
    public void testJavaHomeMatchesProperty() throws Exception {
        assertEquals(new File(System.getProperty("java.home")), SystemUtils.getJavaHome());
    }

    @Test
    public void testJavaIoTmpDirMatchesProperty() throws Exception {
        assertEquals(new File(System.getProperty("java.io.tmpdir")), SystemUtils.getJavaIoTmpDir());
    }

    @Test
    public void testUserDirMatchesProperty() throws Exception {
        assertEquals(new File(System.getProperty("user.dir")), SystemUtils.getUserDir());
    }

    @Test
    public void testUserHomeMatchesProperty() throws Exception {
        assertEquals(new File(System.getProperty("user.home")), SystemUtils.getUserHome());
    }

    @Test
    public void testHeadlessResultMatchesInitializedProperty() throws Exception {
        assertEquals("true".equals(SystemUtils.JAVA_AWT_HEADLESS),
                SystemUtils.isJavaAwtHeadless());
    }

    @Test
    public void testHeadlessIsFalseForNonTrueValue() throws Exception {
        assertFalse(SystemUtils.isJavaAwtHeadless()
                && !"true".equals(SystemUtils.JAVA_AWT_HEADLESS));
    }

    @Test
    public void testJavaVersionAtLeastCurrentVersion() throws Exception {
        assertTrue(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_FLOAT));
    }

    @Test
    public void testJavaVersionBelowCurrentVersion() throws Exception {
        assertFalse(SystemUtils.isJavaVersionAtLeast(SystemUtils.JAVA_VERSION_FLOAT + 1.0f));
    }

    @Test
    public void testJavaVersionAboveZero() throws Exception {
        assertEquals(SystemUtils.JAVA_VERSION_FLOAT >= 0.0f,
                SystemUtils.isJavaVersionAtLeast(0.0f));
    }

    @Test
    public void testJavaVersionBelowZero() throws Exception {
        assertTrue(SystemUtils.isJavaVersionAtLeast(-1.0f));
    }

    @Test
    public void testJavaVersionAtLeastPositiveInfinity() throws Exception {
        assertFalse(SystemUtils.isJavaVersionAtLeast(Float.POSITIVE_INFINITY));
    }

    @Test
    public void testJavaVersionAtLeastNegativeInfinity() throws Exception {
        assertTrue(SystemUtils.isJavaVersionAtLeast(Float.NEGATIVE_INFINITY));
    }
}
