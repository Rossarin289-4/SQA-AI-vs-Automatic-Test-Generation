package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:3>"}}, 3), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:0>"}}, 3), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "getBestJSDocInfo", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false), new String[][]{{"getVarCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}), new String[][]{{"isGlobal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}), new String[][]{{"isGlobal", "", "6"}, {"getVar", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}), new String[][]{{"isGlobal", "", "6"}, {"getVar", "java.lang.String", "6"}, {"getArgumentsVar", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}}), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}}), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}), new String[][]{{"getParent", "", "4"}, {"getVars", "", "5"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1), new String[][]{{"isLocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:3>"}}, 1), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<null>"}}, 1), new String[][]{{"getVars", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<null>"}}), new String[][]{{"getVars", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:7>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:6>"}}), new String[][]{{"getArgumentsVar", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:5>"}}), new String[][]{{"getSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:5>"}}, 3), new String[][]{{"getSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:5>"}}, 3), new String[][]{{"getSlot", "java.lang.String", "0"}, {"getDeclarativelyUnboundVarsWithoutTypes", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:2>"}}, 3), new String[][]{{"getVarCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<null>"}}), new String[][]{{"getRootNode", "", "7"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nERROR\n\n\nTree2:\nGOTO 7\n    SETNAME 12\n        BITXOR\n        BITAND 12\n        EQ 16\n\n\nSubtree1: ERROR\n\n\nSubtree2: GOTO 7\n    SETNAME 12\n        BITXOR\n        BITAND 12\n  ...#212#826658749", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}}), new String[][]{{"getVars", "", "6"}, {"hasNext", "", "4"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:7>"}}, 1), new String[][]{{"getParentScope", "", "4"}, {"getParentScope", "", "3"}, {"getArgumentsVar", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:7>"}}, 1), new String[][]{{"getParentScope", "", "4"}, {"getParentScope", "", "3"}, {"getArgumentsVar", "", "2"}, {"isLocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:8>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:3>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:9>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "getBestJSDocInfo", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:9>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:5>"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "4"}, {"getParentScope", "", "3"}, {"getArgumentsVar", "", "2"}, {"isLocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:6>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:5>"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "4"}, {"getParentScope", "", "3"}, {"getArgumentsVar", "", "2"}, {"isLocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:10>", "<sample:6>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "4"}, {"getParentScope", "", "3"}, {"getArgumentsVar", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=false, isLocal=true, isNoShadow=false, isTypeIn...#213#1145410078", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:4>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:4>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:5>"}}, 3), new String[][]{{"isDeclared", "java.lang.String,boolean", "7"}, {"getDeclarativelyUnboundVarsWithoutTypes", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:9>"}}, 2), new String[][]{{"getVars", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:3>"}}, 3), new String[][]{{"getVars", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:4>"}}), new String[][]{{"getParentScope", "", "4"}, {"getOwnSlot", "java.lang.String", "1"}, {"getDeclarativelyUnboundVarsWithoutTypes", "", "1"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<null>"}}, 2), new String[][]{{"getParentScope", "", "0"}, {"getOwnSlot", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<null>"}}, 2), new String[][]{{"getParentScope", "", "0"}, {"getVarCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "getBestJSDocInfo", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<null>"}}, 2), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:10>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:10>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<null>"}}, 2), new String[][]{{"getVar", "java.lang.String", "1"}, {"isGlobal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "getBestJSDocInfo", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<null>"}}, 2), new String[][]{{"getArgumentsVar", "", "1"}, {"isBleedingFunction", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<null>"}}, 1), new String[][]{{"getArgumentsVar", "", "1"}, {"isBleedingFunction", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:0>"}}, 1), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "6"}, {"hasNext", "", "6"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:0>"}}, 1), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "6"}, {"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:5>"}, false, 3, new String[][]{}, 3), new String[][]{{"getSlot", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 8, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=-1, getString=!UnsupportedOperationException,...#378#-276811720", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 8, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}, {"children", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 8, new String[][]{}, 1), new String[][]{{"getRootNode", "", "3"}, {"children", "", "2"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}}, 2), new String[][]{{"getParent", "", "5"}, {"getParentScope", "", "0"}, {"getVarCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:3>"}}, 2), new String[][]{{"getParent", "", "5"}, {"getParentScope", "", "0"}, {"getVarCount", "", "0"}, {"getArgumentsVar", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Arguments", actual.getClass().getName());
  assertEquals("Scope.Var arguments{null} {getInputName=<non-file>, getName=arguments, isBleedingFunction=!NullPointerException, isConst=false, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeIn...#213#290495258", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:0>"}}, 2), new String[][]{{"getDeclarativelyUnboundVarsWithoutTypes", "", "5"}, {"peek", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:6>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:10>"}}, 2), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourcePosition=0, getString=!UnsupportedOperationException, ...#377#-759491108", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>", "<sample:3>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:10>"}}, 2), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
}
