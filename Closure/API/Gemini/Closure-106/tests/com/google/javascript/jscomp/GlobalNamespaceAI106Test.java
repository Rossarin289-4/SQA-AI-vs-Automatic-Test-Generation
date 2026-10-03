package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class GlobalNamespaceAI106Test {

  @Test
  public void testGetNameForest() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(JSSourceFile.fromCode("test.js", "var a = 1;"));
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    assertNotNull(namespace.getNameForest());
  }

  @Test
  public void testGetNameIndex() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(JSSourceFile.fromCode("test.js", "var a = 1;"));
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    assertNotNull(namespace.getNameIndex());
    assertTrue(namespace.getNameIndex().containsKey("a"));
  }

  @Test
  public void testRefTesting() {
    GlobalNamespace.Ref ref = GlobalNamespace.Ref.createRefForTesting(GlobalNamespace.Ref.Type.SET_FROM_GLOBAL);
    assertNotNull(ref);
    assertTrue(ref.isSet());
  }
}
