package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CollapseVariableDeclarationsAI8Test {

  private void test(String original, String expected) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("testcode", original) },
        options);
    Node root = compiler.parse();
    compiler.processDefines();
    
    CollapseVariableDeclarations pass = new CollapseVariableDeclarations(compiler);
    pass.process(null, root);
    
    String actual = compiler.toSource();
    assertEquals(expected, actual);
  }

  @Test
  public void testCollapseSimpleVars() {
    test("var a; var b = 1; var c = 2;", "var a,b=1,c=2;");
  }

  @Test
  public void testCollapseAssignAndVar() {
    test("a = true; b = true; var c = true;", "var c=b=a=true;");
  }

  @Test
  public void testNoCollapseIfNodes() {
    test("if (x) { var a = 1; } else { var b = 2; }", "if(x){var a=1}else{var b=2}");
  }
}
