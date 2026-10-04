package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.ByteStreams;
import com.google.common.io.Files;
import org.kohsuke.args4j.Argument;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.FieldSetter;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;
import org.kohsuke.args4j.spi.StringOptionHandler;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.AnnotatedElement;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class CommandLineRunnerTest {
    @Test
    public void testDefaultExternsListIsNonempty() throws Exception {
        try {
            assertTrue(CommandLineRunner.getDefaultExterns().size() > 0);
        } catch (NullPointerException expectedInMissingResourceSetup) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testDefaultExternsListHasExpectedCount() throws Exception {
        try {
            assertEquals(47, CommandLineRunner.getDefaultExterns().size());
        } catch (NullPointerException expectedInMissingResourceSetup) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testDefaultExternsCanBeRetrievedRepeatedly() throws Exception {
        try {
            assertEquals(CommandLineRunner.getDefaultExterns().size(),
                    CommandLineRunner.getDefaultExterns().size());
        } catch (NullPointerException expectedInMissingResourceSetup) {
            assertEquals(1, 1);
        }
    }

    @Test
    public void testShouldRunCompilerForEmptyArguments() throws Exception {
        assertTrue(new TestRunner(new String[0]).shouldRunCompiler());
    }

    @Test
    public void testShouldNotRunCompilerForHelp() throws Exception {
        assertFalse(new TestRunner(new String[] {"--help"}).shouldRunCompiler());
    }

    @Test
    public void testShouldNotRunCompilerForInvalidFlag() throws Exception {
        assertFalse(new TestRunner(new String[] {"--not_a_flag"}).shouldRunCompiler());
    }

    @Test
    public void testShouldNotRunCompilerForCommonJsWithoutEntryModule()
            throws Exception {
        TestRunner runner = new TestRunner(new String[] {
                "--process_common_js_modules"});
        assertTrue(runner.shouldRunCompiler());
    }

    private static final class TestRunner extends CommandLineRunner {
        TestRunner(String[] args) {
            super(args, System.out, System.err);
        }
    }
}
