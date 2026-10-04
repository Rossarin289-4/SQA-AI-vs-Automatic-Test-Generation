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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "Infinity"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:7>", "-1000.0", "Infinity", "1073741823", "<sample:10>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "2012.0", "<sample:2>", "-2.0", "<empty>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:3>", "<empty>", "<sample:0>", "-2000.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getN...#235#-1504576161", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:0>", "<empty>", "<sample:1>", "0.9530000000000003"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:1>", "2000.044", "-1.7976931348623157E308", "948"}, {"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:2>", "498.811", "10000.000000000002", "-20", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:1>", "1.7976931348623155E307", "1951.22", "31457260", "<sample:3>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:5>", "3999.9999999999995", "<empty>", "-1000.0", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:1>", "-0.9530000000000004"}, {"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:1>", "1000.022", "0.91", "2147483647"}}, 1), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=47, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getNa...#234#-555889538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:4>", "1000000.0", "0.0", "-257"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "1000.022", "1.7976931348623157E308", "-2147483646"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "NaN"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-20"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"1000.0", "<sample:2>", "<sample:2>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:2>", "2.1474836532E9", "20000.0", "-1073741824", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:1>", "<sample:2>", "-1.7976931348623155E308"}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"1.0", "<sample:2>", "<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"addAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:6>", "2.147483857E8", "-2000.0000000000002", "-1", "<sample:9>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<null>", "<null>", "997.6220000000001"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:3>", "<sample:4>", "<sample:2>", "10006.3"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:7>", "10004.799999999997"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:5>", "0.9530000000000004", "<sample:4>", "1.7976931348623155E308", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "-10000.0"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "getEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:3>", "<sample:0>", "<null>", "-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:2>", "0.8940000000000003", "-1.7976931348623157E308", "1513"}, {"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:8>", "1.0000000000000002"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}, {"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-1.7976931348623157E308", "<sample:6>", "<null>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<null>", "1000.0219999999999", "-1000.0", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:4>", "0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<sample:2>", "<empty>", "-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:3>", "NaN", "1.7976931348623157E308", "2147483647", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:6>", "-Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:6>", "0.0", "2012.0", "999", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setMaxEvaluations", "int", "2147483646"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "9.530000000000005", "2012.0", "2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:2>", "9976.220000000001", "0.9530000000000005", "-2147483647", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-1.7976931348623155E308"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "-1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "1.7976931348623155E307", "<sample:0>", "-0.5", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:7>", "4.9E-324", "-4.9E-324", "2147483647", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}, {"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:7>", "-1006.0", "999.9999999999999", "-2"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEvaluations", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<null>", "10006.3"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<null>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:1>", "-1.7976931348623157E308", "10000.0", "1001", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "997.622"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "0.2", "<sample:0>", "-1.969", "<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:2>", "-10000.000000000002"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:0>", "0.009999999999999998", "<sample:2>", "0.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:4>", "1000.0", "NaN", "1"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:5>", "199.52439999999999", "-10000.0", "-2147483648", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<null>", "-0.5"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:3>", "10000.0", "1.0000000000000002", "999", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:0>", "1000.022"}, {"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "-1.0", "10000.0", "0"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "1.0"}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<empty>", "<sample:2>", "-1.7976931348623155E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "2000.0", "<sample:1>", "1000.0", "<null>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "1000.0", "-1.7976931348623157E308", "-1073741824"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:2>", "-4.4942328371557893E307"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<null>", "<empty>", "<sample:5>", "-1.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setMaxEvaluations", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"39"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:2>", "1999.9999999999998"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:0>", "10.0", "Infinity", "536870912", "<sample:4>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:1>", "10000.000000000002", "<sample:4>", "-1.7976931348623157E308", "<null>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:4>", "-8.988465674311578E307"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=A...#230#-348663017", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:5>", "1000.0", "Infinity", "2147483647", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:4>", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:6>", "2012.0", "-Infinity", "0"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-1073741824"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<null>", "<sample:4>", "<sample:2>", "-1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:9>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1000"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1000, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Adams-Ba...#223#901041955", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-1.0", "<sample:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:7>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getNa...#234#671200690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:4>", "-Infinity", "<sample:0>", "-1.9999999999999998", "<empty>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:3>", "<null>", "<sample:0>", "-996.7"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:6>", "<sample:2>", "<sample:2>", "10006.299999999997"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:4>", "0.12", "-1.7976931348623155E308", "2147483647", "<sample:14>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "-Infinity", "-2012.0", "977"}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:8>", "Infinity", "<empty>", "99.9422", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:7>", "9.999999999999998", "2.1474836470000002E9", "2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:8>", "-1.7976931348623157E308", "<sample:0>", "-2.147483647E9", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:2>", "-8.988465674311579E307", "2000.0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "1.9060000000000008"}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<null>", "0.1", "481.811", "511", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "0.5000000000000001", "<sample:1>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:4>", "-1.7976931348623158E307", "10000.000000000002", "999", "<sample:12>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "2036.044", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#607328517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1.0", "<sample:4>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<null>", "2.0", "5000.0", "1073741823"}}), new String[][]{{"retainAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "5000.0", "<sample:0>", "2011.9999999999998", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:7>", "1.0000000000000002", "5000.0", "3067", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-Infinity"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "1001.322"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:0>", "10000.0", "0.0", "249"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "-1.0", "<sample:2>", "-1000.0", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:5>", "10000.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:2>", "1.7976931348623157E308", "-2.0000000000000004", "1073742316", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-2.0000000000000004", "<sample:1>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:4>", "999.66"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<null>", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}}, 2), new String[][]{{"iterator", "", "6"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "997.622", "1.8300000000000005", "1073741823"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1.7976931348623157E308", "<sample:2>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-2037105039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:4>", "1.0000000000000002", "Infinity", "10", "<sample:10>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:5>", "1000.0", "-1.0", "536870911", "<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "5003.15", "<null>", "<null>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:7>", "199.52439999999999", "997.6220000000002", "1", "<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:0>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:3>", "49.8811", "<null>", "0.0", "<sample:4>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"retainAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:0>", "<sample:0>", "-58.82"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:4>", "4000.0"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int", "<sample:0>", "1999.9999999999998", "1000.0", "-10"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "5000.0"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:2>", "<empty>", "<sample:0>", "7.1000000000000005"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1000.0", "<sample:0>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-0.09999999999999999", "<sample:2>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-2037105039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 3), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "Infinity"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:9>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "10000.0", "0.9999999999999999", "-1"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "2.0"}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:2>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}, {"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "2.0", "<null>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-2037105039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "1.7976931348623155E308", "2011.9999999999998", "-2147483648"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:13>", "Infinity", "<sample:0>", "498.811", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:2>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 1), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-2.0", "<sample:3>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#1322012517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:6>", "2004.544"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "2.1474836469999998E9", "<sample:2>", "<empty>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#1961043629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:5>"}}, 2), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:2>", "<sample:2>", "<empty>", "0.1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "5003.15", "<sample:1>", "-1.7976931348623155E308", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:11>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-42.0"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "NaN", "1006.0", "-42"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:1>", "1000.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=47, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getNa...#234#-555889538", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"1000.0", "<sample:2>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setMaxEvaluations", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#1941238500", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "2000.044", "<sample:1>", "<empty>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:3>", "-1000.0", "997.647", "1"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "0.9530000000000003"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NoDataException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:8>", "3.8120000000000016", "10000.000000000002", "-2147483648", "<sample:1>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "510.811", "<sample:0>", "<sample:2>"}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:2>", "997.622", "1.0000000000000002", "-2147483616", "<sample:8>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:7>", "-2.0000000000000004", "<null>", "966.0", "<sample:0>"}}, 2), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "resetEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:3>", "-0.9530000000000004"}, {"org.apache.commons.math.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"addAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:0>", "2000.044"}}, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:4>", "-2.0"}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "integrate", "org.apache.commons.math.ode.ExpandableStatefulODE,double", "<sample:7>", "-2000.02"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "2.147483647E10", "<sample:1>", "<sample:3>"}}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}}, 1), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1000.022", "<sample:1>", "<sample:5>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#1322012517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "resetEvaluations", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:2>", "997.622", "-997.622", "1", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math.ode.sampling.StepHandler", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-1.7976931348623157E308", "<empty>", "<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math.ode.ExpandableStatefulODE", "<sample:5>"}, {"org.apache.commons.math.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math.analysis.solvers.UnivariateRealSolver"}, new String[]{"<sample:3>", "1.7976931348623155E308", "997.6220000000001", "0", "<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getName", ""}, {"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:2>", "-200.0", "0.0", "2147483647", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math.ode.events.EventHandler,double,double,int,org.apache.commons.math.analysis.solvers.UnivariateRealSolver", "<sample:6>", "2000.044", "1.7976931348623157E308", "-2147483648", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "Infinity", "-998.3220000000001", "-58"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.ode.AbstractIntegrator", "org.apache.commons.math.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
}
