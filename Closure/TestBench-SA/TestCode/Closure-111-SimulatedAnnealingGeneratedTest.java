package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:0>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"getRestrictedTypeGivenToBooleanOutcome", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|[ArrowType]|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDispla...#426#-2038418446", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, null, 1), new String[][]{{"findPropertyType", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#413#-1184760881", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false,...#414#-1256976341", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAl...#409#1256278242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=?, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=?, hasAnyTemplateTypes=false, hasCachedValues=false...#384#1538094661", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<null>"}}), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 1), new String[][]{{"getBindReturnType", "int", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (): 0 {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=0, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=TRUE, getProper...#410#-920907761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:6>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}}, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:7>", "false"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}}), new String[][]{{"getFirst", "", "4"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}}, 3), new String[][]{{"getFirst", "", "4"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplateTypes=false, ha...#401#1567269814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:2>"}}), new String[][]{{"hasOwnProperty", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:7>", "Hello, orld", "false"}}), new String[][]{{"getSource", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#437#-744676034", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "false"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:4>", "true"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 24, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:3>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"getFirst", "", "6"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"canBeCalled", "", "3"}, {"isNumberObjectType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "1E-5", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "false"}, false);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:0>", "false"}, false), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}), new String[][]{{"getRootNode", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 3), new String[][]{{"getRootNode", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false, 0, null, 2), new String[][]{{"optimize", "", "4"}, {"createChildFlowScope", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:1>", "<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:0>", "<sample:4>"}, false, 11, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false), new String[][]{{"autoboxesTo", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplateTypes=false, ha...#401#1567269814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#419#2113707761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#419#2113707761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "0"}, {"getTypeOfThis", "", "0"}, {"createChildFlowScope", "", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "\t", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "\t", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=??, hasAnyTemplateTypes=false, hasCachedValues=fa...#386#9071217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "\t", "true"}, false), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "\t", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:1>"}}, 1), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", "\t", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:1>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "\t\t", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:8>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:5>"}}), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#413#-1184760881", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "\t\t", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:8>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:5>"}}, 1), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getDisplayName=null, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=null, getPossibleToBooleanOutcomes=EMPTY, getProper...#413#-1184760881", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "\t\t", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "\t\t\t", "false"}, false, 15, new String[][]{}, 1), new String[][]{{"clearResolved", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "-0.0", "false"}, false, 15, new String[][]{}, 1), new String[][]{{"clearCachedValues", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#419#2113707761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "-0.0", "true"}, false, 2, new String[][]{}, 1), new String[][]{{"clearCachedValues", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=??, hasAnyTemplateTypes=false, hasCachedValues=fa...#386#9071217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "-y/isNumberisNukl", "true"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBool...#362#-1122423617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "-y/isNumberisNukl", "true"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getDisplayName=<Any Type>, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasDisplayName=true, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBool...#362#-1122423617", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<sample:0>"}}), new String[][]{{"canCastTo", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:7>", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false,...#414#-1256976341", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:2>", "true"}, false, 16, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:3>", "true"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<null>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<null>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplateTypes=false, ha...#401#1567269814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:7>", "1474483648", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:3>", "<sample:2>"}}, 1), new String[][]{{"getFirst", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:7>", "<sample:0>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "false"}, false), new String[][]{{"getSlot", "java.lang.String", "1"}, {"getJSDocInfo", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"getSlot", "java.lang.String", "1"}, {"getJSDocInfo", "", "1"}, {"getReferences", "", "0"}, {"getOriginalCommentPosition", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "\u00e9", "false"}, false), new String[][]{{"isNumberValueType", "", "5"}, {"getDisplayName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<Any Type>", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "0.", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:4>", "true"}}), new String[][]{{"isObject", "", "5"}, {"getDisplayName", "", "1"}, {"findPropertyType", "java.lang.String", "4"}, {"isNoType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "H0/", "true"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:4>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "[1,2]", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:0>", "true"}}, 2), new String[][]{{"getFirst", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "true"}}), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "true"}}), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "false"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "true"}}, 3), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:2>", "true"}}, 3), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "a,b,c", "false"}}, 3), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "a,b,c", "false"}}, 3), new String[][]{{"getSlot", "java.lang.String", "3"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:7>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "a,b,c", "false"}}, 3), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "3"}, {"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=??, hasAnyTemplateTypes=false, hasCachedValues=fa...#386#9071217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#437#-744676034", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Date, ?=, ?=, ?=, ?=, ?=, ?=, ?=): string {canBeCalled=true, getDisplayName=Date, getExtendedInterfacesCount=0, getMaxArguments=7, getMinArguments=0, getNormalizedReferenceName=Date, get...#448#-237952636", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:Error, *=, *=, *=): Error {canBeCalled=true, getDisplayName=Error, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=Error, getPossibleToBool...#435#2054966481", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Date {canBeCalled=false, getDisplayName=Date, getNormalizedReferenceName=Date, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Date, hasAnyTemplateTypes=false, hasCachedValue...#390#-1336444649", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Array, ...[*]): Array {canBeCalled=true, getDisplayName=Array, getExtendedInterfacesCount=0, getMaxArguments=2147483647, getMinArguments=0, getNormalizedReferenceName=Array, getPossibleT...#437#-744676034", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Array {canBeCalled=false, getDisplayName=Array, getNormalizedReferenceName=Array, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Array, hasAnyTemplateTypes=false, hasCachedV...#393#1461331878", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Boolean, *=): boolean {canBeCalled=true, getDisplayName=Boolean, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=0, getNormalizedReferenceName=Boolean, getPossibleToBool...#434#-1403740150", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:2>", "<null>"}}, 1), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:4>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:4>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:7>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:6>", "true"}}), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "1"}, {"optimize", "", "3"}, {"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "abc", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:8>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:6>", "true"}}), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "1"}, {"optimize", "", "3"}, {"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:5>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "I", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:7>", "true"}, false), new String[][]{{"optimize", "", "4"}, {"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:1>", "<sample:7>"}}, 1), new String[][]{{"getFirst", "", "7"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "1"}, {"getSlot", "java.lang.String", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 16, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:1>", "<sample:8>"}}, 1), new String[][]{{"getFirst", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 21, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<null>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<null>", "true"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "7"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "3"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 23, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:6>", "true"}}, 1), new String[][]{{"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "7"}, {"getFirst", "", "3"}, {"append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getOwnSlot", "java.lang.String", "5"}, {"getType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getOwnSlot", "java.lang.String", "5"}, {"getType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:1>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:4>"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getOwnSlot", "java.lang.String", "6"}, {"getType", "", "7"}, {"isTypeInferred", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:6>"}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getOwnSlot", "java.lang.String", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:5>", "<sample:6>"}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<null>"}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getTypeOfThis", "", "0"}, {"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getTypeOfThis", "", "0"}, {"getRootNode", "", "1"}, {"hasMoreThanOneChild", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:6>", "false"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<sample:5>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:7>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:10>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}}, 2), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "false"}, false, 0, null, 1), new String[][]{{"createChildFlowScope", "", "4"}, {"getOwnSlot", "java.lang.String", "0"}, {"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "false"}, false, 1, new String[][]{}, 1), new String[][]{{"getSlot", "java.lang.String", "4"}, {"getType", "", "0"}, {"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 1, new String[][]{}, 1), new String[][]{{"getSlot", "java.lang.String", "4"}, {"getType", "", "0"}, {"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:7>", "<sample:6>"}}), new String[][]{{"getSlot", "java.lang.String", "4"}, {"getType", "", "0"}, {"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:7>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}), new String[][]{{"getSlot", "java.lang.String", "4"}, {"getType", "", "0"}, {"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:7>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}), new String[][]{{"getSlot", "java.lang.String", "4"}, {"getType", "", "0"}, {"getType", "", "6"}, {"getJSDocInfo", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:1>", "true"}, false, 0, null, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "false"}, false, 1, new String[][]{}, 2), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}}, 3), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "PT1H", "true"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "false"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:1>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "1"}, {"getName", "", "7"}, {"getName", "", "4"}, {"getName", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:4>", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:1>", "PT1H", "true"}}, 3), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "1"}, {"getName", "", "7"}, {"getName", "", "4"}, {"isTypeInferred", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:6>", "false"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<null>", "<sample:0>", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:4>", "true"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "1"}, {"getName", "", "7"}, {"getName", "", "4"}, {"isTypeInferred", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:8>", "<null>", "true"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:0>", "false"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<null>", "false"}, false, 16, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:3>", "false"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:7>", "false"}, false, 16, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<null>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:1>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:5>", "false"}}, 3), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "4"}, {"getDeclaration", "", "7"}, {"getNode", "", "1"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<null>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:5>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>", "<sample:4>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "false"}, false), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:9>", "false"}, false), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:0>", "false"}}, 2), new String[][]{{"isArrayType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:0>", "false"}}, 2), new String[][]{{"isArrayType", "", "6"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<null>", "<sample:4>"}}, 2), new String[][]{{"getOwnPropertyNames", "", "6"}, {"containsAll", "java.util.Collection", "6"}, {"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}}, 3), new String[][]{{"findPropertyType", "java.lang.String", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAl...#409#1256278242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:2>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:7>", "<sample:4>"}}, 3), new String[][]{{"getFirst", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:7>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "false"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "0"}, {"getJSDocInfo", "", "3"}, {"isConstructor", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:2>", "true"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "--1", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:8>", "<sample:2>", "true"}}, 3), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:5>", "true"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAl...#409#1256278242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1), new String[][]{{"isFunctionPrototypeType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#419#2113707761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:0>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:7>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getReferenceName", "", "2"}, {"canBeCalled", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:2>", "true"}, false, 0, null, 1), new String[][]{{"optimize", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:8>", "1.5f", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "1.5", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"clearResolved", "", "2"}, {"isConstructor", "", "1"}, {"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:5>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Array {canBeCalled=false, getDisplayName=Array, getNormalizedReferenceName=Array, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Array, hasAnyTemplateTypes=false, hasCachedV...#393#1461331878", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:5>", "<sample:4>"}}, 3), new String[][]{{"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:6>"}}, 3), new String[][]{{"isResolved", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<null>", "<null>"}}, 2), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<null>", "<null>"}}, 2), new String[][]{{"isCheckedUnknownType", "", "1"}, {"findPropertyType", "java.lang.String", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<null>", "<null>"}}, 2), new String[][]{{"isCheckedUnknownType", "", "1"}, {"findPropertyType", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=??, hasAnyTemplateTypes=false, hasCachedValues=fa...#386#9071217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:3>", "true"}}, 2), new String[][]{{"isRegexpType", "", "1"}, {"getLeastSupertype", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:0>", "true"}}, 2), new String[][]{{"isRegexpType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:5>", "<sample:5>"}, false, 16, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "isBoolean", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "", "false"}, false, 0, null, 2), new String[][]{{"dereference", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplateTypes=false, ha...#401#1567269814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false), new String[][]{{"isAllType", "", "7"}, {"getTemplateTypeMap", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.TemplateTypeMap", actual.getClass().getName());
  assertEquals("{ } {isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}, 1), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:6>", "true"}, false), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "2"}, {"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:7>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false,...#414#-1256976341", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:7>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "function", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}}, 1), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:1>", "false"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:7>", "<sample:3>", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<null>", "false"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getJSDocInfo", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:11>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<sample:6>", "<sample:3>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAl...#409#1256278242", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:6>"}}, 2), new String[][]{{"getTemplateTypeMap", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.TemplateTypeMap", actual.getClass().getName());
  assertEquals("{ } {isEmpty=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:0>", ".5", "true"}}, 2), new String[][]{{"getAllExtendedInterfaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<null>"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:6>", "true"}, false, 11, new String[][]{}, 1), new String[][]{{"getParentScope", "", "5"}, {"getParentScope", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:6>", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:6>", "<sample:5>", "false"}}, 3), new String[][]{{"getPropertyType", "java.lang.String", "5"}, {"getConstructor", "", "2"}, {"isAllType", "", "5"}, {"getOwnPropertyNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:2>", "true"}}, 3), new String[][]{{"getSuperClassConstructor", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (new:Object, *=): ? {canBeCalled=true, getDisplayName=Object, getExtendedInterfacesCount=0, getMaxArguments=1, getMinArguments=0, getNormalizedReferenceName=Object, getPossibleToBooleanOutcom...#423#1402043006", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 3), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 3), new String[][]{{"getDisplayName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Array", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:4>", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:5>", "true"}}, 3), new String[][]{{"getAllImplementedInterfaces", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:5>"}}, 2), new String[][]{{"getTypeOfThis", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:4>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:0>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:4>", "<sample:3>"}}, 2), new String[][]{{"getRootNode", "", "3"}, {"isCall", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:4>", "<sample:3>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:7>", "true"}}, 2), new String[][]{{"getRootNode", "", "4"}, {"isCall", "", "4"}, {"getLineno", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:4>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 0, null, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "6"}, {"getJSDocInfo", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false, 0, null, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "6"}, {"isTypeInferred", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:2>", "true"}, false), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "6"}, {"isTypeInferred", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}}, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:3>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:6>", "<sample:3>"}}, 3), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "2"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "3"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:7>"}}, 3), new String[][]{{"dereference", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplateTypes=false, ha...#401#1567269814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:10>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#419#2113707761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "x134679:+1boolean", "true"}, false, 12, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:5>", "false"}}, 2), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:5>", "<sample:0>"}}, 2), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:6>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:0>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2), new String[][]{{"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:0>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 2), new String[][]{{"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:4>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:6>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<null>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:2>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "a,b,c", "true"}}, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "5"}, {"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "7"}, {"getSlot", "java.lang.String", "6"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:3>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "a,b,c", "true"}}, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "5"}, {"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "7"}, {"getSlot", "java.lang.String", "6"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "12:30:45", "true"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "12:30:45", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:4>", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (new:0, *=, *=, *=): 0 {canBeCalled=true, getDisplayName=0, getExtendedInterfacesCount=0, getMaxArguments=3, getMinArguments=0, getNormalizedReferenceName=0, getPossibleToBooleanOutcomes=TRUE...#419#2113707761", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "isObject", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"extendTemplateTypeMap", "com.google.javascript.rhino.jstype.TemplateTypeMap", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<null>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "2020-02-30T25:61:61", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:7>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false,...#414#-1256976341", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "2020-02-30T2561:61", "false"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getDisplayName=boolean, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true...#375#1330362695", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", " 2020-02-30T2561:61", "false"}, false, 0, null, 3), new String[][]{{"getTypesUnderShallowEquality", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 7, new String[][]{}, 2), new String[][]{{"getOwnSlot", "java.lang.String", "3"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "true"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:4>", "true"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:5>", "false"}, false, 4, new String[][]{}, 1), new String[][]{{"getOwnSlot", "java.lang.String", "7"}, {"getName", "", "0"}, {"getName", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:2>", "<sample:0>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getSlot", "java.lang.String", "1"}, {"getJSDocInfo", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "false"}, false, 15, new String[][]{}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "0"}, {"getName", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:4>", "true"}}, 1), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.type.FlowScope", "0"}, {"getName", "", "4"}, {"isTypeInferred", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"getPropertiesCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 0, null, 3), new String[][]{{"isInstanceType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "2020-02-30T25:61:61", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:0>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "1e10", "false"}}, 3), new String[][]{{"getRootNode", "", "5"}, {"getCharno", "", "6"}, {"getFirstChild", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3), new String[][]{{"isNumberValueType", "", "3"}, {"autoboxesTo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {canBeCalled=false, getDisplayName=Boolean, getNormalizedReferenceName=Boolean, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=0, getReferenceName=Boolean, hasAnyTemplateTypes=false, ha...#401#1567269814", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope"}, new String[]{"<null>", "<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:0>", "A0xFFFFFFFFi", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"getDisplayName", "", "5"}, {"canCastTo", "com.google.javascript.rhino.jstype.JSType", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 2), new String[][]{{"getTemplateTypeMap", "", "5"}, {"getTemplateTypeKeyByName", "java.lang.String", "4"}, {"getTemplateKeys", "", "2"}, {"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"getOwnSlot", "java.lang.String", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:3>", "false"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:7>", "<sample:6>"}}, 2), new String[][]{{"completeScope", "com.google.javascript.rhino.jstype.StaticScope", "5"}, {"getTypeOfThis", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "6"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "T", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:5>", "<sample:6>", "false"}}, 2), new String[][]{{"isNoType", "", "1"}, {"canTestForShallowEqualityWith", "com.google.javascript.rhino.jstype.JSType", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:0>", "<sample:5>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:2>", "true"}}, 3), new String[][]{{"canCastTo", "com.google.javascript.rhino.jstype.JSType", "2"}, {"extendTemplateTypeMap", "com.google.javascript.rhino.jstype.TemplateTypeMap", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "123456789012345678901234567890", "false"}, false, 14, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<null>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:0>", "<sample:0>"}}, 3), new String[][]{{"isDict", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:3>", "true"}, false, 13, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"getSlot", "java.lang.String", "7"}, {"getName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:7>", "true"}, false, 10, new String[][]{}, 2), new String[][]{{"getSlot", "java.lang.String", "2"}, {"getName", "", "7"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.type.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>", "<null>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:3>", "<sample:4>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<null>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:4>", "<null>"}}, 3), new String[][]{{"getImplementedInterfaces", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "isNumber", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("?? {canBeCalled=true, getDisplayName=Unknown, getNormalizedReferenceName=??, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=0, getReferenceName=??, hasAnyTemplateTypes=false, hasCachedValues=fa...#386#9071217", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "1.123446789012345function", "false"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "5"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 2), new String[][]{{"isGlobalThisType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:4>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:2>", "<sample:6>", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:5>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<null>", "-1.51.25", "false"}}, 3), new String[][]{{"getSlot", "java.lang.String", "0"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:5>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:4>", "<sample:7>", "false"}}, 2), new String[][]{{"getSlot", "java.lang.String", "0"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:9>", "<sample:2>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:0>", "isObject", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<null>", "<null>", "true"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<null>"}}), new String[][]{{"getFirst", "", "6"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"optimize", "", "4"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 1), new String[][]{{"getFirst", "", "6"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "7"}, {"optimize", "", "4"}, {"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:1>"}, false), new String[][]{{"getFirst", "", "1"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "2"}, {"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:7>", "<sample:2>", "false"}}, 2), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:4>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}, 3), new String[][]{{"createChildFlowScope", "", "7"}, {"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:7>", "true"}, false, 2, new String[][]{}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "4"}, {"getType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 3), new String[][]{{"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}, 2), new String[][]{{"getFirst", "", "5"}, {"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "3"}, {"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "<sample:1>", "<sample:1>", "true"}, {"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "<sample:1>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}, {"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}}, 2), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.type.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "false"}, false, 0, null, 3), new String[][]{{"getTypeOfThis", "", "4"}, {"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope", "<sample:1>", "<sample:0>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean", "6"}, {"getSlot", "java.lang.String", "7"}, {"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
}
