package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "9.987", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:3>", "true", "9", "<empty>", "-1.0", "<null>", "<sample:2>", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "10.222999999999999", "<sample:0>", "-22.645500000000002", "<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-22.6455", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=32, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-396514220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "10.222999999999999", "<sample:3>", "86.26000000000002", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<null>", "0.0", "0.2", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "10.222999999999999", "<sample:6>", "-86.26000000000002", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "resetEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentStepStart", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-86.26000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=392, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "101.83999999999999", "<sample:3>", "-0.13739999999999988", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "-0.487", "<empty>", "-1.0", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:6>", "true", "10", "<null>", "-2.3227500000000014", "<sample:2>", "<sample:2>", "<null>", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:5>", "10.222999999999999", "10.0", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.13739999999999952", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-3.001725000000001", "<sample:0>", "44.2735", "<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("44.2735", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=196, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"2.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#1687678742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.2"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.2, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-1686829162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-5.4"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-5.4, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#246383006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"5.4"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=5.4, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-1163813347", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "1.0", "<null>", "-1.7976931348623157E308", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getName", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "resetEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearEventHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("classical Runge-Kutta", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-1.0", "<null>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-1.0, getMinReduction=0.2, getMinStep=-Infinity, getName=Dorm...#243#-97403505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "-1.7976931348623157E308", "<sample:1>", "10.0", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Prince...#233#-1496782488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince 5(4), g...#225#-489694866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5(4), get...#223#1181674272", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince...#233#236799270", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-P...#238#-83571101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "-Infinity", "<sample:0>", "4.94", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "-Infinity", "<null>", "2.47", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "false", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Princ...#253#-158248720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"11"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=11, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"22"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=22, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"517"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=517, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"476"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=476, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "-1.0", "-1.0", "0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.988465674311579E307", "<sample:1>", "1.0", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.0, getMinStep=0.0, getName=Dormand-Prince ...#232#-1071808299", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-515290214", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setMaxEvaluations", "int", "9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=9, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:6>"}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "-1.7976931348623157E308", "<null>", "-1.0", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "10.0", "<empty>", "NaN", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<empty>", "<sample:1>", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.5000000000000001"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"10.0", "true", "true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"10.0", "false", "true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535098", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"10.0", "false", "true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-9.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#232#-896597376", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-0.487", "<sample:0>", "9.987", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:0>", "true", "9", "<empty>", "-1.0", "<null>", "<sample:2>", "<empty>", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=20, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1272346803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.626000000000001", "<sample:6>", "9.986999999999998", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.986999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=20, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1272346803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.626000000000001", "<sample:6>", "19.974", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("19.974", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "4.6455", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.6455", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "4.645500000000002", "<sample:6>"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.645500000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-1.7976931348623157E308", "<sample:1>", "NaN", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.626000000000001", "<sample:6>", "9.0", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=14, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1466423832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.626000000000001", "<sample:6>", "9.0", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=14, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1466423832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.623000000000001", "<sample:0>", "-4.645500000000003", "<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "-2147483648"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:2>", "<empty>", "<empty>", "-9.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.645500000000003", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "9.523000000000001", "<sample:3>", "-11.322750000000001", "<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-11.32275", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=32, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-396514220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-4.313000000000001"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-4.313000000000001, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Do...#245#-308622849", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-2.1565000000000003"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-2.1565000000000003, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=D...#246#1686021361", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.2, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-1686829162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.20000000000000004"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.20000000000000004, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=D...#246#-1126099302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.7976931348623157E308", "-4.645500000000002", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "9.0", "<null>", "-1.0", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.7976931348623157E308", "-4.645500000000001", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "9.0", "<null>", "-1.0", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.7976931348623157E308", "-4.645500000000002", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "9.0", "<null>", "-1.0", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-853182450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:6>", "true", "-2", "<sample:2>", "0.9", "<sample:0>", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:6>", "true", "-2", "<sample:2>", "0.9", "<sample:0>", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#1771731541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:6>", "true", "-2", "<sample:2>", "0.9", "<sample:0>", "<sample:1>", "<sample:1>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-1.0, getMinReduction=0.2, getMinStep=-Infinity, getName=Dorm...#243#-801266480", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:0>", "Infinity", "<sample:2>", "-1.0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "-1.7976931348623157E308", "-1.0", "11"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.2, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-1686829162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"2.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#1687678742", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-5.4"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:5>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-5.4, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#246383006", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-5.4"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:5>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-5.4, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#946006592", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-5.23"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:5>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-5.23, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince ...#232#-1001098485", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "1.0", "<null>", "1.7976931348623157E308", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("classical Runge-Kutta", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-1.0", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=1.0, getMinStep=1.0, getName=Dormand-Prince 5...#231#1301127730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"1.0", "1.0", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "requiresDenseOutput", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "-1.7976931348623157E308", "<sample:1>", "10.0", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Princ...#234#-1698239009", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Prince...#233#-1496782488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-1.7976931348623157E308", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "1.7976931348623157E308", "NaN", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158746", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "Infinity", "NaN", "2147483647"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:0>"}}), new String[][]{{"retainAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "-Infinity", "<null>", "2.47", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "false", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Princ...#253#-158248720", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "false", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#261#1503738179", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "false", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#247#-1162498325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483621"}, false, 11, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "false", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#236#889334788", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"11"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=11, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getName", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setMaxEvaluations", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("classical Runge-Kutta", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<null>"}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getCurrentSignedStepsize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:3>", "false", "10", "<sample:2>", "1.0", "<empty>", "<null>", "<empty>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:3>", "false", "10", "<sample:2>", "1.0", "<empty>", "<null>", "<empty>", "<empty>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<null>", "<sample:1>", "<empty>", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:3>", "false", "10", "<sample:2>", "1.0", "<empty>", "<null>", "<empty>", "<empty>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<null>", "<sample:1>", "<empty>", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"1.0", "<sample:2>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "0.2", "<empty>", "1.0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "0.2", "<empty>", "1.0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "0.9999999999999999", "-1.0", "0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "NaN", "<sample:0>", "NaN", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "1.7976931348623157E308", "<sample:1>", "1.0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-1.7976931348623157E308, getMinStep...#261#1075653162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-Infinity, getMinStep=1.0, getName=...#247#-337294638", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.7976931348623157E308, getMinStep=0.0, getN...#251#1970392554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-Infinity, getMinStep=0.0, getName=Dormand-Pr...#237#-277659438", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.9", "0.0", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.9", "0.0", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.9", "0.0", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.9", "0.0", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "0.9", "0.0", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}), new String[][]{{"remove", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-1.0, getMinReduction=0.2, getMinStep=-Infinity, getName=Dorm...#243#-97403505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "10.0", "<null>", "NaN", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.9"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:1>", "<empty>", "<sample:1>", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"176.8"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.0", "false", "false"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.0", "false", "true"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.0", "false", "true"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=1.7976931348623157E308, getMinStep=Infin...#260#-1338625631", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.5", "false", "true"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=1.7976931348623155E308, getMinStep=Infin...#260#1631485471", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.5", "false", "true"}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=1.7976931348623155E308, getMinStep=1.0, getNa...#250#1632056141", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.5", "false", "true"}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.5", "false", "true"}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-1.0, getMinReduction=0.2, getMinStep=-Infinity, getName=Dorm...#243#-97403505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.52", "false", "true"}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.244"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.244, getMinStep=1.0, getName=Dormand-Prince...#233#-1478761391", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-1.4749999999999999", "false", "true"}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:2>", "<sample:2>", "<sample:2>", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-1.0, getMinReduction=0.2, getMinStep=-Infinity, getName=Dorm...#243#-97403505", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:1>", "<null>", "0.2"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=1.0, getMinStep=1.0, getName=Dormand-Prince 5...#231#1301127730", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=1.0, getMinStep=0.0, getName=Dormand-Prince 5...#231#2000751316", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=1.0, getMinStep=1.0, getName=Dorman...#241#-127213164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=1.0, getMinStep=Infinity, getName=Dorma...#242#171272683", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:5>", "0.2", "0.2", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-0.487", "<sample:0>", "9.987", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:0>", "true", "9", "<empty>", "-1.0", "<null>", "<sample:2>", "<empty>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=20, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1272346803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "9.987", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.987", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "0.9987", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9986999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=20, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1272346803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "4.9935", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9935", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-0.8626000000000001", "<sample:6>", "9.991", "<sample:0>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.991", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=20, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1272346803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.0", "0.2", "<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-0.8626000000000001", "<sample:6>", "6.391", "<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("6.391", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=20, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1272346803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "9.932", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.932", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-8.626000000000001", "<sample:6>", "9.291", "<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.291", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-4.313000000000001", "<sample:6>", "-4.645500000000002", "<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "9.987", "<null>", "1.0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.645500000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=14, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1466423832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.626000000000001", "<sample:6>", "-2.3227500000000014", "<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "9.987", "<null>", "1.0", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.322750000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=20, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1272346803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "86.26000000000002", "<sample:6>", "0.9", "<sample:0>"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9000000000000057", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=26, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-202437191", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-4.645500000000002"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#246#-256517695", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "8.626000000000001", "<sample:6>", "9.0", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=14, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1466423832", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "Infinity", "<empty>", "Infinity", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "1.7976931348623157E308", "<sample:6>", "3.6", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "-1"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=86, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1323899251", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-41.870000000000005", "10.222999999999999", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-22.645500000000002"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-22.645500000000002, getMinStep=0.0, getName=...#247#-374016076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"8.626000000000001", "10.222999999999999", "<sample:1>"}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:1>", "<empty>", "<empty>", "10.222999999999999"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-22.645500000000002"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-22.645500000000002, getMinStep=1.0, getName=...#247#1010807058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"8.626000000000001", "10.222999999999999", "<null>"}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:1>", "<empty>", "<empty>", "10.222999999999999"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-22.645500000000002"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"8.626000000000001", "10.222999999999999", "<null>"}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:1>", "<empty>", "<empty>", "10.222999999999999"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-22.645500000000002"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"8.626000000000001", "5.1114999999999995", "<sample:0>"}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-11.322750000000001"}}, 1), new String[][]{{"getEventsStates", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-11.322750000000001, getMinStep=1.0, getName=...#247#646305780", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.0", "8.626000000000001", "<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-11.322750000000001"}}, 1), new String[][]{{"getEventsStates", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=-11.322750000000001, getMinStep=Infinit...#258#535156073", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:1>", "true", "1", "<sample:2>", "9.987", "<sample:1>", "<sample:6>", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:1>", "true", "1", "<sample:2>", "9.987", "<sample:1>", "<sample:6>", "<sample:1>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "false", "0", "<empty>", "1.7976931348623157E308", "<sample:1>", "<sample:1>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:0>", "<sample:6>", "<sample:6>", "-1.0"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-2.3227500000000014"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"-4.313000000000001"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"-4.313000000000001"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "-8.626000000000001", "<null>", "-4.645500000000002", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-8.626000000000001", "<null>", "-4.645500000000002", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-8.626000000000001", "<sample:1>", "-4.645500000000002", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-8.626000000000001", "<sample:1>", "-4.645500000000002", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:6>", "9.0", "0.9", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"9.987", "true", "false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-1.0, getMinStep=1.0, getName=Dorma...#242#-1346589453", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"1.7976931348623157E308", "0.9", "<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "8.626000000000001", "<sample:6>", "0.2", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<null>"}}), new String[][]{{"removeAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}}, 1), new String[][]{{"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:0>", "1.7976931348623157E308", "10.222999999999999", "-29"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:0>", "1.7976931348623157E308", "10.222999999999999", "-29"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:1>", "<empty>", "<null>", "-0.487"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:0>", "1.7976931348623157E308", "10.222999999999999", "-29"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-2.3227500000000014", "true", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-2.3227500000000014", "true", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "10.0", "<sample:0>", "-22.645500000000002", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"Infinity", "<sample:0>", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:0>", "false", "-1", "<empty>", "-22.645500000000002", "<null>", "<null>", "<sample:6>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "resetEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearStepHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("classical Runge-Kutta", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "9.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079803217", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "9.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779426803", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "86.26000000000002", "<null>", "NaN", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "clearStepHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "-0.487", "<sample:6>", "10.0", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "1.0", "<sample:1>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"4.313000000000001"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-22.645500000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-22.645500000000002, getMinStep=0.0, getName=...#247#-374016076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"0.2"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "-4.645500000000002", "<sample:1>", "86.26000000000002", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-8.626000000000001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-8.626000000000001, getMinStep=1.0, getName=D...#246#-2021233942", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"0.2"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "-4.645500000000002", "<sample:1>", "86.26000000000002", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-8.766000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-8.766000000000002, getMinStep=1.0, getName=D...#246#-1100038164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"0.2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"0.09999999999999999"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#247#546214650", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:4>", "-0.487", "9.987", "10"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "0.2", "4.9935", "10"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "0.2", "-3.0592499999999996", "10"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "getEvaluations", ""}, {"org.apache.commons.math.ode.nonstiff.RungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getName=classical Runge-Kutta}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=9, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#-1570692122", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "72"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=72, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), get...#223#-477406910", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "72"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "9.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=72, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=9.0, getMinStep=1.0, getName=Dormand-Prince 5(4), get...#223#24772443", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "72"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "9.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=72, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=9.0, getMinStep=0.0, getName=Dormand-Prince 5(4), get...#223#724396029", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "72"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=72, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5(4), get...#223#222216676", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
}
