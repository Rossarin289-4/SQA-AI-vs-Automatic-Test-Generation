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
import java.io.ByteArrayOutputStream;

public class CommandLineRunnerTest {

    // Helper to create a CommandLineRunner instance for testing.
    // We need to expose the protected constructor or use a subclass.
    // For simplicity and to avoid reflection, we use a subclass that
    // makes the constructor accessible within this test class.

    // Mock Setter for BooleanOptionHandler
    private static class MockBooleanSetter implements Setter<Boolean> {
        public Boolean value = null;
        public boolean called = false;

        @Override
        public void addValue(Boolean value) throws CmdLineException {
            this.value = value;
            this.called = true;
        }

        @Override
        public boolean isMultiValued() {
            return false; // Boolean options are not multi-valued.
        }

        @Override
        public Class<Boolean> getType() {
            return Boolean.class;
        }
    }

    // Mock Parameters for BooleanOptionHandler





    // Mock FormattingOption applying to CompilerOptions
    // This inner class is not needed as FormattingOption enum is already available.
    // Instead, we can directly use the enum in tests.



































    @Test
    public void testInitConfigFromFlags_processClosurePrimitives() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        // Test with explicit false, as true is the default and harder to assert specific setting.
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--process_closure_primitives=false"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertFalse(runner.getFlags().process_closure_primitives);
    }

    @Test
    public void testInitConfigFromFlags_manageClosureDependencies() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--manage_closure_dependencies"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertTrue(runner.getFlags().manage_closure_dependencies);
    }

    @Test
    public void testInitConfigFromFlags_outputManifest() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--output_manifest", "manifest.json"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("manifest.json", runner.getFlags().output_manifest);
    }

    @Test
    public void testInitConfigFromFlags_multipleArgs() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{
                "--js", "a.js",
                "--jscomp_off", "lintChecks",
                "--define", "DEBUG=true"
        }, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(1, runner.getFlags().js.size());
        assertEquals("a.js", runner.getFlags().js.get(0));
        assertEquals(1, runner.getFlags().jscomp_off.size());
        assertEquals("lintChecks", runner.getFlags().jscomp_off.get(0));
        assertEquals(1, runner.getFlags().define.size());
        assertEquals("DEBUG=true", runner.getFlags().define.get(0));
    }

    @Test
    public void testCreateOptions_default() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--js", "test.js"}, dummyOut, dummyErr);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        // Check some default behaviors based on the source code's initialization.
        // closurePass defaults to true if process_closure_primitives is not overridden.
        assertTrue(options.closurePass);
        // Default compilation level is SIMPLE_OPTIMIZATIONS, default warning level is DEFAULT.
        // These are harder to assert directly without more context of CompilerOptions defaults.
    }

    @Test
    public void testCreateOptions_compilationLevel() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--compilation_level", "WHITESPACE_ONLY", "--js", "test.js"}, dummyOut, dummyErr);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        // We can't directly check if setOptionsForCompilationLevel was called and its effects
        // without access to CompilerOptions internals or running the compiler.
        // We can only assert that the flag was parsed correctly.
        assertEquals(CompilationLevel.WHITESPACE_ONLY, runner.getFlags().compilation_level);
    }

    @Test
    public void testCreateOptions_debug() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--debug", "--js", "test.js"}, dummyOut, dummyErr);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        // Asserting debug options are set is complex. We check the flag value.
        assertTrue(runner.getFlags().debug);
    }

    @Test
    public void testCreateOptions_warningLevel() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--warning_level", "VERBOSE", "--js", "test.js"}, dummyOut, dummyErr);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        // Asserting warning level options are set is complex. We check the flag value.
        assertEquals(WarningLevel.VERBOSE, runner.getFlags().warning_level);
    }

    @Test
    public void testCreateOptions_formatting() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--formatting", "PRETTY_PRINT", "--js", "test.js"}, dummyOut, dummyErr);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertTrue(options.prettyPrint);
    }

    @Test
    public void testCreateOptions_processClosurePrimitives() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--process_closure_primitives=false", "--js", "test.js"}, dummyOut, dummyErr);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options);
        assertFalse(options.closurePass);
    }



    @Test
    public void testShouldRunCompiler_true() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--js", "test.js"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_false() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--help"}, dummyOut, dummyErr);
        assertFalse(runner.shouldRunCompiler());
    }

    // The main method is a static entry point and difficult to test directly
    // without mocking System.exit and potentially other static methods.
    // Tests above cover the core logic called by main.
}





