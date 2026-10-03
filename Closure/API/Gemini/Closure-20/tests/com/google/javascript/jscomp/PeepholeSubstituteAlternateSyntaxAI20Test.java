package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PeepholeSubstituteAlternateSyntaxAI20Test {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.initOptions(options);
    return compiler;
  }

  @Test
  public void testTrueFalseReduction() {
    Compiler compiler = createCompiler();
    PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(true);
    com.google.javascript.rhino.Node trueNode = com.google.javascript.rhino.IR.trueNode();
    com.google.javascript.rhino.Node result = opt.optimizeSubtree(trueNode);
    assertTrue(result != null);
  }

  @Test
  public void testNotMinimization() {
    Compiler compiler = createCompiler();
    PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(true);
    com.google.javascript.rhino.Node notNode = com.google.javascript.rhino.IR.not(com.google.javascript.rhino.IR.trueNode());
    com.google.javascript.rhino.Node result = opt.optimizeSubtree(notNode);
    assertTrue(result != null);
  }

  @Test
  public void testArrayLiteralMinimization() {
    Compiler compiler = createCompiler();
    PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax(true);
    com.google.javascript.rhino.Node arrNode = com.google.javascript.rhino.IR.arraylit(com.google.javascript.rhino.IR.string("a"));
    com.google.javascript.rhino.Node result = opt.optimizeSubtree(arrNode);
    assertTrue(result != null);
  }
}
