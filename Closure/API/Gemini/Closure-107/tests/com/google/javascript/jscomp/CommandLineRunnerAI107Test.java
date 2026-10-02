package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CommandLineRunnerAI107Test {

  @Test
  public void testGetDefaultExterns() throws Exception {
    java.util.List<SourceFile> externs = CommandLineRunner.getDefaultExterns();
    assertNotNull(externs);
    assertTrue(!externs.isEmpty());
  }

  @Test
  public void testShouldRunCompilerValid() {
    String[] args = new String[] { "--js", "test.js" };
    CommandLineRunner runner = new CommandLineRunner(args);
    assertTrue(runner.shouldRunCompiler());
  }

  @Test
  public void testCreateCompiler() {
    String[] args = new String[] {};
    CommandLineRunner runner = new CommandLineRunner(args);
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }
}
