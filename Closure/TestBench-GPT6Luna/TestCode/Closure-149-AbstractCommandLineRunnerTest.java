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
    @Test
    public void testShouldRunCompilerForEmptyArguments() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[0], System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldRunCompilerForValidBooleanOption() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--use_only_custom_externs=true"},
                System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
    }

    @Test
    public void testShouldNotRunCompilerForInvalidBooleanOption() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--use_only_custom_externs=maybe"},
                System.out, System.err);
        assertFalse(runner.shouldRunCompiler());
    }

    @Test
    public void testCreateDefineReplacementsBooleanFlagForms() throws Exception {
        CompilerOptions options = new CompilerOptions();
        AbstractCommandLineRunner.createDefineReplacements(
                Lists.newArrayList("FLAG", "YES=false", "NO=true"), options);
        Map<String, Node> replacements = options.getDefineReplacements();
        assertEquals(Token.TRUE, replacements.get("FLAG").getType());
        assertEquals(Token.FALSE, replacements.get("YES").getType());
        assertEquals(Token.TRUE, replacements.get("NO").getType());
    }

    @Test
    public void testCreateDefineReplacementsParsesNumberAndQuotedString() throws Exception {
        CompilerOptions options = new CompilerOptions();
        AbstractCommandLineRunner.createDefineReplacements(
                Lists.newArrayList("COUNT=12.5", "TEXT='hello'"), options);
        Map<String, Node> replacements = options.getDefineReplacements();
        assertEquals(12.5, replacements.get("COUNT").getDouble(), 1e-9);
        assertEquals("hello", replacements.get("TEXT").getString());
    }

    @Test
    public void testCreateDefineReplacementsRejectsEmptyName() throws Exception {
        CompilerOptions options = new CompilerOptions();
        try {
            AbstractCommandLineRunner.createDefineReplacements(
                    Lists.newArrayList("=true"), options);
            fail("expected RuntimeException");
        } catch (RuntimeException expected) {
            assertEquals(RuntimeException.class, expected.getClass());
        }
    }

    @Test
    public void testCreateJsModulesAssignsInputsAndDependencies() throws Exception {
        List<String> files = Lists.newArrayList("a.js", "b.js");
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(
                Lists.newArrayList("base:1", "child:1:base"), files);
        assertEquals(2, modules.length);
        assertEquals("base", modules[0].getName());
        assertEquals(1, modules[0].getInputs().size());
        assertEquals("child", modules[1].getName());
        assertEquals(1, modules[1].getDependencies().size());
        assertEquals("base", modules[1].getDependencies().get(0).getName());
    }

    @Test
    public void testCreateJsModulesAllowsZeroInputModuleAtZeroEdge() throws Exception {
        JSModule[] modules = AbstractCommandLineRunner.createJsModules(
                Lists.newArrayList("empty:0"), Collections.<String>emptyList());
        assertEquals(1, modules.length);
        assertEquals(0, modules[0].getInputs().size());
    }

    @Test
    public void testCreateJsModulesRejectsNegativeInputCount() throws Exception {
        try {
            AbstractCommandLineRunner.createJsModules(
                    Lists.newArrayList("bad:-1"), Collections.<String>emptyList());
            fail("expected FlagUsageException");
        } catch (AbstractCommandLineRunner.FlagUsageException expected) {
            assertEquals(AbstractCommandLineRunner.FlagUsageException.class,
                    expected.getClass());
        }
    }

    @Test
    public void testCreateJsModulesRejectsTooManyFiles() throws Exception {
        try {
            AbstractCommandLineRunner.createJsModules(
                    Lists.newArrayList("one:2"), Lists.newArrayList("a.js"));
            fail("expected FlagUsageException");
        } catch (AbstractCommandLineRunner.FlagUsageException expected) {
            assertEquals(AbstractCommandLineRunner.FlagUsageException.class,
                    expected.getClass());
        }
    }

    @Test
    public void testParseModuleWrappersDefaultsAndParsesWrapper() throws Exception {
        JSModule first = new JSModule("first");
        JSModule second = new JSModule("second");
        Map<String, String> wrappers =
                AbstractCommandLineRunner.parseModuleWrappers(
                        Lists.newArrayList("second:pre%s-post"),
                        new JSModule[] {first, second});
        assertEquals("", wrappers.get("first"));
        assertEquals("pre%s-post", wrappers.get("second"));
    }

    @Test
    public void testParseModuleWrappersRejectsMissingPlaceholder() throws Exception {
        try {
            AbstractCommandLineRunner.parseModuleWrappers(
                    Lists.newArrayList("first:plain"),
                    new JSModule[] {new JSModule("first")});
            fail("expected FlagUsageException");
        } catch (AbstractCommandLineRunner.FlagUsageException expected) {
            assertEquals(AbstractCommandLineRunner.FlagUsageException.class,
                    expected.getClass());
        }
    }

    @Test
    public void testWriteOutputWithPlaceholderAddsPrefixCodeSuffixAndNewline() throws Exception {
        StringBuilder out = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(out, null, "body",
                "pre%s-post", "%s");
        assertEquals("prebody-post\n", out.toString());
    }

    @Test
    public void testWriteOutputWithoutPlaceholderAddsCodeAndNewline() throws Exception {
        StringBuilder out = new StringBuilder();
        AbstractCommandLineRunner.writeOutput(out, null, "body",
                "unused", "%s");
        assertEquals("body\n", out.toString());
    }

    @Test
    public void testPrintModuleGraphManifestOrdersInputsAndDependencies() throws Exception {
        JSModule base = new JSModule("base");
        base.add(JSSourceFile.fromCode("base.js", ""));
        JSModule child = new JSModule("child");
        child.add(JSSourceFile.fromCode("child.js", ""));
        child.addDependency(base);
        JSModuleGraph graph = new JSModuleGraph(
                Lists.newArrayList(base, child));
        CommandLineRunner runner = new CommandLineRunner(
                new String[0], System.out, System.err);
        StringBuilder out = new StringBuilder();
        runner.printModuleGraphManifestTo(graph, out);
        assertEquals("{base}\nbase.js\n\n{child:base}\nchild.js\n",
                out.toString());
    }

    @Test
    public void testGetDefaultExternsContainsExpectedSources() throws Exception {
        CommandLineRunner runner = new CommandLineRunner(
                new String[] {"--use_only_custom_externs=true"},
                System.out, System.err);
        assertTrue(runner.shouldRunCompiler());
        assertEquals(0, runner.createExterns().size());
    }

    @Test
    public void testInitOptionsAndGetErrorManager() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertSame(options, compiler.getOptions());
        assertNotNull(compiler.getErrorManager());
    }

    @Test
    public void testInitAndLookupInputAndSourceLines() throws Exception {
        Compiler compiler = new Compiler();
        JSSourceFile input = JSSourceFile.fromCode("src.js", "var x=1;\nvar y=2;");
        compiler.init(new JSSourceFile[0], new JSSourceFile[] {input},
                new CompilerOptions());
        assertNotNull(compiler.getInput("src.js"));
        assertEquals("var x=1;", compiler.getSourceLine("src.js", 1));
        assertNull(compiler.getSourceLine("src.js", 2));
        assertNull(compiler.getSourceLine("src.js", 0));
        assertNull(compiler.getSourceLine("missing.js", 1));
    }

    @Test
    public void testInitModulesAndRebuildInputsFromModules() throws Exception {
        Compiler compiler = new Compiler();
        JSModule module = new JSModule("main");
        JSSourceFile original = JSSourceFile.fromCode("first.js", "var a=1;");
        module.add(original);
        compiler.initModules(Collections.<JSSourceFile>emptyList(),
                Lists.newArrayList(module), new CompilerOptions());
        module.add(JSSourceFile.fromCode("second.js", "var b=2;"));
        compiler.rebuildInputsFromModules();
        assertNotNull(compiler.getInput("second.js"));
        assertEquals(2, compiler.getInputsForTesting().size());
    }

    @Test
    public void testCompileAndCompileModulesReturnSuccessfulResults() throws Exception {
        CompilerOptions options = new CompilerOptions();
        Compiler compiler = new Compiler();
        Result result = compiler.compile(
                JSSourceFile.fromCode("extern.js", ""),
                JSSourceFile.fromCode("input.js", "var x=1;"), options);
        assertTrue(result.success);
        assertEquals("var x=1;", compiler.toSource());

        Compiler modularCompiler = new Compiler();
        JSModule module = new JSModule("main");
        module.add(JSSourceFile.fromCode("module.js", "var y=2;"));
        Result modularResult = modularCompiler.compileModules(
                Collections.<JSSourceFile>emptyList(),
                Lists.newArrayList(module), new CompilerOptions());
        assertTrue(modularResult.success);
    }

    @Test
    public void testDisableThreadsAndCompileThenRetrieveResults() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        Result result = compiler.compile(
                new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("in.js", "var z=3;")},
                new CompilerOptions());
        assertTrue(result.success);
        assertEquals(0, compiler.getErrors().length);
        assertEquals(0, compiler.getMessages().length);
        assertEquals(0, compiler.getWarnings().length);
        assertEquals(0, compiler.getErrorCount());
        assertEquals(0, compiler.getWarningCount());
        assertFalse(compiler.hasErrors());
        assertNotNull(compiler.getRoot());
    }

    @Test
    public void testNewExternInputRegistersAndRejectsDuplicateName() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.skipAllCompilerPasses();
        compiler.compile(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("base.js", "")},
                options);
        CompilerInput added = compiler.newExternInput("extra.js");
        assertSame(added, compiler.getInput("extra.js"));
        try {
            compiler.newExternInput("extra.js");
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            assertEquals(IllegalArgumentException.class, expected.getClass());
        }
    }

    @Test
    public void testStateAndCodingOptionsAccessors() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setCodingConvention(new DefaultCodingConvention());
        compiler.initOptions(options);
        assertSame(options.getCodingConvention(), compiler.getCodingConvention());
        assertFalse(compiler.isIdeMode());
        assertFalse(compiler.isTypeCheckingEnabled());
        compiler.setState(compiler.getState());
        assertNull(compiler.getSourceMap());
        assertEquals("", compiler.getAstDotGraph());
    }

    @Test
    public void testSourceLineAndRegionForValidAndInvalidIndices() throws Exception {
        Compiler compiler = new Compiler();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("lines.js", "one\ntwo")},
                new CompilerOptions());
        assertNull(compiler.getSourceRegion("lines.js", 0));
        assertNull(compiler.getSourceRegion("missing.js", 1));
        assertNull(compiler.getSourceLine("lines.js", 2));
        assertNotNull(compiler.getSourceRegion("lines.js", 1));
    }

    @Test
    public void testCompilerToSourceArrayOnInitializedInputs() throws Exception {
        Compiler compiler = new Compiler();
        compiler.disableThreads();
        compiler.init(new JSSourceFile[0],
                new JSSourceFile[] {JSSourceFile.fromCode("a.js", "var a=1;"),
                        JSSourceFile.fromCode("b.js", "var b=2;")},
                new CompilerOptions());
        String[] sources = compiler.toSourceArray();
        assertEquals(2, sources.length);
        assertEquals("var a=1;", sources[0]);
        assertEquals("var b=2;", sources[1]);
        assertEquals("", compiler.toSource());
    }

    @Test
    public void testExplicitErrorManagerMustBeNonNull() throws Exception {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions());
        assertNotNull(compiler.getErrorManager());
        try {
            compiler.setErrorManager(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertEquals(NullPointerException.class, expected.getClass());
        }
    }
}
