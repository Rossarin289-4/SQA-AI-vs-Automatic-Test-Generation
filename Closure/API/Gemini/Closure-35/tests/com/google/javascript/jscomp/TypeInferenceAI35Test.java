package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TypeInferenceAI35Test {

  @Test
  public void testTypeInferenceBasicCompilation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @type {number} */ var x = 10;");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length == 0);
  }

  @Test
  public void testTypeInferenceWithFunctionAndVar() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "function f(/** string */ str) { return str.length; }");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length == 0);
  }

  @Test
  public void testTypeInferenceShortCircuitAnd() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @type {(string|null)} */ var x = 'abc';" +
        "var y = x && x.length;");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length == 0);
  }
}
