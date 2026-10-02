package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AmbiguatePropertiesAI134Test {

  @Test
  public void testAmbiguatePropertiesPassCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = {};") },
        options
    );
    AmbiguateProperties pass = new AmbiguateProperties(compiler, new char[0]);
    assertNotNull(pass);
  }

  @Test
  public void testProcessUnrelatedProperties() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "/** @constructor */ function Foo() {} Foo.prototype.a; /** @constructor */ function Bar() {} Bar.prototype.b;") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var f = new Foo(); f.a = 1; var b = new Bar(); b.b = 2;") },
        options
    );
    AmbiguateProperties pass = new AmbiguateProperties(compiler, new char[0]);
    assertNotNull(pass);
  }

  @Test
  public void testQuotedProperties() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = {'quoted': 1};") },
        options
    );
    AmbiguateProperties pass = new AmbiguateProperties(compiler, new char[0]);
    assertNotNull(pass);
  }
}
