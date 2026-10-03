package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class NormalizeAI102Test {

  @Test
  public void testNormalizeProcess() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 0, b = 1;");
    compiler.init(new JSSourceFile[] {extern}, new JSSourceFile[] {input}, options);
    Node root = compiler.parse();
    assertNotNull(root);
    Normalize normalizer = new Normalize(compiler, false);
    normalizer.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }

  @Test
  public void testPropogateConstantAnnotations() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @const */ var FOO = 1;");
    compiler.init(new JSSourceFile[] {extern}, new JSSourceFile[] {input}, options);
    Node root = compiler.parse();
    assertNotNull(root);
    Normalize.PropogateConstantAnnotations propagator =
        new Normalize.PropogateConstantAnnotations(compiler, false);
    propagator.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }

  @Test
  public void testNormalizeWithAssertOnChange() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 5;");
    compiler.init(new JSSourceFile[] {extern}, new JSSourceFile[] {input}, options);
    Node root = compiler.parse();
    assertNotNull(root);
    Normalize normalizer = new Normalize(compiler, false);
    normalizer.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }
}
