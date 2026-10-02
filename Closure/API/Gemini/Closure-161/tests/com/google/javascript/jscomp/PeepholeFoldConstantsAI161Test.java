package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeepholeFoldConstantsAI161Test {

  private Compiler compiler = new Compiler();

  private String optimize(String js) {
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", js) },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    PeepholeFoldConstants folder = new PeepholeFoldConstants();
    folder.beginTraversal(compiler);
    folder.optimizeSubtree(root.getLastChild());
    folder.endTraversal(compiler);
    return compiler.toSource();
  }

  @Test
  public void testFoldArrayLength() {
    String result = optimize("var x = [1, 2, 3].length;");
    assertEquals("var x=3;", result);
  }

  @Test
  public void testFoldArrayAccess() {
    String result = optimize("var x = [10, 20, 30][1];");
    assertEquals("var x=20;", result);
  }

  @Test
  public void testFoldObjectPropAccess() {
    String result = optimize("var x = {a: 123}.a;");
    assertEquals("var x=123;", result);
  }
}
