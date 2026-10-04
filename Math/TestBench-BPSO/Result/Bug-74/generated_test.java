package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-16.0", "<sample:0>", "-1.0", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:5>", "8.988465674311579E307", "<sample:1>", "0.2", "<sample:1>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=86, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorma...#242#1323899251", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "-10.0", "<sample:0>", "0.9", "<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=74, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#1259178516", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "Infinity", "<sample:0>", "Infinity", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"0.0", "<sample:2>", "<empty>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "Infinity"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:5>", "0.45000000000000007", "<sample:1>", "10.0", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"2.6000000000000005"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.6000000000000005, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Do...#245#255682219", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:3>", "<sample:0>", "<empty>", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:7>", "0.0", "10.0", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<null>", "0.9", "19.2", "44"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1073741823, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#-1826611779", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "Infinity", "NaN", "-67108874"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"10.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "10.0", "0.0", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"clear", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:0>", "1.0000000000000002", "<sample:2>", "-Infinity", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "1.7976931348623157E308", "<sample:1>", "1.0", "<sample:1>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:1>", "1.7976931348623157E308", "NaN", "1"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:2>", "10.0", "<sample:0>", "0.455", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "11"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "true", "-2147483612", "<sample:0>", "-1.0", "<sample:2>", "<null>", "<sample:4>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<null>", "true", "-2147483648", "<sample:1>", "-0.9", "<null>", "<sample:3>", "<sample:5>", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "NaN"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "0.9999999999999999", "-1.0", "118"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:3>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-0.5"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#243#-914119223", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}}, 1), new String[][]{{"remove", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "1.7976931348623157E308", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:0>", "<null>", "<sample:0>", "-1.0000000000000002"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"28.0", "1.8", "<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.9"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}}, 3), new String[][]{{"clear", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:0>", "true", "3", "<sample:2>", "10.000000000000002", "<sample:4>", "<sample:0>", "<null>", "<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.01", "-1.7976931348623155E308", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=Infinity, getMinStep=1.0, getName=Dormand-Pri...#236#-286866189", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=9, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#-1570692122", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.7976931348623157E308, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getNa...#250#-286213569", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"-5.3"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:5>", "-8.98846567431158E307", "20.0", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "-Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"NaN", "<sample:1>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "1.0"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779188475", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:0>", "<sample:0>", "-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "-1.7976931348623157E308", "<sample:1>", "0.0", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "9.0", "1.7976931348623157E308", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-20.0", "<empty>", "Infinity", "<sample:1>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "10.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=10.0, getMinStep=0.0, getName=Dormand-Prince ...#232#-2126492294", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "-0.9999999999999999", "<null>", "NaN", "<sample:3>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"9"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=9, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand-Prince ...#232#-153411644", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=NaN, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand...#240#1881159117", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "true", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "2.5", "NaN", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:7>", "Infinity", "-0.0", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "0.4", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#1154966076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "-4.0", "<sample:1>", "NaN", "<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-2.4000000000000004", "false", "false"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "-8.988465674311579E307", "0.0", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:3>", "false", "55", "<sample:2>", "-Infinity", "<sample:0>", "<sample:0>", "<sample:3>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "1.0", "<null>", "Infinity", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"2.6"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=2.6, getMinStep=Infinity, getName=Dorman...#241#1635221435", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.45"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "1.8", "<sample:0>", "1.7976931348623158E307", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<null>", "false", "2147483647", "<sample:0>", "NaN", "<null>", "<empty>", "<sample:1>", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getStepHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-2.0000000000000004"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "Infinity", "<sample:3>", "-Infinity", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-2.0000000000000004, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0,...#256#1920959993", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.7976931348623157E308, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getNa...#250#413410017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:5>", "8.988465674311579E307", "<sample:0>", "-0.32", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-0.9"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-0.9, getMinStep=Infinity, getName=Dorma...#242#-945981601", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "0.0", "-Infinity", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-1.0E-323"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.0E-323, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=D...#266#2015374494", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "-4096"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "-0.2", "<sample:4>", "NaN", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1073741824"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "0.1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1073741824, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#917375690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-4.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-4.0, getMinStep=Infinity, getName=Dorma...#242#152230682", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#246#-540327358", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentSignedStepsize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "0.0", "-1.0", "19"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<null>", "1.8", "<sample:3>", "0.49999999999999994", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "10.0"}}), new String[][]{{"size", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-1.0, getMinStep=1.0, getName=Dormand-Prince ...#232#-17694699", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"1.0"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=Infinity, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prin...#235#1030270328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "0.0", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#1154966076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"4.9E-324"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#246#810453692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#250#-935569764", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.7976931348623157E308", "Infinity", "<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"Infinity", "0.2", "<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getCurrentStepStart", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-1.7976931348623157E308", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#686536432", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:6>", "false", "10", "<sample:2>", "1.0", "<sample:0>", "<empty>", "<sample:2>", "<sample:6>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Dormand-Prince 5(4)", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.22"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:9>", "20.000000000000004", "4.9E-324", "-11"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"Infinity", "<null>", "<sample:2>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "5.0", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinReduction", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "20.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#242#2073824652", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.0"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-8.988465674311579E307", "1.7976931348623157E308", "<sample:7>"}, false), new String[][]{{"stepAccepted", "double,double[]", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "0.2", "<null>", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#1154966076", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.0"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dormand...#240#-1037884586", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "12.900000000000002"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#246#-912294784", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.9999999999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#257#-66114875", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"NaN", "true", "true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "-0.7000000000000001", "-8.988465674311579E307", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "11"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=11, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), get...#223#-1327852899", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:2>", "<null>", "1.7976931348623157E308"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#23634670", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "NaN", "<sample:0>", "1.0", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "estimateError", "double[][],double[],double[],double", "<sample:1>", "<sample:1>", "<sample:0>", "-0.9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"Infinity", "false", "false"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxStep", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}), new String[][]{{"removeAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:8>", "NaN", "<null>", "-4.4942328371557893E307", "<null>"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:2>", "-2.0", "1.0", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-8.988465674311579E307, getMinStep=1.0, getNa...#250#386171500", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}), new String[][]{{"isEmpty", "", "5"}, {"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "0.0", "false", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<null>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:3>", "<empty>", "<sample:0>", "-16.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"Infinity"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=Infinity, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prin...#235#1729893914", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"NaN", "NaN", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:10>", "-1.31", "<sample:0>", "-1.7976931348623157E308", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"1.0", "-0.4000000000000001", "<sample:4>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.ode.events.CombinedEventsManager", actual.getClass().getName());
  assertEquals("{getEventTime=NaN, isEmpty=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-43.2"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-43.2, getMinStep=-1.0, getName=Dormand-Prin...#235#429830263", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "4.9E-324", "<sample:0>", "0.19999999999999998", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}}, 2), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "-15.999999999999998"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"1.0000000000000002"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#246#1787487023", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"Infinity", "true", "true"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dormand...#240#695697172", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-1.7976931348623155E308, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getNa...#250#2079821501", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setEquations", "org.apache.commons.math.ode.FirstOrderDifferentialEquations", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "Infinity", "0.0", "2147483647"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "30.0", "<sample:0>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=-1.7976931348623155E308, getMinStep=0.0, getN...#251#1367528715", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getSafety", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"0.09000000000000001"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:0>", "<sample:1>", "<null>", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-1.7976931348623157E308", "NaN", "<sample:3>"}, false), new String[][]{{"getEventsStates", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "10.0", "false", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getSafety", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setSafety", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#251#2007863441", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"1.7976931348623157E308", "false", "false"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.38"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.38, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#742091242", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:0>", "1.049", "0.1", "-2147221504"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "-Infinity", "<sample:3>", "<sample:0>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:2>", "false", "-1", "<sample:0>", "NaN", "<sample:2>", "<null>", "<empty>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"7.1000000000000005"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMinReduction", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearEventHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=-Infinity, getMinStep=1.0, getName=Dormand-Pr...#237#-1307534096", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"NaN", "false", "true"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"105.60000000000001"}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#242#940431468", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "resetInternalState", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=-Infinity, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=D...#246#-2019293199", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "resetInternalState", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=-0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=-1.0, getName=Dormand-Prince...#233#453031483", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEndTimeChecker", new String[]{"double", "double", "org.apache.commons.math.ode.events.CombinedEventsManager"}, new String[]{"-16.0", "7.0", "<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "requiresDenseOutput", ""}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEventHandlers", ""}}, 2), new String[][]{{"stop", "", "2"}, {"getEventsHandlers", "", "4"}, {"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getOrder", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxGrowth", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(...#230#-39466220", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinReduction", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "computeDerivatives", "double,double[],double[]", "NaN", "<empty>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-1310430732", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-0.986", "true", "false"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.986", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<empty>", "<empty>", "<sample:3>", "-1.7976931348623158E307"}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "filterStep", "double,boolean,boolean", "-1.6", "true", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<empty>", "<empty>", "<sample:0>", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "requiresDenseOutput", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=-Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Dorma...#247#-1162498325", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-5.0", "false", "true"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMinStep", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setInitialStepSize", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"6.479000000000001"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMinReduction", "double", "0.2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=6.479000000000001, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dor...#244#-234603007", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:10>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setInitialStepSize", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setEquations", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "initializeStep", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,boolean,int,double[],double,double[],double[],double[],double[]", "<sample:4>", "true", "2147483647", "<sample:0>", "0.0", "<sample:3>", "<sample:1>", "<sample:1>", "<empty>"}, {"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMinStep", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1386160018", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "estimateError", new String[]{"double[][]", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<empty>", "<sample:1>", "2.0"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setMaxEvaluations", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5(4), getO...#222#1833538255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getOrder", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"-0.0", "true", "true"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "clearStepHandlers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "sanityChecks", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "10.0", "<sample:8>", "NaN", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "filterStep", new String[]{"double", "boolean", "boolean"}, new String[]{"0.0", "true", "false"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getName=Dorman...#241#-2082387275", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Dorman...#241#-348805517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "4.9E-324", "1.0", "0"}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "getMaxGrowth", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxStep", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5...#231#1779158963", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxGrowth", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#231#1079535377", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "setSafety", "double", "-Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=10.0, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Dormand-Prince 5...#237#70246295", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "setMaxGrowth", new String[]{"double"}, new String[]{"0.9"}, false, 6, new String[][]{{"org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "addEndTimeChecker", "double,double,org.apache.commons.math.ode.events.CombinedEventsManager", "-2.1", "Infinity", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=0.9, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Dormand-Prince 5(...#230#1836958719", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "initializeStep", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "boolean", "int", "double[]", "double", "double[]", "double[]", "double[]", "double[]"}, new String[]{"<sample:5>", "false", "-1", "<sample:0>", "Infinity", "<sample:1>", "<sample:2>", "<sample:2>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator", "org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "Infinity", "<empty>", "0.0", "<empty>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.ode.IntegratorException", thrown.getClass().getName());
 }
}
