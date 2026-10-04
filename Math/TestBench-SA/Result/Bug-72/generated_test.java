package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-2.0E-323"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "1.5389155633545075E20", "3.847288908386267E19"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-2.0E-323, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.26"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "1.5389155633545072E21", "3.847288908386267E19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.26, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-Infinity", "NaN"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-27.699499999999993", "560.5000020000001"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:0>", "-3.8472889083862669E17", "-0.09999999999999998", "-0.09999999999999999"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.552713678800501E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.552713678800501E-15}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-611.5699999999999", "2.0", "-521.7919999999999"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-4.9E-324", "-10.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-1.0", "7.694577816772538E19"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-521.7919999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-521.7919999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "0.11500000000000042", "-52.199999999999996"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-0.015", "3.077831126709013E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "8048.600000000001", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.3877787807814457E-17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.3877787807814457E-17}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-Infinity", "0.0", "-0.13699999999999996"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-2.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-4.8", "40063.600000000006", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:7>", "5.6", "3.847288908386268E26", "3.8472889083862669E17"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "-1.38", "2.124"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-Infinity"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.564859273539945E26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-Infinity, getIterationCount=48, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.564859273539945E26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "1.5", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:9>", "1.0", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "2.0", "1.7976931348623157E308", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "Infinity", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "Infinity", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.7976931348623157E308", "-1.0", "0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:7>", "2.0", "1.0E-6", "7694577816772532779"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "NaN", "-8.0"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "NaN", "-8.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "7694577816772532779"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-1.0", "Infinity", "7694577816772532779"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-1.0", "Infinity", "7694577816772532779"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-13"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-13, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "1.5", "0.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "10"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "1.5", "0.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "20"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "23"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "46"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=46, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.0", "0.5", "<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.0", "2147483647"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.0", "3"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.9999999999999999", "3"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999999999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"0.49999999999999994", "3"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.49999999999999994}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"22.0", "3"}, false, 8, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=22.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-3.0", "-2143289353"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2143289353, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-3.0", "-2147483648"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-3.0", "2147483647"}, false, 14, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-3.0", "3"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-3.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"23.0", "3"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.0", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=23.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:7>", "0.5", "0.5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-1.7976931348623157E308", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.0", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.0", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "Infinity"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.75"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.75, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.75"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.75, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "43.0", "2.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "1.5", "-1.0", "0.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.02", "43.0", "2.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.019999999999999997", "802.0", "2.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-61.2", "40068.00000000001", "-0.09999999999999999"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-61.2", "40068.00000000001", "-0.09999999999999999"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.09999999999999999", "7694577816772532779", "1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.09999999999999999", "7694577816772532779", "0.1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.09999999999999999", "7694577816772532779", "1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "7694577816772532779", "-0.009999999999999998"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "1.9236444541931336E19", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "3.847288908386267E19", "0.10000000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "3.847288908386267E19", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5, getFunctionValue=!, getFunctionValueAccuracy=-0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "3.847288908386267E19", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.5"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.5, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "3.847288908386267E19", "0.10000000000000002"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.37"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "7.694577816772536E19", "0.10000000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-0.37, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-4.9E-324"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "7.694577816772536E19", "0.10000000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-4.9E-324, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-61.152"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "7.694577816772536E19", "0.10000000000000002"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-61.152, getFunctionValue=!, getFunctionValueAccuracy=-0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-4.9E-324"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "7.694577816772538E19", "-0.10000000000000002"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.1, getFunctionValue=!, getFunctionValueAccuracy=-4.9E-324, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "2.0E-323"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "1.5389155633545075E20", "3.847288908386267E19"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=2.0E-323, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-4.9E-324", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "40068.00000000001", "Infinity", "0.1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "7.694577816772538E19", "2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.694577816772538E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#210#982024329", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-0.09999999999999999", "3.847288908386266E19"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.09999999999999998", "3.8472889083862675E24", "3.8472889083862669E17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-1.38", "1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7529999999999992"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-Infinity", "3.8472889083862669E17", "150.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7529999999999992, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-1.7529999999999992", "0.10000000000000002", "NaN"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-3.11"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-3.11, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-3.11"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-30.8"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-4.9E-324", "2.1", "-1073741824"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.1, getFunctionValueAccuracy=-30.8, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=-3.11, getResult=-4.9E-324}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2146959360"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2146959360, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "1.0", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "1.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "1.0", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:9>", "1.0", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "Infinity", "<null>"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.5"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.5, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-33.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "NaN", "-1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "Infinity", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-33.5, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-28.7"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "Infinity", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-28.7, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-14.35"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "Infinity", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-14.35, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.4849999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "Infinity", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.4849999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.7976931348623157E308", "-1.0", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"8.988465674311579E307", "-1.0", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=8.988465674311579E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.0", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.0", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"NaN", "NaN", "-1.0"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-1.7976931348623157E308", "1.7976931348623157E308", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-1.0", "Infinity", "7694577816772532779"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"7694577816772532779"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"3.8472889083862666E18"}, false, 12, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=3.8472889083862666E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.92364445419313331E18"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.92364445419313331E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.923644454193133E19"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.923644454193133E19, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.9236444541931328E18"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.9236444541931328E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "1.7976931348623157E308", "1.0", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-1.0", "0.5", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.5", "1.5", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"11.5", "1.5", "-1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=11.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"11.5", "3.0", "-3"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=11.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"7694577816772532779", "10"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0", "0.5", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.6945778167725332E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-13"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-13, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "Infinity", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "Infinity", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:2>", "-1.0", "NaN"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "1.0", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"NaN", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"NaN", "2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.7976931348623157E308", "23"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"536870911"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=536870911, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"503316479"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=503316479, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"503316445"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=503316445, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"2.0", "2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.0", "2147483647"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.042"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.042, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.085"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "2.0", "1.5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.085, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "4.0", "1.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0E-6", "1.0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.006"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "3.9999999999999996", "1.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0E-6", "1.0", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.006, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.5", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "-1.7976931348623157E308", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"1.5", "Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double", "0.0", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.5, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.75"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.75, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "7694577816772532779"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.75"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.75, getFunctionValue=!, getFunctionValueAccuracy=7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-7.6945778167725332E18"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.75"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.75, getFunctionValue=!, getFunctionValueAccuracy=-7.6945778167725332E18, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "0.2", "2.0", "1.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "1.0", "5.0", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "0.2", "2.0", "1.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "1.0", "5.0", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.02", "430.0", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.7976931348623157E308", "7694577816772532779", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.019999999999999997", "430.0", "2.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.04", "400.68000000000006", "0.09999999999999999"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-61.2", "40068.00000000001", "-0.09999999999999999"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "40068.00000000001", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=40068.00000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "40068.00000000001", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=40068.0000000000...#202#-1594335245", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "5.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.09999999999999999", "3.847288908386266E19", "0.20000000000000004"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=5.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.009999999999999998", "3.847288908386266E19", "2.1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-3.11", "3.847288908386266E19", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "7694577816772532779", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=7.6945778167725332E18}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"5.0", "7694577816772532779"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "3.847288908386267E19", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "NaN", "-61.152", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.1", "3.847288908386267E19", "0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "NaN", "-61.152", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-4.9E-324"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.1", "7.694577816772538E19", "0.10000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.1, getFunctionValue=!, getFunctionValueAccuracy=-4.9E-324, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "0.1"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-4.9E-324"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "7.694577816772538E19", "-0.10000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.1, getFunctionValue=!, getFunctionValueAccuracy=-4.9E-324, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-4.9E-324"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "-0.2", "1.5389155633545072E21", "3.847288908386267E19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-4.9E-324, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.26", "1.5389155633545072E21", "3"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.26", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5389155633545072E21, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-61.152", "-3.11", "7.694577816772538E19"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"7.694577816772538E19", "-1.7976931348623157E308", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "5.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", "double,double,double", "-0.10000000000000002", "NaN", "0.2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<null>", "-4.9E-324", "1.7976931348623157E308", "0.5"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "2.0"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-3.11", "1.5", "1.0E-6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-0.10000000000000002", "1.5", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.10000000000000002}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-61.2", "1.0E-6", "5.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.0", "0.2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.009999999999999998", "3.847288908386267E19"}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "-0.10000000000000002", "0.26", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "1.0", "1.5389155633545072E21", "3"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5389155633545072E21, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "1.0", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.019999999999999997", "7.694577816772538E19", "5.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.019999999999999997", "1.538915563354508E20", "2.0000000000000003E-6"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1073479680"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073479680, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.08247000000000002", "150.0", "<sample:11>"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-0.2", "-0.19999999999999998", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.08247000000000002", "150.0", "<sample:11>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "-Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.08247000000000002", "-150.0", "<sample:11>"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"6.959999999999997", "-3.11", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-4.9E-324, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"6.959999999999997", "-3.11", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-4.9E-324, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-6.959999999999997", "3.11", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-27"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-4.9E-324, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-27, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"7694577816772532779"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"7.6945778167725338E17"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725338E17, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"7.6945778167725328E16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725328E16, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.5389155633545062E16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.5389155633545062E16, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-3.0778311267090124E16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-3.0778311267090124E16, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-3.077831126709012E16"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-3.077831126709012E16, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-3.0778311267090116E16"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-3.0778311267090116E16, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"3.8472889083862669E17", "2.1", "<sample:1>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-31.51999999999994"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-31.51999999999994, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"4.479999999999999"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "Infinity", "0.4000000000000001", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.4000000000000001, getFunctionValueAccuracy=4.479999999999999, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#210#-1409009455", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"4.479999999999999"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "Infinity", "1.5", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5, getFunctionValueAccuracy=4.479999999999999, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"45.69999999999998"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "Infinity", "1.5", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5, getFunctionValueAccuracy=45.69999999999998, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"45.69999999999998"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "Infinity", "1.5389155633545072E21", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.5389155633545072E21, getFunctionValueAccuracy=45.69999999999998, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRes...#213#-1858260731", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"45.69999999999998"}, false, 13, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=45.69999999999998, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-0.41449999999999965"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "5.0", "-1073741790"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.1", "-1.0", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-0.41449999999999965, getIterationCount=-1073741790, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5....#202#-676640640", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-0.4144999999999996"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "5.0", "-1073741790"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.1", "-1.0", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=-0.4144999999999996, getIterationCount=-1073741790, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0...#201#-1826625971", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.4144999999999996"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "5.0", "-1073741790"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.1", "-1.0", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=0.4144999999999996, getIterationCount=-1073741790, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"0.08289999999999992"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "5.0", "-1073741790"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.1", "-1.0", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=0.08289999999999992, getIterationCount=-1073741790, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0...#201#654435022", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-3.8472889083862661E18"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "3.847288908386266E20", "-2.76", "-61.2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-3.8472889083862661E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.92364445419313306E18"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "3.847288908386266E20", "-2.76", "-61.2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.92364445419313306E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"10.260000000000002"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "3.847288908386266E20", "-2.76", "61.2"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=10.260000000000002, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"102.53000000000002"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=102.53000000000002, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-61.2", "2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "7694577816772532779", "-1.9764999999999997", "1.5389155633545072E21"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-Infinity", "28"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=28, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "-Infinity", "28"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=28, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "-0.09999999999999999", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"5.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=5.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-0.09999999999999998"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-0.09999999999999998, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-61.152", "-0.004999999999999999"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.5389155633545072E21"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.5389155633545072E21, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-61.15200000000001", "-2.4999999999999995E-4"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "1.5389155633545072E21"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.5389155633545072E21, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.2, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-61.15200000000001", "-2.4999999999999995E-4"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "3.0778311267090144E21"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=3.0778311267090144E21, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.2, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-61.15200000000001", "-2.4999999999999995E-4"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "3.0778311267090144E21"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "-0.2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=3.0778311267090144E21, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.2, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.4", "-3.847288908386267E19", "0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.847288908386267E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=0.4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.451", "-3.847288908386267E19", "0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.847288908386267E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=0.451}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.451", "-3.847288908386267E19", "-256"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.847288908386267E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=-256, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=0.451}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.451", "-3.847288908386267E19", "-278"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-3.847288908386267E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=-278, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=0.451}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"3.8472889083862675E24"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=3.8472889083862675E24, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-3.8472889083862675E24"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-3.8472889083862675E24, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-7.694577816772535E24"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-7.694577816772535E24, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.538915563354507E25"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.538915563354507E25, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", "double", "3.8472889083862675E24"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=3.8472889083862675E24, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "5.0", "2.0", "0.20000000000000004"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "3.8472889083862661E18", "0.5", "7694577816772532779"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "5.0", "2.0", "0.20000000000000004"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "3.8472889083862675E24"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "1.92364445419313306E18", "-0.5", "7694577816772532779"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=3.8472889083862675E24, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "3.847288908386267E19"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "1.5389155633545072E21", "-1.38"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=3.847288908386267E19, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "3.847288908386267E19"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "1.5389155633545072E21", "-1.38"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=3.847288908386267E19, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "3.847288908386267E20"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "1.5389155633545072E21", "-1.38"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=3.847288908386267E20, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-Infinity", "7.694577816772536E19"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-Infinity", "7.694577816772536E19"}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1073741824, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1073741815"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1073741815, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-1073741815"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1073741815, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-236.49200000000002", "-38.288999999999994", "2279.92"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.1", "5.0", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "resetFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "2"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.5, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.7529999999999992"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.7529999999999992, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-3.5059999999999985"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-3.5059999999999985, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-3.4819999999999984"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValue", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-3.4819999999999984, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-3.4819999999999984"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "5.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=5.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-3.4819999999999984, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.01", "0.10000000000000002", "34"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.10000000000000002, getFunctionValueAccuracy=1.0E-15, getIterationCount=34, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.01", "0.20000000000000004", "34"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.20000000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=34, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.01", "-0.20000000000000004", "34"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.20000000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=34, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.01}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"3.99", "-0.20000000000000004", "34"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.20000000000000004, getFunctionValueAccuracy=1.0E-15, getIterationCount=34, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.99}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"3.99", "-Infinity", "34"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=34, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.99}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.26", "7694577816772532779", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=7.6945778167725332E18, getFunctionValueAccuracy=1.0E-15, getIterationCount=3, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.26}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "1.5", "3.847288908386266E19"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.21999999999999997", "0.75"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.10000000000000002"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.10000000000000002, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.21999999999999997", "0.075"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "0.05000000000000001"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.26", "3.8472889083862669E17"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=0.05000000000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-0.21999999999999997", "-0.18749999999999994"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", "double,double", "0.26", "3.8472889083862662E17"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "0.20000000000000004", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-0.009999999999999998", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.009999999999999998", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "3.8472889083862669E17", "3.847288908386266E19", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.847288908386266E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#223#-628534835", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "3.8472889083862662E17", "3.847288908386266E19", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.847288908386266E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#223#-634999482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "3.8472889083862662E17", "3.847288908386266E19", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.847288908386266E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#223#-634999482", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "7.6945778167725325E17", "3.847288908386266E19", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.847288908386266E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#223#803850293", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,double,int", "0.1", "3.847288908386266E19", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=3.847288908386266E19, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#205#-908609412", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "3"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=3, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.7976931348623157E308", "106"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=106, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.7976931348623157E308", "212"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=212, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"1.7976931348623157E308", "74"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=74, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0", "74"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "resetRelativeAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=74, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", new String[]{"double", "int"}, new String[]{"-1.0", "-12"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-12, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-0.19999999999999998", "2.5", "0.10500000000000002"}, false, 14, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.10000000000000002", "-61.2", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-0.19999999999999998", "2.5", "0.10500000000000002"}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "2.1", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:9>", "-4.9E-324", "-1.7529999999999992"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.10000000000000002", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=0.1000000000000000...#202#105837464", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:9>", "-4.9E-324", "-1.7529999999999992"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setResult", "double,int", "0.10000000000000002", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=0.100000...#212#-1194730642", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "1.5"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-1.7529999999999992", "-3.11", "1.05"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", "double,double,double", "-1.38", "2.0", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.5, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-13.206999999999997", "-0.018", "0.04905"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "0.5", "0.05000000000000001", "-61.2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "3.847288908386266E19"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=3.847288908386266E19, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-6.6034999999999995", "0.07800000000000001", "0.40904999999999997"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "double,double,double", "0.5000000000000001", "0.05000000000000001", "-61.2"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setAbsoluteAccuracy", "double", "7694577816772532779"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=7.6945778167725332E18, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "4.986"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.11000000000000001", "1.2465000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:1>", "0.1", "-0.2", "-0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "40068.00000000001"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=40068.00000000001, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.2", "1.2465000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:1>", "0.1", "-0.2", "-0.10000000000000002"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "40068.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=40068.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"0.5", "1.2465000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setFunctionValueAccuracy", "double", "20034.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=20034.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.20000000000000007", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20000000000000007", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"3.9000000000000004", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.9000000000000004", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"3.892", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.892", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"3.8919999999999995", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.8919999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"3.8919999999999995", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.8919999999999995", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"9.892", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.892", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-1.0", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-4.9E-324", "7.694577816772538E19", "<sample:1>"}, {"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"0.10000000000000002", "NaN"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BrentSolver", "getResult", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.10000000000000002", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BrentSolver", "org.apache.commons.math.analysis.solvers.BrentSolver", "solve", new String[]{"double", "double"}, new String[]{"-0.07", "0.26"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.07", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
}
