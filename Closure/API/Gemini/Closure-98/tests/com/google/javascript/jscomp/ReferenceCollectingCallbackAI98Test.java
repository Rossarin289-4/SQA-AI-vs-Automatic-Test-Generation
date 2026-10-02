package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import org.junit.Test;

public class ReferenceCollectingCallbackAI98Test {

  @Test
  public void testProcessCollectsReferences() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1; x = 2;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    Node root = compiler.getRoot();

    ReferenceCollectingCallback.Behavior dummyBehavior = new ReferenceCollectingCallback.Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, java.util.Map<Var, ReferenceCollection> referenceMap) {
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, dummyBehavior);
    callback.process(externs, root);

    Scope scope = compiler.getTopScope();
    Var xVar = scope.getVar("x");
    assertNotNull(xVar);
    assertNotNull(callback.getReferenceCollection(xVar));
  }

  @Test
  public void testGetReferenceCollectionWithNoVariable() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var y = 1;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    Node root = compiler.getRoot();

    ReferenceCollectingCallback.Behavior dummyBehavior = new ReferenceCollectingCallback.Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, java.util.Map<Var, ReferenceCollection> referenceMap) {
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, dummyBehavior);
    callback.process(externs, root);

    Scope scope = compiler.getTopScope();
    Var xVar = scope.getVar("nonExistent");
    assertNull(xVar);
  }

  @Test
  public void testVarFilterExcludesVariable() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1; var b = 2;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    Node root = compiler.getRoot();

    com.google.common.base.Predicate<Var> filter = new com.google.common.base.Predicate<Var>() {
      @Override
      public boolean apply(Var var) {
        return "a".equals(var.getName());
      }
    };

    ReferenceCollectingCallback.Behavior dummyBehavior = new ReferenceCollectingCallback.Behavior() {
      @Override
      public void afterExitScope(NodeTraversal t, java.util.Map<Var, ReferenceCollection> referenceMap) {
      }
    };

    ReferenceCollectingCallback callback = new ReferenceCollectingCallback(compiler, dummyBehavior, filter);
    callback.process(externs, root);

    Scope scope = compiler.getTopScope();
    Var aVar = scope.getVar("a");
    Var bVar = scope.getVar("b");

    assertNotNull(aVar);
    assertNotNull(bVar);
    assertNotNull(callback.getReferenceCollection(aVar));
    assertNull(callback.getReferenceCollection(bVar));
  }
}
