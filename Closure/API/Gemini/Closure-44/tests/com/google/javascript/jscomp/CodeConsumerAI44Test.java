package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CodeConsumerAI44Test {

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
  public void testIsWordCharAndNegativeZero() {
    assertTrue(CodeConsumer.isWordChar('a'));
    assertTrue(CodeConsumer.isWordChar('_'));
    assertTrue(CodeConsumer.isWordChar('$'));
    assertFalse(CodeConsumer.isWordChar(' '));

    assertTrue(CodeConsumer.isNegativeZero(-0.0));
    assertFalse(CodeConsumer.isNegativeZero(0.0));
  }

  @Test
  public void testAddNumberFormatting() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    consumer.addNumber(1000.0);
    assertEquals("1000", consumer.getOutput());
  }

  @Test
  public void testAddAndStatementHandling() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    consumer.statementNeedsEnded = true;
    consumer.add("foo");
    assertEquals(";foo", consumer.getOutput());
    assertFalse(consumer.statementNeedsEnded);
  }
}
