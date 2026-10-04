package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "2147483647"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "2147483647"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:4>", "2147483647"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:4>", "2147483647"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "2147483647"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"1.0", "<empty>", "1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:0>", "2147483647", "2147483647", "1001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:2>", "2147483647", "<sample:0>", "-1.0", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "4.294967294E9", "<null>", "-0.5", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "2147483647", "1.7976931348623157E308", "-2147483648", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "2147483647", "1.7976931348623157E308", "2147483647", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "2147483647", "1.7976931348623157E308", "2147483647", "<sample:2>"}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<null>", "5.3687091175799996E8", "680.0", "2147483623", "<sample:0>"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "2147483647", "<null>", "-1.0", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "2147483647", "<null>", "-1.0", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "2147483647", "<null>", "-1.0", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "2147483647", "<null>", "-1.0", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0650410894399627, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, ...#239#1690824905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "2147483647", "<null>", "-1.0", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:3>", "0.0", "<sample:0>", "-1.0", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "2147483647", "<null>", "-1.0", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:2>", "-1.6", "1.7976931348623157E308", "-35", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "3.2", "-1.6", "0", "<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "6"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:2>", "Infinity", "Infinity", "2147483647", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=6, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Adams-Bashf...#220#-1624004642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:0>", "1000.0", "2147483647", "10", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:0>", "1000.0", "2147483647", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:0>", "1000.0", "2147483647", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:0>", "1000.0", "2147483647", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:0>", "1000.0", "2147483647", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:0>", "1000.0", "2147483647", "10", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "NaN", "1.7976931348623157E308", "-2147483648", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0650410894399627, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, ...#239#1690824905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0594630943592953, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-1039827340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0650410894399627, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, ...#239#1690824905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-1.6", "<sample:0>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-3.2", "<sample:2>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "999"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:7>", "1.7976931348623157E308", "Infinity", "2147483646", "<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<null>", "1.7976931348623157E308", "1.7976931348623157E308", "2147483646", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<null>", "1.7976931348623157E308", "1.7976931348623157E308", "2147483646", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<null>", "1.7976931348623157E308", "1.7976931348623157E308", "2147483646", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:6>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "2147483647", "-1.7976931348623157E308", "999"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "2147483647", "-1.7976931348623157E308", "999"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "2.14748364749E9", "-1.7976931348623157E308", "999"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "Infinity", "<empty>", "1.7976931348623157E308", "<empty>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "2.147483647547E9", "Infinity", "-35"}, false, 11, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "Infinity", "<sample:2>", "1.7976931348623157E308", "<empty>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "2.147483647547E9", "Infinity", "-35"}, false, 15, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "Infinity", "<sample:2>", "1.7976931348623157E308", "<empty>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0442737824274138, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#1782989712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "2.147483647547E9", "Infinity", "-35"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "Infinity", "<sample:2>", "1.7976931348623157E308", "<empty>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "Infinity", "Infinity", "-35"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:9>", "Infinity", "<sample:2>", "1.7976931348623157E308", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1000.0", "<sample:2>", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:4>", "-6.7", "0.0", "1001", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1376430155", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:4>", "-6.7", "0.0", "1001", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:4>", "-6.7", "0.0", "1001", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:4>", "-6.7", "0.0", "1001", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:4>", "-6.7", "0.0", "1001", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "Infinity", "<sample:3>", "-1.0", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "Infinity", "<sample:3>", "1000.0", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "Infinity", "<sample:2>", "1000.0", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "Infinity", "<sample:0>", "940.0000000000001", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:0>", "NaN"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getN...#235#-1504576161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483647"}, false, 8, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:5>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "0.0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-6.7", "<sample:1>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=168, getMaxEvaluations=2147483647, getMaxGrowth=1.0594630943592953, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=...#231#779005114", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-1.7976931348623157E308", "<sample:0>", "-1.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "1000.0", "1000.0", "2147483646"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:7>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:2>", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:1>", "<empty>", "<sample:3>", "Infinity"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "1880.0000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=107, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=...#231#-772477984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:3>", "1.0", "1000.0", "-35"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=107, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=...#231#-772477984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=107, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=...#231#-772477984", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:1>", "<sample:2>", "-Infinity"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "940.0000000000001"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=167, getMaxEvaluations=2147483647, getMaxGrowth=1.0594630943592953, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=...#231#-270864101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<sample:0>", "<sample:3>", "-1.6"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "940.0000000000001", "-1.7976931348623157E308", "1"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:3>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<empty>", "<sample:2>", "-Infinity"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "9400.000000000004"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0442737824274138, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#1782989712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<empty>", "<sample:2>", "-Infinity"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0594630943592953, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-1039827340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<empty>", "<sample:2>", "-Infinity"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "4700.000000000002"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=77, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, getNa...#234#-1925406099", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:1>", "1880.0000000000002", "1.7976931348623157E308", "0", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:7>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "-1.6"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "11.8"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:1>", "1.0", "1000.0", "1073741823"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-1.6", "<sample:1>", "0.0", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0594630943592953, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-1039827340", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:1>", "1.0", "1000.0", "1073741823"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-1.6", "<sample:1>", "0.0", "<empty>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0442737824274138, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#1782989712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:1>", "<null>", "<empty>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:1>", "<null>", "<empty>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:1>", "<null>", "<empty>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<sample:3>", "<empty>", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<null>", "<sample:3>", "<null>", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<null>", "<sample:3>", "<null>", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:3>", "<null>", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:3>", "<null>", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:3>", "<sample:3>", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0650410894399627, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, ...#239#1690824905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:3>", "<sample:3>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0650410894399627, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, ...#239#1690824905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:0>", "<sample:0>", "1000.0"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<null>", "1000.0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:1>", "1.7976931348623157E308", "2147483647", "-35", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "Infinity", "<sample:3>", "-1.0", "<sample:2>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:2>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "-1.0", "Infinity", "-35", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "-1.0", "Infinity", "-35", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "-1.0", "Infinity", "-35", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "-1.0", "Infinity", "-35", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "-1.6", "1000.0", "2147483646", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:4>", "-13.4"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "1001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1001, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Adams-Ba...#223#1331958756", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:8>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Adams-Bash...#221#-1301883741", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<null>", "2147483647", "188.00000000000003", "0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "NaN"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<null>", "2147483647", "188.00000000000003", "0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "NaN"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "-1.7976931348623157E308", "<null>", "Infinity", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<null>", "-1.7976931348623157E308", "0.0", "-35", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<null>", "1000.0", "NaN", "-35"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:5>", "<sample:3>", "<sample:0>", "1880.0000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:5>", "<sample:3>", "<sample:0>", "1880.0000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "2147483647"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "2147483647"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "2147483647"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-35"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "67108863"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"662"}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "134217727"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=662, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Adams-Bas...#222#420992059", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "0.0", "<sample:1>", "Infinity", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:7>", "NaN"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:7>", "0.0", "<sample:1>", "Infinity", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:7>", "NaN"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "2147483647"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 3), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}), new String[][]{{"add", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "2147483647"}, false, 13, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1001"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-30.96"}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-4.0"}, false, 11, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "1000.0", "<sample:0>", "1880.0000000000002", "<null>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-1.6"}, false, 14, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "NaN"}, false, 14, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "1001"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:6>", "2147483647", "940.0000000000001", "0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MaxCountExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:6>", "1880.0000000000002"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:6>", "1880.0000000000002"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<null>", "2147483647"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "0.0"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "0.0"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "4.9E-324"}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "0.0"}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "13.0"}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "1000.0", "<null>", "1.6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "1000.0", "<null>", "1.6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-816"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"0.0", "<sample:1>", "1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:2>", "<sample:3>", "<sample:0>", "1000.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-0.0027", "<sample:2>", "Infinity"}, false, 15, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:2>", "<sample:3>", "<sample:0>", "1000.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0442737824274138, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#1782989712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"NaN", "<sample:0>", "Infinity"}, false, 15, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:3>", "<sample:2>", "<sample:2>", "1000.0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0442737824274138, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#1782989712", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-0.7196", "<sample:1>", "-8.988465674311579E307"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:3>", "<sample:2>", "499.9885"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:5>", "-2.563"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "2147483647", "Infinity", "999", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "2147483647", "Infinity", "999", "<sample:6>"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<null>", "<sample:2>", "-6.7"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:3>", "2147483647", "Infinity", "999", "<sample:6>"}}, 3), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<null>", "<null>", "-6.7"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<null>", "<null>", "-6.7"}}, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<null>", "<null>", "-6.7"}}, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "-1.7976931348623157E308", "<sample:0>", "1000.0", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:3>", "<null>", "-11.6"}}), new String[][]{{"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "-1.7976931348623157E308", "<sample:0>", "1000.0", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:3>", "<null>", "-11.6"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "-1.7976931348623157E308", "<sample:0>", "1000.0", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:3>", "<null>", "-11.6"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.080059738892306, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#127752164", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "-1.7976931348623157E308", "<sample:0>", "1000.0", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:3>", "<null>", "-11.6"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "-1.7976931348623157E308", "<sample:0>", "1000.0", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:3>", "<null>", "-11.6"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0650410894399627, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, ...#239#1690824905", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "-1.7976931348623157E308", "<sample:0>", "1000.0", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:3>", "<null>", "-11.6"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:6>", "5.3687091188675E8", "Infinity", "-4131"}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "Infinity", "<sample:2>", "1.7976931348623157E308", "<null>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "0.5", "Infinity", "2147483647"}, false, 12, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "Infinity", "<sample:1>", "1.7976931348623157E308", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0717734625362931, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infin...#244#-715484351", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:10>", "-471.5000000000001"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:4>"}, false, 9, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false, 9, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:4>"}, false, 10, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:4>", "-1.6000000000000003"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.122462048309373, getMaxStep=1.0, getMinReduction=0.2, getMinStep=Infinity, g...#238#-1661566058", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:7>", "2147483647", "1.0", "1001"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:10>", "4.294967294E10", "1.0", "1000"}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.1040895136738123, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#-304870025", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"NaN", "<empty>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:6>", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1.0", "<null>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#1961043629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "1.0", "<sample:2>", "NaN", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "1.0737418235E9"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "1.0", "<sample:2>", "NaN", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:4>", "1.0737418318000004E9"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "1.0", "<empty>", "NaN", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "10"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=A...#230#-348663017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:9>", "-4.294967327200002E9"}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "1.0", "<empty>", "NaN", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "2147483647"}, false, 9, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "2147483647"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "1880.0000000000002", "<sample:1>", "-1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "-3.320499999999999"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "0.0", "-1.6", "-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:3>", "0.025000000000000005"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "Infinity", "<sample:1>", "940.0000000000001", "<empty>"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:3>", "0.025000000000000005"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "Infinity", "<sample:0>", "940.0000000000001", "<sample:1>"}}, 1), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<null>", "Infinity"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 1), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.0905077326652577, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#460704447", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<null>", "Infinity"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:0>", "-1.7976931348623157E308", "1.7976931348623157E308", "-2147483648", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-6.7", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
