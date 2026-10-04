package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}}), new String[][]{{"getParent", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1), new String[][]{{"getSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:6>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<null>"}}, 1), new String[][]{{"isDeclared", "java.lang.String,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}), new String[][]{{"getTypeOfThis", "", "7"}, {"isNativeObjectType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:0>"}}), new String[][]{{"isGlobal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:2>"}}), new String[][]{{"isLocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:5>"}, false), new String[][]{{"isDeclared", "java.lang.String,boolean", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:6>"}}, 3), new String[][]{{"isLocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:5>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false), new String[][]{{"getVars", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:3>"}, false, 1, new String[][]{}), new String[][]{{"isDeclared", "java.lang.String,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}), new String[][]{{"getVars", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"getParent", "", "0"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:11>", "<sample:9>"}}), new String[][]{{"getVarCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:1>"}}), new String[][]{{"getVarCount", "", "4"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:3>"}}), new String[][]{{"getSlot", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{}, 3), new String[][]{{"isGlobal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3), new String[][]{{"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:3>"}}, 2), new String[][]{{"getVarCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:7>"}}, 1), new String[][]{{"getVarCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:4>"}}), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 3), new String[][]{{"getVars", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2), new String[][]{{"getVarCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"getParent", "", "7"}, {"getVar", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:5>"}}), new String[][]{{"getVarCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:1>"}, false, 5, new String[][]{}, 3), new String[][]{{"getVars", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, null, 2), new String[][]{{"isGlobal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:1>"}}, 2), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:5>"}}, 2), new String[][]{{"isLocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3), new String[][]{{"getVar", "java.lang.String", "3"}, {"getVar", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, null, 1), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:12>", "<sample:0>"}}, 3), new String[][]{{"isDeclared", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:8>"}}, 1), new String[][]{{"getVarCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:7>"}}, 1), new String[][]{{"isGlobal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:1>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=0, hasChildren=true, hasMoreThanOne...#369#430767175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:2>"}}, 2), new String[][]{{"getVarCount", "", "3"}, {"getVars", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:1>"}}, 1), new String[][]{{"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=3, hasChildren=true, hasMoreT...#374#-1331295150", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 2), new String[][]{{"getRootNode", "", "1"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=0, hasChildren=true, hasMoreThanOne...#369#430767175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:4>"}}, 1), new String[][]{{"isGlobal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:10>", "<sample:0>"}, false, 1, new String[][]{}, 2), new String[][]{{"getVars", "", "6"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:6>"}}, 2), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=-1, hasChildren=false, hasMoreTha...#373#1444327757", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:10>"}}, 3), new String[][]{{"getVars", "", "3"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:3>"}, false, 6, new String[][]{}, 1), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanOb...#370#-636042044", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:6>"}}, 3), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3), new String[][]{{"getVars", "", "3"}, {"hasNext", "", "1"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:3>"}}, 3), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:0>"}}, 1), new String[][]{{"getVars", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:8>"}}, 1), new String[][]{{"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFNE 10 {getCharno=11, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=10, getQualifiedName=null, getString=!UnsupportedOperationException, getType=7, hasChildren=true, hasMoreTha...#372#-231894074", SearchInputFactory_scaffolding.observe(actual));
 }
}
