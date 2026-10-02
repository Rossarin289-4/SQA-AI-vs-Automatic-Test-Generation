package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class PeepholeFoldConstantsAI23Test {

  @Test
  public void testFoldArrayAccessOutOfBounds() {
    Compiler compiler = new Compiler();
    PeepholeFoldConstants folder = new PeepholeFoldConstants(true);
    folder.init(compiler);

    Node arrayLit = Node.newArray(Node.newNumber(1), Node.newNumber(2));
    Node getElem = Node.newGetElem(arrayLit, Node.newNumber(5));
    
    Node result = folder.optimizeSubtree(getElem);
    assertNotNull(result);
    assertEquals(1, compiler.getErrors().length);
    assertEquals("JSC_INDEX_OUT_OF_BOUNDS_ERROR", compiler.getErrors()[0].type.name);
  }

  @Test
  public void testFoldArrayLength() {
    Compiler compiler = new Compiler();
    PeepholeFoldConstants folder = new PeepholeFoldConstants(true);
    folder.init(compiler);

    Node arrayLit = Node.newArray(Node.newNumber(1), Node.newNumber(2), Node.newNumber(3));
    Node getProp = Node.newGetProp(arrayLit, Node.newString("length"));
    
    Node result = folder.optimizeSubtree(getProp);
    assertNotNull(result);
    assertTrue(result.isNumber());
    assertEquals(3.0, result.getDouble(), 0.0);
  }

  @Test
  public void testFoldObjectPropertyAccess() {
    Compiler compiler = new Compiler();
    PeepholeFoldConstants folder = new PeepholeFoldConstants(true);
    folder.init(compiler);

    Node stringKey = Node.newString(Token.STRING_KEY, "a");
    stringKey.addChildToBack(Node.newNumber(42));
    Node objLit = new Node(Token.OBJECTLIT, stringKey);
    Node getProp = Node.newGetProp(objLit, Node.newString("a"));

    Node result = folder.optimizeSubtree(getProp);
    assertNotNull(result);
    assertTrue(result.isNumber());
    assertEquals(42.0, result.getDouble(), 0.0);
  }
}
