package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>"}, false, 2, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}, {"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"containsValue", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false), new String[][]{{"values", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"getVarCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"entrySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}), new String[][]{{"put", "java.lang.Object,java.lang.Object", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}}), new String[][]{{"clear", "", "4"}, {"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:3>"}}), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:9>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<null>"}}, 2), new String[][]{{"getParent", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false), new String[][]{{"replace", "java.lang.Object,java.lang.Object", "1"}, {"keySet", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, null, 1), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 1, new String[][]{}, 2), new String[][]{{"getVars", "", "5"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope$Var", actual.getClass().getName());
  assertEquals("Scope.Var Array {getInputName=<non-file>, getName=Array, isConst=!NullPointerException, isDefine=false, isGlobal=true, isLocal=false, isNoShadow=false, isTypeInferred=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:3>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "5"}, {"getOwnSlot", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:6>"}}), new String[][]{{"getTypeOfThis", "", "4"}, {"isEnumElementType", "", "2"}, {"isBooleanObjectType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false), new String[][]{{"putAll", "java.util.Map", "3"}, {"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:0>"}}), new String[][]{{"isGlobal", "", "6"}, {"getSlot", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3), new String[][]{{"getVars", "", "0"}, {"remove", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}, {"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "1"}, {"remove", "java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:5>"}}), new String[][]{{"getVars", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<null>"}}, 3), new String[][]{{"getVar", "java.lang.String", "2"}, {"getVars", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, null, 1), new String[][]{{"isGlobal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1), new String[][]{{"getSlot", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:8>", "<sample:9>"}, {"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}}), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:2>"}}, 2), new String[][]{{"keySet", "", "6"}, {"iterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:1>"}}, 1), new String[][]{{"getSlot", "java.lang.String", "2"}, {"getVarCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:5>"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}}, 3), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:9>"}}, 3), new String[][]{{"isDeclared", "java.lang.String,boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"getParentScope", "", "3"}, {"getVarCount", "", "2"}, {"isGlobal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false), new String[][]{{"isGlobal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:11>", "<sample:6>"}}, 1), new String[][]{{"isDeclared", "java.lang.String,boolean", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"replace", "java.lang.Object,java.lang.Object,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}}, 3), new String[][]{{"getVar", "java.lang.String", "4"}, {"getParent", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false), new String[][]{{"getVarCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:0>"}}), new String[][]{{"getRootNode", "", "0"}, {"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=!UnsupportedOperationException, getType=1, hasChildren=true, hasMoreThanOne...#369#-920249111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}, {"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:10>"}}, 1), new String[][]{{"putAll", "java.util.Map", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{key0=a, key1=0, key2=sample}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}, {"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.HashMap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<sample:5>"}, false, 4, new String[][]{}, 1), new String[][]{{"getVars", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}, 1), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}, {"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:12>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 2), new String[][]{{"getParentScope", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}}, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}, {"replace", "java.lang.Object,java.lang.Object", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:4>"}}, 3), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getVarCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"remove", "java.lang.Object", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:11>"}, false, 0, null, 3), new String[][]{{"isGlobal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}, 3), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:1>"}}), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<null>"}}), new String[][]{{"getVars", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:3>"}}, 3), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=-1, hasChildren=false, hasMoreTha...#373#1444327757", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:4>"}, false), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFNE 10 {getCharno=11, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=10, getQualifiedName=null, getString=!UnsupportedOperationException, getType=7, hasChildren=true, hasMoreTha...#372#-231894074", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 1), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>"}}, 1), new String[][]{{"entrySet", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$EntrySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 6, new String[][]{}), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=null, getString=!UnsupportedOperationException, getType=5, hasChildren=true, hasMoreThanOn...#369#279101180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:7>"}}, 1), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=-1, hasChildren=false, hasMoreTha...#373#1444327757", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:1>"}}, 2), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}}, 3), new String[][]{{"keySet", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>"}}, 1), new String[][]{{"values", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$Values", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:6>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:3>"}}, 1), new String[][]{{"isLocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 1), new String[][]{{"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:2>"}}, 3), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=3, hasChildren=true, hasMoreT...#374#-1331295150", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}, 3), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:0>"}}, 1), new String[][]{{"isGlobal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<null>"}}, 1), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=<a><b>t</b></a>, getType=40, hasChildren=false, hasMoreT...#376#-390277977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2), new String[][]{{"isLocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:7>"}}, 1), new String[][]{{"getVars", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", ""}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:3>"}}, 2), new String[][]{{"get", "java.lang.Object", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:5>"}}, 3), new String[][]{{"getVarCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("33", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=33, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"keySet", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.HashMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:1>"}}, 3), new String[][]{{"getParentScope", "", "6"}, {"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3), new String[][]{{"isLocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}}, 2), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=3, hasChildren=true, hasMoreT...#374#-1331295150", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:4>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:2>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:4>"}}, 2), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=0, hasChildren=true, hasMoreThanOne...#369#430767175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:7>"}}, 2), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=-1, hasChildren=false, hasMoreTha...#373#1444327757", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<null>"}}, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:4>"}}, 2), new String[][]{{"getVarCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}}, 3), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=3, hasChildren=true, hasMoreT...#374#-1331295150", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:7>"}}, 2), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:9>"}}, 2), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getParentScope", "", "1"}, {"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.AmbiguateProperties", "com.google.javascript.jscomp.AmbiguateProperties", "getRenamingMap", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.AmbiguateProperties", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}}, 2), new String[][]{{"getOrDefault", "java.lang.Object,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"isGlobal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:12>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:5>"}}, 2), new String[][]{{"getRootNode", "", "6"}, {"setCharno", "int", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
}
