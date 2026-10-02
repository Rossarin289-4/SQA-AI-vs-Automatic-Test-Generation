package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompilerOptionsAI149Test {

  @Test
  public void testClone() throws Exception {
    CompilerOptions options = new CompilerOptions();
    options.ideMode = true;
    options.setManageClosureDependencies(true);

    CompilerOptions clone = (CompilerOptions) options.clone();
    assertNotNull(clone);
    assertTrue(clone.ideMode);
  }

  @Test
  public void testColorizeErrorOutput() {
    CompilerOptions options = new CompilerOptions();
    assertFalse(options.shouldColorizeErrorOutput());
    options.setColorizeErrorOutput(true);
    assertTrue(options.shouldColorizeErrorOutput());
  }

  @Test
  public void testRuntimeTypeCheck() {
    CompilerOptions options = new CompilerOptions();
    options.enableRuntimeTypeCheck("myLogFunc");
    options.disableRuntimeTypeCheck();
  }
}
