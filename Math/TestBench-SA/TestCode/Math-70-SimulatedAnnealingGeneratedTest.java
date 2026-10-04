package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "NaN", "5.0E-7"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "0.0", "1.0", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.76837158203125E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-102.80000999999999", "2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "5.0E-7", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.80000999999...#204#-1934467421", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "1.0E-6", "1.0", "0.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995231633186", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995231633186}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:9>", "Infinity", "NaN", "NaN"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "1.7976931348623157E308", "Infinity", "Infinity"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "0.0", "NaN", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "1.7976931348623157E308", "Infinity", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "1.0E-6", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<null>", "1.7976931348623157E308", "-1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "NaN", "5.0E-7"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0", "Infinity", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"-1.0", "Infinity", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "5.0E-7", "0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "-1.25", "<sample:9>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-2.0", "2.5E-7", "Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "1.0", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "1.0E-6", "1.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "-1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623158E307", "0.549999975", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "1.0E-6", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0", "10"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "NaN"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=NaN, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.9999999999999999"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.9999999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.9999999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.9999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.9999999999999998, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-1.0", "Infinity"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "-1.7976931348623157E308", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "-Infinity", "Infinity"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "0.51"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.51, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:5>", "NaN", "-1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "NaN", "-1.0E-6"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:5>", "NaN", "-3.199999"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-1.7976931348623155E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.0E-6", "Infinity"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "5.0E-7"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "-1.0", "-Infinity", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.0", "0.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=5.0E-7, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:6>", "1.7976931348623157E308", "NaN", "10.000000000000002"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "4.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "5.0E-7", "1.0E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "5.0E-7", "1.0E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"8.988465674311578E307", "-536870929"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-536870929, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=8.98846567431157...#206#-368497789", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "NaN", "1.0E-6", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "NaN", "1.0E-6", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "0.0", "5.0E-7", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=5.0E-7, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0E-6", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-52"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0E-6", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=-52, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0E-6", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0E-6", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0E-6", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=1.0E-6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"5.0E-7", "-1.7976931348623157E308", "1.0E-6"}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "5.0E-7", "1.0", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=5.0E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-8.988465674311579E306", "-2.0560002000000006"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:4>", "0.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "5.0E-7"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "-1.0", "1.7976931348623157E308"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-Infinity"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.0000000000000002E-6"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0000000000000002E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-0.4099999999999999", "Infinity", "5.0E-7"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "9.999999999999997E-7", "-0.9999999999999999", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "5.0E-7"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=5.0E-7, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "-63.0", "1.0E-6"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.7976931348623157E308", "Infinity", "-1073741824"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.79769313...#213#182886608", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.7976931348623158E307", "Infinity", "-1073741824"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.79769313...#213#211515728", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "1.0", "-28"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-102.80000999999999", "4.999999999999999E-7", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-28, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "1.0", "-56"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-102.80000999999999", "4.999999999999999E-7", "1.7976931348623157E308"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-56, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 15, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0E-6", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "5.0E-7", "-1.7976931348623157E308", "-1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"5.0E-7", "NaN"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "-1.0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-5.0E-7", "1.0"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.316260337829587E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.316260337829587E-8}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-5.0E-7", "10.0"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0197676122188567E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-2.0197676122188567E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"NaN", "-205.60001999999997", "-27"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-205.60001999999997, getFunctionValueAccuracy=1.0E-15, getIterationCount=-27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=2.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:6>", "Infinity", "NaN", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:9>", "Infinity", "NaN", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "-1.0", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "1.0", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "-0.9999999999999999", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.73", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.73}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0", "-0.9999999999999999", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.7300000000000001", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.7300000000000001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"NaN", "1.0E-6", "<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "1.7976931348623158E307"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623158E307, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "Infinity", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "1.7976931348623157E308", "-Infinity", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "65535"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=65535, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "-2147483609"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483609, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "2147483609"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483609, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"Infinity", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623157E308", "-1.0", "0.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "1.0E-6", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "1.7976931348623157E308", "5.0E-7", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"1.0", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "1.7976931348623157E308", "0.0", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "-1.7976931348623157E308", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "Infinity", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "Infinity", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "Infinity", "-1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.0", "1.0E-6", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "5.0E-7", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:6>", "1.0E-6", "NaN", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1.0", "12.0000001", "47.5"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.0E-6"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=NaN, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=NaN, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<null>", "NaN", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"26"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<null>", "NaN", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=26, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-1.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-20.0"}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-20.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623155E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623155E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.7976931348623155E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623155E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=Infinity, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:5>", "NaN", "1.0E-6"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.0", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-513"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-513", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-513, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"1.0E-6", "5.0E-7", "1.0E-6"}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"150.10999999999999", "NaN", "<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-4.9E-324", "-1.0", "<sample:7>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.0", "0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.7976931348623157E308, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-43"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-43, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-88"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0E-6", "NaN", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-88, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.7976931348623157E308", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-102.80000999999999", "NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.7976931348623157E308", "1.0", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483648, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-102.80000999999999", "NaN", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=NaN, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.80000999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double"}, new String[]{"-8.988465674311579E306", "-2.0560002000000006"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:4>", "0.0", "1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.7976931348623157E308", "5.0E-7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=Infinity, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.0", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.0", "0.0", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.0", "-0.0", "1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.0", "-0.0", "0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.0", "-0.0", "0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "1.0E-6"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"-0.0", "-0.0", "0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0, getFunctionValue=-0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "Infinity", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "0.0", "1.0", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.76837158203125E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "Infinity", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "0.0", "1.0", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995231628418}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "Infinity", "<sample:6>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "0.0", "0.5", "-102.80000999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.4999995231628418}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "1.0", "NaN", "<sample:4>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "Infinity"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:10>", "1.0E-6", "0.5", "-0.08400000000000003"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.4999995231637955", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=18, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.4999995231637955}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:10>", "1.0E-6", "1.07", "-0.16800000000000007"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.069999744892359", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.069999744892359}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:1>", "1.0E-6", "4.37", "-0.16800000000000007"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.369999739527762", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.369999739527762}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:1>", "9.999999999999999E-6", "4.37", "-0.16800000000000007"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.369999739528298", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.369999739528298}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:1>", "-6.199990000000001", "4.37", "-0.16800000000000007"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.36999968498975", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=23, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.36999968498975}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:1>", "-6.199990000000001", "22.37", "-0.16800000000000007"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("22.369999574273976", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=22.369999574273976}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1073741823, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"1.0", "1.7976931348623157E308", "<null>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "5.0E-7"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "0.0", "-1.7976931348623157E308", "-102.80000999999999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"NaN", "-205.60001999999994", "-27"}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-205.60001999999994, getFunctionValueAccuracy=1.0E-15, getIterationCount=-27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"NaN", "-184.60001999999994", "-27"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.7976931348623157E308", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-184.60001999999994, getFunctionValueAccuracy=1.0E-15, getIterationCount=-27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=NaN}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"5.0E-7"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=5.0E-7, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"-5.0E-7"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-5.0E-7, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.0", "0.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.7976931348623157E308", "10"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.0", "0.0", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.7976931348623157E308", "10"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "23.000001", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E308}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.0", "4.9E-324", "<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-Infinity", "10"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", "double,double", "79.000001", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.0", "4.9E-324", "<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-Infinity", "-6"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-6, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.0", "4.9E-324", "<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-Infinity", "-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-6, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "1.7976931348623155E307", "32.07"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623155E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=56, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623155E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "3.595386269724631E307", "16.035"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.595386269724631E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=55, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.595386269724631E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "1.7976931348623156E306", "16.035"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623156E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=59, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.7976931348623156E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "3.595386269724631E307", "16.098000000000003"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "NaN", "5.0E-7", "10"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.595386269724631E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=5.0E-7, getFunctionValueAccuracy=1.0E-15, getIterationCount=55, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.595386269724631E307...#201#-353373866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-1.7976931348623155E308", "3.595386269724631E307", "16.098000000000003"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "NaN", "5.0E-7", "10"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.595386269724631E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=5.0E-7, getFunctionValueAccuracy=1.0E-15, getIterationCount=55, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.595386269724631E307...#201#-353373866", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:0>", "0.0", "21.0", "-100.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.999999687075615", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=20.999999687075615}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "0.0", "20.999999999999996", "-1000.0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("20.99999968707561", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=20.99999968707561}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "-57.0", "19.999999999999996", "NaN"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("19.999999713152643", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=19.999999713152643}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:1>", "-57.0", "39.99999999999999", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("39.999999638646834", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=39.999999638646834}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:2>", "-57.0", "39.99999999999999", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-56.99999963864684", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-56.99999963864684}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "-57.0", "87.0", "NaN"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("86.9999997317791", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=86.9999997317791}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.7976931348623157E308", "8.988465674311578E307", "-1073741824"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "1.0", "-1.0", "1.0E-6"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=8.988465674311578E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResu...#226#506899663", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "8.988465674311578E307", "-1073741824"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "1.0", "-1.0", "1.0E-6"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=8.988465674311578E307, getFunctionValueAccuracy=1.0E-15, getIterationCount=-1073741824, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResu...#212#-259586185", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:9>", "NaN", "20.0000005"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-8.988465674311578E307", "8.800001"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=53, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-8.988465674311578E307", "8.800001"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<null>", "-102.80000999999999", "1.7976931348623157E308", "0.5"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.988465674311578E307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=53, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-8.988465674311578E307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:8>", "1.0E-6", "1.6100001999999998"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "-1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-102.80000999999999", "1.7976931348623158E307", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6099998161462783", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.6099998161462783}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "0.0", "1.6100001999999998"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "-1.7976931348623157E308", "-1.7976931348623157E308", "0.5"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:5>", "-102.80000999999999", "1.7976931348623158E307", "1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.838539600372314E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.838539600372314E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-0.0", "1.5100001999999997"}, false, 12, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.600121021270751E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.600121021270751E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:0>", "-0.0", "1.5100001999999997"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5099998399878976", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=20, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.5099998399878976}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:0>", "-0.0", "3.0200003999999994"}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.020000039987897", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.020000039987897}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:9>", "-3.0", "3.0200003999999994"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "NaN", "1.7976931348623157E308", "1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0200000411800136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=22, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.0200000411800136}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:9>", "-0.3", "3.0200003999999994"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "NaN", "1.7976931348623157E308", "1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0200000042251105", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=21, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.0200000042251105}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:9>", "-0.3", "30.200003999999993"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "NaN", "1.7976931348623157E308", "1.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("30.200003545514516", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=24, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=30.200003545514516}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"1.0", "1.0", "2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=1.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "-205.60001999999997", "2147483647"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "-51.40000499999999", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-205.60001999999997, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#209#-1358434504", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"Infinity", "-205.60001999999997", "-2147483647"}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:5>", "-51.40000499999999", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-205.60001999999997, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult...#210#792110745", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyInterval", new String[]{"double", "double"}, new String[]{"-102.80000999999999", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-1, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "Infinity", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "Infinity", "1.0", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=0, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "40"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "0.0", "-1.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=40, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "80"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "0.0", "-1.0", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=80, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=10, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "10"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<null>", "-102.80000999999999", "Infinity", "1.0"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.0", "-2147483648"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "-1.7976931348623157E308"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:6>", "-1.0", "1.0E-6", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.231623649597168E-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=5.231623649597168...#204#1839877101", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.0E-6", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-102.80000999999999", "Infinity", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.0", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.7976931348623157E308, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRes...#224#-718200398", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "NaN", "1.0", "<null>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:9>", "-102.80000999999999", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-8.988465674311579E307"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:8>", "-102.80000999999999", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-8.988465674311579E307, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:8>", "-102.80000999999999", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623157E308, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getMaximalIterationCount", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-1.7976931348623158E307"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:8>", "-102.80000999999999", "1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.7976931348623158E307, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"1.0000000000000002E-6"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0000000000000002E-6, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=NaN, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-15", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "5.0E-8", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-1.7976931348623157E308", "Infinity", "1"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "0.0", "0.610000005", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623157E...#204#-557042886", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getAbsoluteAccuracy", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-0.0", "0.610000005", "<sample:3>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "0.0", "5.0E-7", "Infinity"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-1.7976931348623157E308", "Infinity", "NaN"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifyBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "Infinity", "-1.7976931348623157E308", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "5.0E-7", "1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995231630803}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-102.80000999999999", "-102.80000999999999", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-102.80000999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.800...#212#942415001", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-102.80000999999999", "102.80000999999999", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=102.80000999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=10, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.8000...#211#1610550932", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<null>", "-1.7976931348623157E308", "0.0"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "-1.7976931348623157E308", "5.0E-7", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-102.80000999999999", "57.0000005"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-102.80000970234927", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.80000970234927}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-102.80000999999999", "57.1000005"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-102.80000970216301", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.80000970216301}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-102.80000999999999", "28.55000025"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-102.80000951068307", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.80000951068307}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-82.80000999999999", "57.1000005"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-82.80000973941591", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-82.80000973941591}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:2>", "-82.22000999999999", "57.1000005"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValueAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-82.22000974049624", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-82.22000974049624}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:5>", "-82.22000999999999", "57.1000005"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("57.10000024049626", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=57.10000024049626}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:0>", "-164.44001999999998", "57.1000005"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "1.0", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "5.000000000000001E-7", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("57.10000008734956", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=27, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=57.10000008734956}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-164.44001999999998", "571.000005"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "1.0", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "5.000000000000001E-7", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-164.44001965753404", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=29, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-164.44001965753404}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:7>", "-82.22000999999999", "571.000005"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "1.0", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-82.22000969582072", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=29, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-82.22000969582072}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double"}, new String[]{"<sample:10>", "-82.22000999999999", "571.000005"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", "double,double,org.apache.commons.math.analysis.UnivariateRealFunction", "-1.0", "1.0", "<sample:5>"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("571.0000046958207", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=29, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=571.0000046958207}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "-5.0E-7", "0.0", "8.988465674311578E307"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "Infinity"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.25E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "-1.7976931348623157E308", "<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double,double", "<sample:3>", "0.0", "5.0E-7", "1.0E-6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=3.75E-7}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.0", "1.7976931348623157E308", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.52", "4.494232837155789E307", "<null>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"0.52", "4.494232837155789E307", "<sample:3>"}, false, 8, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-1.0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=-1.0, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-148.80001", "2147483621"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-102.80000999999999", "1.7976931348623157E308", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483621, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-148.80001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-148.80001", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-102.80000999999999", "1.7976931348623157E308", "1.7976931348623157E308"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", "double,double,double", "-1.7976931348623157E308", "-102.80000999999999", "1.0E-6"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-148.80001}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-148.80001000000001", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-102.80000999999999", "1.7976931348623157E308", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-148.8000100000...#205#1174876328", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "int"}, new String[]{"-74.400005", "-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetRelativeAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double,double", "-102.80000999999999", "1.7976931348623157E308", "1.7976931348623157E308"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-74.400005}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.1", "2.2", "-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=2.2, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.1", "1.7976931348623157E308", "-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRes...#208#-1211758141", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", new String[]{"double", "double", "int"}, new String[]{"0.1", "1.7976931348623157E308", "-2147483604"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=1.7976931348623157E308, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483604, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getRes...#208#-1406182845", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:4>", "1.0E-6", "1.0", "-102.80000999999999"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "NaN", "5.0E-7", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995231633186", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=5.0E-7, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995231633186}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "1.0E-6", "1.0", "-10.280000999999999"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999995231633186", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=19, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.9999995231633186}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "-39.999999", "1.0", "-10.280000999999999"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999694526203", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.999999694526203}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "-39.999999", "4.300000000000001", "-20.560001999999997"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.299999669939288", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=4.299999669939288}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"org.apache.commons.math.analysis.UnivariateRealFunction", "double", "double", "double"}, new String[]{"<sample:3>", "-39.999999", "2.1500000000000004", "-20.560001999999997"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1499996859580355", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=25, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=2.1499996859580355}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.7499999999999999"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.7499999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"-0.11699999999999999"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=-0.11699999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"0.7499999999999999"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.7499999999999999, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 8, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0000000000000002, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "1.7976931348623157E308", "-102.80000999999999", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-102.80000999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#223#1526613621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "1.7976931348623157E308", "-102.80000999999999", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "verifySequence", "double,double,double", "-102.80000999999999", "1.0", "NaN"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=-102.80000999999999, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=...#223#1526613621", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-15.2", "5.0E-6", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "NaN"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "-0.15999950000000002"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=5.0E-6, getFunctionValueAccuracy=Infinity, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-15.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-15.2", "5.0E-6", "-2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "NaN"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=5.0E-6, getFunctionValueAccuracy=Infinity, getIterationCount=-2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-15.2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"0.49", "NaN", "-21.999996"}, false, 13, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "clearResult", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=0.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-102.80000999999997", "NaN", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "0.0", "1"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=0.0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"102.80000999999997", "-1.0", "-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetAbsoluteAccuracy", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "resetMaximalIterationCount", ""}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=Infinity, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-99.900005", "1.2000005", "-1.1"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.7976931348623157E308", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-1.7976931348623...#208#-424340081", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-1.7976931348623157E308", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-Infinity", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-Infinity", "2147483647"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getResult", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=2147483647, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.0E-6", "-102.80000999999999"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:6>", "-1.0", "5.0E-7"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-Infinity", "1073741823"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741823, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "double,double", "1.0E-6", "-102.80000999999999"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "-Infinity", "1069547519"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1069547519, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "checkResultComputed", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "1073741823"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=1073741823, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:0>", "-102.80000999999999", "16.011"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=26, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=16.0109995573945}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=NaN, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=-1.7976931348623157E308, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isSequence", new String[]{"double", "double", "double"}, new String[]{"-1594.200005", "-2.5999995", "-5.0E-7"}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "1.9999999999999998", "<sample:9>"}, false, 11, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-102.80000999999999", "Infinity", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.80000999999999}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "isBracketing", new String[]{"double", "double", "org.apache.commons.math.analysis.UnivariateRealFunction"}, new String[]{"Infinity", "1.9999999999999998", "<sample:8>"}, false, 10, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", "org.apache.commons.math.analysis.UnivariateRealFunction,double,double", "<sample:4>", "NaN", "0.0"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,double,int", "-102.80000999999999", "Infinity", "60"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=Infinity, getFunctionValueAccuracy=1.0E-15, getIterationCount=60, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-102.80000999999999...#201#-1486107667", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "getRelativeAccuracy", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setResult", "double,int", "Infinity", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0E-14", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-15, getIterationCount=-2147483648, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=Infinity}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setAbsoluteAccuracy", "double", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=0.0, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=-2147483647, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483642"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483642, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "setMaximalIterationCount", new String[]{"int"}, new String[]{"2147483587"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=2147483587, getRelativeAccuracy=1.0E-14, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "solve", new String[]{"double", "double", "double"}, new String[]{"-8.98846567431158E306", "-1.0", "1.7976931348623157E308"}, false, 1, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setFunctionValueAccuracy", "double", "1.0E-6"}, {"org.apache.commons.math.analysis.solvers.BisectionSolver", "getFunctionValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-8.98846567431158E306", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=0.0, getFunctionValueAccuracy=1.0E-6, getIterationCount=53, getMaximalIterationCount=100, getRelativeAccuracy=1.0E-14, getResult=-8.98846567431158E306}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.analysis.solvers.BisectionSolver", "org.apache.commons.math.analysis.solvers.BisectionSolver", "resetFunctionValueAccuracy", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.analysis.solvers.BisectionSolver", "setRelativeAccuracy", "double", "1.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getAbsoluteAccuracy=1.0E-6, getFunctionValue=!, getFunctionValueAccuracy=1.0E-15, getIterationCount=0, getMaximalIterationCount=100, getRelativeAccuracy=1.0, getResult=!}", SearchInputFactory_scaffolding.receiverState());
 }
}
