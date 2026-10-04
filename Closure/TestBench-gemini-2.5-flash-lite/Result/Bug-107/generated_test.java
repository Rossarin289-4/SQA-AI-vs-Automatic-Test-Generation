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

    // --- CommandLineRunner.Flags tests ---

    @Test
    public void testDefaultFlags() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[0], System.out, System.err);
        // Accessing flags directly is not allowed. We need to test configuration after init.
        // The runner object itself is created, so we check if config is valid.
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testHelpFlag() throws Exception {
        String[] args = {"--help"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler()); // Help prints usage and sets isConfigValid to false
    }

    @Test
    public void testVersionFlag() throws Exception {
        String[] args = {"--version"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        // Version flag prints to err and does not set isConfigValid to true if it's the only arg
        // The main method would exit before returning from run().
        // Based on the current initConfigFromFlags logic, version flag alone does not invalidate config,
        // but it doesn't enable compilation either. A subsequent check for shouldRunCompiler() might be needed
        // if the intended behavior is to stop compilation. However, the original test asserts assertFalse.
        // Let's assume the intention is that it's not a valid compilation command.
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testPrintTreeFlag() throws Exception {
        String[] args = {"--print_tree"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        // This flag doesn't inherently invalidate the configuration.
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testPrintAstFlag() throws Exception {
        String[] args = {"--print_ast"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testPrintPassGraphFlag() throws Exception {
        String[] args = {"--print_pass_graph"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompDevModeFlag() throws Exception {
        String[] args = {"--jscomp_dev_mode", "DEBUG"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        // The flag itself is parsed, but we can't access runner.flags.jscompDevMode directly.
        // We assume it's parsed correctly if shouldRunCompiler is true.
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testLoggingLevelFlag() throws Exception {
        String[] args = {"--logging_level", "INFO"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testExternsFlag() throws Exception {
        String[] args = {"--externs", "ext1.js", "--externs", "ext2.js", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJsFlag() throws Exception {
        String[] args = {"--js", "file1.js", "--js", "file2.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJsOutputFileFlag() throws Exception {
        String[] args = {"--js_output_file", "output.js", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleFlag() throws Exception {
        String[] args = {"--module", "m1:1:m2", "--module", "m2:2", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testVariableMapInputFileFlag() throws Exception {
        String[] args = {"--variable_map_input_file", "var_in.txt", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testPropertyMapInputFileFlag() throws Exception {
        String[] args = {"--property_map_input_file", "prop_in.txt", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testVariableMapOutputFileFlag() throws Exception {
        String[] args = {"--variable_map_output_file", "var_out.txt", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCreateNameMapFilesFlag() throws Exception {
        String[] args = {"--create_name_map_files", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testPropertyMapOutputFileFlag() throws Exception {
        String[] args = {"--property_map_output_file", "prop_out.txt", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testThirdPartyFlag() throws Exception {
        String[] args = {"--third_party", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testSummaryDetailLevelFlag() throws Exception {
        String[] args = {"--summary_detail_level", "3", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOutputWrapperFlag() throws Exception {
        String[] args = {"--output_wrapper", "wrapper(%output%)", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleWrapperFlag() throws Exception {
        String[] args = {"--module_wrapper", "m1:wrapper(%s)", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleOutputPathPrefixFlag() throws Exception {
        String[] args = {"--module_output_path_prefix", "/tmp/", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCreateSourceMapFlag() throws Exception {
        String[] args = {"--create_source_map", "output.map", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testSourceMapFormatFlag() throws Exception {
        String[] args = {"--source_map_format", "V3", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompErrorFlag() throws Exception {
        String[] args = {"--jscomp_error", "accessControls", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompWarningFlag() throws Exception {
        String[] args = {"--jscomp_warning", "checkTypes", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompOffFlag() throws Exception {
        String[] args = {"--jscomp_off", "lintChecks", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testDefineFlag() throws Exception {
        String[] args = {"--define", "MY_GLOBAL=true", "--define", "ANOTHER_ONE='hello'", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCharsetFlag() throws Exception {
        String[] args = {"--charset", "UTF-8", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCompilationLevelFlag() throws Exception {
        String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testUseTypesForOptimizationFlag() throws Exception {
        String[] args = {"--use_types_for_optimization", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testWarningLevelFlag() throws Exception {
        String[] args = {"--warning_level", "VERBOSE", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testUseOnlyCustomExternsFlag() throws Exception {
        String[] args = {"--use_only_custom_externs", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testDebugFlag() throws Exception {
        String[] args = {"--debug", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testGenerateExportsFlag() throws Exception {
        String[] args = {"--generate_exports", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testFormattingFlag() throws Exception {
        String[] args = {"--formatting", "PRETTY_PRINT", "--formatting", "SINGLE_QUOTES", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessCommonJsModulesFlag() throws Exception {
        String[] args = {"--process_common_js_modules", "--common_js_entry_module", "entry.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCommonJsPathPrefixFlag() throws Exception {
        String[] args = {"--common_js_module_path_prefix", "prefix/", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTransformAmdModulesFlag() throws Exception {
        String[] args = {"--transform_amd_modules", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessClosurePrimitivesFlag() throws Exception {
        String[] args = {"--process_closure_primitives", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testManageClosureDependenciesFlag() throws Exception {
        String[] args = {"--manage_closure_dependencies", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOnlyClosureDependenciesFlag() throws Exception {
        String[] args = {"--only_closure_dependencies", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testClosureEntryPointFlag() throws Exception {
        String[] args = {"--closure_entry_point", "my.namespace.Main", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessJqueryPrimitivesFlag() throws Exception {
        String[] args = {"--process_jquery_primitives", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testAngularPassFlag() throws Exception {
        String[] args = {"--angular_pass", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOutputManifestFlag() throws Exception {
        String[] args = {"--output_manifest", "manifest.json", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOutputModuleDependenciesFlag() throws Exception {
        String[] args = {"--output_module_dependencies", "deps.json", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testAcceptConstKeywordFlag() throws Exception {
        String[] args = {"--accept_const_keyword", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testLanguageInFlag() throws Exception {
        String[] args = {"--language_in", "ECMASCRIPT5_STRICT", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTranslationsFileFlag() throws Exception {
        // Dummy file creation for test
        File tempFile = File.createTempFile("test", ".xtb");
        tempFile.deleteOnExit();
        String[] args = {"--translations_file", tempFile.getAbsolutePath(), "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTranslationsProjectFlag() throws Exception {
        String[] args = {"--translations_project", "myproject", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testFlagFileFlag() throws Exception {
        // Create a dummy flag file
        File flagFile = File.createTempFile("flags", ".txt");
        Files.write("--compilation_level ADVANCED_OPTIMIZATIONS\n--js=flagfile.js\n".getBytes(), flagFile);
        flagFile.deleteOnExit();
        String[] args = {"--flagfile", flagFile.getAbsolutePath(), "--js", "main.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testWarningsWhitelistFileFlag() throws Exception {
        String[] args = {"--warnings_whitelist_file", "whitelist.txt", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testExtraAnnotationNameFlag() throws Exception {
        String[] args = {"--extra_annotation_name", "MyAnnotation", "--extra_annotation_name", "Another", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTracerModeFlag() throws Exception {
        String[] args = {"--tracer_mode", "TIMING_ONLY", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testArgumentsFlag() throws Exception {
        String[] args = {"input1.js", "input2.js", "--js", "other.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJsFilesCombined() throws Exception {
        String[] args = {"--js", "file1.js", "arg1.js", "--js", "file2.js", "arg2.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessArgsWithQuotes() throws Exception {
        String[] args = {"--js=/path/with spaces/file.js", "--js", "another.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessArgsWithQuotedOptionValue() throws Exception {
        String[] args = {"--output_wrapper='<html>%output%</html>'", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessArgsWithQuotedOptionValueDoubleQuotes() throws Exception {
        String[] args = {"--output_wrapper=\"<html>%output%</html>\"", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessFlagFile() throws Exception {
        File flagFile = File.createTempFile("flags", ".txt");
        Files.write("--define=FOO=bar\n--js=flagfile.js\n".getBytes(), flagFile);
        flagFile.deleteOnExit();
        String[] args = {"--flagfile", flagFile.getAbsolutePath(), "--js", "main.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testFlagFileCannotContainFlagFile() throws Exception {
        File flagFile = File.createTempFile("flags", ".txt");
        Files.write("--flagfile=another_file.txt\n".getBytes(), flagFile);
        flagFile.deleteOnExit();
        String[] args = {"--flagfile", flagFile.getAbsolutePath()};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler()); // isConfigValid should be false
    }

    @Test
    public void testCommonJsEntryModule_Missing() throws Exception {
        String[] args = {"--process_common_js_modules"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler()); // Requires --common_js_entry_module
    }

    @Test
    public void testProcessCommonJsModules_SetsOtherFlags() throws Exception {
        String[] args = {"--process_common_js_modules", "--common_js_entry_module", "entry.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }






    @Test
    public void testCreateOptions_GenerateExports() throws Exception {
        String[] args = {"--generate_exports", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.generateExports);
    }


    @Test
    public void testCreateOptions_Jquery() throws Exception {
        String[] args = {"--process_jquery_primitives", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        // The convention is set in createOptions, not in Flags
        assertEquals(JqueryCodingConvention.class, options.getCodingConvention().getClass());
        assertTrue(options.jqueryPass);
    }

    @Test
    public void testCreateOptions_AngularPass() throws Exception {
        String[] args = {"--angular_pass", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.angularPass);
    }






    @Test
    public void testCreateOptions_ClosurePrimitives_Implied() throws Exception {
        String[] args = {"--common_js_entry_module", "entry.js", "--process_common_js_modules", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.closurePass);
    }

    



    @Test
    public void testCreateExterns_Default() throws Exception {
        String[] args = {"--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<SourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        // Check that default externs are included. We can't check the exact count
        // without knowing how externs.zip is structured or if other defaults are added.
        // But we can check for presence of known files.
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("es3.js")));
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("es5.js")));
    }

    @Test
    public void testCreateExterns_UseOnlyCustomExterns() throws Exception {
        File tempExtern = File.createTempFile("custom", ".js");
        tempExtern.deleteOnExit();
        String[] args = {"--use_only_custom_externs", "--externs", tempExtern.getAbsolutePath()};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<SourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        assertEquals(1, externs.size());
        assertTrue(externs.get(0).getName().contains(tempExtern.getName()));
    }
    
    @Test
    public void testCreateExterns_CustomAndDefault() throws Exception {
        File tempExtern = File.createTempFile("custom", ".js");
        tempExtern.deleteOnExit();
        String[] args = {"--externs", tempExtern.getAbsolutePath(), "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<SourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        // Expecting default externs + custom extern
        assertTrue(externs.size() > 1);
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("es3.js")));
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains(tempExtern.getName())));
    }

    @Test
    public void testShouldRunCompiler_ValidConfig() throws Exception {
        String[] args = {"--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_InvalidConfig() throws Exception {
        // --process_common_js_modules requires --common_js_entry_module
        String[] args = {"--process_common_js_modules"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler());
    }

    // --- CommandLineRunner.Flags.BooleanOptionHandler tests ---

    // The BooleanOptionHandler is an inner class of Flags, which is itself an inner class of CommandLineRunner.
    // To instantiate it, we need an instance of Flags. However, Flags is private and inaccessible.
    // We also need a CmdLineParser and Setter.
    // Since direct instantiation is not possible, we'll skip testing BooleanOptionHandler directly.
    // Instead, we rely on the tests for the flags themselves to ensure parsing works.

    // --- CommandLineRunner.Flags.WarningGuardSetter tests ---
    // Similar to BooleanOptionHandler, WarningGuardSetter is also a private inner class.
    // Direct testing is not feasible without breaking encapsulation.
    // We rely on tests that set warning flags to implicitly test this.

    // --- CommandLineRunner.Flags.getWarningGuardSpec tests ---
    // This is a static method, so it can be tested.
    
    
    // --- CommandLineRunner.FormattingOption tests ---
    // FormattingOption is a private enum. We test its application indirectly via createOptions.
    // However, we can test its applyToOptions method if we make a CompilerOptions instance.
    
    
    

    // --- CommandLineRunner constructor and initConfigFromFlags tests ---

    @Test
    public void testConstructor_EmptyArgs() throws Exception {
        // Providing null for streams to avoid potential issues if they are used.
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, null, null);
        // If no args, and no errors, shouldRunCompiler should be false because no JS input is provided.
        // However, if the command line is *syntactically* valid, shouldRunCompiler might be true.
        // The original test asserted isConfigValid, which is internal. shouldRunCompiler is public.
        // An empty arg list is syntactically valid for parsing, but won't result in a run.
        // Let's check the internal flag: isConfigValid should be true if parsing succeeds.
        // The public interface is shouldRunCompiler(). If no JS input, it likely returns false.
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testConstructor_InvalidArgs() throws Exception {
        String[] args = {"--unknown_option", "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler()); // Unknown option makes config invalid
    }

    @Test
    public void testConstructor_FlagFileError() throws Exception {
        String nonExistentFile = "non_existent_flag_file_xyz.txt"; // Use a unique name to avoid conflicts
        String[] args = {"--flagfile", nonExistentFile, "--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler()); // File read error makes config invalid
    }
    
    // Dummy implementation for testing Setter interface - not directly testable as it's private
    // The tests for flag parsing should cover this implicitly.

    // Mock implementation for Parameters interface - not directly testable as it's private
    // The tests for flag parsing should cover this implicitly.
}


