package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.TweakProcessing;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.TokenStream;
import com.google.protobuf.CodedOutputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.common.io.LimitInputStream;
import com.google.javascript.jscomp.AbstractCommandLineRunner.WarningGuardSpec;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;
import org.kohsuke.args4j.spi.StringOptionHandler;
import java.io.InputStream;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.google.common.collect.ImmutableMap;

public class AbstractCommandLineRunnerTest {
    @Test
    public void testRunnerAcceptsEmptyArguments() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[0], new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }), new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testRunnerRejectsUnknownFlag() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--unknown_flag"},
                new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }), new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }));
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testRunnerRejectsHelpRequestAsNotRunnable() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--help"},
                new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }), new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }));
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testRunnerAcceptsBooleanFlagWithoutValue() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--accept_const_keyword"},
                new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }), new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testRunnerAcceptsEqualsArgumentForm() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--language_in=ECMASCRIPT5"},
                new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }), new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testRunnerAcceptsUnrecognizedLanguageAtArgumentParsing() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--language_in", "INVALID"},
                new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }), new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testRunnerRejectsInvalidBooleanFlagValue() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--accept_const_keyword", "perhaps"},
                new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }), new PrintStream(new OutputStream() {
                    public void write(int value) {}
                }));
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testDefaultExternsIsUnavailableWithoutResource() throws Exception {
        try {
            CommandLineRunner.getDefaultExterns();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
        }
    }
}
