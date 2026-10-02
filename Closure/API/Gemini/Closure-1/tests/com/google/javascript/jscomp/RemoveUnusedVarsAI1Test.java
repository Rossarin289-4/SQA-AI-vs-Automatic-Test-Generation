package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveUnusedVarsAI1Test {

  @Test
  public void testRemoveUnusedLocalVar() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.removeUnusedLocalVars = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { var x = 1; return 2; }");

    compiler.compile(externs, new JSSourceFile[] { input });
    String output = compiler.toSource();
    assertEquals("function f() {return 2}", output);
  }

  @Test
  public void testPreserveUsedLocalVar() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.removeUnusedLocalVars = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { var x = 1; return x; }");

    compiler.compile(externs, new JSSourceFile[] { input });
    String output = compiler.toSource();
    assertEquals("function f() {var x=1;return x}", output);
  }

  @Test
  public void testRemoveUnusedFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.removeUnusedVars = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function unused() {} function used() {} used();");

    compiler.compile(externs, new JSSourceFile[] { input });
    String output = compiler.toSource();
    assertEquals("function used(){}used();", output);
  }
}
