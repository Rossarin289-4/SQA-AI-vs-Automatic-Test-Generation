package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InlineVariablesAI36Test {

  private final Compiler compiler = new Compiler();

  private void test(String original, String expected) {
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", original) },
        new CompilerOptions());
    Node root = compiler.getRoot();
    InlineVariables pass = new InlineVariables(
        compiler, InlineVariables.Mode.ALL, true);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    String actual = compiler.toSource();
    assertEquals(expected, actual);
  }

  @Test
  public void testInlineConstantVariable() {
    test("var x = 5; var y = x + 1;", "var y = 5 + 1;");
  }

  @Test
  public void testNoInlineAssignedVariable() {
    test("var x = 5; x = 10; var y = x;", "var x = 5; x = 10; var y = x;");
  }

  @Test
  public void testInlineLocalVariable() {
    test("function f() { var x = 10; return x; }", "function f() { return 10; }");
  }
}
