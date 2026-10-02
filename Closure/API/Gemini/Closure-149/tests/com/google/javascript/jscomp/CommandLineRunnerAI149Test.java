package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

public class CommandLineRunnerAI149Test {

  @Test
  public void testGetDefaultExterns() throws IOException {
    List<JSSourceFile> externs = CommandLineRunner.getDefaultExterns();
    assertNotNull(externs);
    assertFalse(externs.isEmpty());
  }

  @Test
  public void testShouldRunCompilerWithHelp() {
    String[] args = new String[] { "--help" };
    CommandLineRunner runner = new CommandLineRunner(args);
    assertFalse(runner.shouldRunCompiler());
  }

  @Test
  public void testCreateOptions() {
    String[] args = new String[] {};
    CommandLineRunner runner = new CommandLineRunner(args);
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }
}
