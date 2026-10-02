package com.google.javascript.jscomp.parsing;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class JsDocInfoParserAI32Test {

  @Test
  public void testParseTypeStringValid() {
    Node node = JsDocInfoParser.parseTypeString("{string}");
    assertNotNull(node);
  }

  @Test
  public void testParseTypeStringNullOnFailure() {
    Node node = JsDocInfoParser.parseTypeString("{");
    assertNull(node);
  }

  @Test
  public void testParseTypeStringEmpty() {
    Node node = JsDocInfoParser.parseTypeString("");
    assertNull(node);
  }
}
