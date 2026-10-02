package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompilerAI149Test {

  @Test
  public void testGetSourceLineInvalidLine() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceLine("nonexistent.js", 0));
    assertNull(compiler.getSourceLine("nonexistent.js", -1));
  }

  @Test
  public void testGetSourceRegionInvalidLine() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceRegion("nonexistent.js", 0));
    assertNull(compiler.getSourceRegion("nonexistent.js", -5));
  }

  @Test
  public void testGetAstDotGraphEmpty() throws Exception {
    Compiler compiler = new Compiler();
    assertEquals("", compiler.getAstDotGraph());
  }
}
