package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CommandLineRunnerAI158Test {

  @Test
  public void testHelpFlag() {
    String[] args = new String[] { "--help" };
    CommandLineRunner runner = new CommandLineRunner(args);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testValidArguments() {
    String[] args = new String[] { "--js", "test.js" };
    CommandLineRunner runner = new CommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testGetDefaultExterns() throws Exception {
    assertFalse(CommandLineRunner.getDefaultExterns().isEmpty());
  }
}
