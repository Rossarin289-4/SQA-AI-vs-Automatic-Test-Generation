package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI65Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "validIdentifier";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("validIdentifier", result);
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String input = "a\u00A9b";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("a\\u00a9b", result);
  }

  @Test
  public void testTagAsStrict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile input = JSSourceFile.fromCode("test.js", "var x = 1;");
    compiler.compile(new JSSourceFile[0], new JSSourceFile[]{input}, options);
    String source = compiler.toSource();
    assertEquals("\"use strict\";var x=1;", source);
  }
}
