package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MakeDeclaredNamesUniqueAI49Test {

  @Test
  public void testContextualRenamerBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f() { var x; { var x; } }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique(new MakeDeclaredNamesUnique.ContextualRenamer());
    NodeTraversal.traverse(compiler, root, pass);
    
    String expected = "function f() {var x;{var x$$1;}}";
    assertEquals(expected, compiler.toSource());
  }

  @Test
  public void testArgumentsHandling() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f(arguments) { var arguments; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique(new MakeDeclaredNamesUnique.ContextualRenamer());
    NodeTraversal.traverse(compiler, root, pass);
    
    String expected = "function f(arguments) {var arguments;}";
    assertEquals(expected, compiler.toSource());
  }

  @Test
  public void testCatchScopeRenaming() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var e = 1; try {} catch (e) { var e$$1 = 2; }") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique(new MakeDeclaredNamesUnique.ContextualRenamer());
    NodeTraversal.traverse(compiler, root, pass);
    
    String expected = "var e=1;try{}catch(e$$1){var e$$2=2;}";
    assertEquals(expected, compiler.toSource());
  }
}
