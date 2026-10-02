package com.google.javascript.jscomp.parsing;

import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.rhino.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IRFactoryAI84Test {

  @Test
  public void testTransformTreeSimpleScript() {
    String source = "var x = 10;";
    CompilerEnvirons env = new CompilerEnvirons();
    Parser parser = new Parser(env);
    AstRoot astRoot = parser.parse(source, "testcode", 1);

    Config config = Config.of(
        CompilerEnvirons.toDocumentMode(env),
        org.mozilla.javascript.EvaluatorException.class.getDeclaringClass() == null ? null : null,
        false,
        false,
        null
    );

    Node result = IRFactory.transformTree(astRoot, source, config, null);
    assertNotNull(result);
    assertEquals(com.google.javascript.rhino.Token.SCRIPT, result.getType());
  }

  @Test
  public void testTransformTreeEmptyScript() {
    String source = "";
    CompilerEnvirons env = new CompilerEnvirons();
    Parser parser = new Parser(env);
    AstRoot astRoot = parser.parse(source, "emptytest", 1);

    Config config = Config.of(
        CompilerEnvirons.toDocumentMode(env),
        null,
        false,
        false,
        null
    );

    Node result = IRFactory.transformTree(astRoot, source, config, null);
    assertNotNull(result);
    assertEquals("emptytest", result.getSourceFileName());
  }
}
