package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;
import java.util.regex.Pattern;

public class ProcessCommonJSModulesTest {
    @Test
    public void testFilenameWithoutSuffix() throws Exception {
        assertEquals("module$alpha", ProcessCommonJSModules.toModuleName("alpha"));
    }

    @Test
    public void testFilenameRemovesJsSuffix() throws Exception {
        assertEquals("module$alpha", ProcessCommonJSModules.toModuleName("alpha.js"));
    }

    @Test
    public void testFilenameReplacesHyphens() throws Exception {
        assertEquals("module$alpha_beta", ProcessCommonJSModules.toModuleName("alpha-beta.js"));
    }

    @Test
    public void testFilenameReplacesSeparators() throws Exception {
        String input = "a" + File.separator + "b.js";
        assertEquals("module$a$b", ProcessCommonJSModules.toModuleName(input));
    }

    @Test
    public void testFilenameRemovesLeadingDotSeparator() throws Exception {
        String input = "." + File.separator + "a.js";
        assertEquals("module$a", ProcessCommonJSModules.toModuleName(input));
    }

    @Test
    public void testFilenameDotJsOnlyAtEndIsRemoved() throws Exception {
        assertEquals("module$a.js$b", ProcessCommonJSModules.toModuleName("a.js" + File.separator + "b"));
    }

    @Test
    public void testFilenameEmpty() throws Exception {
        assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
    }

    @Test
    public void testFilenameMultipleHyphens() throws Exception {
        assertEquals("module$a_b_c", ProcessCommonJSModules.toModuleName("a-b-c"));
    }

    @Test
    public void testFilenameRepeatedSeparators() throws Exception {
        String input = "a" + File.separator + File.separator + "b";
        assertEquals("module$a$$b", ProcessCommonJSModules.toModuleName(input));
    }

    @Test
    public void testFilenameDotJsCaseSensitive() throws Exception {
        assertEquals("module$a.JS", ProcessCommonJSModules.toModuleName("a.JS"));
    }

    @Test
    public void testFilenameLeadingDotWithoutSeparatorRetained() throws Exception {
        assertEquals("module$.a", ProcessCommonJSModules.toModuleName(".a"));
    }

    @Test
    public void testFilenameTrailingSeparator() throws Exception {
        String input = "a" + File.separator;
        assertEquals("module$a$", ProcessCommonJSModules.toModuleName(input));
    }

    @Test
    public void testFilenameSeparatorAndHyphen() throws Exception {
        String input = "a-b" + File.separator + "c-d.js";
        assertEquals("module$a_b$c_d", ProcessCommonJSModules.toModuleName(input));
    }
}
