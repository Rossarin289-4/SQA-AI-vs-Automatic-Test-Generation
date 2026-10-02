package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckSideEffectsAI21Test {

  @Test
  public void testUselessCodeString() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "\"use strict\";\n\"suspicious string\";") },
        options);
    compiler.processModules();
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    check.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertEquals(1, compiler.getWarnings().length);
    assertEquals("Is there a missing '+' on the previous line?", compiler.getWarnings()[0].description);
  }

  @Test
  public void testUselessCodeOperator() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "1 == 2;") },
        options);
    compiler.processModules();
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    check.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertEquals(1, compiler.getWarnings().length);
    assertEquals("The result of the 'eq' operator is not being used.", compiler.getWarnings()[0].description);
  }

  @Test
  public void testQualifiedNameJSDoc() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "/** @suppress {uselessCode} */ x;") },
        options);
    compiler.processModules();
    CheckSideEffects check = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    check.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertEquals(0, compiler.getWarnings().length);
  }
}
