package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;
import java.util.regex.Pattern;

public class ProcessCommonJSModulesTest {
    @Test
    public void testRemovesLeadingDotSlash() throws Exception {
        assertEquals("module$alpha", ProcessCommonJSModules.toModuleName("./alpha"));
    }

    @Test
    public void testReplacesNestedSlashes() throws Exception {
        assertEquals("module$dir$sub$file",
                ProcessCommonJSModules.toModuleName("dir/sub/file"));
    }

    @Test
    public void testRemovesJsSuffix() throws Exception {
        assertEquals("module$file", ProcessCommonJSModules.toModuleName("file.js"));
    }

    @Test
    public void testRemovesOnlyTerminalJsSuffix() throws Exception {
        assertEquals("module$file.js$part",
                ProcessCommonJSModules.toModuleName("file.js/part"));
    }

    @Test
    public void testReplacesHyphens() throws Exception {
        assertEquals("module$a_b_c",
                ProcessCommonJSModules.toModuleName("a-b-c"));
    }

    @Test
    public void testCombinedFilenameNormalization() throws Exception {
        assertEquals("module$dir_name$file",
                ProcessCommonJSModules.toModuleName("./dir-name/file.js"));
    }

    @Test
    public void testEmptyFilename() throws Exception {
        assertEquals("module$", ProcessCommonJSModules.toModuleName(""));
    }

    @Test
    public void testDotSlashOnly() throws Exception {
        assertEquals("module$", ProcessCommonJSModules.toModuleName("./"));
    }

    @Test
    public void testParentDirectoryIsNotRemoved() throws Exception {
        assertEquals("module$..$file",
                ProcessCommonJSModules.toModuleName("../file.js"));
    }

    @Test
    public void testAbsoluteStyleLeadingSlashIsPreserved() throws Exception {
        assertEquals("module$$dir$file",
                ProcessCommonJSModules.toModuleName("/dir/file"));
    }

    @Test
    public void testOnlyTerminalJsExtensionIsRemoved() throws Exception {
        assertEquals("module$file.js", ProcessCommonJSModules.toModuleName("file.js.js"));
    }

    @Test
    public void testHyphenAfterJsSuffixIsReplaced() throws Exception {
        assertEquals("module$file.js_",
                ProcessCommonJSModules.toModuleName("file.js-"));
    }
}
