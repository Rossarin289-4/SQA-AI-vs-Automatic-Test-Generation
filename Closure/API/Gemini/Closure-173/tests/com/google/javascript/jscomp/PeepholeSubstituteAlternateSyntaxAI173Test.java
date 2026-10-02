package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeepholeSubstituteAlternateSyntaxAI173Test {

  @Test
  public void testStringConstructorFolding() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    String original = "var x = String('abc');";
    String expected = "var x=\"\"+\"abc\";";
    
    compiler.compile(
        JSSourceFile.fromCode("externs", ""),
        JSSourceFile.fromCode("input", original),
        options);
    
    String jsResult = compiler.toSource();
    assertEquals(expected, jsResult);
  }

  @Test
  public void testTrueFalseReduction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    String original = "var x = true; var y = false;";
    String expected = "var x=!0;var y=!1;";
    
    compiler.compile(
        JSSourceFile.fromCode("externs", ""),
        JSSourceFile.fromCode("input", original),
        options);
    
    String jsResult = compiler.toSource();
    assertEquals(expected, jsResult);
  }

  @Test
  public void testUnicodeEscapeCheck() {
    boolean hasUnicode = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\\u0041");
    assertEquals(true, hasUnicode);
  }
}
