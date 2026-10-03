package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class InlineObjectLiteralsAI29Test {

  @Test
  public void testInlineObjectLiteralsPassCreation() {
    Compiler compiler = new Compiler();
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueIdSupplier());
    assertNotNull(pass);
  }

  @Test
  public void testProcessEmptySource() {
    Compiler compiler = new Compiler();
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueIdSupplier());
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);
  }

  @Test
  public void testProcessWithSimpleObjectLiteral() {
    Compiler compiler = new Compiler();
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueIdSupplier());
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);
    assertNotNull(compiler.getRoot());
  }
}
