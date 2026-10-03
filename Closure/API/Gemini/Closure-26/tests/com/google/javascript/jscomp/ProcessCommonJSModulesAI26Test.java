package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProcessCommonJSModulesAI26Test {

  @Test
  public void testToModuleNameBasic() {
    String moduleName = ProcessCommonJSModules.toModuleName("./a/b-c.js");
    assertEquals("module$a$b_c", moduleName);
  }

  @Test
  public void testToModuleNameWithRelativeAddressing() {
    String moduleName = ProcessCommonJSModules.toModuleName("./sub/mod.js", "dir/current.js");
    assertEquals("module$dir$sub$mod", moduleName);
  }

  @Test
  public void testGuessCJSModuleName() {
    Compiler compiler = new Compiler();
    ProcessCommonJSModules pass = new ProcessCommonJSModules(compiler, ".");
    String guessed = pass.guessCJSModuleName("foo.js");
    assertEquals("module$foo", guessed);
  }
}
