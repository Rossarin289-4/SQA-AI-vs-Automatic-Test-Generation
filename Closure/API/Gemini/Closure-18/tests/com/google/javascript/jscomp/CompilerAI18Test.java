package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompilerAI18Test {

  @Test
  public void testProgressBounds() {
    Compiler compiler = new Compiler();
    compiler.setProgress(-5.0);
    assertEquals(0.0, compiler.getProgress(), 0.0001);

    compiler.setProgress(5.0);
    assertEquals(1.0, compiler.getProgress(), 0.0001);

    compiler.setProgress(0.5);
    assertEquals(0.5, compiler.getProgress(), 0.0001);
  }

  @Test
  public void testRegExpGlobalReferences() {
    Compiler compiler = new Compiler();
    assertTrue(compiler.hasRegExpGlobalReferences());

    compiler.setHasRegExpGlobalReferences(false);
    assertFalse(compiler.hasRegExpGlobalReferences());
  }

  @Test
  public void testAddNewScriptAndReplaceScript() {
    Compiler compiler = new Compiler();
    compiler.init(
        java.util.Collections.<SourceFile>emptyList(),
        java.util.Collections.<SourceFile>emptyList(),
        new CompilerOptions());

    JsAst ast = new JsAst(SourceFile.fromCode("testcode.js", "var x = 1;"));
    compiler.addNewScript(ast);

    assertNotNull(compiler.getInput(ast.getInputId()));

    JsAst replacementAst = new JsAst(SourceFile.fromCode("testcode.js", "var x = 2;"));
    compiler.replaceScript(replacementAst);
    assertNotNull(compiler.getInput(replacementAst.getInputId()));
  }
}
