package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class CrossModuleMethodMotionAI163Test {

  @Test
  public void testProcessSingleModule() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function Foo() {} Foo.prototype.bar = function() {};");
    
    compiler.init(new JSSourceFile[] {externs}, new JSSourceFile[] {input}, new CompilerOptions());
    compiler.parse();
    
    CrossModuleMethodMotion motion = new CrossModuleMethodMotion(
        compiler, new CrossModuleMethodMotion.IdGenerator(), true);
    
    motion.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertNotNull(compiler.getResult());
  }

  @Test
  public void testProcessNullModuleGraph() {
    Compiler compiler = new Compiler();
    CrossModuleMethodMotion motion = new CrossModuleMethodMotion(
        compiler, new CrossModuleMethodMotion.IdGenerator(), true);
    
    motion.process(null, null);
    assertNotNull(compiler);
  }

  @Test
  public void testIdGenerator() {
    CrossModuleMethodMotion.IdGenerator generator = new CrossModuleMethodMotion.IdGenerator();
    org.junit.Assert.assertFalse(generator.hasGeneratedAnyIds());
    org.junit.Assert.assertEquals(0, generator.newId());
    org.junit.Assert.assertTrue(generator.hasGeneratedAnyIds());
    org.junit.Assert.assertEquals(1, generator.newId());
  }
}
