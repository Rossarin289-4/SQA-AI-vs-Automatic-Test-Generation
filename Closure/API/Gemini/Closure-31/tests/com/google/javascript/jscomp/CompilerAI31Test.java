package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompilerAI31Test {

  @Test
  public void testProgressBounds() {
    Compiler compiler = new Compiler();
    compiler.setProgress(1.5);
    assertEquals(1.0, compiler.getProgress(), 0.001);

    compiler.setProgress(-0.5);
    assertEquals(0.0, compiler.getProgress(), 0.001);

    compiler.setProgress(0.5);
    assertEquals(0.5, compiler.getProgress(), 0.001);
  }

  @Test
  public void testRegExpGlobalReferences() {
    Compiler compiler = new Compiler();
    assertTrue(compiler.hasRegExpGlobalReferences());
    compiler.setHasRegExpGlobalReferences(false);
    assertFalse(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testSynthesizedExternsInput() {
    Compiler compiler = new Compiler();
    CompilerInput input1 = compiler.getSynthesizedExternsInput();
    CompilerInput input2 = compiler.getSynthesizedExternsInput();
    assertNotNull(input1);
    assertSame(input1, input2);
  }
}
