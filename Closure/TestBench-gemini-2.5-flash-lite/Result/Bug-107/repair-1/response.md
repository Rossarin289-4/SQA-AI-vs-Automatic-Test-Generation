```java
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
        assertFalse(runner.flags.displayHelp);
        assertFalse(runner.flags.printTree);
        assertFalse(runner.flags.printAst);
        assertFalse(runner.flags.printPassGraph);
        assertEquals(CompilerOptions.DevMode.OFF, runner.flags.jscompDevMode);
        assertEquals(Level.WARNING.getName(), runner.flags.loggingLevel);
        assertTrue(runner.flags.externs.isEmpty());
        assertTrue(runner.flags.js.isEmpty());
        assertEquals("", runner.flags.jsOutputFile);
        assertTrue(runner.flags.module.isEmpty());
        assertEquals("", runner.flags.variableMapInputFile);
        assertEquals("", runner.flags.propertyMapInputFile);
        assertEquals("", runner.flags.variableMapOutputFile);
        assertFalse(runner.flags.createNameMapFiles);
        assertEquals("", runner.flags.propertyMapOutputFile);
        assertFalse(runner.flags.thirdParty);
        assertEquals(1, runner.flags.summaryDetailLevel);
        assertEquals("", runner.flags.outputWrapper);
        assertTrue(runner.flags.moduleWrapper.isEmpty());
        assertEquals("./", runner.flags.moduleOutputPathPrefix);
        assertEquals("", runner.flags.createSourceMap);
        assertEquals(SourceMap.Format.DEFAULT, runner.flags.sourceMapFormat);
        assertTrue(runner.flags.jscompError.isEmpty());
        assertTrue(runner.flags.jscompWarning.isEmpty());
        assertTrue(runner.flags.jscompOff.isEmpty());
        assertTrue(runner.flags.define.isEmpty());
        assertEquals("", runner.flags.charset);
        assertEquals(CompilationLevel.SIMPLE_OPTIMIZATIONS, runner.flags.compilationLevel);
        assertFalse(runner.flags.useTypesForOptimization);
        assertEquals(WarningLevel.DEFAULT, runner.flags.warningLevel);
        assertFalse(runner.flags.useOnlyCustomExterns);
        assertFalse(runner.flags.debug);
        assertFalse(runner.flags.generateExports);
        assertTrue(runner.flags.formatting.isEmpty());
        assertFalse(runner.flags.processCommonJsModules);
        assertEquals(ProcessCommonJSModules.DEFAULT_FILENAME_PREFIX, runner.flags.commonJsPathPrefix);
        assertNull(runner.flags.commonJsEntryModule);
        assertFalse(runner.flags.transformAmdModules);
        assertTrue(runner.flags.processClosurePrimitives);
        assertFalse(runner.flags.manageClosureDependencies);
        assertFalse(runner.flags.onlyClosureDependencies);
        assertTrue(runner.flags.closureEntryPoint.isEmpty());
        assertFalse(runner.flags.processJqueryPrimitives);
        assertFalse(runner.flags.angularPass);
        assertEquals("", runner.flags.outputManifest);
        assertEquals("", runner.flags.outputModuleDependencies);
        assertFalse(runner.flags.acceptConstKeyword);
        assertEquals("ECMASCRIPT3", runner.flags.languageIn);
        assertFalse(runner.flags.version);
        assertEquals("", runner.flags.translationsFile);
        assertNull(runner.flags.translationsProject);
        assertEquals("", runner.flags.flagFile);
        assertEquals("", runner.flags.warningsWhitelistFile);
        assertTrue(runner.flags.extraAnnotationName.isEmpty());
        assertEquals(CompilerOptions.TracerMode.OFF, runner.flags.tracerMode);
        assertTrue(runner.flags.arguments.isEmpty());
    }

    @Test
    public void testHelpFlag() throws Exception {
        String[] args = {"--help"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testVersionFlag() throws Exception {
        String[] args = {"--version"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler()); // Version prints to err and exits
    }

    @Test
    public void testPrintTreeFlag() throws Exception {
        String[] args = {"--print_tree"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.printTree);
        assertTrue(runner.shouldRunCompiler()); // Should still be valid config, just a flag
    }

    @Test
    public void testPrintAstFlag() throws Exception {
        String[] args = {"--print_ast"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.printAst);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testPrintPassGraphFlag() throws Exception {
        String[] args = {"--print_pass_graph"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.printPassGraph);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompDevModeFlag() throws Exception {
        String[] args = {"--jscomp_dev_mode=DEBUG"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(CompilerOptions.DevMode.DEBUG, runner.flags.jscompDevMode);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testLoggingLevelFlag() throws Exception {
        String[] args = {"--logging_level=INFO"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(Level.INFO.getName(), runner.flags.loggingLevel);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testExternsFlag() throws Exception {
        String[] args = {"--externs", "ext1.js", "--externs", "ext2.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(2, runner.flags.externs.size());
        assertTrue(runner.flags.externs.contains("ext1.js"));
        assertTrue(runner.flags.externs.contains("ext2.js"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJsFlag() throws Exception {
        String[] args = {"--js", "file1.js", "--js", "file2.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<String> jsFiles = runner.flags.getJsFiles();
        assertEquals(2, jsFiles.size());
        assertTrue(jsFiles.contains("file1.js"));
        assertTrue(jsFiles.contains("file2.js"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJsOutputFileFlag() throws Exception {
        String[] args = {"--js_output_file", "output.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("output.js", runner.flags.jsOutputFile);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleFlag() throws Exception {
        String[] args = {"--module", "m1:1:m2", "--module", "m2:2"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(2, runner.flags.module.size());
        assertTrue(runner.flags.module.contains("m1:1:m2"));
        assertTrue(runner.flags.module.contains("m2:2"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testVariableMapInputFileFlag() throws Exception {
        String[] args = {"--variable_map_input_file", "var_in.txt"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("var_in.txt", runner.flags.variableMapInputFile);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testPropertyMapInputFileFlag() throws Exception {
        String[] args = {"--property_map_input_file", "prop_in.txt"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("prop_in.txt", runner.flags.propertyMapInputFile);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testVariableMapOutputFileFlag() throws Exception {
        String[] args = {"--variable_map_output_file", "var_out.txt"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("var_out.txt", runner.flags.variableMapOutputFile);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCreateNameMapFilesFlag() throws Exception {
        String[] args = {"--create_name_map_files"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.createNameMapFiles);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testPropertyMapOutputFileFlag() throws Exception {
        String[] args = {"--property_map_output_file", "prop_out.txt"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("prop_out.txt", runner.flags.propertyMapOutputFile);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testThirdPartyFlag() throws Exception {
        String[] args = {"--third_party"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.thirdParty);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testSummaryDetailLevelFlag() throws Exception {
        String[] args = {"--summary_detail_level", "3"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(3, runner.flags.summaryDetailLevel);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOutputWrapperFlag() throws Exception {
        String[] args = {"--output_wrapper", "wrapper(%output%)"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("wrapper(%output%)", runner.flags.outputWrapper);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleWrapperFlag() throws Exception {
        String[] args = {"--module_wrapper", "m1:wrapper(%s)"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(1, runner.flags.moduleWrapper.size());
        assertTrue(runner.flags.moduleWrapper.contains("m1:wrapper(%s)"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testModuleOutputPathPrefixFlag() throws Exception {
        String[] args = {"--module_output_path_prefix", "/tmp/"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("/tmp/", runner.flags.moduleOutputPathPrefix);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCreateSourceMapFlag() throws Exception {
        String[] args = {"--create_source_map", "output.map"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("output.map", runner.flags.createSourceMap);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testSourceMapFormatFlag() throws Exception {
        String[] args = {"--source_map_format", "V3"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(SourceMap.Format.V3, runner.flags.sourceMapFormat);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompErrorFlag() throws Exception {
        String[] args = {"--jscomp_error", "accessControls"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(1, runner.flags.jscompError.size());
        assertTrue(runner.flags.jscompError.contains("accessControls"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompWarningFlag() throws Exception {
        String[] args = {"--jscomp_warning", "checkTypes"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(1, runner.flags.jscompWarning.size());
        assertTrue(runner.flags.jscompWarning.contains("checkTypes"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJscompOffFlag() throws Exception {
        String[] args = {"--jscomp_off", "lintChecks"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(1, runner.flags.jscompOff.size());
        assertTrue(runner.flags.jscompOff.contains("lintChecks"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testDefineFlag() throws Exception {
        String[] args = {"--define", "MY_GLOBAL=true", "--define", "ANOTHER_ONE='hello'"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(2, runner.flags.define.size());
        assertTrue(runner.flags.define.contains("MY_GLOBAL=true"));
        assertTrue(runner.flags.define.contains("ANOTHER_ONE='hello'"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCharsetFlag() throws Exception {
        String[] args = {"--charset", "UTF-8"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("UTF-8", runner.flags.charset);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCompilationLevelFlag() throws Exception {
        String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, runner.flags.compilationLevel);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testUseTypesForOptimizationFlag() throws Exception {
        String[] args = {"--use_types_for_optimization"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.useTypesForOptimization);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testWarningLevelFlag() throws Exception {
        String[] args = {"--warning_level", "VERBOSE"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(WarningLevel.VERBOSE, runner.flags.warningLevel);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testUseOnlyCustomExternsFlag() throws Exception {
        String[] args = {"--use_only_custom_externs"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.useOnlyCustomExterns);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testDebugFlag() throws Exception {
        String[] args = {"--debug"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.debug);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testGenerateExportsFlag() throws Exception {
        String[] args = {"--generate_exports"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.generateExports);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testFormattingFlag() throws Exception {
        String[] args = {"--formatting", "PRETTY_PRINT", "--formatting", "SINGLE_QUOTES"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(2, runner.flags.formatting.size());
        assertTrue(runner.flags.formatting.contains(FormattingOption.PRETTY_PRINT));
        assertTrue(runner.flags.formatting.contains(FormattingOption.SINGLE_QUOTES));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessCommonJsModulesFlag() throws Exception {
        String[] args = {"--process_common_js_modules", "--common_js_entry_module", "entry.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.processCommonJsModules);
        assertEquals("entry.js", runner.flags.commonJsEntryModule);
        // processCommonJsModules implies processClosurePrimitives and manageClosureDependencies
        assertTrue(runner.flags.processClosurePrimitives);
        assertTrue(runner.flags.manageClosureDependencies);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testCommonJsPathPrefixFlag() throws Exception {
        String[] args = {"--common_js_module_path_prefix", "prefix/"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("prefix/", runner.flags.commonJsPathPrefix);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTransformAmdModulesFlag() throws Exception {
        String[] args = {"--transform_amd_modules"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.transformAmdModules);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessClosurePrimitivesFlag() throws Exception {
        String[] args = {"--process_closure_primitives"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.processClosurePrimitives);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testManageClosureDependenciesFlag() throws Exception {
        String[] args = {"--manage_closure_dependencies"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.manageClosureDependencies);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOnlyClosureDependenciesFlag() throws Exception {
        String[] args = {"--only_closure_dependencies"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.onlyClosureDependencies);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testClosureEntryPointFlag() throws Exception {
        String[] args = {"--closure_entry_point", "my.namespace.Main"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(1, runner.flags.closureEntryPoint.size());
        assertTrue(runner.flags.closureEntryPoint.contains("my.namespace.Main"));
        // Setting entry points implies manageClosureDependencies
        assertTrue(runner.flags.manageClosureDependencies);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessJqueryPrimitivesFlag() throws Exception {
        String[] args = {"--process_jquery_primitives"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.processJqueryPrimitives);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testAngularPassFlag() throws Exception {
        String[] args = {"--angular_pass"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.angularPass);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOutputManifestFlag() throws Exception {
        String[] args = {"--output_manifest", "manifest.json"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("manifest.json", runner.flags.outputManifest);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testOutputModuleDependenciesFlag() throws Exception {
        String[] args = {"--output_module_dependencies", "deps.json"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("deps.json", runner.flags.outputModuleDependencies);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testAcceptConstKeywordFlag() throws Exception {
        String[] args = {"--accept_const_keyword"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.flags.acceptConstKeyword);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testLanguageInFlag() throws Exception {
        String[] args = {"--language_in", "ECMASCRIPT5_STRICT"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("ECMASCRIPT5_STRICT", runner.flags.languageIn);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTranslationsFileFlag() throws Exception {
        String[] args = {"--translations_file", "messages.xtb"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("messages.xtb", runner.flags.translationsFile);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTranslationsProjectFlag() throws Exception {
        String[] args = {"--translations_project", "myproject"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("myproject", runner.flags.translationsProject);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testFlagFileFlag() throws Exception {
        // Create a dummy flag file
        File flagFile = File.createTempFile("flags", ".txt");
        Files.write("--compilation_level ADVANCED_OPTIMIZATIONS\n".getBytes(), flagFile);
        String[] args = {"--flagfile", flagFile.getAbsolutePath()};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, runner.flags.compilationLevel);
        assertTrue(runner.shouldRunCompiler());
        flagFile.delete(); // Clean up
    }

    @Test
    public void testWarningsWhitelistFileFlag() throws Exception {
        String[] args = {"--warnings_whitelist_file", "whitelist.txt"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("whitelist.txt", runner.flags.warningsWhitelistFile);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testExtraAnnotationNameFlag() throws Exception {
        String[] args = {"--extra_annotation_name", "MyAnnotation", "--extra_annotation_name", "Another"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(2, runner.flags.extraAnnotationName.size());
        assertTrue(runner.flags.extraAnnotationName.contains("MyAnnotation"));
        assertTrue(runner.flags.extraAnnotationName.contains("Another"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testTracerModeFlag() throws Exception {
        String[] args = {"--tracer_mode", "TIMING_ONLY"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(CompilerOptions.TracerMode.TIMING_ONLY, runner.flags.tracerMode);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testArgumentsFlag() throws Exception {
        String[] args = {"input1.js", "input2.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals(2, runner.flags.arguments.size());
        assertTrue(runner.flags.arguments.contains("input1.js"));
        assertTrue(runner.flags.arguments.contains("input2.js"));
        // Arguments are added to js files
        assertEquals(2, runner.flags.js.size());
        assertTrue(runner.flags.js.contains("input1.js"));
        assertTrue(runner.flags.js.contains("input2.js"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testJsFilesCombined() throws Exception {
        String[] args = {"--js", "file1.js", "arg1.js", "--js", "file2.js", "arg2.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<String> jsFiles = runner.flags.getJsFiles();
        assertEquals(4, jsFiles.size());
        assertTrue(jsFiles.contains("file1.js"));
        assertTrue(jsFiles.contains("file2.js"));
        assertTrue(jsFiles.contains("arg1.js"));
        assertTrue(jsFiles.contains("arg2.js"));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessArgsWithQuotes() throws Exception {
        String[] args = {"--js=/path/with spaces/file.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<String> jsFiles = runner.flags.getJsFiles();
        assertEquals(1, jsFiles.size());
        assertEquals("/path/with spaces/file.js", jsFiles.get(0));
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessArgsWithQuotedOptionValue() throws Exception {
        String[] args = {"--output_wrapper='<html>%output%</html>'"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("<html>%output%</html>", runner.flags.outputWrapper);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessArgsWithQuotedOptionValueDoubleQuotes() throws Exception {
        String[] args = {"--output_wrapper=\"<html>%output%</html>\""};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertEquals("<html>%output%</html>", runner.flags.outputWrapper);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessFlagFile() throws Exception {
        File flagFile = File.createTempFile("flags", ".txt");
        Files.write("--define=FOO=bar\n--js=flagfile.js".getBytes(), flagFile);
        String[] args = {"--flagfile", flagFile.getAbsolutePath(), "--externs", "main.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);

        assertTrue(runner.flags.define.contains("FOO=bar"));
        List<String> jsFiles = runner.flags.getJsFiles();
        assertTrue(jsFiles.contains("flagfile.js"));
        assertTrue(jsFiles.contains("main.js")); // Check that main args are also processed
        assertTrue(runner.shouldRunCompiler());
        flagFile.delete();
    }

    @Test
    public void testFlagFileCannotContainFlagFile() throws Exception {
        File flagFile = File.createTempFile("flags", ".txt");
        Files.write("--flagfile=another_file.txt\n".getBytes(), flagFile);
        String[] args = {"--flagfile", flagFile.getAbsolutePath()};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler());
        flagFile.delete();
    }

    @Test
    public void testCommonJsEntryModule_Missing() throws Exception {
        String[] args = {"--process_common_js_modules"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testProcessCommonJsModules_SetsOtherFlags() throws Exception {
        String[] args = {"--process_common_js_modules", "--common_js_entry_module", "entry.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
        assertTrue(runner.flags.processCommonJsModules);
        assertTrue(runner.flags.processClosurePrimitives);
        assertTrue(runner.flags.manageClosureDependencies);
    }

    @Test
    public void testCreateOptions_Default() throws Exception {
        String[] args = {};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertEquals(new ClosureCodingConvention().getClass(), options.getCodingConvention().getClass());
        assertEquals(0, options.getExtraAnnotationNames().size());
        assertEquals(CompilationLevel.SIMPLE_OPTIMIZATIONS, options.getCompilationLevel());
        assertFalse(options.debug); // Default for debug is false
        assertFalse(options.useTypesForOptimization); // Default for useTypesForOptimization is false
        assertFalse(options.generateExports);
        assertEquals(WarningLevel.DEFAULT, options.getWarningLevel());
        assertFalse(options.prettyPrint);
        assertFalse(options.printInputDelimiter);
        assertFalse(options.getPreferSingleQuotes());
        assertTrue(options.closurePass);
        assertFalse(options.jqueryPass);
        assertFalse(options.angularPass);
        assertNull(options.getMessageBundle());
        // Default for i18n warnings is not explicitly set here, check if it's OFF for ADVANCED_OPTIMIZATIONS
        // For SIMPLE_OPTIMIZATIONS, it should not automatically turn off i18n warnings.
    }

    @Test
    public void testCreateOptions_Formatting() throws Exception {
        String[] args = {"--formatting", "PRETTY_PRINT", "--formatting", "SINGLE_QUOTES"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
        assertTrue(options.getPreferSingleQuotes());
    }

    @Test
    public void testCreateOptions_CompilationLevel() throws Exception {
        String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, options.getCompilationLevel());
    }

    @Test
    public void testCreateOptions_Debug() throws Exception {
        String[] args = {"--debug"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.debug);
    }

    @Test
    public void testCreateOptions_UseTypesForOptimization() throws Exception {
        String[] args = {"--use_types_for_optimization"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.useTypesForOptimization);
    }

    @Test
    public void testCreateOptions_GenerateExports() throws Exception {
        String[] args = {"--generate_exports"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.generateExports);
    }

    @Test
    public void testCreateOptions_WarningLevel() throws Exception {
        String[] args = {"--warning_level", "VERBOSE"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertEquals(WarningLevel.VERBOSE, options.getWarningLevel());
    }

    @Test
    public void testCreateOptions_Jquery() throws Exception {
        String[] args = {"--process_jquery_primitives"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertEquals(new JqueryCodingConvention().getClass(), options.getCodingConvention().getClass());
        assertTrue(options.jqueryPass);
    }

    @Test
    public void testCreateOptions_AngularPass() throws Exception {
        String[] args = {"--angular_pass"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.angularPass);
    }

    @Test
    public void testCreateOptions_TranslationsFile() throws Exception {
        String[] args = {"--translations_file", "test.xtb"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options.getMessageBundle());
    }

    @Test
    public void testCreateOptions_TranslationsFile_Advanced() throws Exception {
        String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS", "--translations_file", "test.xtb"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertNotNull(options.getMessageBundle());
        assertEquals(CheckLevel.OFF, options.getJsMessageCycleWarning());
    }

    @Test
    public void testCreateOptions_NoTranslationsFile_Advanced() throws Exception {
        String[] args = {"--compilation_level", "ADVANCED_OPTIMIZATIONS"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertNull(options.getMessageBundle());
        assertEquals(CheckLevel.OFF, options.getJsMessageCycleWarning());
    }

    @Test
    public void testCreateOptions_NoTranslationsFile_Simple() throws Exception {
        String[] args = {"--compilation_level", "SIMPLE_OPTIMIZATIONS"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertNull(options.getMessageBundle());
    }

    @Test
    public void testCreateOptions_ExtraAnnotationNames() throws Exception {
        String[] args = {"--extra_annotation_name", "MyAnnotation", "--extra_annotation_name", "Another"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertEquals(2, options.getExtraAnnotationNames().size());
        assertTrue(options.getExtraAnnotationNames().contains("MyAnnotation"));
        assertTrue(options.getExtraAnnotationNames().contains("Another"));
    }

    @Test
    public void testCreateOptions_ClosurePrimitives_Implied() throws Exception {
        String[] args = {"--common_js_entry_module", "entry.js", "--process_common_js_modules"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.closurePass);
    }

    @Test
    public void testCreateOptions_ManageClosureDependencies_Implied() throws Exception {
        String[] args = {"--common_js_entry_module", "entry.js", "--process_common_js_modules"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.manageClosureDependencies);
    }
    
    @Test
    public void testCreateOptions_ClosureEntryPoint_Implied() throws Exception {
        String[] args = {"--closure_entry_point", "my.ns.Main"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        CompilerOptions options = runner.createOptions();
        assertTrue(options.manageClosureDependencies);
    }

    @Test
    public void testCreateCompiler_Default() throws Exception {
        String[] args = {};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        Compiler compiler = runner.createCompiler();
        assertNotNull(compiler);
        assertEquals(System.err, compiler.getErrorPrintStream());
    }

    @Test
    public void testCreateCompiler_CustomStream() throws Exception {
        PrintStream mockErr = new PrintStream(ByteStreams.nullOutputStream());
        String[] args = {};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, mockErr);
        Compiler compiler = runner.createCompiler();
        assertNotNull(compiler);
        assertEquals(mockErr, compiler.getErrorPrintStream());
    }

    @Test
    public void testCreateExterns_Default() throws Exception {
        String[] args = {};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<SourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        assertFalse(externs.isEmpty());
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("es3.js")));
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("es5.js")));
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("w3c_event.js")));
    }

    @Test
    public void testCreateExterns_UseOnlyCustomExterns() throws Exception {
        String[] args = {"--use_only_custom_externs", "--externs", "custom.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<SourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        assertEquals(1, externs.size());
        assertEquals("externs.zip//custom.js", externs.get(0).getName());
    }
    
    @Test
    public void testCreateExterns_CustomAndDefault() throws Exception {
        String[] args = {"--externs", "custom.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        List<SourceFile> externs = runner.createExterns();
        assertNotNull(externs);
        assertTrue(externs.size() > CommandLineRunner.DEFAULT_EXTERNS_NAMES.size()); 
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("externs.zip//es3.js")));
        assertTrue(externs.stream().anyMatch(e -> e.getName().contains("externs.zip//custom.js")));
    }

    @Test
    public void testShouldRunCompiler_ValidConfig() throws Exception {
        String[] args = {"--js", "input.js"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompiler_InvalidConfig() throws Exception {
        String[] args = {"--process_common_js_modules"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.shouldRunCompiler());
    }

    // --- CommandLineRunner.Flags.BooleanOptionHandler tests ---

    @Test
    public void testBooleanOptionHandler_TrueValues() throws Exception {
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(null, null, new DummySetter<Boolean>());
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"true"})) == 1);
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"on"})) == 1);
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"yes"})) == 1);
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"1"})) == 1);
    }

    @Test
    public void testBooleanOptionHandler_FalseValues() throws Exception {
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(null, null, new DummySetter<Boolean>());
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"false"})) == 1);
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"off"})) == 1);
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"no"})) == 1);
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"0"})) == 1);
    }

    @Test
    public void testBooleanOptionHandler_DefaultTrue() throws Exception {
        CommandLineRunner.Flags.BooleanOptionHandler handler =
            new CommandLineRunner.Flags.BooleanOptionHandler(null, null, new DummySetter<Boolean>());
        assertTrue(handler.parseArguments(new MockParameters(new String[]{})) == 0); // No value, defaults to true
        assertTrue(handler.parseArguments(new MockParameters(new String[]{"something_else"})) == 0); // Unknown value, defaults to true
    }
    
    // Dummy implementation for testing Setter interface
    private static class DummySetter<T> implements Setter<T> {
        T value;
        @Override
        public void addValue(T value) throws CmdLineException { this.value = value; }
        @Override
        public boolean isMultiValued() { return false; }
        @Override
        public Class<T> getType() { return (Class<T>) value.getClass(); }
        @Override
        public FieldSetter asFieldSetter() { return null; } // Not used in this context
        @Override
        public AnnotatedElement asAnnotatedElement() { return null; } // Not used in this context
    }

    // Mock implementation for Parameters interface
    private static class MockParameters implements Parameters {
        private final String[] params;
        private int index = 0;

        MockParameters(String[] params) {
            this.params = params;
        }

        @Override
        public String getParameter(int index) throws CmdLineException {
            if (index < 0 || index >= params.length) {
                throw new CmdLineException(null, "Index out of bounds");
            }
            return params[index];
        }

        @Override
        public int size() {
            return params.length;
        }
    }
    
    // --- CommandLineRunner.Flags.WarningGuardSetter tests ---
    
    @Test
    public void testWarningGuardSetter_AddsLevelAndName() throws Exception {
        Setter<String> mockSetter = new DummySetter<>();
        CommandLineRunner.Flags.WarningGuardSetter setter = 
            new CommandLineRunner.Flags.WarningGuardSetter(mockSetter, CheckLevel.ERROR);
        
        setter.addValue("someWarning");
        
        assertEquals(1, CommandLineRunner.Flags.guardLevels.size());
        CommandLineRunner.Flags.GuardLevel guardLevel = CommandLineRunner.Flags.guardLevels.get(0);
        assertEquals("someWarning", guardLevel.name);
        assertEquals(CheckLevel.ERROR, guardLevel.level);
        
        assertEquals("someWarning", mockSetter.value);
    }
    
    // --- CommandLineRunner.Flags.getWarningGuardSpec tests ---
    
    @Test
    public void testGetWarningGuardSpec_Empty() throws Exception {
        CommandLineRunner.Flags.guardLevels.clear();
        WarningGuardSpec spec = CommandLineRunner.Flags.getWarningGuardSpec();
        assertNotNull(spec);
        assertTrue(spec.getGuards().isEmpty());
    }
    
    @Test
    public void testGetWarningGuardSpec_Populated() throws Exception {
        CommandLineRunner.Flags.guardLevels.clear();
        CommandLineRunner.Flags.guardLevels.add(new CommandLineRunner.Flags.GuardLevel("checkTypes", CheckLevel.WARNING));
        CommandLineRunner.Flags.guardLevels.add(new CommandLineRunner.Flags.GuardLevel("accessControls", CheckLevel.ERROR));
        
        WarningGuardSpec spec = CommandLineRunner.Flags.getWarningGuardSpec();
        assertNotNull(spec);
        assertEquals(2, spec.getGuards().size());
        
        assertTrue(spec.getGuards().stream()
            .anyMatch(g -> g.getLevel() == CheckLevel.WARNING && g.getName().equals("checkTypes")));
        assertTrue(spec.getGuards().stream()
            .anyMatch(g -> g.getLevel() == CheckLevel.ERROR && g.getName().equals("accessControls")));
    }
    
    // --- CommandLineRunner.FormattingOption tests ---
    
    @Test
    public void testFormattingOption_ApplyPrettyPrint() throws Exception {
        CompilerOptions options = new CompilerOptions();
        FormattingOption.PRETTY_PRINT.applyToOptions(options);
        assertTrue(options.prettyPrint);
    }
    
    @Test
    public void testFormattingOption_ApplyPrintInputDelimiter() throws Exception {
        CompilerOptions options = new CompilerOptions();
        FormattingOption.PRINT_INPUT_DELIMITER.applyToOptions(options);
        assertTrue(options.printInputDelimiter);
    }
    
    @Test
    public void testFormattingOption_ApplySingleQuotes() throws Exception {
        CompilerOptions options = new CompilerOptions();
        FormattingOption.SINGLE_QUOTES.applyToOptions(options);
        assertTrue(options.getPreferSingleQuotes());
    }

    // --- CommandLineRunner constructor and initConfigFromFlags tests ---

    @Test
    public void testConstructor_EmptyArgs() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, System.out, System.err);
        assertTrue(runner.isConfigValid);
    }

    @Test
    public void testConstructor_InvalidArgs() throws Exception {
        String[] args = {"--unknown_option"};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.isConfigValid);
    }

    @Test
    public void testConstructor_FlagFileError() throws Exception {
        String nonExistentFile = "non_existent_flag_file.txt";
        String[] args = {"--flagfile", nonExistentFile};
        CommandLineRunner runner = new CommandLineRunner(args, System.out, System.err);
        assertFalse(runner.isConfigValid);
    }
}
```