package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AbstractCommandLineRunnerAI149Test {

  private static final class TestRunner extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
    TestRunner() {
      super();
    }

    @Override
    protected Compiler createCompiler() {
      return new Compiler();
    }

    @Override
    protected CompilerOptions createOptions() {
      return new CompilerOptions();
    }
  }

  @Test
  public void testCreateCompiler() {
    TestRunner runner = new TestRunner();
    Compiler compiler = runner.createCompiler();
    assertNotNull(compiler);
  }

  @Test
  public void testCreateOptions() {
    TestRunner runner = new TestRunner();
    CompilerOptions options = runner.createOptions();
    assertNotNull(options);
  }

  @Test
  public void testGetCommandLineConfig() {
    TestRunner runner = new TestRunner();
    assertNotNull(runner.getCommandLineConfig());
  }
}
