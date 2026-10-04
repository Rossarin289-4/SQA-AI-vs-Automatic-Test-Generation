package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.12345678Function", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "isInterface", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isInterface", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isInstanceType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "TITLE", "<sample:4>", "true", "<sample:3>"}, {"com.google.javascript.rhino.jstype.RecordType", "setValidator", "com.google.common.base.Predicate", "<sample:4>"}, {"com.google.javascript.rhino.jstype.RecordType", "getIndexType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{...}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "checkEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:3>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.UnionType", "matchesObjectContext", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPrototype", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getCtorImplementedInterfaces", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "checkUnionEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isDateType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setImplementedInterfaces", "java.util.List", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isObject", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "collapseUnion", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.ArrowType", "isObject", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isObject", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 34, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isNumber", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 42, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=true, hasAnyTemplateInternal=true, hasDisplayName=false, isAllType=false, isArrayType=false, isBo...#373#1184528467", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "makesStructs", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSubTypes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "matchesStringContext", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "makesDicts", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "--1", "<sample:0>", "<sample:7>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "detectImplicitPrototypeCycle", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getSuperClassConstructor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:15>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getOwnImplementedInterfaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeTemplateType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:17>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isCheckedUnknownType", "", "5"}, {"isEnumElementType", "", "6"}, {"isFunctionPrototypeType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:3>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isNumber", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:9>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"hasProperty", "java.lang.String", "1"}, {"isNumberObjectType", "", "0"}, {"hasAnyTemplate", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "autobox", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isStringValueType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:15>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getJSDocInfo", "", "1"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getImplementedInterfaces", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStruct", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.RecordType", "isSynthetic", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "checkArrowEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:7>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isGlobalThisType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "unboxesTo", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getInternalArrowType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(0|boolean) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#1522201882", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:1>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}, {"findPropertyType", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", new String[]{"java.lang.String"}, new String[]{"true"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isDateType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.EquivalenceMethod", "com.google.javascript.rhino.jstype.EquivalenceMethod", "valueOf", new String[]{"java.lang.String"}, new String[]{"INVARIANT"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EquivalenceMethod", actual.getClass().getName());
  assertEquals("INVARIANT", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:1>"}, true), new String[][]{{"isNullable", "", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "6"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:2>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "0"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "7"}, {"getAllImplementedInterfaces", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:1>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isNumberObjectType", "", "0"}, {"findPropertyType", "java.lang.String", "7"}, {"autobox", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Boolean|[ArrowType]) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType...#385#198107272", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:19>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isNumber", "", "0"}, {"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeParameterizedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPrototype", "com.google.javascript.rhino.jstype.ObjectType,com.google.javascript.rhino.Node", "<sample:2>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getImplicitPrototype", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"INTERFACE"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isStruct", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "matchRecordTypeConstraint", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isFunctionType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "supAndInfHelper", "com.google.javascript.rhino.jstype.FunctionType,boolean", "<sample:3>", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRecordType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toStringHelper", "boolean", "false"}, {"com.google.javascript.rhino.jstype.FunctionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "checkEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isObject", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNoType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "hasEqualParameters", new String[]{"com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:5>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "checkArrowEquivalenceHelper", "com.google.javascript.rhino.jstype.ArrowType,com.google.javascript.rhino.jstype.EquivalenceMethod", "<sample:4>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "hasEqualParameters", new String[]{"com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:5>", "<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isGlobalThisType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "isDict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "visit", "com.google.javascript.rhino.jstype.Visitor", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setSource", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getAllExtendedInterfaces", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "isInterface", ""}, {"com.google.javascript.rhino.jstype.UnionType", "isOrdinaryFunction", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:15>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"hasProperty", "java.lang.String", "3"}, {"findPropertyType", "java.lang.String", "4"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "7"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:13>"}, true), new String[][]{{"hasProperty", "java.lang.String", "3"}, {"findPropertyType", "java.lang.String", "1"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(null|sample.<boolean>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayTy...#387#1379671283", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.EquivalenceMethod", "com.google.javascript.rhino.jstype.EquivalenceMethod", "values", new String[]{}, new String[]{}, true);
  assertNotNull(actual);
  assertEquals("[Lcom.google.javascript.rhino.jstype.EquivalenceMethod;", actual.getClass().getName());
  assertEquals("[IDENTITY, DATA_FLOW, INVARIANT]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"isBooleanValueType", "", "4"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isStruct", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "dereference", ""}, {"com.google.javascript.rhino.jstype.UnionType", "matchConstraint", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:9>"}, true), new String[][]{{"getPossibleToBooleanOutcomes", "", "2"}, {"isCheckedUnknownType", "", "6"}, {"dereference", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasAnyTemplate=false, hasAnyTemplateInternal=...#390#-53368824", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:7>"}, true), new String[][]{{"canBeCalled", "", "2"}, {"clearResolved", "", "6"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:15>"}, true, 0, null, 2), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchConstraint", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:15>"}, true, 0, null, 3), new String[][]{{"canBeCalled", "", "2"}, {"clearResolved", "", "7"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "4"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"canBeCalled", "", "2"}, {"clearResolved", "", "7"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "6"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:13>"}, true), new String[][]{{"isNominalType", "", "0"}, {"clearResolved", "", "7"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "3"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ProxyObjectType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplate=false, hasAnyTemplateInternal=false...#403#352422936", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:15>"}, true, 0, null, 2), new String[][]{{"matchesUint32Context", "", "0"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:11>"}, true, 0, null, 2), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "0"}, {"getOwnPropertyJSDocInfo", "java.lang.String", "0"}, {"dereference", "", "7"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoObjectType", actual.getClass().getName());
  assertEquals("NoObject {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPro...#415#-654447262", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"apply", "<sample:3>", "<null>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesObjectContext", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "getDisplayName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "toMaybeParameterizedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "toAnnotationString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setDict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNullable", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isTemplateType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:15>"}, true, 0, null, 2), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "6"}, {"isNullable", "", "6"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "6"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NullType", actual.getClass().getName());
  assertEquals("null {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#366#-410494183", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "toMaybeParameterizedType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "hasDisplayName", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "isDateType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>"}, {"com.google.javascript.rhino.jstype.ArrowType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:15>", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeParameterizedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNamedType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "matchConstraint", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getInstanceType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isBooleanValueType", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isNullable", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=Boolean, getPossibleToBoole...#428#-973281540", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 2, new String[][]{}, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"thisTypdabc"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "testForEqualityHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "<sample:15>", "<sample:17>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"ICENTIITY"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "hasUnknownParamsOrReturn", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.rhino.jstype.ArrowType", "hasAnyTemplate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"isResolved", "", "2"}, {"isInvariant", "com.google.javascript.rhino.jstype.JSType", "1"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:7>"}, true), new String[][]{{"getPossibleToBooleanOutcomes", "", "7"}, {"getBindReturnType", "int", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (...[?]): ? {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=...#420#1223407471", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>", "<sample:7>"}, true), new String[][]{{"getSlot", "java.lang.String", "2"}, {"isEnumType", "", "5"}, {"getOwnPropertyJSDocInfo", "java.lang.String", "1"}, {"autobox", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplate=false, ha...#411#2132441934", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:9>"}, true), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isString", "", "3"}, {"isArrayType", "", "1"}, {"autobox", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(0|Boolean) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#-1038203699", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:19>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "5"}, {"collapseUnion", "", "3"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "checkUnionEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:4>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "5"}, {"findPropertyType", "java.lang.String", "4"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "4"}, {"getAllExtendedInterfaces", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "5"}, {"collapseUnion", "", "4"}, {"dereference", "", "5"}, {"getCtorExtendedInterfaces", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:15>"}, true, 0, null, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "6"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "6"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(boolean|function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=fal...#439#-2133772079", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:7>", "<sample:2>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:21>"}}, 3), new String[][]{{"getTemplateTypeNames", "", "6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isParameterizedType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}}, 3), new String[][]{{"getDisplayName", "", "7"}, {"autobox", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#490#1540971881", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isBooleanValueType", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:21>"}, {"com.google.javascript.rhino.jstype.JSType", "canBeCalled", ""}, {"com.google.javascript.rhino.jstype.JSType", "isNominalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "matchesInt32Context", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "hasUnknownParamsOrReturn", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "hasUnknownParamsOrReturn", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "hasAnyTemplate", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isFunctionPrototypeType", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:19>"}, true, 0, null, 3), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:11>"}, true, 0, null, 2), new String[][]{{"getBindReturnType", "int", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): 0 {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTem...#405#1063563745", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>", "<sample:13>"}, true, 0, null, 3), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}, {"autobox", "", "2"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "2"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"autobox", "", "2"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "3"}, {"collapseUnion", "", "2"}, {"getBindReturnType", "int", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): 0 {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTem...#405#1063563745", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:19>", "<sample:13>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "0"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isPropertyInExterns", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:7>"}, true, 0, null, 2), new String[][]{{"cloneWithoutArrowType", "", "2"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"getExtendedInterfacesCount", "", "5"}, {"getPropertyType", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNumberObjectType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setPropertyJSDocInfo", "java.lang.String,com.google.javascript.rhino.JSDocInfo", "1L", "<null>"}, {"com.google.javascript.rhino.jstype.FunctionType", "matchesObjectContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:15>"}, true, 0, null, 3), new String[][]{{"cloneWithoutArrowType", "", "4"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}, {"getExtendedInterfacesCount", "", "5"}, {"getPropertyType", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#373#-1212719949", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"contains", "com.google.javascript.rhino.jstype.JSType", "1"}, {"collapseUnion", "", "7"}, {"hasAnyTemplate", "", "5"}, {"isInterface", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeTemplateType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:21>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, true), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=false, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplate=false, hasCachedValues=false, hasDispl...#373#587947710", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:22>"}, true), new String[][]{{"getConstructor", "", "6"}, {"getDisplayName", "", "6"}, {"clearCachedValues", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getImplicitPrototype", "", "5"}, {"getDisplayName", "", "6"}, {"getJSDocInfo", "", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:5>"}, true), new String[][]{{"getJSDocInfo", "", "5"}, {"getBindReturnType", "int", "6"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:20>", "<sample:11>"}, true), new String[][]{{"clearResolved", "", "4"}, {"getIndexType", "", "6"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isStringObjectType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.UnionType", "isNominalConstructor", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{"xe1901.124567890123456"}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "meet", "com.google.javascript.rhino.jstype.JSType", "<sample:14>"}, {"com.google.javascript.rhino.jstype.UnionType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.rhino.jstype.UnionType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:22>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "equals", "java.lang.Object", "<s:b>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isNumberValueType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#507#-1096237781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getJSDocInfo", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getSource", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 66, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:3>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Function, ...[*]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#439#1094421831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 66, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "removeProperty", "java.lang.String", "ORDINARY"}, {"com.google.javascript.rhino.jstype.FunctionType", "getTopMostDefiningType", "java.lang.String", "1.1234567890123456"}, {"com.google.javascript.rhino.jstype.FunctionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Function, ...[*]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#439#1094421831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 66, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setStruct", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isStruct", ""}}), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Function, ...[*]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#439#1094421831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 66, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "makesDicts", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getOwnPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 2), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "1"}, {"clearCachedValues", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Function, ...[*]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#439#1094421831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getConstructor", new String[]{}, new String[]{}, false, 66, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "makesDicts", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:20>"}}, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"clearCachedValues", "", "4"}, {"getBindReturnType", "int", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (...[*]): ? {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=...#420#1596356708", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTopDefiningInterface", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "java.lang.String"}, new String[]{"<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=0, hasAnyTemplate=false, hasAnyTemplateInternal=...#390#-53368824", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeParameterizedType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:21>"}, {"com.google.javascript.rhino.jstype.RecordType", "matchRecordTypeConstraint", "com.google.javascript.rhino.jstype.ObjectType", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "setExtendedInterfaces", "java.util.List", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "forInterface", new String[]{"com.google.javascript.rhino.jstype.JSTypeRegistry", "java.lang.String", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "ANY", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isInvariant", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, true, 0, null, 3), new String[][]{{"getSlot", "java.lang.String", "4"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "2"}, {"getSuperClassConstructor", "", "6"}, {"clearCachedValues", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Object, *=): ? {canBeCalled=true, getDisplayName=Object, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=0, getNormalizedReferenceName=Object, getPossibleToBooleanOutcom...#420#1304939934", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, true, 0, null, 1), new String[][]{{"getSuperClassConstructor", "", "6"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "1"}, {"cloneWithoutArrowType", "", "2"}, {"clearCachedValues", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Object, ...[?]): ? {canBeCalled=true, getDisplayName=Object, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Object, getPossibleTo...#433#-852297437", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setValidator", "com.google.common.base.Predicate", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "isInterface", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "isInterface", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=!NullPointerException, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArr...#391#38492310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.RecordType", "getDisplayName", ""}, {"com.google.javascript.rhino.jstype.RecordType", "setValidator", "com.google.common.base.Predicate", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{...}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPrototype", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isDateType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "hasInstanceType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasReferenceName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isTheObjectType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "detectImplicitPrototypeCycle", ""}, {"com.google.javascript.rhino.jstype.RecordType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasReferenceName", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isTheObjectType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasProperty", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isNumberValueType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:6>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasReferenceName", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isParameterizedType", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isParameterizedType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setOwnerFunction", "com.google.javascript.rhino.jstype.FunctionType", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null.prototype {canBeCalled=false, getDisplayName=null.prototype, getNormalizedReferenceName=null.prototype, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceNa...#444#-1251080533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:12>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 27, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isObject", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 28, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isObject", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=!NullPointerException, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArr...#391#38492310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toMaybeUnionType", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isDateType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setPrototypeBasedOn", new String[]{"com.google.javascript.rhino.jstype.ObjectType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:4>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.rhino.jstype.ArrowType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "hasDisplayName", ""}, {"com.google.javascript.rhino.jstype.JSType", "hasAnyTemplate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getReferenceName", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", "java.lang.String", "null"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toAnnotationString", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeFunctionType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:2>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"cloneWithoutArrowType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:NoObject, ...[?]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#440#1562271647", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"cloneWithoutArrowType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:NoObject, ...[?]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#440#1562271647", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:17>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isCheckedUnknownType", "", "5"}, {"isNumber", "", "6"}, {"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isCheckedUnknownType", "", "5"}, {"isNumber", "", "6"}, {"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:15>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getOwnImplementedInterfaces", "", "5"}, {"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:17>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isNumber", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}, {"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isNumber", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:18>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"findPropertyType", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:3>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:21>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isEmptyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "isNoType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 2), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}, {"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:20>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"findPropertyType", "java.lang.String", "1"}, {"isParameterizedType", "", "0"}, {"isAllType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:22>", "<sample:19>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}, {"isBooleanValueType", "", "0"}, {"getNormalizedReferenceName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:22>", "<sample:19>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getOwnSlot", "java.lang.String", "2"}, {"isDict", "", "5"}, {"getNormalizedReferenceName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("?", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:15>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getJSDocInfo", "", "2"}, {"hasAnyTemplateInternal", "", "5"}, {"getImplementedInterfaces", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "dereference", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isInstanceType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.RecordType", actual.getClass().getName());
  assertEquals("{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:21>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getJSDocInfo", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplate=false, h...#402#-343326203", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(boolean|sample.<boolean>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArra...#390#945661463", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:5>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getConstructor", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Function, ...[*]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#439#1094421831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:19>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.StringType", actual.getClass().getName());
  assertEquals("string {canBeCalled=false, getDisplayName=string, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCh...#369#-2097984547", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:19>", "<sample:19>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}, {"findPropertyType", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "7"}, {"getReferenceName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:1>"}, true, 0, null, 3), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "6"}, {"findPropertyType", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:19>"}, true, 0, null, 2), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isNumber", "", "5"}, {"findPropertyType", "java.lang.String", "7"}, {"autobox", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(String|function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=fals...#438#626405464", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isResolved", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "setInstanceType", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toDebugHashCodeString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "1.25", "<sample:0>", "false", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:19>"}, true, 0, null, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "0"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "0"}, {"autobox", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("String {canBeCalled=false, getDisplayName=String, getNormalizedReferenceName=String, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=String, hasAnyTemplate=false, hasCachedVa...#392#1584291041", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "forceResolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:7>", "<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "equals", "java.lang.Object", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getConstructor", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "isString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isRecordType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "toMaybeTemplateType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isGlobalThisType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isDict", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "unboxesTo", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNames", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getParameterType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isPropertyTypeDeclared", "java.lang.String", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isUnknownType", ""}, {"com.google.javascript.rhino.jstype.JSType", "toMaybeFunctionType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.12345678", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setDict", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.12345678", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setDict", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.12345678", "<null>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "setDict", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.12345678", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isResolved", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1.12345678Function", "<null>", "<sample:3>"}, {"com.google.javascript.rhino.jstype.FunctionType", "isInvariant", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "isInterface", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "checkFunctionEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:4>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:6>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:6>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isOrdinaryFunction", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "isNominalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{...}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isVoidType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("{...}", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getPossibleToBooleanOutcomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "checkEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:3>", "<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "getPossibleToBooleanOutcomes", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getPrototype", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isVoidType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:0>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.UnionType", "isObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isVoidType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "isString", ""}, {"com.google.javascript.rhino.jstype.UnionType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.UnionType", "isObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isVoidType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.UnionType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.UnionType", "isObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isBooleanObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isDateType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "hasProperty", "java.lang.String", "CONSTRUCTOR"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getParameters", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "toMaybeFunctionType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "hasReferenceName", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.RecordType", "isTheObjectType", ""}, {"com.google.javascript.rhino.jstype.RecordType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{"ORDINARY"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isUnknownType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isParameterizedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isParameterizedType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "setOwnerFunction", "com.google.javascript.rhino.jstype.FunctionType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "null.prototype {canBeCalled=false, getDisplayName=null.prototype, getNormalizedReferenceName=null.prototype, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceNa...#444#-1251080533", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getPropertyNode", "java.lang.String", ".prototype"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"1.5f"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getJSDocInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "setPrettyPrint", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getPropertyNames", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isRecordType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=!NullPointerException, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArr...#391#38492310", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isRecordType", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "canAssignTo", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isObject", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=!ClassCastException, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArray...#389#-824675337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isObject", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "hasAnyTemplate", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isTheObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "removeProperty", new String[]{"java.lang.String"}, new String[]{" "}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "matchesStringContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=!ClassCastException, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArray...#389#-824675337", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isRecordType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isNoResolvedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "isConstructor", ""}, {"com.google.javascript.rhino.jstype.RecordType", "toStringHelper", "boolean", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesInt32Context", new String[]{}, new String[]{}, false, 37, new String[][]{{"com.google.javascript.rhino.jstype.ArrowType", "isNullable", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "matchesStringContext", ""}, {"com.google.javascript.rhino.jstype.ArrowType", "toDebugHashCodeString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getReferenceName", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hasOwnDeclaredProperty", "java.lang.String", "null"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "clearResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toAnnotationString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toAnnotationString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isGlobalThisType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isNativeObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toAnnotationString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.JSType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("*", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "dereference", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(boolean|function (new:0, *=, *=, *=): 0) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllTyp...#405#1569381502", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(0|boolean) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#1522201882", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:2>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:3>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.ArrowType", "com.google.javascript.rhino.jstype.ArrowType", "matchesUint32Context", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArrayType=false, is...#375#24106957", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>", "<sample:2>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("([ArrowType]|function (new:0, *=, *=, *=): 0) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAl...#409#-1984831292", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:3>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "matchesObjectContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:1>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:1>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:2>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"autoboxesTo", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:2>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"contains", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"cloneWithoutArrowType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:NoObject, ...[?]): ? {canBeCalled=true, getDisplayName=Function, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Function, getPoss...#440#1562271647", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "meet", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "findPropertyType", new String[]{"java.lang.String"}, new String[]{""}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "isNullType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "cloneWithoutArrowType", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "hasEqualCallType", "com.google.javascript.rhino.jstype.FunctionType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"I", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "isImplicitPrototype", new String[]{"com.google.javascript.rhino.jstype.ObjectType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "clearCachedValues", ""}, {"com.google.javascript.rhino.jstype.FunctionType", "getParameters", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.JSType", "isString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>", "<sample:3>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isCheckedUnknownType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "isStringObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isAllType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "getSource", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.FunctionType", "getAllImplementedInterfaces", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "isBooleanObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.RecordType", "getOwnerFunction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "toMaybeTemplateType", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.UnionType", "com.google.javascript.rhino.jstype.UnionType", "isRecordType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.UnionType", "isEnumType", ""}, {"com.google.javascript.rhino.jstype.UnionType", "isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.AllType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>", "<sample:15>"}, true), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getOwnImplementedInterfaces", "", "5"}, {"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.FunctionType", "com.google.javascript.rhino.jstype.FunctionType", "toMaybeEnumElementType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Function {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=!NullPointerException, getMaxArguments=!NullPointerException, getMinArguments=!NullPointerException, getNormalizedReferenceN...#506#-1654654606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.RecordType", "com.google.javascript.rhino.jstype.RecordType", "getOwnerFunction", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{...} {canBeCalled=false, getDisplayName=null, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=!NullPointerException, getReferenceName=null, hasAnyTemplate=false...#407#-1630533534", SearchInputFactory_scaffolding.receiverState());
 }
}
