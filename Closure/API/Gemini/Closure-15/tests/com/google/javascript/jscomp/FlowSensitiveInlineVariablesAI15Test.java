package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlowSensitiveInlineVariablesAI15Test {

  private Compiler compiler;

  private void test(String js, String expected) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.flowSensitiveInlineVariables = true;
    compiler.initOptions(options);
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {JSSourceFile.fromCode("test", js)},
        options);
    compiler.parse();
    compiler.processDefines();
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    pass.process(null, compiler.getRoot());
    String result = compiler.toSource();
    assertEquals(expected, result);
  }

  @Test
  public void testInlineSimpleVariable() {
    test("function f() { var x = 1; return x; }", "function f() {return 1;}");
  }

  @Test
  public void testNoInlineGlobalScope() {
    test("var x = 1; function f() { return x; }", "var x=1;function f(){return x;}");
  }

  @Test
  public void testNoInlineMultipleUses() {
    test("function f() { var x = 1; return x + x; }", "function f(){var x=1;return x+x;}");
  }
}
