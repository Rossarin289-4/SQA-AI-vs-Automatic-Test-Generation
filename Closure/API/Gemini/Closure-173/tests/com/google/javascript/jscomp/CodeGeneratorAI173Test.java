package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI173Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "myVariable";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("myVariable", result);
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String input = "café";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("caf\\u00e9", result);
  }

  @Test
  public void testForCostEstimation() {
    CodeConsumer consumer = new CodeConsumer() {
      @Override
      void add(String str) {}
    };
    CodeGenerator generator = CodeGenerator.forCostEstimation(consumer);
    generator.tagAsStrict();
  }
}
