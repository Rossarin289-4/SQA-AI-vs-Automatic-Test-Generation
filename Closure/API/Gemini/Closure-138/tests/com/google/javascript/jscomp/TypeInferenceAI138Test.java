package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TypeInferenceAI138Test {

  @Test
  public void testTypeInferenceCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 10;") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    assertNotNull(root);
  }

  @Test
  public void testBooleanOutcomes() {
    com.google.javascript.rhino.jstype.BooleanLiteralSet left =
        com.google.javascript.rhino.jstype.BooleanLiteralSet.TRUE;
    com.google.javascript.rhino.jstype.BooleanLiteralSet right =
        com.google.javascript.rhino.jstype.BooleanLiteralSet.FALSE;
    com.google.javascript.rhino.jstype.BooleanLiteralSet result =
        TypeInference.getBooleanOutcomes(left, right, true);
    assertNotNull(result);
  }

  @Test
  public void testCompilerCompilation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    Result result = compiler.compile(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f() { return 1; }") },
        options);
    assertNotNull(result);
  }
}
