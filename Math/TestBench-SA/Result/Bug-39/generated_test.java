package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-0.9", "<sample:3>", "-42.663", "<sample:6>"}, false, 13, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "0.045", "0.2", "-3.6849999999999996", "0.1315"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-42.663", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.09486832980505137, getCurrentStepStart=NaN, getEvaluations=1262, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.2, getMinReduction=0.2, getMinStep=0.045, get...#252#-684262350", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-311.84999999999997", "<sample:3>", "29.6", "<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<empty>", "<sample:2>", "<null>", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("29.6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=32, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#-396514220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "Infinity", "-Infinity", "10.0", "10.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand...#240#1947674999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"Infinity", "<sample:1>", "Infinity"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:6>", "<sample:1>", "<null>", "10.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "10.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"0.9", "10.028", "<sample:5>", "<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.028, getMinReduction=0.2, getMinStep=0.9, getName=Dormand-Princ...#234#1542044108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:2>", "<null>", "3.9000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "true", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "true", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.9", "true", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "1.02", "true", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#1771731541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "1.02", "true", "false"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#1250954806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"NaN", "0.9", "0.2", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "10.0", "<sample:2>", "10.0", "<empty>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.9, getMinReduction=0.2, getMinStep=NaN, getName=Dormand-Prince 5...#231#826225458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.9"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.9, getMinStep=1.0, getName=Dormand-Prince 5...#231#-110151958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.8999999999999999"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.8999999999999999, getMinStep=1.0, getName=D...#246#461110844", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.09"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.09, getMinStep=1.0, getName=Dormand-Prince ...#232#-1871901932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"0.45", "-1.0", "1.7976931348623157E308", "10.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:5>", "<null>", "<sample:1>", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.45, getName=Dormand-Prince ...#232#1546376096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"1.0", "-1.0", "1.7976931348623157E308", "NaN"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1880070930", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"1.56", "-1.0", "1.7976931348623157E308", "NaN"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=1.56, getName=Dormand-Prince ...#232#-1270589439", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "1.7976931348623157E308", "-1.0", "-1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "1.7976931348623157E308", "0.0", "-1"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "NaN"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "Infinity", "<sample:0>", "0.2", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:0>", "-1.7976931348623157E308", "Infinity", "0", "<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<null>", "<sample:1>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<null>", "<sample:1>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<null>", "<sample:1>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<null>", "<sample:1>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<null>", "<sample:1>", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:4>"}}, 2), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:4>"}}, 2), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"4.575", "false", "true"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:6>", "-1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:3>", "1.7976931348623157E308", "1.0", "-1", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "10.0", "false", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=-1.7976931348623157E308, getMinStep...#261#1075653162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=NaN, getMinStep=1.0, getName=Dorman...#241#-637879444", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"NaN"}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=NaN, getMinStep=Infinity, getName=D...#246#-460041251", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"NaN"}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "8.988465674311579E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=NaN, getMinStep=Infinity, getName=Dorman...#241#-770741924", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"10.0"}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "8.988465674311579E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=10.0, getMinStep=Infinity, getName=Dorma...#242#1106455442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "0.0", "10.0", "268435455"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:2>", "<sample:0>", "<sample:0>", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:2>", "<sample:0>", "<sample:0>", "-1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"0.9", "<sample:2>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"1.7976931348623157E308", "<empty>", "<null>"}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"Infinity", "5.3", "<empty>", "<sample:0>"}, false, 14, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=5.3, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-822075826", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-1.0000000000000002"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#257#-1470458428", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-1.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#232#-896835704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"0.9000000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#246#1926844248", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"0.7000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#246#-779775115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-27.1"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#233#-2030915561", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-27.1"}, false, 14, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#243#198261435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<null>", "-1.7976931348623157E308", "10.0", "-2147483648", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:3>", "1.7976931348623157E308", "10.0", "2147483647", "<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:5>", "-1.7976931348623157E308", "<sample:0>", "-1.0", "<sample:4>"}}, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "0.0"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-1.0", "<sample:5>", "-1.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-1323377387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "10.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#232#-679676725", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "10.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#232#-893171411", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-1.0", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "10.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#232#-191236818", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-1.0", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "10.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#242#-1967676758", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:4>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "1.0", "1.0", "NaN", "0.9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Pri...#236#804576660", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "Infinity", "-Infinity", "10.0", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Do...#245#-1035495115", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "Infinity", "-Infinity", "10.0", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand...#240#1947674999", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"1.7976931348623157E308", "<null>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"Infinity", "<sample:1>", "Infinity"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:4>", "<sample:0>", "<null>", "10.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"0.9", "10.0", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.0, getMinReduction=0.2, getMinStep=0.9, getName=Dormand-Prince ...#232#1201883142", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"0.9", "10.028", "<sample:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.028, getMinReduction=0.2, getMinStep=0.9, getName=Dormand-Princ...#234#1542044108", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "Infinity"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#236#-1167884442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079564889", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779188475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}}), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779188475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779188475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "4"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779188475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "4"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348776005", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}}), new String[][]{{"containsAll", "java.util.Collection", "0"}, {"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771657090", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"false", "10", "<sample:1>", "NaN", "<sample:2>", "<sample:0>", "<null>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"1.7976931348623157E308", "0.2", "<sample:0>", "<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.2, getMinReduction=0.2, getMinStep=1.7976931348623157E308, getNa...#250#-1080846354", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"1.7976931348623157E308", "-0.2", "<null>", "<sample:0>"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "10", "<sample:0>", "1.7976931348623157E308", "<sample:0>", "<sample:0>", "<sample:0>", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "true", "false"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#1771731541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"-1.0"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"NaN", "0.9", "0.2", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "10.0", "<sample:2>", "10.0", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.9, getMinReduction=0.2, getMinStep=NaN, getName=Dormand-Prince 5...#231#826225458", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=Infinity, getMinStep=1.0, getName=Dormand-Pri...#236#-286866189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep=1.0, getName=Dormand-Prince 5...#231#192312531", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-0.062"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-0.062, getMinStep=1.0, getName=Dormand-Princ...#234#1072455162", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"0.9"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.9, getMinStep=1.0, getName=Dormand-Prince 5...#231#-110151958", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"0.9", "-1.0", "1.7976931348623157E308", "10.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.9, getName=Dormand-Prince 5...#231#1583456202", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"0.45", "-1.0", "1.7976931348623157E308", "10.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:5>", "<null>", "<sample:1>", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.45, getName=Dormand-Prince ...#232#1546376096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.7976931348623157E308, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getNa...#250#-286213569", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "1", "<sample:0>", "-1.7976931348623157E308", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "1", "<sample:0>", "-1.7976931348623157E308", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "1", "<sample:0>", "-1.7976931348623157E308", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "1", "<sample:0>", "-1.7976931348623157E308", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#1771731541", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "true", "1", "<sample:0>", "-1.7976931348623157E308", "<sample:1>", "<sample:2>", "<sample:1>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#1250954806", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483626"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483626, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#-161032174", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"11"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=11, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5(4), get...#223#-628229313", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "Infinity", "<sample:0>", "0.2", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:5>", "10.0", "<null>", "0.2", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "-1.0", "1.0", "<empty>", "<empty>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#251#150129903", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:6>", "Infinity", "Infinity", "1", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#250#1498355326", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:6>", "Infinity", "Infinity", "1", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#236#-1167884442", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:6>", "NaN", "1.7976931348623157E308", "9", "<sample:6>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:3>", "NaN", "Infinity", "-9", "<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "0.0", "-1.0", "0.9", "0.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.7976931348623157E308, getMinStep=0.0, getN...#251#1970392554", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-1323377387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}), new String[][]{{"clear", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "0.9", "<empty>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "0.9", "<empty>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:4>"}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:4>"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 18, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"10.0", "false", "true"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:6>", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-12.0", "true", "true"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:5>", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-12.0", "true", "true"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:8>", "-1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-1323377387", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"false", "10", "<null>", "1.7976931348623157E308", "<sample:2>", "<sample:2>", "<empty>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:7>", "NaN", "0.2", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-24.1", "<sample:0>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-24.1", "<sample:0>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.9"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:0>", "-1.0", "1.7976931348623157E308", "1", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.9, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#1137335133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"Infinity", "1.0", "<empty>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Pri...#236#-1627960329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double[]", "double[]"}, new String[]{"Infinity", "5.3", "<empty>", "<empty>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=5.3, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Pri...#236#-367648880", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:5>", "<empty>", "<null>", "-1.7976931348623157E308"}}), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#232#-896835704", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<null>", "-1.7976931348623157E308", "10.0", "-2147483648", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=1.7976931348623157E308, getMinStep=1.0, getNa...#250#-1823877493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1080478769", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.2"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "0.0", "0.2", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.2, getMaxStep=0.2, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prin...#235#1191518711", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"2.0"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "0.0", "0.2", "<null>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=0.2, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prin...#235#271059319", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "Infinity", "0.0", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<null>", "<sample:2>", "<sample:2>", "0.2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Pri...#236#-694605992", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "1.0", "<empty>", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "Infinity", "0.0", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Pri...#236#-1656231207", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "Infinity", "0.0", "<sample:2>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-1149032938", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "NaN"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:7>", "NaN"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "10.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-1.7976931348623157E308"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"18.39", "<sample:2>", "0.49999999999999994"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"18.39", "<sample:2>", "0.49999999999999994"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "2.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"18.39", "<sample:2>", "0.49999999999999994"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "2.06"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "-1.7976931348623157E308", "1.7976931348623157E308", "<sample:2>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.7976931348623157E308, getMinReduction=0.2, getMinStep=1.797...#274#911943334", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "NaN"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2081443883", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "0.0", "NaN", "<sample:0>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=NaN, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Pri...#236#63459165", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"1.7976931348623157E308", "10.0", "Infinity", "10.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.0, getMinReduction=0.2, getMinStep=1.7976931348623157E308, getN...#251#571667539", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "-4.0", "<sample:0>", "0.9", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "-4.0", "<sample:0>", "0.9", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<empty>", "<null>", "<sample:0>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"Infinity", "true", "false"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "0.2"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"true", "11", "<null>", "0.9", "<sample:0>", "<sample:1>", "<sample:0>", "<sample:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"false", "-11", "<sample:1>", "0.09", "<sample:2>", "<null>", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.0", "true", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:5>", "10.0", "1.0", "-1", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "Infinity", "10.0", "0.9", "1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<null>", "0.9", "<sample:1>", "NaN", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Pr...#237#1793157435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:5>", "-1.0", "1.0", "1", "<null>"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "Infinity", "0.9", "0.9", "1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<null>", "0.9", "<sample:1>", "NaN", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.9, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Pri...#236#1401678511", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:5>", "<sample:2>", "<sample:1>", "0.9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"10.0", "0.2", "-1.0", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "-2", "<sample:0>", "1.0", "<sample:2>", "<sample:0>", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.2, getMinReduction=0.2, getMinStep=10.0, getName=Dormand-Prince ...#232#-140964259", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStepSizeControl", new String[]{"double", "double", "double", "double"}, new String[]{"1.7976931348623157E308", "NaN", "-1.0", "0.9"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:6>", "<sample:0>", "<empty>", "0.2"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "-1.0", "<empty>", "0.2", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=NaN, getMinReduction=0.2, getMinStep=1.7976931348623157E308, getNa...#250#276725735", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "1.0", "-1.0", "11"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "1.0", "-1.0", "11"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "NaN", "10.0", "<empty>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=10.0, getMinReduction=0.2, getMinStep=NaN, getName=Dormand-Prince ...#232#-541078234", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<null>", "NaN"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-1.7976931348623157E308", "true", "true"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:7>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.2"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "0.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-853182450", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"3"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=3, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#698794796", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"65588"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=65588, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), ...#226#-1104515991", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"131158"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=131158, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4),...#227#1916807160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"65579"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=65579, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), ...#226#1652984007", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:0>", "<sample:2>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.7976931348623157E308, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getNa...#250#-286213569", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStateInitialized", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.2"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.2"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.71"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:2>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "10.0", "<sample:0>", "NaN", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.71, getMinStep=0.0, getName=Dormand-Prince ...#232#-405541341", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-1.7976931348623157E308", "<sample:0>", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double,double", "10.0", "10.0", "NaN", "0.9"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:5>", "1.7976931348623157E308", "-1.0", "-2147483648", "<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=1.7976931348623157E308, getMinStep=1.0, getNa...#250#-1823877493", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 27, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 28, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 29, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 30, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 31, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<empty>", "<sample:1>", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805734", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<empty>", "<sample:1>", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686819", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<empty>", "<sample:1>", "NaN"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "0.2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535160", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"28.175"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:3>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:3>", "-1.0", "10.0", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=28.175, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince...#233#1180970455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:3>", "-1.0", "10.0", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.7976931348623157E308, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getNam...#249#-1501923488", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:3>", "-1.0", "10.0", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-Infinity, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Pri...#236#-1582181737", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:3>", "-1.0", "10.0", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=Infinity, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prin...#235#1030270328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.9"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.9, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#1137335133", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setStepSizeControl", "double,double,double[],double[]", "0.9", "0.2", "<sample:1>", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "0.9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"4.09"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "1.7976931348623157E308", "<empty>", "<null>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<sample:2>", "<sample:1>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"-8.18"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<sample:2>", "<sample:1>", "Infinity"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.2"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "0", "<sample:2>", "NaN", "<sample:1>", "<sample:2>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<sample:2>", "<sample:1>", "Infinity"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.2"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "0", "<sample:2>", "NaN", "<sample:1>", "<sample:2>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<sample:2>", "<sample:1>", "Infinity"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.4"}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "0", "<sample:2>", "NaN", "<sample:1>", "<sample:2>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:0>", "<sample:2>", "<sample:1>", "Infinity"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#246#-1771686602", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 8, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "Infinity"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "0", "<sample:2>", "NaN", "<sample:1>", "<empty>", "<empty>", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=D...#251#-370556831", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-1.0000000000000002"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "0.8000000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "-1", "<sample:0>", "10.0", "<sample:2>", "<sample:0>", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "1.7000000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "boolean,int,double[],double,double[],double[],double[],double[]", "false", "-1", "<sample:0>", "10.0", "<sample:2>", "<sample:0>", "<sample:1>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:7>", "-48.342"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
}
