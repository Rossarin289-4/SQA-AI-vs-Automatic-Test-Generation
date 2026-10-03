package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MethodCompilerPassAI136Test {

  @Test
  public void testProcessExternsWithoutSignatures() {
    Compiler compiler = new Compiler();
    MethodCompilerPass pass = new MethodCompilerPass(compiler) {
      Callback getActingCallback() {
        return new NodeTraversal.AbstractPostOrderCallback() {
          public void visit(NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {}
        };
      }
      SignatureStore getSignatureStore() {
        return new SignatureStore() {
          public void reset() {}
          public void addSignature(String name, com.google.javascript.rhino.Node node, String file) {}
          public void removeSignature(String name) {}
        };
      }
    };

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window; window.setTimeout;");
    JSSourceFile js = JSSourceFile.fromCode("js.js", "");

    pass.process(externs.getCode().isEmpty() ? null : externs.getNode(compiler), js.getNode(compiler));
    assertTrue(pass.externMethodsWithoutSignatures.contains("setTimeout"));
  }

  @Test
  public void testProcessObjectLiteralExterns() {
    Compiler compiler = new Compiler();
    MethodCompilerPass pass = new MethodCompilerPass(compiler) {
      Callback getActingCallback() {
        return new NodeTraversal.AbstractPostOrderCallback() {
          public void visit(NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {}
        };
      }
      SignatureStore getSignatureStore() {
        return new SignatureStore() {
          public void reset() {}
          public void addSignature(String name, com.google.javascript.rhino.Node node, String file) {}
          public void removeSignature(String name) {}
        };
      }
    };

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "/** @constructor */ function Foo() {} Foo.prototype = {bar: function() {}};");
    
    pass.process(null, null);
    assertNotNull(pass.externMethods);
  }

  @Test
  public void testNonMethodProperties() {
    Compiler compiler = new Compiler();
    MethodCompilerPass pass = new MethodCompilerPass(compiler) {
      Callback getActingCallback() {
        return new NodeTraversal.AbstractPostOrderCallback() {
          public void visit(NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {}
        };
      }
      SignatureStore getSignatureStore() {
        return new SignatureStore() {
          public void reset() {}
          public void addSignature(String name, com.google.javascript.rhino.Node node, String file) {}
          public void removeSignature(String name) {}
        };
      }
    };

    assertTrue(pass.nonMethodProperties.isEmpty());
  }
}
