package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeepholeFoldConstantsAI148Test {

  @Test
  public void testFoldTypeofString() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node node = compiler.parse(SourceFile.fromCode("test", "typeof 'abc';"));
    Node script = node.getFirstChild();
    Node exprStmt = script.getFirstChild();
    Node typeofNode = exprStmt.getFirstChild();

    PeepholeFoldConstants folder = new PeepholeFoldConstants();
    folder.beginTraversal(compiler);
    Node folded = folder.optimizeSubtree(typeofNode);
    folder.endTraversal(compiler);

    assertEquals(Token.STRING, folded.getType());
    assertEquals("string", folded.getString());
  }

  @Test
  public void testFoldArrayLength() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node node = compiler.parse(SourceFile.fromCode("test", "[1, 2, 3].length;"));
    Node script = node.getFirstChild();
    Node exprStmt = script.getFirstChild();
    Node getPropNode = exprStmt.getFirstChild();

    PeepholeFoldConstants folder = new PeepholeFoldConstants();
    folder.beginTraversal(compiler);
    Node folded = folder.optimizeSubtree(getPropNode);
    folder.endTraversal(compiler);

    assertEquals(Token.NUMBER, folded.getType());
    assertEquals(3.0, folded.getDouble(), 0.0);
  }

  @Test
  public void testFoldGetElem() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node node = compiler.parse(SourceFile.fromCode("test", "['a', 'b', 'c'][1];"));
    Node script = node.getFirstChild();
    Node exprStmt = script.getFirstChild();
    Node getElemNode = exprStmt.getFirstChild();

    PeepholeFoldConstants folder = new PeepholeFoldConstants();
    folder.beginTraversal(compiler);
    Node folded = folder.optimizeSubtree(getElemNode);
    folder.endTraversal(compiler);

    assertEquals(Token.STRING, folded.getType());
    assertEquals("b", folded.getString());
  }
}
