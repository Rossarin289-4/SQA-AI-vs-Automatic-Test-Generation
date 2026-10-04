package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "0200x1F", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "false"}}), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "Heello, Worle", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "12:30:451.5", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<null>", "true"}}, 2), new String[][]{{"dereference", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:5>", "-1.5", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:11>", "<9rruu--1", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 13, new String[][]{}), new String[][]{{"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "010", "true"}}, 3), new String[][]{{"canBeCalled", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "010", "true"}}, 3), new String[][]{{"canBeCalled", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "11/", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 3), new String[][]{{"canBeCalled", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:13>", "0", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NullType", actual.getClass().getName());
  assertEquals("null {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#366#-410494183", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "sftsing", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:6>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "1", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "abc", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 3), new String[][]{{"getCtorExtendedInterfaces", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "a b", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "a2020-02-30T25:61:61", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "0011", "false"}}, 2), new String[][]{{"getParentScope", "", "5"}, {"dereference", "", "1"}, {"findPropertyType", "java.lang.String", "2"}, {"getCtorImplementedInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "boolean", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "http://eyample.cWomm/a?b=c", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "number", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"isUnionType", "", "7"}, {"autoboxesTo", "", "1"}, {"getPropertiesCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "function", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"hasImplementedInterfaces", "", "4"}, {"getParameters", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "function", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"hasInstanceType", "", "4"}, {"getAllImplementedInterfaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "function", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "string", "true"}, false), new String[][]{{"clearResolved", "", "2"}, {"isNumberObjectType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:21>", "\"7", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:24>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "<a>b</a>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:24>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<sample:3>", "<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:30>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:4>", "<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:24>", "", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:30>", "function", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#395#1541443116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "false"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:9>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:30>"}}, 3), new String[][]{{"getRootNode", "", "5"}, {"getSourcePosition", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:28>", "I", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:24>", "1.5e300", "false"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"getSlot", "java.lang.String", "3"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:7>", "<sample:13>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:19>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:19>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.StringType", actual.getClass().getName());
  assertEquals("string {canBeCalled=false, getDisplayName=string, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCh...#369#-2097984547", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:3>", "<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:19>", "undefined", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:3>", "<sample:9>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "undefined", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:19>", "\t", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.StringType", actual.getClass().getName());
  assertEquals("string {canBeCalled=false, getDisplayName=string, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCh...#369#-2097984547", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:2>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<null>", "<sample:2>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "0200x1F", "true"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:4>", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:5>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2), new String[][]{{"getJSDocInfo", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2), new String[][]{{"getPossibleToBooleanOutcomes", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2), new String[][]{{"getPossibleToBooleanOutcomes", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}}, 3), new String[][]{{"getNormalizedReferenceName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Array", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}}, 3), new String[][]{{"isDict", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}}, 3), new String[][]{{"getParentScope", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("Date.prototype {canBeCalled=false, getDisplayName=Date.prototype, getNormalizedReferenceName=Date.prototype, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Date.prototype, h...#425#-746967032", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:6>"}}, 3), new String[][]{{"getNormalizedReferenceName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Date", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string {canBeCalled=true, getDisplayName=Date, getExtendedInterfacesCount=0, getMaxArguments=7, getMinArguments=0, getNormalizedReferenceName=Date, get...#443#-620785362", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "false"}}, 2), new String[][]{{"isObject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"dereference", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Object {canBeCalled=false, getDisplayName=Object, getNormalizedReferenceName=Object, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Object, hasAnyTemplate=false, hasCachedVa...#392#-1089388191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"collapseUnion", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:3>", "false"}}, 1), new String[][]{{"collapseUnion", "", "2"}, {"getOwnSlot", "java.lang.String", "1"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "Heello, World", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "12:30:45", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<null>", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "4"}, {"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "-1.5", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "-1.5", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:1>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:9>", "tru", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 3), new String[][]{{"isEnumType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:9>", "<rru", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:8>", "<9rruu", "true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:8>", "<9rruu--1", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:8>", "<9rruu--1", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 2), new String[][]{{"getPossibleToBooleanOutcomes", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:10>", "=9rsuu-15.", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"getPossibleToBooleanOutcomes", "", "6"}, {"isBooleanValueType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:9>", "=9rssuu-15.", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 2), new String[][]{{"getReturnType", "", "5"}, {"isAllType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 2), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"isNumber", "", "3"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "3"}, {"isStringObjectType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:0>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:3>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"getFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:5>", "1.1234567", "false"}}, 3), new String[][]{{"getFirst", "", "1"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "false"}, false, 9, new String[][]{}, 1), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:9>", "false"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:1>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}, 2), new String[][]{{"createChildFlowScope", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, false, 0, null, 1), new String[][]{{"createChildFlowScope", "", "4"}, {"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "false"}, false, 0, null, 1), new String[][]{{"createChildFlowScope", "", "4"}, {"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "Hello, World", "false"}}, 1), new String[][]{{"createChildFlowScope", "", "4"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "false"}, false, 0, null, 1), new String[][]{{"createChildFlowScope", "", "4"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"createChildFlowScope", "", "4"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getParentScope", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType...#404#404917503", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#370#7688076", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 13, new String[][]{}, 1), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 13, new String[][]{}, 1), new String[][]{{"findPropertyType", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"hasProperty", "java.lang.String", "1"}, {"isStringObjectType", "", "5"}, {"isBooleanObjectType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "\n", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType...#404#404917503", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:14>", "chttp://xampld-com/a?b=c+true", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:1>", "false"}}, 1), new String[][]{{"isTemplateType", "", "1"}, {"isArrayType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "chtup://xampld-com/a?b=ctrue1.5f", "true"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "citup://xamppld-com/a?b=ctrue1.5f", "true"}, false, 5, new String[][]{}, 1), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "1.25", "true"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "\tp.25", "true"}, false, 5, new String[][]{}, 1), new String[][]{{"getImplicitPrototype", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "hCCC-", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:0>", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:2>", "<sample:6>"}}, 3), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "hCCC-", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:0>", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:2>", "<sample:6>"}}, 3), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#370#7688076", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "010", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#370#7688076", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "010", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}}), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "0200x1F", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}}), new String[][]{{"isFunctionPrototypeType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:5>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "0200x1F", "true"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#357#234369116", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "020x1F", "true"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false), new String[][]{{"getDisplayName", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:6>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "2020-02-30T25:61:61", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:7>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:3>", "true"}}), new String[][]{{"optimize", "", "5"}, {"createChildFlowScope", "", "3"}, {"getOwnSlot", "java.lang.String", "3"}, {"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:0>", "false"}}), new String[][]{{"getJSDocInfo", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:7>", "<sample:0>"}}), new String[][]{{"getFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType...#404#404917503", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:2>", "true"}}), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "false"}}), new String[][]{{"isObject", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false), new String[][]{{"hasDisplayName", "", "3"}, {"isGlobalThisType", "", "6"}, {"isArrayType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "/a/b", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}), new String[][]{{"dereference", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "/a/b", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}), new String[][]{{"cloneWithoutArrowType", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:0, ...[?]): ? {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes...#418#-1026643978", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "4"}, {"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "4"}, {"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:5>", "<null>"}}), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "0"}, {"getFirst", "", "7"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:8>", "<sample:2>"}}), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "0"}, {"getFirst", "", "7"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}, {"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}), new String[][]{{"getFirst", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:9>", "true", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string {canBeCalled=true, getDisplayName=Date, getExtendedInterfacesCount=0, getMaxArguments=7, getMinArguments=0, getNormalizedReferenceName=Date, get...#443#-620785362", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=fals...#399#396750454", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:10>", "=9rsuu-15.", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:2>"}}), new String[][]{{"getPossibleToBooleanOutcomes", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}), new String[][]{{"getReturnType", "", "5"}, {"isAllType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#370#7688076", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 16, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:9>"}}), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 14, new String[][]{}), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, false), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "4"}, {"getJSDocInfo", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, false), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "4"}, {"getJSDocInfo", "", "0"}, {"isConsistentIdGenerator", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}}), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "4"}, {"getJSDocInfo", "", "0"}, {"isConsistentIdGenerator", "", "0"}, {"getExtendedInterfacesCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "1.5", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:5>", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#370#7688076", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=Boolean, getPossibleToBoole...#428#-973281540", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Date {canBeCalled=false, getDisplayName=Date, getNormalizedReferenceName=Date, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Date, hasAnyTemplate=false, hasCachedValues=fal...#385#1520101832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:4>", "false"}, false), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "false"}, false), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "false"}, false), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 13, new String[][]{}), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:11>", "http://xampld.com/a?b=c+", "true"}, false), new String[][]{{"hasAnyTemplateInternal", "", "1"}, {"getBindReturnType", "int", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (...[?]): None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcom...#423#-807698480", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "chttp://xampld-com/a?b=c+", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "hCC-", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:0>", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"getPropertyNames", "", "1"}, {"size", "", "4"}, {"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "hCCC-", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:0>", "<null>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "hCCC-", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:0>", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "010", "true"}}), new String[][]{{"restrictByNotNullOrUndefined", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0> {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false...#449#-408295756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "010", "true"}}, 3), new String[][]{{"canBeCalled", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "010", "true"}}, 3), new String[][]{{"canBeCalled", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "11/", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "11/", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "\n", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 3), new String[][]{{"isEnumElementType", "", "4"}, {"isInstanceType", "", "4"}, {"getPossibleToBooleanOutcomes", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:8>", "10/", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "\n", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}}, 1), new String[][]{{"getPossibleToBooleanOutcomes", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "\n", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(boolean|sample.<boolean>) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=false, isArra...#390#1064438404", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "true"}, false), new String[][]{{"getRootNode", "", "1"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "5"}, {"getJsDocBuilderForNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "1.1234567", "false"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0> {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false...#449#-408295756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a,b,c", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getRootNode", "", "0"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<null>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "sftsi=\014ngPT1H", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:8>", "false"}}), new String[][]{{"getOwnSlot", "java.lang.String", "5"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "24743648+", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "abc", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1), new String[][]{{"getCtorImplementedInterfaces", "", "0"}, {"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "24743648+", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "abc", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1), new String[][]{{"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "0"}, {"getPropertyNode", "java.lang.String", "6"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "2", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"getFirst", "", "4"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:0>", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:7>", "\t", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "2"}, {"getParentScope", "", "2"}, {"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "37~", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:5>", "a2020-02-30T25:61:61", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "0011", "false"}}, 2), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "5"}, {"dereference", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "018", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "chttp://xampld-com/a?b=c+", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "1"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "6"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false), new String[][]{{"getOwnImplementedInterfaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "-0.0", "false"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "3"}, {"getFirst", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "-0.0", "false"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "3"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:5>", "12:30:45", "true"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}, {"getOwnSlot", "java.lang.String", "1"}, {"getJSDocInfo", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:5>", "12:30:45", "true"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}, {"getOwnSlot", "java.lang.String", "1"}, {"getJSDocInfo", "", "7"}, {"isDeprecated", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:1>", "<sample:4>"}}, 3), new String[][]{{"dereference", "", "2"}, {"getOwnPropertyNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0> {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false...#449#-408295756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#370#7688076", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=fals...#399#396750454", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:5>", "false"}}, 3), new String[][]{{"isRecordType", "", "4"}, {"isBooleanObjectType", "", "3"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:5>", "false"}}, 3), new String[][]{{"isStringValueType", "", "4"}, {"isDict", "", "3"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 2, new String[][]{}, 3), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:4>", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:15>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"isGlobalThisType", "", "3"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "2"}, {"dereference", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "1.25", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2), new String[][]{{"isNominalConstructor", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2), new String[][]{{"getReturnType", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("0 {canBeCalled=false, getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=0, hasAnyTemplate=false, hasCachedValues=false, hasDispl...#373#587947710", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:14>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "http://eyample.cWomm/a?b=c", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=fals...#399#396750454", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "http://eyample.cWomm/a?b=c", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:7>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string {canBeCalled=true, getDisplayName=Date, getExtendedInterfacesCount=0, getMaxArguments=7, getMinArguments=0, getNormalizedReferenceName=Date, get...#443#-620785362", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:Error, *=, *=, *=): Error {canBeCalled=true, getDisplayName=Error, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=Error, getPossibleToBool...#430#-215566433", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "false"}, false, 0, null, 3), new String[][]{{"getParentScope", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:3>", "<sample:15>"}}, 1), new String[][]{{"hasAnyTemplateInternal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}}, 1), new String[][]{{"createChildFlowScope", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Array {canBeCalled=false, getDisplayName=Array, getNormalizedReferenceName=Array, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Array, hasAnyTemplate=false, hasCachedValues...#388#-1021301207", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:6>", "<sample:13>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=Boolean, getPossibleToBoole...#428#-973281540", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<null>", "true"}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:0>", " ", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:12>"}}, 1), new String[][]{{"getPrototype", "", "5"}, {"isEnumElementType", "", "4"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:10>", "function", "true"}, false, 13, new String[][]{});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:21>", "function", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:7>", "false"}, false), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:24>", "g\u00e9umdr", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<null>", "false"}}, 2), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "5"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:24>", "1F-\u00e9", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}}, 3), new String[][]{{"canBeCalled", "", "1"}, {"collapseUnion", "", "6"}, {"isCheckedUnknownType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"getExtendedInterfacesCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NullType", actual.getClass().getName());
  assertEquals("null {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#366#-410494183", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:21>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:28>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:7>"}}, 2), new String[][]{{"isBooleanValueType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:30>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:7>"}}, 2), new String[][]{{"isCheckedUnknownType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:6>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<null>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:1>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:5>", "<sample:7>"}}, 1), new String[][]{{"isRecordType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 30, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, false, 0, null, 3), new String[][]{{"getParentScope", "", "0"}, {"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "4"}, {"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<null>"}}, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "4"}, {"getRootNode", "", "7"}, {"cloneTree", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:3>"}}, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"getParentScope", "", "4"}, {"getOwnSlot", "java.lang.String", "7"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:8>", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"getParentScope", "", "4"}, {"getOwnSlot", "java.lang.String", "7"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}}, 2), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "0"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}}, 3), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:6>", "<sample:7>"}}, 2), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "0"}, {"dereference", "", "5"}, {"hasReferenceName", "", "6"}, {"defineSynthesizedProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "{\"a\":1}-0a0", "false"}}, 2), new String[][]{{"getExtendedInterfacesCount", "", "1"}, {"getDisplayName", "", "5"}, {"getMaxArguments", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:28>", "2020-02-30T25:61:", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:21>", "0xxFFFFFFFF21.5", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.EnumElementType", actual.getClass().getName());
  assertEquals(".<function (new:0, *=, *=, *=): 0> {canBeCalled=true, getDisplayName=, getNormalizedReferenceName=, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=, hasAnyTemplate=false, ha...#403#-35775136", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:24>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:21>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.VoidType", actual.getClass().getName());
  assertEquals("undefined {canBeCalled=false, getDisplayName=undefined, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=fals...#376#-1592198659", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:5>", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:5>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}, 3), new String[][]{{"getSlot", "java.lang.String", "4"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false, 0, null, 1), new String[][]{{"getRootNode", "", "4"}, {"getChildAtIndex", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:0>", "<sample:4>"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "4"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:0>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:3>", "<sample:4>"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "4"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:3>", "<sample:4>"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "4"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getSuperClassConstructor", "", "6"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "7"}, {"autobox", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Object, *=): ? {canBeCalled=true, getDisplayName=Object, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=0, getNormalizedReferenceName=Object, getPossibleToBooleanOutcom...#420#1304939934", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:7>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "true"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:8>", "<sample:2>"}}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "2"}, {"getJSDocInfo", "", "0"}, {"addSuppression", "java.lang.String", "2"}, {"getParameterCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "true", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getRootNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "true", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getRootNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "true", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getRootNode", "", "5"}, {"getCharno", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "true", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:28>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getRootNode", "", "5"}, {"isBreak", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:14>", "tque", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:0>"}}, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getRootNode", "", "5"}, {"getAncestors", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "false"}, false, 0, null, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "3"}, {"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:9>", "<null>", "false"}, false, 11, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:0>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:4>"}}, 3), new String[][]{{"getRootNode", "", "6"}, {"detachFromParent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"getRootNode", "", "6"}, {"detachFromParent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:7>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "0200x1Ftruf", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}, 2), new String[][]{{"getFirst", "", "6"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:7>", "<sample:15>"}}, 3), new String[][]{{"getSlot", "java.lang.String", "5"}, {"isTypeInferred", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:9>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:3>", "true"}}, 2), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:4>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>", "<null>", "<sample:3>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
