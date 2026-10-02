package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class GlobalNamespaceAI119Test {

  @Test
  public void testGlobalNamespaceCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a = 1;") },
        options);
    Node root = compiler.parse();
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    assertNotNull(namespace.getSlot("a"));
  }

  @Test
  public void testNonExistentSlot() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var a = 1;") },
        options);
    Node root = compiler.parse();
    GlobalNamespace namespace = new GlobalNamespace(compiler, root);
    assertNull(namespace.getSlot("nonExistent"));
  }

  @Test
  public void testHasExternsRoot() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var b = 2;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    Node root = compiler.parse();
    GlobalNamespace namespace = new GlobalNamespace(compiler, externs.SYNTHETIC_FILE_PSI ? externs.getCodeReader() == null ? null : root : root, root);
    assertNotNull(namespace);
  }
}
