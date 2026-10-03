package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DeadAssignmentsEliminationAI88Test {

  @Test
  public void testDeadAssignmentRemoved() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.deadAssignmentElimination = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { var x = 1; x = 2; return x; }");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    String result = compiler.toSource();
    assertEquals("function f(){var x;x=2;return x}", result);
  }

  @Test
  public void testLiveAssignmentNotRemoved() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.deadAssignmentElimination = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { var x = 1; return x; }");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    String result = compiler.toSource();
    assertEquals("function f(){var x=1;return x}", result);
  }

  @Test
  public void testIdentityAssignmentRemoved() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.deadAssignmentElimination = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { var x = 1; x = x; return x; }");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    String result = compiler.toSource();
    assertEquals("function f(){var x=1;return x}", result);
  }
}
