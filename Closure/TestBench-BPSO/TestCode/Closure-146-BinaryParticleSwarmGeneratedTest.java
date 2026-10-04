package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullable", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isEmptyType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTemplateType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNamedType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedValu...#395#-1657693781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isResolved", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:6>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType...#388#1486450962", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "findPropertyType", "java.lang.String", "1F-5"}}), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isOrdinaryFunction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<sample:9>"}, true), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forgiveUnknownNames", ""}}, 3), new String[][]{{"isNumber", "", "7"}, {"isUnknownType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:7>"}, true), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:4>", "<sample:8>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "3"}, {"getJSDocInfo", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isStringValueType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "3"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:6>"}, true), new String[][]{{"matchesStringContext", "", "3"}, {"clearResolved", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("{canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDateT...#366#1024313498", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:3>", "<sample:5>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "1"}, {"isCheckedUnknownType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedV...#398#-1799864820", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:12>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:2>"}, true), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:7>"}, true), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedValu...#395#-1657693781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(function (this:Array, ...[*]): Array|sample.<boolean>) {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, ...#422#130308888", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:6>"}, true), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}, {"getReferencedType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasReferenceName=false, isAllType=false, isArrayType=false, isBooleanO...#371#-948494644", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "clearResolved", ""}}, 1), new String[][]{{"matchesInt32Context", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNumberValueType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesNumberContext", ""}}), new String[][]{{"matchesObjectContext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:11>"}, true), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "5"}, {"isBooleanObjectType", "", "1"}, {"hasOwnProperty", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:12>"}, false), new String[][]{{"findPropertyType", "java.lang.String", "2"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:7>"}, true), new String[][]{{"isNullType", "", "3"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false), new String[][]{{"isAllType", "", "6"}, {"dereference", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {getPossibleToBooleanOutcomes=TRUE, getReferenceName=Boolean, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=true, isBooleanValueType=false, isCheckedUnknownTyp...#383#1149601129", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:9>"}, true), new String[][]{{"isFunctionPrototypeType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:3>"}, true), new String[][]{{"isCheckedUnknownType", "", "3"}, {"contains", "com.google.javascript.rhino.jstype.JSType", "0"}, {"findPropertyType", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:11>"}, true), new String[][]{{"isString", "", "2"}, {"matchesUint32Context", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:13>"}, true), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:14>"}}, 2), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRecordType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesUint32Context", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isDateType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:0>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:2>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullable", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullable", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}, {"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isDateType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnionType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesObjectContext", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toObjectType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnknownType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "clearResolved", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canBeCalled", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "clearResolved", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toObjectType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNamedType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isArrayType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "restrictByNotNullOrUndefined", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:2>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"Hello, World"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNominalType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullable", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNoType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumber", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isConstructor", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:4>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "clearResolved", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesObjectContext", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "clearResolved", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesInt32Context", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isStringValueType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumElementType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "equals", "java.lang.Object", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "isEnumType", ""}}, 1), new String[][]{{"isBooleanObjectType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isBooleanValueType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnknownType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isArrayType", ""}}, 3), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "4"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNominalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStringValueType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSType", "findPropertyType", "java.lang.String", "x1F"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "dereference", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "dereference", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autoboxesTo", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNamedType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesUint32Context", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autoboxesTo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isCheckedUnknownType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:10>", "<sample:5>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"mull"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnionType", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isOrdinaryFunction", ""}}, 2), new String[][]{{"autoboxesTo", "", "4"}, {"isBooleanValueType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNamedType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isRecordType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesInt32Context", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEmptyType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumElementType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"btrue"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanValueType", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:10>", "<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNullable", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "autoboxesTo", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isInstanceType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSType", "unboxesTo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false), new String[][]{{"isBooleanValueType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canBeCalled", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNominalType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autoboxesTo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEmptyType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "isBooleanValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isDateType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isCheckedUnknownType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:0>"}, true), new String[][]{{"getPossibleToBooleanOutcomes", "", "2"}, {"isNoType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toObjectType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"i"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forgiveUnknownNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSType", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNoType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "clearResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isOrdinaryFunction", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoObjectType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType...#388#1486450962", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:8>", "<sample:2>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesInt32Context", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:0>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumberValueType", ""}, {"com.google.javascript.rhino.jstype.JSType", "toObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumber", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isArrayType", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isStringObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesUint32Context", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionPrototypeType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:10>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType=false,...#381#740315998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forgiveUnknownNames", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false), new String[][]{{"isRegexpType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasCachedValues=false, hasReferenceName=false, isAllType=false, isArrayType=false, isBoolea...#372#-1346704679", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnionType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isTheObjectType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesNumberContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forgiveUnknownNames", ""}, {"com.google.javascript.rhino.jstype.JSType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedValu...#395#-1657693781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionPrototypeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.JSType", "dereference", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesStringContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isVoidType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "dereference", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isVoidType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:5>"}, true), new String[][]{{"isNoObjectType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRecordType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:0>"}, true), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanOb...#370#-636042044", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<null>", "<sample:7>"}}), new String[][]{{"isNullable", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:2>"}, true), new String[][]{{"getCtorImplementedInterfaces", "", "3"}, {"asList", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isConstructor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRecordType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:3>"}, true), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:11>", "<sample:5>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedV...#398#-1799864820", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "unboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isDateType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumberValueType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "findPropertyType", "java.lang.String", "trave"}, {"com.google.javascript.rhino.jstype.JSType", "isFunctionType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesObjectContext", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isVoidType", ""}}), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType=false,...#381#740315998", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "hashCode", ""}, {"com.google.javascript.rhino.jstype.JSType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNoType", ""}}), new String[][]{{"resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "7"}, {"isCheckedUnknownType", "", "6"}, {"isArrayType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}), new String[][]{{"isObject", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:2>", "<sample:7>"}, false, 4, new String[][]{}), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isDateType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStringValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "dereference", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isAllType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getJSDocInfo", ""}, {"com.google.javascript.rhino.jstype.JSType", "findPropertyType", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStringObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:6>"}, true), new String[][]{{"getOwnPropertyJSDocInfo", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "dereference", ""}}), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:Array, ...[*]): Array {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceTyp...#408#668742530", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNullable", ""}, {"com.google.javascript.rhino.jstype.JSType", "canBeCalled", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"autoboxesTo", "", "7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:1>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:9>", "<sample:1>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}), new String[][]{{"isConstructor", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:6>"}}, 2), new String[][]{{"clearResolved", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStringValueType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.JSType", "canBeCalled", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoObjectType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesStringContext", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2), new String[][]{{"isNumberObjectType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "clearResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionPrototypeType", ""}, {"com.google.javascript.rhino.jstype.JSType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<null>", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false), new String[][]{{"isCheckedUnknownType", "", "6"}, {"isNumber", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesInt32Context", ""}, {"com.google.javascript.rhino.jstype.JSType", "isCheckedUnknownType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isArrayType", ""}}), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNominalType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNullType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isBooleanObjectType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasReferenceName=false, isAllType=false, isArrayType=false, isBooleanO...#371#-948494644", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forgiveUnknownNames", ""}, {"com.google.javascript.rhino.jstype.JSType", "dereference", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}), new String[][]{{"isResolved", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toObjectType", ""}}, 1), new String[][]{{"isEmptyType", "", "4"}, {"isFunctionType", "", "3"}, {"isBooleanValueType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:2>", "<sample:6>", "<sample:5>"}, true), new String[][]{{"isBooleanObjectType", "", "7"}, {"testForEquality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canBeCalled", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:4>", "<sample:3>"}}, 3), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toDebugHashCodeString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNamedType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("{canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDateT...#366#1024313498", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEmptyType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isArrayType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasReferenceName=false, isAllType=false, isArrayType=false, isBooleanO...#371#-948494644", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:8>", "<sample:4>", "<sample:2>"}, true), new String[][]{{"isConstructor", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "equals", "java.lang.Object", "<i:18>"}, {"com.google.javascript.rhino.jstype.JSType", "isNullable", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isCheckedUnknownType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesUint32Context", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"canBeCalled", "", "3"}, {"hasProperty", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionType", ""}, {"com.google.javascript.rhino.jstype.JSType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}}, 2), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"findPropertyType", "java.lang.String", "6"}, {"getMinArguments", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:2>", "<sample:0>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"isNoObjectType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberObjectType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canBeCalled", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumElementType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:10>"}, true), new String[][]{{"isBooleanValueType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNamedType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forgiveUnknownNames", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesStringContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:8>"}, true, 0, null, 3), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getJSDocInfo", ""}, {"com.google.javascript.rhino.jstype.JSType", "isOrdinaryFunction", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayType...#388#1486450962", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autoboxesTo", ""}}), new String[][]{{"isAllType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false), new String[][]{{"isAllType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isInstanceType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isVoidType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedV...#398#-1799864820", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:5>"}}), new String[][]{{"isEnumElementType", "", "3"}, {"isCheckedUnknownType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.receiverState());
 }
}
