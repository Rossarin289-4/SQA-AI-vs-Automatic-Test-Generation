package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<sample:3>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}}), new String[][]{{"getNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<sample:3>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}}), new String[][]{{"getSymbol", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \t{sample.<boolean>} {getInputName=sample, getName=\t, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=t...#204#454680464", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<null>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "a"}}), new String[][]{{"getInitialValue", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"F", "<sample:1>", "<sample:0>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}), new String[][]{{"getSourceFile", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"", "<sample:4>", "<sample:1>", "<sample:3>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"null", "<sample:6>", "<sample:2>", "<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "1.1234567890123456"}, {"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", ""}}), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{boolean} {getInputName=a, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}), new String[][]{{"getPropertiesCount", "", "7"}, {"getPropertyNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getName", "", "7"}, {"getType", "", "1"}, {"getDeclaration", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 19, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "0x123456789", "false"}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"getJSDocInfo", "", "4"}, {"getType", "", "7"}, {"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"123456789012345678901234567890", "<sample:4>", "<null>", "<sample:2>", "false"}, false), new String[][]{{"getDeclaration", "", "4"}, {"getNameNode", "", "4"}, {"getLineno", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}), new String[][]{{"isEmpty", "", "3"}, {"containsAll", "java.util.Collection", "0"}, {"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"<null>", "<sample:7>", "<sample:6>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x123456789", "<sample:4>", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "I", "<sample:4>", "<sample:5>", "<sample:7>"}}, 2), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "5"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "null"}}), new String[][]{{"getOwnSlot", "java.lang.String", "4"}, {"getArgumentsVar", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"F", "<sample:1>", "<sample:0>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2), new String[][]{{"getSourceFile", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"F", "<sample:0>", "<sample:0>", "<null>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var F{*} {getInputName=<non-file>, getName=F, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"F", "<sample:0>", "<sample:0>", "<null>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getVars", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var F{*} {getInputName=<non-file>, getName=F, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"F", "<sample:0>", "<sample:1>", "<null>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getVars", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"E", "<sample:1>", "<sample:0>", "<sample:7>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getVars", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var E{*} {getInputName=0, getName=E, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"E", "<sample:1>", "<sample:0>", "<sample:7>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getVars", ""}}, 2), new String[][]{{"isBleedingFunction", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"E", "<sample:1>", "<sample:0>", "<sample:7>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getVars", ""}}, 2), new String[][]{{"isBleedingFunction", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"+", "<sample:6>", "<sample:7>", "<sample:1>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}, 1), new String[][]{{"isBleedingFunction", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"7}", "<sample:3>", "<sample:7>", "<sample:3>", "false"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 7}{function (new:0, *, *, *): 0} {getInputName=0, getName=7}, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeI...#214#1136206364", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"31464}3647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "http://example.com/a?b=c", "<sample:4>", "<sample:2>", "<sample:2>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "http://example.com/a?b=c", "<sample:4>", "<sample:2>", "<sample:2>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var null{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"{null", "<sample:6>", "<sample:7>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var {null{function (new:0, *, *, *): 0} {getInputName=0, getName={null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, i...#220#1082765080", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"|null", "<sample:6>", "<sample:7>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var |null{function (new:0, *, *, *): 0} {getInputName=0, getName=|null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, i...#220#238685880", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"|null", "<sample:6>", "<sample:6>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0", "<sample:7>", "<sample:3>", "<sample:2>"}}, 1), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var |null{*} {getInputName=0, getName=|null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"|null", "<sample:1>", "<sample:6>", "<sample:7>", "false"}, false, 1, new String[][]{}, 1), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var |null{*} {getInputName=0, getName=|null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{" null", "<sample:0>", "<sample:6>", "<sample:7>", "false"}, false, 1, new String[][]{}, 1), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var  null{*} {getInputName=0, getName= null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}, 1), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ProxyObjectType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.TemplateType", actual.getClass().getName());
  assertEquals("0 {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObjec...#381#-1979227419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "1.5e300"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "1.5e300"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getName", "", "7"}, {"getType", "", "1"}, {"getDeclaration", "", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}, {"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}}, 1), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:3>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:4>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:0>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\n", "<sample:6>", "<sample:7>", "<sample:4>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}, 2), new String[][]{{"getName", "", "0"}, {"getNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.25", "<null>", "<sample:3>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.25{sample.<boolean>} {getInputName=sample, getName=1.25, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInfe...#210#-861603792", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:7>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:7>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>"}, {"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}, {"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"Scope.Var "}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:7>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"-1.5", "<sample:1>", "<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}, 2), new String[][]{{"isLocal", "", "4"}, {"isDefine", "", "0"}, {"isDefine", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}, 1), new String[][]{{"getDeclaration", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "goog.scope", "true"}, {"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "goog.scope", "true"}, {"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "goog.scope", "true"}, {"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}, 3), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "0x123456789", "false"}}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "Ax123456789", "false"}}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "Ax123456789", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}}, 3), new String[][]{{"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "[1,2]", "<sample:7>", "<sample:3>", "<sample:1>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "[1,2]", "<sample:7>", "<sample:3>", "<sample:1>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 3), new String[][]{{"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getAllSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isGlobal", "", "2"}, {"getSlot", "java.lang.String", "7"}, {"getAllSymbols", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<sample:3>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \t{sample.<boolean>} {getInputName=a, getName=\t, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<sample:3>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \t{*} {getInputName=sample, getName=\t, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"\t", "<null>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \t{*} {getInputName=sample, getName=\t, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\u00e9", "<null>", "<sample:5>", "<sample:7>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \u00e9{function (new:0, *, *, *): 0} {getInputName=0, getName=\u00e9, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInf...#212#456769528", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\u00e9", "<null>", "<sample:4>", "<sample:7>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \u00e9{*} {getInputName=0, getName=\u00e9, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\u00e9", "<null>", "<sample:5>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \u00e9{function (new:0, *, *, *): 0} {getInputName=<non-file>, getName=\u00e9, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, ...#221#-1828635510", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"\u00e9", "<sample:1>", "<sample:5>", "<null>", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var \u00e9{function (new:0, *, *, *): 0} {getInputName=<non-file>, getName=\u00e9, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, ...#220#-1458595485", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"F", "<sample:1>", "<sample:0>", "<null>", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var F{*} {getInputName=<non-file>, getName=F, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"F", "<sample:1>", "<sample:0>", "<null>", "false"}, false), new String[][]{{"isBleedingFunction", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{".5", "<sample:3>", "<sample:5>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var .5{function (new:0, *, *, *): 0} {getInputName=<non-file>, getName=.5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false...#223#1028595208", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"/", "<sample:3>", "<sample:5>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var /{function (new:0, *, *, *): 0} {getInputName=<non-file>, getName=/, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, ...#221#-1346569834", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"X", "<sample:3>", "<sample:5>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var X{function (new:0, *, *, *): 0} {getInputName=<non-file>, getName=X, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, ...#221#-598456408", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"}", "<sample:3>", "<sample:5>", "<null>", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var }{function (new:0, *, *, *): 0} {getInputName=<non-file>, getName=}, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, ...#221#390936242", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "Title", "<sample:3>", "<sample:6>", "<sample:3>", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}), new String[][]{{"remove", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "[1,2]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"2157483648"}, false, 14, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "\u00e9", "<sample:0>", "<sample:7>", "<null>", "false"}, {"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "\u00e9", "<sample:0>", "<sample:7>", "<null>", "false"}, {"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}, {"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "a,b,c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var null{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "http://example.com/a?b=c"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVar", "java.lang.String", "http://example.com/a?b=c"}}), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "http://example.com/a?b=c", "<sample:4>", "<sample:2>", "<null>", "false"}}), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "http://example.com/a?b=c", "<sample:4>", "<sample:2>", "<null>", "false"}}), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{" :ull", "<sample:4>", "<sample:8>", "<sample:7>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.12345678", "<sample:1>", "<sample:0>", "<sample:4>", "true"}}), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var  :ull{*} {getInputName=0, getName= :ull, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{" :ull", "<sample:4>", "<sample:8>", "<sample:7>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.12345678", "<sample:0>", "<sample:0>", "<sample:4>", "true"}}), new String[][]{{"getDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var  :ull{*} {getInputName=0, getName= :ull, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=2, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "<non-file>", "<sample:2>", "<null>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[Scope.Var <non-file>{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}), new String[][]{{"isBooleanObjectType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "false"}}), new String[][]{{"getSlot", "java.lang.String", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "false"}}), new String[][]{{"getPropertiesCount", "", "7"}, {"getPropertyNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}}), new String[][]{{"getPropertiesCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#405#-1753506400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.TemplateType", actual.getClass().getName());
  assertEquals("0 {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObjec...#381#-1979227419", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isBottom", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "0x123456789"}}), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "1.5e300"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"\r/."}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", ".5", "<sample:6>", "<sample:2>", "<sample:7>"}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}, {"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}, {"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}}), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"0", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"TITLE", "<sample:5>", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var TITLE{boolean} {getInputName=a, getName=TITLE, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "{\"a\":1}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}), new String[][]{{"getCharno", "", "1"}, {"getSideEffectFlags", "", "3"}, {"getInputId", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"Scope.Var "}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "<a>b</a>", "<sample:3>", "<null>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "-1.5", "<sample:3>", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "http://example.com/a?b=c", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1e10", "<sample:5>", "<sample:3>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "\t", "<sample:6>", "<sample:1>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.Scope", "getScope", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "0", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "a,b,c", "<sample:5>", "<null>", "<sample:7>", "true"}}), new String[][]{{"next", "", "2"}, {"isTypeInferred", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false), new String[][]{{"removeAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "7"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVars", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}, {"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"{"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"", "<sample:1>", "<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"-1.5", "<sample:1>", "<sample:0>", "<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:4>"}}), new String[][]{{"isLocal", "", "4"}, {"isDefine", "", "0"}, {"isDefine", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.5", "<sample:7>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.Scope", "getRootNode", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.5", "<sample:7>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "getDepth", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "0x123456789", "true"}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"null", "<sample:3>", "<sample:6>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var null{*} {getInputName=sample, getName=null, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"nullPT1H", "<sample:3>", "<sample:6>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var nullPT1H{*} {getInputName=sample, getName=nullPT1H, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=tr...#203#778976608", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", " ", "<sample:1>", "<sample:1>", "<sample:0>"}}), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", " ", "<sample:1>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "F", "<sample:4>", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "F", "<sample:4>", "<sample:4>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false), new String[][]{{"getTypeOfThis", "", "0"}, {"isInterface", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getTypeOfThis", "", "0"}, {"isInstanceType", "", "0"}, {"getPropertiesCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getTypeOfThis", "", "0"}, {"isAllType", "", "0"}, {"getOwnPropertyNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"getTypeOfThis", "", "0"}, {"isInterface", "", "0"}, {"getPropertiesCount", "", "2"}, {"getPropertyNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}), new String[][]{{"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false), new String[][]{{"getAllSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParentScope", new String[]{}, new String[]{}, false), new String[][]{{"isGlobal", "", "2"}, {"getSlot", "java.lang.String", "7"}, {"getAllSymbols", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getSlot", new String[]{"java.lang.String"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:2>"}, {"com.google.javascript.jscomp.Scope", "getParent", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.12345678", "<sample:5>", "<sample:3>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "getVarIterable", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}}), new String[][]{{"isQuotedString", "", "2"}, {"getJSType", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ScopedAliases", "com.google.javascript.jscomp.ScopedAliases", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.ScopedAliases", "hotSwapScript", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>"}, {"com.google.javascript.jscomp.ScopedAliases", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1.25", "<sample:7>", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"I", "<sample:7>", "<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getParent", ""}}), new String[][]{{"getNameNode", "", "0"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-21474836...#365#1343730483", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "1.25", "<sample:7>", "<sample:5>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValues", actual.getClass().getName());
  assertEquals("[Scope.Var 1.25{function (new:0, *, *, *): 0}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false), new String[][]{{"getDeclaration", "", "3"}, {"getDeclaration", "", "1"}, {"isGlobal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isLocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getTypeOfThis", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", ".5", "false"}}, 2), new String[][]{{"getPropertiesCount", "", "7"}, {"getPropertyNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"2147483648", "<sample:4>", "<sample:5>", "<sample:3>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}}, 1), new String[][]{{"isBleedingFunction", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false), new String[][]{{"isNoSideEffectsCall", "", "3"}, {"detachFromParent", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "getArgumentsVar", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getReferences", "com.google.javascript.jscomp.Scope$Var", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"getReferences", "com.google.javascript.jscomp.Scope$Var", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getGlobalScope", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"getReferences", "com.google.javascript.jscomp.Scope$Var", "6"}, {"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}}), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "argumenti"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getScope", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "isGlobal", ""}, {"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "argumenti"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}), new String[][]{{"isGlobal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "<a>b</a>", "<sample:3>", "<sample:6>", "<sample:0>"}, {"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[Scope.Var <a>b</a>{*}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getAllSymbols", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "1E-5", "<sample:3>", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[Scope.Var 1E-5{*}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"/a/b", "<sample:0>", "<sample:3>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var /a/b{sample.<boolean>} {getInputName=a, getName=/a/b, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=...#205#-471428537", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "getTypeOfThis", ""}}), new String[][]{{"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 1), new String[][]{{"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748364...#361#1627505514", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147...#366#-1984407823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFEQ {getCharno=-1, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=214748364...#361#-234116381", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EQ 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-2147483648...#361#-884975620", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getParent", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("OBJECTLIT {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147...#368#-1137706436", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}}, 3), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarIterable", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getRootNode", ""}, {"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}, {"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 1), new String[][]{{"retainAll", "java.util.Collection", "7"}, {"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}, {"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "undeclare", "com.google.javascript.jscomp.Scope$Var", "<sample:5>"}, {"com.google.javascript.jscomp.Scope", "getParent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "0", "false"}, {"com.google.javascript.jscomp.Scope", "getDeclarativelyUnboundVarsWithoutTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isGlobal", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getOwnSlot", "java.lang.String", "\t"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"PTHH", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "isBottom", ""}, {"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"PlHH", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}, {"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"OlHH", "false"}, false, 10, new String[][]{{"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:0>"}, {"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"[1,2]", "<sample:6>", "<sample:3>", "<sample:7>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var [1,2]{sample.<boolean>} {getInputName=0, getName=[1,2], isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferre...#207#65853380", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "PT1H", "<sample:6>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"}", "<sample:6>", "<sample:7>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var }{function (new:0, *, *, *): 0} {getInputName=a, getName=}, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInf...#211#1858936610", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"}", "<sample:6>", "<sample:8>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var }{*} {getInputName=a, getName=}, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"|", "<sample:6>", "<sample:8>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var |{*} {getInputName=a, getName=|, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"B}", "<sample:0>", "<sample:8>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.Scope", "getAllSymbols", ""}, {"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var B}{*} {getInputName=a, getName=B}, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVar", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1L", "<sample:5>", "<null>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1L{null} {getInputName=sample, getName=1L, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"1L", "<sample:5>", "<null>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Scope", "getParentScope", ""}, {"com.google.javascript.jscomp.Scope", "getReferences", "com.google.javascript.jscomp.Scope$Var", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1L{null} {getInputName=sample, getName=1L, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"2020-02-30T25:61:61", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput", "0x1F", "<sample:3>", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"isConst", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "[1,2]"}, {"com.google.javascript.jscomp.Scope", "isDeclared", "java.lang.String,boolean", "<a>b<0a>", "false"}}, 2), new String[][]{{"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("arguments", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"getJSDocInfo", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getArgumentsVar", new String[]{}, new String[]{}, false, 13, new String[][]{}), new String[][]{{"getJSDocInfo", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"1.c1234567", "<sample:1>", "<sample:0>", "<sample:6>", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var 1.c1234567{*} {getInputName=a, getName=1.c1234567, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=fal...#203#-1481715508", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput", "boolean"}, new String[]{"", "<sample:2>", "<sample:5>", "<sample:6>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:6>"}, false, 0, null, 3), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".5", "<null>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var .5{sample.<boolean>} {getInputName=0, getName=.5, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true...#201#655069332", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{".6", "<null>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var .6{sample.<boolean>} {getInputName=0, getName=.6, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeInferred=true...#201#587595282", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var null{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var null{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getReferences", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getVarCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.Scope", "getGlobalScope", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"E"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "getSlot", "java.lang.String", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getDepth", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.Scope", "getDepth", ""}, {"com.google.javascript.jscomp.Scope", "declare", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.CompilerInput,boolean", "/a/b", "<sample:0>", "<sample:7>", "<sample:0>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "isDeclared", new String[]{"java.lang.String", "boolean"}, new String[]{"1f10oe10", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Scope", "isLocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "undeclare", new String[]{"com.google.javascript.jscomp.Scope$Var"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147...#366#-1984407823", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483647, getSou...#356#982369688", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.Scope", "getVarIterable", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Scope", "com.google.javascript.jscomp.Scope", "declare", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.jscomp.CompilerInput"}, new String[]{"2020-02-30T25:61:61", "<sample:4>", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Scope", "getVars", ""}}, 3), new String[][]{{"getInputName", "", "6"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2020-02-30T25:61:61", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getVarCount=1, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
