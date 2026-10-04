package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", ":"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}, {"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "/a/b", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "/a/b", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"157.47000000000003"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{",", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"1.12345678", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"0x123556789", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"0x123556789", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "abc"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"\u00e9\u00e9", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", ";", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"{\"a\":1}", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}, {"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "a"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startNewLine", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startNewLine", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startNewLine", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"a"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "maybeCutLine", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endLine", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"1L/a/b"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "-1.0"}, {"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"/"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"-1.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}, {"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", ";", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:0>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"a"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginBlock", ""}, {"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{"\014", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "0xFFFFFFFF", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"\uffff"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{";"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "Hello, World", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", ":", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "Hello, World", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:2>", "true"}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "maybeLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}, {"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "0x1F"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", "1.5d", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:0>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"_"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeCutLine", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "100.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "lx1235567892020-01-01"}, {"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<null>", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "661.123466678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "661.123466678"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "\\1,2]"}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "append", "java.lang.String", "a"}, {"com.google.javascript.jscomp.CodeConsumer", "appendBlockEnd", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "-0.0"}, {"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "-01E-5"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "1.5d"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeCutLine", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", "1.12345678901234567", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5f", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"{\"a\":1}"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "1.5e300"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockEnd", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"Titk"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endLine", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "1L", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginBlock", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"1574.7000000000003"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-5.4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"d"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}, {"com.google.javascript.jscomp.CodeConsumer", "maybeLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "startNewLine", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeCutLine", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:1>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "--1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "beginBlock", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"1.7976931348623155E308"}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", "10.0", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endLine", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{"1e10.5e3100", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "/"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "append", "java.lang.String", "\t"}, {"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"`"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"#"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"$"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}, {"com.google.javascript.jscomp.CodeConsumer", "maybeCutLine", ""}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "\t", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"\"a!:1}"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "1"}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "0"}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "append", "java.lang.String", "+1"}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "+1", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 9, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "m020-01-01"}, {"com.google.javascript.jscomp.CodeConsumer", "endLine", ""}, {"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "10"}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginBlock", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "a", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
