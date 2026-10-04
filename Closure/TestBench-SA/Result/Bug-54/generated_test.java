package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getConstructor", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "call", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}), new String[][]{{"getAllSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[Scope.Var Array{function (new:Array, ...[*]): Array}, Scope.Var Array.prototype{Array.prototype}, Scope.Var Boolean{function (new:Boolean, *): boolean}, Scope.Var Boolean.prototype{Boolean.prototype}...#1720#1470062157", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"Hello, World", "<sample:3>", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumberValueType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.PrototypeObjectType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInstanceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"1.1234567", "<sample:6>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "0x1E", "<sample:4>", "false", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopDefiningInterface", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "java.lang.String"}, new String[]{"<sample:2>", "JSC_LENDS_ON_NON_OBJECT"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", new String[]{}, new String[]{}, false, 54, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", "java.lang.String", "Proxy"}, {"com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNoObjectType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.PrototypeObjectType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getSlot", "java.lang.String", "prototype"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"prototype", "<sample:0>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hashCode", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (new:0, *, *, *): 0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasD...#394#-285011311", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *, *, *): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, g...#410#942626312", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getOwnPropertyNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}, {"getAllExtendedInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:6>"}, true), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setExtendedInterfaces", "java.util.List", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"getReturnType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("0 {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasDisplayName=true, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjec...#367#1354855762", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("0 {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getReferenceName=0, hasDisplayName=true, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjec...#367#1354855762", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPropertyJSDocInfo", "java.lang.String,com.google.javascript.rhino.JSDocInfo", "1.5e300", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true), new String[][]{{"clearCachedValues", "", "0"}, {"getPropertyType", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"autoboxesTo", "", "4"}, {"getConstructor", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=Boolean, getPossibleToBoole...#428#-1580970853", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopDefiningInterface", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "java.lang.String"}, new String[]{"<sample:7>", "1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPro...#408#-255005673", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "4"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "6"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (...[*]): None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcom...#423#-826903858", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "3"}, {"getExtendedInterfacesCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:8>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<sample:6>"}}, 2), new String[][]{{"getVars", "", "3"}, {"next", "", "1"}, {"getType", "", "1"}, {"getSource", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "T]+", "<null>"}, true, 0, null, 1), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"dereference", "", "1"}, {"clearCachedValues", "", "2"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:T]+): ? {canBeCalled=true, getDisplayName=T]+, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=T]+, getPossibleToBooleanOutcomes=TRUE, get...#408#1240565604", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "A_F_ORDINARY", "<null>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "6"}, {"hasCachedValues", "", "2"}, {"clearCachedValues", "", "5"}, {"getOwnPropertyNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.HashSet", actual.getClass().getName());
  assertEquals("[prototype]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "ne", "<null>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "0"}, {"isDateType", "", "1"}, {"clearCachedValues", "", "7"}, {"getTopMostDefiningType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "A+_F_OR3DINARY", "<null>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"clearCachedValues", "", "2"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "n", "<null>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "4"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}, {"clearCachedValues", "", "2"}, {"getPropertyType", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#390#2008746693", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:10>", "JSC_NALFORMED_TYPEEEF", "<null>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "5"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}, {"clearCachedValues", "", "2"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNamedType", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setPrototypeBasedOn", "com.google.javascript.rhino.jstype.ObjectType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.PrototypeObjectType", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", "apply"}, {"com.google.javascript.rhino.jstype.FunctionType", "setSource", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", "java.lang.String", "I"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, true, 0, null, 3), new String[][]{{"getTopMostDefiningType", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameters", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReturnType", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameters", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isNumber", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", "abc"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:6>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:7>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=32, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=32, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}, 2), new String[][]{{"getAllSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[Scope.Var Array{function (new:Array, ...[*]): Array}, Scope.Var Array.prototype{Array.prototype}, Scope.Var Boolean{function (new:Boolean, *): boolean}, Scope.Var Boolean.prototype{Boolean.prototype}...#1720#1470062157", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}}, 1), new String[][]{{"getAllSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[Scope.Var Array{function (new:Array, ...[*]): Array}, Scope.Var Array.prototype{Array.prototype}, Scope.Var Boolean{function (new:Boolean, *): boolean}, Scope.Var Boolean.prototype{Boolean.prototype}...#1720#1470062157", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3), new String[][]{{"getAllSymbols", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[Scope.Var Array{function (new:Array, ...[*]): Array}, Scope.Var Array.prototype{Array.prototype}, Scope.Var Boolean{function (new:Boolean, *): boolean}, Scope.Var Boolean.prototype{Boolean.prototype}...#1720#1470062157", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3), new String[][]{{"getAllSymbols", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:2>"}}, 3), new String[][]{{"getParent", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:0>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:8>"}}, 1), new String[][]{{"getAllSymbols", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:8>"}}, 1), new String[][]{{"getAllSymbols", "", "4"}, {"retainAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}}, 3), new String[][]{{"getAllSymbols", "", "4"}, {"iterator", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<sample:9>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", "java.lang.String", "0x123456789"}, {"com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isConstructor", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.PrototypeObjectType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getExtendedInterfacesCount", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.PrototypeObjectType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getExtendedInterfacesCount", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:7>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", new String[]{"java.lang.String"}, new String[]{"n"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getIndexType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isString", ""}}, 1), new String[][]{{"getSource", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasOwnProperty", "java.lang.String", "apply"}, {"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isReturnTypeInferred", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getAllExtendedInterfaces", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNominalType", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoResolvedType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypeOfThis", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"-0.0", "<sample:6>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"A0tiveXPbject", "<sample:0>", "<sample:11>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"1.1234567", "<sample:6>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "0x1E", "<sample:4>", "false", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"i1474836:47", "<sample:5>", "<sample:11>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSlot", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getDisplayName", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getConstructor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getDisplayName", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getConstructor", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.PrototypeObjectType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getExtendedInterfaces", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"0x1E"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"WiWndo"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setExtendedInterfaces", "java.util.List", "<sample:1>"}, {"com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isObject", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPrototype", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyNames", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"callPT2H"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMaxArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInterface", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.PrototypeObjectType", "<sample:7>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"010"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearResolved", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isFunctionPrototypeType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"i"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isUnionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isUnionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "createDelegateSuffix", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1.12345678901234567)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInterface", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getParameterType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", "java.util.List", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameters", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameters", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.FunctionType", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", "abc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasImplementedInterfaces", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.FunctionType", "hasOwnProperty", "java.lang.String", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isAllType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isDateType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getDisplayName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"2147483648", "<sample:1>", "<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "collectPropertyNames", "java.util.Set", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "clearResolved", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setOwnerFunction", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", "java.lang.String", "this:"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:0>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<null>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParentScope", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getIndexType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", new String[]{"com.google.javascript.jscomp.Scope", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:2>", "<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=fals...#378#68352783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{""}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeUnionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isArrayType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesNumberContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isEmptyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", "java.util.List", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=32, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=false, isLocal=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hasReferenceName", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTemplateTypeName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "collectPropertyNames", "java.util.Set", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnerFunction", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}), new String[][]{{"getAllSymbols", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getDisplayName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:1>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}}), new String[][]{{"getSlot", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameterType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isConstructor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"null"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRootNode", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:6>"}}), new String[][]{{"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("global this {getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getReferenceName=global this, hasDisplayName=true, hasReferenceName=true, isAllType=...#407#789383432", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:0>", "<sample:2>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:6>"}}), new String[][]{{"getAllSymbols", "", "5"}, {"clear", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPropertyJSDocInfo", new String[]{"java.lang.String", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"1.12345678", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasImplementedInterfaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<sample:2>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:7>", "<sample:4>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:3>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "patchGlobalScope", "com.google.javascript.jscomp.Scope,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>"}}), new String[][]{{"getAllSymbols", "", "7"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSource", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:8>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<null>"}}), new String[][]{{"getReferences", "com.google.javascript.jscomp.Scope$Var", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.SingletonImmutableList", actual.getClass().getName());
  assertEquals("[Scope.Var arguments{null}]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeEnumElementType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getAllExtendedInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasInstanceType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"JSC_UNKNOWN_LENDS"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumber", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNominalConstructor", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:4>"}}), new String[][]{{"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPro...#408#-255005673", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getExtendedInterfacesCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getMinArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{"010"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSlot", new String[]{"java.lang.String"}, new String[]{"true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isVoidType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "canAssignTo", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInstanceType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isInstanceType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReturnType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototype", new String[]{"com.google.javascript.rhino.jstype.PrototypeObjectType"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoResolvedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", new String[]{"java.lang.String"}, new String[]{"null"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getSource", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasOwnProperty", "java.lang.String", "apply"}, {"com.google.javascript.rhino.jstype.FunctionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNamedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isReturnTypeInferred", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"call", "<sample:3>", "false", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toObjectType", new String[]{}, new String[]{}, false), new String[][]{{"getTypeOfThis", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMaxArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getParameterType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getDisplayName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.PrototypeObjectType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getExtendedInterfaces", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNominalConstructor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getMaxArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isStringValueType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNullable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getCtorExtendedInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "toObjectType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNominalType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPropertiesCount", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"TITLE"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.PrototypeObjectType", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEnumElementType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReferenceName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isAllType", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", new String[]{}, new String[]{}, false), new String[][]{{"getParameterType", "", "0"}, {"getPossibleToBooleanOutcomes", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toDebugHashCodeString", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isVoidType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2147483647", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=32, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasInstanceType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyJSDocInfo", "java.lang.String", "PT1H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", new String[]{}, new String[]{}, false, 54, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.PrototypeObjectType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesNumberContext", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setSource", "com.google.javascript.rhino.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "canBeCalled", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasDisplayName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isDateType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "createDelegateSuffix", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(2020-02-30T25:61:61)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getImplicitPrototype", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:6>"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRecordType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isTheObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasInstanceType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeUnionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchesInt32Context", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isAllType", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypedScopeCreator", "com.google.javascript.jscomp.TypedScopeCreator", "createInitialScope", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypedScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:9>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isEmptyType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getIndexType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "function (", "<sample:5>", "<sample:11>"}, {"com.google.javascript.rhino.jstype.FunctionType", "autoboxesTo", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toMaybeEnumElementType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isInstanceType", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isResolved", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopDefiningInterface", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "java.lang.String"}, new String[]{"<sample:6>", "new:"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"123456789012345678901234567890"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getInternalArrowType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isPropertyTypeDeclared", "java.lang.String", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRecordType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrettyPrint", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", "com.google.javascript.rhino.jstype.FunctionType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"Proxy"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", "com.google.javascript.rhino.jstype.ObjectType", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "thisType", "<null>", "true", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNoType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getImplementedInterfaces", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchesUint32Context", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRegexpType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setSource", "com.google.javascript.rhino.Node", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParametersNode", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
