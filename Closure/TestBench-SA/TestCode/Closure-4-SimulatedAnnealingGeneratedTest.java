package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getReferenceName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:2>", "<sample:3>"}, {"com.google.javascript.rhino.jstype.NamedType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "http://example.com/a?b=c", "<sample:3>", "true", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<null>"}, {"com.google.javascript.rhino.jstype.NamedType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:8>", "<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "setReferencedType", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.NamedType", "isStringValueType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", "java.lang.String", "1"}}, 3), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:6>"}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "setReferencedType", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.rhino.jstype.NamedType", "isEmptyType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}), new String[][]{{"isDateType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=false, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fa...#388#-1474781815", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getLeastSupertype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}, {"com.google.javascript.rhino.jstype.NamedType", "setValidator", "com.google.common.base.Predicate", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(0|function (new:0, *=, *=, *=): 0) {canBeCalled=true, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAll...#408#-1150641384", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "--1", "<sample:9>", "true", "<sample:4>"}, {"com.google.javascript.rhino.jstype.NamedType", "defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "\u00e9", "<sample:6>", "<sample:6>"}}, 2), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "2"}, {"getParentScope", "", "3"}, {"isConstructor", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:10>", "<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getRootNode", ""}, {"com.google.javascript.rhino.jstype.NamedType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:0>", "<sample:4>"}}, 1), new String[][]{{"getOwnPropertyNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPossibleToBooleanOutcomes", ""}, {"com.google.javascript.rhino.jstype.NamedType", "collapseUnion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "collapseUnion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "collapseUnion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "collapseUnion", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isVoidType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isVoidType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesNumberContext", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumElementType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPropertyMap", ""}, {"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPropertyMap", ""}, {"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPropertyMap", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isOrdinaryFunction", ""}, {"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPropertyMap", ""}, {"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toObjectType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toString", ""}, {"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<null>"}, {"com.google.javascript.rhino.jstype.NamedType", "isFunctionPrototypeType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.NamedType", "matchConstraint", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.NamedType", "checkEquivalenceHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.EquivalenceMethod", "<sample:0>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.NamedType", "getOwnerFunction", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.NamedType", "checkEquivalenceHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.EquivalenceMethod", "<sample:0>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.NamedType", "getOwnerFunction", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:4>", "<sample:4>"}, {"com.google.javascript.rhino.jstype.NamedType", "isDateType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isEnumElementType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getTemplatizedTypes", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getReferencedTypeInternal", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "matchesObjectContext", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesObjectContext", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isUnknownType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isDict", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isArrayType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getOwnSlot", "java.lang.String", "1.1234567890123456"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:8>", "<sample:1>"}, {"com.google.javascript.rhino.jstype.NamedType", "checkEquivalenceHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.EquivalenceMethod", "<null>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setOwnerFunction", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "dereference", ""}, {"com.google.javascript.rhino.jstype.NamedType", "toObjectType", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isTheObjectType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesInt32Context", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isBooleanObjectType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1", "<sample:4>", "<sample:5>"}, {"com.google.javascript.rhino.jstype.NamedType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "i/a/b", "<sample:3>", "false", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isResolved", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "-1.5", "<null>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.NamedType", "toMaybeParameterizedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNumber", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNamedType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isNoObjectType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "clearResolved", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeTemplateType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=fal...#408#1327309371", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isTemplateType", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isSubtypeHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:1>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTemplateKeys", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toMaybeUnionType", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNumberObjectType", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "autobox", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"{\"a\":1}", "<sample:7>", "false", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "defineSynthesizedProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"0x123456789", "<sample:0>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNullType", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isVoidType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toMaybeRecordType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:2>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNullable", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getReferencedType", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "dereference", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getReferenceName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 9, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toMaybeRecordType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:7>", "<sample:6>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#418#702098110", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:7>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"findPropertyType", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:7>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:4>", "<sample:0>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "5"}, {"isInvariant", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "5"}, {"getTypeOfThis", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:4>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=fal...#408#1327309371", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<null>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBool...#362#-1122423617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isAllType", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", "java.lang.String", "\t"}, {"com.google.javascript.rhino.jstype.NamedType", "getOwnPropertyJSDocInfo", "java.lang.String", "010"}, {"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", "java.lang.String", "\t"}, {"com.google.javascript.rhino.jstype.NamedType", "getOwnPropertyJSDocInfo", "java.lang.String", "010"}, {"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", "java.lang.String", "\t"}, {"com.google.javascript.rhino.jstype.NamedType", "getOwnPropertyJSDocInfo", "java.lang.String", "010"}, {"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTemplatizedType", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isStruct", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isOrdinaryFunction", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isStruct", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"tailSet", "java.lang.Object,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"tailSet", "java.lang.Object,boolean", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"tailSet", "java.lang.Object,boolean", "5"}, {"last", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"tailSet", "java.lang.Object,boolean", "5"}, {"tailSet", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getReferenceName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getReferenceName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"1.1234567890123456", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "defineDeclaredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"1.1234567890123456", "<sample:4>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isImplicitPrototype", "com.google.javascript.rhino.jstype.ObjectType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toStringHelper", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isUnknownType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasOwnProperty", new String[]{"java.lang.String"}, new String[]{"[1,2]"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPossibleToBooleanOutcomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDateType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPossibleToBooleanOutcomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isVoidType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isVoidType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isVoidType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isBooleanObjectType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isVoidType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasAnyTemplateTypesInternal", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}, {"com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesNumberContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesNumberContext", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesNumberContext", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesNumberContext", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoResolvedType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isRecordType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isBooleanObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getIndexType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasEquivalentTemplateTypes", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:4>", "<sample:0>", "<sample:4>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPossibleToBooleanOutcomes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isFunctionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getReferencedObjTypeInternal", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNominalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "canCastTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyMap", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PropertyMap", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "autoboxesTo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "testForEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.rhino.jstype.NamedType", "isSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumElementType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "setResolvedTypeInternal", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.rhino.jstype.NamedType", "isOrdinaryFunction", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isTheObjectType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isStringValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNoObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNullType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "canTestForShallowEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplateTypes=false, ha...#401#1567269814", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeTemplateType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "autobox", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "matchesUint32Context", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isInvariant", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getParentScope", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "resolveInternal", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:4>", "<sample:2>"}}), new String[][]{{"clear", "", "7"}, {"higher", "java.lang.Object", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isAllType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesUint32Context", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isRegexpType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", new String[]{"java.lang.String"}, new String[]{"\u00e9"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "resolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:5>", "<sample:0>"}, {"com.google.javascript.rhino.jstype.NamedType", "getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "collapseUnion", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "defineInferredProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"5.", "<sample:2>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "matchConstraint", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getRestrictedTypeGivenToBooleanOutcome", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getImplicitPrototype", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNamedType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "detectInheritanceCycle", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isPropertyInExterns", "java.lang.String", "/a/b"}, {"com.google.javascript.rhino.jstype.NamedType", "defineProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean,com.google.javascript.rhino.Node", "0x1F", "<sample:5>", "true", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesStringContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setReferencedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isGlobalThisType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {canBeCalled=false, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInterna...#391#-242073190", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyNode", new String[]{"java.lang.String"}, new String[]{"a"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasReferenceName", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isRecordType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toMaybeTemplateType", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#413#-1184760881", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isRecordType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasAnyTemplateTypes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNumberValueType", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "matchesNumberContext", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isVoidType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "collectPropertyNames", new String[]{"java.util.Set"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getPropertyType", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "defineDeclaredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1E-5", "<sample:5>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getNormalizedReferenceName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNativeObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isBooleanObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isTemplatized", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchConstraint", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isEquivalentTo", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPropertyType", "java.lang.String", "I"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isTheObjectType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getPropertyNames", ""}}), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isConstructor", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isGlobalThisType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getSlot", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeFunctionType", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toAnnotationString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isBooleanValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isInvariant", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "matchConstraint", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isInterface", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasAnyTemplateTypesInternal", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isResolved", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNominalType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toDebugHashCodeString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getReferencedTypeInternal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "createDelegateSuffix", new String[]{"java.lang.String"}, new String[]{"1.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1.5)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isTemplateType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTemplatizedType", new String[]{"java.lang.String"}, new String[]{"I"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isEmptyType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "autobox", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isNativeObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getRootNode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeUnionType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", ".5", "<sample:2>", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeTemplateType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isEquivalent", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderShallowEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasOwnDeclaredProperty", new String[]{"java.lang.String"}, new String[]{"http://example.com/a?b=c"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getOwnPropertyJSDocInfo", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isObject", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setOwnerFunction", new String[]{"com.google.javascript.rhino.jstype.FunctionType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "autoboxesTo", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "dereference", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isVoidType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypeOfThis", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isUnionType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "clearCachedValues", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getImplicitPrototype", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "testForEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isString", ""}, {"com.google.javascript.rhino.jstype.NamedType", "clearResolved", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isUnknownType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isEnumType", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeFunctionType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#419#2113707761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTemplatizedTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getCtorImplementedInterfaces", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getParameterType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getCtorImplementedInterfaces", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isInvariant", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isEnumElementType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesInt32Context", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getGreatestSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasAnyTemplateTypes", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isFunctionPrototypeType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderShallowInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getSlot", "java.lang.String", "1.12345678901234567"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isInvariant", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "createDelegateSuffix", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(12:30:45)", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNullable", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isInstanceType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "findPropertyType", "java.lang.String", "Title"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderEquality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNominalType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "visit", new String[]{"com.google.javascript.rhino.jstype.RelationshipVisitor", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isInstanceType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "canTestForEqualityWith", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getParameterType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNumberObjectType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setResolvedTypeInternal", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypesUnderInequality", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getRestrictedTypeGivenToBooleanOutcome", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasCachedValues", ""}}), new String[][]{{"getSuperClassConstructor", "", "2"}, {"getTemplatizedTypes", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "resolveInternal", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:0>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ArrowType", actual.getClass().getName());
  assertEquals("[ArrowType] {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAllType=false, isArrayType...#385#232042873", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNominalConstructor", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.NamedType", "isResolved", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isStringObjectType", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "detectImplicitPrototypeCycle", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isPropertyInExterns", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "detectInheritanceCycle", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=fal...#408#1327309371", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isSubtype", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isStringObjectType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isArrayType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isUnionType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "differsFrom", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toDebugHashCodeString", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getDisplayName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "unboxesTo", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasOwnDeclaredProperty", "java.lang.String", "Hello, World"}, {"com.google.javascript.rhino.jstype.NamedType", "setPropertyJSDocInfo", "java.lang.String,com.google.javascript.rhino.JSDocInfo", "1", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isObject", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasTemplatizedType", new String[]{"java.lang.String"}, new String[]{"2147483648"}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "hasOwnProperty", "java.lang.String", "Hello, World"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:6>", "<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBool...#362#-1122423617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isPropertyTypeDeclared", new String[]{"java.lang.String"}, new String[]{"Title"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPropertiesCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getRootNode", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, true), new String[][]{{"isParameterizedType", "", "4"}, {"hasProperty", "java.lang.String", "5"}, {"isNoResolvedType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getReferencedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isGlobalThisType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setReferencedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=false, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInterna...#392#-890981053", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isParameterizedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDict", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toString", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isNativeObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "visit", new String[]{"com.google.javascript.rhino.jstype.Visitor"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isUnionType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "findPropertyType", "java.lang.String", "1E-5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "checkEquivalenceHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.EquivalenceMethod"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isObject", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeFunctionType", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isUnknownType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "filterNoResolvedType", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=fal...#408#1327309371", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeParameterizedType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:3>", "<sample:4>"}, {"com.google.javascript.rhino.jstype.NamedType", "getReferencedTypeInternal", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNamedType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getOwnSlot", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 4, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getReferenceName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isResolved", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getCtorExtendedInterfaces", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.rhino.jstype.NamedType", "matchesInt32Context", ""}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesUint32Context", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isCheckedUnknownType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "clearResolved", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "detectImplicitPrototypeCycle", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NamedType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isConstructor", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "matchConstraint", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isGlobalThisType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "differsFrom", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isTheObjectType", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNominalType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getDisplayName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "cast", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.IndexedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=fals...#421#665523130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNumberValueType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isNumber", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "restrictByNotNullOrUndefined", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "detectInheritanceCycle", ""}}), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "matchesObjectContext", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isRegexpType", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toObjectType", new String[]{}, new String[]{}, false), new String[][]{{"getTemplateKeys", "", "7"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isOrdinaryFunction", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isDict", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "checkEquivalenceHelper", "com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.EquivalenceMethod", "<sample:6>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getSlot", new String[]{"java.lang.String"}, new String[]{"true"}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "setValidator", "com.google.common.base.Predicate", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "hasAnyTemplateTypesInternal", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toMaybeEnumType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isArrayType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getSlot", new String[]{"java.lang.String"}, new String[]{"010"}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "toMaybeTemplateType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isPropertyTypeInferred", new String[]{"java.lang.String"}, new String[]{"a b"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "setReferencedType", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.rhino.jstype.NamedType", "isEmptyType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=!NullPointerException, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=!NullPointerExcep...#472#-329206388", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "clearResolved", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "getTypedefType", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticSlot", "java.lang.String"}, new String[]{"<sample:0>", "<sample:0>", "-0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isInvariant", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isString", ""}, {"com.google.javascript.rhino.jstype.NamedType", "getPropertyNode", "java.lang.String", "1.5e300"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:5>", "<sample:7>", "<sample:4>"}, true), new String[][]{{"findPropertyType", "java.lang.String", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:1>", "<sample:7>", "<sample:4>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "safeResolve", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<sample:3>", "<sample:5>", "<sample:0>"}, true), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals("sample.<boolean> {canBeCalled=false, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=fal...#408#1327309371", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "clearResolved", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNoType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "clearResolved", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNoType", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toMaybeRecordType", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getOwnPropertyJSDocInfo", "java.lang.String", "010"}, {"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getOwnPropertyJSDocInfo", "java.lang.String", "01"}, {"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getOwnPropertyJSDocInfo", "java.lang.String", "0"}, {"com.google.javascript.rhino.jstype.NamedType", "hasDisplayName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<null>"}, {"com.google.javascript.rhino.jstype.NamedType", "isEnumType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "setValidator", new String[]{"com.google.common.base.Predicate"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "getPropertyNode", "java.lang.String", "abA"}, {"com.google.javascript.rhino.jstype.NamedType", "forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "<sample:1>", "<null>"}, {"com.google.javascript.rhino.jstype.NamedType", "isEnumType", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "resolve", new String[]{"com.google.javascript.rhino.ErrorReporter", "com.google.javascript.rhino.jstype.StaticScope"}, new String[]{"<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "defineProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "boolean", "com.google.javascript.rhino.Node"}, new String[]{"1.1234567890123456", "<sample:1>", "true", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isRegexpType", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNullType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isRegexpType", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNullType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isStringObjectType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "detectInheritanceCycle", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", " {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=fal...#388#1438248431", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "isRegexpType", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.rhino.jstype.NamedType", "isNullType", ""}, {"com.google.javascript.rhino.jstype.NamedType", "isStringObjectType", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "a {canBeCalled=true, getDisplayName=a, getNormalizedReferenceName=a, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=a, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#2124668000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "defineSynthesizedProperty", new String[]{"java.lang.String", "com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.Node"}, new String[]{"5.", "<sample:7>", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0 {canBeCalled=true, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal...#391#-774710114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.rhino.jstype.NamedType", "com.google.javascript.rhino.jstype.NamedType", "testForEqualityHelper", new String[]{"com.google.javascript.rhino.jstype.JSType", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:0>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "sample {canBeCalled=true, getDisplayName=sample, getNormalizedReferenceName=sample, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=sample, hasAnyTemplateTypes=false, hasAnyT...#411#1958606538", SearchInputFactory_scaffolding.receiverState());
 }
}
