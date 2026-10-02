package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PeepholeOptimizationsPassAI13Test {

  @Test
  public void testGetCompiler() {
    Compiler compiler = new Compiler();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    assertEquals(compiler, pass.getCompiler());
  }

  @Test
  public void testProcessPassWithNoOptimizations() {
    Compiler compiler = new Compiler();
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testVisitNodeNullOptimization() {
    Compiler compiler = new Compiler();
    AbstractPeepholeOptimization dummyOpt = new AbstractPeepholeOptimization() {
      @Override
      Node optimizeSubtree(Node subtree) {
        return null;
      }
    };
    PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler, dummyOpt);
    Node node = new Node(Token.BLOCK);
    pass.visit(node);
    assertNotNull(compiler);
  }
}
