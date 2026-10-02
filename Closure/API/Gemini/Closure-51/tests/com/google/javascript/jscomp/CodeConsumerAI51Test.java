package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;

public class CodeConsumerAI51Test {

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
    Assert.assertTrue(CodeConsumer.isWordChar('a'));
    Assert.assertTrue(CodeConsumer.isWordChar('Z'));
    Assert.assertTrue(CodeConsumer.isWordChar('5'));
    Assert.assertTrue(CodeConsumer.isWordChar('_'));
    Assert.assertTrue(CodeConsumer.isWordChar('$'));
    Assert.assertFalse(CodeConsumer.isWordChar('+'));
    Assert.assertFalse(CodeConsumer.isWordChar(' '));
  }

  @Test
  public void testIsNegativeZero() {
    Assert.assertTrue(CodeConsumer.isNegativeZero(-0.0));
    Assert.assertFalse(CodeConsumer.isNegativeZero(0.0));
    Assert.assertFalse(CodeConsumer.isNegativeZero(5.0));
  }

  @Test
  public void testAddIdentifierSpacing() {
    TestCodeConsumer consumer = new TestCodeConsumer();
    consumer.add("return");
    consumer.add("foo");
    Assert.assertEquals("return foo", consumer.getOutput());
  }
}
