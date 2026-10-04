package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.DevMode;
import com.google.javascript.jscomp.CompilerOptions.TracerMode;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.ParserRunner;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompilerTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }



    @Test
    public void testParseSyntheticCode() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        Node root = compiler.parseSyntheticCode("var x = 1;");
        assertNotNull(root);
        assertEquals(Token.BLOCK, root.getType());
    }

    @Test
    public void testParseSyntheticCodeWithFileName() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        Node root = compiler.parseSyntheticCode("synthetic.js", "var y = 2;");
        assertNotNull(root);
        assertEquals(Token.BLOCK, root.getType());
        assertEquals("synthetic.js", root.getProp(Node.SOURCENAME_PROP));
    }

    @Test
    public void testToSourceBasic() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { return 1; }");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        String source = compiler.toSource();
        assertTrue(source.contains("function f() { return 1; }"));
    }

    @Test
    public void testToSourceWithPrettyPrint() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.prettyPrint = true; // Accessing public field directly
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(){return 1}");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        String source = compiler.toSource();
        assertTrue(source.contains("function f() {\n  return 1;\n}"));
    }

    @Test
    public void testToSourceArrayBasic() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input1 = JSSourceFile.fromCode("input1.js", "var a = 1;");
        JSSourceFile input2 = JSSourceFile.fromCode("input2.js", "var b = 2;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input1, input2}, options);
        compiler.parse();
        String[] sources = compiler.toSourceArray();
        assertEquals(2, sources.length);
        assertTrue(sources[0].contains("var a = 1;"));
        assertTrue(sources[1].contains("var b = 2;"));
    }

    @Test
    public void testOptimizeBasic() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(x) { if (x) { return 1; } else { return 0; } }");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        compiler.optimize(); // This should not throw errors for valid JS
        // We cannot assert the output directly here without more complex setup,
        // but we can ensure it doesn't crash.
    }

    @Test
    public void testNormalizeBasic() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        compiler.normalize(); // This should not throw errors for valid JS
        assertTrue(compiler.isNormalized());
    }


    @Test
    public void testInitOptions() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.prettyPrint = true; // Accessing public field directly
        compiler.initOptions(options);
        assertNotNull(compiler.options);
        assertTrue(compiler.options.prettyPrint);
    }

    @Test
    public void testGetErrorsAndWarnings() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        // Create an error by providing invalid JS
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(x) { return x; );"); // Syntax error
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        JSError[] errors = compiler.getErrors();
        JSError[] warnings = compiler.getWarnings();
        assertTrue(errors.length > 0);
        assertEquals(0, warnings.length);
    }

    @Test
    public void testGetRoot() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile extern = JSSourceFile.fromCode("extern.js", "var a;");
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var b = a;");
        compiler.init(new JSSourceFile[]{extern}, new JSSourceFile[]{input}, options);
        compiler.parse();
        Node root = compiler.getRoot();
        assertNotNull(root);
        assertEquals(Token.BLOCK, root.getType());
        assertTrue(root.hasChildren());
        assertEquals(2, root.getChildCount());
    }

    @Test
    public void testGetSourceMap() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.sourceMapOutputPath = "test.js.map";
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        assertNotNull(compiler.getSourceMap());
    }

    @Test
    public void testGetAstDotGraph() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        String dotGraph = compiler.getAstDotGraph();
        assertNotNull(dotGraph);
        assertTrue(dotGraph.contains("digraph"));
    }

    @Test
    public void testGetSourceLine() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;\nvar y = 2;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        assertEquals("var x = 1;", compiler.getSourceLine("input.js", 1));
        assertEquals("var y = 2;", compiler.getSourceLine("input.js", 2));
    }


    @Test
    public void testGetOptions() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertEquals(options, compiler.getOptions());
    }

    @Test
    public void testIsIdeMode() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertFalse(compiler.isIdeMode());
        options.ideMode = true;
        compiler.initOptions(options);
        assertTrue(compiler.isIdeMode());
    }

    @Test
    public void testIsTypeCheckingEnabled() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertFalse(compiler.isTypeCheckingEnabled());
        options.checkTypes = true;
        compiler.initOptions(options);
        assertTrue(compiler.isTypeCheckingEnabled());
    }

    @Test
    public void testSetAndGetCodingConvention() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        GoogleCodingConvention convention = new GoogleCodingConvention();
        options.setCodingConvention(convention);
        compiler.initOptions(options);
        assertEquals(convention, compiler.getCodingConvention());
    }

    @Test
    public void testReportError() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        DiagnosticType errorType = DiagnosticType.error("TEST_ERROR", "A test error.");
        compiler.report(JSError.make(errorType));
        assertEquals(1, compiler.getErrorCount());
    }

    @Test
    public void testThrowInternalError() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        try {
            compiler.throwInternalError("Test internal error", null);
            fail("Should have thrown an exception");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("INTERNAL COMPILER ERROR"));
        }
    }

    @Test
    public void testGetFunctionalInformationMap() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.recordFunctionInformation = true;
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function foo() { return 1; }");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        // compileInternal is not public. Use compile()
        compiler.compile(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        assertNotNull(compiler.getFunctionalInformationMap());
    }











    @Test
    public void testToSourceWithPrintInputDelimiter() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.printInputDelimiter = true;
        options.inputDelimiter = "// Input: %name% (%num%)";
        JSSourceFile input1 = JSSourceFile.fromCode("input1.js", "var a = 1;");
        JSSourceFile input2 = JSSourceFile.fromCode("input2.js", "var b = 2;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input1, input2}, options);
        compiler.parse();
        String source = compiler.toSource();
        assertTrue(source.contains("// Input: input1.js (0)"));
        assertTrue(source.contains("// Input: input2.js (1)"));
        assertTrue(source.contains("var a = 1;"));
        assertTrue(source.contains("var b = 2;"));
    }

    @Test
    public void testToSourceWithLicenseComment() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "/**\n * @license\n * Copyright 2023\n */\nvar a = 1;");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        String source = compiler.toSource();
        assertTrue(source.contains("/**\n * @license\n * Copyright 2023\n */"));
        assertTrue(source.contains("var a = 1;"));
    }


    @Test
    public void testGetUniqueNameIdSupplier() {
        Compiler compiler = new Compiler();
        Supplier<String> supplier = compiler.getUniqueNameIdSupplier();
        assertEquals("0", supplier.get());
        assertEquals("1", supplier.get());
        assertEquals("2", supplier.get());
    }

    @Test
    public void testResetUniqueNameId() {
        Compiler compiler = new Compiler();
        compiler.getUniqueNameIdSupplier().get(); // Increments id to 1
        compiler.resetUniqueNameId();
        assertEquals("0", compiler.getUniqueNameIdSupplier().get());
    }




    @Test
    public void testSetPassConfig() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options); // Must init options first
        PassConfig defaultPassConfig = compiler.getPassConfig(); // This calls createPassConfigInternal if passes is null
        PassConfig customPassConfig = new DefaultPassConfig(options); // A different PassConfig instance
        compiler.setPassConfig(customPassConfig);
        // Verify that the custom pass config is set
        assertNotSame(defaultPassConfig, compiler.getPassConfig()); // getPassConfig() will return the new one
        assertEquals(customPassConfig, compiler.getPassConfig());
    }


    @Test
    public void testGetMessages() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(x) { return x; );"); // Syntax error
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        JSError[] messages = compiler.getMessages();
        assertTrue(messages.length > 0);
        assertEquals(compiler.getErrors()[0], messages[0]); // getMessages should return errors
    }

    @Test
    public void testNewExternInput() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        // Need to parse to initialize externsRoot, which is done by init or compile
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options); // Initialize with empty inputs
        CompilerInput externInput = compiler.newExternInput("newExtern.js");
        assertNotNull(externInput);
        assertTrue(externInput.isExtern());
        assertEquals("newExtern.js", externInput.getName());
        assertNotNull(compiler.getInput("newExtern.js"));
        assertEquals(externInput, compiler.getInput("newExtern.js"));
    }

    @Test
    public void testGetTypeRegistry() throws Exception {
        Compiler compiler = new Compiler();
        JSTypeRegistry registry = compiler.getTypeRegistry();
        assertNotNull(registry);
        // Ensure it's initialized correctly
        assertTrue(registry.hasNamespace("Math")); // Example check if default types are loaded
    }

    @Test
    public void testGetTopScope() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, options); // Initialize to populate scope
        compiler.parse(); // Parsing initializes the scope
        Scope topScope = compiler.getTopScope();
        assertNotNull(topScope);
        // The top scope should typically be global
        assertTrue(topScope.isGlobal());
    }
    
    @Test
    public void testGetReverseAbstractInterpreter() {
        Compiler compiler = new Compiler();
        compiler.initOptions(new CompilerOptions()); // Needs options
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{}, new CompilerOptions()); // Initialize
        ReverseAbstractInterpreter interpreter = compiler.getReverseAbstractInterpreter();
        assertNotNull(interpreter);
    }

    @Test
    public void testToString() {
        Compiler compiler = new Compiler();
        // The default toString() might just return the class name or an internal representation.
        // We check it doesn't throw an error and returns a string.
        String compilerString = compiler.toString();
        assertNotNull(compilerString);
        assertTrue(compilerString.contains("Compiler"));
    }
    
    // getLength() is not a public method of Compiler. It belongs to CodeBuilder.
    // Testing it directly on Compiler is not possible with the provided API.

    @Test
    public void testProcessDefines() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        options.setDefineToBooleanLiteral("DEBUG", true);
        JSSourceFile input = JSSourceFile.fromCode("input.js", "if (DEBUG) { alert('hi'); }");
        compiler.init(new JSSourceFile[]{}, new JSSourceFile[]{input}, options);
        compiler.parse();
        compiler.processDefines();
        // After processDefines, the 'if' should be processed.
        // Verifying output is complex without full compilation.
        // We check that it doesn't throw an error and that the options are updated for `DEBUG`.
        // A more robust test would involve running passes that use defines.
        String source = compiler.toSource();
        assertTrue(source.contains("if (true)")); // Simple check that it processed
    }

    @Test
    public void testReportCodeChange() throws Exception {
        Compiler compiler = new Compiler();
        // This method is called internally by passes that modify the AST.
        // To test it directly, we'd need to hook into a pass or simulate a change.
        // The simplest is to ensure it doesn't throw an exception.
        compiler.reportCodeChange(); // Should not throw an exception
    }

    @Test
    public void testGetWarningCount() throws Exception {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        assertEquals(0, compiler.getWarningCount());
        
        DiagnosticType warningType = DiagnosticType.warning("TEST_WARNING", "A test warning.");
        compiler.report(JSError.make(warningType));
        assertEquals(1, compiler.getWarningCount());
    }


}


