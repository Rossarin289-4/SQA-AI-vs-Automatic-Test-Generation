package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI145Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "validIdentifier";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("validIdentifier", result);
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String input = "a\u0123b";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("a\\u0123b", result);
  }

  @Test
  public void testIdentifierEscapeControlChar() {
    String input = "a\u0001b";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("a\\u0001b", result);
  }
}
