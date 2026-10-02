package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeepholeReplaceKnownMethodsAI50Test {

  private final Compiler compiler = new Compiler();

  private String optimize(String js) {
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {JSSourceFile.fromCode("test.js", js)},
        new CompilerOptions());
    compiler.parse();
    Node root = compiler.getRoot();
    PeepholeReplaceKnownMethods optimizations = new PeepholeReplaceKnownMethods();
    optimizations.beginTraversal(compiler);
    Node optimized = optimizations.optimizeSubtree(root.getLastChild());
    optimizations.endTraversal(compiler);
    return compiler.toSource(optimized);
  }

  @Test
  public void testStringSubstrFolding() {
    String result = optimize("var x = 'abcdef'.substr(1, 3);");
    assertEquals("var x=\"bcd\"", result);
  }

  @Test
  public void testStringSubstringFolding() {
    String result = optimize("var x = 'abcdef'.substring(1, 4);");
    assertEquals("var x=\"bcd\"", result);
  }

  @Test
  public void testStringCharAtFolding() {
    String result = optimize("var x = 'abcdef'.charAt(2);");
    assertEquals("var x=\"c\"", result);
  }
}
