package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AbstractCommandLineRunnerAI143Test {

  private static class DummyRunner extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
    DummyRunner(String[] args) {
      super();
    }

    @Override
    protected Compiler createCompiler() {
      return new Compiler();
    }

    @Override
    protected CompilerOptions createOptions() {
      CompilerOptions options = new CompilerOptions();
      return options;
    }
  }

  @Test
  public void testCommandLineConfigDefaults() {
    DummyRunner runner = new DummyRunner(new String[]{});
    assertNotNull(runner.getCommandLineConfig());
  }

  @Test
  public void testCreateCompiler() {
    DummyRunner runner = new DummyRunner(new String[]{});
    assertNotNull(runner.createCompiler());
  }

  @Test
  public void testCreateOptions() {
    DummyRunner runner = new DummyRunner(new String[]{});
    assertNotNull(runner.createOptions());
  }
}
