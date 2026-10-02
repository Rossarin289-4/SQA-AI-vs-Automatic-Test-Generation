package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Test;

public class ControlFlowAnalysisAI103Test {

  @Test
  public void testControlFlowAnalysisSimple() {
    Compiler compiler = new Compiler();
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
    Node root = new Node(Token.BLOCK);
    cfa.process(null, root);
    Assert.assertNotNull(cfa.getCfg());
  }

  @Test
  public void testControlFlowAnalysisWithStatement() {
    Compiler compiler = new Compiler();
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
    Node root = new Node(Token.BLOCK, new Node(Token.EXPR_RESULT, new Node(Token.NUMBER, 1)));
    cfa.process(null, root);
    Assert.assertNotNull(cfa.getCfg().getEntry());
  }

  @Test
  public void testMayThrowException() {
    Compiler compiler = new Compiler();
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true);
    Node callNode = new Node(Token.CALL, new Node(Token.NAME, "foo"));
    Node root = new Node(Token.BLOCK, callNode);
    cfa.process(null, root);
    Assert.assertNotNull(cfa.getCfg());
  }
}
