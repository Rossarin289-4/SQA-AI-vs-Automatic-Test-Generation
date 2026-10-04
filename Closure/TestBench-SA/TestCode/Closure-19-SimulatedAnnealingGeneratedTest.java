package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "2020-02-30T25:61:61", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "", "false"}, false, 4, new String[][]{}), new String[][]{{"hasDisplayName", "", "6"}, {"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#413#-1533989964", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:5>"}}), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getJSDocInfo", "", "2"}, {"isNoAlias", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:13>", " ", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:0>", "<sample:13>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}), new String[][]{{"getSubTypes", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:6>", "true"}}, 2), new String[][]{{"getSlot", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "1.5d", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "0xFFFFFFFF", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "a\",~-", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "\robjebt", "true"}}), new String[][]{{"getPossibleToBooleanOutcomes", "", "5"}, {"cloneWithoutArrowType", "", "3"}, {"getJSDocInfo", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "a\",~-", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "object", "true"}}, 3), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "-0.0", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:11>", "obnjLecs", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "1.5d", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:0>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "2020-02-30T5:61:61", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "1E6-\t", "false"}}), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getOwnSlot", "java.lang.String", "0"}, {"getJSDocInfo", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:3>", "<sample:9>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "string", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "true"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "function", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "6"}, {"getTypeOfThis", "", "3"}, {"getParentScope", "", "0"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:19>"}, false, 10, new String[][]{}), new String[][]{{"isUnionType", "", "4"}, {"isNoObjectType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:19>", "function", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}}), new String[][]{{"isString", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:19>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:1>", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.StringType", actual.getClass().getName());
  assertEquals("string {canBeCalled=false, getDisplayName=string, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCh...#377#457258733", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:20>", "boolean", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}}, 1), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:19>", "1e10", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:24>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "-1", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:1>", "<sample:11>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:20>", "", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:24>"}}), new String[][]{{"getParentScope", "", "6"}, {"dereference", "", "0"}, {"getParentScope", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("Function.prototype {canBeCalled=false, getDisplayName=Function.prototype, getNormalizedReferenceName=Function.prototype, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Funct...#441#-1466466552", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:24>", "object", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:4>", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.VoidType", actual.getClass().getName());
  assertEquals("undefined {canBeCalled=false, getDisplayName=undefined, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=fals...#384#1348912397", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:21>", "m", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:24>", "1.5", "true"}}, 2), new String[][]{{"isNullType", "", "5"}, {"isParameterizedType", "", "1"}, {"isFunctionType", "", "4"}, {"collapseUnion", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:13>", "1L", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:20>", "undefined", "true"}}), new String[][]{{"isConstructor", "", "7"}, {"isStringValueType", "", "5"}, {"isStringValueType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "function", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:21>", "-1", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a#-2T;", "true"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "function", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:21>", "-1", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a#-2T;", "true"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "number", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:30>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:3>", "false"}}, 1), new String[][]{{"isAllType", "", "2"}, {"autoboxesTo", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:7>", "<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:30>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:5>", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "2020-02-30T25:61:61", "true"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}}, 2), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getJSDocInfo", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}}, 2), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"isFunctionPrototypeType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"getOwnSlot", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, null, 2), new String[][]{{"getPropertyNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 0, null, 2), new String[][]{{"isConstructor", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<null>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:10>", "<sample:0>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:12>", "<sample:2>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=fals...#403#1819903409", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}}, 2), new String[][]{{"getPropertiesCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"getTopMostDefiningType", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:2>", "<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a,b,", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a,b,", "true"}}, 1), new String[][]{{"getFirst", "", "5"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "2"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a+b,", "true"}}, 1), new String[][]{{"getFirst", "", "5"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "PT1H", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<null>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false, 11, new String[][]{}, 2), new String[][]{{"getParentScope", "", "0"}, {"getOwnSlot", "java.lang.String", "6"}, {"isTypeInferred", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:2>", "<sample:7>"}}, 2), new String[][]{{"getParentScope", "", "1"}, {"getOwnSlot", "java.lang.String", "6"}, {"isTypeInferred", "", "6"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:1>", "<null>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 2), new String[][]{{"isNumberValueType", "", "5"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1), new String[][]{{"getBindReturnType", "int", "5"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1), new String[][]{{"getBindReturnType", "int", "5"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 1), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "5"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "0xFFFFFFFF", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "0xFFFFFFFF", "true"}}, 1), new String[][]{{"isString", "", "1"}, {"getRootNode", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "0xFFFFFFF", "true"}}, 3), new String[][]{{"isRegexpType", "", "1"}, {"isAllType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "0xFFFFFFF", "true"}}, 3), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "0xFFFFFFF", "true"}}, 3), new String[][]{{"getSubTypes", "", "1"}, {"getExtendedInterfacesCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "0xFFFFFFF", "true"}}, 3), new String[][]{{"getSubTypes", "", "1"}, {"getExtendedInterfacesCount", "", "3"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "0xFFFFFFF", "true"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:3>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:7>", "1e10", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "a,b,c", "true"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "a,}-", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "object", "true"}}, 3), new String[][]{{"getPossibleToBooleanOutcomes", "", "5"}, {"cloneWithoutArrowType", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:0, ...[?]): ? {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes...#418#-1026643978", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "a\",~-", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "\rtobjebt", "true"}}, 3), new String[][]{{"getRootNode", "", "5"}, {"dereference", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "1.12345678", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "1.123456", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 3), new String[][]{{"clearResolved", "", "1"}, {"cloneWithoutArrowType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:0, ...[?]): ? {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes...#418#-1026643978", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "1.23436", "false"}, false, 0, null, 3), new String[][]{{"clearResolved", "", "3"}, {"cloneWithoutArrowType", "", "0"}, {"getOwnSlot", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "1.23436", "false"}, false, 0, null, 3), new String[][]{{"clearResolved", "", "3"}, {"cloneWithoutArrowType", "", "0"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "1.23436", "false"}, false, 0, null, 3), new String[][]{{"collapseUnion", "", "3"}, {"dereference", "", "0"}, {"isString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "1-23436", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1), new String[][]{{"clearResolved", "", "3"}, {"cloneWithoutArrowType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:0, ...[?]): ? {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes...#418#-1026643978", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "1-23436", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1), new String[][]{{"collapseUnion", "", "3"}, {"dereference", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:9>", "1-23436", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1), new String[][]{{"clearResolved", "", "3"}, {"collapseUnion", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "boolean", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "false"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:11>", "2020-01-01", "true"}}, 2), new String[][]{{"getFirst", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}}, 2), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "3"}, {"isBooleanValueType", "", "5"}, {"isAllType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "3"}, {"getParentScope", "", "5"}, {"getOwnSlot", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "3"}, {"getParentScope", "", "5"}, {"getOwnSlot", "java.lang.String", "3"}, {"getReferenceName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("EvalError.prototype", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "3"}, {"getParentScope", "", "5"}, {"getOwnSlot", "java.lang.String", "3"}, {"getReferenceName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("??", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2), new String[][]{{"getPropertyNames", "", "3"}, {"clear", "", "5"}, {"iterator", "", "3"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getParentScope", "", "5"}, {"getConstructor", "", "3"}, {"getReferenceName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Boolean.prototype", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:9>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:7>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "-0.0", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:9>"}}, 2), new String[][]{{"hasReferenceName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "-00", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:4>", "<sample:6>", "<sample:9>"}}, 1), new String[][]{{"getOwnPropertyNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "Hello, Wold", "true"}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:7>", "<sample:11>"}}, 2), new String[][]{{"getOwnPropertyNames", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "obnjLecs", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "1.5d", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:13>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:13>", "obnjLec", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "1.5d", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NullType", actual.getClass().getName());
  assertEquals("null {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-580826583", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "obpjLec", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "1.5d", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 3), new String[][]{{"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "cjL", "true"}, false, 12, new String[][]{}, 1), new String[][]{{"isBooleanObjectType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Array {canBeCalled=false, getDisplayName=Array, getNormalizedReferenceName=Array, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Array, hasAnyTemplate=false, hasCachedValues...#388#-1021301207", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Date {canBeCalled=false, getDisplayName=Date, getNormalizedReferenceName=Date, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Date, hasAnyTemplate=false, hasCachedValues=fal...#385#1520101832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}), new String[][]{{"getCtorImplementedInterfaces", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "-1", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:1>", "<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:0>", ".-", "true"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"isBooleanObjectType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:5>", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:4>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType...#408#-1996376134", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "2020-02-30T25:61:61", "true"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "2020-02-30T25:61;610x1F", "true"}, false), new String[][]{{"isTemplateType", "", "6"}, {"getPossibleToBooleanOutcomes", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:10>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:7>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:5>"}}), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getName", "", "4"}, {"getJSDocInfo", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:5>"}}), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getJSDocInfo", "", "2"}, {"isNoAlias", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}}), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:5>", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}}), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}}), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:2>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string {canBeCalled=true, getDisplayName=Date, getExtendedInterfacesCount=0, getMaxArguments=7, getMinArguments=0, getNormalizedReferenceName=Date, get...#443#-620785362", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<null>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType=fals...#403#1819903409", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:6>"}}), new String[][]{{"isRegexpType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a,b,c", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false), new String[][]{{"getFirst", "", "6"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "a,b,", "true"}}), new String[][]{{"getFirst", "", "5"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "2"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false, 11, new String[][]{}), new String[][]{{"getParentScope", "", "0"}, {"getOwnSlot", "java.lang.String", "6"}, {"isTypeInferred", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:2>", "<sample:7>"}}), new String[][]{{"getParentScope", "", "1"}, {"getOwnSlot", "java.lang.String", "6"}, {"isTypeInferred", "", "6"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", " ", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "1.5e300", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}), new String[][]{{"isNumberValueType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}), new String[][]{{"getBindReturnType", "int", "5"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:0>", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", "1.5d", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:11>", "a,b,c", "true"}}), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "a,b,", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:7>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:13>", "object", "true"}}), new String[][]{{"getParameters", "", "4"}, {"hasNext", "", "3"}, {"iterator", "", "2"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:1>", "<sample:0>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getOwnSlot", "java.lang.String", "3"}, {"isTypeInferred", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<null>", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}), new String[][]{{"dereference", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Object {canBeCalled=false, getDisplayName=Object, getNormalizedReferenceName=Object, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Object, hasAnyTemplate=false, hasCachedVa...#392#-1089388191", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:7>", "string", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "1-23436", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}), new String[][]{{"clearResolved", "", "3"}, {"cloneWithoutArrowType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:0, ...[?]): ? {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes...#418#-1026643978", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false), new String[][]{{"getFirst", "", "5"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, false), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"getJSDocInfo", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:9>", "<sample:0>", "true"}}), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"getType", "", "2"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:9>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"getType", "", "2"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", " ", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "1.5d", "true"}}), new String[][]{{"hasReferenceName", "", "3"}, {"getOwnPropertyNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "-00", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:6>", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:9>", "-1-41.12345657", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:5>"}}), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:11>", "-1-41.12345657", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:8>", "<sample:7>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:5>"}}), new String[][]{{"getPropertiesCount", "", "1"}, {"getAllImplementedInterfaces", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=Boolean, getPossibleToBoole...#428#-973281540", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:5>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.1234567890123456", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}, {"getFirst", "", "7"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "1"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.1234567890123456", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}, {"getFirst", "", "7"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "1"}, {"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.1234567890123456", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:6>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "1E-5", "false"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.12345678901234566", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "1E6-5", "false"}}, 2), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getParentScope", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:0>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "2020-02-30T5:61:61", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "1E6-\t", "false"}}, 2), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "1"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getOwnSlot", "java.lang.String", "0"}, {"getJSDocInfo", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 29, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "2020-02-30T5:61:61", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.5e300", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "1E6.\t", "false"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "3"}, {"getRootNode", "", "1"}, {"isBlock", "", "0"}, {"getSourcePosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 32, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "-.75", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:6>", "false"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "3"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "1"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 33, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "-.75", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:6>", "false"}}, 1), new String[][]{{"getFirst", "", "3"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "1"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "1"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "true"}, false, 0, null, 3), new String[][]{{"getRootNode", "", "6"}, {"isCase", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "--75", "true"}}, 3), new String[][]{{"getFirst", "", "3"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "1"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:6>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:14>", "1.4d", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:9>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:5>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:14>", "1.4d", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "boolean", "false"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 0, null, 2), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}}, 2), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 2), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "6"}, {"clearResolved", "", "7"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Date {canBeCalled=false, getDisplayName=Date, getNormalizedReferenceName=Date, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Date, hasAnyTemplate=false, hasCachedValues=fal...#385#1520101832", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:1>", "true"}}, 3), new String[][]{{"getJSDocInfo", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:1>", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:13>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "2"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "5"}, {"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2), new String[][]{{"isNominalType", "", "4"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "7"}, {"getFirst", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "http://example.com/a?b=c", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:1>", "false"}}, 1), new String[][]{{"isSubtype", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:11>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:6>", "false"}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:9>", "false"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}}, 1), new String[][]{{"isRegexpType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<null>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NullType", actual.getClass().getName());
  assertEquals("null {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=FALSE, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheck...#374#-580826583", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<null>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasAnyTemplate=false, hasCachedValues=f...#388#-1381572682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<null>", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0> {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false...#449#-408295756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<null>", "false"}}, 1), new String[][]{{"autoboxesTo", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false"}, false), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"isTypeInferred", "", "0"}, {"isTypeInferred", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"isTypeInferred", "", "0"}, {"isTypeInferred", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:9>"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"isTypeInferred", "", "0"}, {"isTypeInferred", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:11>", "010", "false"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "5"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:11>", "010", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "5"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}, {"getParentScope", "", "1"}, {"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "+10", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 3), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "4"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}, {"getParentScope", "", "1"}, {"getParentScope", "", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"isObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getSuperClassConstructor", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#412#974593977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"forceResolve", "com.google.javascript.rhino.ErrorReporter,com.google.javascript.rhino.jstype.StaticScope", "6"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getNormalizedReferenceName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getPossibleToBooleanOutcomes", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", ".5", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanVa...#374#245596344", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:5>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:1>", "0xFFFFFFFF", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.1234567", "true"}}, 1), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:9>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.1234567", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:11>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.1234567", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:7>", "false"}}, 3), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getName", "", "6"}, {"getJSDocInfo", "", "5"}, {"getSuppressions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.1234567", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:7>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<null>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.0234567", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:7>", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "1.0234567", "false"}}, 1), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getName", "", "6"}, {"getJSDocInfo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "0.0234567", "false"}}, 1), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getName", "", "7"}, {"getJSDocInfo", "", "5"}, {"getTemplateTypeNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:14>", "<sample:5>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:15>", "/./24567", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getJSDocInfo", "", "7"}, {"hasThisType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"isRegexpType", "", "0"}, {"isObject", "", "3"}, {"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<null>", "<null>"}}, 2), new String[][]{{"getFirst", "", "0"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "0"}, {"getFirst", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:Error, *=, *=, *=): Error {canBeCalled=true, getDisplayName=Error, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=Error, getPossibleToBool...#430#-215566433", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:2>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:10>", "123456789012345678901234567890", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:9>", "true"}}, 2), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "B", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 2), new String[][]{{"getBindReturnType", "int", "5"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "1"}, {"collapseUnion", "", "1"}, {"collapseUnion", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (*=, *=): 0 {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, has...#410#693056998", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false), new String[][]{{"getFirst", "", "5"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "1"}, {"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:13>", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:6>", "2i1d74[836481.1234567", "true"}}, 3), new String[][]{{"getSlot", "java.lang.String", "2"}, {"getJSDocInfo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "2i1d74[836481.0234567", "true"}}, 2), new String[][]{{"getRootNode", "", "5"}, {"hasChildren", "", "0"}, {"isBreak", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", " ", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=??, hasAnyTemplate=false, hasCachedValue...#390#-139227026", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "Helxp, Wr?i", "true"}}, 3), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "6"}, {"getTypeOfThis", "", "3"}, {"getParentScope", "", "0"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "Hellxp, Wr?i", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:4>", "<sample:11>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "7"}, {"getTypeOfThis", "", "3"}, {"getParentScope", "", "0"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:5>", "true"}}, 3), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false), new String[][]{{"getFirst", "", "3"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"getFirst", "", "3"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"getFirst", "", "3"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "4"}, {"getRootNode", "", "3"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:2>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:8>", "true"}}), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:3>", "true"}}, 1), new String[][]{{"getRootNode", "", "0"}, {"autobox", "", "2"}, {"getCtorImplementedInterfaces", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType...#408#-1996376134", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "0`b", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#414#1124307327", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:15>", "0`b", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:3>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0.<function (new:0, *=, *=, *=): 0> {getDisplayName=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE, hasAnyTemplate=false, hasAnyTemplateInternal=false...#449#-408295756", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:0>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"getFirst", "", "6"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "2"}, {"getJSDocInfo", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"isNominalType", "", "7"}, {"autobox", "", "3"}, {"hasDisplayName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"isNominalType", "", "7"}, {"autobox", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplate=false, hasCach...#396#-1830455111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<null>", "<sample:9>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=1, getNormalizedReferenceName=Boolean, getPossibleToBoole...#428#-973281540", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string {canBeCalled=true, getDisplayName=Date, getExtendedInterfacesCount=0, getMaxArguments=7, getMinArguments=0, getNormalizedReferenceName=Date, get...#443#-620785362", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isC...#378#517479324", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#434#-946201890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:0>", "true"}, false, 1, new String[][]{}, 1), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "1"}, {"getOwnSlot", "java.lang.String", "7"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getSlot", "java.lang.String", "7"}, {"isTypeInferred", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:20>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, hasAnyTemplateInternal=false, hasDisplayName=false, isAllType...#408#-1996376134", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:19>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.StringType", actual.getClass().getName());
  assertEquals("string {canBeCalled=false, getDisplayName=string, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplate=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCh...#377#457258733", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:21>", "n-", "true"}}, 2), new String[][]{{"isConstructor", "", "5"}, {"isParameterizedType", "", "6"}, {"getPossibleToBooleanOutcomes", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:19>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:3>", "false"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}}, 3), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<null>", "<sample:7>"}}, 2), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "0"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:15>"}}, 1), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "1"}, {"getOwnSlot", "java.lang.String", "4"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:4>", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:24>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"createChildFlowScope", "", "0"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:19>", "+0", "false"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "2"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getSlot", "java.lang.String", "4"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"getFirst", "", "2"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "4"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:9>", ",/", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:0>"}}), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "2"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}, {"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:8>", ",", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:0>"}}, 2), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "2"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}, {"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:11>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:10>", "\u00ea", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:19>", ",", "true"}}, 2), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "4"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getTypeOfThis", "", "2"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "", "true"}, {"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "6"}, {"getJSDocInfo", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
}
