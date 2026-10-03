package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class InlineFunctionsAI159Test {

  @Test
  public void testCreationWithValidArguments() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    InlineFunctions inlineFunctions = new InlineFunctions(
        compiler,
        compiler.getUniqueNameIdSupplier(),
        true,
        true,
        true
    );
    assertNotNull(inlineFunctions);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreationWithNullCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    new InlineFunctions(
        null,
        compiler.getUniqueNameIdSupplier(),
        true,
        true,
        true
    );
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCreationWithNullSupplier() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    new InlineFunctions(
        compiler,
        null,
        true,
        true,
        true
    );
  }
}
