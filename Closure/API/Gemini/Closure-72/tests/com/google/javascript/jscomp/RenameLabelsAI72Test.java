package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RenameLabelsAI72Test {

  @Test
  public void testRenameSimpleLabel() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(JSSourceFile.fromCode("test.js", "myLabel: { foo(); }"));
    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);
    assertEquals("a:{foo();}", compiler.toSource().trim());
  }

  @Test
  public void testRemoveUnusedLabel() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(JSSourceFile.fromCode("test.js", "unusedLabel: { foo(); }"));
    RenameLabels pass = new RenameLabels(compiler, new RenameLabels.DefaultNameSupplier(), true);
    pass.process(null, root);
    assertEquals("foo();", compiler.toSource().trim());
  }

  @Test
  public void testNestedLabels() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(JSSourceFile.fromCode("test.js", "outer: { inner: { break outer; break inner; } }"));
    RenameLabels pass = new RenameLabels(compiler);
    pass.process(null, root);
    assertEquals("a:{b:{break a;break b;}}", compiler.toSource().trim());
  }
}
