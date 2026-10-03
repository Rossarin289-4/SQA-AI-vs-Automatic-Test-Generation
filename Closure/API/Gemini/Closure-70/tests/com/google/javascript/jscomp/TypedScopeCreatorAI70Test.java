package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypedScopeCreatorAI70Test {

  @Test
  public void testTypedefDeclaration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @typedef {number} */ var MyNum;") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testMalformedTypedefWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "/** @typedef */ var MyNum;") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertEquals(1, compiler.getErrors().length);
    assertEquals("JSC_MALFORMED_TYPEDEF", compiler.getErrors()[0].type.name);
  }

  @Test
  public void testLocalFunctionInputs() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f(a, b) { var x = 1; }") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertFalse(compiler.hasErrors());
  }
}
