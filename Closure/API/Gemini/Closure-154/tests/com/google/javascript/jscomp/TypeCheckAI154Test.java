package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypeCheckAI154Test {

  @Test
  public void testTypeCheckValidAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @type {number} */ var x = 5;");

    Result result = compiler.compile(externs, input, options);
    assertTrue(result.success);
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testTypeCheckInvalidAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @type {number} */ var x = 'hello';");

    Result result = compiler.compile(externs, input, options);
    assertFalse(result.success);
    assertTrue(result.errors.length > 0);
  }

  @Test
  public void testTypedPercent() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");

    compiler.compile(externs, input, options);
    TypeCheck typeCheck = new TypeCheck(compiler, compiler.getTypeRegistry(), compiler.getPolicy());
    assertTrue(typeCheck.getTypedPercent() >= 0.0);
  }
}
