package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"1.5", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{".T"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{","}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"0xFFFFFFFF1-123456", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.CodeConsumer", "append", "java.lang.String", "0x1F:"}, {"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
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
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockEnd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"\t"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"/5."}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{"1.1234567", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"t0rue2020-01-0>0"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"t0rue2020-01-0>0"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"W"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{","}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{",", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"100.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", "2147483648", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "Infinity"}, {"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "-1.7976931348623157E308"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeLineBreak", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:7>", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "maybeLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "Title"}, {"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"E"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeCutLine", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockEnd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:4>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "1.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{">"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endLine", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:3>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endLine", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}, {"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", "Hello, World", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"11./"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"11"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", ".T", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-11.309000000000003"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.2827250000000001"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}, {"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", "[1,2]", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"TII/TLE-1.5", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "0.0"}, {"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "0.0"}, {"com.google.javascript.jscomp.CodeConsumer", "breakAfterBlockFor", "com.google.javascript.rhino.Node,boolean", "<sample:3>", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "E", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "F", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "F", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}, {"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{".T", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}, {"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endCaseBody", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "append", "java.lang.String", "05."}, {"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "notePreferredLineBreak", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"="}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeCutLine", ""}, {"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}, {"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendOp", new String[]{"java.lang.String", "boolean"}, new String[]{"10.0", "false"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addNumber", new String[]{"double"}, new String[]{"2.0"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}, {"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "listSeparator", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "breakAfterBlockFor", new String[]{"com.google.javascript.rhino.Node", "boolean"}, new String[]{"<sample:7>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockStart", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startNewLine", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-30.6"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"-1.55"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}, {"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "shouldPreserveExtraBlocks", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "0x1F"}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startSourceMapping", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.CodeConsumer", "appendBlockEnd", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"0x123456789"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "appendBlockEnd", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFile", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "i", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFile", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endLine", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "notePreferredLineBreak", ""}, {"com.google.javascript.jscomp.CodeConsumer", "append", "java.lang.String", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "append", new String[]{"java.lang.String"}, new String[]{"1344678901345678901234567890{"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endBlock", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "getLastChar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "1e10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "continueProcessing", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "startNewLine", ""}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", ".T", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginCaseBody", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "-1.5", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startSourceMapping", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginCaseBody", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "startNewLine", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "beginBlock", ""}, {"com.google.javascript.jscomp.CodeConsumer", "appendBlockEnd", ""}, {"com.google.javascript.jscomp.CodeConsumer", "appendOp", "java.lang.String,boolean", "abc", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeCutLine", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "/5."}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isWordChar", new String[]{"char"}, new String[]{"_"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endBlock", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeLineBreak", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"\\,E]"}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addNumber", "double", "0.0"}, {"com.google.javascript.jscomp.CodeConsumer", "beginBlock", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeLineBreak", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "C"}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "a b"}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockEnd", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endCaseBody", ""}, {"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "addOp", "java.lang.String,boolean", "5.", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "endStatement", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "startNewLine", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "listSeparator", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "false"}, {"com.google.javascript.jscomp.CodeConsumer", "endFunction", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addIdentifier", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "beginBlock", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "appendBlockStart", ""}, {"com.google.javascript.jscomp.CodeConsumer", "add", "java.lang.String", "1L"}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{""}, false, 4, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "getLastChar", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endSourceMapping", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCode=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "isNegativeZero", new String[]{"double"}, new String[]{"-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "add", new String[]{"java.lang.String"}, new String[]{"$$"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "endBlock", "boolean", "true"}, {"com.google.javascript.jscomp.CodeConsumer", "addIdentifier", "java.lang.String", "PT1H"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "addOp", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "shouldPreserveExtraBlocks", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CodeConsumer", "com.google.javascript.jscomp.CodePrinter$CompactCodePrinter", "maybeEndStatement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.CodeConsumer", "maybeEndStatement", ""}, {"com.google.javascript.jscomp.CodeConsumer", "continueProcessing", ""}, {"com.google.javascript.jscomp.CodeConsumer", "endStatement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
