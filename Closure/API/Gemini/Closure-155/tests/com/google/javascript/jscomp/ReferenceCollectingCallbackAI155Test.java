package com.google.javascript.jscomp;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ReferenceCollectingCallbackAI155Test {

  @Test
  public void testCollectReferencesSimpleVar() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1; x = 2;");
    compiler.init(new JSSourceFile[]{externs}, new JSSourceFile[]{input}, options);
    compiler.parse();
    Node root = compiler.getRoot();

    ReferenceCollectingCallback.Behavior behavior = new ReferenceCollectingCallback.Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, behavior);
    callback.process(externs.getNode(), root);

    Set<Var> vars = callback.getReferencedVariables();
    boolean foundX = false;
    for (Var v : vars) {
      if ("x".equals(v.getName())) {
        foundX = true;
        ReferenceCollectingCallback.ReferenceCollection col = callback.getReferenceCollection(v);
        assertNotNull(col);
        assertTrue(col.references.size() >= 2);
      }
    }
    assertTrue(foundX);
  }

  @Test
  public void testGetReferencedVariablesEmpty() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function foo() {}");
    compiler.init(new JSSourceFile[]{externs}, new JSSourceFile[]{input}, options);
    compiler.parse();
    Node root = compiler.getRoot();

    ReferenceCollectingCallback.Behavior behavior = new ReferenceCollectingCallback.Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, behavior);
    callback.process(externs.getNode(), root);

    Set<Var> vars = callback.getReferencedVariables();
    assertNotNull(vars);
  }

  @Test
  public void testArgumentsReference() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() { return arguments.length; }");
    compiler.init(new JSSourceFile[]{externs}, new JSSourceFile[]{input}, options);
    compiler.parse();
    Node root = compiler.getRoot();

    ReferenceCollectingCallback.Behavior behavior = new ReferenceCollectingCallback.Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, Map<Var, ReferenceCollectingCallback.ReferenceCollection> referenceMap) {
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, behavior);
    callback.process(externs.getNode(), root);

    Set<Var> vars = callback.getReferencedVariables();
    boolean foundArguments = false;
    for (Var v : vars) {
      if ("arguments".equals(v.getName())) {
        foundArguments = true;
      }
    }
    assertTrue(foundArguments);
  }
}
