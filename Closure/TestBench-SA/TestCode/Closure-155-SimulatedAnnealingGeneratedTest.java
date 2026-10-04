package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.1234567890123456", "<sample:6>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.1234567890123456 {getInputName=, getName=1.1234567890123456, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isType...#214#-2007306778", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.1234567890123456", "<sample:6>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1), new String[][]{{"getInitialValue", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "\u00e9", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "\u00e9", "false"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"123456789012345678901234567890", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"getJSDocInfo", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "arguments"}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".5", "<sample:4>", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}), new String[][]{{"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=fals...#378#68352783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<null>", "<sample:5>", "<sample:4>", "<sample:6>", "false"}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:9>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"isTypeInferred", "", "0"}, {"getNameNode", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"", "<sample:0>", "<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"5.", "<sample:6>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1), new String[][]{{"isGlobal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.1235567890123456", "<sample:6>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:1>", "<null>", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.1235567890123456 {getInputName=, getName=1.1235567890123456, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isType...#214#-1374836602", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.123F5678901234561.5e300", "<sample:6>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<null>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.5e300", "<sample:0>", "<sample:2>", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.123F5678901234561.5e300 {getInputName=, getName=1.123F5678901234561.5e300, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow...#228#1614309914", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.123F5678901234561.5e300", "<sample:6>", "<sample:5>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<null>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.5e300", "<sample:0>", "<sample:2>", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.123F5678901234561.5e300 {getInputName=, getName=1.123F5678901234561.5e300, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow...#228#-1184214626", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"a b", "<sample:6>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<null>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var a b {getInputName=, getName=a b, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"a b", "<null>", "<sample:2>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<null>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var a b {getInputName=<a><b>t</b></a>, getName=a b, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "2147483648", "<null>", "<sample:3>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "Hello, Wo\u00e9ld", "<null>", "<sample:6>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "null"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:3>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<null>", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<null>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=64, has...#384#2136680243", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=64, has...#384#2136680243", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getVars", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=-1, hasChil...#381#-1958876465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isLocal", "", "4"}, {"isBleedingFunction", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".", "<sample:4>", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 3), new String[][]{{"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=fals...#378#68352783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"0x1F", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"TITLF", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:9>", "<sample:4>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567890123456", "<sample:0>", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "1.12345678901234567"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "\n"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"clear", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 3), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2), new String[][]{{"getParentNode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2), new String[][]{{"getParentNode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:9>", "<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"-1.5", "<sample:0>", "<sample:6>", "<sample:3>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -1.5 {getInputName=, getName=-1.5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 3), new String[][]{{"isEquivalentToTyped", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "5.", "<null>", "<sample:4>", "<sample:5>", "true"}}, 3), new String[][]{{"isEquivalentToTyped", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "5.", "<null>", "<sample:4>", "<sample:5>", "true"}}, 3), new String[][]{{"isEquivalentToTyped", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "getParent", ""}}, 2), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<null>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "nrue", "<sample:9>", "<sample:3>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "nrue", "<sample:9>", "<sample:3>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", ".5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "\r5"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "\rW"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 2), new String[][]{{"getParentScope", "", "5"}, {"isGlobal", "", "3"}, {"getVar", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>", "<sample:4>"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<null>", "<sample:3>"}}, 1), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<null>", "<sample:3>"}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "''"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "a b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "''"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "a b"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "''"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "a b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "''"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "a b"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "LOCALS_ONLY", "<null>", "<sample:0>", "<sample:0>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "5.", "<null>", "<sample:1>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"-1", "<sample:4>", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -1 {getInputName=<non-file>, getName=-1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"-1", "<sample:4>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -1 {getInputName=, getName=-1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"5.", "<sample:5>", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 5. {getInputName=, getName=5., isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"5.", "<sample:6>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}), new String[][]{{"isGlobal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"5.", "<sample:6>", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}), new String[][]{{"isGlobal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "2147483648", "<null>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "2147483648", "<null>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "<non-file>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#207#-512843101", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "<non-file>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"isLocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isLocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}}), new String[][]{{"hasNext", "", "6"}, {"hasNext", "", "6"}, {"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "010"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=39, hasChildren=false...#372#-162157149", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "010"}}), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "1F--5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GT {getCharno=-1, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=16, hasChildre...#377#770955894", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "1F--5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=64, has...#384#2136680243", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getVars", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=-1, hasChil...#381#-1958876465", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "\u00e9", "<sample:2>", "<sample:1>", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"getJSDocInfo", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "\u00e9", "<sample:2>", "<sample:1>", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"getJSDocInfo", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "/a/b", "<sample:3>", "<sample:4>", "<sample:1>", "false"}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"a"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"a", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "arguments"}}), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "arguments"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "-1.5", "<sample:5>", "<sample:7>", "<sample:1>", "false"}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "-1.5", "<sample:5>", "<sample:7>", "<sample:1>", "false"}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "CONSTANTS_ONLY", "true"}, {"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".", "<sample:4>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}), new String[][]{{"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".", "<sample:4>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var . {getInputName=, getName=., isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".", "<sample:4>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(".", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".", "<sample:4>", "<sample:4>", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var . {getInputName=, getName=., isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "TITLE", "<sample:9>", "<sample:1>", "<sample:7>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "TITLE", "<sample:9>", "<sample:1>", "<sample:7>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"var xx=;", "<sample:3>", "<sample:3>", "<sample:7>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var var xx=; {getInputName=<a><b>t</b></a>, getName=var xx=;, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInfer...#210#-1269063899", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"var xx=V;", "<sample:3>", "<sample:3>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:2>", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var var xx=V; {getInputName=<a><b>t</b></a>, getName=var xx=V;, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInf...#212#-1653795467", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xxV;", "<sample:3>", "<sample:3>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:2>", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var v`r xxV; {getInputName=<a><b>t</b></a>, getName=v`r xxV;, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInfer...#210#1880945329", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xxV;", "<sample:3>", "<sample:3>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:2>", "<sample:6>", "<sample:5>"}}), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xxV;", "<sample:3>", "<sample:3>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:2>", "<sample:6>", "<sample:5>"}}), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=3, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xxV;", "<sample:1>", "<sample:4>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:2>", "<sample:6>", "<sample:5>"}}), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=3, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xxV;", "<sample:1>", "<sample:2>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:2>", "<sample:6>", "<sample:5>"}}), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=fals...#378#68352783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=3, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xV;", "<null>", "<sample:2>", "<null>", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:5>", "<sample:6>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var v`r xV; {getInputName=<non-file>, getName=v`r xV;, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=fal...#203#-552621311", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=3, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xV;", "<null>", "<sample:2>", "<null>", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:5>", "<sample:6>", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("v`r xV;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=3, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xIV;", "<null>", "<sample:2>", "<null>", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:5>", "<sample:6>", "<sample:8>"}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var v`r xIV; {getInputName=<non-file>, getName=v`r xIV;, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=f...#205#-1104806711", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=3, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"v`r xIV;", "<sample:0>", "<sample:2>", "<null>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-file>", "<sample:3>", "<sample:0>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:5>", "<sample:6>", "<sample:7>"}}), new String[][]{{"getJSDocInfo", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=3, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"MOCCALS_ONLYScope.Var "}, false, 11, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "12:3045"}, {"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false), new String[][]{{"isBooleanValueType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567890123456", "<sample:0>", "<sample:1>", "<sample:1>"}}), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567890123456", "<sample:0>", "<sample:1>", "<sample:1>"}}), new String[][]{{"isBooleanObjectType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "2020-02-30T25:61:61", "<sample:1>", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567890123456", "<sample:0>", "<sample:1>", "<sample:1>"}}), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567890123456", "<sample:0>", "<sample:1>", "<sample:1>"}}), new String[][]{{"getPropertyType", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasCachedValues=false, hasDisplayNam...#386#668561052", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567890123456", "<sample:0>", "<sample:0>", "<sample:1>"}}), new String[][]{{"isBooleanObjectType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "true", "<sample:4>", "<sample:5>", "<sample:0>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"-1.5", "<sample:0>", "<sample:6>", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -1.5 {getInputName=<non-file>, getName=-1.5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "5."}}), new String[][]{{"getArgumentsVar", "", "4"}, {"isDefine", "", "3"}, {"getInputName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1e10", "<sample:1>", "<sample:1>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "getVars", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1e10 {getInputName=<non-file>, getName=1e10, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"\t"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "Scope.Var ", "<null>", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", ""}, {"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:9>"}}), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "1"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0x123456789", "<sample:6>", "<sample:4>", "<sample:2>", "false"}}), new String[][]{{"getTypeOfThis", "", "4"}, {"isNumber", "", "1"}, {"isTemplateType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0x123456789", "<sample:6>", "<sample:4>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "-1"}}), new String[][]{{"getTypeOfThis", "", "4"}, {"isNullable", "", "1"}, {"isStringValueType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "Title"}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "true", "<sample:3>", "<sample:3>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>", "<sample:4>"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<null>", "<sample:4>"}}), new String[][]{{"retainAll", "java.util.Collection", "1"}, {"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"abc"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "LOCALS_ONLY", "<null>", "<sample:0>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "LOCALS_ONLY", "<null>", "<sample:0>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "Scope.Var "}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0xFFFFFFFF", "<sample:7>", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "Scpe.Var "}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "Scpe.Var "}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567", "<sample:5>", "<sample:6>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.1234567", "<sample:5>", "<sample:6>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false), new String[][]{{"getVars", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "i", "<sample:9>", "<sample:6>", "<null>", "false"}}), new String[][]{{"isUnscopedQualifiedName", "", "4"}, {"appendStringTree", "java.lang.Appendable", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.25", "<sample:1>", "<sample:0>", "<null>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.25 {getInputName=<non-file>, getName=1.25, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false), new String[][]{{"isDeclared", "java.lang.String,boolean", "3"}, {"isLocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "Scope.Var ", "<sample:0>", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"arguments"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "/a/b", "<null>", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"true", "<sample:7>", "<sample:7>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var true {getInputName=, getName=true, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"Title", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".5", "<sample:2>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}, 1), new String[][]{{"getNameNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}, {"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1.22345678"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "true", "<sample:7>", "<sample:7>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFEQ {getCharno=-1, getChildCount=4, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=6, hasChildr...#377#-320517556", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2), new String[][]{{"detachFromParent", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "null", "<sample:0>", "<sample:0>", "<sample:7>", "true"}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoResolvedType", actual.getClass().getName());
  assertEquals("NoResolvedType {canBeCalled=true, getDisplayName=null, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647...#406#917077782", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1), new String[][]{{"getPropertyNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1), new String[][]{{"isArrayType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1), new String[][]{{"isNumber", "", "1"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"/a/b", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.5d", "<sample:5>", "<null>", "<null>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"/a/b", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.5d", "<sample:5>", "<null>", "<null>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"/Y/b", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"1.123458677", "false"}, false, 11, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.5d", "<sample:6>", "<sample:5>", "<null>", "true"}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}, {"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<sample:7>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \t {getInputName=<a><b>t</b></a>, getName=\t, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<sample:7>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 3), new String[][]{{"isNoShadow", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}}), new String[][]{{"getArgumentsVar", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0x123456789", "<sample:10>", "<null>", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=64, has...#384#2136680243", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0x123456789", "<sample:10>", "<null>", "<sample:3>", "false"}}, 2), new String[][]{{"isEquivalentToTyped", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0x123456789", "<sample:10>", "<null>", "<sample:3>", "false"}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 2), new String[][]{{"isEquivalentToTyped", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0x123456789", "<sample:4>", "<null>", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "-1"}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFEQ {getCharno=-1, getChildCount=4, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=6, hasChildr...#377#-320517556", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2), new String[][]{{"getRootNode", "", "7"}, {"getExistingIntProp", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFNE 10 {getCharno=11, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=10, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=7, hasChi...#380#113227369", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=9, hasChild...#379#-419650732", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=5, getDouble=!UnsupportedOperationException, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=9, hasCh...#382#-69853392", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 15, new String[][]{}, 1), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "3"}, {"isUnscopedQualifiedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 1), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "3"}, {"addChildToFront", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 1), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "3"}, {"addChildToFront", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFNE 10 {getCharno=11, getChildCount=4, getDouble=!UnsupportedOperationException, getLineno=10, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=7, hasChi...#380#-115562582", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "abc", "<null>", "<sample:5>", "<null>", "true"}}, 1), new String[][]{{"detachFromParent", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "/a/b"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"+1", "<sample:3>", "<sample:3>", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var +1 {getInputName=<a><b>t</b></a>, getName=+1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:9>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"LOCALS_ONLY"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "1.5d", "false"}, {"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}), new String[][]{{"isConst", "", "7"}, {"isBleedingFunction", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "abc", "<sample:4>", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "I", "<sample:6>", "<sample:1>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}}), new String[][]{{"getArgumentsVar", "", "3"}, {"getInitialValue", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "i", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#207#-512843101", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"getTypeOfThis", "", "2"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\u00e9", "<sample:3>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "i", "<sample:7>", "<sample:5>", "<sample:2>"}}), new String[][]{{"getJSDocInfo", "", "2"}, {"isTypeInferred", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\u00e9", "<sample:3>", "<sample:6>", "<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "i", "<sample:7>", "<sample:5>", "<sample:4>"}}), new String[][]{{"getJSDocInfo", "", "2"}, {"isTypeInferred", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getReferenceName=Boolean, hasDisplayName=true, hasReferenceName=true, isAllType=false, isArrayTy...#390#34392931", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:sample, *, *, *): sample {canBeCalled=true, getDisplayName=sample, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getTemplate...#416#-1540966505", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2), new String[][]{{"getParameters", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "arguments", "<sample:2>", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
