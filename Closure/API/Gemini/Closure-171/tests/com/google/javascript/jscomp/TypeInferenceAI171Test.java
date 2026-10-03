package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TypeInferenceAI171Test {

  @Test
  public void testTypeInferenceBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(x) { return x; } f(1);");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(result.success);
  }

  @Test
  public void testTypeInferenceShortCircuitAnd() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = true && 1;");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(result.success);
  }

  @Test
  public void testTypeInferenceShortCircuitOr() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = false || 'hello';");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertTrue(result.success);
  }
}
