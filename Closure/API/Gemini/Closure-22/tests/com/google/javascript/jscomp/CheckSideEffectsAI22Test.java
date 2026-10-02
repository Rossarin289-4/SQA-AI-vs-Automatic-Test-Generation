package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CheckSideEffectsAI22Test {

  @Test
  public void testUselessCodeString() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "\"a\" \"b\";");
    compiler.compile(externs, input, options);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(externs, compiler.getRoot());
    assertEquals(1, compiler.getWarnings().length);
  }

  @Test
  public void testUselessCodeOperator() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "1 == 2;");
    compiler.compile(externs, input, options);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);
    pass.process(externs, compiler.getRoot());
    assertEquals(1, compiler.getWarnings().length);
  }

  @Test
  public void testSideEffectProtectedCode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "1;");
    compiler.compile(externs, input, options);
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);
    pass.process(externs, compiler.getRoot());
    assertEquals(1, compiler.getWarnings().length);
    String generated = compiler.toSource();
    org.junit.Assert.assertTrue(generated.contains("JSCOMPILER_PRESERVE"));
  }
}
