package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}, {"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"{", "<sample:1>", "<sample:2>", "<sample:7>", "true"}, false), new String[][]{{"getJSDocInfo", "", "5"}, {"getJSDocInfo", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"getInitialValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"a,b,d", "<sample:7>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "010"}}), new String[][]{{"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *, *, *): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, g...#410#942626312", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"getNameNode", "", "0"}, {"getSymbol", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1", "<sample:4>", "<sample:3>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1{sample.<boolean>} {getInputName=sample, getName=1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=t...#204#-1344751932", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"+", "<sample:8>", "<sample:1>", "<sample:6>", "true"}, false), new String[][]{{"getNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"<null>", "<sample:8>", "<sample:4>", "<null>", "false"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:8>", "<sample:2>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}), new String[][]{{"getSourceFile", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false), new String[][]{{"contains", "java.lang.Object", "5"}, {"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 3), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "123456789012345678901234567890}"}}), new String[][]{{"indexOf", "java.lang.Object", "6"}, {"get", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getDeclaration", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "2", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "\u00e9", "true"}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}), new String[][]{{"isLocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"", "<sample:4>", "<sample:7>", "<sample:9>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", ".5--1", "<sample:0>", "<null>", "<sample:2>", "false"}}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", " bb", "<sample:10>", "<sample:7>", "<sample:2>", "false"}}), new String[][]{{"getArgumentsVar", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"21447483647"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "21477483648", "<sample:3>", "<sample:4>", "<sample:1>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 2), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "2020-01-01010"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "t5ve"}, {"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}, 2), new String[][]{{"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"isQualifiedName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getInitialValue", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"a,b,", "<sample:0>", "<sample:4>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var a,b,{*} {getInputName=a, getName=a,b,, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1E-4", "<null>", "<sample:6>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}, 2), new String[][]{{"isDefine", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"/5", "<sample:7>", "<sample:3>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "--1", "<sample:5>", "<sample:9>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var /5{sample.<boolean>} {getInputName=sample, getName=/5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred...#207#1727789913", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"abc", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1.5"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3), new String[][]{{"getVarCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 1), new String[][]{{"getParentNode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"getJSDocInfo", "", "6"}, {"getJSDocInfo", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"abc/", "<sample:0>", "<sample:5>", "<sample:1>", "false"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var abc/{function (new:0, *, *, *): 0} {getInputName=sample, getName=abc/, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false...#223#-1091320788", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"0xF0x1F", "<sample:2>", "<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 2), new String[][]{{"isLocal", "", "2"}, {"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0xF0x1F", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.25", "<sample:0>", "<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 3), new String[][]{{"getInputName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"isConst", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 2), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "2147482648"}}, 2), new String[][]{{"getChildCount", "", "5"}, {"isNoSideEffectsCall", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", " \0371L"}}, 1), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"214743647", "<sample:1>", "<sample:6>", "<sample:7>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 2), new String[][]{{"getJSDocInfo", "", "0"}, {"getSymbol", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 214743647{*} {getInputName=0, getName=214743647, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "argtment", "false"}}, 1), new String[][]{{"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isDeclared", "java.lang.String,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}, {"com.google.javascript.jscomp.Scope", "isBottom", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", " b", "<sample:6>", "<sample:5>", "<sample:9>"}}, 2), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"+1a123456789012345678901234567890", "<sample:8>", "<sample:1>", "<sample:1>", "false"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"", "true"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"PT1H", "<sample:2>", "<sample:1>", "<sample:7>", "false"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"+", "<sample:3>", "<sample:3>", "<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "<a\tb"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var +{sample.<boolean>} {getInputName=a, getName=+, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"3-1.5", "<sample:4>", "<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 3-1.5{boolean} {getInputName=<non-file>, getName=3-1.5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferre...#207#367349308", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"21474836498"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"aaaaaaaaaaaaaaaa`aaaaaaaaaaaa", "<sample:2>", "<sample:4>", "<sample:1>", "true"}, false, 4, new String[][]{}, 2), new String[][]{{"isGlobal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getVar", "java.lang.String", "5"}, {"getParentScope", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"htsp://example.com/a?b=cgoog.scope", "<sample:6>", "<sample:2>", "<sample:2>", "false"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var htsp://example.com/a?b=cgoog.scope{boolean} {getInputName=a, getName=htsp://example.com/a?b=cgoog.scope, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=tru...#257#-810021270", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"2020-1-01", "<sample:3>", "<sample:7>", "<sample:7>", "true"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 2020-1-01{function (new:0, *, *, *): 0} {getInputName=0, getName=2020-1-01, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=...#227#-481814891", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"size", "", "0"}, {"retainAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"/aDb", "<sample:6>", "<sample:2>", "<sample:1>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var /aDb{boolean} {getInputName=sample, getName=/aDb, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true...#201#1088388166", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1K5.", "<sample:6>", "<null>", "<sample:4>", "true"}, false, 6, new String[][]{}, 3), new String[][]{{"getSymbol", "", "3"}, {"getNode", "", "5"}, {"addChildToFront", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=1, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#354#1402117547", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "0c0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"<a>b</a>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", " 1L"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"0", "<sample:7>", "<sample:4>", "<sample:3>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 0{*} {getInputName=0, getName=0, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "", "<sample:7>", "<sample:6>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.25[1,2]", "<null>", "<null>", "<sample:2>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.25[1,2]{null} {getInputName=a, getName=1.25[1,2], isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=tr...#203#-987026916", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:3>", "<sample:2>", "<sample:5>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var aaaaaaaaaaaaaaaaaaaaaaaaaaaaa{boolean} {getInputName=sample, getName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, is...#251#-1348216828", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "1.25", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "\n", "<sample:6>", "<sample:3>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"i", "<sample:3>", "<sample:0>", "<sample:4>"}, false), new String[][]{{"isNoShadow", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}, {"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "\013"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"e2020-01-01"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "5"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false), new String[][]{{"getIndexOfChild", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "-0.0", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}), new String[][]{{"iterator", "", "0"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:9>", "<sample:1>", "<sample:7>"}, false), new String[][]{{"isBleedingFunction", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}), new String[][]{{"iterator", "", "3"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1", "<sample:7>", "<sample:3>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "Scope.Va: "}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1{sample.<boolean>} {getInputName=0, getName=1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:8>"}}), new String[][]{{"isDefine", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"nullT", "<sample:1>", "<sample:7>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var nullT{function (new:0, *, *, *): 0} {getInputName=sample, getName=nullT, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=fal...#224#-1594736645", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\013", "<null>", "<sample:3>", "<sample:4>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}), new String[][]{{"getNameNode", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"Sco_pe.Var ", "<sample:3>", "<sample:1>", "<sample:2>", "true"}, false), new String[][]{{"isLocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.12345678901234567", "<sample:4>", "<sample:3>", "<sample:2>", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[Scope.Var 1.12345678901234567{sample.<boolean>}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"null", "<sample:7>", "<sample:1>", "<sample:3>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"-2", "<sample:0>", "<sample:1>", "<sample:2>", "true"}, false), new String[][]{{"isBleedingFunction", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}), new String[][]{{"getVar", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getParentNode", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.51e1", "<sample:2>", "<sample:7>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.51e1{function (new:0, *, *, *): 0} {getInputName=sample, getName=1.51e1, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=f...#227#-381028628", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false), new String[][]{{"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false), new String[][]{{"getStaticSourceFile", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", ";L", "<sample:5>", "<sample:7>", "<sample:4>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"-0.0", "<sample:2>", "<sample:0>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -0.0{*} {getInputName=sample, getName=-0.0, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"123456789012335678901234567890", "<sample:2>", "<sample:0>", "<sample:3>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 123456789012335678901234567890{*} {getInputName=0, getName=123456789012335678901234567890, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=tr...#242#320038382", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"-1.4", "<sample:4>", "<sample:6>", "<sample:7>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -1.4{*} {getInputName=0, getName=-1.4, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "goog.sc\"ope", "<sample:1>", "<sample:5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"tsue", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "0xE123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"getVarCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".5", "<sample:6>", "<sample:8>", "<sample:0>"}, false), new String[][]{{"getJSDocInfo", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "<a>b\t/a>", "false"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false), new String[][]{{"add", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"2020--01-01", "<sample:5>", "<sample:6>", "<sample:0>"}, false), new String[][]{{"getNameNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147...#366#-1984407823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"Tjtle", "<sample:1>", "<sample:8>", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var Tjtle{*} {getInputName=a, getName=Tjtle, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "4"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"dereference", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"2147483648aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:5>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 2147483648aaaaaaaaaaaaaaaaaaaaaaaaaaaaa{function (new:0, *, *, *): 0} {getInputName=a, getName=2147483648aaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isBleedingFunction=!NullPointerException, isConst=fals...#287#981328258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}), new String[][]{{"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isGlobal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"Titlee"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "7null", "<sample:2>", "<sample:7>", "<sample:5>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"0c0i", "true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}, {"com.google.javascript.jscomp.Scope", "getVars", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147...#366#-1984407823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}}), new String[][]{{"peek", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}), new String[][]{{"isDeclared", "java.lang.String,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "<a>b</a>", "<sample:5>", "<sample:6>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"3 1L", "<sample:3>", "<sample:1>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "/", "<sample:7>", "<sample:9>", "<sample:1>", "false"}}), new String[][]{{"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3 1L", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var null{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "isBottom", ""}}), new String[][]{{"getArgumentsVar", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"2.5e300"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "5.", "false"}}), new String[][]{{"getAncestor", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1null", "<sample:6>", "<sample:6>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFEQ {getCharno=-1, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=214748364...#361#-234116381", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false), new String[][]{{"getAllSymbols", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"0c0", "<sample:7>", "<sample:6>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "aubc", "<sample:3>", "<sample:10>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 0c0{*} {getInputName=a, getName=0c0, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "1e10true"}}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}), new String[][]{{"getInputName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "0"}, {"iterator", "", "5"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"0xFFF4FFFFF1E-5", "<sample:5>", "<sample:7>", "<sample:6>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1Ka", "<sample:8>", "<sample:10>", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 0xFFF4FFFFF1E-5{function (new:0, *, *, *): 0} {getInputName=a, getName=0xFFF4FFFFF1E-5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false,...#240#916527171", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "", "true"}}), new String[][]{{"isLocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}}), new String[][]{{"getRootNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "\n\n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFEQ {getCharno=-1, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=214748364...#361#-234116381", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}}), new String[][]{{"getArgumentsVar", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:7>", "<sample:4>", "<sample:8>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "true", "<null>", "<sample:4>", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var aaaaaaaaaaaaaaaaaaaaaaaaaaaaa{*} {getInputName=a, getName=aaaaaaaaaaaaaaaaaaaaaaaaaaaaa, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true...#241#-1847404714", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"Hello, World", "<null>", "<sample:8>", "<sample:3>", "false"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var Hello, World{*} {getInputName=0, getName=Hello, World, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred...#207#-2023458281", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "13456789012345678901235567890}", "<sample:3>", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "null", "<sample:6>", "<sample:2>", "<sample:9>"}}, 2), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "ab}", "<sample:1>", "<sample:6>", "<sample:0>", "false"}}), new String[][]{{"getParentScope", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"[", "<sample:4>", "<sample:5>", "<sample:8>"}, false, 0, null, 2), new String[][]{{"getParentNode", "", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:8>"}, false, 3, new String[][]{}), new String[][]{{"getReferences", "com.google.javascript.jscomp.Scope$Var", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "123456789012345678901234567880}", "<sample:1>", "<null>", "<sample:2>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.1234567890123456", "<sample:6>", "<sample:2>", "<sample:6>", "false"}, false, 0, null, 1), new String[][]{{"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=fals...#378#68352783", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "{<a>b</a>", "<null>", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"getSymbol", "", "6"}, {"getNode", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.12345678901234567", "<sample:5>", "<sample:1>", "<sample:13>"}, false, 4, new String[][]{}, 3), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", " ", "true"}}, 2), new String[][]{{"getVarCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getVars", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"-1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"cloneTree", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "nulel", "<sample:6>", "<sample:8>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\010", "<sample:7>", "<sample:3>", "<sample:9>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \010{sample.<boolean>} {getInputName=0, getName=\010, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "i12:30:35", "<sample:2>", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.12345678901234567--1", "<sample:5>", "<sample:8>", "<sample:6>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2), new String[][]{{"getArgumentsVar", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"iterator", "", "2"}, {"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"isConst", "", "7"}, {"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false), new String[][]{{"getReferences", "com.google.javascript.jscomp.Scope$Var", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:10>"}}, 2), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "Hello, Wormd", "<sample:8>", "<sample:6>", "<sample:2>", "false"}}), new String[][]{{"getInputName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "a", "<sample:0>", "<sample:1>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "1e10"}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaTitle"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "-1", "<sample:4>", "<sample:5>", "<sample:4>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 1), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"Scope.V,r ", "<sample:6>", "<sample:4>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "Pul", "<sample:6>", "<sample:2>", "<sample:5>"}}), new String[][]{{"isNoShadow", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false), new String[][]{{"isDeclared", "java.lang.String,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147...#366#-1984407823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}), new String[][]{{"getAllSymbols", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "Hello,World", "<sample:3>", "<sample:6>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1b.5"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", " bH", "<sample:0>", "<sample:2>", "<sample:1>", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\u00e9", "<sample:1>", "<sample:2>", "<sample:0>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \u00e9{boolean} {getInputName=a, getName=\u00e9, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}}), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getVarCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getInitialValue", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.5d", "<sample:3>", "<sample:5>", "<sample:7>", "true"}, false, 4, new String[][]{}, 1), new String[][]{{"getSourceFile", "", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"0x123,56789"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "3b", "<sample:10>", "<sample:2>", "<sample:0>"}}), new String[][]{{"getSymbol", "", "0"}, {"getInputName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<non-file>", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"hasCachedValues", "", "2"}, {"getOwnPropertyJSDocInfo", "java.lang.String", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "/a/b1.5d", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "trvd", "<sample:1>", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[Scope.Var trvd{function (new:0, *, *, *): 0}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}), new String[][]{{"getCtorExtendedInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"", "<sample:9>", "<sample:0>", "<sample:7>", "true"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", " }b", "<sample:8>", "<sample:1>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1.", "<sample:2>", "<sample:3>", "<sample:0>"}, false, 3, new String[][]{}, 1), new String[][]{{"getType", "", "0"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "a b", "<sample:4>", "<sample:0>", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "<non-fime>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1-/a/b", "<sample:9>", "<sample:2>", "<sample:3>", "true"}, false, 0, null, 2), new String[][]{{"getDeclaration", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1-/a/b{boolean} {getInputName=0, getName=1-/a/b, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"http://e3ample.com0a?b=c", "<sample:9>", "<sample:5>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "<non-file>5."}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var http://e3ample.com0a?b=c{function (new:0, *, *, *): 0} {getInputName=<non-file>, getName=http://e3ample.com0a?b=c, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, is...#266#-884071039", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}), new String[][]{{"getAllSymbols", "", "2"}, {"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"a b", "<sample:9>", "<sample:1>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "5"}}, 3), new String[][]{{"getNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFNE 10 {getCharno=11, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=10, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-21474...#368#746326534", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"-2", "<sample:8>", "<sample:6>", "<sample:1>", "true"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var -2{*} {getInputName=sample, getName=-2, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "arg uments", "<sample:2>", "<sample:4>", "<sample:7>"}}, 1), new String[][]{{"getNode", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"iterator", "", "3"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}, {"com.google.javascript.jscomp.Scope", "isGlobal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false), new String[][]{{"isAllType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.5e300", "<sample:6>", "<sample:3>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\n", "<sample:1>", "<sample:5>", "<sample:9>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:6>"}}, 1), new String[][]{{"isTypeInferred", "", "2"}, {"getSourceFile", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 2), new String[][]{{"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"o", "<sample:2>", "<sample:6>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "--1"}}, 2), new String[][]{{"isGlobal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
