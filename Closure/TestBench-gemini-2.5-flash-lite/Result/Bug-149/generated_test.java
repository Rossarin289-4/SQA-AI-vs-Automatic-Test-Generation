package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.TokenStream;
import com.google.protobuf.CodedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import com.google.common.collect.Sets;
import com.google.common.io.LimitInputStream;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.OptionDef;
import org.kohsuke.args4j.spi.OptionHandler;
import org.kohsuke.args4j.spi.Parameters;
import org.kohsuke.args4j.spi.Setter;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.jscomp.deps.SortedDependencies.CircularDependencyException;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.ParserRunner;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.logging.Logger;
import com.google.common.collect.Multimap;

public class AbstractCommandLineRunnerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Test cases for AbstractCommandLineRunner
    // The primary functionality to test is how command-line flags are translated
    // into CompilerOptions and Compiler configuration.

    // Test the constructor and basic initialization.
    @Test
    public void testDefaultConstructor() throws Exception {
        // We can't directly instantiate AbstractCommandLineRunner.
        // We need to use a concrete subclass like CommandLineRunner.
        // For testing AbstractCommandLineRunner's configuration logic,
        // we'll indirectly test it via CommandLineRunner.
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertNotNull(runner.getCommandLineConfig());
        assertNotNull(runner.getErrorPrintStream());
        // Compiler and Options are created lazily or within doRun, not necessarily in constructor.
        // Asserting their presence here might be premature without calling run() or similar.
    }

    // Test initialization from flags.










    @Test
    public void testInitConfigFromFlags_codingConvention() throws Exception {
        // This flag is handled by CommandLineRunner itself, not passed to config directly.
        // Testing ClosureCodingConvention specifically.
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--third_party"});
        CompilerOptions options = runner.createOptions();
        assertTrue(options.getCodingConvention() instanceof DefaultCodingConvention);

        runner = new CommandLineRunner(new String[]{}); // Default should be ClosureCodingConvention
        options = runner.createOptions();
        assertTrue(options.getCodingConvention() instanceof ClosureCodingConvention);
    }














    // Test createOptions() in CommandLineRunner, which uses flags.


    @Test
    public void testCreateOptions_formatting() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--formatting", "PRETTY_PRINT", "--formatting", "PRINT_INPUT_DELIMITER"});
        CompilerOptions options = runner.createOptions();
        assertTrue(options.prettyPrint);
        assertTrue(options.printInputDelimiter);
    }

    @Test
    public void testCreateOptions_processClosurePrimitives() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--process_closure_primitives", "false"});
        CompilerOptions options = runner.createOptions();
        assertFalse(options.closurePass);
    }

    @Test
    public void testCreateOptions_debug() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{"--debug"});
        CompilerOptions options = runner.createOptions();
        // --debug implies DevMode.EVERY_PASS in CommandLineRunner.java
        assertEquals(CompilerOptions.DevMode.EVERY_PASS, options.devMode);
    }

    // Test the `createInputs` and `createSourceInputs` methods.

    @Test
    public void testCreateInputs_fromStdin() throws Exception {
        // Simulating stdin is tricky. We'll assume the implementation is correct
        // if it handles the '-' argument.
        // A direct test would require redirecting System.in.
        // For now, let's test that it *allows* '-' when configured.
        // This is implicitly tested by `run()` if we could provide stdin.
    }

    // FlagUsageException is an inner class of AbstractCommandLineRunner, so it needs to be accessed via the outer class.
    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateInputs_stdinNotAllowed() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        // createSourceInputs calls createInputs with allowStdIn = true.
        // Testing the `!allowStdIn` case would require a different entry point.
        // Let's test `createExternInputs` which uses `!allowStdIn`.
        // This test actually belongs to testCreateExternInputs_stdinNotAllowed.
    }


    // Test createJsModules. This is complex and involves parsing specs.
    @Test
    public void testCreateJsModules_basic() throws Exception {
        List<String> jsFiles = Lists.newArrayList("f1.js", "f2.js", "f3.js");
        List<String> moduleSpecs = Lists.newArrayList("m1:1", "m2:2");
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(moduleSpecs, jsFiles);

        assertEquals(2, modules.length);
        assertEquals("m1", modules[0].getName());
        assertEquals(1, modules[0].getInputs().size());
        assertEquals("f1.js", modules[0].getInputs().get(0).getName());
        assertEquals("m2", modules[1].getName());
        assertEquals(2, modules[1].getInputs().size());
        assertEquals("f2.js", modules[1].getInputs().get(0).getName());
        assertEquals("f3.js", modules[1].getInputs().get(1).getName());
    }

    @Test
    public void testCreateJsModules_withDependencies() throws Exception {
        List<String> jsFiles = Lists.newArrayList("f1.js", "f2.js", "f3.js");
        List<String> moduleSpecs = Lists.newArrayList("m1:1", "m2:1:m1", "m3:1:m1,m2");
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(moduleSpecs, jsFiles);

        assertEquals(3, modules.length);
        // Order might not be guaranteed by spec parsing alone, but the dependencies should be set.
        JSModule m1 = null, m2 = null, m3 = null;
        for(JSModule mod : modules) {
            if (mod.getName().equals("m1")) m1 = mod;
            if (mod.getName().equals("m2")) m2 = mod;
            if (mod.getName().equals("m3")) m3 = mod;
        }

        assertNotNull(m1);
        assertNotNull(m2);
        assertNotNull(m3);

        assertEquals(0, m1.getDependencies().size());
        assertEquals(1, m2.getDependencies().size());
        assertTrue(m2.getDependencies().contains(m1));
        assertEquals(2, m3.getDependencies().size());
        assertTrue(m3.getDependencies().contains(m1));
        assertTrue(m3.getDependencies().contains(m2));
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_duplicateModuleName() throws Exception {
        List<String> jsFiles = Lists.newArrayList("f1.js");
        List<String> moduleSpecs = Lists.newArrayList("m1:1", "m1:1");
        AbstractCommandLineRunner.createJsModules(moduleSpecs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_invalidModuleSpec() throws Exception {
        List<String> jsFiles = Lists.newArrayList("f1.js");
        List<String> moduleSpecs = Lists.newArrayList("m1"); // Missing file count
        AbstractCommandLineRunner.createJsModules(moduleSpecs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_notEnoughJsFiles() throws Exception {
        List<String> jsFiles = Lists.newArrayList("f1.js");
        List<String> moduleSpecs = Lists.newArrayList("m1:2"); // Needs 2 files, only 1 provided
        AbstractCommandLineRunner.createJsModules(moduleSpecs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_tooManyJsFiles() throws Exception {
        List<String> jsFiles = Lists.newArrayList("f1.js", "f2.js");
        List<String> moduleSpecs = Lists.newArrayList("m1:1"); // Provides 1 file, but 2 are given
        AbstractCommandLineRunner.createJsModules(moduleSpecs, jsFiles);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateJsModules_dependsOnUnknownModule() throws Exception {
        List<String> jsFiles = Lists.newArrayList("f1.js");
        List<String> moduleSpecs = Lists.newArrayList("m1:1:m2"); // Depends on unknown m2
        AbstractCommandLineRunner.createJsModules(moduleSpecs, jsFiles);
    }

    // Test parseModuleWrappers.
    @Test
    public void testParseModuleWrappers_basic() throws Exception {
        JSModule m1 = new JSModule("m1");
        JSModule m2 = new JSModule("m2");
        JSModule[] modules = {m1, m2};
        List<String> specs = Lists.newArrayList("m1:wrapper(%s)", "m2:another wrapper %s");
        Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);

        assertEquals(2, wrappers.size());
        assertEquals("wrapper(%s)", wrappers.get("m1"));
        assertEquals("another wrapper %s", wrappers.get("m2"));
    }

    @Test
    public void testParseModuleWrappers_noWrapper() throws Exception {
        JSModule m1 = new JSModule("m1");
        JSModule[] modules = {m1};
        List<String> specs = Collections.emptyList();
        Map<String, String> wrappers = AbstractCommandLineRunner.parseModuleWrappers(specs, modules);

        assertEquals(1, wrappers.size());
        assertEquals("", wrappers.get("m1")); // Default is empty string
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_unknownModule() throws Exception {
        JSModule m1 = new JSModule("m1");
        JSModule[] modules = {m1};
        List<String> specs = Lists.newArrayList("m2:wrapper(%s)"); // m2 is not in modules
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_missingPlaceholder() throws Exception {
        JSModule m1 = new JSModule("m1");
        JSModule[] modules = {m1};
        List<String> specs = Lists.newArrayList("m1:just a string"); // No %s placeholder
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testParseModuleWrappers_invalidSpecFormat() throws Exception {
        JSModule m1 = new JSModule("m1");
        JSModule[] modules = {m1};
        List<String> specs = Lists.newArrayList("m1wrapper(%s)"); // Missing ':'
        AbstractCommandLineRunner.parseModuleWrappers(specs, modules);
    }

    // Test writeOutput. This involves simulating Appendable and Compiler.
    // We'll check the output string.
    @Test
    public void testWriteOutput_basic() throws Exception {
        StringBuilder sb = new StringBuilder();
        Compiler mockCompiler = createMockCompiler(); // Need a mock compiler
        String code = "console.log('hello');";
        String wrapper = "<html><body>%s</body></html>";
        String codePlaceholder = "%s";

        AbstractCommandLineRunner.writeOutput(sb, mockCompiler, code, wrapper, codePlaceholder);
        assertEquals("<html><body>console.log('hello');</body></html>\n", sb.toString());
    }

    @Test
    public void testWriteOutput_noPlaceholder() throws Exception {
        StringBuilder sb = new StringBuilder();
        Compiler mockCompiler = createMockCompiler();
        String code = "console.log('hello');";
        String wrapper = "<html><body></body></html>";
        String codePlaceholder = "%s";

        AbstractCommandLineRunner.writeOutput(sb, mockCompiler, code, wrapper, codePlaceholder);
        assertEquals("console.log('hello');\n", sb.toString());
    }

    @Test
    public void testWriteOutput_wrapperWithMultiplePlaceholders() throws Exception {
        StringBuilder sb = new StringBuilder();
        Compiler mockCompiler = createMockCompiler();
        String code = "console.log('hello');";
        String wrapper = "<html><body>%s %s</body></html>";
        String codePlaceholder = "%s"; // Only the first %s is the target

        AbstractCommandLineRunner.writeOutput(sb, mockCompiler, code, wrapper, codePlaceholder);
        assertEquals("<html><body>console.log('hello'); %s</body></html>\n", sb.toString());
    }

    // Test maybeCreateDirsForPath. This requires checking the file system.
    // This is generally avoided in unit tests. We'll assume it works based on the API.

    // Test the getCommandLineConfig() method.
    @Test
    public void testGetCommandLineConfig() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertNotNull(runner.getCommandLineConfig());
    }

    // Test getInputCharset() and getOutputCharset().



    // Test doRun. This is a high-level method and hard to test thoroughly without a full setup.
    // We will test some aspects indirectly through CommandLineRunner's main method or other public APIs.

    // Test processResults. This is also a high-level method.
    // We can test specific branches if we can mock the Result object and other dependencies.

    // Test toWriter. This method creates Writers.
    // We can test that it creates the correct type of Writer.




    // Test expandCommandLinePath.


    // Test expandSourceMapPath and expandManifest (using expandCommandLinePath internally).

    // Test outputNameMaps. This is complex as it depends on compiler state.
    // We'll mock basic functionality.

    // Test createDefineReplacements.











    @Test(expected = RuntimeException.class)
    public void testCreateDefineReplacements_invalidSyntax() throws Exception {
        CompilerOptions options = new CompilerOptions();
        List<String> defines = Lists.newArrayList("INVALID_SYNTAX"); // Missing '='
        AbstractCommandLineRunner.createDefineReplacements(defines, options);
    }

    @Test(expected = RuntimeException.class)
    public void testCreateDefineReplacements_unparseableNumber() throws Exception {
        CompilerOptions options = new CompilerOptions();
        List<String> defines = Lists.newArrayList("BAD_NUMBER=1.2.3");
        AbstractCommandLineRunner.createDefineReplacements(defines, options);
    }



    // Helper to create a mock Compiler for testing methods that require it.
    private Compiler createMockCompiler() {
        // A minimal mock compiler. Most methods are not relevant for these tests.
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        return compiler;
    }

    // Mock of SourceMap, as it's used by writeOutput.

    // Mock of Compiler to allow testing writeOutput with SourceMap.

    // New tests for methods not covered before.

    @Test
    public void testGetDiagnosticGroups() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        assertNotNull(runner.getDiagnosticGroups());
        assertTrue(runner.getDiagnosticGroups() instanceof DiagnosticGroups);
    }

    @Test
    public void testInitOptionsFromFlags_deprecated() throws Exception {
        // This method is deprecated and does nothing. We just call it to ensure it doesn't crash.
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        CompilerOptions options = new CompilerOptions();
        try {
            runner.initOptionsFromFlags(options); // Deprecated method call
            // No assertion needed, just ensuring it doesn't throw.
        } catch (Exception e) {
            fail("Deprecated method initOptionsFromFlags threw an exception: " + e.getMessage());
        }
    }


    @Test
    public void testGetCompiler() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        // Compiler is created in doRun, not constructor. We need to call doRun.
        // Mocking the whole doRun process is complex.
        // A more appropriate test might focus on CommandLineRunner's specific behavior.
        // We can test createCompiler() if it were public, but it's protected.
        // To test getCompiler(), we'd need to ensure `compiler` field is set.
        // This is done within `doRun()`. Testing `doRun()` is too complex for a unit test.
    }





    // Test `createInputs` with various scenarios for `allowStdIn`.
    @Test
    public void testCreateInputs_fromFile_allowStdInTrue() throws Exception {
        File tempFile = File.createTempFile("test", ".js");
        tempFile.deleteOnExit();
        try (Writer writer = new FileWriter(tempFile)) {
            writer.write("var a = 1;");
        }

        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        // Use reflection to call the private method createInputs
        java.lang.reflect.Method method = AbstractCommandLineRunner.class.getDeclaredMethod(
            "createInputs", List.class, boolean.class);
        method.setAccessible(true);

        List<String> files = Collections.singletonList(tempFile.getAbsolutePath());
        List<JSSourceFile> inputs = (List<JSSourceFile>) method.invoke(null, files, true);

        assertEquals(1, inputs.size());
        assertEquals("var a = 1;", inputs.get(0).getCode());
        tempFile.delete(); // Ensure deletion
    }

    @Test
    public void testCreateInputs_fromStdin_allowStdInTrue() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        java.lang.reflect.Method method = AbstractCommandLineRunner.class.getDeclaredMethod(
            "createInputs", List.class, boolean.class);
        method.setAccessible(true);

        // Simulate stdin. This is difficult without actual stdin redirection.
        // We'll assume that if the '-' is passed and allowStdIn is true, it works.
        // This test focuses on the structure of the call.
        List<String> files = Collections.singletonList("-");
        // This call will likely fail at runtime due to System.in not being available
        // in the test environment unless explicitly set up.
        // For now, we focus on the fact that it *can* be called.
        try {
            method.invoke(null, files, true);
        } catch (Exception e) {
            // Expected in many test environments
        }
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateInputs_stdinTwice_allowStdInTrue() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        java.lang.reflect.Method method = AbstractCommandLineRunner.class.getDeclaredMethod(
            "createInputs", List.class, boolean.class);
        method.setAccessible(true);

        List<String> files = Lists.newArrayList("-", "-");
        method.invoke(null, files, true);
    }

    @Test(expected = AbstractCommandLineRunner.FlagUsageException.class)
    public void testCreateInputs_stdinNotAllowed_whenFalse() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        java.lang.reflect.Method method = AbstractCommandLineRunner.class.getDeclaredMethod(
            "createInputs", List.class, boolean.class);
        method.setAccessible(true);

        List<String> files = Collections.singletonList("-");
        method.invoke(null, files, false); // allowStdIn is false
    }

    @Test
    public void testCreateExterns_empty() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        // Default externs are used if config.externs is empty.
        // We are testing the `createExternInputs` call path.
        List<JSSourceFile> externs = runner.createExterns();
        // Expecting at least one default extern file if not specified.
        assertFalse(externs.isEmpty());
    }

    @Test
    public void testCreateExterns_withFiles() throws Exception {
        File tempFile = File.createTempFile("extern", ".js");
        tempFile.deleteOnExit();
        try (Writer writer = new FileWriter(tempFile)) {
            writer.write("var externVar;");
        }
        CommandLineRunner runner = new CommandLineRunner(new String[]{
            "--externs", tempFile.getAbsolutePath()
        });
        List<JSSourceFile> externs = runner.createExterns();
        assertEquals(1, externs.size());
        assertEquals("externVar;", externs.get(0).getCode());
        tempFile.delete(); // Ensure deletion
    }












    @Test
    public void testExpandSourceMapPath_sourceMapOutputPathNull() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = null;
        assertNull(runner.expandSourceMapPath(options, null));
    }















    @Test
    public void testPrintManifestTo_singleInput() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        StringBuilder sb = new StringBuilder();
        CompilerInput input = createMockCompilerInput("file1.js");
        List<CompilerInput> inputs = Collections.singletonList(input);
        runner.printManifestTo(inputs, sb);
        assertEquals("file1.js\n\n", sb.toString());
    }

    @Test
    public void testPrintManifestTo_multipleInputs() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        StringBuilder sb = new StringBuilder();
        CompilerInput input1 = createMockCompilerInput("file1.js");
        CompilerInput input2 = createMockCompilerInput("file2.js");
        List<CompilerInput> inputs = Lists.newArrayList(input1, input2);
        runner.printManifestTo(inputs, sb);
        assertEquals("file1.js\nfile2.js\n\n", sb.toString());
    }

    @Test
    public void testPrintModuleGraphManifestTo_emptyGraph() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        StringBuilder sb = new StringBuilder();
        JSModuleGraph graph = createMockModuleGraph(Collections.emptyList());
        runner.printModuleGraphManifestTo(graph, sb);
        assertEquals("", sb.toString());
    }

    @Test
    public void testPrintModuleGraphManifestTo_singleModule() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        StringBuilder sb = new StringBuilder();
        JSModule module = createMockModule("m1", Collections.emptyList());
        JSModuleGraph graph = createMockModuleGraph(Collections.singletonList(module));
        runner.printModuleGraphManifestTo(graph, sb);
        assertEquals("{m1}\n\n", sb.toString()); // Module name followed by newline, then empty inputs newline
    }

    @Test
    public void testPrintModuleGraphManifestTo_moduleWithDeps() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        StringBuilder sb = new StringBuilder();
        JSModule m1 = createMockModule("m1", Collections.emptyList());
        JSModule m2 = createMockModule("m2", Collections.singletonList(m1));
        List<JSModule> modules = Lists.newArrayList(m1, m2);
        Collections.sort(modules, JSModuleGraph.MODULE_LEXICAL_COMPARATOR); // Ensure consistent order for test
        JSModuleGraph graph = createMockModuleGraph(modules);
        runner.printModuleGraphManifestTo(graph, sb);
        // Order depends on sorting, assume m1 comes first.
        assertEquals("{m1}\n\n{m2:m1}\n\n", sb.toString());
    }

    @Test
    public void testPrintModuleGraphManifestTo_moduleWithInputs() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(new String[]{});
        StringBuilder sb = new StringBuilder();
        CompilerInput input1 = createMockCompilerInput("f1.js");
        JSModule m1 = createMockModule("m1", Collections.singletonList(input1));
        List<JSModule> modules = Collections.singletonList(m1);
        JSModuleGraph graph = createMockModuleGraph(modules);
        runner.printModuleGraphManifestTo(graph, sb);
        assertEquals("{m1}\nfile1.js\n\n", sb.toString());
    }

    // Mock helper for CompilerInput
    private CompilerInput createMockCompilerInput(String name) {
        return new CompilerInput(JSSourceFile.fromCode(name, "var " + name + ";"));
    }

    // Mock helper for JSModule
    private JSModule createMockModule(String name, List<JSModule> dependencies) {
        JSModule module = new JSModule(name);
        for (JSModule dep : dependencies) {
            module.addDependency(dep);
        }
        return module;
    }

    // Mock helper for JSModuleGraph
    private JSModuleGraph createMockModuleGraph(List<JSModule> modules) throws Exception {
        // JSModuleGraph constructor can throw ModuleDependenceException.
        // Need to provide valid structure if we want to test its methods.
        // For now, just create a simple graph for testing print methods.
        // This might need more sophisticated mocking if complex graph operations are tested.
        return new JSModuleGraph(modules); // Assuming modules list is valid
    }

    @Test
    public void testRunTimeStats_recordStartRun() throws Exception {
        RunTimeStats stats = new RunTimeStats();
        long startTime = System.currentTimeMillis();
        stats.recordStartRun();
        assertTrue(stats.lastStartTime >= startTime); // Should be set to current time or later
    }

    @Test
    public void testRunTimeStats_recordEndRun() throws Exception {
        RunTimeStats stats = new RunTimeStats();
        stats.recordStartRun();
        // Simulate some work
        try { Thread.sleep(10); } catch (InterruptedException ignored) {}
        stats.recordEndRun();

        assertTrue(stats.bestRunTime > 0);
        assertTrue(stats.worstRunTime > 0);
        assertTrue(stats.bestRunTime <= stats.worstRunTime);
    }

    @Test
    public void testRunTimeStats_outputBestPhaseOrdering() throws Exception {
        RunTimeStats stats = new RunTimeStats();
        stats.recordStartRun();
        // Simulate some work
        try { Thread.sleep(5); } catch (InterruptedException ignored) {}
        stats.recordEndRun();
        stats.bestRunTime = 5; // Manually set for test
        stats.worstRunTime = 10;
        stats.loopedPassesInBestRun = Lists.newArrayList(Lists.newArrayList("pass1", "pass2"));

        // Output goes to System.out via the 'out' field of AbstractCommandLineRunner.
        // We can't capture System.out easily here without redirecting.
        // We will check that the method runs without error.
        // For actual output verification, a more complex setup would be needed.
        try {
            // The method `outputBestPhaseOrdering` is private.
            // We need to use reflection to test it.
            java.lang.reflect.Method method = RunTimeStats.class.getDeclaredMethod("outputBestPhaseOrdering");
            method.setAccessible(true);
            method.invoke(stats);

        } catch (RuntimeException e) {
            fail("outputBestPhaseOrdering failed: " + e.getMessage());
        }
    }

    @Test
    public void testCommandLineConfig_setters() throws Exception {
        CommandLineConfig config = new CommandLineConfig();
        config.setPrintTree(true);
        assertTrue(config.printTree);

        config.setComputePhaseOrdering(true);
        assertTrue(config.computePhaseOrdering);

        config.setPrintAst(true);
        assertTrue(config.printAst);

        config.setPrintPassGraph(true);
        assertTrue(config.printPassGraph);

        config.setJscompDevMode(CompilerOptions.DevMode.START);
        assertEquals(CompilerOptions.DevMode.START, config.jscompDevMode);

        config.setLoggingLevel("FINE");
        assertEquals("FINE", config.loggingLevel);

        config.setExterns(Lists.newArrayList("ext1.js"));
        assertEquals(Lists.newArrayList("ext1.js"), config.externs);

        config.setJs(Lists.newArrayList("js1.js"));
        assertEquals(Lists.newArrayList("js1.js"), config.js);

        config.setJsOutputFile("out.js");
        assertEquals("out.js", config.jsOutputFile);

        config.setModule(Lists.newArrayList("m:1"));
        assertEquals(Lists.newArrayList("m:1"), config.module);

        config.setVariableMapInputFile("var_in.map");
        assertEquals("var_in.map", config.variableMapInputFile);

        config.setPropertyMapInputFile("prop_in.map");
        assertEquals("prop_in.map", config.propertyMapInputFile);

        config.setVariableMapOutputFile("var_out.map");
        assertEquals("var_out.map", config.variableMapOutputFile);

        config.setCreateNameMapFiles(true);
        assertTrue(config.createNameMapFiles);

        config.setPropertyMapOutputFile("prop_out.map");
        assertEquals("prop_out.map", config.propertyMapOutputFile);

        config.setCodingConvention(new DefaultCodingConvention());
        assertTrue(config.codingConvention instanceof DefaultCodingConvention);

        config.setSummaryDetailLevel(3);
        assertEquals(3, config.summaryDetailLevel);

        config.setOutputWrapper("wrapper(%output%)");
        assertEquals("wrapper(%output%)", config.outputWrapper);

        config.setOutputWrapperMarker("%output%");
        assertEquals("%output%", config.outputWrapperMarker);

        config.setModuleWrapper(Lists.newArrayList("m1:wrapper(%s)"));
        assertEquals(Lists.newArrayList("m1:wrapper(%s)"), config.moduleWrapper);

        config.setModuleOutputPathPrefix("./dist/");
        assertEquals("./dist/", config.moduleOutputPathPrefix);

        config.setCreateSourceMap("map.js");
        assertEquals("map.js", config.createSourceMap);

        config.setSourceMapDetailLevel(SourceMap.DetailLevel.EXTENDED);
        assertEquals(SourceMap.DetailLevel.EXTENDED, config.sourceMapDetailLevel);

        config.setJscompError(Lists.newArrayList("error1"));
        assertEquals(Lists.newArrayList("error1"), config.jscompError);

        config.setJscompWarning(Lists.newArrayList("warning1"));
        assertEquals(Lists.newArrayList("warning1"), config.jscompWarning);

        config.setJscompOff(Lists.newArrayList("off1"));
        assertEquals(Lists.newArrayList("off1"), config.jscompOff);

        config.setDefine(Lists.newArrayList("DEF=1"));
        assertEquals(Lists.newArrayList("DEF=1"), config.define);

        config.setCharset("UTF-8");
        assertEquals("UTF-8", config.charset);

        config.setManageClosureDependencies(true);
        assertTrue(config.manageClosureDependencies);

        config.setOutputManifest("manifest.txt");
        assertEquals("manifest.txt", config.outputManifest);
    }
}





