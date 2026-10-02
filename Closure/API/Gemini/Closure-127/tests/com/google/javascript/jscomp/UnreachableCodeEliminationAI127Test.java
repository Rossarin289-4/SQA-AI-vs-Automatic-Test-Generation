package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnreachableCodeEliminationAI127Test {

  private void test(String js, String expected, boolean removeNoOpStatements) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parse(SourceFile.fromCode("testcode", js));
    new UnreachableCodeElimination(compiler, removeNoOpStatements).process(externs, root);
    String actual = compiler.toSource(root);
    assertEquals(expected, actual);
  }

  @Test
  public void testUnreachableCodeAfterReturn() {
    test("function f() { return; alert('unreachable'); }",
         "function f() {return}";
         true);
  }

  @Test
  public void testRemoveNoOpStatements() {
    test("function f() { true; a.b.MyClass.prototype.propertyName; }",
         "function f() {}",
         true);
  }

  @Test
  public void testKeepNoOpStatementsWhenDisabled() {
    test("function f() { true; }",
         "function f() {true}",
         false);
  }
}
