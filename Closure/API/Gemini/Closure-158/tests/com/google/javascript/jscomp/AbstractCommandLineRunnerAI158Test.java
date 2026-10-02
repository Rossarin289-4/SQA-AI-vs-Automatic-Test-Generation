package com.google.javascript.jscomp;

import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AbstractCommandLineRunnerAI158Test {

  private static final class ConcreteRunner extends AbstractCommandLineRunner<Compiler, CompilerOptions> {
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
  public void testInTestMode() {
    ConcreteRunner runner = new ConcreteRunner();
    assertTrue(!runner.isInTestMode());

    Supplier<List<JSSourceFile>> externsSupplier = new Supplier<List<JSSourceFile>>() {
      @Override
      public List<JSSourceFile> get() {
        return ImmutableList.of(JSSourceFile.fromCode("externs.js", ""));
      }
    };
    Supplier<List<JSSourceFile>> inputsSupplier = new Supplier<List<JSSourceFile>>() {
      @Override
      public List<JSSourceFile> get() {
        return ImmutableList.of(JSSourceFile.fromCode("input.js", "var x = 1;"));
      }
    };
    Function<Integer, Boolean> exitReceiver = new Function<Integer, Boolean>() {
      @Override
      public Boolean apply(Integer integer) {
        return true;
      }
    };

    runner.enableTestMode(externsSupplier, inputsSupplier, null, exitReceiver);
    assertTrue(runner.isInTestMode());
  }

  @Test
  public void testDiagnosticGroups() {
    ConcreteRunner runner = new ConcreteRunner();
    DiagnosticGroups groups = runner.getDiagnosticGroups();
    assertNotNull(groups);
  }

  @Test
  public void testCommandLineConfig() {
    ConcreteRunner runner = new ConcreteRunner();
    AbstractCommandLineRunner.CommandLineConfig config = runner.getCommandLineConfig();
    assertNotNull(config);
    config.setCharset("UTF-8");
    config.setAcceptConstKeyword(true);
  }
}
