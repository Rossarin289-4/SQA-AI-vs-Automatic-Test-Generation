package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "<sample:1>", "<sample:3>", "<sample:4>", "true", "true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionInjector$CanInlineResult", actual.getClass().getName());
  assertEquals("NO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1.1234567890123456", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "maybePrepareCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "maybePrepareCall", "com.google.javascript.rhino.Node", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inline", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FunctionInjector$InliningMode"}, new String[]{"<sample:4>", "0x1F", "<sample:2>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "<sample:3>", "<sample:2>", "false", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "<sample:1>", "<empty>", "true", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "inline", "com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector$InliningMode", "<sample:8>", "a,b,c", "<sample:2>", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "maybePrepareCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<null>", "<sample:0>", "<null>", "<null>", "<sample:5>", "true", "true"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "<sample:2>", "<sample:1>", "<null>", "true", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector$InliningMode,boolean,boolean", "<null>", "<sample:2>", "<sample:7>", "<sample:0>", "<sample:4>", "false", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionInjector$CanInlineResult", actual.getClass().getName());
  assertEquals("NO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inline", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FunctionInjector$InliningMode"}, new String[]{"<sample:5>", "12:30:45", "<sample:8>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", "java.lang.String,com.google.javascript.rhino.Node", "SIMPLE`sSSIGNMENT", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "inline", "com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector$InliningMode", "<sample:5>", "r010AFTER_PREPARATION", "<sample:4>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "<sample:8>", "<sample:3>", "<sample:10>", "true", "true"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionInjector$CanInlineResult", actual.getClass().getName());
  assertEquals("NO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>", "<sample:3>", "<sample:1>", "true", "true"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<null>", "<sample:6>", "<sample:4>", "<sample:0>", "<sample:6>", "true", "false"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "<sample:0>", "<sample:1>", "false", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<null>", "<sample:7>", "<sample:3>", "<sample:0>", "<sample:6>", "true", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionInjector$CanInlineResult", actual.getClass().getName());
  assertEquals("NO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "<sample:8>", "<sample:4>", "<null>", "false", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "inline", "com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.FunctionInjector$InliningMode", "<sample:4>", "tste", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<null>", "<sample:3>", "<sample:2>", "<sample:4>", "<sample:0>", "false", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "<empty>", "<sample:4>", "true", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "<sample:2>", "<sample:1>", "false", "false"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"1", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", "com.google.javascript.rhino.Node", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inline", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FunctionInjector$InliningMode"}, new String[]{"<sample:7>", "{\"a\":1}", "<sample:1>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"bbc", "<sample:5>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"a,a,c", "<sample:6>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "<sample:8>", "<sample:1>", "<sample:6>", "true", "true"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionInjector$CanInlineResult", actual.getClass().getName());
  assertEquals("NO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inline", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FunctionInjector$InliningMode"}, new String[]{"<null>", "2020-0-01", "<sample:0>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "maybePrepareCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "<sample:5>", "<sample:3>", "<sample:6>", "false", "true"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "<sample:5>", "<sample:0>", "<sample:0>", "true", "true"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.FunctionInjector$CanInlineResult", actual.getClass().getName());
  assertEquals("NO", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"mNO", "<sample:8>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "maybePrepareCall", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<null>", "<null>", "<sample:0>", "<sample:5>", "true", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.util.Set,com.google.javascript.jscomp.FunctionInjector$InliningMode,boolean,boolean", "<sample:4>", "<sample:3>", "<sample:0>", "<sample:3>", "<sample:5>", "false", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:8>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "<null>", "<sample:10>", "<sample:2>", "true", "true"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<null>", "<sample:1>", "<null>", "<sample:2>", "false", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "<sample:9>", "<sample:4>", "<sample:0>", "false", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"a", "<null>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:3>", "<null>", "<sample:0>", "<sample:3>", "false", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "canInlineReferenceToFunction", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "java.util.Set", "com.google.javascript.jscomp.FunctionInjector$InliningMode", "boolean", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "<sample:7>", "<sample:2>", "<sample:6>", "false", "false"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"YES", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:3>", "<sample:2>", "<empty>", "<sample:6>", "true", "false"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "<null>", "<sample:4>", "false", "true"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "<null>", "<sample:3>", "true", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", "com.google.javascript.jscomp.JSModule,com.google.javascript.rhino.Node,java.util.Collection,java.util.Set,boolean,boolean", "<null>", "<null>", "<empty>", "<sample:4>", "false", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "isDirectCallNodeReplacementPossible", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "doesFunctionMeetMinimumRequirements", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"-1.5", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "<null>", "<sample:1>", "true", "true"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "<empty>", "<sample:2>", "false", "false"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "inliningLowersCost", new String[]{"com.google.javascript.jscomp.JSModule", "com.google.javascript.rhino.Node", "java.util.Collection", "java.util.Set", "boolean", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "<empty>", "<sample:8>", "false", "false"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.FunctionInjector", "com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.FunctionInjector", "setKnownConstants", "java.util.Set", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
