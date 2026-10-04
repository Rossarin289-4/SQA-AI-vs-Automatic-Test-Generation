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














    // Use a minimal constructor for CommandLineRunner to avoid issues with System.err during test setup
    private CommandLineRunner createRunner(String[] args) throws CmdLineException {
        // Create dummy PrintStreams to pass to the constructor, as they are not used in these tests.
        PrintStream dummyOut = new PrintStream(new ByteArrayOutputStream());
        PrintStream dummyErr = new PrintStream(new ByteArrayOutputStream());
        return new CommandLineRunner(args, dummyOut, dummyErr);
    }









    @Test
    public void testCreateOptionsPrettyPrint() throws Exception {
        String[] args = {"--formatting", "PRETTY_PRINT"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
    }






    @Test
    public void testCreateOptionsProcessClosurePrimitives() throws Exception {
        String[] args = {"--process_closure_primitives", "false"};
        CommandLineRunner runner = createRunner(args);
        CompilerOptions options = runner.createOptions();
        assertFalse(options.closurePass);
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





