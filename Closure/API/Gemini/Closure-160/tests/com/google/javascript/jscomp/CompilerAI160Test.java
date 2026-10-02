package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class CompilerAI160Test {

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
  public void testGetErrorManagerLazyInit() {
    Compiler compiler = new Compiler();
    assertNotNull(compiler.getErrorManager());
  }
}
