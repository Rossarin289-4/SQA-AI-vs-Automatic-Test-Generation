package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TypeCheckAI69Test {

  @Test
  public void testTypeCheckValidAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @type {number} */ var x = 5;");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length == 0);
  }

  @Test
  public void testTypeCheckInvalidAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @type {number} */ var x = 'hello';");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length > 0);
  }

  @Test
  public void testTypedPercentCalculation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");

    compiler.compile(externs, input);
    TypeCheck typeCheck = new TypeCheck(compiler, null, compiler.getTypeRegistry());
    double percent = typeCheck.getTypedPercent();
    assertTrue(percent >= 0.0);
    assertTrue(percent <= 100.0);
  }
}
