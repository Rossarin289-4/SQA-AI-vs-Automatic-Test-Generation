package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeepholeFoldConstantsAI97Test {

  private final Compiler compiler = new Compiler();

  private String fold(String js) {
    compiler.init(
        new JSSourceFile[0],
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", js) },
        new CompilerOptions());
    Node root = compiler.parse();
    Node externs = new Node(Token.BLOCK);
    Node main = root.getFirstChild();
    new PeepholeFoldConstants().optimizeSubtree(main);
    return compiler.toSource(root);
  }

  @Test
  public void testFoldArrayLength() {
    assertEquals("var x=3;", fold("var x=[1, 2, 3].length;"));
  }

  @Test
  public void testFoldTypeof() {
    assertEquals("var x=\"string\";", fold("var x=typeof \"bar\";"));
  }

  @Test
  public void testFoldGetElem() {
    assertEquals("var x=2;", fold("var x=[1, 2, 3][1];"));
  }
}
