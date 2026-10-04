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
    private static class TestableCommandLineRunner extends CommandLineRunner {
        TestableCommandLineRunner(String[] args) {
            super(args);
        }
        TestableCommandLineRunner(String[] args, PrintStream out, PrintStream err) {
            super(args, out, err);
        }

        // Expose flags for testing
        Flags getFlags() {
            return this.flags;
        }
    }

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
    private static class MockBooleanParameters implements Parameters {
        private String param = null;
        private int count = 0;

        MockBooleanParameters(String param, int count) {
            this.param = param;
            this.count = count;
        }

        @Override
        public String getParameter(int index) {
            return index == 0 ? param : null;
        }

        @Override
        public int getParameterCount() {
            return count;
        }
    }

    @Test
    public void testBooleanOptionHandler_parseArguments_trueValues() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        // The actual handler needs to be instantiated with a parser, optionDef, and setter.
        // We'll mock these for the test.
        OptionDef mockOptionDef = null; // Not used by the handler's logic here
        CommandLineRunner.Flags.BooleanOptionHandler handler = new CommandLineRunner.Flags.BooleanOptionHandler(parser, mockOptionDef, new MockBooleanSetter());
        MockBooleanSetter setter = (MockBooleanSetter) handler.setter;

        Parameters params = new MockBooleanParameters("true", 1);
        handler.parseArguments(params);

        assertTrue(setter.called);
        assertTrue(setter.value);
    }

    @Test
    public void testBooleanOptionHandler_parseArguments_falseValues() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        OptionDef mockOptionDef = null;
        CommandLineRunner.Flags.BooleanOptionHandler handler = new CommandLineRunner.Flags.BooleanOptionHandler(parser, mockOptionDef, new MockBooleanSetter());
        MockBooleanSetter setter = (MockBooleanSetter) handler.setter;

        Parameters params = new MockBooleanParameters("false", 1);
        handler.parseArguments(params);

        assertTrue(setter.called);
        assertFalse(setter.value);
    }

    @Test
    public void testBooleanOptionHandler_parseArguments_noValue() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        OptionDef mockOptionDef = null;
        CommandLineRunner.Flags.BooleanOptionHandler handler = new CommandLineRunner.Flags.BooleanOptionHandler(parser, mockOptionDef, new MockBooleanSetter());
        MockBooleanSetter setter = (MockBooleanSetter) handler.setter;

        // Simulate no parameter passed, which should default to true.
        Parameters params = new MockBooleanParameters(null, 0);
        handler.parseArguments(params);

        assertTrue(setter.called);
        assertTrue(setter.value);
    }

    @Test
    public void testBooleanOptionHandler_parseArguments_invalidValue() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        OptionDef mockOptionDef = null;
        // The handler itself doesn't need a setter for this test, as we expect an exception.
        CommandLineRunner.Flags.BooleanOptionHandler handler = new CommandLineRunner.Flags.BooleanOptionHandler(parser, mockOptionDef, null);

        Parameters params = new MockBooleanParameters("invalid", 1);
        try {
            handler.parseArguments(params);
            fail("Expected CmdLineException for invalid boolean value");
        } catch (CmdLineException e) {
            assertTrue(e.getMessage().contains("Illegal boolean value: invalid"));
        }
    }

    // Mock FormattingOption applying to CompilerOptions
    // This inner class is not needed as FormattingOption enum is already available.
    // Instead, we can directly use the enum in tests.

    @Test
    public void testFormattingOption_applyToOptions_prettyPrint() throws Exception {
        CompilerOptions options = new CompilerOptions();
        CommandLineRunner.FormattingOption.PRETTY_PRINT.applyToOptions(options);
        assertTrue(options.prettyPrint);
    }

    @Test
    public void testFormattingOption_applyToOptions_printInputDelimiter() throws Exception {
        CompilerOptions options = new CompilerOptions();
        CommandLineRunner.FormattingOption.PRINT_INPUT_DELIMITER.applyToOptions(options);
        assertTrue(options.printInputDelimiter);
    }

    @Test
    public void testConstructor_noArgs() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{}, dummyOut, dummyErr);
        assertFalse(runner.shouldRunCompiler()); // Invalid config due to no args.
    }

    @Test
    public void testConstructor_withHelpArg() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--help"}, dummyOut, dummyErr);
        assertFalse(runner.shouldRunCompiler()); // Help flag invalidates config.
    }

    @Test
    public void testConstructor_withVersionArg() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--version"}, dummyOut, dummyErr);
        // The version flag itself doesn't immediately invalidate the config, but the initConfigFromFlags
        // sets isConfigValid to false after printing version and before checking for display_help.
        // Thus, shouldRunCompiler should be false.
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_validArgs() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        // Minimal valid args to avoid immediate config invalidation.
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--js", "test.js"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler()); // Should be valid if parsing succeeds.
    }

    @Test
    public void testConstructor_invalidArg() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--invalid-option"}, dummyOut, dummyErr);
        assertFalse(runner.shouldRunCompiler()); // Invalid option makes config invalid.
    }

    @Test
    public void testInitConfigFromFlags_loggingLevel() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--logging_level", "INFO"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("INFO", runner.getFlags().logging_level);
    }

    @Test
    public void testInitConfigFromFlags_externs() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--externs", "my_extern.js"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(1, runner.getFlags().externs.size());
        assertEquals("my_extern.js", runner.getFlags().externs.get(0));
    }

    @Test
    public void testInitConfigFromFlags_js() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--js", "my_script.js"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(1, runner.getFlags().js.size());
        assertEquals("my_script.js", runner.getFlags().js.get(0));
    }

    @Test
    public void testInitConfigFromFlags_jsOutputFile() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--js_output_file", "out.js"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("out.js", runner.getFlags().js_output_file);
    }

    @Test
    public void testInitConfigFromFlags_module() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--module", "m1:1"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(1, runner.getFlags().module.size());
        assertEquals("m1:1", runner.getFlags().module.get(0));
    }

    @Test
    public void testInitConfigFromFlags_variableMapInputFile() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new Testable CommandLineRunner(new String[]{"--variable_map_input_file", "vars.in"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("vars.in", runner.getFlags().variable_map_input_file);
    }

    @Test
    public void testInitConfigFromFlags_propertyMapInputFile() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--property_map_input_file", "props.in"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("props.in", runner.getFlags().property_map_input_file);
    }

    @Test
    public void testInitConfigFromFlags_variableMapOutputFile() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--variable_map_output_file", "vars.out"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("vars.out", runner.getFlags().variable_map_output_file);
    }

    @Test
    public void testInitConfigFromFlags_createNameMapFiles() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--create_name_map_files"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertTrue(runner.getFlags().create_name_map_files);
    }

    @Test
    public void testInitConfigFromFlags_propertyMapOutputFile() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--property_map_output_file", "props.out"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("props.out", runner.getFlags().property_map_output_file);
    }

    @Test
    public void testInitConfigFromFlags_thirdParty() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--third_party"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertTrue(runner.getFlags().third_party);
    }

    @Test
    public void testInitConfigFromFlags_summaryDetailLevel() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--summary_detail_level", "3"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(3, runner.getFlags().summary_detail_level);
    }

    @Test
    public void testInitConfigFromFlags_outputWrapper() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--output_wrapper", "(%output%)"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("(%output%)", runner.getFlags().output_wrapper);
    }

    @Test
    public void testInitConfigFromFlags_outputWrapperMarker() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--output_wrapper_marker", "@@OUTPUT@@"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("@@OUTPUT@@", runner.getFlags().output_wrapper_marker);
    }

    @Test
    public void testInitConfigFromFlags_moduleWrapper() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--module_wrapper", "m1:function(){%s}()"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("m1:function(){%s}()", runner.getFlags().module_wrapper.get(0));
    }

    @Test
    public void testInitConfigFromFlags_moduleOutputPathPrefix() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--module_output_path_prefix", "./modules/"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("./modules/", runner.getFlags().module_output_path_prefix);
    }

    @Test
    public void testInitConfigFromFlags_createSourceMap() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--create_source_map", "out.js.map"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("out.js.map", runner.getFlags().create_source_map);
    }

    @Test
    public void testInitConfigFromFlags_jscompError() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--jscomp_error", "accessControls"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("accessControls", runner.getFlags().jscomp_error.get(0));
    }

    @Test
    public void testInitConfigFromFlags_jscompWarning() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--jscomp_warning", "accessControls"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("accessControls", runner.getFlags().jscomp_warning.get(0));
    }

    @Test
    public void testInitConfigFromFlags_jscompOff() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--jscomp_off", "accessControls"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("accessControls", runner.getFlags().jscomp_off.get(0));
    }

    @Test
    public void testInitConfigFromFlags_define() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--define", "MY_BOOL=true"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("MY_BOOL=true", runner.getFlags().define.get(0));
    }

    @Test
    public void testInitConfigFromFlags_charset() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--charset", "UTF-16"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals("UTF-16", runner.getFlags().charset);
    }

    @Test
    public void testInitConfigFromFlags_compilationLevel() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--compilation_level", "ADVANCED_OPTIMIZATIONS"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, runner.getFlags().compilation_level);
    }

    @Test
    public void testInitConfigFromFlags_warningLevel() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--warning_level", "VERBOSE"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(WarningLevel.VERBOSE, runner.getFlags().warning_level);
    }

    @Test
    public void testInitConfigFromFlags_useOnlyCustomExterns() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--use_only_custom_externs"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertTrue(runner.getFlags().use_only_custom_externs);
    }

    @Test
    public void testInitConfigFromFlags_debug() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--debug"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertTrue(runner.getFlags().debug);
    }

    @Test
    public void testInitConfigFromFlags_formatting() throws Exception {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ByteArrayOutputStream eout = new ByteArrayOutputStream();
        PrintStream dummyOut = new PrintStream(bout);
        PrintStream dummyErr = new PrintStream(eout);
        TestableCommandLineRunner runner = new TestableCommandLineRunner(new String[]{"--formatting", "PRETTY_PRINT"}, dummyOut, dummyErr);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(1, runner.getFlags().formatting.size());
        assertEquals(CommandLineRunner.FormattingOption.PRETTY_PRINT, runner.getFlags().formatting.get(0));
    }

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
    public void testGetDefaultExterns_count() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        assertEquals(CommandLineRunner.DEFAULT_EXTERNS_NAMES.size(), externs.size());
    }

    @Test
    public void testGetDefaultExterns_names() throws Exception {
        List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
        for (int i = 0; i < CommandLineRunner.DEFAULT_EXTERNS_NAMES.size(); i++) {
            String expectedName = CommandLineRunner.DEFAULT_EXTERNS_NAMES.get(i);
            // The actual names in JSSourceFile are prefixed, as per JSSourceFile.fromInputStream.
            assertTrue(externs.get(i).getName().endsWith("//" + expectedName));
        }
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
