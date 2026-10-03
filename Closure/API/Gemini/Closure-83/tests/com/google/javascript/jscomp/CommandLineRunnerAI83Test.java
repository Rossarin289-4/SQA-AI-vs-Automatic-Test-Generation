package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommandLineRunnerAI83Test {

  @Test
  public void testShouldRunCompilerValid() {
    String[] args = new String[] {"--js", "test.js"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testShouldRunCompilerHelp() {
    String[] args = new String[] {"--help"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testGetDefaultExterns() throws Exception {
    assertNotNull(CommandLineRunner.getDefaultExterns());
    assertFalse(CommandLineRunner.getDefaultExterns().isEmpty());
  }
}
