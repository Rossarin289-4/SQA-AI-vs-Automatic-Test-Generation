package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InlineVariablesAI155Test {

  private final Compiler compiler = new Compiler();

  private void test(String original, String expected) {
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test", original) },
        new CompilerOptions());
    Node root = compiler.parse();
    InlineVariables pass = new InlineVariables(
        compiler, InlineVariables.Mode.ALL, true);
    pass.process(null, root);
    String result = compiler.toSource(root);
    assertEquals(expected, result);
  }

  @Test
  public void testInlineConstantVariable() {
    test("var FOO = 5; var x = FOO;", "var x = 5;");
  }

  @Test
  public void testInlineLocalVariable() {
    test("function f() { var x = 10; return x; }", "function f() { return 10; }");
  }

  @Test
  public void testNoInlineAssignedVariable() {
    String code = "var x = 10; x = 20; var y = x;";
    test(code, code);
  }
}
