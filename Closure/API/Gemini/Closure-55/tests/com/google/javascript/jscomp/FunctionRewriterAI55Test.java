package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class FunctionRewriterAI55Test {

  @Test
  public void testParseHelperCodeValid() {
    Compiler compiler = new Compiler();
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.ReturnConstantReducer reducer = new FunctionRewriter.ReturnConstantReducer();
    Node helperNode = rewriter.parseHelperCode(reducer);
    assertNotNull(helperNode);
  }

  @Test
  public void testProcessWithNoReductions() {
    Compiler compiler = new Compiler();
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    JSSourceFile[] externs = new JSSourceFile[0];
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("test.js", "var x = 1;")
    };
    compiler.init(externs, inputs, new CompilerOptions());
    Node root = compiler.parse();
    rewriter.process(null, root);
  }

  @Test
  public void testParseHelperCodeNullSource() {
    Compiler compiler = new Compiler();
    FunctionRewriter rewriter = new FunctionRewriter(compiler);
    FunctionRewriter.Reducer dummyReducer = new FunctionRewriter.Reducer() {
      @Override
      protected String getHelperSource() {
        return null;
      }
      @Override
      Node reduce(Node node) {
        return node;
      }
    };
    Node helperNode = rewriter.parseHelperCode(dummyReducer);
    assertNull(helperNode);
  }
}
