package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypeCheckAI96Test {

  @Test
  public void testTypeCheckValidAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @type {number} */ var x = 10;");

    Result result = compiler.compile(externs, input);
    assertTrue(result.success);
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testTypeCheckInvalidAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @type {number} */ var x = 'not a number';");

    Result result = compiler.compile(externs, input);
    assertFalse(result.success);
    assertTrue(result.errors.length > 0);
  }

  @Test
  public void testGetTypedPercentZero() {
    Compiler compiler = new Compiler();
    TypeCheck typeCheck = new TypeCheck(compiler, compiler.getTypeRegistry(), null);
    assertEquals(0.0, typeCheck.getTypedPercent(), 0.001);
  }
}
