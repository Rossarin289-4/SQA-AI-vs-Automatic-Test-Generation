package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;

public class TypeInferenceAI112Test {

  @Test
  public void testTypeInferenceBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "var x = 10;");

    Result result = compiler.compile(externs, input, new CompilerOptions());
    Assert.assertTrue(result.success);
  }

  @Test
  public void testTypeInferenceWithFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @param {number} x */ function f(x) { return x + 1; }");

    Result result = compiler.compile(externs, input, new CompilerOptions());
    Assert.assertTrue(result.success);
  }

  @Test
  public void testTypeInferenceShortCircuit() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var undefined;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "var a = true; var b = a && 123;");

    Result result = compiler.compile(externs, input, new CompilerOptions());
    Assert.assertTrue(result.success);
  }
}
