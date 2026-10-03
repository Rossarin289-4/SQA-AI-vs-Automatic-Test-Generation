package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InlineObjectLiteralsAI5Test {

  private final Compiler compiler = new Compiler();

  private void test(String original, String expected) {
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {JSSourceFile.fromCode("testcode", original)},
        new CompilerOptions());
    Node root = compiler.parse();
    InlineObjectLiterals pass = new InlineObjectLiterals(
        compiler, new Compiler.CodeBuilder() {
          private int id = 0;
          @Override
          public String get() {
            return String.valueOf(++id);
          }
        });
    pass.process(null, root);
    String result = compiler.toSource(root);
    assertEquals(expected, result);
  }

  @Test
  public void testInlineBasicObjectLiteral() {
    test("var x = {a: 1, b: 2}; foo(x.a);",
         varPrefix() + "a=1;" + varPrefix() + "b=2;var x=true;foo(" + varPrefix() + "a)");
  }

  @Test
  public void testNoInlineWhenReferencedInFull() {
    String code = "var x = {a: 1}; foo(x);";
    test(code, code);
  }

  @Test
  public void testInlineAssignedLater() {
    test("var x; x = {a: 1}; foo(x.a);",
         varPrefix() + "a;" + varPrefix() + "a=1,true;foo(" + varPrefix() + "a)");
  }

  private String varPrefix() {
    return InlineObjectLiterals.VAR_PREFIX;
  }
}
