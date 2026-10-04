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
import java.io.ByteArrayInputStream;

public class AbstractCommandLineRunnerTest {

    // Test the constructor with no arguments.
    @Test
    public void testConstructorNoArgs() throws Exception {
        // Use a concrete subclass to instantiate AbstractCommandLineRunner
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertNotNull(runner);
        assertNotNull(runner.getCommandLineConfig());
        assertTrue(runner.getErrorPrintStream() instanceof PrintStream);
    }

    // Test the constructor with PrintStream arguments.

    // Test enableTestMode with valid suppliers.
    @Test
    public void testEnableTestMode() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        Supplier<List<JSSourceFile>> externsSupplier = () -> ImmutableList.of();
        Supplier<List<JSSourceFile>> inputsSupplier = () -> ImmutableList.of();
        Supplier<List<JSModule>> modulesSupplier = () -> ImmutableList.of();
        Function<Integer, Boolean> exitCodeReceiver = (code) -> true;

        runner.enableTestMode(externsSupplier, inputsSupplier, modulesSupplier, exitCodeReceiver);
        assertTrue(runner.isInTestMode());
    }

    // Test enableTestMode with null inputsSupplier and modulesSupplier.
    @Test(expected = IllegalArgumentException.class)
    public void testEnableTestModeNullInputsAndModules() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        Supplier<List<JSSourceFile>> externsSupplier = () -> ImmutableList.of();
        Function<Integer, Boolean> exitCodeReceiver = (code) -> true;
        runner.enableTestMode(externsSupplier, null, null, exitCodeReceiver);
    }

    // Test enableTestMode with both inputsSupplier and modulesSupplier non-null.
    @Test(expected = IllegalArgumentException.class)
    public void testEnableTestModeBothInputsAndModules() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        Supplier<List<JSSourceFile>> externsSupplier = () -> ImmutableList.of();
        Supplier<List<JSSourceFile>> inputsSupplier = () -> ImmutableList.of();
        Supplier<List<JSModule>> modulesSupplier = () -> ImmutableList.of();
        Function<Integer, Boolean> exitCodeReceiver = (code) -> true;
        runner.enableTestMode(externsSupplier, inputsSupplier, modulesSupplier, exitCodeReceiver);
    }

    // Test getCommandLineConfig.
    @Test
    public void testGetCommandLineConfig() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertNotNull(runner.getCommandLineConfig());
    }

    // Test getCompiler when it's null.
    @Test
    public void testGetCompilerWhenNull() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertNull(runner.getCompiler());
    }

    // Test getDiagnosticGroups when compiler is null.
    @Test
    public void testGetDiagnosticGroupsWhenCompilerNull() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertNotNull(runner.getDiagnosticGroups());
    }

    // Test createInputs with a single file.
    @Test
    public void testCreateInputsSingleFile() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile = File.createTempFile("test", ".js");
        tempFile.deleteOnExit();
        List<String> files = Collections.singletonList(tempFile.getAbsolutePath());
        List<JSSourceFile> inputs = runner.createInputs(files, true);
        assertEquals(1, inputs.size());
        assertEquals(tempFile.getName(), inputs.get(0).getName());
    }

    // Test createInputs with stdin.
    @Test
    public void testCreateInputsStdin() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        List<String> files = Collections.singletonList("-");
        // Mock System.in for this test.
        InputStream originalSystemIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream("test input".getBytes()));
            List<JSSourceFile> inputs = runner.createInputs(files, true);
            assertEquals(1, inputs.size());
            assertEquals("stdin", inputs.get(0).getName());
        } finally {
            System.setIn(originalSystemIn);
        }
    }

    // Test createInputs with stdin when not allowed.

    // Test createInputs with multiple files.
    @Test
    public void testCreateInputsMultipleFiles() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile1 = File.createTempFile("test1", ".js");
        tempFile1.deleteOnExit();
        File tempFile2 = File.createTempFile("test2", ".js");
        tempFile2.deleteOnExit();
        List<String> files = ImmutableList.of(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());
        List<JSSourceFile> inputs = runner.createInputs(files, true);
        assertEquals(2, inputs.size());
        assertEquals(tempFile1.getName(), inputs.get(0).getName());
        assertEquals(tempFile2.getName(), inputs.get(1).getName());
    }

    // Test createJsModules with valid specs.
    @Test
    public void testCreateJsModulesValid() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile1 = File.createTempFile("mod1_1", ".js");
        tempFile1.deleteOnExit();
        File tempFile2 = File.createTempFile("mod1_2", ".js");
        tempFile2.deleteOnExit();
        File tempFile3 = File.createTempFile("mod2_1", ".js");
        tempFile3.deleteOnExit();

        List<String> jsFiles = ImmutableList.of(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath(), tempFile3.getAbsolutePath());
        List<String> specs = ImmutableList.of("mod1:2", "mod2:1");

        List<JSModule> modules = runner.createJsModules(specs, jsFiles);
        assertEquals(2, modules.size());

        JSModule mod1 = modules.get(0);
        assertEquals("mod1", mod1.getName());
        assertEquals(2, mod1.getInputs().size());
        assertEquals(tempFile1.getName(), mod1.getInputs().get(0).getName());
        assertEquals(tempFile2.getName(), mod1.getInputs().get(1).getName());

        JSModule mod2 = modules.get(1);
        assertEquals("mod2", mod2.getName());
        assertEquals(1, mod2.getInputs().size());
        assertEquals(tempFile3.getName(), mod2.getInputs().get(0).getName());
    }

    // Test createJsModules with dependencies.
    @Test
    public void testCreateJsModulesWithDependencies() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile1 = File.createTempFile("modA_1", ".js");
        tempFile1.deleteOnExit();
        File tempFile2 = File.createTempFile("modB_1", ".js");
        tempFile2.deleteOnExit();
        File tempFile3 = File.createTempFile("modC_1", ".js");
        tempFile3.deleteOnExit();

        List<String> jsFiles = ImmutableList.of(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath(), tempFile3.getAbsolutePath());
        List<String> specs = ImmutableList.of("modA:1", "modB:1:modA", "modC:1:modA,modB");

        List<JSModule> modules = runner.createJsModules(specs, jsFiles);
        assertEquals(3, modules.size());

        JSModule foundModA = null, foundModB = null, foundModC = null;
        for (JSModule m : modules) {
            if (m.getName().equals("modA")) foundModA = m;
            if (m.getName().equals("modB")) foundModB = m;
            if (m.getName().equals("modC")) foundModC = m;
        }

        assertEquals("modA", foundModA.getName());
        assertEquals(1, foundModA.getInputs().size());
        assertEquals(tempFile1.getName(), foundModA.getInputs().get(0).getName());
        assertTrue(foundModA.getDependencies().isEmpty());

        assertEquals("modB", foundModB.getName());
        assertEquals(1, foundModB.getInputs().size());
        assertEquals(tempFile2.getName(), foundModB.getInputs().get(0).getName());
        assertEquals(1, foundModB.getDependencies().size());
        assertTrue(foundModB.getDependencies().contains(foundModA));

        assertEquals("modC", foundModC.getName());
        assertEquals(1, foundModC.getInputs().size());
        assertEquals(tempFile3.getName(), foundModC.getInputs().get(0).getName());
        assertEquals(2, foundModC.getDependencies().size());
        assertTrue(foundModC.getDependencies().contains(foundModA));
        assertTrue(foundModC.getDependencies().contains(foundModB));
    }

    // Test createJsModules with duplicate module names.

    // Test createJsModules with not enough js files.

    // Test createJsModules with too many js files.

    // Test createJsModules with invalid module name.

    // Test createJsModules with invalid spec format.

    // Test createJsModules with dependency on unknown module.

    // Test parseModuleWrappers with valid specs.
    @Test
    public void testParseModuleWrappersValid() throws Exception {
        List<JSModule> modules = ImmutableList.of(
            new JSModule("mod1"), new JSModule("mod2"));
        List<String> specs = ImmutableList.of("mod1:wrapper1", "mod2:%s");
        Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
        assertEquals("wrapper1", wrappers.get("mod1"));
        assertEquals("%s", wrappers.get("mod2"));
    }

    // Test parseModuleWrappers with missing placeholder.

    // Test parseModuleWrappers with unknown module.

    // Test parseModuleWrappers with invalid spec format.

    // Test writeOutput with a wrapper.
    @Test
    public void testWriteOutputWithWrapper() throws Exception {
        StringWriter sw = new StringWriter();
        String code = "console.log('hello');";
        String wrapper = "<html><body>%s</body></html>";
        AbstractCommandLineRunner.writeOutput(sw, null, code, wrapper, "%s");
        assertEquals("<html><body>console.log('hello');</body></html>\n", sw.toString());
    }

    // Test writeOutput without a wrapper.
    @Test
    public void testWriteOutputWithoutWrapper() throws Exception {
        StringWriter sw = new StringWriter();
        String code = "console.log('hello');";
        AbstractCommandLineRunner.writeOutput(sw, null, code, "", "%s");
        assertEquals("console.log('hello');\n", sw.toString());
    }

    // Test writeOutput with an empty code.
    @Test
    public void testWriteOutputEmptyCode() throws Exception {
        StringWriter sw = new StringWriter();
        String wrapper = "<html><body>%s</body></html>";
        AbstractCommandLineRunner.writeOutput(sw, null, "", wrapper, "%s");
        assertEquals("<html><body></body></html>\n", sw.toString());
    }

    // Test writeOutput with a wrapper without placeholder.
    @Test
    public void testWriteOutputWrapperNoPlaceholder() throws Exception {
        StringWriter sw = new StringWriter();
        String code = "console.log('hello');";
        String wrapper = "<html><body></body></html>";
        AbstractCommandLineRunner.writeOutput(sw, null, code, wrapper, "%s");
        assertEquals("<html><body></body></html>\n", sw.toString()); // Code is not appended
    }

    // Test fileNameToOutputWriter.

    // Test fileNameToOutputWriter with null file name.

    // Test outputSourceMap with a path.

    // Test getMapPath with empty outputFile.

    // Test getMapPath with non-empty outputFile.

    // Test outputNameMaps with create_name_map_files flag.

    // Test createDefineOrTweakReplacements with defines.

    // Test createDefineOrTweakReplacements with tweaks.

    // Test createDefineOrTweakReplacements with invalid define syntax.
    @Test(expected = RuntimeException.class)
    public void testCreateDefineOrTweakReplacementsInvalidDefineSyntax() {
        CompilerOptions options = new CompilerOptions();
        List<String> defines = ImmutableList.of("INVALID_DEFINE");
        AbstractCommandLineRunner.createDefineOrTweakReplacements(defines, options, false);
    }

    // Test createDefineOrTweakReplacements with invalid tweak syntax.
    @Test(expected = RuntimeException.class)
    public void testCreateDefineOrTweakReplacementsInvalidTweakSyntax() {
        CompilerOptions options = new CompilerOptions();
        List<String> tweaks = ImmutableList.of("INVALID_TWEAK");
        AbstractCommandLineRunner.createDefineOrTweakReplacements(tweaks, options, true);
    }

    // Test getInputCharset with a supported charset.

    // Test getInputCharset with an unsupported charset.

    // Test getInputCharset with empty charset.

    // Test getOutputCharset with a supported charset.

    // Test getOutputCharset with an unsupported charset.

    // Test getOutputCharset with empty charset.

    // Test shouldGenerateMapPerModule when sourceMapOutputPath is null.

    // Test shouldGenerateMapPerModule when sourceMapOutputPath contains %outname%.

    // Test shouldGenerateMapPerModule when sourceMapOutputPath does not contain %outname%.

    // Test expandCommandLinePath with a module.

    // Test expandCommandLinePath with modules and prefix.

    // Test expandCommandLinePath without modules.

    // Test expandSourceMapPath with a module.

    // Test expandSourceMapPath without a module.

    // Test expandSourceMapPath with null sourceMapOutputPath.
    @Test
    public void testExpandSourceMapPathNull() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = null;
        assertNull(runner.expandSourceMapPath(options, null));
    }

    // Test expandManifest with a module.

    // Test expandManifest without a module.

    // Test expandManifest with null outputManifest.

    // New tests for uncalled methods

    // Test shouldRunCompiler when config is valid.
    @Test
    public void testShouldRunCompilerValid() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertTrue(runner.shouldRunCompiler());
    }

    // Test shouldRunCompiler when config is invalid.
    @Test
    public void testShouldRunCompilerInvalid() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--invalid-flag"}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertFalse(runner.shouldRunCompiler());
    }

    // Test getDefaultExterns.

    // Test parseArguments with a simple flag and value.

    // Test parseArguments with a quoted value.

    // Test parseArguments with a flag without value (should be handled by args4j).

    // Test initConfigFromFlags with a valid flag file.

    // Test initConfigFromFlags with an invalid flag file.

    // Test initConfigFromFlags with --flagfile in flag file.

    // Test createOptions with basic settings.
    @Test
    public void testCreateOptionsBasic() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };

        runner.getCommandLineConfig().setJsOutputFile("output.js");
        runner.getCommandLineConfig().setCharset("UTF-8");

        CompilerOptions options = runner.createOptions();
        assertEquals("output.js", options.jsOutputFile);
        assertEquals("UTF-8", options.outputCharset);
    }

    // Test createOptions for compilation level.

    // Test createOptions for warning level.

    // Test createOptions for formatting.
    @Test
    public void testCreateOptionsFormatting() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--formatting=PRETTY_PRINT"}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
    }

    // Test createCompiler.
    @Test
    public void testCreateCompiler() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() {
                return new Compiler(getErrorPrintStream());
            }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        Compiler compiler = runner.createCompiler();
        assertNotNull(compiler);
        assertTrue(compiler instanceof Compiler);
    }

    // Test createExterns when test mode is enabled.
    @Test
    public void testCreateExternsTestMode() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        Supplier<List<JSSourceFile>> externsSupplier = () -> ImmutableList.of(JSSourceFile.fromCode("test.js", "var x;"));
        Function<Integer, Boolean> exitCodeReceiver = (code) -> true;
        runner.enableTestMode(externsSupplier, null, null, exitCodeReceiver);
        List<JSSourceFile> externs = runner.createExterns();
        assertEquals(1, externs.size());
        assertEquals("test.js", externs.get(0).getName());
        assertEquals("var x;", externs.get(0).getCodeNoCache());
    }

    // Test createExterns when not in test mode and no custom externs.

    // Test createExterns when use_only_custom_externs is true.
    @Test
    public void testCreateExternsOnlyCustom() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--use_only_custom_externs", "--externs=custom.js"}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        List<JSSourceFile> externs = runner.createExterns();
        assertEquals(1, externs.size());
        assertEquals("custom.js", externs.get(0).getName());
    }

    // Test processResults when printTree is true.

    // Test processResults when printAst is true.

    // Test processResults when printPassGraph is true.
    @Test
    public void testProcessResultsPrintPassGraph() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        PassConfig mockPassConfig = Mockito.mock(PassConfig.class);
        PassGraph mockPassGraph = Mockito.mock(PassGraph.class);
        StringWriter sw = new StringWriter();

        when(mockCompiler.getPassConfig()).thenReturn(mockPassConfig);
        when(mockPassConfig.getPassGraph()).thenReturn(mockPassGraph);
        when(mockPassGraph.toString()).thenReturn("pass graph output");

        CommandLineRunner runner = new CommandLineRunner(new String[]{"--print_pass_graph"}, new PrintStream(sw), System.err) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        };

        Result result = new Result();
        result.success = true;
        runner.processResults(result, null, new CompilerOptions());

        assertTrue(sw.toString().contains("pass graph output"));
    }

    // Test processResults when computePhaseOrdering is true.
    @Test
    public void testProcessResultsComputePhaseOrdering() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        Result result = new Result();
        result.success = true;

        CommandLineRunner runner = new CommandLineRunner(new String[]{"--compute_phase_ordering"}, System.out, System.err) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        };

        int errCode = runner.processResults(result, null, new CompilerOptions());
        assertEquals(0, errCode);
    }

    // Test processResults when the compilation is successful and there are modules.
    @Test
    public void testProcessResultsWithModules() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        JSModule module1 = new JSModule("mod1");
        JSModule module2 = new JSModule("mod2");
        List<JSModule> modules = ImmutableList.of(module1, module2);
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "module.map";
        options.externExportsPath = "exports.js";

        StringWriter sw = new StringWriter();
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--module_output_path_prefix=./modules/", "--module_wrapper=mod1:wrapper1", "--module_wrapper=mod2:wrapper2", "--output_manifest=manifest.txt"}, new PrintStream(sw), System.err) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return options; }
            @Override
            protected Writer fileNameToOutputWriter(String fileName) throws IOException {
                return new StringWriter();
            }
        };
        SourceMap mockSourceMap = Mockito.mock(SourceMap.class);
        when(mockCompiler.getSourceMap()).thenReturn(mockSourceMap);
        when(mockCompiler.toSource(module1)).thenReturn("module1 code");
        when(mockCompiler.toSource(module2)).thenReturn("module2 code");

        Result result = new Result();
        result.success = true;
        result.externExport = "extern export code";

        runner.processResults(result, modules, options);

        verify(mockCompiler, times(2)).toSource(any(JSModule.class));
        verify(mockCompiler, times(2)).getSourceMap();
    }

    // Test processResults when the compilation is successful and there is no module.
    @Test
    public void testProcessResultsNoModules() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        StringWriter sw = new StringWriter();
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "single.map";
        options.externExportsPath = "exports.js";

        CommandLineRunner runner = new CommandLineRunner(new String[]{"--output_wrapper=<html>%s</html>", "--output_manifest=manifest.txt"}, new PrintStream(sw), System.err) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return options; }
            @Override
            protected Writer fileNameToOutputWriter(String fileName) throws IOException {
                return new StringWriter();
            }
        };
        SourceMap mockSourceMap = Mockito.mock(SourceMap.class);
        when(mockCompiler.getSourceMap()).thenReturn(mockSourceMap);
        when(mockCompiler.toSource()).thenReturn("compiled code");

        Result result = new Result();
        result.success = true;
        result.externExport = "extern export code";

        runner.processResults(result, null, options);

        verify(mockCompiler).getSourceMap();
        verify(mockCompiler).toSource();
    }

    // Test processResults when compilation fails.
    @Test
    public void testProcessResultsFailure() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        Result result = new Result();
        result.success = false;
        result.errors = new DiagnosticGroup[] {Mockito.mock(DiagnosticGroup.class)};

        StringWriter sw = new StringWriter();
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, new PrintStream(sw), System.err) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        };

        int errCode = runner.processResults(result, null, new CompilerOptions());
        assertEquals(1, errCode);
    }

    // Test setRunOptions with various configurations.
    @Test
    public void testSetRunOptions() throws Exception {
        CompilerOptions options = new CompilerOptions();
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        };

        runner.config.warningGuards = new WarningGuardSpec();
        runner.config.warningGuards.add(CheckLevel.ERROR, "checkTypes");
        runner.config.define.add("MY_DEFINE=true");
        runner.config.tweak.add("MY_TWEAK=1.0");
        runner.config.tweakProcessing = TweakProcessing.ALL;
        runner.config.manageClosureDependencies = true;
        runner.config.closureEntryPoints.add("goog.global");
        runner.config.jscompDevMode = CompilerOptions.DevMode.VERBOSE;
        runner.config.codingConvention = new DefaultCodingConvention();
        runner.config.summaryDetailLevel = 3;
        runner.config.jsOutputFile = "out.js";
        runner.config.createSourceMap = "map.js";
        runner.config.sourceMapDetailLevel = SourceMap.DetailLevel.ALL;
        runner.config.sourceMapFormat = SourceMap.Format.DEFAULT;
        runner.config.languageIn = "ECMASCRIPT5";
        runner.config.acceptConstKeyword = true;

        runner.setRunOptions(options);

        assertEquals(CompilerOptions.DevMode.VERBOSE, options.devMode);
        assertEquals("US-ASCII", options.outputCharset);
        assertEquals("map.js", options.sourceMapOutputPath);
        assertEquals(SourceMap.DetailLevel.ALL, options.sourceMapDetailLevel);
        assertEquals(SourceMap.Format.DEFAULT, options.sourceMapFormat);
        assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT5, options.languageIn);
        assertTrue(options.acceptConstKeyword);
        assertTrue(options.manageClosureDependencies);
    }

    // Test run() method when testMode is true.
    @Test
    public void testRunTestMode() throws Exception {
        CommandLineRunner runner = spy(new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return mock(Compiler.class); }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        });
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        Function<Integer, Boolean> exitCodeReceiver = (code) -> {
            assertEquals(0, code);
            return true;
        };
        Supplier<List<JSSourceFile>> externsSupplier = () -> ImmutableList.of();
        Supplier<List<JSSourceFile>> inputsSupplier = () -> ImmutableList.of();
        Supplier<List<JSModule>> modulesSupplier = () -> ImmutableList.of();

        runner.enableTestMode(externsSupplier, inputsSupplier, modulesSupplier, exitCodeReceiver);

        doReturn(0).when(runner).doRun();

        runner.run();
        verify(runner).doRun();
        verify(exitCodeReceiver).apply(0);
    }

    // Test run() method when testMode is false and doRun returns error code.
    @Test
    public void testRunNonTestModeError() throws Exception {
        CommandLineRunner runner = spy(new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return mock(Compiler.class); }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        });

        doReturn(-1).when(runner).doRun();

        runner.run();
        verify(runner).doRun();
        // Cannot directly test System.exit() behavior without additional mocking frameworks.
    }
}





