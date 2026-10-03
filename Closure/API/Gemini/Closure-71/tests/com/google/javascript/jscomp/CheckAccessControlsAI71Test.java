package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckAccessControlsAI71Test {

  @Test
  public void testPrivatePropertyAccessAllowedInSameFile() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options);
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @constructor */\n" +
        "function Foo() {\n" +
        "  /** @private */\n" +
        "  this.bar = 1;\n" +
        "}\n" +
        "Foo.prototype.method = function() {\n" +
        "  return this.bar;\n" +
        "};\n");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    compiler.processDefines();
    compiler.check();

    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testPrivateConstructorAccessNewDisallowed() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options);
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input1 = JSSourceFile.fromCode("input1.js",
        "/** @constructor @private */\n" +
        "function PrivateCtor() {}\n");
    JSSourceFile input2 = JSSourceFile.fromCode("input2.js",
        "var x = new PrivateCtor();\n");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input1, input2 }, options);
    compiler.parse();
    compiler.processDefines();
    compiler.check();

    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testDeprecatedFunctionCallWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options);
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @deprecated */\n" +
        "function oldFunc() {}\n" +
        "oldFunc();\n");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    compiler.processDefines();
    compiler.check();

    assertEquals(1, compiler.getWarningCount());
  }
}
