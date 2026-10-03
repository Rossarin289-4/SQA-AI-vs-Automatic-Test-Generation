package com.google.javascript.jscomp;

import junit.framework.TestCase;
import org.junit.Test;

public class DisambiguatePropertiesAI118Test extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
  }

  @Test
  public void testDisambiguatePropertiesBasic() {
    CompilerOptions options = new CompilerOptions();
    options.disambiguateProperties = true;
    options.checkTypes = true;

    String externs = "/** @constructor */ function Foo() {} Foo.prototype.a; "
        + "/** @constructor */ function Bar() {} Bar.prototype.a;";
    String js = "var f = new Foo(); f.a = 1; var b = new Bar(); b.a = 2;";

    compiler.compile(
        JSSourceFile.fromCode("externs", externs),
        JSSourceFile.fromCode("js", js),
        options);

    String output = compiler.toSource();
    assertTrue(output.contains("a$Foo"));
    assertTrue(output.contains("a$Bar"));
  }

  @Test
  public void testDisambiguatePropertiesUnrelated() {
    CompilerOptions options = new CompilerOptions();
    options.disambiguateProperties = true;
    options.checkTypes = true;

    String externs = "/** @constructor */ function Foo() {} Foo.prototype.x;";
    String js = "var f = new Foo(); f.x = 1;";

    compiler.compile(
        JSSourceFile.fromCode("externs", externs),
        JSSourceFile.fromCode("js", js),
        options);

    assertTrue(compiler.getErrors().length == 0);
  }
}
