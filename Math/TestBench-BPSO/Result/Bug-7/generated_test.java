package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "2.1474836469999998E9", "Infinity", "1073743871", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:3>", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:5>", "<sample:4>", "<empty>", "2000.0"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:6>", "-607.1", "-0.1", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:1>", "-Infinity", "60.71", "16778217", "<sample:7>"}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1073743871"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "200.0", "<sample:0>", "-9.380000000000003", "<sample:3>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1073743871, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#627974551", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "2147483647", "-Infinity", "-2"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-1899.9999999999998", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:6>", "999.6", "<sample:8>", "-6.071", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-31.0", "<sample:2>", "2.1474836470000002E9"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:1>", "2.147483647E10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=NaN, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getNam...#233#814554193", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-607.1", "<sample:0>", "95.0"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:5>", "<sample:5>", "1898.99"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:1>", "0.5000000000000001", "1.4100000000000001", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "Infinity", "-60.71", "-2147483628", "<sample:8>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:3>", "4.2949672940099998E9", "949.9999999999999", "268436457"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:3>", "<sample:5>", "<null>", "1900.0"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:3>", "<sample:7>", "<sample:3>", "-2.1474836469999998E9"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:9>", "-2.0", "-999.5999999999999", "1001"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:0>", "1899.9999999999998", "<sample:0>", "1000.0", "<null>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "950.0", "<sample:2>", "<sample:5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-2037105039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "2.147483650451E9", "1.0737418235000001E9", "-1073741823", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:0>", "-Infinity", "1.0", "1073743999", "<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:1>", "<sample:0>", "<empty>", "4.2949672939999995E9"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<null>", "-Infinity", "<sample:3>", "1000.053", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "NaN", "<null>", "Infinity", "<empty>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "NaN", "NaN", "268435445", "<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:0>", "1899.9999999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:5>", "<sample:3>", "<sample:7>", "-60.71"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:6>", "-Infinity", "2147483647", "2147483647", "<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "-10.000000000000002", "<sample:5>", "Infinity", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "-2.1474836469999995E9", "<sample:2>", "950.0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:7>", "-1.7976931348623155E308", "2.1474836528999996E9", "-1", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:7>", "4.9E-324"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:10>", "-2.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "-0.5"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"retainAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"2.1474836470000002E9", "<sample:0>", "<empty>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:7>", "-10.000000000000002", "-Infinity", "2147483564", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:6>", "1.2899999999999998"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"0.0", "<sample:6>", "<empty>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:4>", "-607.1", "NaN", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-2.147483647E9", "<sample:5>", "0.25"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "-134217727"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "0.5", "-0.0", "1073741827", "<sample:6>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:6>", "1900.0", "Infinity", "1073743871", "<sample:6>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:6>", "0.49999999999999994", "25.8", "0"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<null>", "61.050000000000004", "2000.0", "62"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "95.00000000000001"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:5>", "-2.0", "-1.0000000000000002", "-2147483648", "<sample:6>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:1>", "5.010000000000001", "<sample:0>", "1.0737418234999999E9", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:4>", "<sample:0>", "<sample:1>", "-2.1474836473799999E9"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "-60.71"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "4.294967293999999E9", "<sample:5>", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<null>"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:5>", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:4>", "0.5000000000000001", "<empty>", "0.12000000000000001", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "0.0", "-1.7976931348623155E308", "16778244"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "2.147483647E8"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-Infinity", "<sample:7>", "1.0737418235E9", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"1.29", "<null>", "<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<null>", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:2>", "-Infinity", "Infinity", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1.29", "<sample:0>", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "1073741782"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=1073741782, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#1521802105", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "acceptStep", new String[]{"org.apache.commons.math3.ode.sampling.AbstractStepInterpolator", "double[]", "double[]", "double"}, new String[]{"<null>", "<sample:3>", "<sample:1>", "1.29"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "-1.7976931348623157E308", "1.29", "-4", "<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"950.0", "<sample:2>", "<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:0>", "-Infinity", "<sample:3>", "-8.988465674311578E307", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "-8.988465674311578E307", "Infinity", "536870911"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:8>", "-Infinity", "-2.1474836469999998E9", "1073741782", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:10>", "1899.9999999999998", "<sample:2>", "-60.71", "<sample:0>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:3>", "<null>", "<null>", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:5>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-Infinity", "<sample:3>", "-60.689"}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "1.7976931348623157E308", "<sample:0>", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:4>", "999.6"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:2>", "-2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:7>", "-Infinity", "<sample:2>", "Infinity", "<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:5>", "NaN", "993.8", "536871935", "<sample:6>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:5>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:5>", "-2.1474836469999998E9", "<sample:2>", "-2.1474836469999995E9", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "Infinity", "<sample:2>", "19000.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "-60.71"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:0>", "0.0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:8>", "-1.0", "999.6", "536871935", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:1>", "1900.0000000000002", "-19.57", "999"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "-55"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:0>", "0.0", "1.393", "140264"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:2>", "1.7976931348623155E308"}, false, 3, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"47"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=47, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, getName=A...#230#1207404595", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-0.5", "<sample:3>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "949.9999999999998", "8.988465674311578E307", "-2147483648", "<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-0.969", "<sample:10>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:0>", "-2.147483647E9", "1.2900000000000003", "-2147483648"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"containsAll", "java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:4>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:8>", "0.0", "19000.0", "1073741824"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:6>", "-8.988465674311578E307"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "0.7000000000000002", "4.294967294E8", "2147483640"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:7>", "<sample:0>", "<sample:2>", "-7.090000000000001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "-8.988465674311579E307", "1.7976931348623157E308", "0"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getNa...#234#671200690", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:5>", "Infinity", "<sample:4>", "0.5", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:2>", "-Infinity", "-10.000000000000002", "0", "<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:7>", "-0.0", "<sample:2>", "1899.69", "<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "-5.000000000000001", "<sample:3>", "2.1474836469999998E9"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:5>", "2.1474836469999998E9", "1899.69", "2147483647", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "1073741823"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1073741823, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-815730880", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:5>", "-60.709999999999994", "-Infinity", "-2147483626"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "1899.64", "<null>", "-1.29"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:8>", "-4.9E-324", "-10.000000000000004", "536870911", "<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:8>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "-10.000000000000002", "<sample:1>", "-0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:2>", "<sample:3>", "<sample:3>", "973.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"Infinity", "<sample:4>", "1.7976931348623157E308"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:5>", "4.2949672940000005E9"}}), new String[][]{{"contains", "java.lang.Object", "7"}, {"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "999.9999999999999", "<sample:7>", "<sample:7>"}}), new String[][]{{"iterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#607328517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "-4.9E-324"}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "0.9390000000000001", "<sample:2>", "<sample:5>"}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#607328517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "121.42", "<null>", "-1.7976931348623157E308", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:0>", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "1899.69"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"Infinity", "<sample:3>", "-4.9E-324"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:10>", "-60.71000000000001", "-1.0", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:2>", "-8.988465674311578E307", "2147483647", "-1082130390"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:0>", "-60.71"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "-607.1000000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "0.0", "<null>", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:9>", "-950.0"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:4>", "999.6", "-32.5", "-2147483648", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:8>", "1000.0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:9>", "<sample:8>", "<null>", "1899.98"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<null>", "1899.68", "-1.7976931348623157E308", "19"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.FirstOrderDifferentialEquations", "double", "double[]", "double", "double[]"}, new String[]{"<sample:6>", "1899.6350000000002", "<sample:7>", "-10.000000000000002", "<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:6>", "1.7976931348623157E308"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:7>", "-607.1000000000001"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"10"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=10, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Adams-Bash...#221#620523539", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:0>", "1.7976931348623157E308"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "993.6000000000001", "<sample:4>", "2.1474836452E9"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Adams-Bashforth", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:10>", "-Infinity", "-1.0", "27", "<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "1073741760"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741760", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=1073741760, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#153213786", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"false"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"16394"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=16394, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Adams-B...#224#-1515015537", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<null>", "2.1474837029399996E9"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:1>", "-607.123", "4.9E-324", "-2147483641"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "67109364"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=67109364, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity...#241#1242083064", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:6>", "10.000000000000002", "-2.1474836469999998E9", "268436456"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<null>", "-3799.9999999999995"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"1073741799"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-20.0", "<sample:7>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:1>", "-0.49999999999999994", "-1.0737418224999999E9", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "-1899.9999999999998", "<sample:1>", "-607.1", "<sample:2>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setStateInitialized", new String[]{"boolean"}, new String[]{"true"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-1.0", "<null>", "<sample:7>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:6>", "-0.032", "-8.988465674311578E307", "1073741823"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearEventHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:1>", "<sample:0>", "<sample:4>", "-1.7976931348623158E307"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:6>", "1.7976931348623157E308", "2.1474836309999998E9", "536871942"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:5>", "0.528", "50.0", "-1073744383", "<sample:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"-33556434"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentStepStart", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:0>", "-3.6254999999999997", "1.0737418235E9", "2147483647", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:0>", "0.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:4>", "-1923.9999999999998", "-0.1", "0", "<sample:4>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setEquations", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}}), new String[][]{{"contains", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"2.58", "<sample:4>", "1.0737418226E9"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "2.1474836470000002E9", "<sample:6>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=0.0, getEvaluations=!NullPointerException, getMaxEvaluations=!NullPointerException, getMaxGrowth=0.0, getMaxStep=0.0, getMinReduction=0.0, getMinStep...#234#-1636190037", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-5.000000000000001"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "-60.71", "<sample:1>", "1.7976931348623157E308"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int"}, new String[]{"<sample:11>", "2.0", "-60.71", "10"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:8>", "1.29", "890.0", "2", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<sample:7>", "<sample:8>", "8.988465674311578E307"}}, 3), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-4.0", "<sample:4>", "0.0"}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "clearStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "computeDerivatives", new String[]{"double", "double[]", "double[]"}, new String[]{"-10.000000000000004", "<sample:4>", "<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-2037105039", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "0.28"}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:3>", "<sample:4>", "<sample:1>", "-0.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"0.5000000000000001", "<null>", "-0.1"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:6>", "<sample:7>", "<sample:0>", "-0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<sample:3>", "60.71", "-8.988465674311578E307", "-28", "<null>"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "4.294967293999999E9", "<sample:2>", "-607.1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEventHandlers", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "-999"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}), new String[][]{{"iterator", "", "1"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getStepHandlers", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearEventHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:2>", "-Infinity", "-4.9E-324", "536871935", "<sample:3>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-10.110000000000003", "<sample:6>", "-2.6"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-Infinity", "<sample:2>", "<sample:2>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#607328517", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-12.142", "<sample:7>", "-10.000000000000004"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:9>", "2000.0", "4.2949672939999995E9", "1001"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "80"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=80, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getN...#235#1757250872", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-1.7976931348623157E308", "<sample:7>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#1961043629", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "setMaxEvaluations", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=0, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Adams-Bashf...#220#386484790", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addStepHandler", new String[]{"org.apache.commons.math3.ode.sampling.StepHandler"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:3>", "-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:0>", "<sample:2>", "<sample:2>", "993.6000000000001"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "949.9999999999999", "<sample:3>", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooSmallException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "-8.589934587999999E9", "<sample:0>", "4.2949672940000005E9"}}), new String[][]{{"size", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "addEventHandler", new String[]{"org.apache.commons.math3.ode.events.EventHandler", "double", "double", "int", "org.apache.commons.math3.analysis.solvers.UnivariateSolver"}, new String[]{"<null>", "-2.0", "2.1474836451999998E9", "2147483647", "<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "2147483647"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "sanityChecks", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:5>", "102.26"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "clearStepHandlers", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "-30.355", "<sample:3>", "40.89"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<null>", "<sample:8>", "<sample:7>", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:2>", "20000.0", "-30.0", "-2147483648", "<sample:4>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:8>"}}, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "acceptStep", "org.apache.commons.math3.ode.sampling.AbstractStepInterpolator,double[],double[],double", "<sample:1>", "<sample:4>", "<sample:0>", "1.0"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "sanityChecks", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:1>", "-1.6099999999999999"}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "-1.2142", "<sample:7>", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#740921609", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"remove", "java.lang.Object", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:9>", "-6.071", "1.0", "-2147483626"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:7>"}}, 3), new String[][]{{"removeAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getMaxEvaluations", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "setMaxEvaluations", "int", "18"}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=18, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getN...#235#-1225984665", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:4>"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "1904.6999999999998", "<sample:4>", "121.42"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:7>", "0.43999999999999995"}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getEvaluations", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int", "<sample:2>", "4.2949672904E9", "0.0", "1073743875"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getStepHandlers", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:6>", "1900.0", "-8.988465674311579E307", "4194554", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"1867.6900000000003", "<sample:3>", "-10.000000000000002"}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addStepHandler", "org.apache.commons.math3.ode.sampling.StepHandler", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.2599210498948732, getMaxStep=1.0, getMinReduction=0.2, getMinStep=0.0, getName=Ad...#229#-442540698", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getName", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setEquations", "org.apache.commons.math3.ode.ExpandableStatefulODE", "<sample:5>"}}, 1), new String[][]{{"remove", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getCurrentSignedStepsize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "initIntegration", "double,double[],double", "-12.091999999999999", "<sample:0>", "-5.000000000000001"}, {"org.apache.commons.math3.ode.AbstractIntegrator", "setStateInitialized", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"-2.1474836469999998E9", "<sample:8>", "-0.5999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "addEventHandler", "org.apache.commons.math3.ode.events.EventHandler,double,double,int,org.apache.commons.math3.analysis.solvers.UnivariateSolver", "<sample:8>", "945.145", "-12.115", "1073741831", "<sample:7>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEvaluations", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.ExpandableStatefulODE,double", "<sample:6>", "-1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"2.1474836449999998E9", "<sample:5>", "3799.9999999999995"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#272143302", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:5>", "949.9999999999999", "<sample:0>", "-2.147483647E10", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.189207115002721, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=1.0, g...#238#455785706", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"2.147483647E8", "<sample:4>", "-4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentSignedStepsize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=2.0, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infinity, getName=Ad...#229#-1334509200", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "initIntegration", new String[]{"double", "double[]", "double"}, new String[]{"2.1474836469999998E9", "<sample:7>", "-Infinity"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "integrate", new String[]{"org.apache.commons.math3.ode.ExpandableStatefulODE", "double"}, new String[]{"<sample:5>", "-2.1474836469999998E9"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.DimensionMismatchException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getEventHandlers", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "integrate", "org.apache.commons.math3.ode.FirstOrderDifferentialEquations,double,double[],double,double[]", "<sample:2>", "-Infinity", "<sample:9>", "1.0", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableCollection", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=Infinity, getCurrentStepStart=NaN, getEvaluations=0, getMaxEvaluations=2147483647, getMaxGrowth=1.148698354997035, getMaxStep=Infinity, getMinReduction=0.2, getMinStep=Infini...#243#-1630060692", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.ode.AbstractIntegrator", "org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegrator", "getMaxEvaluations", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.ode.AbstractIntegrator", "getCurrentStepStart", ""}, {"org.apache.commons.math3.ode.AbstractIntegrator", "computeDerivatives", "double,double[],double[]", "2.1474836469999995E9", "<sample:5>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getCurrentSignedStepsize=0.0, getCurrentStepStart=NaN, getEvaluations=1, getMaxEvaluations=2147483647, getMaxGrowth=1.4142135623730951, getMaxStep=0.0, getMinReduction=0.2, getMinStep=1.0, getName=Ad...#229#1322012517", SearchInputFactory_scaffolding.receiverState());
 }
}
