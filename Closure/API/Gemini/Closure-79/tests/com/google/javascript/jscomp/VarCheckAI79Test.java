package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VarCheckAI79Test {

  @Test
  public void testUndefinedVariableError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "alert(x);");

    compiler.compile(externs, new JSSourceFile[] { input }, new JSModule[0]);

    JSError[] errors = compiler.getErrors();
    assertTrue(errors.length > 0);
    assertEquals("JSC_UNDEFINED_VARIABLE", errors[0].type.name);
  }

  @Test
  public void testDefinedVariableNoErrors() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1; alert(x);");

    compiler.compile(externs, new JSSourceFile[] { input }, new JSModule[0]);

    JSError[] errors = compiler.getErrors();
    assertEquals(0, errors.length);
  }

  @Test
  public void testInvalidFunctionDeclaration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function() {}");

    compiler.compile(externs, new JSSourceFile[] { input }, new JSModule[0]);

    JSError[] errors = compiler.getErrors();
    assertTrue(errors.length > 0);
    assertEquals("JSC_INVALID_FUNCTION_DECL", errors[0].type.name);
  }
}
