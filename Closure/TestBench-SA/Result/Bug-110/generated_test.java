package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.Node", "isReturn", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "GT {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#348#361098726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:0>"}, {"com.google.javascript.rhino.Node", "setLineno", "int", "36"}, {"com.google.javascript.rhino.Node", "isAssign", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:0>"}, {"com.google.javascript.rhino.Node", "setLineno", "int", "-47"}, {"com.google.javascript.rhino.Node", "isAssign", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isNoSideEffectsCall", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "removeChild", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isThis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "isBlock", ""}}, 3), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 9, new String[][]{{"com.google.javascript.rhino.Node", "isOr", ""}, {"com.google.javascript.rhino.Node", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}, {"com.google.javascript.rhino.Node", "setOptionalArg", "boolean", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getPropListHeadForTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isInstanceOf", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourceOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setVarArgs", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR [var_args_name: 1] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#372#1773836296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isNot", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "31", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourceOffset", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "setVarArgs", "boolean", "false"}, {"com.google.javascript.rhino.Node", "isVoid", ""}, {"com.google.javascript.rhino.Node", "isSetterDef", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setOptionalArg", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR [opt_arg: 1] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=...#366#1081438973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setSideEffectFlags", new String[]{"com.google.javascript.rhino.Node$SideEffectFlags"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}, {"com.google.javascript.rhino.Node", "removeFirstChild", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}, {"com.google.javascript.rhino.Node", "useSourceInfoFrom", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.rhino.Node", "isNull", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}, {"com.google.javascript.rhino.Node", "siblings", ""}, {"com.google.javascript.rhino.Node", "isNull", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isLocalResultCall", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setDouble", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isQualifiedName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER 1.7976931348623157E308 {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=1.7976931348623157E308, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNa...#369#134440961", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.Node", "appendStringTree", "java.lang.Appendable", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GT {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#348#361098726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "createProp", new String[]{"int", "java.lang.Object", "com.google.javascript.rhino.Node$PropListItem"}, new String[]{"-1", "<null>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$ObjectPropListItem", actual.getClass().getName());
  assertEquals("null {getIntValue=!UnsupportedOperationException, getType=-1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.rhino.Node", "wasEmptyNode", ""}, {"com.google.javascript.rhino.Node", "isWith", ""}, {"com.google.javascript.rhino.Node", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NAME <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=<a><b>t</b></a>, getSideEffectFlags=0, getSo...#364#1778165077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isContinue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isCatch", ""}, {"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "2136"}, {"com.google.javascript.rhino.Node", "isLabelName", ""}}), new String[][]{{"getAncestor", "int", "5"}, {"getChangeTime", "", "7"}, {"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "NUMBER -Infinity 32 {getChangeTime=0, getCharno=64, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffse...#350#488152896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "38", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildBefore", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isInc", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isQuotedString", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setJSType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR : function (new:0, *=, *=, *=): 0 {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=...#387#1153779698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "createProp", new String[]{"int", "java.lang.Object", "com.google.javascript.rhino.Node$PropListItem"}, new String[]{"47", "<s:>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "isIf", ""}}), new String[][]{{"getObjectValue", "", "1"}, {"getIntValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isTrue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getAncestors", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "setQuotedString", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildToBack", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "mayMutateArguments", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#590683233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFalse", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "isFor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.Node", "isThrow", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isBreak", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isWhile", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setDirectives", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "removeChildAfter", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.rhino.Node", "isDefaultCase", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR [directives: [a, 0]] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceF...#374#-1445724403", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "setCharno", "int", "2136"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITAND {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#352#1316666911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getCharno", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "cloneNode", ""}, {"com.google.javascript.rhino.Node", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEquivalentToTyped", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "isStringKey", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEquivalentToTyped", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "isWhile", ""}, {"com.google.javascript.rhino.Node", "isStringKey", ""}, {"com.google.javascript.rhino.Node", "isTypeOf", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEquivalentToTyped", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "isGetterDef", ""}, {"com.google.javascript.rhino.Node", "isEquivalentToShallow", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.rhino.Node", "isOptionalArg", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEmpty", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "isOnlyModifiesArgumentsCall", ""}, {"com.google.javascript.rhino.Node", "isOnlyModifiesThisCall", ""}, {"com.google.javascript.rhino.Node", "cloneTree", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITAND {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#352#1316666911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "newString", new String[]{"int", "java.lang.String", "int", "int"}, new String[]{"30", "1.25", "46", "49"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NEW 1.25 46 {getChangeTime=0, getCharno=49, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=46, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, g...#337#827828482", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "clonePropsFrom", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "removeChildren", ""}}), new String[][]{{"getJSDocInfo", "", "2"}, {"getSourcePosition", "", "0"}, {"getChildBefore", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "clonePropsFrom", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "isUnscopedQualifiedName", ""}, {"com.google.javascript.rhino.Node", "isTry", ""}, {"com.google.javascript.rhino.Node", "isInc", ""}}), new String[][]{{"getJSDocInfo", "", "2"}, {"getSourcePosition", "", "0"}, {"getChildBefore", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "newString", new String[]{"int", "java.lang.String"}, new String[]{"39", "synthetic"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NUMBER synthetic {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!IllegalStateException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#335#-1961260300", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setString", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<sample:5>"}, {"com.google.javascript.rhino.Node", "hasOneChild", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setDouble", new String[]{"double"}, new String[]{"-0.9999999999999998"}, false, 10, new String[][]{{"com.google.javascript.rhino.Node", "copyInformationFrom", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.rhino.Node", "isEquivalentTo", "com.google.javascript.rhino.Node,boolean,boolean,boolean", "<sample:4>", "false", "false", "false"}, {"com.google.javascript.rhino.Node", "wasEmptyNode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isScript", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isGetElem", ""}, {"com.google.javascript.rhino.Node", "isNew", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setDouble", new String[]{"double"}, new String[]{"26.5"}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "copyInformationFrom", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.rhino.Node", "isEquivalentTo", "com.google.javascript.rhino.Node,boolean,boolean,boolean", "<sample:4>", "false", "false", "false"}, {"com.google.javascript.rhino.Node", "isExprResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER 26.5 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=26.5, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSour...#332#546978087", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "getIndexOfChild", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nNUMBER -Infinity\n\n\nTree2:\nERROR\n\n\nSubtree1: NUMBER -Infinity\n\n\nSubtree2: ERROR\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:9>"}, {"com.google.javascript.rhino.Node", "isParamList", ""}, {"com.google.javascript.rhino.Node", "isThis", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildrenToBack", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "isStringKey", ""}, {"com.google.javascript.rhino.Node", "getExistingIntProp", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BITAND {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#352#1710595166", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildrenToBack", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.rhino.Node", "getJSDocInfo", ""}, {"com.google.javascript.rhino.Node", "setQuotedString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> [quoted: 1] {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, ge...#365#-60006345", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildrenToBack", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 12, new String[][]{{"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<sample:0>"}, {"com.google.javascript.rhino.Node", "setSourceEncodedPositionForTree", "int", "-2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> 524288 [source_file: GeneratedTestInputProxy] {getChangeTime=0, getCharno=1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=524288, getQualifi...#416#915190209", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildAfter", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.rhino.Node", "removeFirstChild", ""}, {"com.google.javascript.rhino.Node", "addChildToFront", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.rhino.Node", "isGetterDef", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildAfter", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.rhino.Node", "removeFirstChild", ""}, {"com.google.javascript.rhino.Node", "addChildToFront", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.rhino.Node", "isGetterDef", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildToBack", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "removeChild", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setWasEmptyNode", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "addChildrenAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR [empty_block: 1] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#370#956184782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isHook", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "replaceChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:9>"}, {"com.google.javascript.rhino.Node", "isVoid", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "srcrefTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 15, new String[][]{}, 2), new String[][]{{"addSuppression", "java.lang.String", "3"}, {"getAncestors", "", "1"}, {"iterator", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "GT [jsdoc_info: JSDocInfo] {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceF...#372#1096624613", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<sample:0>"}, {"com.google.javascript.rhino.Node", "clonePropsFrom", "com.google.javascript.rhino.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity [source_file: GeneratedTestInputProxy] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, ge...#378#-1899142955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "isDebugger", ""}, {"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "-58"}, {"com.google.javascript.rhino.Node", "isArrayLit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isWhile", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", "com.google.javascript.rhino.Node", "<sample:10>"}, {"com.google.javascript.rhino.Node", "isObjectLit", ""}, {"com.google.javascript.rhino.Node", "setSourceEncodedPosition", "int", "33"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> 0 {getChangeTime=0, getCharno=33, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#356#261882971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isIn", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isDec", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEquivalentTo", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isSyntheticBlock", ""}, {"com.google.javascript.rhino.Node", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "createProp", new String[]{"int", "int", "com.google.javascript.rhino.Node$PropListItem"}, new String[]{"44", "-1", "<sample:7>"}, false, 0, null, 3), new String[][]{{"getType", "", "5"}, {"getObjectValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isSwitch", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "addChildrenToFront", "com.google.javascript.rhino.Node", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#590683233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getAncestor", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "srcref", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "isCast", ""}, {"com.google.javascript.rhino.Node", "copyInformationFromForTree", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2), new String[][]{{"isAnd", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getJsDocBuilderForNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<sample:7>"}}), new String[][]{{"append", "java.lang.String", "6"}, {"append", "java.lang.String", "0"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "NUMBER -Infinity [jsdoc_info: JSDocInfo] [source_file: GeneratedTestInputProxy] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, ...#408#1024107710", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:10>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:4>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:15>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isLabel", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isDelProp", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isDo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.Node", "checkTreeTypeAwareEqualsImpl", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "41", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isWhile", ""}, {"com.google.javascript.rhino.Node", "isDefaultCase", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setSourceFileForTesting", new String[]{"java.lang.String"}, new String[]{"30"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "com.google.javascript.rhino.Node$SideEffectFlags", "<sample:6>"}, {"com.google.javascript.rhino.Node", "isUnscopedQualifiedName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR [source_file: 30] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#369#963906839", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "newNumber", new String[]{"double", "int", "int"}, new String[]{"2100.729", "23", "2147483647"}, true, 0, null, 2), new String[][]{{"getAncestor", "int", "6"}, {"addChildToFront", "com.google.javascript.rhino.Node", "5"}, {"getChildCount", "", "0"}, {"hasChild", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isComma", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR [input_id: InputId: sample] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, get...#381#868905413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "toString", new String[]{"boolean", "boolean", "boolean"}, new String[]{"false", "false", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ERROR", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "mayMutateGlobalStateOrThrow", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.rhino.Node", "addChildToFront", "com.google.javascript.rhino.Node", "<sample:15>"}, {"com.google.javascript.rhino.Node", "isRegExp", ""}, {"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "CONTINUE {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#355#179808339", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "createProp", new String[]{"int", "java.lang.Object", "com.google.javascript.rhino.Node$PropListItem"}, new String[]{"28", "<s:`>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "setWasEmptyNode", "boolean", "false"}, {"com.google.javascript.rhino.Node", "getStaticSourceFile", ""}, {"com.google.javascript.rhino.Node", "getChildAtIndex", "int", "2"}}, 1), new String[][]{{"chain", "com.google.javascript.rhino.Node$PropListItem", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$ObjectPropListItem", actual.getClass().getName());
  assertEquals("` {getIntValue=!UnsupportedOperationException, getType=28}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setType", new String[]{"int"}, new String[]{"33"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GETPROP {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=!NullPointerException, getSideEffectFlags=0, getSourceFil...#372#517474718", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "detachChildren", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "useSourceInfoFrom", "com.google.javascript.rhino.Node", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}), new String[][]{{"children", "", "1"}, {"hasNext", "", "4"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourcePosition", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.Node", "setString", "java.lang.String", "32"}, {"com.google.javascript.rhino.Node", "getCharno", ""}, {"com.google.javascript.rhino.Node", "replaceChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING 32 {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#329#-83403027", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeTypeAwareEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "36"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity [length: 36] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=36, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#357#467910029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFromExterns", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "children", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFrom", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "isThis", ""}, {"com.google.javascript.rhino.Node", "isVar", ""}, {"com.google.javascript.rhino.Node", "setIsSyntheticBlock", "boolean", "true"}}), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "1"}, {"detachFromParent", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildrenToFront", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.rhino.Node", "setSourceEncodedPositionForTree", "int", "-32"}, {"com.google.javascript.rhino.Node", "isCase", ""}, {"com.google.javascript.rhino.Node", "isIn", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeTypeAwareEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "isNE", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setType", new String[]{"int"}, new String[]{"96"}, false, 2, new String[][]{{"com.google.javascript.rhino.Node", "setChangeTime", "int", "2136"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ASSIGN_DIV 0 [change_time: 2136] {getChangeTime=2136, getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, get...#378#-2081706154", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEmpty", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "EMPTY {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#-41988778", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getProp", new String[]{"int"}, new String[]{"33554430"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "putIntProp", "int,int", "40", "46"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR [originalname: 46] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#372#1477381338", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isAdd", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.Node", "isAnd", ""}, {"com.google.javascript.rhino.Node", "addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:15>", "<null>"}, {"com.google.javascript.rhino.Node", "isGetProp", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity [length: 53] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=53, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#357#-2132951465", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 [length: 53] {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=53, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#371#57281910", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "-53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 [length: -53] {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=-53, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#373#-1052195842", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "-32715"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 [length: -32715] {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=-32715, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSou...#379#-1747977578", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> [length: 53] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=53, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, ...#369#-1201390209", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}, {"com.google.javascript.rhino.Node", "getAncestors", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 [length: 53] {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=53, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#371#57281910", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}, {"com.google.javascript.rhino.Node", "isNumber", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 [length: 53] {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=53, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#371#57281910", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "getBooleanProp", "int", "47"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITAND [length: 53] {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=53, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#366#2058601047", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BLOCK [length: 53] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=53, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName...#368#217019197", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "GT [length: 53] {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=53, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=nu...#362#1475988348", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.Node", "setLength", "int", "53"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BREAK [length: 53] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=53, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName...#368#404986605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.Node", "isReturn", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.Node", "isReturn", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:5>"}, {"com.google.javascript.rhino.Node", "isReturn", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 [input_id: InputId: 0] {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSo...#380#984040851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:5>"}, {"com.google.javascript.rhino.Node", "isReturn", ""}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 [input_id: InputId: 0] {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSo...#380#984040851", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "srcrefTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isCase", ""}, {"com.google.javascript.rhino.Node", "setType", "int", "50"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setDouble", "double", "53"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setDouble", "double", "53"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 3), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "30"}}, 3), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NodeMismatch", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "getType", ""}}, 1), new String[][]{{"hasMoreThanOneChild", "", "2"}, {"children", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getPropListHeadForTesting", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isInstanceOf", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getPropListHeadForTesting", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.Node", "getStaticSourceFile", ""}, {"com.google.javascript.rhino.Node", "isDefaultCase", ""}, {"com.google.javascript.rhino.Node", "isInstanceOf", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getPropListHeadForTesting", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "getStaticSourceFile", ""}, {"com.google.javascript.rhino.Node", "isDefaultCase", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isParamList", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}, {"com.google.javascript.rhino.Node", "useSourceInfoFrom", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.rhino.Node", "isNull", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}, {"com.google.javascript.rhino.Node", "useSourceInfoFrom", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.rhino.Node", "isNull", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "useSourceInfoFrom", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isSwitch", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "useSourceInfoFrom", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isSwitch", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.Node", "isSwitch", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "isOnlyModifiesThisCall", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.Node", "isOnlyModifiesThisCall", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setDouble", new String[]{"double"}, new String[]{"43"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "getPropListHeadForTesting", ""}, {"com.google.javascript.rhino.Node", "isOnlyModifiesThisCall", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITAND {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#352#1316666911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.Node", "getJSType", ""}, {"com.google.javascript.rhino.Node", "getPropListHeadForTesting", ""}, {"com.google.javascript.rhino.Node", "isOnlyModifiesThisCall", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BLOCK {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#934597079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "getJSType", ""}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITAND {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#352#1316666911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<sample:7>"}, {"com.google.javascript.rhino.Node", "getJSType", ""}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITAND [source_file: GeneratedTestInputProxy] {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffect...#393#-1170923375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GT {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#348#361098726", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BREAK {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#671054343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.Node", "appendStringTree", "java.lang.Appendable", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BREAK {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#671054343", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.Node", "appendStringTree", "java.lang.Appendable", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BLOCK {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#934597079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.Node", "copyInformationFrom", "com.google.javascript.rhino.Node", "<sample:9>"}, {"com.google.javascript.rhino.Node", "appendStringTree", "java.lang.Appendable", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "GT 10 {getChangeTime=0, getCharno=11, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=10, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#-980378957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.Node", "copyInformationFrom", "com.google.javascript.rhino.Node", "<sample:9>"}, {"com.google.javascript.rhino.Node", "appendStringTree", "java.lang.Appendable", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BREAK 10 {getChangeTime=0, getCharno=11, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=10, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#360#524366550", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFrom", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.rhino.Node", "wasEmptyNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "FALSE {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-2057492126", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.rhino.Node", "wasEmptyNode", ""}, {"com.google.javascript.rhino.Node", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "LABEL_NAME <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceF...#360#-718802905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.rhino.Node", "wasEmptyNode", ""}, {"com.google.javascript.rhino.Node", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NAME <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=<a><b>t</b></a>, getSideEffectFlags=0, getSo...#364#1778165077", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.javascript.rhino.Node", "wasEmptyNode", ""}, {"com.google.javascript.rhino.Node", "isWith", ""}, {"com.google.javascript.rhino.Node", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NULL {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#352#-949551004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setSideEffectFlags", new String[]{"com.google.javascript.rhino.Node$SideEffectFlags"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "com.google.javascript.rhino.Node$SideEffectFlags", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}, {"com.google.javascript.rhino.Node", "isWith", ""}}, 3), new String[][]{{"getAncestor", "int", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}, {"com.google.javascript.rhino.Node", "isWith", ""}}, 3), new String[][]{{"getAncestor", "int", "4"}, {"getChangeTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "isLabelName", ""}, {"com.google.javascript.rhino.Node", "isFalse", ""}, {"com.google.javascript.rhino.Node", "isWith", ""}}, 3), new String[][]{{"getAncestor", "int", "4"}, {"getChangeTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "2136"}, {"com.google.javascript.rhino.Node", "isLabelName", ""}}, 1), new String[][]{{"getAncestor", "int", "5"}, {"getChangeTime", "", "7"}, {"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "NUMBER -Infinity 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#342#422534543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "4272"}, {"com.google.javascript.rhino.Node", "isLabelName", ""}}, 1), new String[][]{{"getAncestor", "int", "5"}, {"getChangeTime", "", "7"}, {"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isScript", ""}, {"com.google.javascript.rhino.Node", "isQualifiedName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isScript", ""}, {"com.google.javascript.rhino.Node", "removeChildAfter", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.rhino.Node", "isQualifiedName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nERROR\n\n\nTree2:\nNUMBER -Infinity\n\n\nSubtree1: ERROR\n\n\nSubtree2: NUMBER -Infinity\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "38", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nERROR [synthetic: a]\n\n\nTree2:\nNUMBER -Infinity\n\n\nSubtree1: ERROR [synthetic: a]\n\n\nSubtree2: NUMBER -Infinity\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR [synthetic: a] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#368#1070215688", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:12>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:11>", "<sample:1>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isOptionalArg", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFalse", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "isFunction", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFalse", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "isFunction", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFalse", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.Node", "isFunction", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isWith", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isGetElem", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "createProp", "int,java.lang.Object,com.google.javascript.rhino.Node$PropListItem", "28", "<i:2>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addChildToFront", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#351#590683233", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setOptionalArg", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFrom", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "cloneTree", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:5>"}, {"com.google.javascript.rhino.Node", "isReturn", ""}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BITAND [input_id: InputId: 0] {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSour...#375#-779629166", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:5>"}, {"com.google.javascript.rhino.Node", "isReturn", ""}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BLOCK [input_id: InputId: 0] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#377#-1029891926", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:5>"}, {"com.google.javascript.rhino.Node", "isReturn", ""}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> [input_id: InputId: 0] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffect...#378#-1949713764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "isReturn", ""}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BITAND {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#352#1316666911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isOnlyModifiesThisCall", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:4>"}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BITAND [input_id: InputId: a] {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSour...#375#-958046527", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:4>"}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BLOCK [input_id: InputId: a] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#377#908018971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:1>"}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}, {"com.google.javascript.rhino.Node", "setLineno", "int", "36"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:1>"}, {"com.google.javascript.rhino.Node", "getJsDocBuilderForNode", ""}, {"com.google.javascript.rhino.Node", "setLineno", "int", "36"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:0>"}, {"com.google.javascript.rhino.Node", "wasEmptyNode", ""}, {"com.google.javascript.rhino.Node", "isAssign", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GT [input_id: InputId: a] {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFi...#371#-1529964510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getDirectives", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.Node", "setInputId", "com.google.javascript.rhino.InputId", "<sample:7>"}, {"com.google.javascript.rhino.Node", "getJSType", ""}, {"com.google.javascript.rhino.Node", "isAssign", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "GT [input_id: InputId: ] {getChangeTime=0, getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#370#-953245719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "getIndexOfChild", "com.google.javascript.rhino.Node", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isNoSideEffectsCall", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "removeChild", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isThis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "isBlock", ""}}), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoIfMissingFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "isBlock", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NodeMismatch", actual.getClass().getName());
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isCall", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getChildCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}, {"com.google.javascript.rhino.Node", "isScript", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR [jsdoc_info: JSDocInfo] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSour...#377#1044929003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "mergeLineCharNo", new String[]{"int", "int"}, new String[]{"31", "31"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("127007", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "hasOneChild", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NodeMismatch", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 9, new String[][]{{"com.google.javascript.rhino.Node", "isOr", ""}, {"com.google.javascript.rhino.Node", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NodeMismatch", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEqualsImpl", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 9, new String[][]{{"com.google.javascript.rhino.Node", "isOr", ""}, {"com.google.javascript.rhino.Node", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.rhino.Node", "getFirstChild", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setWasEmptyNode", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourceOffset", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "setVarArgs", "boolean", "true"}, {"com.google.javascript.rhino.Node", "isVoid", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourceOffset", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "setVarArgs", "boolean", "true"}, {"com.google.javascript.rhino.Node", "isVoid", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity [var_args_name: 1] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null...#362#-1597223693", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourceOffset", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setVarArgs", "boolean", "false"}, {"com.google.javascript.rhino.Node", "isVoid", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isScript", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setWasEmptyNode", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.rhino.Node", "isDefaultCase", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR [jsdoc_info: JSDocInfo] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSour...#377#1044929003", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setOptionalArg", "boolean", "true"}, {"com.google.javascript.rhino.Node", "isParamList", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR [opt_arg: 1] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=...#366#1081438973", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "cloneNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "removeProp", "int", "33"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourceOffset", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setDouble", new String[]{"double"}, new String[]{"42"}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "isVar", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getIndexOfChild", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "replaceChild", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:6>"}, {"com.google.javascript.rhino.Node", "useSourceInfoFrom", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.rhino.Node", "isNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.Node", "hasChildren", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<sample:7>"}, {"com.google.javascript.rhino.Node", "getJSType", ""}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITAND [source_file: GeneratedTestInputProxy] {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffect...#393#-1170923375", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.Node", "setStaticSourceFile", "com.google.javascript.rhino.jstype.StaticSourceFile", "<sample:7>"}, {"com.google.javascript.rhino.Node", "getJSType", ""}, {"com.google.javascript.rhino.Node", "isAssignAdd", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BLOCK [source_file: GeneratedTestInputProxy] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectF...#395#-1895746997", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getLength", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.rhino.Node", "setVarArgs", "boolean", "false"}, {"com.google.javascript.rhino.Node", "getLastChild", ""}, {"com.google.javascript.rhino.Node", "hasOneChild", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getBooleanProp", new String[]{"int"}, new String[]{"49"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "removeChildren", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#342#422534543", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#342#422534543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}}), new String[][]{{"getAncestor", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#342#422534543", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}}), new String[][]{{"getAncestor", "int", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "removeFirstChild", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFalse", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isFalse", ""}}), new String[][]{{"getAncestor", "int", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity 7 {getChangeTime=0, getCharno=8, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#346#-201489315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "isLabelName", ""}, {"com.google.javascript.rhino.Node", "isFalse", ""}, {"com.google.javascript.rhino.Node", "isWith", ""}}), new String[][]{{"getAncestor", "int", "4"}, {"getChangeTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "44"}, {"com.google.javascript.rhino.Node", "isLabelName", ""}, {"com.google.javascript.rhino.Node", "toStringTree", ""}}), new String[][]{{"getAncestor", "int", "4"}, {"getChangeTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "2136"}, {"com.google.javascript.rhino.Node", "isLabelName", ""}, {"com.google.javascript.rhino.Node", "toStringTree", ""}}), new String[][]{{"getAncestor", "int", "4"}, {"getChangeTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "BLOCK {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#934597079", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "siblings", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "2136"}, {"com.google.javascript.rhino.Node", "isLabelName", ""}, {"com.google.javascript.rhino.Node", "toStringTree", ""}}), new String[][]{{"getAncestor", "int", "4"}, {"getChangeTime", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity 32 {getChangeTime=0, getCharno=64, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffse...#350#488152896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "copyInformationFromForTree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "2136"}, {"com.google.javascript.rhino.Node", "isLabelName", ""}, {"com.google.javascript.rhino.Node", "toStringTree", ""}}), new String[][]{{"getAncestor", "int", "5"}, {"getChangeTime", "", "7"}, {"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "NUMBER -Infinity 32 {getChangeTime=0, getCharno=64, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffse...#350#488152896", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isUnscopedQualifiedName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isVar", ""}, {"com.google.javascript.rhino.Node", "isCall", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nERROR\n\n\nTree2:\nNUMBER -Infinity\n\n\nSubtree1: ERROR\n\n\nSubtree2: NUMBER -Infinity\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isNE", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "wasEmptyNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isScript", ""}, {"com.google.javascript.rhino.Node", "isQualifiedName", ""}, {"com.google.javascript.rhino.Node", "toString", "boolean,boolean,boolean", "true", "false", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isLabel", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setSideEffectFlags", new String[]{"int"}, new String[]{"30"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getChildCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "3", "<sample:2>"}, {"com.google.javascript.rhino.Node", "isIn", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourceOffset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "srcref", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR 7 {getChangeTime=0, getCharno=8, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#356#219159712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "-3", "<sample:0>"}, {"com.google.javascript.rhino.Node", "getChildAtIndex", "int", "43"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "-3", "<sample:0>"}, {"com.google.javascript.rhino.Node", "getChildAtIndex", "int", "43"}, {"com.google.javascript.rhino.Node", "isAnd", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.rhino.Node", "putProp", "int,java.lang.Object", "-3", "<sample:0>"}, {"com.google.javascript.rhino.Node", "getChildAtIndex", "int", "-33554389"}, {"com.google.javascript.rhino.Node", "isAnd", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "checkTreeEquals", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.rhino.Node", "isAdd", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isDebugger", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "clonePropsFrom", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEquivalentTo", new String[]{"com.google.javascript.rhino.Node", "boolean", "boolean", "boolean"}, new String[]{"<sample:6>", "false", "true", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isExprResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isCall", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getSourcePosition", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setJSType", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR : * {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#357#-296576432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isEquivalentTo", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "getQualifiedName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isNoSideEffectsCall", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "addSuppression", new String[]{"java.lang.String"}, new String[]{"opt_arg"}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isComma", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity [jsdoc_info: JSDocInfo] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName...#367#1081111812", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "hasMoreThanOneChild", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "createProp", "int,int,com.google.javascript.rhino.Node$PropListItem", "45", "42", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setVarArgs", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setInputId", new String[]{"com.google.javascript.rhino.InputId"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "getInputId", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR [input_id: InputId: sample] {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, get...#381#868905413", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "removeChildren", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "isUnscopedQualifiedName", ""}, {"com.google.javascript.rhino.Node", "clonePropsFrom", "com.google.javascript.rhino.Node", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:10>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getCharno", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isFor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isAnd", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "useSourceInfoFrom", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "ERROR 0 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#352#-704410096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getChangeTime", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "setDirectives", "java.util.Set", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isScript", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.Node", "checkTreeEquals", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.rhino.Node", "isEmpty", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "extractCharno", new String[]{"int"}, new String[]{"35"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("35", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "mergeLineCharNo", new String[]{"int", "int"}, new String[]{"38", "33"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("155681", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "removeProp", new String[]{"int"}, new String[]{"28"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "wasEmptyNode", ""}, {"com.google.javascript.rhino.Node", "getLength", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isGetterDef", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "isQualifiedName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "setSideEffectFlags", "int", "36"}, {"com.google.javascript.rhino.Node", "getNext", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getJSDocInfo", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getJSDocInfo", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.Node", "isGetElem", ""}, {"com.google.javascript.rhino.Node", "setDirectives", "java.util.Set", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "getJSDocInfo", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.Node", "isGetElem", ""}, {"com.google.javascript.rhino.Node", "setDirectives", "java.util.Set", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "appendStringTree", new String[]{"java.lang.Appendable"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITAND {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#352#1316666911", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "setSideEffectFlags", new String[]{"int"}, new String[]{"53"}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "detachChildren", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isFunction", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "BITOR 32 {getChangeTime=0, getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#357#1472174588", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isReturn", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.Node", "getJSType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.Node", "setSourceEncodedPositionForTree", "int", "51"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setSourceEncodedPositionForTree", "int", "51"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity 0 {getChangeTime=0, getCharno=51, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=...#344#-1404313511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.Node", "setSourceEncodedPositionForTree", "int", "131123"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity 32 {getChangeTime=0, getCharno=51, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffse...#350#689956860", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.Node", "getIndexOfChild", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.Node", "getIndexOfChild", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "isString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.receiverState());
 }
}
