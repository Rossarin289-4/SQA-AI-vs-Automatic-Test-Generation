package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:2>", "0.9", "<empty>", "4.9E-323", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setMaxEvaluations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=8, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "-4.9E-324", "<sample:2>", "0.0", "<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.9E-324", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=4, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "1.0E-323", "<sample:2>", "33.0", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("33.00000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=136, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "66.0", "<sample:0>", "4.9E-324", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<sample:2>", "<null>", "1.0000000000000002"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "4.9E-323", "<sample:0>", "8.988465674311578E307", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1862, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dor...#244#-1646275368", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"Infinity", "4.9E-324", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-853182450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "-1.7976931348623157E308", "0.6699999999999998", "2147483605"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "-0.09", "-8.988465674311579E307", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-32"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.8999999999999999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.8999999999999999, getMinStep=1.0, getName=D...#246#461110844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:2>", "-1.7976931348623157E308", "<sample:0>", "1.0E-323", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "-1.7976931348623157E308", "1.0E-323", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"0.046", "-1.0", "<sample:6>"}, false, 0, null, 1), new String[][]{{"getEventsStates", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "1.7976931348623157E308", "<sample:1>", "-0.0", "<empty>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"10.0", "-1.7976931348623158E307", "<sample:0>"}, false, 2, new String[][]{}, 1), new String[][]{{"getEventTime", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:5>", "Infinity", "<sample:1>", "-4.6000000000000005", "<sample:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"0.09", "NaN", "<sample:6>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"1.0E-323", "-1.7976931348623157E308", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:5>", "1.7976931348623155E308", "<sample:2>", "-1.7976931348623157E308", "<sample:2>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:7>", "false", "2147483647", "<sample:2>", "0.0", "<sample:2>", "<empty>", "<null>", "<empty>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.2", "-1.9999999999999998", "<sample:6>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-1.7976931348623157E308, getMinStep=1.0, getN...#251#784822216", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-0.0", "<empty>", "<empty>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"0.10000000000000002", "0.0", "<sample:0>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#237#70246295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:2>", "<sample:2>", "1.0E-323"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "8.988465674311579E307", "<sample:1>", "Infinity", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=Infinity, getMinStep=Infinity, getName=...#247#-669580766", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.09000000000000001", "false", "true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "-1.0E-323"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "-0.2", "4.9E-324", "10"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEventHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "1.8", "<sample:1>", "4.9E-324", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-0.9999999999999998"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-0.9999999999999998, getMinStep=Infinity...#257#-1348404181", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"1.0E-323", "-0.45", "<sample:3>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=1.7976931348623157E308, getMinStep=Infin...#260#-1338625631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.045"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.045, getMinStep=0.0, getName=Dormand-Prince...#233#1456795412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=1.7976931348623157E308, getMinStep=0.0, getNa...#250#56372619", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<null>", "5.0", "<sample:2>", "1.0E-323", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:3>", "<sample:1>", "<empty>", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:8>", "false", "-2147483648", "<sample:0>", "0.0", "<null>", "<sample:0>", "<sample:1>", "<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.09", "false", "false"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>", "100.0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-5.98", "<sample:0>", "<empty>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "4.9E-324", "<sample:0>", "9.999999999999998", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "0.09", "<sample:2>", "10.0", "<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.09", "NaN", "<sample:6>"}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=NaN, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince ...#232#1050382317", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.20000000000000004"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.20000000000000004, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=D...#246#-1126099302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"1.026"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#243#308879417", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "0.05", "<sample:1>", "-1.7976931348623155E308", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<empty>", "<sample:4>", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"Infinity", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "0.09", "<sample:0>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setMaxEvaluations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-62.0", "-10.0", "<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "1.7976931348623157E308", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("classical Runge-Kutta", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-0.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#242#-132219899", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:0>", "<null>", "0.2"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.9, getMinStep=Infinity, getName=Dorman...#241#-1241548164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-4.4942328371557893E307"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-4.4942328371557893E307, getMinStep...#261#1223628185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "1.7976931348623157E308", "Infinity", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-1.227"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "NaN", "Infinity", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#244#1814314429", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#232#-896835704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"1.7976931348623155E308", "1.7976931348623157E308", "<sample:9>"}, false, 7, new String[][]{}), new String[][]{{"getEventsStates", "", "6"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"0.9000000000000002", "-Infinity", "<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}), new String[][]{{"getEventTime", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "-0.952", "<sample:2>", "10.51", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"1.55", "0.09999999999999998", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}), new String[][]{{"stop", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "-1.7976931348623157E308", "1.7976931348623158E307", "-2147483648"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "-0.09999999999999999", "<sample:4>", "-4.9E-324", "<sample:3>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.7976931348623157E308, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infini...#259#545857606", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:0>", "0.0", "<sample:3>", "0.0", "<sample:3>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.009"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.009, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince ...#232#-910291299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-0.0165", "<empty>", "-1.7976931348623157E308", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("classical Runge-Kutta", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:5>", "-1.7976931348623157E308", "<sample:2>", "-Infinity", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentSignedStepsize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "resetEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-Infinity", "0.4", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-Infinity", "true", "true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<empty>", "<sample:1>", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "1.0E-323", "<null>", "0.901", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-Infinity", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"Infinity", "<sample:1>", "<sample:2>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "10.000000000000002", "0"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=9, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince ...#232#1580170114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"NaN", "1.7976931348623157E308", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:1>", "<sample:3>", "-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "-1.0", "<empty>", "0.05", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-10.0", "<null>", "Infinity", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"2.0", "true", "true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#237#70246295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<empty>", "<sample:1>", "-1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"Infinity", "false", "true"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-39466220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-4.9E-324", "9.999999999999998", "<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"stop", "", "1"}, {"evaluateStep", "org.apache.commons.math.ode.sampling.StepInterpolator", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "NaN", "<empty>", "1.7976931348623157E308", "<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"Infinity", "10.0", "<sample:2>"}, false), new String[][]{{"stop", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<null>", "<empty>", "<null>", "0.18800000000000003"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#1833538255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:10>", "1.0", "-0.9", "9"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "false", "true"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-57"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.0, getMinStep=0.0, getName=Dormand-Prince ...#232#-1071808299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:8>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:9>", "-1.1", "<sample:0>", "0.0", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "0.09", "<empty>", "0.19999999999999998", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:2>", "1.7976931348623157E308", "<null>", "10.0", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#236#889334788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#23634670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.9000000000000001"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=5, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#1373954922", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=NaN, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand...#240#1881159117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5(4), getO...#222#723258256", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.045"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.045, getMinStep=Infinity, getName=Dorm...#243#636807284", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:2>", "Infinity", "-1.0", "1073741823"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147221503"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:6>", "0.09", "1.7976931348623157E308", "2"}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147221503, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "0"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#1833538255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=NaN, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#291949117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-0.51"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-0.51, getMinStep=1.0, getName=Dorm...#243#-1560386240", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "1.8", "<sample:3>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"10.0", "false", "false"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"clear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<empty>", "<sample:7>", "9.999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=1.7976931348623157E308, getMinStep=1.0, getNa...#250#-1823877493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"0.9", "1.048", "<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "-3.7", "0.38", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:5>", "-0.0", "7.8", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<null>", "<sample:1>", "-0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"2.1", "false", "false"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "-1.0", "Infinity", "2147483647"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.7976931348623157E308, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getNam...#249#-802299902", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-57.1"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-57.1, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#1493641590", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"100.0", "<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "1.0", "1.0", "0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "0.25", "<sample:4>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "Infinity", "<null>", "NaN", "<sample:1>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-0.09"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-0.09, getMinStep=1.0, getName=Dorm...#243#1948211315", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-14"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.14700000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-0.2", "true", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"16777214"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=16777214, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4...#229#-1520544166", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:0>", "0.196", "<sample:3>", "NaN", "<sample:2>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:4>", "Infinity", "-8.988465674311578E307", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"0.0", "0.6719999999999999", "<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.0", "true", "false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "0.9999999999999999", "<null>", "-8.988465674311579E307", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"NaN", "10.0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.2"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.2, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dormand...#240#363054034", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setMaxEvaluations", "int", "11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=11, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"65536"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=65536, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.09", "-0.31", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-0.9999999999999999", "<sample:0>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "true", "-2147483648", "<sample:2>", "4.9E-324", "<sample:1>", "<sample:0>", "<sample:3>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:5>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "1.0E-323", "true", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"Infinity", "-1.0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"63"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=63, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince 5(4), g...#225#-584955252", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-0.010000000000000009", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEventHandlers", ""}}), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "NaN", "Infinity", "-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#251#1950605139", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "0.0"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "NaN", "<sample:4>", "NaN", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-2.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-2.0, getMinStep=0.0, getName=Dormand-Prince ...#232#37006900", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setMaxEvaluations", "int", "18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=18, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-30.1", "0.0", "<sample:0>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "10.0", "<empty>", "0.0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-8.988465674311579E307", "true", "true"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "-21.8", "<sample:2>", "10.0", "<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"remove", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.1", "false", "true"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-26"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:3>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.30000000000000004", "false", "false"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453974875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-0.1", "true", "false"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:7>", "2.89", "<null>", "0.9", "<sample:1>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setMaxEvaluations", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=4, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-0.30000000000000004"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-0.30000000000000004, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=...#247#958545150", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "1.0000000000000002", "false", "true"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:4>", "true", "-4", "<null>", "4.9E-324", "<sample:0>", "<sample:5>", "<sample:3>", "<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"4.800000000000001", "NaN", "<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
}
