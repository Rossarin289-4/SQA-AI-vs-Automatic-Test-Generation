package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.HashMultimap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:1>", "<sample:1>", "true"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:4>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:8>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:10>", "<sample:5>"}}), new String[][]{{"getSlot", "java.lang.String", "5"}, {"getType", "", "5"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:15>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:7>", "<sample:6>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:13>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}, {"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:7>", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:Date, ?, ?, ?, ?, ?, ?, ?): string {canBeCalled=true, getMaxArguments=7, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanc...#412#-289356971", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<i:62>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.HashMultimap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "false"}, false, 0, null, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:7>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:4>", "<sample:7>", "true"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:8>", "<sample:4>", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:4>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:0>", "<sample:5>", "false"}}, 1);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>", "<sample:8>", "<sample:2>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<i:2>", "<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:0>", "<sample:7>", "<sample:2>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:8>"}}, 2), new String[][]{{"isNoType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:6>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "\tHello, World", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:5>", "<null>", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<i:-2>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<null>", "<sample:0>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:7>", "<sample:7>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:7>"}}, 1), new String[][]{{"createChildFlowScope", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:0>", "<sample:4>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:3>", "<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:3>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:4>"}}, 3), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "2"}, {"getOwnSlot", "java.lang.String", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:3>", "<sample:6>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "1.5e3002020-01-01", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "011", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:1>", "<sample:2>", "true"}}, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "1"}, {"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:6>", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:10>", "<sample:0>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:7>", "<sample:7>", "false"}}, 2);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:9>", "<sample:0>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>", "<sample:3>", "<sample:6>"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:8>"}}, 1), new String[][]{{"autoboxesTo", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:8>", "5. ", "false"}, false, 5, new String[][]{}, 3), new String[][]{{"getPossibleToBooleanOutcomes", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:0>", "<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:7>", "<sample:5>", "true"}, false, 6, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"disconnectInDirection", "java.lang.Object,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:8>"}}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "7"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:4>", "<sample:5>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:0>", "<sample:2>"}}, 2), new String[][]{{"completeScope", "com.google.javascript.jscomp.Scope", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:2>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:1>"}}, 3), new String[][]{{"getMinArguments", "", "1"}, {"clearResolved", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:EvalError, *, *, *): EvalError {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceTyp...#408#-1262137555", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "ab", "true"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3), new String[][]{{"getCtorImplementedInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<null>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:6>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Array {getPossibleToBooleanOutcomes=TRUE, getReferenceName=Array, hasReferenceName=true, isAllType=false, isArrayType=true, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=fa...#379#1118089913", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:0>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<null>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"2147483588"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:6>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:1>", "<sample:7>", "false"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:2>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:6>", "<sample:0>", "<sample:0>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:4>", "<sample:6>", "false"}}, 2), new String[][]{{"forgiveUnknownNames", "", "5"}, {"getPropertyType", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasReferenceName=false, isAllType=false, isArrayType=false, isBooleanO...#371#-948494644", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:7>", "<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknow...#407#-1501003251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 3), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "5"}, {"getParentScope", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 5, new String[][]{}, 1), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:8>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 3), new String[][]{{"getEdges", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:1>", "<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:3>", "<sample:6>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>", "<sample:6>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:1>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<null>", " 2147483648", "false"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:0>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "25"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "isForward", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<null>", "<sample:5>", "true"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:2>", "<sample:6>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("FALSE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:5>", "<sample:7>", "false"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "analyze", ""}}), new String[][]{{"getTypeOfThis", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ParameterizedType", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>", "<sample:5>", "<sample:3>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<null>", "<sample:3>", "true"}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<null>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.HashMultimap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<null>", "<sample:2>", "true"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:5>", "<sample:6>", "false"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<null>", "<sample:1>", "<sample:5>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:6>", "<sample:1>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createEntryLattice", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:5>", "<null>", "<sample:8>"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false), new String[][]{{"getJSDocInfo", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:1>", "<sample:0>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "5"}, {"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "0"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:9>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:0>", "<sample:0>"}}), new String[][]{{"getParentScope", "", "5"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<s:>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "2147483584"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:4>", "<sample:4>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType...#402#7575862", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:0>"}, false), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147475422"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:8>", "<sample:5>", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:0>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:0>"}}), new String[][]{{"isResolved", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false), new String[][]{{"isDateType", "", "4"}, {"getParametersNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LP {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=83, hasChildren=true, hasMoreThanOne...#369#1758923720", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ControlFlowGraph", actual.getClass().getName());
  assertEquals("{getName=LinkedGraph, isDirected=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:1>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:10>", "<sample:3>", "<sample:2>"}}), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:3>", "<sample:3>", "<sample:2>"}}), new String[][]{{"createChildFlowScope", "", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:2>", "11E.5", "false"}, false, 3, new String[][]{}), new String[][]{{"testForEquality", "com.google.javascript.rhino.jstype.JSType", "2"}, {"dereference", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {getPossibleToBooleanOutcomes=TRUE, getReferenceName=Boolean, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=true, isBooleanValueType=false, isCheckedUnknownTyp...#383#1149601129", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:1>", "<sample:5>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "5.1.1234567890123456", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:1>", "<sample:7>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "Hello,!World", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<i:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:1>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:0>"}}), new String[][]{{"differsFrom", "com.google.javascript.rhino.jstype.JSType", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"isNullable", "", "5"}, {"isNumberValueType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:8>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}), new String[][]{{"getName", "", "5"}, {"getDirectedGraphNodes", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, true]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null, c]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:10>", "<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:4>", "<sample:6>", "true"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:3>", "<sample:2>", "<sample:8>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getSlot", "java.lang.String", "7"}, {"getSlot", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:7>", "<sample:0>", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<null>", "<sample:1>", "false"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "initialize", ""}}), new String[][]{{"getEdges", "java.lang.Object,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:9>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flow", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:4>", "0x1F1.5", "true"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false), new String[][]{{"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getTypeOfThis", "", "7"}, {"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>"}, false, 5, new String[][]{}), new String[][]{{"isArrayType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:0>", "isObject1L", "false"}, false, 7, new String[][]{}), new String[][]{{"isVoidType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}}), new String[][]{{"isVoidType", "", "6"}, {"isVoidType", "", "4"}, {"matchesStringContext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:0>", "<sample:4>"}, false, 4, new String[][]{}), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "5"}, {"createChildFlowScope", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:7>", "<null>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:2>", "sNull", "false"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "1", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}), new String[][]{{"isBooleanObjectType", "", "7"}, {"getPossibleToBooleanOutcomes", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:6>", "<sample:3>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<null>", "<sample:5>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:9>", "<sample:2>", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"optimize", "", "4"}, {"getOwnSlot", "java.lang.String", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("EvalError {getPossibleToBooleanOutcomes=TRUE, getReferenceName=EvalError, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnkno...#388#950802436", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:5>", "<sample:0>", "false"}}, 3), new String[][]{{"isNoType", "", "5"}, {"differsFrom", "com.google.javascript.rhino.jstype.JSType", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:7>", "<null>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:6>", "5-0.0", "false"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.AllType", actual.getClass().getName());
  assertEquals("* {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=true, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, isDate...#367#258760268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:2>", "<sample:3>", "true"}}, 3), new String[][]{{"getRestrictedUnion", "com.google.javascript.rhino.jstype.JSType", "5"}, {"getTypesUnderShallowInequality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:3>", "<sample:2>", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.SemanticReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:10>", "<sample:7>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}}, 3), new String[][]{{"optimize", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("BOTH", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:7>", "1.1234567t", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:5>"}}), new String[][]{{"isArrayType", "", "4"}, {"dereference", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasReferenceName=false, isAllType=false, isArrayType=false, isBooleanO...#371#-948494644", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:10>", "<sample:2>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:8>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:0>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:11>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:10>"}}, 1), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "7"}, {"getOwnSlot", "java.lang.String", "6"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:14>", "<sample:3>", "true"}}, 2), new String[][]{{"getPropertyType", "java.lang.String", "6"}, {"isNumberObjectType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:0>", "<sample:2>"}, false, 7, new String[][]{}), new String[][]{{"getTypeOfThis", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknow...#407#-1501003251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<null>", "<sample:6>", "true"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"java.lang.Object", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<s:key>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:11>", "<sample:0>", "true"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:4>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false), new String[][]{{"optimize", "", "6"}, {"getSlot", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}}), new String[][]{{"isUnknownType", "", "7"}, {"findPropertyType", "java.lang.String", "7"}, {"canTestForEqualityWith", "com.google.javascript.rhino.jstype.JSType", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:8>", "<sample:2>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:Boolean, *): boolean {canBeCalled=true, getMaxArguments=1, getMinArguments=1, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, ha...#398#-482772886", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"getPrototype", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("Date.prototype {getPossibleToBooleanOutcomes=TRUE, getReferenceName=Date.prototype, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCh...#398#-851478314", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}), new String[][]{{"getReturnType", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.StringType", actual.getClass().getName());
  assertEquals("string {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=false, isConstructor=false, ...#373#-1603516938", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:6>"}}, 2), new String[][]{{"isCheckedUnknownType", "", "1"}, {"isArrayType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", ""}}, 2), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "1"}, {"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "5"}, {"completeScope", "com.google.javascript.jscomp.Scope", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:11>", "<sample:1>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:1>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:4>", "1Wjf", "true"}}), new String[][]{{"getSlot", "java.lang.String", "6"}, {"getName", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}), new String[][]{{"getPropertyType", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnknownType", actual.getClass().getName());
  assertEquals("? {canBeCalled=true, getPossibleToBooleanOutcomes=BOTH, getPropertiesCount=2147483647, getReferenceName=?, hasCachedValues=false, hasReferenceName=false, isAllType=false, isArrayType=false, isBooleanO...#371#-948494644", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:3>", "false"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:7>"}}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "4"}, {"getName", "", "1"}, {"getName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:7>"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:2>", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:8>", "1.66", "true"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}), new String[][]{{"createChildFlowScope", "", "7"}, {"getOwnSlot", "java.lang.String", "7"}, {"getName", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:3>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter", "<sample:1>"}}), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "7"}, {"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:7>", "<null>", "false"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|null|number|string) {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType...#402#7575862", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:6>", "<sample:0>", "false"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("com.google.javascript.jscomp.DataFlowAnalysis$MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", ""}}), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "7"}, {"getValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<null>", "<sample:5>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:9>", "<sample:2>", "false"}}, 2), new String[][]{{"getSlot", "java.lang.String", "7"}, {"isTypeInferred", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:5>", "0xFFFFFFFF1E-5", "false"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:7>", "<sample:4>", "false"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:10>", "<sample:10>"}}, 2), new String[][]{{"hasProperty", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 2), new String[][]{{"getTypeOfThis", "", "5"}, {"isConstructor", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", new String[]{"com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "boolean"}, new String[]{"<sample:1>", "<sample:5>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "joinInputs", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:1>", "goog2020-02-30T25:61:611.5e300", "false"}}, 2), new String[][]{{"getGreatestSubtype", "com.google.javascript.rhino.jstype.JSType", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.NoType", actual.getClass().getName());
  assertEquals("None {canBeCalled=true, getMaxArguments=2147483647, getMinArguments=0, getPossibleToBooleanOutcomes=EMPTY, getPropertiesCount=2147483647, getReferenceName=null, getTemplateTypeName=null, hasCachedValu...#395#-1657693781", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:3>", "true"}, false, 3, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "5"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:6>", "<sample:2>", "true"}, false, 4, new String[][]{}), new String[][]{{"getTypeOfThis", "", "5"}, {"getOwnSlot", "java.lang.String", "2"}, {"getType", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:7>", "<sample:3>", "true"}, false), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:0>", "<sample:2>", "<sample:4>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 1), new String[][]{{"isFunctionPrototypeType", "", "3"}, {"isFunctionType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:10>", "<null>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:3>", "<sample:2>", "true"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "010", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}, {"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:5>", "<sample:4>"}}), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:11>", "<sample:3>", "false"}, false, 5, new String[][]{}, 1), new String[][]{{"inferSlotType", "java.lang.String,com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<sample:3>", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:4>", "true"}, false), new String[][]{{"getSlot", "java.lang.String", "7"}, {"isTypeInferred", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:3>", "<sample:10>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>", "<sample:0>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:11>", "<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:2>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "initialize", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getCfg", ""}, {"com.google.javascript.jscomp.TypeInference", "getCfg", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flow", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"optimize", "", "2"}, {"getTypeOfThis", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:11>", "<sample:7>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:9>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>", "<sample:8>", "<sample:5>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "analyze", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:3>", "<sample:7>", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Boolean {getPossibleToBooleanOutcomes=TRUE, getReferenceName=Boolean, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=true, isBooleanValueType=false, isCheckedUnknownTyp...#383#1149601129", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<b:true>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknow...#407#-1501003251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 3), new String[][]{{"findPropertyType", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:13>", "<sample:4>", "true"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:5>", "<sample:5>", "false"}}, 1), new String[][]{{"isObject", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:10>", "<sample:0>"}, false, 1, new String[][]{}), new String[][]{{"getSlot", "java.lang.String", "1"}, {"isTypeInferred", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 3), new String[][]{{"dereference", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<s:Hb>", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.HashMultimap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", ""}}), new String[][]{{"popEdgeAnnotations", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<null>", "<null>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", "com.google.javascript.jscomp.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType", "<sample:2>", "<sample:11>", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"getMinArguments", "", "5"}, {"defineInferredProperty", "java.lang.String,com.google.javascript.rhino.jstype.JSType,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "isForward", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<sample:7>", "<sample:7>"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-50"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "-2147483648"}}, 2), new String[][]{{"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasCachedValues=false, hasReferenceName=true, isAllType=false, isArrayTy...#391#-545055201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:1>", "<empty>", "<sample:0>"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "joinInputs", new String[]{"com.google.javascript.jscomp.graph.DiGraph$DiGraphNode"}, new String[]{"<null>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<null>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<s:>", "<sample:2>"}, {"com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:5>", "true"}, false, 1, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:10>", "<sample:3>"}}, 2), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "7"}, {"createChildFlowScope", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getSlot", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<null>", "<sample:5>"}}, 3), new String[][]{{"isConnected", "java.lang.Object,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "join", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<sample:7>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:11>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.TypeInference", "analyze", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<null>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<d:5.3740000000000006>", "<sample:7>"}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}), new String[][]{{"getDirectedSuccNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:4>", "false"}, false, 7, new String[][]{}), new String[][]{{"getSlot", "java.lang.String", "7"}, {"getName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:9>"}, false, 0, null, 1), new String[][]{{"getTypesUnderInequality", "com.google.javascript.rhino.jstype.JSType", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.JSType$TypePair", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:0>", "1.1234567890123456", "true"}}, 2), new String[][]{{"dereference", "", "6"}, {"isArrayType", "", "7"}, {"getImplicitPrototype", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionPrototypeType", actual.getClass().getName());
  assertEquals("Error.prototype {getPossibleToBooleanOutcomes=TRUE, getReferenceName=Error.prototype, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, is...#400#-778310190", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getAssignedOuterLocalVars", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.common.collect.HashMultimap", actual.getClass().getName());
  assertEquals("{}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"getOwnSlot", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.InstanceObjectType", actual.getClass().getName());
  assertEquals("Date {getPossibleToBooleanOutcomes=TRUE, getReferenceName=Date, hasReferenceName=true, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknownType=fal...#377#1420183255", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "isForward", ""}, {"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:0>", "<sample:0>"}}, 2), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:8>", "<sample:0>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getBooleanOutcomePair", "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,com.google.javascript.jscomp.TypeInference$BooleanOutcomePair,boolean", "<sample:1>", "<sample:7>", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:8>", "<sample:4>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:7>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "4"}, {"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:3>", "<sample:1>", "true"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:7>", "<sample:4>"}}), new String[][]{{"optimize", "", "0"}, {"getTypeOfThis", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "createInitialEstimateLattice", ""}}, 3), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "1"}, {"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:11>", "<sample:11>", "true"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:3>"}}, 3), new String[][]{{"optimize", "", "1"}, {"getOwnSlot", "java.lang.String", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<null>", "<sample:0>", "false"}}, 3), new String[][]{{"isUnknownType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:1>", "<sample:7>", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:5>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:4>"}}), new String[][]{{"getSlot", "java.lang.String", "7"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"isEmptyType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "append", new String[]{"com.google.javascript.jscomp.ChainableReverseAbstractInterpreter"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:0>"}}, 2), new String[][]{{"getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "4"}, {"getSlot", "java.lang.String", "2"}, {"isTypeInferred", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:5>", "<null>", "true"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:3>", "\n", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:10>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanType", actual.getClass().getName());
  assertEquals("boolean {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=true, isCheckedUnknownType=false, isConstructor=false, ...#373#1736952704", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(Object|boolean|number|string|undefined) {canBeCalled=false, getPossibleToBooleanOutcomes=BOTH, isAllType=false, isArrayType=false, isBooleanObjectType=false, isBooleanValueType=false, isCheckedUnknow...#407#-1501003251", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:5>"}, false, 0, null, 2), new String[][]{{"getSource", "", "6"}, {"getRestrictedTypeGivenToBooleanOutcome", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.ErrorFunctionType", actual.getClass().getName());
  assertEquals("function (this:0, *, *, *): 0 {canBeCalled=true, getMaxArguments=3, getMinArguments=0, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, hasUnkno...#392#-1599666771", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:1>", "<sample:5>", "true"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope,boolean", "<sample:13>", "<sample:3>", "true"}}, 2), new String[][]{{"getTypesUnderEquality", "com.google.javascript.rhino.jstype.JSType", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:4>", "<sample:9>", "false"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("TRUE", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "computeEscaped", new String[]{"com.google.javascript.jscomp.Scope", "java.util.Set", "com.google.javascript.jscomp.AbstractCompiler"}, new String[]{"<sample:2>", "<sample:0>", "<sample:7>"}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:8>", "<sample:9>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:1>", "<null>", "true"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:2>", "<sample:1>", "false"}, false, 7, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getFirst", ""}}, 1), new String[][]{{"getParentScope", "", "5"}, {"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<null>", "<sample:6>", "true"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "nextPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:11>", "<sample:7>", "false"}, false, 7, new String[][]{}, 3), new String[][]{{"getOwnSlot", "java.lang.String", "5"}, {"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "join", new String[]{"com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement"}, new String[]{"<null>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", new String[]{"com.google.javascript.rhino.jstype.JSType", "java.lang.String", "boolean"}, new String[]{"<sample:1>", "0x123456789prototype", "false"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "createEntryLattice", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "flowThrough", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:7>", "<sample:3>"}}, 1), new String[][]{{"inferQualifiedSlot", "java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.LinkedFlowScope", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:9>", "<sample:6>", "false"}, false, 0, null, 3), new String[][]{{"findUniqueRefinedSlot", "com.google.javascript.jscomp.FlowScope", "3"}, {"getType", "", "7"}, {"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.TypeInference", "branchedFlowThrough", "java.lang.Object,com.google.javascript.jscomp.DataFlowAnalysis$LatticeElement", "<s:bb>", "<sample:7>"}}), new String[][]{{"createDirectedGraphNode", "java.lang.Object", "6"}, {"getValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "flowThrough", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}, {"com.google.javascript.jscomp.TypeInference", "getExitLatticeElement", ""}}, 3);
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", new String[]{"com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutNull", "com.google.javascript.rhino.jstype.JSType", "<sample:2>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", "com.google.javascript.rhino.jstype.JSTypeNative", "<null>"}}, 2), new String[][]{{"isBooleanValueType", "", "1"}, {"isUnionType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getBooleanOutcomes", new String[]{"com.google.javascript.rhino.jstype.BooleanLiteralSet", "com.google.javascript.rhino.jstype.BooleanLiteralSet", "boolean"}, new String[]{"<sample:0>", "<sample:4>", "true"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.BooleanLiteralSet", actual.getClass().getName());
  assertEquals("EMPTY", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getNativeType", new String[]{"com.google.javascript.rhino.jstype.JSTypeNative"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getTypeIfRefinable", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.FlowScope", "<sample:12>", "<sample:1>"}, {"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedByTypeOfResult", "com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean", "<sample:3>", "abc", "true"}}, 2), new String[][]{{"forgiveUnknownNames", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.FunctionType", actual.getClass().getName());
  assertEquals("function (this:Boolean, *): boolean {canBeCalled=true, getMaxArguments=1, getMinArguments=1, getPossibleToBooleanOutcomes=TRUE, getTemplateTypeName=null, hasCachedValues=true, hasInstanceType=true, ha...#398#-482772886", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.TypeInference", "com.google.javascript.jscomp.TypeInference", "getCfg", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getDirectedGraphNode", "java.lang.Object", "0"}, {"getNeighborNodes", "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "declareNameInScope", new String[]{"com.google.javascript.jscomp.FlowScope", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.jstype.JSType"}, new String[]{"<sample:0>", "<null>", "<sample:3>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "firstPreciserScopeKnowingConditionOutcome", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.FlowScope", "boolean"}, new String[]{"<sample:0>", "<sample:5>", "true"}, false, 0, new String[][]{{"com.google.javascript.jscomp.ClosureReverseAbstractInterpreter", "getRestrictedWithoutUndefined", "com.google.javascript.rhino.jstype.JSType", "<sample:6>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "6"}, {"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
