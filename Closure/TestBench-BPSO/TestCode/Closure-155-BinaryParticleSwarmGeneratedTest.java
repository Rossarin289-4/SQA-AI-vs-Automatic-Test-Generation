package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:8>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:8>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1L", "<sample:7>", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "0123456789", "false"}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "W1E-5"}}), new String[][]{{"isTypeInferred", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"", "<sample:1>", "<sample:7>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "Tisle12:30:55"}}), new String[][]{{"getInitialValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:9>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"<nom-file>", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"<null>", "<sample:2>", "<sample:6>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}}), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"getNameNode", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"P--1", "<sample:2>", "<sample:4>", "<sample:8>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var P--1 {getInputName=, getName=P--1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"-0.0", "<sample:10>", "<sample:3>", "<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}), new String[][]{{"getType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "12:30:55", "<sample:2>", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#207#-512843101", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"x\n", "<sample:3>", "<sample:2>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0xFFFFFFFF", "<sample:7>", "<sample:6>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 2), new String[][]{{"getJSDocInfo", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"CONSTANTS_ONLY1.12345678901234567aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 2), new String[][]{{"remove", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:3>", "<sample:7>"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:7>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "+1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:9>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:7>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"abc<a>b</a>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "[1,2]", "<null>", "<sample:1>", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>", "<sample:0>"}}, 1), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"0x123456789a b"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{".-1", "<sample:1>", "<sample:3>", "<sample:3>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "2147483648"}, {"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var .-1 {getInputName=, getName=.-1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"0y0F", "<sample:10>", "<sample:0>", "<sample:1>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "1.5dOp"}}, 2), new String[][]{{"getInputName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "1.1<2347678"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "1WL"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1E-B"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:5>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "0L", "<sample:7>", "<sample:3>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 3), new String[][]{{"getInputName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"0123456789"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"retainAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}, 1), new String[][]{{"isGlobal", "", "0"}, {"isLocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFEQ {getCharno=-1, getChildCount=4, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=6, hasChildr...#377#-320517556", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "12:30:55", "<sample:2>", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "3"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:4>", "<sample:7>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"a", "<sample:11>", "<sample:0>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var a {getInputName=, getName=a, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoResolvedType", actual.getClass().getName());
  assertEquals("NoResolvedType {canBeCalled=true, getDisplayName=null, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647...#406#917077782", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"--1", "<sample:3>", "<sample:6>", "<sample:12>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "1.5W30_0"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var --1 {getInputName=, getName=--1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", ",01E-5''"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"2e10"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:9>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"-1.5\t"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "1e10i"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"TCitke", "<sample:1>", "<sample:2>", "<sample:9>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<mon-file>", "<sample:5>", "<sample:2>", "<sample:1>", "false"}}, 1), new String[][]{{"isDefine", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"123456789012345678900234567890", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "aa/a/b", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"12:30:55-0.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.12345678901234467i", "<sample:0>", "<sample:5>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"a1.5e300"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "-0.0", "<sample:0>", "<sample:2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"CONSTANTS_ONLY1.12345678901234567aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:7>", "<sample:0>", "<sample:8>", "false"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var CONSTANTS_ONLY1.12345678901234567aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa {getInputName=, getName=CONSTANTS_ONLY1.12345678901234567aaaaaaaaaaaaaaaaaaaaaaaaaaa.., isBleedingFunction=!NullPointerExcepti...#304#-2075328026", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"f", "<sample:2>", "<sample:3>", "<sample:0>", "true"}, false, 5, new String[][]{}), new String[][]{{"getInputName", "", "7"}, {"isDefine", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"12:30:55"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1Lnull"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "12345678901234567890123456789V0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"I/a/b"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:2>", "<sample:4>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"null[1,2]", "<sample:2>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null[1,2] {getInputName=, getName=null[1,2], isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:8>", "<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "1.l2345668", "true"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "E", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#207#-512843101", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "5.g", "<sample:4>", "<sample:0>", "<null>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa b", "<sample:3>", "<sample:4>", "<sample:0>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"-5"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "1.m12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"12:30:4\r"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\na b", "<sample:2>", "<sample:3>", "<sample:2>", "false"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \na b {getInputName=, getName=\na b, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "12:30:56"}, {"com.google.javascript.jscomp.Scope", "getVars", ""}}), new String[][]{{"isTemplateType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"2020-0230T25:61:61", "<sample:0>", "<sample:5>", "<sample:1>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 2020-0230T25:61:61 {getInputName=, getName=2020-0230T25:61:61, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isType...#214#946265322", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"\n.5"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.5f1.5e300", "<sample:10>", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "CONSTANTS_ONLY1.12345678901234567aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1.12345678"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.5f1.5e300 {getInputName=, getName=1.5f1.5e300, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.5e300LOCALS_ONLY2147483648", "<sample:4>", "<sample:6>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.5e300LOCALS_ONLY2147483648 {getInputName=, getName=1.5e300LOCALS_ONLY2147483648, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNo...#234#1973910790", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoResolvedType", actual.getClass().getName());
  assertEquals("NoResolvedType {canBeCalled=true, getDisplayName=null, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647...#406#917077782", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "1234567890123456789012345678901.1234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1E-abc", "<null>", "<sample:2>", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"''1E-5"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1eg0\n", "<sample:5>", "<sample:2>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", ".+5", "<sample:8>", "<sample:2>", "<sample:6>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.12345678901234561E-5", "<sample:9>", "<sample:0>", "<sample:1>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"0x123456789", "<sample:2>", "<sample:5>", "<sample:1>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"getName", "", "6"}, {"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0x123456789", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"-01E-5", "true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"ALL"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.1234567Title", "<sample:9>", "<sample:4>", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"123456789011345668901234567890", "<sample:6>", "<sample:4>", "<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 123456789011345668901234567890 {getInputName=0, getName=123456789011345668901234567890, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false,...#239#495432408", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1EO5", "<sample:8>", "<sample:3>", "<sample:7>", "true"}, false, 4, new String[][]{}), new String[][]{{"isBleedingFunction", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"W1E-5", "<sample:5>", "<sample:7>", "<sample:7>", "false"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var W1E-5 {getInputName=<a><b>t</b></a>, getName=W1E-5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=fa...#204#-1405231951", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.5", "<sample:8>", "<sample:5>", "<sample:5>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "010", "<sample:5>", "<sample:0>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.5 {getInputName=<a><b>t</b></a>, getName=1.5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"10", "<sample:3>", "<null>", "<sample:1>", "true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 10 {getInputName=, getName=10, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.12345678901234557", "<sample:1>", "<sample:8>", "<sample:4>", "false"}}), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "-15", "<sample:3>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"hasReferenceName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "=a>b</a>abc", "<sample:10>", "<sample:7>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.25", "<sample:3>", "<sample:2>", "<sample:4>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"truee"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"000", "<sample:4>", "<sample:8>", "<null>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 000 {getInputName=<non-file>, getName=000, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1e10Scope.Var ", "<sample:2>", "<null>", "<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1e10Scope.Var  {getInputName=, getName=1e10Scope.Var , isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#206#-829321402", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}), new String[][]{{"getInputName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "1E-5abc"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "aaaaaaaaaaaaaaaapaaaaaaaaaaaaa", "<sample:5>", "<sample:5>", "<sample:5>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#207#-512843101", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{" -1", "<sample:4>", "<sample:6>", "<sample:3>", "false"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var  -1 {getInputName=, getName= -1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "-01E-5aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,b,c"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"W1E-5", "<sample:2>", "<sample:6>", "<sample:5>", "true"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var W1E-5 {getInputName=<a><b>t</b></a>, getName=W1E-5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=tr...#203#-1140264744", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1e1/"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "2020,0-30T25:61:61", "<sample:7>", "<sample:7>", "<sample:0>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"610", "<sample:5>", "<sample:6>", "<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 610 {getInputName=0, getName=610, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#207#-512843101", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "varDxxi=;", "<sample:7>", "<sample:2>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "''1.5e300", "<sample:0>", "<sample:4>", "<sample:6>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"+05.", "<sample:7>", "<sample:5>", "<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var +05. {getInputName=, getName=+05., isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}}, 2), new String[][]{{"isConst", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1E-51-1234567", "<sample:5>", "<sample:2>", "<sample:8>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoResolvedType", actual.getClass().getName());
  assertEquals("NoResolvedType {canBeCalled=true, getDisplayName=null, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647...#406#917077782", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"Hello, World\t"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1e200", "<sample:2>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "--i"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1e200 {getInputName=, getName=1e200, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isNoObjectType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"isGlobal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"", "<sample:5>", "<sample:5>", "<null>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"hasNext", "", "2"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}), new String[][]{{"hasNext", "", "2"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "<non-f\u00e9ile>\t", "<null>", "<sample:0>", "<sample:14>", "false"}}, 3), new String[][]{{"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3), new String[][]{{"getParent", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"null[1,2]", "<sample:4>", "<sample:2>", "<sample:8>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "i"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null[1,2] {getInputName=, getName=null[1,2], isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"1.12345678901234567P", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1Lnull0"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{".51.1234567", "<sample:11>", "<sample:5>", "<null>", "false"}, false, 6, new String[][]{}, 3), new String[][]{{"getInputName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"1e104", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "CONSTANTS_ONLY1.12345678901234567aaaaaaYaaaaaaaaaaaaaaaaaaaaaaaa", "<null>", "<sample:6>", "<sample:3>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 3), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "12345678901134W5678901234567890", "<sample:9>", "<sample:4>", "<sample:8>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"t", "<sample:7>", "<sample:8>", "<sample:8>", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var t {getInputName=, getName=t, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}), new String[][]{{"addSuppression", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#406#-1713970347", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getArgumentsVar", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"12:30:45/a/b", "<sample:0>", "<sample:8>", "<sample:2>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 12:30:45/a/b {getInputName=, getName=12:30:45/a/b, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=tru...#202#-814835062", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getVar", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\n", "<sample:6>", "<sample:3>", "<sample:3>", "true"}, false, 6, new String[][]{}, 2), new String[][]{{"isTypeInferred", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"\u00e8", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "-0.0\010", "<sample:8>", "<sample:3>", "<sample:2>"}}), new String[][]{{"isTypeInferred", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1;30:45"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.5darguments", "<sample:1>", "<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.5darguments {getInputName=, getName=1.5darguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=t...#204#-1187563400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", ".010", "<sample:4>", "<sample:1>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"110", "<sample:8>", "<null>", "<sample:5>", "false"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 110 {getInputName=<a><b>t</b></a>, getName=110, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"m", "<sample:4>", "<sample:4>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "0.12345678901234566"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var m {getInputName=0, getName=m, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.5ec", "<sample:6>", "<sample:7>", "<sample:4>", "false"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.5ec {getInputName=0, getName=1.5ec, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1e10.E5", "<sample:9>", "<sample:4>", "<sample:4>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"hasChildren", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:11>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:10>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"D2147483648", "<sample:2>", "<sample:1>", "<sample:7>", "true"}, false, 0, null, 3), new String[][]{{"isGlobal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "'='I", "<sample:2>", "<sample:2>", "<sample:2>"}}, 3), new String[][]{{"isGlobal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 3), new String[][]{{"getFirstChild", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false), new String[][]{{"getQualifiedName", "", "7"}, {"hasMoreThanOneChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"12345", "<sample:7>", "<sample:2>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "AL"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 12345 {getInputName=, getName=12345, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "brDguments", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "+W1E-5a,b,c", "<sample:1>", "<sample:7>", "<sample:6>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "CONSTANTS_ONLY1.12345678901234567aaaaaa<aaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>", "<sample:9>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "-1.5"}}), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("{...} {getDisplayName={...}.prototype, getNormalizedReferenceName={...}.prototype, getPossibleToBooleanOutcomes=TRUE, getReferenceName={...}.prototype, hasDisplayName=true, hasReferenceName=false, isA...#414#726341579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "\ni", "<sample:9>", "<sample:6>", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getVarCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"x ", "<sample:5>", "<sample:1>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 1), new String[][]{{"getJSDocInfo", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}), new String[][]{{"isLocal", "", "5"}, {"getArgumentsVar", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-1367757921", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "W0E,5"}}, 2), new String[][]{{"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:3>", "<sample:4>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"010-1.5", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "0x1Faaaaaaaaaaaaaa\taaaaaaaaaaaaaaa", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"SIITLE"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"-1", "<sample:7>", "<sample:1>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -1 {getInputName=, getName=-1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"010arguments", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "Hellq, World"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "", "<sample:5>", "<sample:0>", "<sample:4>", "false"}}, 3), new String[][]{{"getParent", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}), new String[][]{{"hasDisplayName", "", "2"}, {"getDisplayName", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"isSyntheticBlock", "", "3"}, {"getProp", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"TISNE"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 3), new String[][]{{"getParentScope", "", "7"}, {"isLocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.25Scope.Var ", "<sample:2>", "<sample:3>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "2020-01.01", "<sample:4>", "<sample:4>", "<sample:8>", "false"}}), new String[][]{{"isConst", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"null", "<sample:7>", "<sample:3>", "<sample:0>", "true"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null {getInputName=, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 3), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}, 3), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"Lnull", "<sample:2>", "<sample:6>", "<sample:8>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var Lnull {getInputName=, getName=Lnull, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "+F", "<sample:3>", "<sample:0>", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.O2", "<sample:1>", "<sample:5>", "<sample:7>", "false"}}, 2), new String[][]{{"isNoObjectType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"nvll", "<sample:6>", "<sample:0>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "<non-f2lee>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var nvll {getInputName=, getName=nvll, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "LOCALNS_ONLA", "<sample:8>", "<sample:5>", "<null>", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferenceCollection", "com.google.javascript.jscomp.Scope$Var", "<sample:7>"}}, 3), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.123:45678901234567LOCALS_ONLY", "<sample:6>", "<sample:3>", "<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.123:45678901234567LOCALS_ONLY {getInputName=, getName=1.123:45678901234567LOCALS_ONLY, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false...#240#-996368286", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.5", "<sample:7>", "<sample:0>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2), new String[][]{{"getParentNode", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "1.1234567"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "PT1H", "<sample:3>", "<null>", "<sample:8>", "true"}}), new String[][]{{"isGlobal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "getReferencedVariables", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ReferenceCollectingCallback", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>", "<sample:7>"}}, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ReferenceCollectingCallback", "com.google.javascript.jscomp.ReferenceCollectingCallback", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>", "<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=39, hasChildren=false...#372#-162157149", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=1, hasChildre...#377#-2070279061", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}), new String[][]{{"isGlobal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getVars", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"1x1F"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "-1.1234567890123456a b", "<sample:6>", "<sample:1>", "<sample:5>"}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.InlineVariables", "com.google.javascript.jscomp.InlineVariables", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.InlineVariables", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 2), new String[][]{{"getVarCount", "", "3"}, {"isLocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"2020-01-/1", "<sample:7>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 2020-01-/1 {getInputName=, getName=2020-01-/1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1), new String[][]{{"getJsDocBuilderForNode", "", "4"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}), new String[][]{{"isDeclared", "java.lang.String,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"FE-5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "LOCALS_ONLY", "<sample:6>", "<sample:6>", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
