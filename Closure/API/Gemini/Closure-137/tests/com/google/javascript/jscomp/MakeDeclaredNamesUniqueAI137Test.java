package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MakeDeclaredNamesUniqueAI137Test {

  @Test
  public void testContextualRenameInverterCreation() {
    Compiler compiler = new Compiler();
    CompilerPass pass = MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    assertNotNull(pass);
  }

  @Test
  public void testMakeDeclaredNamesUniqueInstantiation() {
    MakeDeclaredNamesUnique pass = new MakeDeclaredNamesUnique();
    assertNotNull(pass);
  }

  @Test
  public void testCompilerPassExecution() {
    Compiler compiler = new Compiler();
    JSSourceFile[] externs = new JSSourceFile[0];
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("test.js", "var x = 1;")
    };
    compiler.init(externs, inputs, new CompilerOptions());
    compiler.parse();
    assertNotNull(compiler.getRoot());
  }
}
