package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TypeCheckAI66Test {

  @Test
  public void testTypeCheckCompilation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");

    compiler.compile(externs, input);
    assertNotNull(compiler.getResult());
  }

  @Test
  public void testTypedPercentZero() {
    TypeCheck typeCheck = new TypeCheck(
        new Compiler(),
        null,
        null);
    org.junit.Assert.assertEquals(0.0, typeCheck.getTypedPercent(), 0.001);
  }
}
