package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TypeInferenceAI25Test {

  @Test
  public void testTypeInferenceBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length == 0);
  }

  @Test
  public void testTypeInferenceWithFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(a) { return a + 1; } f(5);");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length == 0);
  }

  @Test
  public void testTypeInferenceCondition() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = true ? 1 : 2;");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(compiler.getErrors().length == 0);
  }
}
