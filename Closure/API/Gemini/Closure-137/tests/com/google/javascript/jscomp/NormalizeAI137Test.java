package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NormalizeAI137Test {

  @Test
  public void testProcessNormalizeVarSplit() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {JSSourceFile.fromCode("testcode", "var a = 1, b = 2;")},
        options);
    Node root = compiler.parse();
    assertNotNull(root);
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.externsRoot, root);
    assertEquals("var a=1;var b=2;", compiler.toSource());
  }

  @Test
  public void testProcessNormalizeUniqueNames() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {JSSourceFile.fromCode("testcode", "function f() { var a = 1; } function g() { var a = 2; }")},
        options);
    Node root = compiler.parse();
    assertNotNull(root);
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.externsRoot, root);
    String source = compiler.toSource();
    org.junit.Assert.assertTrue(source.contains("a$");
  }

  @Test
  public void testProcessNormalizeRemoveDuplicateDeclarations() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {JSSourceFile.fromCode("testcode", "var x; var x;")},
        options);
    Node root = compiler.parse();
    assertNotNull(root);
    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.externsRoot, root);
    assertEquals("var x;", compiler.toSource());
  }
}
