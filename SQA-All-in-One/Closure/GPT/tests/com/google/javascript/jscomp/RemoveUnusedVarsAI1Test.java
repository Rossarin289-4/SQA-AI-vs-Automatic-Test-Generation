package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RemoveUnusedVarsAI1Test {

  private String optimize(String code, boolean removeGlobals) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", code);

    compiler.init(new JSSourceFile[] {externs},
        new JSSourceFile[] {input}, options);
    compiler.parse();
    compiler.normalize();

    new RemoveUnusedVars(compiler, removeGlobals, false, false)
        .process(null, compiler.getRoot());

    return compiler.toSource();
  }

  @Test
  public void removesUnusedGlobalVariable() {
    String output = optimize("var unusedGlobal = 1; var usedGlobal = 2; usedGlobal;",
        true);

    assertFalse(output.indexOf("unusedGlobal") >= 0);
    assertTrue(output.indexOf("usedGlobal") >= 0);
  }

  @Test
  public void preservesGlobalVariableWhenGlobalRemovalDisabled() {
    String output = optimize("var globalValue = 1;", false);

    assertTrue(output.indexOf("globalValue") >= 0);
  }

  @Test
  public void removesUnusedLocalVariable() {
    String output = optimize(
        "function keep() { var localDead = 1; return 2; } keep();", true);

    assertFalse(output.indexOf("localDead") >= 0);
    assertTrue(output.indexOf("keep") >= 0);
    assertTrue(output.indexOf("return 2") >= 0);
  }

  @Test
  public void preservesSideEffectingInitializer() {
    String output = optimize("var unused = makeValue();", true);

    assertFalse(output.indexOf("var unused") >= 0);
    assertTrue(output.indexOf("makeValue") >= 0);
  }

  @Test
  public void removesOnlyUnusedNameFromMultipleDeclaration() {
    String output = optimize(
        "var dead = 1, live = 2; live;", true);

    assertFalse(output.indexOf("dead") >= 0);
    assertTrue(output.indexOf("live") >= 0);
  }

  @Test
  public void removesUnusedFunctionDeclaration() {
    String output = optimize(
        "function deadFunction() { return 1; } var value = 2; value;", true);

    assertFalse(output.indexOf("deadFunction") >= 0);
    assertTrue(output.indexOf("value") >= 0);
  }

  @Test
  public void preservesReferencedFunctionDeclaration() {
    String output = optimize(
        "function called() { return 3; } called();", true);

    assertTrue(output.indexOf("called") >= 0);
    assertTrue(output.indexOf("return 3") >= 0);
  }

  @Test
  public void removesUnusedTrailingFunctionArgument() {
    String output = optimize(
        "function sum(first, unused) { return first; } sum(4, 5);", true);

    assertTrue(output.indexOf("first") >= 0);
    assertFalse(output.indexOf("unused") >= 0);
  }

  @Test
  public void argumentsReferenceKeepsFunctionParameters() {
    String output = optimize(
        "function inspect(value) { return arguments; } inspect(1);", true);

    assertTrue(output.indexOf("value") >= 0);
    assertTrue(output.indexOf("arguments") >= 0);
  }
}
