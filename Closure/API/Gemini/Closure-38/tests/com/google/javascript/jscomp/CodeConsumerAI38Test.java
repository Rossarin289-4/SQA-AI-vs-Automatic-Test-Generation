package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CodeConsumerAI38Test {

  private static class TestCodeConsumer extends CodeConsumer {
    private final StringBuilder sb = new StringBuilder();

    @Override
    char getLastChar() {
      if (sb.length() == 0) {
        return '\0';
      }
      return sb.charAt(sb.length() - 1);
    }

    @Override
    void append(String str) {
      sb.append(str);
    }

    public String getOutput() {
      return sb.toString();
    }
  }

  @Test
  public void testIsWordChar() {
    assertTrue(CodeConsumer.isWordChar('a'));
    assertTrue(CodeConsumer.isWordChar('Z'));
    assertTrue(CodeConsumer.isWordChar('5'));
    assertTrue(CodeConsumer.isWordChar('_'));
    assertTrue(CodeConsumer.isWordChar('$'));
    assertFalse(CodeConsumer.isWordChar('+'));
    assertFalse(CodeConsumer.isWordChar(' '));
  }

  @Test
  public void testIsNegativeZero() {
    assertTrue(CodeConsumer.isNegativeZero(-0.0));
    assertFalse(CodeConsumer.isNegativeZero(0.0));
    assertFalse(CodeConsumer.isNegativeZero(5.0));
  }

  @Test
  public void testAddIdentifierSeparation() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    consumer.add("return");
    consumer.add("foo");
    assertEquals("return foo", consumer.getOutput());
  }
}
