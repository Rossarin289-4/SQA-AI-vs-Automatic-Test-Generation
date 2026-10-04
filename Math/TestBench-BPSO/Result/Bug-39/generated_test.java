package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:7>", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "33"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"1.7976931348623155E308", "20.0", "NaN", "1.7976931348623157E308"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=20.0, getMinReduction=0.2, getMinStep=1.7976931348623155E308, getN...#251#1178877590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:3>", "<sample:2>", "<empty>", "0.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:7>", "1.7976931348623157E308", "-0.49999999999999994", "10", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "0.1", "10.058", "0.0", "-0.9999999999999999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.058, getMinReduction=0.2, getMinStep=0.1, getName=Dormand-Princ...#234#-1777969039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"0.19999999999999998"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#247#-450857734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:6>", "-1.7976931348623155E308"}}, 1), new String[][]{{"iterator", "", "5"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:7>", "<sample:1>", "<sample:0>", "0.2"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-3.3", "true", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:0>", "<null>", "0.18"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:0>", "<sample:2>", "1.7976931348623157E308"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"36.0", "false", "false"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"0.2", "<sample:1>", "<sample:2>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-1.0000000000000002, getMinStep=1.0, getName=...#247#1818101497", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "Infinity", "0.45", "-1.0", "0.9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.45, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Pr...#237#1203910557", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-Infinity, getMinStep=1.0, getName=Dormand-Pr...#237#-1307534096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "1", "<empty>", "-1.7976931348623157E308", "<sample:1>", "<sample:0>", "<sample:1>", "<sample:5>"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<null>", "1.0"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.873"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "1.0", "<sample:1>", "-2.0", "<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.0", "true", "true"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:5>", "Infinity", "0.15300000000000005", "2147483647", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "Infinity", "<sample:4>", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:4>", "-1.0", "1.7976931348623157E308", "-39", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-Infinity", "false", "true"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "Infinity", "<sample:6>", "10.0", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "Infinity", "true", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:0>", "<sample:4>", "Infinity"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "4.9E-324"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"false", "-2147483648", "<sample:3>", "-10.0", "<sample:2>", "<sample:1>", "<sample:1>", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "0.2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}}, 1), new String[][]{{"addAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "20.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=20.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#1571493878", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "0.2", "<sample:0>", "-0.3919999999999998", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initIntegration", "double,double[],double", "9.999999999999998", "<sample:5>", "9.999999999999998"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-0.25", "false", "true"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-0.4"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-0.4, getMinStep=0.0, getName=Dormand-Prince ...#232#-406177806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "-1.7976931348623155E308", "0.9", "-Infinity", "0.9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.9, getMinReduction=0.2, getMinStep=1.7976931348623155E308, getNa...#250#-1195967607", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:2>", "Infinity", "-Infinity", "64"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "-0.9999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "-0.1"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "4"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"46.0", "<sample:0>", "-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-0.9999999999999999", "true", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<null>", "<sample:3>", "<empty>", "8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"true", "2147483616", "<sample:2>", "-0.28500000000000003", "<sample:5>", "<sample:0>", "<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "-2.0", "-3.3", "<sample:0>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:4>", "100.0", "0.8999999999999999", "-2147483647", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=9, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#-1570692122", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "NaN", "-2147483641"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:1>", "<sample:2>", "-1.7976931348623157E308"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "false"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "9.0", "Infinity", "-1.0", "-15.100000000000001"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=9.0, getName=Dorman...#241#458490219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-8.4", "false", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:9>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<sample:0>", "<empty>", "1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<null>", "Infinity", "-1.7976931348623157E308", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "1.0000000000000002", "<sample:1>", "-0.49999999999999994", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:0>", "<sample:1>", "5.0"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-0.9999999999999999", "<sample:2>", "<sample:3>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "1073741823", "<sample:1>", "0.1", "<empty>", "<empty>", "<sample:3>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<empty>", "<sample:0>", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"9.910000000000002", "Infinity", "NaN", "4.4942328371557893E307"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=9.910000000000002, ...#255#-54374143", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "0.1", "Infinity", "-1.7976931348623157E308", "-0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=0.1, getName=Dorman...#241#1914630707", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "1.7976931348623157E308", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<null>", "1.839"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:7>", "0.3", "100.0", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"-1.7976931348623157E308", "0.2", "1.0000000000000004", "1.7976931348623157E308"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.2, getMinReduction=0.2, getMinStep=1.7976931348623157E308, getNa...#250#-1080846354", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"-0.9999999999999998", "-0.9999999999999999", "-11.400000000000002", "0.4"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.9999999999999999, getMinReduction=0.2, getMinStep=0.999999999999...#261#-1173482135", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<sample:0>", "<sample:4>", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "9.0", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#1771731541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:6>", "1.0", "1.217", "2147483647", "<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "-1.7976931348623157E308", "-1.7976931348623155E308", "NaN", "50.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.7976931348623155E308, getMinReduction=0.2, getMinStep=1.797...#274#-1540548248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-8.988465674311579E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#250#-1031472259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.9", "true", "false"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<empty>", "<sample:2>", "<null>", "-0.49999999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), get...#223#482050686", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"5.0", "Infinity", "0.02999999999999997", "-0.49999999999999994"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=5.0, getName=Dormand-Pri...#236#509269297", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=NaN, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#291949117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"8.98846567431158E307"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-8.988465674311579E307", "<sample:1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#248#914142629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"0.2", "-0.16999999999999998", "-1.0699999999999998", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.16999999999999998, getMinReduction=0.2, getMinStep=0.2, getName=...#247#1605659155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "1.0", "<sample:2>", "20.0", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-0.9999999999999999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:5>", "Infinity", "-1.9999999999999998", "0", "<sample:7>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#236#-1167884442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "44.0", "-0.6899999999999997", "-73.0", "10.479"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.6899999999999997, getMinReduction=0.2, getMinStep=44.0, getName=...#247#1584604836", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"Infinity", "<sample:1>", "20.0"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:3>", "-0.98", "NaN", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:7>", "-1.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:0>", "<null>", "-0.503"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1073741823, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-1929584759", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "-2147483648", "<sample:0>", "59.9", "<sample:0>", "<sample:2>", "<sample:2>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-Infinity"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#247#-1950320581", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "3.6"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:4>", "-1.7976931348623157E308"}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=3.6, getMinStep=0.0, getName=Dormand-Prince 5...#231#-1709884340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-10.0", "<sample:1>", "-0.2"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:2>", "<sample:1>", "<sample:2>", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-0.9999999999999999, getMinStep=Infinity...#257#-1228284308", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.7976931348623157E308, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getNam...#249#-1501923488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.0, getMinStep=0.0, getName=Dormand-Prince ...#232#-1071808299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"Infinity", "false", "false"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "3.3", "Infinity", "<sample:2>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=3.3, getName=Dormand-Pri...#236#-1189444656", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-2.6"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-2.6, getMinStep=Infinity, getName=...#247#-1322393027", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#237#70246295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "Infinity", "<empty>", "<empty>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:1>", "-1.0", "2.0", "-4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:4>", "<sample:2>", "<sample:0>", "-0.1"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<sample:1>", "<sample:1>", "0.4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2081443883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.7976931348623157E308", "false", "true"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:0>", "-1.0", "0.1", "9", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.7976931348623157E308, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getNam...#249#-802299902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"1.8", "12.9", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.09999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=12.9, getMinReduction=0.09999999999999999, getMinStep=1.8, getName...#248#843842899", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-8388598"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "0.9", "<empty>", "-1.7976931348623155E308", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"NaN", "<empty>", "10.0"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:6>", "0.1", "-1.7976931348623157E308", "4", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-38.8", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"NaN", "<sample:2>", "27.9"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initIntegration", "double,double[],double", "-0.893", "<sample:1>", "0.1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"false", "2147483647", "<sample:0>", "9.0", "<sample:2>", "<sample:0>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "Infinity", "<sample:2>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-0.9999999999999999, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity,...#256#797165757", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:8>", "Infinity"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"-1.7976931348623155E308", "-1.7976931348623157E308", "<sample:1>", "<sample:1>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.7976931348623157E308, getMinReduction=0.2, getMinStep=1.79769313...#269#259847782", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"-6.0", "Infinity", "<sample:0>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-1.7976931348623157E308", "false", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=6.0, getName=Dormand-Pri...#236#610181264", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:4>", "-0.0"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<empty>", "<sample:0>", "1.9999999999999998"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "2147483647", "<sample:2>", "-6.6000000000000005", "<sample:0>", "<sample:3>", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "9.999999999999998", "<null>", "-1.7976931348623157E308", "<empty>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "9.999999999999998"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince ...#232#-1168683845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}), new String[][]{{"contains", "java.lang.Object", "1"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "0.10000000000000002", "<sample:3>", "1.0", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"10.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "0", "<null>", "NaN", "<null>", "<sample:5>", "<sample:4>", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "1.8"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:7>", "0.0", "10.0", "5"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<sample:0>", "<sample:1>", "0.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:0>", "0.2", "<sample:1>", "Infinity", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:9>", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-0.9999999999999999, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0,...#256#-1764219781", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:8>", "-0.9999999999999999", "1.0", "-1"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "2147483647", "<sample:3>", "-1.7976931348623157E308", "<empty>", "<sample:0>", "<sample:0>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "-0.9999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "8.988465674311579E307", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#1250954806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.0", "true", "true"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "0.0", "<sample:1>", "-1.0", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "0.0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-49"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "1.7976931348623155E308", "0.0", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:3>", "1.0", "0.19999999999999998", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.9"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.9, getMinStep=1.0, getName=Dormand-Prince 5...#231#-110151958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "9.000000000000002"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=9.000000000000002, getMinStep=0.0, getName=Do...#245#4653770", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:2>", "1.0", "1.8000000000000003", "-31", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"9.0", "true", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"true", "0", "<null>", "0.9000000000000001", "<sample:0>", "<sample:2>", "<sample:1>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "20.000000000000004"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=20.000000000000004, getMinStep=1.0, getName=D...#246#690941559", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<null>", "-1.9999999999999996"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:8>", "-1.051", "1.0000000000000002", "41"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "-2147483648", "<sample:5>", "Infinity", "<empty>", "<sample:2>", "<sample:2>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "0.9", "NaN", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "-0.59", "0.9799999999999999", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.9799999999999999, getMinReduction=0.2, getMinStep=0.59, getName=...#247#-1491886426", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:4>", "0.0", "-Infinity", "1"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "-8.988465674311579E307", "NaN", "-0.9999999999999999", "-0.9999999999999999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=NaN, getMinReduction=0.2, getMinStep=8.988465674311579E307, getNam...#249#-1371387439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"1.0000000000000002", "1.8", "<sample:0>", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "4"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=4, getMaxGrowth=10.0, getMaxStep=1.8, getMinReduction=0.2, getMinStep=1.0000000000000002, getName=Dorma...#242#-520849344", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.0299999999999998", "false", "false"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.8360000000000001"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"1.7976931348623158E307", "<sample:0>", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:7>", "-1.0", "10.000000000000002", "2147483647", "<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623158E307"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=1.7976931348623158E307, getMinStep=1.0, getNa...#250#-1847972085", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 3), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"Infinity", "true", "false"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:2>", "1.8", "0.9000000000000001", "-2147483648", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"-0.9"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-0.54", "true", "true"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "Infinity", "<sample:1>", "-1.27", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:8>", "5.0", "Infinity", "-1073741824", "<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.0, getMinStep=0.0, getName=Dormand-Prince 5...#231#891936117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:3>", "1.7976931348623157E308", "<sample:2>", "NaN", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "2147483647", "<sample:1>", "-0.44999999999999996", "<sample:0>", "<empty>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"1.7976931348623157E308", "1.9999999999999998", "<sample:1>", "<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=10.0, getMaxStep=1.9999999999999998, getMinReduction=0.2, getMinStep=1.7976931348623157E308,...#256#551098678", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"NaN", "<sample:2>", "NaN"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "-1.7976931348623157E308", "10.0", "1.7976931348623157E308", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.0, getMinReduction=0.2, getMinStep=1.7976931348623157E308,...#256#-764419627", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:7>", "-1.9999999999999998", "-10.0", "0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"13"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initIntegration", "double,double[],double", "24.0", "<empty>", "0.2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=13, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), get...#223#-652692773", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<sample:1>", "<null>", "1.0000000000000002"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"0.9", "1.7976931348623157E308", "<empty>", "<empty>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.7976931348623157E308, getMinReduction=0.2, getMinStep=0.9, getNa...#250#451137109", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-0.0"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-0.0, getMinStep=0.0, getName=Dormand-Prince ...#232#2114343798", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"9"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=9, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#-1570692122", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-8.988465674311579E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#250#1402452831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.0"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.0, getMinStep=0.0, getName=Dormand-Prince ...#232#-1071808299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.7976931348623157E308", "true", "false"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:4>", "-0.9999999999999999"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "4.9E-324"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=4.9E-324, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Do...#245#509019048", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=NaN, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dormand...#240#-680226421", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "10.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initIntegration", "double,double[],double", "-0.19999999999999998", "<sample:3>", "-0.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.7976931348623157E308, getMinStep=Infi...#261#721406942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"3.4000000000000004"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=3.4000000000000004, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, ...#255#-1021333447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "0.9999999999999999", "<sample:0>", "-4.4942328371557893E307", "<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"iterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.09999999999999999"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.09999999999999999, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=D...#246#-865661420", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:4>", "1.0", "9.0", "-2", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "-1.0", "6.200000000000001", "Infinity", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=6.200000000000001, getMinReduction=0.2, getMinStep=1.0, getName=Do...#245#-1343512422", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-0.9999999999999999", "true", "true"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<empty>", "<sample:0>", "<sample:2>", "-Infinity"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"-0.9999999999999999", "20.0", "<empty>", "<empty>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=20.0, getMinReduction=0.2, getMinStep=0.9999999999999999, getName=...#247#-1282104826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "0.2", "9.999999999999998", "1"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"NaN", "true", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
}
