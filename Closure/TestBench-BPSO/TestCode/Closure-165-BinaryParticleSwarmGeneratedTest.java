package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"12:20:45."}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getParameterType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNumberObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameterizedType", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "identifyNonNullableName", "java.lang.String", "LAZY_NAMES"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<sample.<boolean>> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCa...#416#1480082982", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewReturnType", new String[]{"com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:0>", "<sample:6>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "hasOwnDeclaredProperty", "java.lang.String", "-2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "resetImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "createDelegateSuffix", new String[]{"java.lang.String"}, new String[]{"LAZY_EXPRESSIONS"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(LAZY_EXPRESSIONS)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnPropertyNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:5>", "true", "<empty>"}, false, 1, new String[][]{}), new String[][]{{"autobox", "", "6"}, {"getPropertyNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "setResolveMode", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"2020-02-3", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}}), new String[][]{{"clearResolved", "", "0"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "canPropertyBeDefined", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:9>", "01/String"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "setTemplateTypeName", "java.lang.String", "trud"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType", "2020-02-30T25:6", "<sample:0>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"prototype", "<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:10>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSynthetic", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getCtorExtendedInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getEachReferenceTypeWithProperty", "java.lang.String", "RfferenceError--1"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", "com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:6>", "<sample:2>"}}), new String[][]{{"collapseUnion", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:2>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<sample:3>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (*, ...[0]): boolean {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=1, getNormalizedReferenceName=null, getPossibleToBoolean...#427#500340407", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "hasNamespace", new String[]{"java.lang.String"}, new String[]{"TITKE"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "clearNamedTypes", ""}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:8>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "clearTemplateTypeName", ""}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:3>", "Date"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Object {canBeCalled=false, getDisplayName=Object, getNormalizedReferenceName=Object, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Object, hasCachedValues=true, hasDisplayN...#388#926892955", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createRecordType", new String[]{"java.util.Map"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "setLastGeneration", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:6>", "/1/String", "<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "URIError", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:3>", "<sample:2>", "<empty>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<sample:8>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:function (new:0, *=, *=, *=): 0): boolean {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, ge...#447#-238090676", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{"1.25"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isFunctionPrototypeType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:12>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "isLastGeneration", ""}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getIndexType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getCtorImplementedInterfaces", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isPropertyTypeDeclared", "java.lang.String", "Eqror2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{"atee"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isFunctionType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "AIrayE", "<sample:7>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"11", "<sample:4>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "Booleani", "<sample:9>", "<sample:9>"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", "boolean", "true"}}), new String[][]{{"addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}, {"addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "4"}, {"addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "setPropertyJSDocInfo", "java.lang.String,com.google.javascript.rhino.JSDocInfo", "trvd", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#405#-1753506400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "mRegExp", "<sample:10>", "<sample:4>"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{mRegExp: *} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=1, getReferenceName=null, hasCachedValues=true, hasDisplayN...#390#-1069715939", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "resetImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.jstype.JSType[]", "<sample:9>", "false", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:7>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<sample:0>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getErrorReporter", ""}}, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (boolean, sample.<boolean>): function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2, getMinArguments=2, getNormalizedReference...#458#1641336428", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", "java.lang.String,java.lang.String,int,int", "Arry+1", "prot6type", "-2147483648", "-2013265920"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", "com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "2147582648-1.5", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"1.25", "<sample:6>", "<sample:6>"}, false), new String[][]{{"build", "", "3"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative[]"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}}, 1), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "declareType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1.1234567 ", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "declareType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"ReferenceError", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getNativeObjectType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}), new String[][]{{"findPropertyType", "java.lang.String", "5"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"2147582648-1.5", "<sample:11>", "<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"build", "", "2"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", "boolean", "true"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.12345688990123456123456789012345678901234567890", "<sample:12>", "<sample:3>"}}), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}, {"getSlot", "java.lang.String", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"-3", "<null>", "true", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getTypeOfThis", ""}, {"com.google.javascript.rhino.jstype.RecordType", "isGlobalThisType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "clearNamedTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createInterfaceType", "java.lang.String,com.google.javascript.rhino.Node", "tque", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{48}", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createNativeAnonymousObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:7>", "<sample:1>", "<null>"}}, 2), new String[][]{{"getParentScope", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getJSDocInfo", "", "3"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Object {canBeCalled=false, getDisplayName=Object, getNormalizedReferenceName=Object, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Object, hasCachedValues=true, hasDisplayN...#388#926892955", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "overwriteDeclaredType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"null", "<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<sample:13>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createInterfaceType", "java.lang.String,com.google.javascript.rhino.Node", ".LAZY_NAMES", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isPropertyInExterns", "java.lang.String", ",3"}}, 1), new String[][]{{"getRootNode", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameterizedType", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:12>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createRecordType", "java.util.Map", "<empty>"}}), new String[][]{{"getParameterType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:14>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): * {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getTempla...#405#-278603590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:12>", "Brray", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewThisType", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:6>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNullableType", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:3>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:12>", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "isForwardDeclaredType", "java.lang.String", "nvll"}}, 3), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalNullableType", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Object {canBeCalled=false, getDisplayName=Object, getNormalizedReferenceName=Object, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Object, hasCachedValues=true, hasDisplayN...#388#926892955", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getDirectImplementors", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", "java.lang.String", "Eunctinyn+1"}}), new String[][]{{"removeAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "clearCachedValues", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "getOwnSlot", "java.lang.String", "12:30:45abc"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"Eenctinyn", "<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "PT1H", "<sample:13>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}}), new String[][]{{"build", "", "2"}, {"clearCachedValues", "", "3"}, {"getReferenceName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:7>", "<sample:5>", "<empty>"}}, 1), new String[][]{{"getNormalizedReferenceName", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "PT1H", "<sample:6>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", "boolean", "false"}}, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{PT1H: *} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=1, getReferenceName=null, hasCachedValues=false, hasDisplayNam...#388#-1499418079", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getEachReferenceTypeWithProperty", "java.lang.String", "prototype"}}), new String[][]{{"findPropertyType", "java.lang.String", "2"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEmptyType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNullable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumberObjectType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isEnumElementType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"1.12345688990123456"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, h...#377#-1605455525", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canBeCalled", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumberValueType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): boolean {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, get...#411#989139900", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnPropertyNames", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNoType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "Y"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#405#-1753506400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isTemplateType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:3>", "false", "<empty>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): sample.<boolean> {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=...#418#-1819395370", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isTemplateType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"3000"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "hasReferenceName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getParentScope", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.1234567890123456", "<sample:5>", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"URIEqpr"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameters", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", "java.util.List", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isAllType", ""}}, 1), new String[][]{{"isEnumElementType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isFunctionType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "hasCachedValues", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesStringContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getReferenceName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "11-25-1", "<sample:1>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNoObjectType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isUnionType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNullable", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"-1LAZY_NAMER"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getPropertyNames", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNativeObjectType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(boolean|sample.<boolean>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanVal...#395#1201329360", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "unboxesTo", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getOwnPropertyNames", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNoType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getOwnPropertyNames", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isFunctionType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isInterface", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isInterface", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "clearResolved", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalNullableType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isTheObjectType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.RecordType", "defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "0x1B", "<sample:6>", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "shouldTolerateUndefinedValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getDirectImplementors", "com.google.javascript.rhino.jstype.ObjectType", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getIndexType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isAllType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isNumber", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:2>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createRecordType", "java.util.Map", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): boolean {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, get...#409#-116908678", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnPropertyNames", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getConstructor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isStringValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.RecordType", "isInterface", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:11>", "false", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.jstype.JSType[]", "<sample:9>", "false", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (sample.<boolean>, *, function (new:0, *=, *=, *=): 0): NoResolvedType {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=3, getNormalize...#470#378325251", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasDisplayName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "matchConstraint", "com.google.javascript.rhino.jstype.ObjectType", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isGlobalThisType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getIndexType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"trud"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalParameters", "com.google.javascript.rhino.jstype.JSType[]", "<sample:2>"}}, 2), new String[][]{{"clearResolved", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("{} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=null, hasCachedValues=false, hasDisplayName=false...#381#1397535279", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNoType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toObjectType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getTypeOfThis", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getCtorExtendedInterfaces", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", "boolean", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesUint32Context", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "hasOwnDeclaredProperty", "java.lang.String", "TypeErrpr5."}, {"com.google.javascript.rhino.jstype.RecordType", "toMaybeEnumElementType", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isEnumElementType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineSynthesizedProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"@rrayEvalErr/r", "<sample:3>", "<sample:11>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNoObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:9>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "clearNamedTypes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"aE"}, false, 7, new String[][]{}, 1), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "aSyntaxErrror"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEnumElementType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "hasNamespace", new String[]{"java.lang.String"}, new String[]{"01/jtring"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"-1", "<sample:7>", "<sample:3>", "<sample:2>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewReturnType", new String[]{"com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:10>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "canPropertyBeDefined", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:2>", "21475826481.5"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorTypeWithVarArgs", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<sample:2>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesInt32Context", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isOrdinaryFunction", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createNativeAnonymousObjectType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("{} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=null, hasCachedValues=false, hasDisplayName=false...#381#1397535279", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasDisplayName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasCachedValues", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "", "<sample:1>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"PT1H"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isInstanceType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"abc", "<sample:2>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "autobox", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", new String[]{"java.lang.String"}, new String[]{"URIEror"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "overwriteDeclaredType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "200-01-01", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isStringValueType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "RangeErqor", "<sample:2>", "true", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "matchesStringContext", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isBooleanValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=null, hasCachedValues=false, hasDispl...#393#1733501415", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isUnknownType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:6>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample.<*>", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{"2147583648"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameterizedType", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorTypeWithVarArgs", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<sample:5>", "<empty>"}}), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesUint32Context", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNullable", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getDirectImplementors", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineSynthesizedProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{".", "<sample:6>", "<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNumberValueType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isTemplateType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toMaybeUnionType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypeOfThis", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isUnknownType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=true, hasDisplayName=f...#384#1901214606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasReferenceName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getDisplayName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNumberValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "clearNamedTypes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSType[]", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesStringContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isEmptyType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "dereference", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "clearTemplateTypeName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "autoboxesTo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNullable", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(null|sample.<boolean>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueT...#392#-675942463", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isBooleanValueType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"11L", "<sample:7>", "<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canBeCalled", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNoType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isConstructor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "declareType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"0x1F2120-01-01", "<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType", "String", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:8>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<empty>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#354#1652651458", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isDateType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNullType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNumberObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNamedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createNullableType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{".5", "<sample:2>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "equals", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:10>", "false", "<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (sample.<boolean>, *, function (new:0, *=, *=, *=): 0): * {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=3, getNormalizedReferenceNam...#455#-907208152", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"Object"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getPropertyType", "java.lang.String", "RangeErqorNumber"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"1e10"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "matchesInt32Context", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getDirectImplementors", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"Booleannull", "<sample:1>", "<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "autoboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasCachedValues=false, hasDis...#392#-1913800589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNullType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNoResolvedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEnumType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameterizedType", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:4>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("sample.<boolean>.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=fal...#403#-998362512", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", "com.google.javascript.rhino.jstype.ObjectType", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNoResolvedType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isEnumElementType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getIndexType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"210", "<sample:7>", "<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{210} {getDisplayName=210, getNormalizedReferenceName=enum{210}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanVal...#394#-1981491132", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getParentScope", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNominalType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", new String[]{"com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalType", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewThisType", new String[]{"com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>", "<sample:6>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:4>", "SyntaxError123456789012345668901234567890"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#405#-1753506400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "matchesStringContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative[]"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Boolean|boolean) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=fa...#386#-1362502702", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "shouldTolerateUndefinedValues", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:4>", "<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getEachReferenceTypeWithProperty", new String[]{"java.lang.String"}, new String[]{"-3"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isConstructor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{".5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isOrdinaryFunction", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getCtorExtendedInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getDisplayName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEnumType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"01/"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "canBeCalled", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:7>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNullableType", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (sample.<boolean>, *, function (new:0, *=, *=, *=): 0): function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArgument...#487#-428278200", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "setJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNoType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false), new String[][]{{"isObject", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalParameters", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#352#1681603949", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getParameterType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasCachedValues", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalParameters", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "identifyNonNullableName", "java.lang.String", "abc"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "isLastGeneration", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "clearNamedTypes", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative[]"}, new String[]{"<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-1553891203", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canBeCalled", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(a.<*>|boolean) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=fals...#384#-1656173171", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=true, hasDisplayName=true, hasRef...#372#1788465411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "canPropertyBeDefined", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String"}, new String[]{"<sample:6>", "11.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "identifyNonNullableName", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getErrorReporter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.jstype.JSType[]", "<sample:9>", "true", "<sample:3>"}}), new String[][]{{"getPossibleToBooleanOutcomes", "", "0"}, {"getAllExtendedInterfaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNullable", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{"Datee"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "dereference", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameters", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", ""}}), new String[][]{{"isInstanceType", "", "2"}, {"isAllType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNamedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"--2"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "120:45."}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "autobox", new String[]{}, new String[]{}, false), new String[][]{{"getPropertiesCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"oull"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"1.123+44567", "<sample:0>", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{1.123+44567} {getDisplayName=1.123+44567, getNormalizedReferenceName=enum{1.123+44567}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObject...#418#1825342771", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"Eunction"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("{} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=null, hasCachedValues=false, hasDisplayName=false...#381#1397535279", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalParameters", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:4>"}, false), new String[][]{{"getLastChild", "", "2"}, {"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}, {"addChildToFront", "com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("NAME  0 [opt_arg: 1] : * {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=, getSideEffectFlags=0, getSourceFileName=null, getSourceOf...#329#-164876276", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEmptyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getSlot", new String[]{"java.lang.String"}, new String[]{" "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isBooleanValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:4>", "true", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnPropertyNames", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getImplicitPrototype", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getReferenceName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getNativeFunctionType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(boolean|sample.<boolean>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanVal...#395#1201329360", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalParameters", new String[]{"com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}), new String[][]{{"isCase", "", "7"}, {"hasOneChild", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getNativeObjectType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "removeProperty", "java.lang.String", "1.5f"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"-4"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "hasOwnProperty", "java.lang.String", "0x123456789"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-909675094", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isInterface", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesObjectContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isDateType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isPropertyInExterns", "java.lang.String", "-22020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{""}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "clearCachedValues", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getRootNode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"hlobal tchis"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "URHEror1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:7>", "<sample:5>", "<sample:2>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isTheObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", new String[]{}, new String[]{}, false), new String[][]{{"isCheckedUnknownType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNominalConstructor", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "clearResolved", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:9>", "ArrayEvalErr/r", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameters", "java.util.List", "<sample:4>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setPropertyJSDocInfo", new String[]{"java.lang.String", "com.google.javascript.rhino.JSDocInfo"}, new String[]{"URIEror", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "restrictByNotNullOrUndefined", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#405#-1753506400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getConstructor", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "ArrFay"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NullType", actual.getClass().getName());
  assertEquals("null {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=FALSE, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, i...#376#-1239333308", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getParameterType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getPropertyType", "java.lang.String", "SyntaxError12346678901234566T8901234567890"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toMaybeUnionType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"ArrayEvalErr/q", "<sample:4>", "true", "<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"RangeError"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getCtorImplementedInterfaces", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", "boolean", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isObject", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNullable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getSlot", "java.lang.String", "LAZY_EmXPRESSIONS"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
