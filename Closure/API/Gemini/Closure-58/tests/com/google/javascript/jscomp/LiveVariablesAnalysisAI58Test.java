package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class LiveVariablesAnalysisAI58Test {

  @Test
  public void testAnalysisCreationAndEscapedLocals() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f(a) { var x = 1; return x; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    Scope topScope = compiler.getTopScope();
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(root, true, true);
    LiveVariablesAnalysis analysis = new LiveVariablesAnalysis(cfg, topScope, compiler);

    assertNotNull(analysis.getEscapedLocals());
    assertTrue(analysis.isForward() == false);
  }

  @Test
  public void testEntryAndInitialEstimateLattice() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function g() { var y = 2; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    Scope topScope = compiler.getTopScope();
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(root, true, true);
    LiveVariablesAnalysis analysis = new LiveVariablesAnalysis(cfg, topScope, compiler);

    assertNotNull(analysis.createEntryLattice());
    assertNotNull(analysis.createInitialEstimateLattice());
  }

  @Test
  public void testGetVarIndex() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function h() { var z = 3; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    Scope topScope = compiler.getTopScope();
    ControlFlowGraph<Node> cfg = new ControlFlowGraph<Node>(root, true, true);
    LiveVariablesAnalysis analysis = new LiveVariablesAnalysis(cfg, topScope, compiler);

    boolean caught = false;
    try {
      analysis.getVarIndex("nonexistent");
    } catch (Exception e) {
      caught = true;
    }
    assertTrue(caught);
  }
}
