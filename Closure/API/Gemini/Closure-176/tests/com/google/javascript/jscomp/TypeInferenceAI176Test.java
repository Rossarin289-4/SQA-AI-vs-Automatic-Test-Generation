package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TypeInferenceAI176Test {

  @Test
  public void testTypeInferenceShortCircuitAnd() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = true && false;") },
        options);
    Result result = compiler.compile(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = true && false;") },
        options);
    assertTrue(result.success);
  }

  @Test
  public void testTypeInferenceShortCircuitOr() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = false || true;") },
        options);
    Result result = compiler.compile(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = false || true;") },
        options);
    assertTrue(result.success);
  }

  @Test
  public void testTypeInferenceConditional() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = true ? 1 : 0;") },
        options);
    Result result = compiler.compile(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = true ? 1 : 0;") },
        options);
    assertTrue(result.success);
  }
}
