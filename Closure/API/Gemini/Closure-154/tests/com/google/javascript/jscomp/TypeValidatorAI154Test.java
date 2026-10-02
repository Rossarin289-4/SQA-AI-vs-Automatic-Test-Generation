package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TypeValidatorAI154Test {

  @Test
  public void testTypeMismatchWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @type {string} */ var x = 123;") },
        options);
    compiler.parse();
    compiler.check();
    assertNotNull(compiler.getResult());
    assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testValidAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @type {string} */ var x = 'hello';") },
        options);
    compiler.parse();
    compiler.check();
    assertNotNull(compiler.getResult());
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testDuplicateVariableDeclaration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @type {string} */ var x = 'a'; /** @type {number} */ var x = 1;") },
        options);
    compiler.parse();
    compiler.check();
    assertNotNull(compiler.getResult());
    assertEquals(1, compiler.getWarningCount());
  }
}
