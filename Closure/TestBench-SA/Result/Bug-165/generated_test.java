package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"5."}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getPropertyNames", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnerFunction", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNumberValueType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "setJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "resetImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:2>", "0xFFFFFFFF", "+1", "-2147483648", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"1.5", "<null>", "true", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getReferenceName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"Title", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"TXvfabc1.5d", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "LAZY_NAMES"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", "com.google.javascript.rhino.jstype.JSType[]", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getErrorReporter", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{"5.TIILE"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "setPropertyJSDocInfo", "java.lang.String,com.google.javascript.rhino.JSDocInfo", "RangeError", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "setResolveMode", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"Range.rror"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:0>", "1.5f", "TITLE", "3000", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "removeProperty", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "PT1H", "<sample:1>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNativeObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"ReferenceError"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"RRangd.rryr"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getTypeOfThis", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getDirectImplementors", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<null>", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "declareType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "Boolean", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"1\rW.hD"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.RecordType", "getParameterType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getPropertyNode", "java.lang.String", "1E-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "isSynthetic", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"4gURIErr5512:30:45010"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "detectImplicitPrototypeCycle", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "hasOwnDeclaredProperty", "java.lang.String", "L\rZAY_NAMES"}, {"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<NoResolvedType> {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=, hasCachedValues=false, hasDispla...#391#1067368609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"h>2120-00N-16", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", "boolean", "true"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "TXvfabc1.5d", "<sample:5>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "0x1F", "<null>", "<null>"}}), new String[][]{{"build", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"", "<sample:6>", "<sample:7>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}}, 1), new String[][]{{"addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"", "<sample:6>", "<sample:7>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "setSynthesized", "boolean", "false"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}}, 1), new String[][]{{"build", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{: *} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=1, getReferenceName=null, hasCachedValues=false, hasDisplayName=fa...#384#1008152380", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"", "<null>", "<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "i", "<sample:6>", "<sample:3>"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}}, 3), new String[][]{{"build", "", "0"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "0"}, {"isCheckedUnknownType", "", "2"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"", "<sample:4>", "<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "gloalhYiis", "<sample:3>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}, {"com.google.javascript.rhino.jstype.RecordTypeBuilder", "build", ""}}), new String[][]{{"build", "", "1"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "0"}, {"getNormalizedReferenceName", "", "5"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPro...#408#-255005673", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "clearNamedTypes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "clearTemplateTypeName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:6>", "<sample:6>"}, false), new String[][]{{"getImplicitPrototype", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:3>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "hasNamespace", "java.lang.String", "1\rW.hD"}}), new String[][]{{"isDateType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:6>", "1E-5", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", new String[]{"com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<null>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createNativeAnonymousObjectType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", "java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "0110", "<sample:6>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:3>", "<sample:4>"}}, 3), new String[][]{{"isArrayType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "setLastGeneration", new String[]{"boolean"}, new String[]{"true"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:4>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "setResolveMode", "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "setTemplateTypeName", "java.lang.String", "global this"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"T71-123t45789/13446", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:0>", "12:31:645"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.jstype.JSType[]", "<sample:5>", "false", "<empty>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalNullableType", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}), new String[][]{{"dereference", "", "3"}, {"getJSDocInfo", "", "7"}, {"getRootNode", "", "1"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "createDelegateSuffix", new String[]{"java.lang.String"}, new String[]{"3000"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(3000)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"1", "<sample:7>", "<sample:3>"}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", "com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:6>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createRecordType", "java.util.Map", "<empty>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:6>", "1.1234567890123456"}}, 3), new String[][]{{"dereference", "", "3"}, {"getJSDocInfo", "", "3"}, {"getIndexType", "", "7"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"310", "<sample:5>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "nvl", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalType", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:7>", "1.123456779012347abYc"}}, 2), new String[][]{{"getPossibleToBooleanOutcomes", "", "0"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createInterfaceType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"0", "<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:0): ? {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getTempla...#402#1833753326", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:1>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getRestrictedTypeGivenToBooleanOutcome", "boolean", "false"}, {"com.google.javascript.rhino.jstype.ObjectType", "toMaybeUnionType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<null>"}}), new String[][]{{"autobox", "", "5"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getOwnSlot", "java.lang.String", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<NoResolvedType> {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=, hasCachedValues=true, hasDisplay...#390#1687814340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:3>", "true", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createObjectType", "com.google.javascript.rhino.jstype.ObjectType", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameterizedType", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "Errog"}}), new String[][]{{"getOwnSlot", "java.lang.String", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>"}, true), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}, {"isAllType", "", "3"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "findCommonSuperObject", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>", "<sample:8>"}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "overwriteDeclaredType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "0", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.jstype.JSType[]", "<sample:2>", "false", "<sample:0>"}}, 3), new String[][]{{"hasOwnProperty", "java.lang.String", "5"}, {"getPropertiesCount", "", "3"}, {"getDisplayName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Object", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "identifyNonNullableName", new String[]{"java.lang.String"}, new String[]{"LAZY_EXPRESSIONS"}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", "java.lang.String", "5.TIILE"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"LAZ_EXXPRESTIONS", "", "-2147479435", "61"}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "isForwardDeclaredType", "java.lang.String", "16.12345671e100x123456789"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:0>", "<sample:7>", "<empty>"}}, 1), new String[][]{{"getParentScope", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"1", "Object", "2147483647", "10"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", "com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.StaticScope", "<sample:9>", "8.s5g", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "RoouFv.Ne30M020,02-30T25:61:61", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", "com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:4>", "<empty>"}}, 1), new String[][]{{"isArrayType", "", "6"}, {"isEnumElementType", "", "6"}, {"getOwnPropertyJSDocInfo", "java.lang.String", "0"}, {"clearCachedValues", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("1 {canBeCalled=true, getDisplayName=1, getNormalizedReferenceName=1, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=1, hasCachedValues=false, hasDisplayName=true, h...#377#97696031", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"String", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "String", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "prototype", "<sample:0>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "prototype"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", new String[]{"java.lang.String", "java.lang.String", "int", "int"}, new String[]{"RegExp", "Object", "-2147483648", "-1"}, false), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("RegExp {canBeCalled=true, getDisplayName=RegExp, getNormalizedReferenceName=RegExp, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=RegExp, hasCachedValues=true, hasDisplayNa...#387#1640200718", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:4>", "<empty>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "clearTemplateTypeName", ""}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "isForwardDeclaredType", "java.lang.String", "URIDrrorString"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): * {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getTempla...#405#-278603590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:6>", "<sample:4>", "<empty>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewThisType", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): * {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getTempla...#405#-278603590", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:10>", "URIDrqorString", "<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewReturnType", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "setResolveMode", "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "nullA", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:10>", "vualEqtf1312:30:45ReferenceError", "<sample:0>"}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resetImplicitPrototype", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.ObjectType", "<sample:5>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createOptionalType", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "declareType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "-0.0EvalError", "<sample:0>"}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:12>", "F.1.5f", "<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "setResolveMode", "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode", "<sample:0>"}}), new String[][]{{"hasDisplayName", "", "7"}, {"getCtorExtendedInterfaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFromTypeNodes", new String[]{"com.google.javascript.rhino.Node", "java.lang.String", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:12>", "h>2120-0N-16", "<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", ""}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:24>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "canPropertyBeDefined", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:2>", "*ofeegJ"}}, 1), new String[][]{{"isObject", "", "2"}, {"findPropertyType", "java.lang.String", "3"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "hasCachedValues", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:4>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:0>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<null>"}}, 1), new String[][]{{"getPrototype", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", "com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:1>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<null>"}}, 1), new String[][]{{"getPrototype", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:2>", "false", "<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "123456789012345678901234567890"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", "com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:0>", "<sample:2>"}}, 1), new String[][]{{"getPrototype", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "collapseUnion", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "toMaybeRecordType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isStringObjectType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"a", "<sample:2>", "<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"aaUDt:-1.5", "<sample:0>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<null>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<null>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", "java.lang.String,java.lang.String,int,int", "LAZY_EXPRESSIONS", "Function", "3000", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", "java.lang.String,java.lang.String,int,int", "LAZY_EXPRESSIONS", "Function", "3000", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#354#1652651458", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", "java.lang.String,java.lang.String,int,int", "LAZY_EXPRESSIONS", "Function", "3000", "10"}}, 3), new String[][]{{"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("83", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", "java.lang.String,java.lang.String,int,int", "LAZY_EXPRESSIONS", "Function", "3000", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", "java.lang.String,java.lang.String,int,int", "LAZY_EXPRESSIONS", "Function", "3000", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getJSDocInfo", ""}, {"com.google.javascript.rhino.jstype.RecordType", "dereference", ""}, {"com.google.javascript.rhino.jstype.RecordType", "isStringObjectType", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"2020-01-01", "<sample:2>", "<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{2020-01-01} {getDisplayName=2020-01-01, getNormalizedReferenceName=enum{2020-01-01}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObjectTyp...#415#922486511", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"2120-01-01", "<sample:2>", "<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{2120-01-01} {getDisplayName=2120-01-01, getNormalizedReferenceName=enum{2120-01-01}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObjectTyp...#415#1167020658", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h2120-01-01", "<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "3000"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:8>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{h2120-01-01} {getDisplayName=h2120-01-01, getNormalizedReferenceName=enum{h2120-01-01}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObject...#418#989430680", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h2120-0N-01", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "3000"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:8>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{h2120-0N-01} {getDisplayName=h2120-0N-01, getNormalizedReferenceName=enum{h2120-0N-01}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObject...#418#-391653253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h2120-0N-16", "<sample:3>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "300null"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:3>", "<sample:5>"}}, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getGreatestSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getGreatestSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "toMaybeUnionType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=true...#401#1829888256", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<NoResolvedType> {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=, hasCachedValues=false, hasDispla...#391#1067368609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isEnumElementType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isEnumElementType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<null> {canBeCalled=false, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasDisplayName=true, ha...#376#-809063659", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isEnumElementType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isEnumElementType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<boolean> {canBeCalled=false, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasDisplayName=true,...#379#117614032", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "hashCode", ""}, {"com.google.javascript.rhino.jstype.RecordType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "TypeError"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "TypeError"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "TypeError"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "TypeError"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"nullnull", "<null>", "true", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getReferenceName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"1L", "<sample:4>", "true", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getReferenceName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.util.List"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "shouldTolerateUndefinedValues", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "0", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "isForwardDeclaredType", "java.lang.String", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.12345678", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "isForwardDeclaredType", "java.lang.String", "tsue"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "toMaybeEnumType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{""}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:2>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.RecordType", "isString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"global this", "<sample:2>", "false", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "setValidator", "com.google.common.base.Predicate", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesStringContext", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isArrayType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "getImplicitPrototype", ""}, {"com.google.javascript.rhino.jstype.RecordType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "1.5e300", "<sample:0>", "false", "<sample:7>"}}, 3), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isArrayType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "collapseUnion", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isArrayType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "collapseUnion", ""}}, 2), new String[][]{{"hasProperty", "java.lang.String", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getDisplayName", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "EvalError", "<sample:1>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getDisplayName", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "EvalError", "<sample:1>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=true, hasDisplayName=true, hasRef...#372#1788465411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getDisplayName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.ObjectType", "equals", "java.lang.Object", "<sample:1>"}, {"com.google.javascript.rhino.jstype.ObjectType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "EvalError", "<sample:1>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=true, hasDisplayName=true...#380#-1143466182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getDisplayName", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.ObjectType", "equals", "java.lang.Object", "<sample:1>"}, {"com.google.javascript.rhino.jstype.ObjectType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "EvalError", "<sample:1>", "true", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, hasDisp...#392#-991685635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"Range.rror"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:0>", "1.5f", "TITLE", "3000", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"--1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"prottotype"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:0>", "1.5f", "TITLE", "3000", "-1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isVoidType", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isBooleanValueType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getNormalizedReferenceName", ""}, {"com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{-909675094}", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{0}", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{97}", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{48}", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{-909675094}", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"1\rW.hD"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isStringValueType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "EvalError", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isStringValueType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "EvalError", "<sample:1>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.ObjectType", "hasDisplayName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNoResolvedType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isFunctionPrototypeType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "toMaybeUnionType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "setLastGeneration", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "true", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (boolean, ...[sample.<boolean>]): * {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=1, getNormalizedReferenceName=null, getPo...#442#-1991925529", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (boolean, sample.<boolean>): * {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2, getMinArguments=2, getNormalizedReferenceName=null, getPossibleToBoolea...#428#585231374", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<sample:2>"}}), new String[][]{{"getPrototype", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", new String[]{"com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.jstype.JSType[]"}, new String[]{"<sample:0>", "false", "<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<null>"}}), new String[][]{{"getPrototype", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{" "}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNumberObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"--1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isStringObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "collapseUnion", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "toMaybeRecordType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isStringObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "collapseUnion", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "toMaybeRecordType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isStringObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"1L", "<null>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createParameters", "com.google.javascript.rhino.jstype.JSType[]", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createRecordType", new String[]{"java.util.Map"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=true, hasDisplayName=f...#384#1901214606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=true, hasDisplayName=true, hasRef...#372#1788465411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=true...#401#1829888256", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, hasDisp...#392#-991685635", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=true, hasDisplayName=true...#380#-1143466182", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<null> {canBeCalled=false, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=true, hasDisplayName=true, has...#375#87035420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<NoResolvedType> {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=, hasCachedValues=true, hasDisplay...#390#1687814340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNoObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "hasReferenceName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "clearResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setPropertyJSDocInfo", "java.lang.String,com.google.javascript.rhino.JSDocInfo", "-1", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "null"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayStoreException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createParametersWithVarArgs", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", "com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createConstructorType", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType[]", "<null>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createNamedType", "java.lang.String,java.lang.String,int,int", "LAZY_EXPRESSIONS", "Function", "3000", "10"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("PARAM_LIST {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1,...#354#1652651458", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isRecordType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "isStringObjectType", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isRecordType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "isStringObjectType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "setOwnerFunction", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "setOwnerFunction", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "setOwnerFunction", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"2120-01-01", "<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "3000"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{2120-01-01} {getDisplayName=2120-01-01, getNormalizedReferenceName=enum{2120-01-01}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObjectTyp...#415#1167020658", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h2120-0N-01", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "300"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:8>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{h2120-0N-01} {getDisplayName=h2120-0N-01, getNormalizedReferenceName=enum{h2120-0N-01}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObject...#418#-391653253", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"i"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h2120-0N-016", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "300null"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:8>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{h2120-0N-016} {getDisplayName=h2120-0N-016, getNormalizedReferenceName=enum{h2120-0N-016}, getPossibleToBooleanOutcomes=TRUE, hasDisplayName=true, isAllType=false, isArrayType=false, isBooleanObj...#421#1226120229", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h2120-0N-016", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "300null"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:8>", "<sample:6>"}}), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h2120-0N-016", "<sample:3>", "<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "300null"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:3>", "<sample:5>"}}), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createEnumType", new String[]{"java.lang.String", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"h>2120-0N-16", "<sample:0>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getTypesWithProperty", "java.lang.String", "300null"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:3>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getResolveMode", ""}}), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "clearTemplateTypeName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "hasDisplayName", ""}, {"com.google.javascript.rhino.jstype.RecordType", "matchesNumberContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "hasDisplayName", ""}, {"com.google.javascript.rhino.jstype.RecordType", "matchesNumberContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isUnionType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isDateType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=true, h...#398#-1929824705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnerFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNumberValueType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnerFunction", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNumberValueType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnerFunction", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNumberValueType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getOwnerFunction", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "toMaybeRecordType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isNumberValueType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getJSDocInfo", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNullable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getDisplayName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resetForTypeCheck", ""}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createDefaultObjectUnion", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasDisplayName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasDisplayName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasDisplayName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasDisplayName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasDisplayName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toAnnotationString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "autoboxesTo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getNormalizedReferenceName", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "getImplicitPrototype", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "TypeError"}, {"com.google.javascript.rhino.jstype.ObjectType", "getConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "Type-rror"}, {"com.google.javascript.rhino.jstype.ObjectType", "getConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNominalType", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "resetImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:0>", "<null>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "isForwardDeclaredType", "java.lang.String", "abc"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"Title"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "hashCode", ""}, {"com.google.javascript.rhino.jstype.RecordType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getOwnPropertyJSDocInfo", "java.lang.String", "TypeError"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string {canBeCalled=true, getDisplayName=Date, getExtendedInterfacesCount=0, getMaxArguments=7, getMinArguments=0, getNormalizedReferenceName=Date, get...#443#-1228474675", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Date {canBeCalled=false, getDisplayName=Date, getNormalizedReferenceName=Date, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Date, hasCachedValues=false, hasDisplayName=tru...#380#1293412339", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNumberObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isTemplateType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "resetImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createUnionType", "com.google.javascript.rhino.jstype.JSTypeNative[]", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "overwriteDeclaredType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "1.1234567890123456", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getConstructor", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordTypeBuilder", "com.google.javascript.rhino.jstype.RecordTypeBuilder", "addProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"URIError", "<sample:5>", "<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordTypeBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"1.5", "<null>", "false", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasReferenceName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasReferenceName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasReferenceName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "hasReferenceName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "0", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewReturnType", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "unregisterPropertyOnType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "0", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithNewReturnType", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "toMaybeRecordType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isStringValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{-909675094}", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"TiXle", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"TiXle", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "canPropertyBeDefined", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:1>", "1.5d"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createAnonymousObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "registerPropertyOnType", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"TiXveabc1.5d", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getGreatestSubtypeWithProperty", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:5>", "LAZY_NAMES"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"1.5d"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:2>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.RecordType", "isString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "unboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "toMaybeEnumType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "unboxesTo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "toMaybeEnumType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "unboxesTo", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "unboxesTo", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=fals...#402#1679766705", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "unboxesTo", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"global this", "<sample:0>", "true", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"global this", "<sample:0>", "true", "<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "setValidator", "com.google.common.base.Predicate", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createArrowType", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "canPropertyBeDefined", "com.google.javascript.rhino.jstype.JSType,java.lang.String", "<sample:4>", "Date"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getErrorReporter", ""}}), new String[][]{{"isNoObjectType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{"TiXle"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.RecordType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.RecordType", "isArrayType", ""}}), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "resetForTypeCheck", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isInstanceType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "removeProperty", "java.lang.String", "1"}, {"com.google.javascript.rhino.jstype.ObjectType", "isNominalConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.RecordType"}, new String[]{"<sample:3>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "clearCachedValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "matchesInt32Context", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "setResolveMode", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode"}, new String[]{"<sample:1>"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-1102074180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isStringObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"RangeError"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:0>", "1.5f", "TITLE", "3000", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"Range.rror"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:0>", "1.5f", "TITLE", "3000", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"Rgan7ge/rror"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:0>", "1.5f", "TITLE", "3000", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "forwardDeclareType", new String[]{"java.lang.String"}, new String[]{"pXrottoatgpe"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "resolveTypesInScope", "com.google.javascript.rhino.jstype.StaticScope", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionTypeWithVarArgs", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.jstype.JSType,java.util.List", "<sample:1>", "<sample:6>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "getType", "com.google.javascript.rhino.jstype.StaticScope,java.lang.String,java.lang.String,int,int", "<sample:0>", "1.5g", "TITLE", "3040", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isAllType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"null", "<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isRegexpType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<empty>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getCtorImplementedInterfaces", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toAnnotationString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("boolean", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toAnnotationString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample.<boolean>", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getNativeObjectType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getNativeObjectType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasCachedValues=false, hasDis...#392#-1913800589", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getOwnerFunction", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"ReferencfError"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasDisplayName=t...#384#-1663040400", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"1E.5"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getTypeOfThis", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isEnumType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "hasDisplayName", ""}}), new String[][]{{"isBooleanValueType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.<0> {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasDisplayName=tru...#381#-299907657", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"RReferemcf010"}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "getTypeOfThis", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isEnumType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "hasDisplayName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<*> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasDis...#393#110322004", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isVoidType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isInterface", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isPropertyInExterns", "java.lang.String", "RRangd.rryr"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumberObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumberObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "matchesObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isNumberObjectType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "matchesObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#413#-2141679277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, true), new String[][]{{"hasInstanceType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "createFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "hasNamespace", "java.lang.String", "null"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "incrementGeneration", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"1.25"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isNumber", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getNormalizedReferenceName", ""}, {"com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNoType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "isNoObjectType", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNoType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "matchesStringContext", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", ".<sample.<boolean>> {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasCachedValues=false, hasDisplayName=...#385#-907157737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "isNoType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getDirectImplementors", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<null>", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "declareType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "Boomean", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSTypeRegistry", "com.google.javascript.rhino.jstype.JSTypeRegistry", "getDirectImplementors", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSTypeRegistry", "registerTypeImplementingInterface", "com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.jstype.ObjectType", "<null>", "<null>"}, {"com.google.javascript.rhino.jstype.JSTypeRegistry", "declareType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "Booean", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.AbstractMultimap$WrappedSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{shouldTolerateUndefinedValues=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "removeProperty", new String[]{"java.lang.String"}, new String[]{"true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, ...#399#1092781906", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.jstype.EnumElementType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.ObjectType", "setOwnerFunction", "com.google.javascript.rhino.jstype.FunctionType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.ObjectType", "isFunctionType", ""}, {"com.google.javascript.rhino.jstype.ObjectType", "getPropertyType", "java.lang.String", "LAZY_EPRESSSINS1.12345678901234567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a.<*> {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasCachedValues=false, hasDisplayName=true, hasRe...#373#395658510", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getOwnPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasCachedValues=true...#403#-479651172", SearchInputFactory_scaffolding.receiverState());
 }
}
