package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CommandLineRunnerAI151Test {

  @Test
  public void testGetDefaultExterns() throws Exception {
    java.util.List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
    assertNotNull(externs);
    assertTrue(!externs.isEmpty());
  }

  @Test
  public void testShouldRunCompilerValid() {
    String[] args = new String[] {"--js", "test.js"};
    CommandLineRunner runner = new CommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testCreateCompiler() {
    String[] args = new String[] {"--js", "test.js"};
    CommandLineRunner runner = new CommandLineRunner(args);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }
}
