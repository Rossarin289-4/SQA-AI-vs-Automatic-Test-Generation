package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.LimitInputStream;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class CommandLineRunnerTest {
    @Test
    public void testDefaultExternsHasExpectedSize() throws Exception {
        assertEquals(37, CommandLineRunner.getDefaultExterns().size());
    }

    @Test
    public void testDefaultExternsStartsAndEndsInExpectedOrder() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertEquals("externs.zip//es3.js", externs.get(0).getName());
        assertEquals("externs.zip//webkit_notifications.js",
                externs.get(externs.size() - 1).getName());
    }

    @Test
    public void testDefaultExternsAreMutable() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        int originalSize = externs.size();
        externs.clear();
        assertEquals(0, externs.size());
        assertEquals(37, originalSize);
    }

    @Test
    public void testDefaultExternsHasExpectedEarlyEntries() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertEquals("externs.zip//es5.js", externs.get(1).getName());
        assertEquals("externs.zip//w3c_event.js", externs.get(2).getName());
    }

    @Test
    public void testDefaultExternsHasExpectedMiddleEntries() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertEquals("externs.zip//w3c_css.js", externs.get(14).getName());
        assertEquals("externs.zip//google.js", externs.get(18).getName());
    }

    @Test
    public void testDefaultExternsHasExpectedLaterEntries() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertEquals("externs.zip//deprecated.js", externs.get(19).getName());
        assertEquals("externs.zip//window.js", externs.get(34).getName());
    }

    @Test
    public void testDefaultExternsEntriesContainSourceText() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertNotNull(externs.get(0).getCode());
        assertNotNull(externs.get(36).getCode());
    }

    @Test
    public void testDefaultExternsCallsReturnIndependentLists() throws Exception {
        List<JSSourceFile> first = CommandLineRunner.getDefaultExterns();
        List<JSSourceFile> second = CommandLineRunner.getDefaultExterns();
        first.clear();
        assertEquals(37, second.size());
    }

    @Test
    public void testExternNamesAreUnique() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        Set<String> names = Sets.newHashSet();
        for (JSSourceFile extern : externs) {
            names.add(extern.getName());
        }
        assertEquals(37, names.size());
    }
}
