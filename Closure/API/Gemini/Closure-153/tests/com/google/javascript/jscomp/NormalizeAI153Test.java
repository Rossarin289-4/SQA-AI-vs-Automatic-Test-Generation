package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NormalizeAI153Test {

  @Test
  public void testNormalizeSplitVar() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1, b = 2;");
    compiler.init(externs, new JSSourceFile[] { input }, new CompilerOptions());
    Node root = compiler.parse();
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
    String result = compiler.toSource();
    assertEquals("var a=1;var b=2;", result);
  }

  @Test
  public void testNormalizeWhileToFor() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "while(x){foo();}");
    compiler.init(externs, new JSSourceFile[] { input }, new CompilerOptions());
    Node root = compiler.parse();
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
    String result = compiler.toSource();
    assertEquals("for(;x;)foo();", result);
  }

  @Test
  public void testNormalizeDuplicateVar() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1; var a = 2;");
    compiler.init(externs, new JSSourceFile[] { input }, new CompilerOptions());
    Node root = compiler.parse();
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externs, root);
    String result = compiler.toSource();
    assertEquals("var a=1;a=2;", result);
  }
}
