package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveUnusedVarsAI45Test {

  private Compiler compiler;

  private void compileAndTest(String original, String expected, boolean removeGlobals) {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.removeUnusedVars = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", original);

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    Node root = compiler.getRoot();

    RemoveUnusedVars remover = new RemoveUnusedVars(compiler, removeGlobals, true, false);
    remover.process(compiler.externsRoot, compiler.jsRoot);

    String result = compiler.toSource();
    assertEquals(expected, result);
  }

  @Test
  public void testUnusedLocalVariable() {
    compileAndTest("function f() { var x = 1; }", "function f() {}", true);
  }

  @Test
  public void testUsedLocalVariable() {
    compileAndTest("function f() { var x = 1; return x; }", "function f() {var x=1;return x}", true);
  }

  @Test
  public void testUnusedGlobalVariable() {
    compileAndTest("var y = 2;", "", true);
  }
}
