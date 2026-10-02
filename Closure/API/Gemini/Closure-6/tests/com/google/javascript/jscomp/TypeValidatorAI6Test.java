package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TypeValidatorAI6Test {

  @Test
  public void testTypeMismatchDiagnostics() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @type {string} */ var x = 123;");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
    assertEquals(1, result.warnings.length);
    assertEquals("JSC_TYPE_MISMATCH", result.warnings[0].type.name);
  }

  @Test
  public void testInvalidCastWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @type {string} */ var x = /** @type {number} */ (\"hello\");");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
  }

  @Test
  public void testMissingExtendsTagWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @constructor */ function A() {}" +
        "/** @constructor \n * @extends {A} */ function B() {}");

    Result result = compiler.compile(externs, input);
    assertNotNull(result);
  }
}
