/*
 * Copyright 2008 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;
import com.google.javascript.rhino.Node;

public class RemoveUnusedVarsAI1Test {

  private String processAndGetSource(String js, boolean removeGlobals,
      boolean preserveFunctionExpressionNames, boolean modifyCallSites) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile[] externs = new JSSourceFile[] {
        JSSourceFile.fromCode("externs.js", "var alert; var foo;")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("testcode.js", js)
    };

    compiler.init(externs, inputs, options);
    compiler.parse();
    compiler.normalize();

    Node externsNode = compiler.getRoot().getFirstChild();
    Node mainRootNode = compiler.getRoot().getLastChild();

    RemoveUnusedVars pass = new RemoveUnusedVars(
        compiler, removeGlobals, preserveFunctionExpressionNames, modifyCallSites);
    pass.process(externsNode, mainRootNode);

    return compiler.toSource();
  }

  @Test
  public void testRemoveUnusedLocalVar() {
    String js = "function f() { var unused = 10; var used = 20; return used; }";
    String result = processAndGetSource(js, false, false, false);
    Assert.assertFalse("Unused local var should be removed", result.contains("unused"));
    Assert.assertTrue("Used local var should be preserved", result.contains("used"));
  }

  @Test
  public void testRemoveGlobalsFlag() {
    String js = "var unusedGlobal = 1; var usedGlobal = 2; alert(usedGlobal);";

    String withoutRemoveGlobals = processAndGetSource(js, false, false, false);
    Assert.assertTrue("Global should remain when removeGlobals is false",
        withoutRemoveGlobals.contains("unusedGlobal"));

    String withRemoveGlobals = processAndGetSource(js, true, false, false);
    Assert.assertFalse("Global should be removed when removeGlobals is true",
        withRemoveGlobals.contains("unusedGlobal"));
    Assert.assertTrue("Used global should be preserved",
        withRemoveGlobals.contains("usedGlobal"));
  }

  @Test
  public void testUnusedVarWithSideEffectsPreservesSideEffects() {
    String js = "function f() { var x = foo(); }";
    String result = processAndGetSource(js, false, false, false);
    Assert.assertFalse("Variable x declaration should be removed", result.contains("var x"));
    Assert.assertTrue("Side effect function call must be preserved", result.contains("foo()"));
  }

  @Test
  public void testMultipleDeclarationsInSingleVar() {
    String js = "function f() { var a = 1, b = 2, c = 3; alert(a + c); }";
    String result = processAndGetSource(js, false, false, false);
    Assert.assertTrue("Referenced var 'a' should remain", result.contains("a"));
    Assert.assertFalse("Unreferenced var 'b' should be removed", result.contains("b"));
    Assert.assertTrue("Referenced var 'c' should remain", result.contains("c"));
  }

  @Test
  public void testUnusedFunctionDeclarationRemoved() {
    String js = "function dead() { return 1; } function alive() { return 2; } alert(alive());";
    String result = processAndGetSource(js, true, false, false);
    Assert.assertFalse("Unreferenced function should be removed", result.contains("dead"));
    Assert.assertTrue("Referenced function should be preserved", result.contains("alive"));
  }

  @Test
  public void testUnusedFunctionArgsStripped() {
    String js = "function f(a, unusedArg) { alert(a); } f(1);";
    String result = processAndGetSource(js, true, false, false);
    Assert.assertFalse("Unused trailing formal argument should be removed",
        result.contains("unusedArg"));
    Assert.assertTrue("Used formal argument should remain", result.contains("f(a)"));
  }

  @Test
  public void testArgumentsKeywordPreventsArgRemoval() {
    String js = "function f(a, b) { alert(arguments[0]); } f(1, 2);";
    String result = processAndGetSource(js, true, false, false);
    Assert.assertTrue("Parameter 'a' should not be removed when arguments is accessed",
        result.contains("a"));
    Assert.assertTrue("Parameter 'b' should not be removed when arguments is accessed",
        result.contains("b"));
  }

  @Test
  public void testUnusedPropertyAssignsRemoved() {
    String js = "var obj = {}; obj.foo = 1; obj.bar = 2;";
    String result = processAndGetSource(js, true, false, false);
    Assert.assertFalse("Unused object declaration should be removed", result.contains("obj"));
    Assert.assertFalse("Property assigns to unused object should be removed",
        result.contains("foo") || result.contains("bar"));
  }

  @Test
  public void testModifyCallSitesRemovesUnusedParameters() {
    String js = "function f(unusedParam) { alert(1); } f(42);";
    String result = processAndGetSource(js, true, false, true);
    Assert.assertFalse("Unused parameter definition should be removed",
        result.contains("unusedParam"));
    Assert.assertTrue("Call site arguments should be stripped",
        result.contains("f()") || !result.contains("42"));
  }
}
