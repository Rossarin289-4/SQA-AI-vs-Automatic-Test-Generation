package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PeepholeSubstituteAlternateSyntaxAI87Test {

  @Test
  public void testContainsUnicodeEscapeBasic() {
    assertFalse(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("foobar"));
    assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\\u0061"));
  }

  @Test
  public void testRegexpConstructorFoldBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    compiler.normalize();

    PeepholeSubstituteAlternateSyntax opt = new PeepholeSubstituteAlternateSyntax();
    opt.beginTraversal(compiler);

    Node patternNode = Node.newString("abc");
    Node newCall = new Node(Token.NEW, Node.newString(Token.NAME, "RegExp"), patternNode);
    newCall.detachChildren();
    newCall.addChildToBack(Node.newString(Token.NAME, "RegExp"));
    newCall.addChildToBack(patternNode);

    Node result = opt.optimizeSubtree(newCall);
    assertTrue(result.getType() == Token.REGEXP || result.getType() == Token.CALL);
  }

  @Test
  public void testDontTraverseFunctionsPredicate() {
    Node fnNode = new Node(Token.FUNCTION);
    Node exprNode = new Node(Token.EXPR_RESULT);

    assertFalse(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(fnNode));
    assertTrue(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE.apply(exprNode));
  }
}
