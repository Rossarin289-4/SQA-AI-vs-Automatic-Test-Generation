package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class DisambiguatePropertiesAI103Test {

  @Test
  public void testDisambiguatePropertiesPassCreation() {
    Compiler compiler = new Compiler();
    DisambiguateProperties<JSType> pass = DisambiguateProperties.forJSTypeSystem(compiler);
    assertNotNull(pass);
  }

  @Test
  public void testCompileWithDisambiguatePropertiesEnabled() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    options.disambiguateProperties = true;

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "function RangeError() {}"
        + "RangeError.prototype.message;"
        + "function TypeError() {}"
        + "TypeError.prototype.message;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "var a = new RangeError(); a.message = 'foo';"
        + "var b = new TypeError(); b.message = 'bar';");

    Result result = compiler.compile(externs, input, options);
    assertNotNull(result);
  }

  @Test
  public void testDisambiguatePropertiesWithConcreteTypeSystem() {
    Compiler compiler = new Compiler();
    DisambiguateProperties<ConcreteType> pass = DisambiguateProperties.forConcreteTypeSystem(compiler, new CodingConvention() {
      @Override public boolean isSuperClassReference(String propertyName) { return false; }
    });
    assertNotNull(pass);
  }
}
