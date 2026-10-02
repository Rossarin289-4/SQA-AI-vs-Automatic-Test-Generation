package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompilerAI140Test {

  @Test
  public void testGetSourceLineInvalidLine() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceLine("test.js", 0));
    assertNull(compiler.getSourceLine("test.js", -1));
  }

  @Test
  public void testGetSourceRegionInvalidLine() {
    Compiler compiler = new Compiler();
    assertNull(compiler.getSourceRegion("test.js", 0));
    assertNull(compiler.getSourceRegion("test.js", -5));
  }

  @Test
  public void testInitialErrorAndWarningCounts() {
    Compiler compiler = new Compiler();
    assertEquals(0, compiler.getErrorCount());
    assertEquals(0, compiler.getWarningCount());
  }
}
