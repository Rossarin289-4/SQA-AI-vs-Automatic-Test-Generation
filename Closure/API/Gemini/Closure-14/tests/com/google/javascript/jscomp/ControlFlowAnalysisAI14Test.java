package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ControlFlowAnalysisAI14Test {

  @Test
  public void testMayThrowExceptionBasic() {
    Node callNode = new Node(com.google.javascript.rhino.Token.CALL);
    assertTrue(ControlFlowAnalysis.mayThrowException(callNode));

    Node funcNode = new Node(com.google.javascript.rhino.Token.FUNCTION);
    assertTrue(!ControlFlowAnalysis.mayThrowException(funcNode));
  }

  @Test
  public void testIsBreakTarget() {
    Node block = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node label = new Node(com.google.javascript.rhino.Token.LABEL, Node.newString("L"), block);
    block.setParent(label);

    assertTrue(ControlFlowAnalysis.isBreakTarget(block, "L"));
  }

  @Test
  public void testControlFlowAnalysisProcess() {
    Compiler compiler = new Compiler();
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, true, true);
    SourceFile externs = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(externs, input, new CompilerOptions());
    cfa.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertNotNull(cfa.getCfg());
  }
}
