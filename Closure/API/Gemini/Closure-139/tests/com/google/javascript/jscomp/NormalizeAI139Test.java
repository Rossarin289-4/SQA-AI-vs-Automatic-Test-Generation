package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class NormalizeAI139Test {

  @Test
  public void testNormalizeProcessBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "var a = 1, b = 2;")
    };
    compiler.init(externs, inputs, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }

  @Test
  public void testPropogateConstantAnnotations() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "/** @const */ var FOO = 1; FOO;")
    };
    compiler.init(externs, inputs, options);
    compiler.parse();
    Normalize.PropogateConstantAnnotations propagator =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    propagator.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testNormalizeAssertOnChange() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "function f() { if (true) { function g() {} } }")
    };
    compiler.init(externs, inputs, options);
    compiler.parse();
    Normalize normalize = new Normalize(compiler, true);
    normalize.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }
}
