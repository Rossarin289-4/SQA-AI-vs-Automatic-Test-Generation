```java
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
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

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
    @Test
    public void testConstructorWithStreams() throws Exception {
        PrintStream mockOut = new PrintStream(new ByteArrayOutputStream());
        PrintStream mockErr = new PrintStream(new ByteArrayOutputStream());
        CommandLineRunner runner = new CommandLineRunner(new String[]{}, mockOut, mockErr) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertNotNull(runner);
        assertEquals(mockErr, runner.getErrorPrintStream());
    }

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
    @Test(expected = FlagUsageException.class)
    public void testCreateInputsStdinNotAllowed() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        List<String> files = Collections.singletonList("-");
        runner.createInputs(files, false);
    }

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
    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesDuplicateName() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile = File.createTempFile("mod1", ".js");
        tempFile.deleteOnExit();
        List<String> jsFiles = Collections.singletonList(tempFile.getAbsolutePath());
        List<String> specs = ImmutableList.of("mod1:1", "mod1:1");
        runner.createJsModules(specs, jsFiles);
    }

    // Test createJsModules with not enough js files.
    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesNotEnoughFiles() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile = File.createTempFile("mod1", ".js");
        tempFile.deleteOnExit();
        List<String> jsFiles = Collections.singletonList(tempFile.getAbsolutePath());
        List<String> specs = ImmutableList.of("mod1:2");
        runner.createJsModules(specs, jsFiles);
    }

    // Test createJsModules with too many js files.
    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesTooManyFiles() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile1 = File.createTempFile("mod1_1", ".js");
        tempFile1.deleteOnExit();
        File tempFile2 = File.createTempFile("mod1_2", ".js");
        tempFile2.deleteOnExit();
        List<String> jsFiles = ImmutableList.of(tempFile1.getAbsolutePath(), tempFile2.getAbsolutePath());
        List<String> specs = Collections.singletonList("mod1:1");
        runner.createJsModules(specs, jsFiles);
    }

    // Test createJsModules with invalid module name.
    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesInvalidModuleName() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile = File.createTempFile("mod1", ".js");
        tempFile.deleteOnExit();
        List<String> jsFiles = Collections.singletonList(tempFile.getAbsolutePath());
        List<String> specs = ImmutableList.of("mod-1:1"); // Invalid module name
        runner.createJsModules(specs, jsFiles);
    }

    // Test createJsModules with invalid spec format.
    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesInvalidSpecFormat() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile = File.createTempFile("mod1", ".js");
        tempFile.deleteOnExit();
        List<String> jsFiles = Collections.singletonList(tempFile.getAbsolutePath());
        List<String> specs = ImmutableList.of("mod1"); // Missing parts
        runner.createJsModules(specs, jsFiles);
    }

    // Test createJsModules with dependency on unknown module.
    @Test(expected = FlagUsageException.class)
    public void testCreateJsModulesUnknownDependency() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        File tempFile = File.createTempFile("mod1", ".js");
        tempFile.deleteOnExit();
        List<String> jsFiles = Collections.singletonList(tempFile.getAbsolutePath());
        List<String> specs = ImmutableList.of("mod1:1:unknown_mod");
        runner.createJsModules(specs, jsFiles);
    }

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
    @Test(expected = FlagUsageException.class)
    public void testParseModuleWrappersMissingPlaceholder() throws Exception {
        List<JSModule> modules = ImmutableList.of(new JSModule("mod1"));
        List<String> specs = ImmutableList.of("mod1:wrapper");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    // Test parseModuleWrappers with unknown module.
    @Test(expected = FlagUsageException.class)
    public void testParseModuleWrappersUnknownModule() throws Exception {
        List<JSModule> modules = ImmutableList.of(new JSModule("mod1"));
        List<String> specs = ImmutableList.of("mod2:wrapper%s");
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    // Test parseModuleWrappers with invalid spec format.
    @Test(expected = FlagUsageException.class)
    public void testParseModuleWrappersInvalidSpecFormat() throws Exception {
        List<JSModule> modules = ImmutableList.of(new JSModule("mod1"));
        List<String> specs = ImmutableList.of("mod1wrapper%s"); // Missing colon
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

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
    @Test
    public void testFileNameToOutputWriter() throws Exception {
        File tempFile = File.createTempFile("output", ".txt");
        tempFile.deleteOnExit();
        String fileName = tempFile.getAbsolutePath();

        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };

        Writer writer = null;
        try {
            writer = runner.fileNameToOutputWriter(fileName);
            assertNotNull(writer);
            writer.write("test content");
            writer.flush();
        } finally {
            if (writer != null && writer instanceof Closeable) {
                ((Closeable) writer).close();
            }
        }

        String content = Files.toString(tempFile, Charsets.UTF_8);
        assertEquals("test content", content);
    }

    // Test fileNameToOutputWriter with null file name.
    @Test
    public void testFileNameToOutputWriterNull() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        Writer writer = runner.fileNameToOutputWriter(null);
        assertNull(writer);
    }

    // Test outputSourceMap with a path.
    @Test
    public void testOutputSourceMap() throws IOException {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        SourceMap mockSourceMap = Mockito.mock(SourceMap.class);
        when(mockCompiler.getSourceMap()).thenReturn(mockSourceMap);

        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "test.map";

        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return options; }
            // Override to provide a mock writer
            @Override
            protected Writer fileNameToOutputWriter(String fileName) throws IOException {
                return new StringWriter();
            }
        };

        runner.outputSourceMap(options);
        verify(mockSourceMap).appendTo(any(Writer.class), eq("test.map"));
    }

    // Test getMapPath with empty outputFile.
    @Test
    public void testGetMapPathEmptyOutputFile() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "./output/";
        String path = runner.getMapPath("");
        assertEquals("./output/", path);
    }

    // Test getMapPath with non-empty outputFile.
    @Test
    public void testGetMapPathNonEmptyOutputFile() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        String outputFile = "/path/to/output.js";
        String path = runner.getMapPath(outputFile);
        assertEquals("/path/to/output.js_map.out", path);
    }

    // Test outputNameMaps with create_name_map_files flag.
    @Test
    public void testOutputNameMapsCreateNameMapFiles() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        VariableMap mockVarMap = Mockito.mock(VariableMap.class);
        PropertyMap mockPropMap = Mockito.mock(PropertyMap.class);
        when(mockCompiler.getVariableMap()).thenReturn(mockVarMap);
        when(mockCompiler.getPropertyMap()).thenReturn(mockPropMap);

        CommandLineRunner.CommandLineConfig config = new CommandLineRunner.CommandLineConfig();
        config.createNameMapFiles = true;
        config.jsOutputFile = "output.js";

        CompilerOptions options = new CompilerOptions();
        options.jsOutputFile = "output.js";

        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return options; }
            @Override
            protected CommandLineConfig getCommandLineConfig() { return config; }
            // Mock writer to prevent file creation
            @Override
            protected Writer fileNameToOutputWriter(String fileName) throws IOException {
                return new StringWriter();
            }
        };

        runner.outputNameMaps(options);

        verify(mockVarMap, times(1)).save(anyString());
        verify(mockPropMap, times(1)).save(anyString());

        String expectedVarPath = "_vars_map.out";
        String expectedPropPath = "_props_map.out";

        verify(mockVarMap).save(argThat(path -> path.endsWith(expectedVarPath)));
        verify(mockPropMap).save(argThat(path -> path.endsWith(expectedPropPath)));
    }

    // Test createDefineOrTweakReplacements with defines.
    @Test
    public void testCreateDefineOrTweakReplacementsDefines() {
        CompilerOptions options = new CompilerOptions();
        List<String> defines = ImmutableList.of("MY_DEFINE_BOOL=true", "MY_DEFINE_NUM=123.45", "MY_DEFINE_STR='hello'");
        AbstractCommandLineRunner.createDefineOrTweakReplacements(defines, options, false);

        assertTrue(options.getDefineToBooleanLiteral("MY_DEFINE_BOOL"));
        assertEquals(123.45, options.getDefineToDoubleLiteral("MY_DEFINE_NUM"), 0.001);
        assertEquals("hello", options.getDefineToStringLiteral("MY_DEFINE_STR"));
    }

    // Test createDefineOrTweakReplacements with tweaks.
    @Test
    public void testCreateDefineOrTweakReplacementsTweaks() {
        CompilerOptions options = new CompilerOptions();
        List<String> tweaks = ImmutableList.of("MY_TWEAK_BOOL=false", "MY_TWEAK_NUM=67.89", "MY_TWEAK_STR='world'");
        AbstractCommandLineRunner.createDefineOrTweakReplacements(tweaks, options, true);

        assertFalse(options.getTweakToBooleanLiteral("MY_TWEAK_BOOL"));
        assertEquals(67.89, options.getTweakToDoubleLiteral("MY_TWEAK_NUM"), 0.001);
        assertEquals("world", options.getTweakToStringLiteral("MY_TWEAK_STR"));
    }

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
    @Test
    public void testGetInputCharsetSupported() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.charset = "UTF-16";
        assertEquals(Charset.forName("UTF-16"), runner.getInputCharset());
    }

    // Test getInputCharset with an unsupported charset.
    @Test(expected = FlagUsageException.class)
    public void testGetInputCharsetUnsupported() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.charset = "INVALID-CHARSET";
        runner.getInputCharset();
    }

    // Test getInputCharset with empty charset.
    @Test
    public void testGetInputCharsetEmpty() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.charset = "";
        assertEquals(Charsets.UTF_8, runner.getInputCharset());
    }

    // Test getOutputCharset with a supported charset.
    @Test
    public void testGetOutputCharsetSupported() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.charset = "UTF-16";
        assertEquals("UTF-16", runner.getOutputCharset());
    }

    // Test getOutputCharset with an unsupported charset.
    @Test(expected = FlagUsageException.class)
    public void testGetOutputCharsetUnsupported() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.charset = "INVALID-CHARSET";
        runner.getOutputCharset();
    }

    // Test getOutputCharset with empty charset.
    @Test
    public void testGetOutputCharsetEmpty() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.charset = "";
        assertEquals("US-ASCII", runner.getOutputCharset());
    }

    // Test shouldGenerateMapPerModule when sourceMapOutputPath is null.
    @Test
    public void testShouldGenerateMapPerModuleNullPath() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = null;
        assertFalse(runner.shouldGenerateMapPerModule(options));
    }

    // Test shouldGenerateMapPerModule when sourceMapOutputPath contains %outname%.
    @Test
    public void testShouldGenerateMapPerModuleWithPathPlaceholder() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "path/%outname%.map";
        assertTrue(runner.shouldGenerateMapPerModule(options));
    }

    // Test shouldGenerateMapPerModule when sourceMapOutputPath does not contain %outname%.
    @Test
    public void testShouldGenerateMapPerModuleWithoutPathPlaceholder() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "path/map.map";
        assertFalse(runner.shouldGenerateMapPerModule(options));
    }

    // Test expandCommandLinePath with a module.
    @Test
    public void testExpandCommandLinePathWithModule() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "./modules/";
        runner.config.jsOutputFile = "single_output.js";
        JSModule module = new JSModule("myModule");
        String path = runner.expandCommandLinePath("output/%outname%.js", module);
        assertEquals("output/./modules/myModule.js", path);
    }

    // Test expandCommandLinePath with modules and prefix.
    @Test
    public void testExpandCommandLinePathWithModulesAndPrefix() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "./modules/";
        runner.config.module = Collections.singletonList("mod1:1");
        String path = runner.expandCommandLinePath("output/%outname%.js", null);
        assertEquals("output/./modules/", path);
    }

    // Test expandCommandLinePath without modules.
    @Test
    public void testExpandCommandLinePathWithoutModules() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "";
        runner.config.jsOutputFile = "single_output.js";
        String path = runner.expandCommandLinePath("output/%outname%.js", null);
        assertEquals("output/single_output.js", path);
    }

    // Test expandSourceMapPath with a module.
    @Test
    public void testExpandSourceMapPathWithModule() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "./modules/";
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "maps/%outname%.map";
        JSModule module = new JSModule("myModule");
        assertEquals("maps/./modules/myModule.map", runner.expandSourceMapPath(options, module));
    }

    // Test expandSourceMapPath without a module.
    @Test
    public void testExpandSourceMapPathWithoutModule() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "";
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "maps/%outname%.map";
        assertEquals("maps/", runner.expandSourceMapPath(options, null));
    }

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
    @Test
    public void testExpandManifestWithModule() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "./modules/";
        runner.config.outputManifest = "manifest/%outname%.manifest";
        JSModule module = new JSModule("myModule");
        assertEquals("manifest/./modules/myModule.manifest", runner.expandManifest(module));
    }

    // Test expandManifest without a module.
    @Test
    public void testExpandManifestWithoutModule() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.moduleOutputPathPrefix = "";
        runner.config.outputManifest = "manifest/%outname%.manifest";
        assertEquals("manifest/", runner.expandManifest(null));
    }

    // Test expandManifest with null outputManifest.
    @Test
    public void testExpandManifestNull() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.outputManifest = null;
        assertNull(runner.expandManifest(null));
    }

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
    @Test
    public void testGetDefaultExterns() throws IOException {
        List<JSSourceFile> externs = AbstractCommandLineRunner.getDefaultExterns();
        assertNotNull(externs);
        boolean foundEs5 = false;
        for (JSSourceFile extern : externs) {
            if (extern.getName().endsWith("es5.js")) {
                foundEs5 = true;
                break;
            }
        }
        assertTrue(foundEs5);
    }

    // Test parseArguments with a simple flag and value.
    @Test
    public void testParseArgumentsSimple() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        String[] args = {"--js=file.js"};
        List<String> processedArgs = runner.processArgs(args);
        assertEquals(ImmutableList.of("--js", "file.js"), processedArgs);
    }

    // Test parseArguments with a quoted value.
    @Test
    public void testParseArgumentsQuoted() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        String[] args = {"--output_wrapper='<html>%s</html>'"};
        List<String> processedArgs = runner.processArgs(args);
        assertEquals(ImmutableList.of("--output_wrapper", "<html>%s</html>"), processedArgs);
    }

    // Test parseArguments with a flag without value (should be handled by args4j).
    @Test
    public void testParseArgumentsFlagOnly() {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        String[] args = {"--print_tree"};
        List<String> processedArgs = runner.processArgs(args);
        assertEquals(ImmutableList.of("--print_tree"), processedArgs);
    }

    // Test initConfigFromFlags with a valid flag file.
    @Test
    public void testInitConfigFromFlagsFile() throws IOException, CmdLineException {
        File flagFile = File.createTempFile("flags", ".txt");
        flagFile.deleteOnExit();
        Files.write("--js=input.js\n--pretty_print", flagFile, Charsets.UTF_8);

        CommandLineRunner runner = new CommandLineRunner(new String[]{"--flagfile", flagFile.getAbsolutePath()}, System.out, System.err) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };

        assertEquals("input.js", runner.getCommandLineConfig().js.get(0));
    }

    // Test initConfigFromFlags with an invalid flag file.
    @Test
    public void testInitConfigFromFlagsInvalidFile() throws IOException, CmdLineException {
        File flagFile = File.createTempFile("flags", ".txt");
        flagFile.deleteOnExit();
        Files.write("--invalid-flag", flagFile, Charsets.UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream errStream = new PrintStream(baos);

        new CommandLineRunner(new String[]{"--flagfile", flagFile.getAbsolutePath()}, System.out, errStream) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };

        assertTrue(baos.toString().contains("Invalid Option name '--invalid-flag'"));
    }

    // Test initConfigFromFlags with --flagfile in flag file.
    @Test
    public void testInitConfigFromFlagsNestedFlagFile() throws IOException, CmdLineException {
        File flagFile = File.createTempFile("flags", ".txt");
        flagFile.deleteOnExit();
        Files.write("--flagfile=another_flag.txt", flagFile, Charsets.UTF_8);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream errStream = new PrintStream(baos);

        CommandLineRunner runner = new CommandLineRunner(new String[]{"--flagfile", flagFile.getAbsolutePath()}, System.out, errStream) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        assertTrue(runner.shouldRunCompiler()); // Should not fail parsing, but log error
        assertTrue(baos.toString().contains("Arguments in the file cannot contain --flagfile option."));
    }

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
    @Test
    public void testCreateOptionsCompilationLevel() {
        CommandLineRunner runnerSimple = new CommandLineRunner(new String[]{"--compilation_level=SIMPLE_OPTIMIZATIONS"}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions optionsSimple = runnerSimple.createOptions();
        assertEquals(CompilationLevel.SIMPLE_OPTIMIZATIONS, runnerSimple.flags.compilation_level);
        assertFalse(optionsSimple.optimize);
        assertFalse(optionsSimple.closurePass);

        CommandLineRunner runnerAdvanced = new CommandLineRunner(new String[]{"--compilation_level=ADVANCED_OPTIMIZATIONS"}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions optionsAdvanced = runnerAdvanced.createOptions();
        assertEquals(CompilationLevel.ADVANCED_OPTIMIZATIONS, runnerAdvanced.flags.compilation_level);
        assertTrue(optionsAdvanced.optimize);
        assertTrue(optionsAdvanced.closurePass);
    }

    // Test createOptions for warning level.
    @Test
    public void testCreateOptionsWarningLevel() {
        CommandLineRunner runnerDefault = new CommandLineRunner(new String[]{"--warning_level=DEFAULT"}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions optionsDefault = runnerDefault.createOptions();
        assertEquals(WarningLevel.DEFAULT, runnerDefault.flags.warning_level);
        assertFalse(optionsDefault.checkTypes);

        CommandLineRunner runnerVerbose = new CommandLineRunner(new String[]{"--warning_level=VERBOSE"}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        CompilerOptions optionsVerbose = runnerVerbose.createOptions();
        assertEquals(WarningLevel.VERBOSE, runnerVerbose.flags.warning_level);
        assertTrue(optionsVerbose.checkTypes);
    }

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
    @Test
    public void testCreateExternsDefault() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{}) {
            @Override protected Compiler createCompiler() { return null; }
            @Override protected CompilerOptions createOptions() { return null; }
        };
        runner.config.externs.clear();
        runner.flags.use_only_custom_externs = false;
        List<JSSourceFile> externs = runner.createExterns();
        assertFalse(externs.isEmpty());
        boolean foundEs5 = false;
        for (JSSourceFile extern : externs) {
            if (extern.getName().endsWith("es5.js")) {
                foundEs5 = true;
                break;
            }
        }
        assertTrue(foundEs5);
    }

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
    @Test
    public void testProcessResultsPrintTree() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        Node mockRoot = Mockito.mock(Node.class);
        StringWriter sw = new StringWriter();

        when(mockCompiler.getRoot()).thenReturn(mockRoot);
        doAnswer(invocation -> {
            ((Appendable) invocation.getArguments()[0]).append("tree output");
            return null;
        }).when(mockRoot).appendStringTree(any(Appendable.class));

        CommandLineRunner runner = new CommandLineRunner(new String[]{"--print_tree"}, new PrintStream(sw), System.err) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        };

        Result result = new Result();
        result.success = true;
        runner.processResults(result, null, new CompilerOptions());

        assertTrue(sw.toString().contains("tree output"));
    }

    // Test processResults when printAst is true.
    @Test
    public void testProcessResultsPrintAst() throws Exception {
        Compiler mockCompiler = Mockito.mock(Compiler.class);
        Node mockRoot = Mockito.mock(Node.class);
        ControlFlowGraph<Node> mockCfg = Mockito.mock(ControlFlowGraph.class);
        StringWriter sw = new StringWriter();

        when(mockCompiler.getRoot()).thenReturn(mockRoot);
        when(mockCompiler.computeCFG()).thenReturn(mockCfg);
        when(mockRoot.getLastChild()).thenReturn(mockRoot);

        CommandLineRunner runner = new CommandLineRunner(new String[]{"--print_ast"}, new PrintStream(sw), System.err) {
            @Override protected Compiler createCompiler() { return mockCompiler; }
            @Override protected CompilerOptions createOptions() { return new CompilerOptions(); }
        };

        Result result = new Result();
        result.success = true;
        runner.processResults(result, null, new CompilerOptions());

        verify(mockCompiler).computeCFG();
        verify(mockRoot).getLastChild();
    }

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
```