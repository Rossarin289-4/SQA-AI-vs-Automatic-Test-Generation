package com.google.javascript.jscomp;

import junit.framework.TestCase;
import org.junit.Test;

public class FlowSensitiveInlineVariablesAI3Test extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
  }

  private void test(String js, String expected) {
    CompilerOptions options = new CompilerOptions();
    options.flowSensitiveInlineVariables = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {JSSourceFile.fromCode("test.js", js)},
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    NodeTraversal.traverse(compiler, root, pass);
    String result = compiler.toSource();
    assertEquals(expected, result);
  }

  @Test
  public void testInlineVariableBasic() {
    test("function f() { var x = 1; return x; }", "function f() {return 1;}");
  }

  @Test
  public void testNoInlineGlobal() {
    String js = "var x = 1; function f() { return x; }";
    test(js, js);
  }

  @Test
  public void testInlineAssign() {
    test("function f() { var x; x = 2; return x; }", "function f() {return 2;}");
  }
}
