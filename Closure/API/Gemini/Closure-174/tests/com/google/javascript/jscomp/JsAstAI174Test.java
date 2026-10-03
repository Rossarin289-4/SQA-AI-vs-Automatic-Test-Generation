package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class JsAstAI174Test {

  @Test
  public void testGetAstRootAndInputId() {
    SourceFile file = SourceFile.fromCode("testcode.js", "var x = 1;");
    JsAst ast = new JsAst(file);

    assertNotNull(ast.getInputId());
    assertEquals("testcode.js", ast.getInputId().getIdName());
    assertEquals(file, ast.getSourceFile());

    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node root = ast.getAstRoot(compiler);
    assertNotNull(root);
  }

  @Test
  public void testClearAst() {
    SourceFile file = SourceFile.fromCode("testcode2.js", "var y = 2;");
    JsAst ast = new JsAst(file);

    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node root1 = ast.getAstRoot(compiler);
    assertNotNull(root1);

    ast.clearAst();
    Node root2 = ast.getAstRoot(compiler);
    assertNotNull(root2);
  }

  @Test(expected = IllegalStateException.class)
  public void testSetSourceFileValidation() {
    SourceFile file1 = SourceFile.fromCode("file1.js", "var a = 1;");
    SourceFile file2 = SourceFile.fromCode("file2.js", "var b = 2;");
    JsAst ast = new JsAst(file1);
    ast.setSourceFile(file2);
  }
}
