package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class MustBeReachingVariableDefAI30Test {

  @Test
  public void testBasicReachingDef() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "function f() { var x = 1; return x; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    assertNotNull(root);
  }

  @Test
  public void testConditionalDef() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "function f(cond) { var x; if (cond) { x = 1; } return x; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    assertNotNull(root);
  }

  @Test
  public void testIncDecDef() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "function f() { var x = 1; x++; return x; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    assertNotNull(root);
  }
}
