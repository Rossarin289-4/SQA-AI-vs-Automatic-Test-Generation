package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FunctionTypeAI135Test {

  @Test
  public void testHasInstanceTypeForOrdinaryFunction() {
    JSTypeRegistry registry = new JSTypeRegistry(new ErrorReporter() {
      @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
      @Override public void error(String message, String sourceName, int line, int lineOffset) {}
      @Override public EvaluatorForTesting getEvaluator() { return null; }
    });
    Node source = new Node(Token.FUNCTION);
    FunctionType func = new FunctionType(registry, "f", source, null, null);
    assertEquals(false, func.hasInstanceType());
  }

  @Test
  public void testGetTemplateTypeName() {
    JSTypeRegistry registry = new JSTypeRegistry(new ErrorReporter() {
      @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
      @Override public void error(String message, String sourceName, int line, int lineOffset) {}
      @Override public EvaluatorForTesting getEvaluator() { return null; }
    });
    Node source = new Node(Token.FUNCTION);
    FunctionType func = new FunctionType(registry, "f", source, null, null);
    assertEquals(null, func.getTemplateTypeName());
  }

  @Test
  public void testGetSource() {
    JSTypeRegistry registry = new JSTypeRegistry(new ErrorReporter() {
      @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
      @Override public void error(String message, String sourceName, int line, int lineOffset) {}
      @Override public EvaluatorForTesting getEvaluator() { return null; }
    });
    Node source = new Node(Token.FUNCTION);
    FunctionType func = new FunctionType(registry, "f", source, null, null);
    assertNotNull(func.getSource());
  }
}
