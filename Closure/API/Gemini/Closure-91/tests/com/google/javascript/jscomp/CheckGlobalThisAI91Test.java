package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckGlobalThisAI91Test {

  @Test
  public void testGlobalThisWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "this.a = 0;")
    };

    compiler.init(externs, inputs, options);
    compiler.parse();
    compiler.check();

    assertEquals(1, compiler.getWarningCount());
    assertEquals(CheckGlobalThis.GLOBAL_THIS, compiler.getWarnings()[0].type);
  }

  @Test
  public void testConstructorNoWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "/** @constructor */ function F() { this.a = 0; }")
    };

    compiler.init(externs, inputs, options);
    compiler.parse();
    compiler.check();

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testPrototypeMethodNoWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "function F() {} F.prototype.method = function() { this.a = 0; };")
    };

    compiler.init(externs, inputs, options);
    compiler.parse();
    compiler.check();

    assertEquals(0, compiler.getWarningCount());
  }
}
