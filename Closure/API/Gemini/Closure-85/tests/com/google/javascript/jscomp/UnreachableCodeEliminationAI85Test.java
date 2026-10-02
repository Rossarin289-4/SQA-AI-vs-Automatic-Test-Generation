package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnreachableCodeEliminationAI85Test {

  private final SourceFile externs = SourceFile.fromCode("externs.js", "");

  @Test
  public void testRemoveUnreachableCodeAfterReturn() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new SourceFile[] { externs },
        new SourceFile[] { SourceFile.fromCode("input.js", "function f() { return; alert('unreachable'); }") },
        options);
    compiler.parse();
    
    UnreachableCodeElimination elimination = new UnreachableCodeElimination(compiler, true);
    elimination.process(externs, compiler.getRoot());
    
    String expected = "function f() {return;}";
    assertEquals(expected, compiler.toSource().trim());
  }

  @Test
  public void testRemoveNoOpStatements() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new SourceFile[] { externs },
        new SourceFile[] { SourceFile.fromCode("input.js", "function f() { true; a.b; }") },
        options);
    compiler.parse();
    
    UnreachableCodeElimination elimination = new UnreachableCodeElimination(compiler, true);
    elimination.process(externs, compiler.getRoot());
    
    String expected = "function f() {}";
    assertEquals(expected, compiler.toSource().trim());
  }

  @Test
  public void testKeepReachableCode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new SourceFile[] { externs },
        new SourceFile[] { SourceFile.fromCode("input.js", "function f(x) { if (x) { return 1; } return 2; }") },
        options);
    compiler.parse();
    
    UnreachableCodeElimination elimination = new UnreachableCodeElimination(compiler, true);
    elimination.process(externs, compiler.getRoot());
    
    String expected = "function f(x) {if (x) {return 1;}return 2;}";
    assertEquals(expected, compiler.toSource().trim());
  }
}
