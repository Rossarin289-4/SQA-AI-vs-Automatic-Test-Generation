The `Flags` class is private, which prevents direct instantiation and access from `CommandLineRunnerTest`. Also, the mock implementations of `OptionDef`, `Parameters`, and `Setter` need to correctly implement the methods from their respective interfaces. The `@Override` annotations are also missing on many methods in the mock classes, and `OptionDef` is an interface, not a class, so it should not be implemented as a concrete class directly.

```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.Lists;
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
import java.util.Set;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.io.ByteArrayOutputStream;

public class CommandLineRunnerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mock implementation for Parameters interface
    private static class MockParameters implements Parameters {
        private final List<String> params;
        private int index = 0;

        MockParameters(String... params) {
            this.params = Lists.newArrayList(params);
        }

        @Override
        public String getParameter(int index) throws CmdLineException {
            if (index < 0 || index >= params.size()) {
                throw new CmdLineException(null, "Index out of bounds");
            }
            return params.get(index);
        }

        @Override
        public int size() {
            return params.size();
        }

        @Override
        public boolean hasParameter(int index) {
            return index >= 0 && index < params.size();
        }

        // Not implemented for this mock, as it's not used by BooleanOptionHandler
        @Override
        public String getParameter(String name) throws CmdLineException {
            throw new UnsupportedOperationException();
        }
    }

    // Mock implementation for Setter interface
    private static class MockSetter<T> implements Setter<T> {
        private T value;
        private boolean added = false;

        @Override
        public void addValue(T value) {
            this.value = value;
            this.added = true;
        }

        @Override
        public Class<T> getType() {
            // This mock doesn't need to provide the actual type
            return null;
        }

        @Override
        public boolean isMultiValued() {
            return false;
        }

        public T getValue() {
            return value;
        }

        public boolean isAdded() {
            return added;
        }
    }

    // Mock implementation for OptionDef interface
    private static class MockOptionDef implements OptionDef {
        @Override
        public String name() { return null; }
        @Override
        public String usage() { return null; }
        @Override
        public boolean required() { return false; }
        @Override
        public String[] aliases() { return new String[0]; }
        @Override
        public String forName() { return null; }
        @Override
        public boolean hidden() { return false; }
        @Override
        public int multiValuedOptionParser() { return 0; }
        @Override
        public Class<? extends OptionHandler> handler() { return null; }
        @Override
        public String[] depends() { return new String[0]; }
        @Override
        public String[] групи() { return new String[0]; } // Assuming 'gruppi' is a typo and should be 'groups' or similar based on args4j
        @Override
        public String metaVar() { return null; }
    }

    @Test
    public void testBooleanOptionHandlerTrue() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("true");
        handler.parseArguments(params);
        assertTrue(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerFalse() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("false");
        handler.parseArguments(params);
        assertFalse(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerYes() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("yes");
        handler.parseArguments(params);
        assertTrue(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerNo() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("no");
        handler.parseArguments(params);
        assertFalse(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerOne() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("1");
        handler.parseArguments(params);
        assertTrue(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerZero() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("0");
        handler.parseArguments(params);
        assertFalse(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerOn() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("on");
        handler.parseArguments(params);
        assertTrue(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerOff() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("off");
        handler.parseArguments(params);
        assertFalse(setter.getValue());
    }

    @Test
    public void testBooleanOptionHandlerMissingValue() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters(); // No parameter provided
        handler.parseArguments(params); // Should default to true if no value
        assertTrue(setter.getValue());
    }

    @Test(expected = CmdLineException.class)
    public void testBooleanOptionHandlerInvalidValue() throws Exception {
        CommandLineRunner.Flags flags = new CommandLineRunner.Flags();
        CmdLineParser parser = new CmdLineParser(flags);
        MockOptionDef optionDef = new MockOptionDef();
        MockSetter<Boolean> setter = new MockSetter<>();
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(parser, optionDef, setter);
        MockParameters params = new MockParameters("invalid");
        handler.parseArguments(params);
    }

    @Test
    public void testFormattingOptionPrettyPrint() {
        CompilerOptions options = new CompilerOptions();
        CommandLineRunner.FormattingOption.PRETTY_PRINT.applyToOptions(options);
        assertTrue(options.prettyPrint);
    }

    @Test
    public void testFormattingOptionPrintInputDelimiter() {
        CompilerOptions options = new CompilerOptions();
        CommandLineRunner.FormattingOption.PRINT_INPUT_DELIMITER.applyToOptions(options);
        assertTrue(options.printInputDelimiter);
    }

    @Test
    public void testFormattingOptionMultiple() {
        CompilerOptions options = new CompilerOptions();
        CommandLineRunner.FormattingOption.PRETTY_PRINT.applyToOptions(options);
        CommandLineRunner.FormattingOption.PRINT_INPUT_DELIMITER.applyToOptions(options);
        assertTrue(options.prettyPrint);
        assertTrue(options.printInputDelimiter);
    }

    // Use a minimal constructor for CommandLineRunner to avoid issues with System.err during test setup
    private CommandLineRunner createRunner(String[] args) throws CmdLineException {
        // Create dummy PrintStreams to pass to the constructor, as they are not used in these tests.
        PrintStream dummyOut = new PrintStream(new ByteArrayOutputStream());
        PrintStream dummyErr = new PrintStream(new ByteArrayOutputStream());
        return new CommandLineRunner(args, dummyOut, dummyErr);
    }

    @Test
    public void testInitConfigFromFlagsEmptyArgs() throws Exception {
        CommandLineRunner runner = createRunner(new String[]{});
        assertNotNull(runner);
        assertNotNull(runner.flags); // Ensure flags are initialized
    }

    @Test
    public void testInitConfigFromFlagsWithArgs() throws Exception {
        String[] args = {"--print_tree", "true", "--js_output_file", "output.js"};
        CommandLineRunner runner = createRunner(args);
        assertTrue(runner.flags.print_tree);
        assertEquals("output.js", runner.flags.js_output_file);
    }

    @Test
    public void testInitConfigFromFlagsWithQuotedArgs() throws Exception {
        String[] args = {"--js_output_file=output.js"};
        CommandLineRunner runner = createRunner(args);
        assertEquals("output.js", runner.flags.js_output_file);
    }

    @Test
    public void testInitConfigFromFlagsWithQuotedValue() throws Exception {
        String[] args = {"--js_output_file", "'output.js'"};
        CommandLineRunner runner = createRunner(args);
        assertEquals("output.js", runner.flags.js_output_file);
    }

    @Test
    public void testInitConfigFromFlagsWithDefine() throws Exception {
        String[] args = {"--define", "MY_CONST=123"};
        CommandLineRunner runner = createRunner(args);
        assertEquals(1, runner.flags.define.size());
        assertEquals("MY_CONST=123", runner.flags.define.get(0));
    }

    @Test
    public void testInitConfigFromFlagsWithDefineNoValue() throws Exception {
        String[] args = {"--define", "MY_CONST"};
        CommandLineRunner runner = createRunner(args);
        assertEquals(1, runner.flags.define.size());
        assertEquals("MY_CONST", runner.flags.define.get(0));
    }

    @Test
    public void testCreateOptionsDefault() throws Exception {
        CommandLineRunner runner = createRunner(new String[]{}); // Minimal args
        CompilerOptions options = runner.createOptions();

        // Default values are set by `new CompilerOptions()` and `initConfigFromFlags`
        // and `createOptions` itself. We test against expected defaults.
        assertFalse(options.prettyPrint);
        assertFalse(options.printInputDelimiter);
        assertTrue(options.closurePass); // Default is true
        assertEquals(CompilationLevel.SIMPLE_OPTIMIZATIONS, runner.flags.compilation_level);
        assertEquals(WarningLevel.DEFAULT, runner.flags.warning_level);
    }

    @Test
    public void testCreateOptionsDebug() throws Exception {
        String[] args = {"--debug", "true"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertTrue(runner.flags.debug);
    }

    @Test
    public void testCreateOptionsPrettyPrint() throws Exception {
        String[] args = {"--formatting", "PRETTY_PRINT"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
    }

    @Test
    public void testCreateOptionsCompilationLevel() throws Exception {
        String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, runner.flags.compilation_level);
    }

    @Test
    public void testCreateOptionsWarningLevel() throws Exception {
        String[] args = {"--warning_level", "VERBOSE"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(WarningLevel.VERBOSE, runner.flags.warning_level);
    }

    @Test
    public void testCreateOptionsJscompError() throws Exception {
        String[] args = {"--jscomp_error", "accessControls"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.jscomp_error.contains("accessControls"));
    }

    @Test
    public void testCreateOptionsJscompWarning() throws Exception {
        String[] args = {"--jscomp_warning", "visibility"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.jscomp_warning.contains("visibility"));
    }

    @Test
    public void testCreateOptionsJscompOff() throws Exception {
        String[] args = {"--jscomp_off", "checkTypes"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.jscomp_off.contains("checkTypes"));
    }

    @Test
    public void testCreateOptionsProcessClosurePrimitives() throws Exception {
        String[] args = {"--process_closure_primitives", "false"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertFalse(options.closurePass);
    }

    @Test
    public void testCreateOptionsLoggingLevel() throws Exception {
        String[] args = {"--logging_level", "INFO"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("INFO", runner.flags.logging_level);
    }

    @Test
    public void testCreateOptionsThirdParty() throws Exception {
        String[] args = {"--third_party", "true"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.third_party);
    }

    @Test
    public void testCreateOptionsSummaryDetailLevel() throws Exception {
        String[] args = {"--summary_detail_level", "3"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(3, runner.flags.summary_detail_level);
    }

    @Test
    public void testCreateOptionsOutputWrapper() throws Exception {
        String[] args = {"--output_wrapper", "wrapper(%output%)"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("wrapper(%output%)", runner.flags.output_wrapper);
    }

    @Test
    public void testCreateOptionsOutputWrapperMarker() throws Exception {
        String[] args = {"--output_wrapper_marker", "@@OUTPUT@@"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("@@OUTPUT@@", runner.flags.output_wrapper_marker);
    }

    @Test
    public void testCreateOptionsModuleWrapper() throws Exception {
        String[] args = {"--module_wrapper", "name:wrapper(%s)"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(1, runner.flags.module_wrapper.size());
        assertEquals("name:wrapper(%s)", runner.flags.module_wrapper.get(0));
    }

    @Test
    public void testCreateOptionsModuleOutputPathPrefix() throws Exception {
        String[] args = {"--module_output_path_prefix", "/tmp/"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("/tmp/", runner.flags.module_output_path_prefix);
    }

    @Test
    public void testCreateOptionsCreateSourceMap() throws Exception {
        String[] args = {"--create_source_map", "source.map"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("source.map", runner.flags.create_source_map);
    }

    @Test
    public void testCreateOptionsVariableMapInputFile() throws Exception {
        String[] args = {"--variable_map_input_file", "var_in.map"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("var_in.map", runner.flags.variable_map_input_file);
    }

    @Test
    public void testCreateOptionsPropertyMapInputFile() throws Exception {
        String[] args = {"--property_map_input_file", "prop_in.map"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("prop_in.map", runner.flags.property_map_input_file);
    }

    @Test
    public void testCreateOptionsVariableMapOutputFile() throws Exception {
        String[] args = {"--variable_map_output_file", "var_out.map"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("var_out.map", runner.flags.variable_map_output_file);
    }

    @Test
    public void testCreateOptionsCreateNameMapFiles() throws Exception {
        String[] args = {"--create_name_map_files", "true"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.create_name_map_files);
    }

    @Test
    public void testCreateOptionsPropertyMapOutputFile() throws Exception {
        String[] args = {"--property_map_output_file", "prop_out.map"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("prop_out.map", runner.flags.property_map_output_file);
    }

    @Test
    public void testCreateOptionsCharset() throws Exception {
        String[] args = {"--charset", "UTF-16"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals("UTF-16", runner.flags.charset);
    }

    @Test
    public void testCreateOptionsJsModule() throws Exception {
        String[] args = {"--module", "mod1:2:mod2"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(1, runner.flags.module.size());
        assertEquals("mod1:2:mod2", runner.flags.module.get(0));
    }

    @Test
    public void testCreateOptionsJsFile() throws Exception {
        String[] args = {"--js", "file1.js", "--js", "file2.js"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(2, runner.flags.js.size());
        assertEquals("file1.js", runner.flags.js.get(0));
        assertEquals("file2.js", runner.flags.js.get(1));
    }

    @Test
    public void testCreateOptionsExterns() throws Exception {
        String[] args = {"--externs", "ext1.js", "--externs", "ext2.js"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(2, runner.flags.externs.size());
        assertEquals("ext1.js", runner.flags.externs.get(0));
        assertEquals("ext2.js", runner.flags.externs.get(1));
    }

    @Test
    public void testCreateOptionsDevMode() throws Exception {
        String[] args = {"--jscomp_dev_mode", "DEBUG"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertEquals(CompilerOptions.DevMode.DEBUG, runner.flags.jscomp_dev_mode);
    }

    @Test
    public void testCreateOptionsPrintAst() throws Exception {
        String[] args = {"--print_ast", "true"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.print_ast);
    }

    @Test
    public void testCreateOptionsPrintPassGraph() throws Exception {
        String[] args = {"--print_pass_graph", "true"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.print_pass_graph);
    }

    @Test
    public void testCreateOptionsComputePhaseOrdering() throws Exception {
        String[] args = {"--compute_phase_ordering", "true"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.compute_phase_ordering);
    }

    @Test
    public void testCreateOptionsPrintTree() throws Exception {
        String[] args = {"--print_tree", "true"};
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed
        assertTrue(runner.flags.print_tree);
    }

    @Test
    public void testCreateOptionsWithAllFlags() throws Exception {
        String[] args = {
            "--print_tree", "true",
            "--compute_phase_ordering", "true",
            "--print_ast", "true",
            "--print_pass_graph", "true",
            "--jscomp_dev_mode", "DEBUG",
            "--logging_level", "INFO",
            "--externs", "ext1.js",
            "--externs", "ext2.js",
            "--js", "file1.js",
            "--js", "file2.js",
            "--js_output_file", "output.js",
            "--module", "mod1:2:mod2",
            "--variable_map_input_file", "var_in.map",
            "--property_map_input_file", "prop_in.map",
            "--variable_map_output_file", "var_out.map",
            "--create_name_map_files", "true",
            "--property_map_output_file", "prop_out.map",
            "--third_party", "true",
            "--summary_detail_level", "3",
            "--output_wrapper", "wrapper(%output%)",
            "--output_wrapper_marker", "@@OUTPUT@@",
            "--module_wrapper", "name1:%s",
            "--module_wrapper", "name2:%s",
            "--module_output_path_prefix", "./modules/",
            "--create_source_map", "source.map",
            "--jscomp_error", "accessControls",
            "--jscomp_warning", "visibility",
            "--jscomp_off", "checkTypes",
            "--define", "MY_CONST=123",
            "--charset", "UTF-8",
            "--compilation_level", "ADVANCED_OPTIMIZATIONS",
            "--warning_level", "VERBOSE",
            "--use_only_custom_externs", "true",
            "--debug", "true",
            "--formatting", "PRETTY_PRINT",
            "--formatting", "PRINT_INPUT_DELIMITER",
            "--process_closure_primitives", "false"
        };
        CommandLineRunner runner = createRunner(args);
        runner.createOptions(); // Ensure flags are parsed

        // Verify flags are set correctly
        assertTrue(runner.flags.print_tree);
        assertTrue(runner.flags.compute_phase_ordering);
        assertTrue(runner.flags.print_ast);
        assertTrue(runner.flags.print_pass_graph);
        assertEquals(CompilerOptions.DevMode.DEBUG, runner.flags.jscomp_dev_mode);
        assertEquals("INFO", runner.flags.logging_level);
        assertEquals(2, runner.flags.externs.size());
        assertEquals(2, runner.flags.js.size());
        assertEquals("output.js", runner.flags.js_output_file);
        assertEquals(1, runner.flags.module.size());
        assertEquals("var_in.map", runner.flags.variable_map_input_file);
        assertEquals("prop_in.map", runner.flags.property_map_input_file);
        assertEquals("var_out.map", runner.flags.variable_map_output_file);
        assertTrue(runner.flags.create_name_map_files);
        assertEquals("prop_out.map", runner.flags.property_map_output_file);
        assertTrue(runner.flags.third_party);
        assertEquals(3, runner.flags.summary_detail_level);
        assertEquals("wrapper(%output%)", runner.flags.output_wrapper);
        assertEquals("@@OUTPUT@@", runner.flags.output_wrapper_marker);
        assertEquals(2, runner.flags.module_wrapper.size());
        assertEquals("./modules/", runner.flags.module_output_path_prefix);
        assertEquals("source.map", runner.flags.create_source_map);
        assertTrue(runner.flags.jscomp_error.contains("accessControls"));
        assertTrue(runner.flags.jscomp_warning.contains("visibility"));
        assertTrue(runner.flags.jscomp_off.contains("checkTypes"));
        assertEquals(1, runner.flags.define.size());
        assertEquals("MY_CONST=123", runner.flags.define.get(0));
        assertEquals("UTF-8", runner.flags.charset);
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, runner.flags.compilation_level);
        assertEquals(WarningLevel.VERBOSE, runner.flags.warning_level);
        assertTrue(runner.flags.use_only_custom_externs);
        assertTrue(runner.flags.debug);
        assertEquals(2, runner.flags.formatting.size());
        assertFalse(runner.flags.process_closure_primitives);
    }

    @Test
    public void testInitConfigFromFlagsInvalidArg() throws Exception {
        String[] args = {"--invalid_option", "value"};
        // Use ByteArrayPrintStream to capture stderr
        ByteArrayOutputStream errStream = new ByteArrayOutputStream();
        PrintStream err = new PrintStream(errStream);
        CommandLineRunner runner = new CommandLineRunner(args, System.out, err);
        assertTrue(errStream.toString().contains("Unknown option"));
        assertTrue(errStream.toString().contains("print_tree")); // Usage message includes options
    }

    // Helper class to capture System.err output
    private static class ByteArrayPrintStream extends PrintStream {
        private final ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ByteArrayPrintStream() {
            // Call super with a non-null stream to avoid NullPointerException in PrintStream constructor
            super(new ByteArrayOutputStream());
        }

        @Override
        public void write(byte[] buf, int off, int len) {
            baos.write(buf, off, len);
        }

        @Override
        public String toString() {
            return baos.toString();
        }
    }
}
```