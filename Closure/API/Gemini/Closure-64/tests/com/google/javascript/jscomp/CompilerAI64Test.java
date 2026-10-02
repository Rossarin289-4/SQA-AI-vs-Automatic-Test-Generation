package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompilerAI64Test {

  @Test
  public void testGetSourceLineInvalidLineNumber() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceLine("test.js", 0));
    assertNull(compiler.getSourceLine("test.js", -1));
  }

  @Test
  public void testGetSourceRegionInvalidLineNumber() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceRegion("test.js", 0));
    assertNull(compiler.getSourceRegion("test.js", -5));
  }

  @Test
  public void testGetAstDotGraphEmpty() throws Exception {
    Compiler compiler = new Compiler();
    String dotGraph = compiler.getAstDotGraph();
    assertNotNull(dotGraph);
    assertEquals("", dotGraph);
  }
}
