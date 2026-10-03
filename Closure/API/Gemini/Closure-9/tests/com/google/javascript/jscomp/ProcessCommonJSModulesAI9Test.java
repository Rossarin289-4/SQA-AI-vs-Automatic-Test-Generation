package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProcessCommonJSModulesAI9Test {

  @Test
  public void testToModuleNameBasic() {
    String moduleName = ProcessCommonJSModules.toModuleName("./foo/bar.js");
    assertEquals("module$foo$bar", moduleName);
  }

  @Test
  public void testToModuleNameRelative() {
    String moduleName = ProcessCommonJSModules.toModuleName("./sub.js", "foo/bar.js");
    assertEquals("module$foo$sub", moduleName);
  }

  @Test
  public void testProcessModuleWithRequire() {
    Compiler compiler = new Compiler();
    ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, "./");
    JSSourceFile[] externs = new JSSourceFile[] {};
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("foo.js", "var foo = require('./bar');")
    };
    compiler.init(externs, inputs, new CompilerOptions());
    Node root = compiler.parse();
    pass.process(externs[0], root);
    assertNotNull(pass.getModule());
    assertEquals("module$foo", pass.getModule().getName());
  }
}
