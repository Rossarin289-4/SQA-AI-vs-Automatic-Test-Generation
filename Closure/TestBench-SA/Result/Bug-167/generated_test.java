package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "isParameterizedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "setValidator", "com.google.common.base.Predicate", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSType", "matchesNumberContext", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesUint32Context", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canAssignTo", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchConstraint", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeTemplateType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "autobox", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStringValueType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}}), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "1"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}}), new String[][]{{"findPropertyType", "java.lang.String", "1"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"getImplicitPrototype", "", "0"}, {"hasOwnProperty", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}, {"com.google.javascript.rhino.jstype.JSType", "hasAnyTemplateInternal", ""}}), new String[][]{{"getJSDocInfo", "", "5"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEmptyType", ""}, {"com.google.javascript.rhino.jstype.JSType", "autoboxesTo", ""}}), new String[][]{{"isBooleanObjectType", "", "2"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"getImplicitPrototype", "", "5"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>"}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSType", "isNominalConstructor", ""}}, 3), new String[][]{{"isArrayType", "", "3"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"getImplicitPrototype", "", "5"}, {"hasDisplayName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}}, 1), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "6"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "isString", ""}}), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "6"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeParameterizedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "isString", ""}}, 1), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "0"}, {"findPropertyType", "java.lang.String", "2"}, {"getImplicitPrototype", "", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.rhino.jstype.JSType", "isString", ""}}, 3), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "4"}, {"isParameterizedType", "", "2"}, {"getPropertyNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:3>"}, true), new String[][]{{"getOwnPropertyNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplate=false, h...#402#-343326203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:22>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNominalConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "isFunctionType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeTemplateType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getPossibleToBooleanOutcomes", "", "0"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeParameterizedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:15>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autobox", ""}, {"com.google.javascript.rhino.jstype.JSType", "equals", "java.lang.Object", "<sample:0>"}}, 3), new String[][]{{"isNominalConstructor", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:21>"}, {"com.google.javascript.rhino.jstype.JSType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}, {"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:22>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toString", new String[]{}, new String[]{}, false, 40, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}, {"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:11>", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}, {"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:22>"}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:22>", "<sample:13>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "1", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:5>", "<null>", "true"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:8>", ".51P.1234567", "true"}}, 2), new String[][]{{"clearResolved", "", "1"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0> {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false...#449#-408295756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumber", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:21>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:24>"}, {"com.google.javascript.rhino.jstype.JSType", "isCheckedUnknownType", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:21>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 1), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "1"}, {"autobox", "", "0"}, {"getOwnPropertyJSDocInfo", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:16>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:7>", "false"}}), new String[][]{{"isNominalConstructor", "", "3"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:15>", "<sample:0>", "<sample:5>"}, true), new String[][]{{"isStringValueType", "", "0"}, {"isStringValueType", "", "3"}, {"isNominalConstructor", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isVoidType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNumberValueType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1), new String[][]{{"getPossibleToBooleanOutcomes", "", "4"}, {"canBeCalled", "", "0"}, {"clearResolved", "", "2"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<null>", "<sample:4>", "<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:24>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:24>"}, true), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:25>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<null>", "true"}}, 3), new String[][]{{"isNullable", "", "2"}, {"autoboxesTo", "", "5"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false,...#401#-97467891", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:28>", "<sample:17>"}, true), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:17>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "1"}, {"getDisplayName", "", "6"}, {"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:28>", "<sample:22>"}, true, 0, null, 2), new String[][]{{"isEmptyType", "", "1"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "7"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}, {"hasAnyTemplate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:21>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toAnnotationString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:29>", "<sample:6>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumType", actual.getClass().getName());
  assertEquals("enum{sample} {getDisplayName=sample, getNormalizedReferenceName=enum{sample}, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasDisplayName=true, isAllType=false, isArrayType=false, isBoolea...#403#-783365067", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:28>"}, true, 0, null, 3), new String[][]{{"getDisplayName", "", "2"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "6"}, {"getImplementedInterfaces", "", "5"}, {"listIterator", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:5>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:1>"}}, 3), new String[][]{{"isResolved", "", "6"}, {"isTemplateType", "", "2"}, {"isGlobalThisType", "", "0"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isGlobalThisType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isResolved", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isNoResolvedType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "hasAnyTemplate", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSType", "isUnionType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNullable", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "hasAnyTemplate", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "hashCode", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autobox", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autobox", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNumberObjectType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isVoidType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isVoidType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toString", ""}, {"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isVoidType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toString", ""}, {"com.google.javascript.rhino.jstype.JSType", "isString", ""}, {"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesUint32Context", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesUint32Context", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "restrictByNotNullOrUndefined", ""}, {"com.google.javascript.rhino.jstype.JSType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSType", "clearResolved", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesObjectContext", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isCheckedUnknownType", ""}, {"com.google.javascript.rhino.jstype.JSType", "autobox", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNominalType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isOrdinaryFunction", ""}, {"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberValueType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:8>"}, {"com.google.javascript.rhino.jstype.JSType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumElementType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumElementType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "restrictByNotNullOrUndefined", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumElementType", new String[]{}, new String[]{}, false, 20, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}, {"com.google.javascript.rhino.jstype.JSType", "restrictByNotNullOrUndefined", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeUnionType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "autobox", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "autoboxesTo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isOrdinaryFunction", ""}, {"com.google.javascript.rhino.jstype.JSType", "toMaybeParameterizedType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumberObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumberObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}, {"getCtorImplementedInterfaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isResolved", ""}}, 1), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}, {"hasDisplayName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}, {"getCtorImplementedInterfaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeUnionType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isRecordType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1), new String[][]{{"collapseUnion", "", "3"}, {"getAllImplementedInterfaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 1), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}, {"getCtorImplementedInterfaces", "", "0"}, {"contains", "java.lang.Object", "6"}, {"add", "int,java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "restrictByNotNullOrUndefined", ""}}, 1), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}, {"getCtorImplementedInterfaces", "", "0"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isBooleanObjectType", ""}}, 2), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "1"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "4"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}}, 2), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "4"}, {"getImplicitPrototype", "", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "toStringHelper", "boolean", "true"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}}, 2), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "4"}, {"getImplicitPrototype", "", "1"}, {"getCtorImplementedInterfaces", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "hashCode", ""}}, 2), new String[][]{{"collapseUnion", "", "1"}, {"collapseUnion", "", "2"}, {"getDisplayName", "", "1"}, {"getAllImplementedInterfaces", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNoObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "matchesInt32Context", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "hashCode", ""}}, 2), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "1"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 2), new String[][]{{"collapseUnion", "", "1"}, {"collapseUnion", "", "2"}, {"getExtendedInterfaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 2), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}, {"getImplicitPrototype", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}}, 1), new String[][]{{"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}, {"getImplicitPrototype", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesUint32Context", ""}, {"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}}, 3), new String[][]{{"isTemplateType", "", "1"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesUint32Context", ""}, {"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}, 3), new String[][]{{"isTemplateType", "", "1"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}, 3), new String[][]{{"isEmptyType", "", "1"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}, {"getImplicitPrototype", "", "1"}, {"getParameterType", "", "4"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}, 3), new String[][]{{"isEnumElementType", "", "1"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}, {"getImplicitPrototype", "", "1"}, {"getPropertyType", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInstanceType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:12>"}, {"com.google.javascript.rhino.jstype.JSType", "isInterface", ""}}, 3), new String[][]{{"hasDisplayName", "", "1"}, {"collapseUnion", "", "2"}, {"getExtendedInterfaces", "", "1"}, {"listIterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isInterface", ""}}, 3), new String[][]{{"isTemplateType", "", "1"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "2"}, {"isEnumElementType", "", "1"}, {"isFunctionType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}, 3), new String[][]{{"isEnumElementType", "", "1"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}, {"getImplicitPrototype", "", "3"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}, 3), new String[][]{{"hasDisplayName", "", "1"}, {"collapseUnion", "", "2"}, {"getExtendedInterfaces", "", "3"}, {"addAll", "int,java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}}, 3), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}, {"findPropertyType", "java.lang.String", "2"}, {"getExtendedInterfaces", "", "0"}, {"asList", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}}, 3), new String[][]{{"isArrayType", "", "5"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"getImplicitPrototype", "", "0"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "unboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isBooleanValueType", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeUnionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autobox", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.JSType", "isString", ""}}, 2), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "6"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "unboxesTo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNullType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isVoidType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEmptyType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "dereference", new String[]{}, new String[]{}, false, 23, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoObjectType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:11>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}, 2), new String[][]{{"getIndexType", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:11>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:11>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:17>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=Boolean, getPossibleToBoole...#428#-973281540", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:12>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnionType", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isGlobalThisType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "autobox", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "isParameterizedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "isParameterizedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSType", "isParameterizedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isParameterizedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeEnumElementType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "equals", "java.lang.Object", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeUnionType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeFunctionType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRegexpType", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:6>"}, {"com.google.javascript.rhino.jstype.JSType", "isResolved", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isTemplateType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "hasAnyTemplate", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "hasAnyTemplate", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.JSType", "isNullable", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isDateType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "\t", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:0>", "a,b,c", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:5>", "false"}}), new String[][]{{"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<null>", "true"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:5>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isParameterizedType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getJSDocInfo", ""}, {"com.google.javascript.rhino.jstype.JSType", "autobox", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isVoidType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEmptyType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEmptyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNominalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.JSType", "isStringObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "hasAnyTemplateInternal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnionType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNullType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumber", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autobox", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNominalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autobox", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNominalType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isStringValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isOrdinaryFunction", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Date {canBeCalled=false, getDisplayName=Date, getNormalizedReferenceName=Date, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Date, hasAnyTemplate=false, hasCachedValues=fal...#385#1520101832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:6>"}}), new String[][]{{"getJSDocInfo", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:6>"}}), new String[][]{{"getPropertiesCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Error {canBeCalled=false, getDisplayName=Error, getNormalizedReferenceName=Error, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Error, hasAnyTemplate=false, hasCachedValues...#389#-1753144770", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEmptyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSType", "isInterface", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:6>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNamedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNominalConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "hasDisplayName", ""}, {"com.google.javascript.rhino.jstype.JSType", "isString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"abc"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "toMaybeParameterizedType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isStringValueType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isEnumType", ""}, {"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toAnnotationString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNamedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeFunctionType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStringValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toDebugHashCodeString", ""}, {"com.google.javascript.rhino.jstype.JSType", "isBooleanObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isParameterizedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isStringValueType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberValueType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeParameterizedType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberValueType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}, {"com.google.javascript.rhino.jstype.JSType", "matchesInt32Context", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:2>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<null>", "false"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "1", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeEnumType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumElementType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getJSDocInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.JSType", "isGlobalThisType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:9>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.JSType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeParameterizedType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isEnumType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNoType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}, {"com.google.javascript.rhino.jstype.JSType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}), new String[][]{{"getJSDocInfo", "", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "collapseUnion", ""}, {"com.google.javascript.rhino.jstype.JSType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}), new String[][]{{"autoboxesTo", "", "0"}, {"isInterface", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "unboxesTo", ""}, {"com.google.javascript.rhino.jstype.JSType", "canBeCalled", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getDisplayName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<Any Type>", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplate=false, h...#402#-343326203", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canAssignTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplate=false, ha...#411#2132441934", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}}), new String[][]{{"getPropertyNode", "java.lang.String", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}}), new String[][]{{"isGlobalThisType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.JSType", "isAllType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}}), new String[][]{{"getParameters", "", "6"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTemplateType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "autobox", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.JSType", "isConstructor", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoResolvedType", actual.getClass().getName());
  assertEquals("NoResolvedType {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY,...#422#973243188", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNumberObjectType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNoType", ""}, {"com.google.javascript.rhino.jstype.JSType", "hasAnyTemplate", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isGlobalThisType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "hasDisplayName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoResolvedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNoType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNominalConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isNullable", ""}}), new String[][]{{"getPossibleToBooleanOutcomes", "", "1"}, {"findPropertyType", "java.lang.String", "2"}, {"getDisplayName", "", "3"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isRegexpType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}}), new String[][]{{"findPropertyType", "java.lang.String", "5"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"getImplicitPrototype", "", "0"}, {"getSuperClassConstructor", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Object, *=): ? {canBeCalled=true, getDisplayName=Object, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=0, getNormalizedReferenceName=Object, getPossibleToBooleanOutcom...#420#1304939934", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeTemplateType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeFunctionType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEnumElementType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isEmptyType", ""}, {"com.google.javascript.rhino.jstype.JSType", "isFunctionType", ""}}), new String[][]{{"isResolved", "", "2"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isResolved", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=fals...#403#1819903409", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "dereference", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false), new String[][]{{"getFirst", "", "7"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"createChildFlowScope", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNullable", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isConstructor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:3>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#413#-1533989964", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesStringContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "I", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoResolvedType", actual.getClass().getName());
  assertEquals("NoResolvedType {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY,...#422#973243188", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:17>"}, {"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "unboxesTo", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false), new String[][]{{"isEnumElementType", "", "2"}, {"getOwnPropertyNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnknownType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesInt32Context", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.rhino.jstype.JSType", "isString", ""}}), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "6"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isRecordType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "collapseUnion", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0> {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false...#449#-408295756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isCheckedUnknownType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNominalType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "clearResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getPossibleToBooleanOutcomes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "findPropertyType", "java.lang.String", "2020-02-30T25:61:61"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isFunctionType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isInstanceType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeFunctionType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isNumberObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "canBeCalled", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "autoboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isInterface", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:11>"}, {"com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionPrototypeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isFunctionPrototypeType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:15>", "<sample:15>"}, {"com.google.javascript.rhino.jstype.JSType", "clearResolved", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isInterface", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isParameterizedType", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:8>", "<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"isInterface", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NullType", actual.getClass().getName());
  assertEquals("null {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-580826583", SearchInputFactory_scaffolding.observe(actual));
 }
}
