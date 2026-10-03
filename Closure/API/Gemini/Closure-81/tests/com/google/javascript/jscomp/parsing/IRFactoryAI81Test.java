package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.jscomp.mozilla.rhino.CompilerEnvirons;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.Parser;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.rhino.Node;
import org.junit.Test;

public class IRFactoryAI81Test {

  @Test
  public void testTransformTreeSimple() {
    String sourceString = "var x = 10;";
    String sourceName = "testcode.js";
    CompilerEnvirons environs = new CompilerEnvirons();
    ErrorReporter errorReporter = environs.getErrorReporter();
    Parser parser = new Parser(environs, errorReporter);
    AstRoot astRoot = parser.parse(sourceString, sourceName, 1);

    Config config = new Config(null, null, true, true);
    Node result = IRFactory.transformTree(astRoot, sourceString, config, errorReporter);

    assertNotNull(result);
  }

  @Test
  public void testTransformTreeEmpty() {
    String sourceString = "";
    String sourceName = "empty.js";
    CompilerEnvirons environs = new CompilerEnvirons();
    ErrorReporter errorReporter = environs.getErrorReporter();
    Parser parser = new Parser(environs, errorReporter);
    AstRoot astRoot = parser.parse(sourceString, sourceName, 1);

    Config config = new Config(null, null, true, true);
    Node result = IRFactory.transformTree(astRoot, sourceString, config, errorReporter);

    assertNotNull(result);
  }
}
