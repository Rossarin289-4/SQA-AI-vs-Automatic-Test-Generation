package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class MaybeReachingVariableUseAI12Test {

  @Test
  public void testCreateEntryLattice() {
    Compiler compiler = new Compiler();
    ControlFlowGraph<com.google.javascript.rhino.Node> cfg = new ControlFlowGraph<com.google.javascript.rhino.Node>(null, false, false);
    Scope scope = new Scope(null, null);
    MaybeReachingVariableUse analysis = new MaybeReachingVariableUse(cfg, scope, compiler);
    assertNotNull(analysis.createEntryLattice());
  }

  @Test
  public void testCreateInitialEstimateLattice() {
    Compiler compiler = new Compiler();
    ControlFlowGraph<com.google.javascript.rhino.Node> cfg = new ControlFlowGraph<com.google.javascript.rhino.Node>(null, false, false);
    Scope scope = new Scope(null, null);
    MaybeReachingVariableUse analysis = new MaybeReachingVariableUse(cfg, scope, compiler);
    assertNotNull(analysis.createInitialEstimateLattice());
  }

  @Test
  public void testIsForward() {
    Compiler compiler = new Compiler();
    ControlFlowGraph<com.google.javascript.rhino.Node> cfg = new ControlFlowGraph<com.google.javascript.rhino.Node>(null, false, false);
    Scope scope = new Scope(null, null);
    MaybeReachingVariableUse analysis = new MaybeReachingVariableUse(cfg, scope, compiler);
    org.junit.Assert.assertFalse(analysis.isForward());
  }
}
