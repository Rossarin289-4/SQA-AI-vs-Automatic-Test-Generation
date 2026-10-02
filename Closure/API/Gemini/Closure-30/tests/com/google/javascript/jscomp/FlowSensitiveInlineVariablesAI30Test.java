package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlowSensitiveInlineVariablesAI30Test {

  private Compiler compiler;

  private void compileAndCheck(String js, String expected) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.flowSensitiveInlineVariables = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", js);
    compiler.compile(externs, new JSSourceFile[] { input }, options);

    Node root = compiler.getRoot();
    String generated = compiler.toSource();
    assertEquals(expected, generated.trim());
  }

  @Test
  public void testInlineSimpleVariable() {
    String js = "function f() { var x = 1; return x; }";
    String expected = "function f(){return 1;}";
    compileAndCheck(js, expected);
  }

  @Test
  public void testNoInlineAssignedTwice() {
    String js = "function f() { var x = 1; x = 2; return x; }";
    String expected = "function f(){var x=1;x=2;return x;}";
    compileAndCheck(js, expected);
  }

  @Test
  public void testInlineAssignExpression() {
    String js = "function f() { var x; x = 5; return x; }";
    String expected = "function f(){return 5;}";
    compileAndCheck(js, expected);
  }
}
